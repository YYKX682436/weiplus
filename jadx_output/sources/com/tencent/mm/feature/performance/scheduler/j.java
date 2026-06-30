package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.scheduler.j f67699d = new com.tencent.mm.feature.performance.scheduler.j();

    public j() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.performance.scheduler.i0 job = (com.tencent.mm.feature.performance.scheduler.i0) obj;
        kotlin.jvm.internal.o.g(job, "$this$job");
        job.b(com.tencent.mm.feature.performance.scheduler.i.f67691d);
        job.f67695d = com.tencent.mm.plugin.clean.model.SubCoreClean$BgCalcTask.class;
        job.f67696e = java.util.concurrent.TimeUnit.MINUTES.toMillis(20L);
        return jz5.f0.f302826a;
    }
}
