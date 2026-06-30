package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class a2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 149;
    public static final java.lang.String NAME = "requestPaymentToBank";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        try {
            jSONObject.put("appId", c0Var.getAppId());
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE.startPayToBank(Z0, c0Var.t3().l2(), jSONObject, new com.tencent.mm.plugin.appbrand.jsapi.pay.z1(this, c0Var, i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestPaymentToBank", e17.getMessage());
            c0Var.a(i17, o("fail"));
        }
    }
}
