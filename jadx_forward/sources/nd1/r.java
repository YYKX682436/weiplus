package nd1;

/* loaded from: classes7.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72969x366c91de = 14;

    /* renamed from: NAME */
    public static final java.lang.String f72970x24728b = "navigateTo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("url");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("singlePageData");
        if (yVar.mo32091x9a3f0ba2().m0().e().a(optString)) {
            yVar.a(i17, o("fail:can not navigate to a tab bar page"));
            return;
        }
        nd1.q qVar = new nd1.q(this, yVar, i17, optString, optJSONObject, jSONObject.optString("routeId", null));
        if ((yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) || !yVar.mo32091x9a3f0ba2().Q1()) {
            qVar.run();
        } else {
            yVar.mo32091x9a3f0ba2().I1(qVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
