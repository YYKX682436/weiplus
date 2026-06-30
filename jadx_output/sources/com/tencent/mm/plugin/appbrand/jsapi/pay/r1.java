package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class r1 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.s1 f82661c;

    public r1(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.pay.s1 s1Var) {
        this.f82659a = d0Var;
        this.f82660b = i17;
        this.f82661c = s1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult requestMedicalInsurancePayResult = (com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.pay.s1 s1Var = this.f82661c;
        int i17 = this.f82660b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82659a;
        if (requestMedicalInsurancePayResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "onReceiveResult get NULL result");
            s1Var.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, s1Var.u(str, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "onReceiveResult result:" + requestMedicalInsurancePayResult.f82556d + " data:" + requestMedicalInsurancePayResult.f82557e);
        if (kotlin.jvm.internal.o.b(requestMedicalInsurancePayResult.f82556d, ya.b.SUCCESS)) {
            org.json.JSONObject jSONObject2 = requestMedicalInsurancePayResult.f82557e;
            s1Var.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str = str4 != null ? str4 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (jSONObject2 == null) {
                jSONObject2 = new org.json.JSONObject();
            }
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            d0Var.a(i17, s1Var.u(str, jSONObject2));
            return;
        }
        org.json.JSONObject jSONObject3 = requestMedicalInsurancePayResult.f82557e;
        if (jSONObject3 != null) {
            java.lang.String str6 = requestMedicalInsurancePayResult.f82556d;
            s1Var.getClass();
            str2 = android.text.TextUtils.isEmpty(str6) ? "fail:internal error" : str6;
            str = str2 != null ? str2 : "";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            d0Var.a(i17, s1Var.u(str, jSONObject3));
            return;
        }
        java.lang.String str8 = requestMedicalInsurancePayResult.f82556d;
        s1Var.getClass();
        str2 = android.text.TextUtils.isEmpty(str8) ? "fail:internal error" : str8;
        str = str2 != null ? str2 : "";
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 4);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        d0Var.a(i17, s1Var.u(str, jSONObject4));
    }
}
