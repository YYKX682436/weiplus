package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = 753;
    public static final java.lang.String NAME = "onSplashAdClose";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f74910i = "launch";

    public void x(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        com.tencent.mm.plugin.appbrand.c cVar;
        if (c0Var == null || c0Var.t3() == null || (cVar = c0Var.t3().D2) == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f74910i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "launch";
        }
        hashMap.put(ya.b.SOURCE, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEventOnSplashAdClosed[AppBrandSplashAd]", "dispatch, source:%s", this.f74910i);
        cVar.d(new com.tencent.mm.plugin.appbrand.ad.jsapi.h(this, hashMap, c0Var));
    }
}
