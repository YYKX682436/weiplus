package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class q1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34646x366c91de = 431;

    /* renamed from: NAME */
    public static final java.lang.String f34647x24728b = "requestMallPayment";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            d0Var.a(i17, o("fail"));
            return;
        }
        try {
            jSONObject.put("appId", d0Var.mo48798x74292566());
            jSONObject.put("pay_for_wallet_type", 3);
            super.A(d0Var, jSONObject, i17);
            throw null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestMallPayment", e17.getMessage());
            d0Var.a(i17, o("fail"));
        }
    }
}
