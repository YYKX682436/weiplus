package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes.dex */
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1095;
    public static final java.lang.String NAME = "ecdsaSign";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEcdSaSign", "invoke, env is null");
            return;
        }
        if (lVar.getContext() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEcdSaSign", "invoke, context is null");
            java.lang.String str2 = android.text.TextUtils.isEmpty("fail:internal error invalid android context") ? "fail:internal error" : "fail:internal error invalid android context";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (jSONObject == null || com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("signText"))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEcdSaSign", "invoke, data is null");
            str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject.put("appId", lVar.getAppId());
            java.lang.String jSONObject4 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            uk0.a.b(new com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest(jSONObject4), com.tencent.mm.plugin.appbrand.jsapi.channels.h.f80235d, new com.tencent.mm.plugin.appbrand.jsapi.channels.i(lVar, i17, this));
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiEcdSaSign", e19, "add appId to Json failed!", new java.lang.Object[0]);
            str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, u(str, jSONObject5));
        }
    }
}
