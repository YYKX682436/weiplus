package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class c3 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferResult f82591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferTask f82592b;

    public c3(com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferResult requestMerchantTransferResult, com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferTask requestMerchantTransferTask) {
        this.f82591a = requestMerchantTransferResult;
        this.f82592b = requestMerchantTransferTask;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.RequestMerchantTransferTask", "start liteApp fail");
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferResult requestMerchantTransferResult = this.f82591a;
        requestMerchantTransferResult.getClass();
        requestMerchantTransferResult.f82567d = "fail";
        this.f82592b.finishProcess(requestMerchantTransferResult);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RequestMerchantTransferTask", "start liteApp success");
    }
}
