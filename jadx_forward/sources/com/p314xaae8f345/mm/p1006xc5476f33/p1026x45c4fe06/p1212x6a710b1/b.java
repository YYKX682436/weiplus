package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c f171920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c cVar) {
        super(0);
        this.f171920d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c cVar = this.f171920d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = cVar.f171928f;
        atomicInteger.decrementAndGet();
        do {
            linkedBlockingQueue = cVar.f171927e;
            aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a) linkedBlockingQueue.poll();
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
        return jz5.f0.f384359a;
    }
}
