package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = 751;
    public static final java.lang.String NAME = "onSplashAdShow";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f74918i = "launch";

    public void x(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        if (c0Var == null || c0Var.t3() == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f74918i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "launch";
        }
        hashMap.put(ya.b.SOURCE, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEventOnSplashAdShow[AppBrandSplashAd]", "dispatch, source:%s", this.f74918i);
        c0Var.t3().D2.d(new com.tencent.mm.plugin.appbrand.ad.jsapi.l(this, hashMap, c0Var));
    }
}
