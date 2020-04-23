package net.yeele.springhellow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping
    public String getHello() {
        return "hello";
    }
    @RequestMapping(path="/get", method = RequestMethod.GET, produces = {"application/json"})
    public @ResponseBody
    String hello() {
        return "Hello!";
    }
}
