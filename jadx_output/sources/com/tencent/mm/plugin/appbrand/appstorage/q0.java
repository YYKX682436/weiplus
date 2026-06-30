package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f76306f;

    public q0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f76304d = str;
        this.f76305e = str2;
        this.f76306f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.nfc.j.CTRL_INDEX, 252);
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout! " + this.f76304d + " deletePath " + this.f76305e);
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.appstorage.p0(this.f76305e, this.f76304d, this.f76306f));
    }
}
