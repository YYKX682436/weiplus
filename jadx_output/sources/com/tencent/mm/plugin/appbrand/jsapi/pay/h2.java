package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class h2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 707;
    public static final java.lang.String NAME = "requestVerifyUserIdentity";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestVerifyUserIdentity", "invoke JsApiRequestVerifyUserIdentity!");
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestVerifyUserIdentity", "fail:component is null");
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestVerifyUserIdentity", "fail:context is null");
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String appId = c0Var.getAppId();
            java.lang.String optString = jSONObject.optString("sessionid");
            if (optString != null && appId != null && !optString.isEmpty() && !appId.isEmpty()) {
                hashMap.put("appId", appId);
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString);
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE.startPayComponent(Z0, c0Var.t3().l2(), "verifyUserIdentity", hashMap, new com.tencent.mm.plugin.appbrand.jsapi.pay.g2(this, c0Var, i17));
            }
            c0Var.a(i17, p("fail", new com.tencent.mm.plugin.appbrand.jsapi.pay.e2(this)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestVerifyUserIdentity", e17.getMessage());
            c0Var.a(i17, p("fail", new com.tencent.mm.plugin.appbrand.jsapi.pay.f2(this)));
        }
    }
}
