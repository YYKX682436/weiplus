package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34320x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34321x24728b = "modifyFinderAccountAvatar";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiModifyFinderAccountAvatar", "JsApiModifyFinderAccountAvatar");
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        java.lang.String optString = jSONObject.optString("avatarPath", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            e9Var.a(i17, o("fail:avatarPath is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString(dm.i4.f66875xa013b0d5, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            e9Var.a(i17, o("fail:username is null or nil"));
            return;
        }
        java.lang.String o17 = e9Var.V0().mo50354x59eafec1().mo49620x1d537609(optString).o();
        r45.qi2 qi2Var = new r45.qi2();
        qi2Var.set(0, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(com.p314xaae8f345.mm.vfs.w6.N(o17, 0, -1)));
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 1);
        try {
            hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(qi2Var.mo14344x5f01b1f6()));
        } catch (java.lang.Exception unused) {
        }
        r45.rn2 rn2Var = new r45.rn2();
        rn2Var.set(1, optString2);
        rn2Var.m75941xfb821914(2).add(hx0Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 3870;
        lVar2.f152199c = "${FinderCgiConstants.CGI_PRE}/finderoplog";
        lVar2.f152197a = rn2Var;
        lVar2.f152198b = new r45.sn2();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.x(this, e9Var, i17));
    }
}
