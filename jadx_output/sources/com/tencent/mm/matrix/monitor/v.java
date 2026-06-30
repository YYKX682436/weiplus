package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68809f;

    public v(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68807d = j17;
        this.f68808e = memInfoArr;
        this.f68809f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 3min sum pss > " + this.f68807d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68808e, 8, this.f68809f, com.tencent.mm.matrix.monitor.k0.f68775c);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 11L);
    }
}
