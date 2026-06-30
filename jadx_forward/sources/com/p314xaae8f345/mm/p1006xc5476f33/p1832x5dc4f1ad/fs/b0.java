package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f229485f;

    public b0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f229483d = str;
        this.f229484e = str2;
        this.f229485f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e0.f229495a;
        java.lang.String str = this.f229483d;
        if (d0Var.a(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout but locked " + this.f229484e);
        } else {
            if (!com.p314xaae8f345.mm.vfs.w6.g(str, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout delete failed");
                return;
            }
            this.f229485f.compareAndSet(-1L, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.x.f229534a.d(this.f229484e, "temp", 0L, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout delete success");
        }
    }
}
