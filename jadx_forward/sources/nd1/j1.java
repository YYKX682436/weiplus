package nd1;

/* loaded from: classes7.dex */
public class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72945x366c91de = 8;

    /* renamed from: NAME */
    public static final java.lang.String f72946x24728b = "setNavigationBarTitle";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (!jSONObject.has(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        nd1.i1 i1Var = new nd1.i1(this, yVar, i17, jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        if ((yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) || !yVar.t3().Q1()) {
            i1Var.run();
        } else {
            yVar.t3().I1(i1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
