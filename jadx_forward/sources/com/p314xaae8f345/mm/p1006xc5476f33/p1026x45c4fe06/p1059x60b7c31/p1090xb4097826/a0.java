package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34282x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34283x24728b = "modifyFinderAccountNickname";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiModifyFinderAccountNickname", "JsApiModifyFinderAccountNickname");
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            e9Var.a(i17, o("fail:username is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("nickname", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            e9Var.a(i17, o("fail:nickname is null or nil"));
            return;
        }
        java.lang.String optString3 = jSONObject.optString("signature", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            e9Var.a(i17, o("fail:signature is null or nil"));
            return;
        }
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(0, optString2);
        ri2Var.set(1, optString3);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 1);
        try {
            hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ri2Var.mo14344x5f01b1f6()));
        } catch (java.lang.Exception unused) {
        }
        r45.rn2 rn2Var = new r45.rn2();
        rn2Var.set(1, optString);
        rn2Var.m75941xfb821914(2).add(hx0Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 3870;
        lVar2.f152199c = "${FinderCgiConstants.CGI_PRE}/finderoplog";
        lVar2.f152197a = rn2Var;
        lVar2.f152198b = new r45.sn2();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.z(this, e9Var, i17));
    }
}
