package com.tencent.mm.feature.wxpay;

@j95.b
/* loaded from: classes13.dex */
public class m extends i95.w implements mh0.p {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f67855d;

    public void wi(android.app.Activity activity, java.lang.String str, mh0.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayMidasFeatureService", "midasDirectPay");
        if (activity == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPayMidasFeatureService", "midasDirectPay activity or payInfo invalid");
            if (oVar != null) {
                oVar.a(-1, "activity or payInfo invalid");
                return;
            }
            return;
        }
        com.tencent.midas.api.request.APMidasDirectRequest aPMidasDirectRequest = new com.tencent.midas.api.request.APMidasDirectRequest();
        aPMidasDirectRequest.payInfo = str;
        if (f67855d == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_midas_pay_preinit_disable, 0) == 1);
            f67855d = valueOf;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPayMidasFeatureService", "disablePreInit:%b", valueOf);
        }
        if (!f67855d.booleanValue()) {
            com.tencent.midas.api.APMidasPayAPI.init(activity, aPMidasDirectRequest);
        }
        com.tencent.midas.api.APMidasPayAPI.directWxPay(activity, aPMidasDirectRequest, new com.tencent.mm.feature.wxpay.l(this, oVar, str));
    }
}
