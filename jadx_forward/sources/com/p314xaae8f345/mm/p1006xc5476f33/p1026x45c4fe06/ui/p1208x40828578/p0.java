package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class p0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171670d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90) {
        this.f171670d = c12723x5ab2de90;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171670d;
        try {
            java.lang.Object obj = w0Var.f398509d;
            if (obj == null || !(obj instanceof java.lang.Long)) {
                return;
            }
            java.util.concurrent.atomic.AtomicLong atomicLong = c12723x5ab2de90.f171541r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.r0 r0Var = c12723x5ab2de90.B;
            long j17 = atomicLong.get();
            long j18 = c12723x5ab2de90.f171542s.get();
            java.lang.Object obj2 = w0Var.f398509d;
            boolean equals = obj2.equals(java.lang.Long.valueOf(j17));
            java.util.concurrent.atomic.AtomicLong atomicLong2 = c12723x5ab2de90.f171544u;
            java.util.ArrayList a17 = equals ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().f157968f.a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 32) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().f157968f.a(atomicLong2.get(), 32);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(a17)) {
                atomicLong2.set(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) a17.get(a17.size() - 1)).C);
            }
            c12723x5ab2de90.f171537o.getClass();
            if (w0Var.f398509d.equals(java.lang.Long.valueOf(j17))) {
                c12723x5ab2de90.n0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.n0(this, c12723x5ab2de90.f171535m ? new java.util.ArrayList(0) : c12723x5ab2de90.f171534i ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.cj().u0(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.ASC) : null, a17));
            } else if (w0Var.f398509d.equals(java.lang.Long.valueOf(j18))) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.r0.f171675b;
                r0Var.a();
                r0Var.sendMessage(r0Var.obtainMessage(1, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o0(this, a17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLauncherRecentsList", "onPagingDataBack e %s", e17);
        }
    }
}
