package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class w extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 757;
    public static final java.lang.String NAME = "splashAdFirstStepViewLayoutStateChange";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        int optInt = jSONObject.optInt("state", -1);
        if (optInt != 0 && optInt != 1) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (optInt == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, startTime:%s", java.lang.Long.valueOf(currentTimeMillis));
            i81.a0.a(c0Var.t3()).f289568l = currentTimeMillis;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, endTime:%s", java.lang.Long.valueOf(currentTimeMillis));
            i81.a0.a(c0Var.t3()).f289569m = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, costTime:%s", java.lang.Long.valueOf(i81.a0.a(c0Var.t3()).f289569m - i81.a0.a(c0Var.t3()).f289568l));
        }
        c0Var.a(i17, o("ok"));
    }
}
