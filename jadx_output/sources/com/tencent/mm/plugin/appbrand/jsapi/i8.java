package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class i8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1157;
    private static final java.lang.String NAME = "notifyWCPayResult";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null) {
            return;
        }
        if (d0Var.t3() == null) {
            d0Var.a(i17, o("fail:internal error"));
            return;
        }
        if (jSONObject == null) {
            d0Var.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.h8 h8Var = com.tencent.mm.plugin.appbrand.jsapi.h8.f81280d;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.getAppId());
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("bizEventKey", jSONObject.optString("bizEventKey"));
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.class, h8Var);
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
        d0Var.a(i17, u(str, jSONObject2));
    }
}
