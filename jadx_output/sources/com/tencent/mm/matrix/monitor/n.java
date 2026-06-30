package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo[] f68785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68786f;

    public n(long j17, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17) {
        this.f68784d = j17;
        this.f68785e = memInfoArr;
        this.f68786f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum debug-pss > " + this.f68784d, new java.lang.Object[0]);
        com.tencent.mm.matrix.monitor.k0.a(com.tencent.mm.matrix.monitor.k0.f68773a, this.f68785e, 26, this.f68786f, com.tencent.mm.matrix.monitor.k0.f68774b);
    }
}
