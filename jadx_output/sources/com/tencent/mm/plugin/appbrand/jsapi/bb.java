package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class bb extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 829;
    public static final java.lang.String NAME = "phoneBindCardVerifySms";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var.t3().r0() == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPhoneBindCardVerifySms", "mmActivity is null, invoke fail!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPhoneBindCardVerifySms", "get data: %s", jSONObject.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, d0Var.getAppId());
        bundle.putString("nonce_str", jSONObject.optString("noncestr"));
        bundle.putString("timeStamp", jSONObject.optString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("signType", jSONObject.optString("signtype"));
        bundle.putString("paySign", jSONObject.optString("paysign"));
        bundle.putString("sessionid", jSONObject.optString("sessionid"));
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.class, new com.tencent.mm.plugin.appbrand.jsapi.ab(this, d0Var, i17));
    }
}
