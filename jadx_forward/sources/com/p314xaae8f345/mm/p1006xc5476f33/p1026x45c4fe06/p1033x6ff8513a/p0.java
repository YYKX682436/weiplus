package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f157833f;

    public p0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f157831d = str;
        this.f157832e = str2;
        this.f157833f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s0.f157850a;
        java.lang.String str = this.f157831d;
        if (r0Var.a(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout but locked " + this.f157832e);
        } else {
            if (!com.p314xaae8f345.mm.vfs.w6.g(str, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout delete failed");
                return;
            }
            this.f157833f.compareAndSet(-1L, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i.f162603a.c(this.f157832e, "temp", 0L, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout delete success");
        }
    }
}
