package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68803f;

    public t(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68801d = j17;
        this.f68802e = memInfoArr;
        this.f68803f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 3min sum pss > " + this.f68801d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68802e, 20, this.f68803f, com.tencent.mm.matrix.monitor.k0.f68775c);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 11L);
    }
}
