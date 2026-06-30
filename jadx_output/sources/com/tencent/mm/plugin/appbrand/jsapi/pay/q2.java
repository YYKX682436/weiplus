package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class q2 extends com.tencent.mm.plugin.appbrand.jsapi.f implements com.tencent.mm.plugin.appbrand.jsapi.g {
    public static final int CTRL_INDEX = 85;
    public static final java.lang.String NAME = "verifyPaymentPassword";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.g
    public void h(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) ffVar.f81013b;
        org.json.JSONObject jSONObject = ffVar.f81015d;
        org.json.JSONObject jSONObject2 = ffVar.f81014c;
        int i17 = ffVar.f81016e;
        if (jSONObject2 == null) {
            c0Var.a(i17, o("fail"));
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        try {
            if (com.tencent.mm.plugin.appbrand.jsapi.pay.f.d(c0Var, jSONObject2, jSONObject, NAME, false)) {
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE.verifyPassword(Z0, c0Var.t3().l2(), jSONObject2, new com.tencent.mm.plugin.appbrand.jsapi.pay.p2(this, c0Var, i17));
            } else {
                c0Var.a(i17, o("fail illegal appId"));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiVerifyPaymentPassword", e17.getMessage());
            c0Var.a(i17, o("fail"));
        }
    }
}
