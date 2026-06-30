package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class s1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1294;
    public static final java.lang.String NAME = "requestMedicalInsurancePay";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "JsApiRequestMedicalInsurancePay data:" + jSONObject);
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayRequest requestMedicalInsurancePayRequest = new com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayRequest();
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        requestMedicalInsurancePayRequest.d(jSONObject2);
        java.lang.String appId = d0Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        requestMedicalInsurancePayRequest.c(appId);
        com.tencent.mm.plugin.appbrand.jsapi.pay.r1 r1Var = new com.tencent.mm.plugin.appbrand.jsapi.pay.r1(d0Var, i17, this);
        android.content.Context context = d0Var.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, requestMedicalInsurancePayRequest, r1Var, null);
    }
}
