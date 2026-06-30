package qc1;

/* loaded from: classes7.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76437x366c91de = 119;

    /* renamed from: NAME */
    private static final java.lang.String f76438x24728b = "removeTextArea";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        try {
            ik1.h0.b(new qc1.j(this, new java.lang.ref.WeakReference(v5Var), jSONObject.getInt("inputId"), i17));
        } catch (org.json.JSONException unused) {
            v5Var.a(i17, o("fail:invalid data"));
        }
    }
}
