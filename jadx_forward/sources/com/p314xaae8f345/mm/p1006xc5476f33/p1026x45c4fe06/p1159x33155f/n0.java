package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public final class n0 extends nh1.a {
    public n0() {
        super(4);
    }

    public static boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        return (n7Var.H1(4) == null || n7Var.H1(4).f167528c || wa1.b.a(n7Var.mo32091x9a3f0ba2())) ? false : true;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        boolean z18 = E0 == null || n7Var.getF229340d() == null || (E0.f128827p0 & 64) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_ShareToTimeline", "isShow isPermissionDenied:%b", java.lang.Boolean.valueOf(z18));
        if (!z18) {
            int i17 = this.f418617a;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2x);
            if (d(n7Var) && !wa1.b.a(n7Var.mo32091x9a3f0ba2())) {
                java.util.Map map = i81.j.f371125a;
                if (!(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d)) {
                    z17 = false;
                    g4Var.j(i17, string, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
                }
            }
            z17 = true;
            g4Var.j(i17, string, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_ShareToTimeline", "performItemClick");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.m0();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String J1 = n7Var.J1();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J1)) {
            J1 = E0.f387374d;
        }
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, J1);
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, n7Var.Y1());
        m0Var.v(n7Var.mo32091x9a3f0ba2().C0(), n7Var.mo50260x9f1221c2());
        m0Var.t(hashMap);
        m0Var.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(str, n7Var.X1(), 41, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
    }
}
