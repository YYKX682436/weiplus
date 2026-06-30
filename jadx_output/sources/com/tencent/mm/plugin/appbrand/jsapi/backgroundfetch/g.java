package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

/* loaded from: classes.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 641;
    public static final java.lang.String NAME = "setBackgroundFetchToken";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "fail:data is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        java.lang.String optString = jSONObject.optString("token");
        if (optString.length() <= 1024) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel(lVar.getAppId(), optString), com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.f.class, new com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.d(this, lVar, i17));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "fail:token is too long");
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 101);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, u(str2, jSONObject3));
    }
}
