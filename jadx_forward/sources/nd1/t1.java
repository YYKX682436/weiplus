package nd1;

/* loaded from: classes7.dex */
public class t1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72977x366c91de = 418;

    /* renamed from: NAME */
    public static final java.lang.String f72978x24728b = "setTabBarItem";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        try {
            int i18 = jSONObject.getInt(ya.b.f77479x42930b2);
            nd1.s1 s1Var = new nd1.s1(this, e9Var, i17, jSONObject.optString("iconPath", ""), i18, jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, null), jSONObject.optString("selectedIconPath", ""));
            if (e9Var.mo32091x9a3f0ba2().Q1()) {
                e9Var.mo32091x9a3f0ba2().I1(s1Var);
            } else {
                s1Var.run();
            }
        } catch (java.lang.Exception unused) {
            e9Var.a(i17, o("fail:invalid data"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
