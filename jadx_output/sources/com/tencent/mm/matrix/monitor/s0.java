package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.util.MemInfo f68800d;

    public s0(com.tencent.matrix.util.MemInfo memInfo) {
        this.f68800d = memInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.ProcBackgroundMemory", "ProcessDeepBackgroundOwner 3min mem over threshold", new java.lang.Object[0]);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1832L, 2L);
        com.tencent.mm.matrix.monitor.e1.a(com.tencent.mm.matrix.monitor.e1.f68748a, this.f68800d, 2, com.tencent.mm.matrix.monitor.e1.f68750c);
    }
}
