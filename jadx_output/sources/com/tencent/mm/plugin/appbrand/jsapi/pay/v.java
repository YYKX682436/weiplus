package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class v extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 693;
    public static final java.lang.String NAME = "getWCPayOverseaPrepayRequest";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "invoke JsApiGetWCPayOverseaPrepayRequest!");
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "fail:component is null");
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "fail:context is null");
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(jSONObject);
        walletJsapiData.A = 2;
        if (com.tencent.mm.plugin.appbrand.jsapi.pay.f.b(Z0, new com.tencent.mm.plugin.appbrand.jsapi.pay.u(this, walletJsapiData, new com.tencent.mm.plugin.appbrand.jsapi.pay.t(this, Z0, c0Var, i17)))) {
            return;
        }
        c0Var.a(i17, o("fail"));
    }
}
