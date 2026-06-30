package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68757f;

    public f0(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68755d = j17;
        this.f68756e = memInfoArr;
        this.f68757f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppStagedBackground 3min sum pss > " + this.f68755d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68756e, 3, this.f68757f, com.tencent.mm.matrix.monitor.k0.f68775c);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 10L);
    }
}
