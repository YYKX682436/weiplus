package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34620x366c91de = 820;

    /* renamed from: NAME */
    public static final java.lang.String f34621x24728b = "requestFacetoFacePayment";

    /* renamed from: g, reason: collision with root package name */
    public final int f164147g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null) {
            return;
        }
        if (c0Var.t3() == null) {
            c0Var.a(i17, o("fail:internal error"));
            return;
        }
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("confirm_token");
        if (android.text.TextUtils.isEmpty(optString)) {
            c0Var.a(i17, o("fail:confirm_token is empty"));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_app_id", c0Var.t3().f156336n);
        intent.putExtra("key_confirm_id", optString);
        nf.g.a(c0Var.getF229340d()).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.i1(this, new java.lang.ref.WeakReference(c0Var), i17));
        j45.l.n(c0Var.getF229340d(), "remittance", ".ui.F2FAppBrandRemittanceUI", intent, this.f164147g);
    }
}
