package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class h3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d3 {
    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, java.util.List list) {
        super(n7Var, list, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d3
    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super.e(k0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168046f;
        android.content.Context f229340d = v5Var.getF229340d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = v5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var : null;
        if (f229340d == null || n7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageActionSheetWC", "trySupportRecentForward, context or pageViewWC is null");
        } else {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ue(f229340d, n7Var, k0Var, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d3
    public void f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168046f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        if (n7Var.mo32091x9a3f0ba2().q2()) {
            k0Var.T1 = n7Var.k2() || n7Var.S();
            k0Var.X1 = n7Var.k2() || n7Var.S();
        } else {
            k0Var.T1 = n7Var.k2();
            k0Var.X1 = n7Var.k2();
        }
        k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e3(this, n7Var));
        k0Var.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f3(this, n7Var);
        k0Var.f293425z = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g3(this, n7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        mi1.f a17 = mi1.c.a(n7Var2.mo32091x9a3f0ba2());
        boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l0.e(n7Var2);
        if (n7Var2.mo32091x9a3f0ba2().u0().g()) {
            i17 = 2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) n7Var2.t3();
            i17 = o6Var.q2() ? false : n7Var2.Y1().startsWith(o6Var.m0().b()) ? 1 : 0;
        }
        int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.i.d(n7Var2, n7Var2.getF229340d()).ordinal();
        int i19 = ordinal != 0 ? ordinal != 2 ? 1 : 0 : 2;
        if (a17.j() == 1) {
            i18 = 1;
        } else {
            i18 = 3;
            if (a17.j() != 3) {
                i18 = a17.j() == 2 ? 2 : 0;
            }
        }
        boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.n0.d(n7Var2);
        int i27 = ti1.c.a(n7Var2.mo32091x9a3f0ba2()) ? 1 : 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.SHOW_CLICKABLE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = n7Var2.mo32091x9a3f0ba2();
        int b17 = (mo32091x9a3f0ba2 == null || (E0 = mo32091x9a3f0ba2.E0()) == null) ? 0 : k91.a.b(k91.a.f387057h, E0, 0, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MenuDelegate_TradeComplaint", "getState, controlByte: " + b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(n7Var2.mo48798x74292566(), n7Var2.X1(), 28, java.lang.String.format(java.util.Locale.US, "%d_%d_%d_%d_%d_%d_%d_%d", java.lang.Integer.valueOf(e17 ? 1 : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17 ? 1 : 0), 1, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(v0Var == (b17 == 1 ? v0Var : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.HIDDEN) ? 1 : 0)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
    }
}
