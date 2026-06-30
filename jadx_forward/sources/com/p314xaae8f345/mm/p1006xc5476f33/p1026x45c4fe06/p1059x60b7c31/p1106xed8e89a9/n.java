package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34699x366c91de = 1191;

    /* renamed from: NAME */
    public static final java.lang.String f34700x24728b = "operateWxappCGI";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject jSONObject2;
        if (lVar == null) {
            return;
        }
        org.json.JSONObject jSONObject3 = jSONObject != null ? jSONObject.getJSONObject("cgiInfo") : null;
        if (jSONObject3 == null) {
            return;
        }
        int optInt = jSONObject3.optInt("uiCgi");
        if (optInt != 2921) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.operateWxappCGI", "No match cgi to perform, cgiId: %d", java.lang.Integer.valueOf(optInt));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.operateWxappCGI", "perform handleGetProfileInfo, cgiId: %d", java.lang.Integer.valueOf(optInt));
        java.lang.String optString = (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("cgiInfo")) == null) ? null : jSONObject2.optString("uri");
        org.json.JSONObject jSONObject4 = jSONObject != null ? jSONObject.getJSONObject("reqData") : null;
        r45.rl3 rl3Var = new r45.rl3();
        rl3Var.f466506d = jSONObject4 != null ? jSONObject4.optString(dm.i4.f66875xa013b0d5) : null;
        rl3Var.f466507e = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(lVar.mo50352x76847179());
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 2921;
        lVar2.f152199c = optString;
        lVar2.f152198b = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19797xdd6e8042();
        lVar2.f152197a = rl3Var;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.m(lVar, i17, this));
    }
}
