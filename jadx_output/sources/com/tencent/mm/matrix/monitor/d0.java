package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68744f;

    public d0(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68742d = j17;
        this.f68743e = memInfoArr;
        this.f68744f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppStagedBackground 1min sum pss > " + this.f68742d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68743e, 11, this.f68744f, com.tencent.mm.matrix.monitor.k0.f68774b);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 10L);
    }
}
