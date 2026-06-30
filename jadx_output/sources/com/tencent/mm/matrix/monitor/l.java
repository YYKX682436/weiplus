package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68781f;

    public l(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68779d = j17;
        this.f68780e = memInfoArr;
        this.f68781f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum ams-pss with isolated xweb pss > " + this.f68779d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68780e, 27, this.f68781f, com.tencent.mm.matrix.monitor.k0.f68774b);
    }
}
