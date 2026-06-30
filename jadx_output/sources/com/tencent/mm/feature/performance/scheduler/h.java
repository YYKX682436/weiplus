package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.scheduler.h f67689d = new com.tencent.mm.feature.performance.scheduler.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.performance.scheduler.i0 job = (com.tencent.mm.feature.performance.scheduler.i0) obj;
        kotlin.jvm.internal.o.g(job, "$this$job");
        job.b(com.tencent.mm.feature.performance.scheduler.g.f67686d);
        job.f67695d = rb0.a.class;
        job.f67696e = java.util.concurrent.TimeUnit.MINUTES.toMillis(20L);
        return jz5.f0.f302826a;
    }
}
