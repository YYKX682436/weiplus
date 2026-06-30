package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1438;
    private static final java.lang.String NAME = "openGameDetail";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            java.lang.String str2 = android.text.TextUtils.isEmpty("invalid_data") ? "fail:jsapi invalid request data" : "invalid_data";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("promotionId");
        java.lang.String appId = e9Var.getAppId();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 != null) {
            str = V0.Y1();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameDetail", "getCurrentPageView is null");
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s, url:%s", optString, optString2, str);
        com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailRequest openGameDetailRequest = new com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailRequest();
        openGameDetailRequest.f81244d = appId;
        openGameDetailRequest.f81245e = str;
        openGameDetailRequest.f81246f = optString;
        openGameDetailRequest.f81247g = optString2;
        com.tencent.mm.plugin.appbrand.jsapi.game.a aVar = new com.tencent.mm.plugin.appbrand.jsapi.game.a(this, e9Var, i17);
        android.content.Context context = e9Var.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openGameDetailRequest, aVar, null);
    }
}
