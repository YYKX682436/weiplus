package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class jc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1391;
    private static final java.lang.String NAME = "requestPayAuthen";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (((d0Var == null || (t37 = d0Var.t3()) == null) ? null : t37.r0()) == null) {
            if (d0Var != null) {
                java.lang.String str = android.text.TextUtils.isEmpty("fail") ? "fail:internal error invalid android context" : "fail";
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", -1);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                d0Var.a(i17, u(str, jSONObject2));
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestPayAuthen", "mmActivity is null, invoke fail!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayAuthen", "get data: %s", java.lang.String.valueOf(jSONObject));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsApiScene", "1");
        bundle.putString("notifyType", NAME);
        bundle.putString("appId", d0Var.getAppId());
        bundle.putString("nonceStr", jSONObject != null ? jSONObject.optString("nonceStr") : null);
        bundle.putString("timeStamp", jSONObject != null ? jSONObject.optString("timeStamp") : null);
        bundle.putString("package", jSONObject != null ? jSONObject.optString("package") : null);
        bundle.putString("paySign", jSONObject != null ? jSONObject.optString("paySign") : null);
        bundle.putString("signType", jSONObject != null ? jSONObject.optString("signType") : null);
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.class, new com.tencent.mm.plugin.appbrand.jsapi.ic(d0Var, i17, this));
    }
}
