package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class x2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult f82697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask f82698b;

    public x2(com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult requestMedicalInsurancePayResult, com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask requestMedicalInsurancePayTask) {
        this.f82697a = requestMedicalInsurancePayResult;
        this.f82698b = requestMedicalInsurancePayTask;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.RequestMedicalInsurancePayTask", "start liteApp fail");
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult requestMedicalInsurancePayResult = this.f82697a;
        requestMedicalInsurancePayResult.getClass();
        requestMedicalInsurancePayResult.f82556d = "fail";
        this.f82698b.finishProcess(requestMedicalInsurancePayResult);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RequestMedicalInsurancePayTask", "start liteApp success");
    }
}
