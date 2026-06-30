package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 f178743e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var, long j17) {
        this.f178743e = b0Var;
        this.f178742d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33727x24728b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var = this.f178743e;
        long j17 = this.f178742d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = b0Var.d(j17);
        if (d17 == null || d17.f178496f != 1) {
            return;
        }
        iv1.f.f().g(d17.f178495e);
        b0Var.h(d17.f178495e);
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null) {
            c17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
            c17.f68441x10a0fed7 = 2;
            c17.f68413xf432b5ad = d17.f178500m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) b0Var.f178520i.get(d17.f178495e), c17.f68440x1bb3b54a));
            if (valueOf != null) {
                k02.m.a(c17.f68408x32b20428, ((((float) (c17.f68413xf432b5ad - java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) b0Var.f178519h.get(d17.f178495e), c17.f68438x1bb3427e)).longValue())) * 1000.0f) / ((float) (java.lang.System.currentTimeMillis() - valueOf.longValue()))) / 1048576.0f, (int) ((((float) c17.f68413xf432b5ad) / ((float) c17.f68443x78351860)) * 100.0f));
            }
        }
        b0Var.f178519h.remove(d17.f178495e);
        b0Var.f178520i.remove(d17.f178495e);
        b0Var.f178745a.e(j17);
    }
}
