package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class s extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = 1166;
    public static final java.lang.String NAME = "resizeSplashAd";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f74924i = "launch";

    public void x(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, int[] iArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f74924i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "launch";
        }
        hashMap.put(ya.b.SOURCE, str);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int e17 = ik1.w.e(i17);
        int e18 = ik1.w.e(i18);
        int e19 = ik1.w.e(ym5.x.a(e9Var.getF147807d(), 8.0f) + be1.f0.E(e9Var));
        hashMap.put("screenWidth", java.lang.Integer.valueOf(e17));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(e18));
        hashMap.put("rightButtonTop", java.lang.Integer.valueOf(e19));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiResizeSplashAd", "dispatch, screenWidth:%s, screenHeight:%s,  rightButtonTop:%s", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(e18), java.lang.Integer.valueOf(e19));
        t(hashMap);
        u(e9Var);
        n(c0Var);
    }
}
