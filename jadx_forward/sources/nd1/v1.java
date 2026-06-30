package nd1;

/* loaded from: classes7.dex */
public class v1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72981x366c91de = 417;

    /* renamed from: NAME */
    public static final java.lang.String f72982x24728b = "setTabBarStyle";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        k91.n e17 = e9Var.mo32091x9a3f0ba2().m0().e();
        nd1.u1 u1Var = new nd1.u1(this, e9Var, i17, jSONObject.optString("color", e17.f387217b), jSONObject.optString("selectedColor", e17.f387218c), jSONObject.optString("backgroundColor", e17.f387219d), jSONObject.optString("borderStyle", e17.f387220e));
        if (e9Var.mo32091x9a3f0ba2().Q1()) {
            e9Var.mo32091x9a3f0ba2().I1(u1Var);
        } else {
            u1Var.run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
