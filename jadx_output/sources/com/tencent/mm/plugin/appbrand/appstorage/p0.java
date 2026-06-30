package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f76300f;

    public p0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f76298d = str;
        this.f76299e = str2;
        this.f76300f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.appstorage.r0 r0Var = com.tencent.mm.plugin.appbrand.appstorage.s0.f76317a;
        java.lang.String str = this.f76298d;
        if (r0Var.a(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout but locked " + this.f76299e);
        } else {
            if (!com.tencent.mm.vfs.w6.g(str, true)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout delete failed");
                return;
            }
            this.f76300f.compareAndSet(-1L, 0L);
            com.tencent.mm.plugin.appbrand.jsapi.file.i.f81070a.c(this.f76299e, "temp", 0L, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout delete success");
        }
    }
}
