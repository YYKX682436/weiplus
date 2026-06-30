package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = 760;
    public static final java.lang.String NAME = "onSplashAdButtonClicked";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f74905i = "launch";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f74906m = "close";

    public void x(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        if (c0Var == null || c0Var.t3() == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f74905i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "launch";
        }
        hashMap.put(ya.b.SOURCE, str);
        java.lang.String str2 = this.f74906m;
        if (str2 == null) {
            str2 = "close";
        }
        hashMap.put("buttonType", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEventOnSplashAdButtonClicked[AppBrandSplashAd]", "dispatch, source:%s, buttonType:%s", this.f74905i, this.f74906m);
        c0Var.t3().D2.d(new com.tencent.mm.plugin.appbrand.ad.jsapi.f(this, hashMap, c0Var));
    }
}
