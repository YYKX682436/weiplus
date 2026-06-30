package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    static final int CTRL_INDEX = -2;
    static final java.lang.String NAME = "onKeyboardConfirm";

    public void x(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (e9Var.isRunning()) {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("errMsg", "ok");
            hashMap.put("value", str);
            t(hashMap);
            u(e9Var);
            m();
        }
    }
}
