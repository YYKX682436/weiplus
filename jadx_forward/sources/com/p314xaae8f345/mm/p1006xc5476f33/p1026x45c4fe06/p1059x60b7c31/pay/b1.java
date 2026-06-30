package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class b1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34602x366c91de = 714;

    /* renamed from: NAME */
    public static final java.lang.String f34603x24728b = "requestBizSplitBillPayment";

    /* renamed from: g, reason: collision with root package name */
    public final int f164116g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "invoke JsApiRequestBizSplitBillPayment!");
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:component is null");
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:context is null");
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String optString = jSONObject.optString("orderNo");
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = optString == null ? "" : optString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "pfOrderNo:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:context is null");
            c0Var.a(i17, o("fail"));
            return;
        }
        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a1(this, c0Var, i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pfOrderNo", optString);
        intent.putExtra("appid", c0Var.mo48798x74292566());
        j45.l.v(Z0, ".plugin.aa.ui.LaunchAABeforeUI", intent, this.f164116g);
    }
}
