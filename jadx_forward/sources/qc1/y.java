package qc1;

/* loaded from: classes7.dex */
public final class y extends qc1.x {

    /* renamed from: CTRL_INDEX */
    private static final int f76449x366c91de = 111;

    /* renamed from: NAME */
    private static final java.lang.String f76450x24728b = "updateTextArea";

    @Override // qc1.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar, jSONObject, i17);
    }

    @Override // qc1.a
    public boolean G(pl1.g gVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        pl1.i iVar = (pl1.i) gVar;
        boolean G = super.G(iVar, jSONObject, v5Var, i17);
        iVar.f438140u = java.lang.Boolean.TRUE;
        java.lang.Object opt = jSONObject.opt("confirm");
        iVar.f438141v = opt == null ? null : nf.f.b(opt);
        if (jSONObject.has("adjustKeyboardTo")) {
            iVar.C = jSONObject.optString("adjustKeyboardTo", "cursor");
        }
        return G;
    }

    @Override // qc1.x
    /* renamed from: H */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        super.A(v5Var, jSONObject, i17);
    }
}
