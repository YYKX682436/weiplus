package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class f extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.e f167483b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.e();

    public f() {
        super(0);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var).mo32091x9a3f0ba2().E0();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = E0.X;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_CopyPath", "current time = %d , expire time = %d, time interval in seconds = %d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf((j17 - currentTimeMillis) / 1000));
        int ordinal = (!((java.lang.System.currentTimeMillis() > j17 ? 1 : (java.lang.System.currentTimeMillis() == j17 ? 0 : -1)) > 0) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.SHOW_CLICKABLE : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.HIDDEN).ordinal();
        int i17 = this.f418617a;
        if (ordinal == 1) {
            g4Var.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571619ki), com.p314xaae8f345.mm.R.raw.f78465xf606a6e5);
        } else {
            if (ordinal != 2) {
                return;
            }
            g4Var.l(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571619ki), com.p314xaae8f345.mm.R.raw.f78465xf606a6e5, true);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.e eVar = f167483b;
        eVar.f167480a = str;
        eVar.f167481b = n7Var.X1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf.f165052a.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1.f162265e, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, eVar);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t0(false).x(n7Var.mo50260x9f1221c2(), n7Var.U1());
    }
}
