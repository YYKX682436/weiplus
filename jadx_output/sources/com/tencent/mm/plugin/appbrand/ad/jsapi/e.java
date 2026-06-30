package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1253;
    public static final java.lang.String NAME = "enableSplashAdHotStart";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null || jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("isShow");
        long optLong = jSONObject.optLong("intervalThreshold");
        i81.z zVar = i81.a0.f289516c;
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        i81.e eVar = t37 == null ? null : zVar.a(t37).f289519a;
        if (eVar != null) {
            eVar.f289579w = optBoolean;
            eVar.f289580x = optLong;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            eVar.f289578v = java.lang.System.currentTimeMillis();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AppBrandSplashAd] enable ad hot start, isShow = ");
        sb6.append(optBoolean);
        sb6.append(", intervalThreshold = ");
        sb6.append(optLong);
        sb6.append(", hotStartBaselineTime = ");
        com.tencent.mm.plugin.appbrand.o6 t38 = c0Var.t3();
        i81.e eVar2 = t38 == null ? null : zVar.a(t38).f289519a;
        sb6.append(eVar2 != null ? java.lang.Long.valueOf(eVar2.f289578v) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnableSplashAdHotStart", sb6.toString());
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, u(str, jSONObject2));
    }
}
