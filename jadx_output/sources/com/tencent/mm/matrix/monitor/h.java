package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68762f;

    public h(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68760d = j17;
        this.f68761e = memInfoArr;
        this.f68762f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f68760d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68761e, 18, this.f68762f, com.tencent.mm.matrix.monitor.k0.f68774b);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 11L);
    }
}
