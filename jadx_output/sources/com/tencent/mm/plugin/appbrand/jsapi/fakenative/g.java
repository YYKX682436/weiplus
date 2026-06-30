package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str = com.tencent.mm.plugin.appbrand.m6.b(d0Var.getRuntime().f74803n).f85716i;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateBackMiniProgramWC", "navigate back miniprogram, businessType:%s", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String optString = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateBackMiniProgramWC", "navigate back MiniProgram, businessType:%s", str);
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.f(d0Var.getRuntime(), str, 0, optString);
            com.tencent.mm.plugin.appbrand.m6.a(d0Var.getAppId()).f85719l = true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.d((com.tencent.mm.plugin.appbrand.o6) d0Var.getRuntime(), com.tencent.mm.plugin.appbrand.jsapi.fakenative.h0.BackByJsApi);
        super.A(d0Var, jSONObject, i17);
    }
}
