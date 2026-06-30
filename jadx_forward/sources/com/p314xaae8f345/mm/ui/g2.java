package com.p314xaae8f345.mm.ui;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f290148d;

    public g2(com.p314xaae8f345.mm.ui.ActivityC21353x2892d6a9 activityC21353x2892d6a9, long j17) {
        this.f290148d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f290148d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearCacheUI", "doClearCache flag %d", java.lang.Long.valueOf(j17));
        if ((1 & j17) != 0) {
            com.p314xaae8f345.mm.vfs.w6.f(tv.a.a());
        }
        if ((2 & j17) != 0) {
            com.p314xaae8f345.mm.vfs.w6.f(t11.b.f496089a);
        }
        if ((4 & j17) != 0) {
            com.p314xaae8f345.mm.vfs.w6.f(lp0.b.g0());
        }
        if ((8 & j17) != 0) {
            c01.d9.b().getClass();
            com.p314xaae8f345.mm.vfs.w6.f(((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).wi());
        }
        if ((16 & j17) != 0) {
            com.p314xaae8f345.mm.vfs.w6.f(hn1.a0.a());
        }
        if ((32 & j17) != 0) {
            c01.d9.b().getClass();
            com.p314xaae8f345.mm.vfs.w6.f(com.p314xaae8f345.mm.p2621x8fb0427b.s3.a());
        }
        if ((j17 & 64) != 0) {
            c01.d9.b();
            com.p314xaae8f345.mm.vfs.w6.f(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).wi());
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5271x96f6c245 c5271x96f6c245 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5271x96f6c245();
        c5271x96f6c245.f135595g.getClass();
        c5271x96f6c245.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.f2(this));
    }
}
