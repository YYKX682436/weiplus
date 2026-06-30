package qc1;

/* loaded from: classes7.dex */
public final class i extends qc1.v {

    /* renamed from: CTRL_INDEX */
    public static final int f76435x366c91de = 110;

    /* renamed from: NAME */
    public static final java.lang.String f76436x24728b = "insertTextArea";

    @Override // qc1.v, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar, jSONObject, i17);
    }

    @Override // qc1.v
    public void H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var) {
        q0Var.f173136e = new qc1.f(this, q0Var);
    }

    @Override // qc1.v
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 I(java.lang.ref.WeakReference weakReference, java.lang.String str, int i17) {
        return new qc1.g(this, weakReference, i17, str);
    }

    @Override // qc1.v
    /* renamed from: K */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        super.A(v5Var, jSONObject, i17);
    }

    @Override // qc1.v
    public boolean M(pl1.f fVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        if (!super.M(fVar, jSONObject, v5Var, i17)) {
            return false;
        }
        fVar.f438140u = java.lang.Boolean.TRUE;
        fVar.R = "textarea";
        fVar.S = false;
        fVar.T = false;
        fVar.f438141v = java.lang.Boolean.valueOf(jSONObject.optBoolean("confirm", true));
        fVar.G = java.lang.Boolean.valueOf(jSONObject.optBoolean("showCoverView", false));
        fVar.C = jSONObject.optString("adjustKeyboardTo", "cursor");
        return true;
    }
}
