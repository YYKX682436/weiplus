package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class b1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 714;
    public static final java.lang.String NAME = "requestBizSplitBillPayment";

    /* renamed from: g, reason: collision with root package name */
    public final int f82583g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "invoke JsApiRequestBizSplitBillPayment!");
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:component is null");
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:context is null");
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String optString = jSONObject.optString("orderNo");
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = optString == null ? "" : optString;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "pfOrderNo:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:context is null");
            c0Var.a(i17, o("fail"));
            return;
        }
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.pay.a1(this, c0Var, i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pfOrderNo", optString);
        intent.putExtra("appid", c0Var.getAppId());
        j45.l.v(Z0, ".plugin.aa.ui.LaunchAABeforeUI", intent, this.f82583g);
    }
}
