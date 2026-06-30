package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class p1 extends com.tencent.mm.plugin.appbrand.jsapi.pay.y1 {
    public static final int CTRL_INDEX = 691;
    public static final java.lang.String NAME = "requestJointPayment";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.y1, com.tencent.mm.plugin.appbrand.jsapi.g
    public void h(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar) {
        org.json.JSONObject jSONObject = ffVar.f81014c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) ffVar.f81013b;
        int i17 = ffVar.f81016e;
        if (jSONObject == null) {
            d0Var.a(i17, o("fail:invalid data"));
            return;
        }
        try {
            jSONObject.put("key_joint_pay", true);
            D(ffVar, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestJointPayment", e17.getMessage());
            d0Var.a(i17, o("fail"));
        }
    }
}
