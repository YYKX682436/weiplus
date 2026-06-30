package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public abstract class x extends com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m implements com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f271266h = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.w();

    /* renamed from: e, reason: collision with root package name */
    public final int f271267e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f271268f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g f271269g;

    public x(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u uVar) {
        super(uVar);
        int i17 = uVar.f271255k;
        this.f271267e = i17;
        this.f271268f = new java.util.concurrent.atomic.AtomicInteger(i17);
    }

    public java.lang.String a() {
        return ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) c()).f271250f;
    }

    public boolean b(long j17) {
        this.f271269g.c(f(), j17);
        com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(e()).s();
        if (s17 == null) {
            return true;
        }
        android.os.StatFs statFs = new android.os.StatFs(com.p314xaae8f345.mm.vfs.w6.i(s17.o(), false));
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkWorker", "ensureDiskSpace(%s): available.size:%d, expected.size:%d", f(), java.lang.Long.valueOf(availableBlocksLong), java.lang.Long.valueOf(j17));
        return availableBlocksLong < 0 || availableBlocksLong > j17;
    }

    public boolean d() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9;
    }

    public java.lang.String e() {
        return ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) c()).b();
    }

    public java.lang.String f() {
        return ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) c()).f271245a;
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v g(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.t tVar) {
        if (!(!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9))) {
            return tVar.i(this);
        }
        zy.s sVar = (zy.s) i95.n0.c(zy.s.class);
        java.lang.String f17 = f();
        ((yy.o) sVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(f17);
        if (e17 != null) {
            e17.f68795x10a0fed7 = 1;
            l0Var.g(e17, true);
        }
        return tVar.i(this);
    }

    /* renamed from: retry */
    public boolean mo49250x67622a8() {
        boolean z17 = this.f271268f.decrementAndGet() > 0;
        this.f271269g.a(f(), this.f271267e, this.f271268f.get());
        return z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v g17 = g((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.t) f271266h.get());
        if (g17 != null) {
            this.f271269g.b(this, g17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkWorker", "groupId = %s, performer get null response", mo49249x4f4a97c4());
        }
    }
}
