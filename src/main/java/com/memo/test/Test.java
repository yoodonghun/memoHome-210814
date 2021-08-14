package com.memo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
   @RequestMapping("/test")
   @ResponseBody
   public String test01() {
	   return "hello world";
   }
}
