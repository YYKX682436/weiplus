package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.BaseLinkedQueue */
/* loaded from: classes16.dex */
abstract class AbstractC30108x23d06c7<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30109x76bbf894<E> {

    /* renamed from: p00, reason: collision with root package name */
    long f482205p00;

    /* renamed from: p01, reason: collision with root package name */
    long f482206p01;

    /* renamed from: p02, reason: collision with root package name */
    long f482207p02;

    /* renamed from: p03, reason: collision with root package name */
    long f482208p03;

    /* renamed from: p04, reason: collision with root package name */
    long f482209p04;

    /* renamed from: p05, reason: collision with root package name */
    long f482210p05;

    /* renamed from: p06, reason: collision with root package name */
    long f482211p06;
    long p07;

    /* renamed from: p30, reason: collision with root package name */
    long f482212p30;

    /* renamed from: p31, reason: collision with root package name */
    long f482213p31;

    /* renamed from: p32, reason: collision with root package name */
    long f482214p32;

    /* renamed from: p33, reason: collision with root package name */
    long f482215p33;

    /* renamed from: p34, reason: collision with root package name */
    long f482216p34;

    /* renamed from: p35, reason: collision with root package name */
    long f482217p35;

    /* renamed from: p36, reason: collision with root package name */
    long f482218p36;
    long p37;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m163266x11a01dc2() == m163270x679c3b5e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        v56.b a17;
        v56.b m163266x11a01dc2 = m163266x11a01dc2();
        v56.b m163270x679c3b5e = m163270x679c3b5e();
        int i17 = 0;
        while (m163266x11a01dc2 != m163270x679c3b5e && i17 < Integer.MAX_VALUE) {
            do {
                a17 = m163266x11a01dc2.a();
            } while (a17 == null);
            i17++;
            m163266x11a01dc2 = a17;
        }
        return i17;
    }
}
