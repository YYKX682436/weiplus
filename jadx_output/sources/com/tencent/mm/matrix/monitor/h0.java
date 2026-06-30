package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68765f;

    public h0(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68763d = j17;
        this.f68764e = memInfoArr;
        this.f68765f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppStagedBackground 3min sum pss > " + this.f68763d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68764e, 15, this.f68765f, com.tencent.mm.matrix.monitor.k0.f68776d);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 10L);
    }
}
