package nd1;

/* loaded from: classes7.dex */
public class p1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72967x366c91de = 389;

    /* renamed from: NAME */
    public static final java.lang.String f72968x24728b = "setTabBarBadge";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        try {
            int i18 = jSONObject.getInt(ya.b.f77479x42930b2);
            java.lang.String optString = jSONObject.optString("type", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc);
            java.lang.String optString2 = jSONObject.optString("badgeValue", "");
            java.lang.String optString3 = jSONObject.optString("badgeColor", "");
            java.lang.String optString4 = jSONObject.optString("badgeTextColor", "");
            com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
            c19762x487075a.f38859x6ac9171 = false;
            ck5.f fVar = new ck5.f(optString2);
            fVar.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
            fVar.f124094f = 0;
            fVar.f124093e = 4;
            fVar.f124089a = true;
            fVar.d(new nd1.n1(this, c19762x487075a));
            nd1.o1 o1Var = new nd1.o1(this, e9Var, i17, i18, optString, c19762x487075a.f38859x6ac9171 ? "…" : optString2, optString3, optString4);
            if (e9Var.t3().Q1()) {
                e9Var.t3().I1(o1Var);
            } else {
                o1Var.run();
            }
        } catch (java.lang.Exception unused) {
            e9Var.a(i17, o("fail"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
