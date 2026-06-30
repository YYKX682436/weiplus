package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class y6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 868;
    public static final java.lang.String NAME = "requestQueryCashier";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var.t3().r0() == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiKindaRequestQueryCashier", "mmActivity is null, invoke fail!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiKindaRequestQueryCashier", "get data: %s", jSONObject.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsApiScene", "1");
        bundle.putString("notifyType", NAME);
        bundle.putString("appId", d0Var.getAppId());
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("paySign", jSONObject.optString("paySign"));
        bundle.putString("signType", jSONObject.optString("signType"));
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.class, new com.tencent.mm.plugin.appbrand.jsapi.x6(this, d0Var, i17));
    }
}
