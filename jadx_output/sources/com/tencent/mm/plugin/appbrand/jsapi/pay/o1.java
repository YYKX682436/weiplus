package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class o1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 682;
    public static final java.lang.String NAME = "requestH5Transaction";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestH5Transaction", "invoke JsApiRequestH5Transaction!");
        if (d0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestH5Transaction", "fail:component is null");
            return;
        }
        android.content.Context f147807d = d0Var.getF147807d();
        if (f147807d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestH5Transaction", "fail:context is null");
            d0Var.a(i17, o("fail"));
            return;
        }
        java.lang.String optString = jSONObject.optString("closeWebAfterPayDetailBack");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestH5Transaction", "close window: %s", optString);
        if (com.tencent.mm.sdk.platformtools.t8.D0("1", optString)) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.pay.n1(this, d0Var), 1000L);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", d0Var.getAppId());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("url", jSONObject.optString("url"));
        ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startIbgOrder context %s from %s", f147807d, new com.tencent.mm.sdk.platformtools.z3());
        j45.l.k(f147807d, "wallet_core", ".ui.ibg.WalletIbgOrderInfoUI", intent, true);
        d0Var.a(i17, o("ok"));
    }
}
