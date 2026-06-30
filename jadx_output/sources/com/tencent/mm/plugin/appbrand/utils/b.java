package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.c f90387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.appbrand.utils.c cVar) {
        super(0);
        this.f90387d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue;
        com.tencent.mm.plugin.appbrand.utils.a aVar;
        com.tencent.mm.plugin.appbrand.utils.c cVar = this.f90387d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = cVar.f90395f;
        atomicInteger.decrementAndGet();
        do {
            linkedBlockingQueue = cVar.f90394e;
            aVar = (com.tencent.mm.plugin.appbrand.utils.a) linkedBlockingQueue.poll();
            if ((aVar != null) && !cVar.c(aVar)) {
                break;
            }
        } while (!linkedBlockingQueue.isEmpty());
        if (aVar != null) {
            cVar.a(aVar);
        }
        if (atomicInteger.get() == 0 && linkedBlockingQueue.isEmpty()) {
            cVar.d();
        }
        return jz5.f0.f302826a;
    }
}
