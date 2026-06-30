package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class q1 extends com.tencent.mm.plugin.appbrand.jsapi.pay.y1 {
    public static final int CTRL_INDEX = 431;
    public static final java.lang.String NAME = "requestMallPayment";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.y1, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            d0Var.a(i17, o("fail"));
            return;
        }
        try {
            jSONObject.put("appId", d0Var.getAppId());
            jSONObject.put("pay_for_wallet_type", 3);
            super.A(d0Var, jSONObject, i17);
            throw null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestMallPayment", e17.getMessage());
            d0Var.a(i17, o("fail"));
        }
    }
}
