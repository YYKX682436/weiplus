package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.scheduler.i0 f67687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67688e;

    public g0(com.tencent.mm.feature.performance.scheduler.i0 i0Var, boolean z17) {
        this.f67687d = i0Var;
        this.f67688e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.performance.scheduler.i0 i0Var = this.f67687d;
        boolean z17 = this.f67688e;
        if (i0Var.f67697f || z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "schedule task cancel " + i0Var.f67692a);
            java.lang.Class cls = i0Var.f67695d;
            if (cls != null) {
                com.tencent.mm.feature.performance.scheduler.f0.f67684a.a(cls, true);
            }
        }
    }
}
