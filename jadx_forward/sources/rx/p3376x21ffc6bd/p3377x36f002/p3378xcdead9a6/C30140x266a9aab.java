package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.SpscLinkedQueue */
/* loaded from: classes16.dex */
public final class C30140x266a9aab<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30108x23d06c7<E> {
    public C30140x266a9aab() {
        m163271xfd9a97b1(new v56.b());
        m163267xa79e7a15(this.f76652x23dad8b4);
        this.f76650xcddebb18.lazySet(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        v56.b bVar = new v56.b(e17);
        this.f76652x23dad8b4.lazySet(bVar);
        this.f76652x23dad8b4 = bVar;
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        v56.b a17 = this.f76650xcddebb18.a();
        if (a17 != null) {
            return (E) a17.f514903d;
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        v56.b a17 = this.f76650xcddebb18.a();
        if (a17 == null) {
            return null;
        }
        E e17 = (E) a17.f514903d;
        a17.f514903d = null;
        this.f76650xcddebb18 = a17;
        return e17;
    }
}
