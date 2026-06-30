package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public final int f171926d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f171927e = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f171928f = new java.util.concurrent.atomic.AtomicInteger(0);

    public c(int i17) {
        this.f171926d = i17;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a aVar) {
        do {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f171928f;
            int incrementAndGet = atomicInteger.incrementAndGet();
            int i17 = this.f171926d;
            if (incrementAndGet <= i17) {
                e(aVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b(this));
                return;
            }
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f171927e;
            linkedBlockingQueue.offer(aVar);
            if (atomicInteger.decrementAndGet() >= i17) {
                return;
            } else {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a) linkedBlockingQueue.poll();
            }
        } while (aVar != null);
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        return false;
    }

    public void d() {
    }

    public abstract void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a aVar, yz5.a aVar2);
}
