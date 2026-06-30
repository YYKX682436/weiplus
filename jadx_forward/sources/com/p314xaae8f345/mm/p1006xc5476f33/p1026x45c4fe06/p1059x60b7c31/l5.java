package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class l5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34382x366c91de = 906;

    /* renamed from: NAME */
    public static final java.lang.String f34383x24728b = "editTextWithPopForm";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (d0Var == null) {
            return;
        }
        if (jSONObject == null) {
            d0Var.a(i17, "fail:invalid data");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiEditTextWithPopForm", "invoke data:" + jSONObject);
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k5(this, r07, optString, d0Var, i17));
        }
    }
}
