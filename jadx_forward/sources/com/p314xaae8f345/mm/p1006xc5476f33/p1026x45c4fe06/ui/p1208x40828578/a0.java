package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171555d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90) {
        this.f171555d = c12723x5ab2de90;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171555d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m1 m1Var = c12723x5ab2de90.f171537o;
        java.util.ArrayList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().f157968f.a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 32);
        m1Var.getClass();
        int i17 = c12723x5ab2de90.f170900e;
        java.lang.String str = c12723x5ab2de90.f170901f;
        c12723x5ab2de90.C.getClass();
        java.util.ArrayList arrayList = null;
        if (a17.size() <= 0) {
            sb6 = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i18 = 0;
            for (int i19 = 0; i19 < a17.size(); i19++) {
                java.lang.Object obj = a17.get(i19);
                if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) {
                    i18++;
                    sb7.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) obj).f157895e);
                    if (i18 == 20 || i18 >= a17.size()) {
                        break;
                    } else {
                        sb7.append(":#:");
                    }
                }
            }
            sb6 = sb7.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.c(i17, "", 0, sb6, 0, "", str);
        if (c12723x5ab2de90.f171535m) {
            arrayList = new java.util.ArrayList(0);
        } else if (c12723x5ab2de90.f171534i) {
            arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).u0(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.ASC);
        }
        c12723x5ab2de90.n0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.z(this, arrayList, a17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.z0().s0(c12723x5ab2de90.f171541r.get(), true, c12723x5ab2de90.f171540q, c12723x5ab2de90.f171532J, c12723x5ab2de90.K);
        c12723x5ab2de90.f171543t.set(true);
    }
}
