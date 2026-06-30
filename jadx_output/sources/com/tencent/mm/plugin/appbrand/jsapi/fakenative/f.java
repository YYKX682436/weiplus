package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 593;
    public static final java.lang.String NAME = "navigateBackH5";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        java.lang.String str = com.tencent.mm.plugin.appbrand.m6.b(d0Var.getRuntime().f74803n).f85716i;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateBackH5", "navigate back H5, businessType:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateBackH5", "fail system error");
            d0Var.a(i17, p("fail system error", hashMap));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.e(str, jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA), 0);
        com.tencent.mm.plugin.appbrand.m6.a(d0Var.getAppId()).f85718k = true;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        d0Var.a(i17, p("ok", hashMap2));
        d0Var.getRuntime().l0();
    }
}
