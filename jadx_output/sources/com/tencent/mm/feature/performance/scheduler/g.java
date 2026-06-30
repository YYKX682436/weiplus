package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.scheduler.g f67686d = new com.tencent.mm.feature.performance.scheduler.g();

    public g() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.performance.scheduler.z trigger = (com.tencent.mm.feature.performance.scheduler.z) obj;
        kotlin.jvm.internal.o.g(trigger, "$this$trigger");
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(7L);
        java.util.LinkedList linkedList = trigger.f67727b;
        linkedList.addFirst(new com.tencent.mm.feature.performance.scheduler.r(millis));
        linkedList.addFirst(new com.tencent.mm.feature.performance.scheduler.y(true, java.util.concurrent.TimeUnit.SECONDS.toMillis(30L)));
        return jz5.f0.f302826a;
    }
}
