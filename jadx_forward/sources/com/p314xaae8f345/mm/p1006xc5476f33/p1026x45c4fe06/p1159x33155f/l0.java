package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class l0 extends nh1.a {
    public l0() {
        super(3);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0 d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        if (E0 != null && k91.a.f387054e.a(E0) == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.HIDDEN;
        }
        if (e(n7Var)) {
            java.util.Map map = i81.j.f371125a;
            if (!(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d) && !wa1.b.a(n7Var.mo32091x9a3f0ba2())) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.SHOW_CLICKABLE;
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.SHOW_UNCLICKABLE;
    }

    public static boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        if ((E0 != null && E0.f387385r.f156932d == 0 && k91.a.f387054e.a(E0) == 2) || n7Var.H1(3) == null) {
            return false;
        }
        return !n7Var.H1(3).f167528c;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        int ordinal = d(context, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            g4Var.j(this.f418617a, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2w), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), true);
        } else {
            g4Var.h(this.f418617a, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2w), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(str, n7Var.X1(), 39, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.a(n7Var.mo32091x9a3f0ba2());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.z0.b(context, n7Var, u0Var, null);
    }
}
