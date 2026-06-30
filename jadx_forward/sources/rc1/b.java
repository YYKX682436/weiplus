package rc1;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76495x366c91de = 1350;

    /* renamed from: NAME */
    private static final java.lang.String f76496x24728b = "showSystemSheetMenu";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = c0Var.V0();
        V0.g4(jSONObject != null ? jSONObject.optString("sessionBuffer") : null);
        pm0.v.X(new rc1.a(V0));
        java.lang.String str = c0Var.t3().f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = c0Var.t3().N2();
        java.lang.String X1 = N2 != null ? N2.X1() : null;
        if (X1 == null) {
            X1 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.f(str, X1, jSONObject != null ? jSONObject.optString("sessionBuffer") : null, 2, 2);
    }
}
