package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public final int f90393d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f90394e = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f90395f = new java.util.concurrent.atomic.AtomicInteger(0);

    public c(int i17) {
        this.f90393d = i17;
    }

    public final void a(com.tencent.mm.plugin.appbrand.utils.a aVar) {
        do {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f90395f;
            int incrementAndGet = atomicInteger.incrementAndGet();
            int i17 = this.f90393d;
            if (incrementAndGet <= i17) {
                e(aVar, new com.tencent.mm.plugin.appbrand.utils.b(this));
                return;
            }
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f90394e;
            linkedBlockingQueue.offer(aVar);
            if (atomicInteger.decrementAndGet() >= i17) {
                return;
            } else {
                aVar = (com.tencent.mm.plugin.appbrand.utils.a) linkedBlockingQueue.poll();
            }
        } while (aVar != null);
    }

    public boolean c(com.tencent.mm.plugin.appbrand.utils.a task) {
        kotlin.jvm.internal.o.g(task, "task");
        return false;
    }

    public void d() {
    }

    public abstract void e(com.tencent.mm.plugin.appbrand.utils.a aVar, yz5.a aVar2);
}
