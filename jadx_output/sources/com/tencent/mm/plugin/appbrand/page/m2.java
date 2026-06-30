package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m2 extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = 49;
    public static final java.lang.String NAME = "onAppEnterBackground";

    public void x(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap(1);
        int ordinal = com.tencent.mm.plugin.appbrand.x0.d(appBrandRuntime.f74803n).ordinal();
        if (ordinal == 0) {
            str = "close";
        } else if (ordinal != 1) {
            str = "hide";
            if (ordinal != 2) {
                if (ordinal == 3) {
                    str = "hang";
                } else if (ordinal != 4 && ordinal != 6 && ordinal == 7) {
                    str = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l.NAME;
                }
            }
        } else {
            str = "back";
        }
        hashMap.put("mode", str);
        com.tencent.mm.plugin.appbrand.jsapi.o0 t17 = t(hashMap);
        t17.u(appBrandRuntime.C0());
        t17.m();
    }
}
