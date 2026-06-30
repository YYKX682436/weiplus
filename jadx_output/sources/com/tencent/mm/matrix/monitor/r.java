package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68797f;

    public r(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68795d = j17;
        this.f68796e = memInfoArr;
        this.f68797f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 3min sum pss > " + this.f68795d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68796e, 21, this.f68797f, com.tencent.mm.matrix.monitor.k0.f68775c);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 11L);
    }
}
