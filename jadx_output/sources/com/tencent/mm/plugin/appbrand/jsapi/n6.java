package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class n6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1159;
    public static final java.lang.String NAME = "getWeAppNewTipsInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || e9Var.getF147807d() == null || jSONObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWeAppNewTipsInfo", "data:%s", jSONObject.toString());
        java.lang.String optString = jSONObject.optString("pathKey");
        if (optString == null) {
            optString = "";
        }
        if (r26.i0.y(optString, "weapp_internal_", false)) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(optString), com.tencent.mm.plugin.appbrand.jsapi.k6.class, new com.tencent.mm.plugin.appbrand.jsapi.m6(e9Var, i17, this));
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }
}
