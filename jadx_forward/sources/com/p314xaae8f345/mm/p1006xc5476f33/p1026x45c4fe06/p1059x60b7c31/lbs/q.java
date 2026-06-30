package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l {

    /* renamed from: CTRL_INDEX */
    private static final int f34415x366c91de = 586;

    /* renamed from: NAME */
    public static final java.lang.String f34416x24728b = "enableLocationUpdateBackground";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l
    public android.os.Bundle E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("smallAppKey", jSONObject.optString("subKey", "") + "#" + e9Var.mo48798x74292566() + ";");
        bundle.putBoolean("enableIndoor", jSONObject.optBoolean("enableIndoor", false));
        if (e9Var.t3() != null && e9Var.t3().E0() != null) {
            bundle.putString("openId", ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) e9Var.t3().E0()).f128831x0);
        }
        return bundle;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        super.D(e9Var, jSONObject, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 j1Var = this.f162984h;
        if (!(j1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "state manager not RuntimeLocationUpdateStateManagerWxa");
            e9Var.a(i17, o("fail:system error"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 k1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1) j1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 c1Var = k1Var.f162982v;
        if (c1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitleImmediately");
            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b1(c1Var));
        }
        if (c1Var == null || !k1Var.f162974q) {
            c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1();
        }
        k1Var.f162982v = c1Var;
        c1Var.a(e9Var.t3());
        k1Var.f162975r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.o(this, k1Var, e9Var);
        u81.f fVar = k1Var.f162983w;
        if (fVar != null) {
            e9Var.t3().N.c(fVar);
        }
        if (fVar == null || !k1Var.f162974q) {
            fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.p(this, k1Var);
        }
        e9Var.t3().N.a(fVar);
        k1Var.f162983w = fVar;
        k1Var.f162974q = true;
    }
}
