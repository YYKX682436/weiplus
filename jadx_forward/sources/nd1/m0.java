package nd1;

/* loaded from: classes7.dex */
public class m0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72957x366c91de = 13;

    /* renamed from: NAME */
    public static final java.lang.String f72958x24728b = "redirectTo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        java.lang.String optString = jSONObject.optString("url");
        if (yVar.mo32091x9a3f0ba2().m0().e().a(optString)) {
            yVar.a(i17, o("fail:can not redirect to a tab bar page"));
            return;
        }
        nd1.l0 l0Var = new nd1.l0(this, yVar, optString, jSONObject.optJSONObject("singlePageData"), jSONObject.optString("routeId", null), i17);
        if ((yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) || !yVar.mo32091x9a3f0ba2().Q1()) {
            l0Var.run();
        } else {
            yVar.mo32091x9a3f0ba2().I1(l0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
