package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.scheduler.i f67691d = new com.tencent.mm.feature.performance.scheduler.i();

    public i() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.performance.scheduler.z trigger = (com.tencent.mm.feature.performance.scheduler.z) obj;
        kotlin.jvm.internal.o.g(trigger, "$this$trigger");
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(90L);
        java.util.LinkedList linkedList = trigger.f67727b;
        linkedList.addFirst(new com.tencent.mm.feature.performance.scheduler.r(millis));
        linkedList.addFirst(new com.tencent.mm.feature.performance.scheduler.y(true, timeUnit.toMillis(30L)));
        return jz5.f0.f302826a;
    }
}
