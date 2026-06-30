package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.MpscLinkedQueue */
/* loaded from: classes16.dex */
public final class C30122xb461d25<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30108x23d06c7<E> {
    public C30122xb461d25() {
        v56.b bVar = new v56.b();
        this.f76650xcddebb18 = bVar;
        m163293x62b1cafe(bVar);
    }

    @Override // java.util.Queue
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        v56.b bVar = new v56.b(e17);
        m163293x62b1cafe(bVar).lazySet(bVar);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        v56.b a17;
        v56.b bVar = this.f76650xcddebb18;
        v56.b a18 = bVar.a();
        if (a18 != null) {
            return (E) a18.f514903d;
        }
        if (bVar == m163270x679c3b5e()) {
            return null;
        }
        do {
            a17 = bVar.a();
        } while (a17 == null);
        return (E) a17.f514903d;
    }

    @Override // java.util.Queue
    public E poll() {
        v56.b a17;
        v56.b m163265x7a8df6bc = m163265x7a8df6bc();
        v56.b a18 = m163265x7a8df6bc.a();
        if (a18 != null) {
            E e17 = (E) a18.f514903d;
            a18.f514903d = null;
            m163267xa79e7a15(a18);
            return e17;
        }
        if (m163265x7a8df6bc == m163270x679c3b5e()) {
            return null;
        }
        do {
            a17 = m163265x7a8df6bc.a();
        } while (a17 == null);
        E e18 = (E) a17.f514903d;
        a17.f514903d = null;
        this.f76650xcddebb18 = a17;
        return e18;
    }

    /* renamed from: xchgProducerNode */
    public v56.b m163293x62b1cafe(v56.b bVar) {
        v56.b bVar2;
        do {
            bVar2 = this.f76652x23dad8b4;
        } while (!rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.a.a(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6, this, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30112x9cb5a578.f76651xb24fb001, bVar2, bVar));
        return bVar2;
    }
}
