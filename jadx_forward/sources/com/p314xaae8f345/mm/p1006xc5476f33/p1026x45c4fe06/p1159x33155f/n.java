package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class n extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.e f167518b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.e();

    public n() {
        super(40);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        g4Var.l(this.f418617a, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572174n41), com.p314xaae8f345.mm.R.raw.f78463x7a2540ce, false);
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        r45.fe0 fe0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        d(n7Var, "-1", 1);
        java.lang.String mo48798x74292566 = n7Var.mo48798x74292566();
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1.f168471g;
        synchronized (hashMap) {
            if (hashMap.containsKey(mo48798x74292566)) {
                fe0Var = (r45.fe0) hashMap.get(mo48798x74292566);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1.a(mo48798x74292566);
                fe0Var = null;
            }
        }
        r45.fe0 fe0Var2 = fe0Var;
        if (fe0Var2 == null || !fe0Var2.f455783d) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_DeveloperService", "has entrance");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.k(this, fe0Var2, context);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l(this, fe0Var2, context, n7Var, str, k0Var);
        k0Var.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.m(this, n7Var);
        k0Var.q(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572174n41), 17);
        k0Var.v();
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(n7Var.mo48798x74292566(), n7Var.X1(), 58, str, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i17, 0);
    }
}
