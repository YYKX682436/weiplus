package com.tencent.mm.feature.wxpay;

/* loaded from: classes13.dex */
public class l implements com.tencent.midas.api.IAPMidasPayCallBack {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh0.o f67853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67854b;

    public l(com.tencent.mm.feature.wxpay.m mVar, mh0.o oVar, java.lang.String str) {
        this.f67853a = oVar;
        this.f67854b = str;
    }

    @Override // com.tencent.midas.api.IAPMidasPayCallBack
    public void MidasPayCallBack(com.tencent.midas.api.APMidasResponse aPMidasResponse) {
        mh0.o oVar = this.f67853a;
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPayMidasFeatureService", "midasDirectPay callBack is null");
        } else if (aPMidasResponse == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPayMidasFeatureService", "midasDirectPay MidasPayCallBack apMidasResponse is null");
            oVar.a(-2, "apMidasResponse is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPayMidasFeatureService", "midasDirectPay callBack resultCode:%s resultMsg:%s req payinfo:%s ", java.lang.Integer.valueOf(aPMidasResponse.resultCode), aPMidasResponse.resultMsg, this.f67854b);
            oVar.a(aPMidasResponse.resultCode, aPMidasResponse.resultMsg);
        }
    }

    @Override // com.tencent.midas.api.IAPMidasPayCallBack
    public void MidasPayNeedLogin() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayMidasFeatureService", "Midas pay need login");
    }
}
