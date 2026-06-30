package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 701;
    public static final java.lang.String NAME = "openSelectPayment";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String appId = c0Var.getAppId();
            java.lang.String optString = jSONObject.optString("sessionid");
            java.lang.String optString2 = jSONObject.optString("url");
            if (optString != null && appId != null && !optString.isEmpty() && !appId.isEmpty()) {
                hashMap.put("appId", appId);
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString);
                hashMap.put("JSAPIFunc", k());
                if (optString2 != null) {
                    hashMap.put("webViewUrl", optString2);
                }
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE.startPayComponent(Z0, c0Var.t3().l2(), "selectPayment", hashMap, new com.tencent.mm.plugin.appbrand.jsapi.pay.f0(this, c0Var, i17));
                return;
            }
            c0Var.a(i17, p("fail", new com.tencent.mm.plugin.appbrand.jsapi.pay.d0(this)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSelectPayment", e17.getMessage());
            c0Var.a(i17, p("fail", new com.tencent.mm.plugin.appbrand.jsapi.pay.e0(this)));
        }
    }
}
