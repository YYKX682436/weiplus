package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.ConcurrentCircularArrayQueue */
/* loaded from: classes16.dex */
public abstract class AbstractC30113x9498046e<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30114x1dc594e1<E> {

    /* renamed from: BUFFER_PAD */
    protected static final int f76653x8e9ccbf4 = 32;

    /* renamed from: REF_ARRAY_BASE */
    private static final long f76654xd42c9c63;

    /* renamed from: REF_ELEMENT_SHIFT */
    private static final int f76655xd338b673;

    /* renamed from: SPARSE_SHIFT */
    protected static final int f76656x21811d83;

    /* renamed from: buffer */
    protected final E[] f76657xaddb9440;

    /* renamed from: mask */
    protected final long f76658x3306ec;

    static {
        int intValue = java.lang.Integer.getInteger("sparse.shift", 0).intValue();
        f76656x21811d83 = intValue;
        int arrayIndexScale = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.arrayIndexScale(java.lang.Object[].class);
        if (4 == arrayIndexScale) {
            f76655xd338b673 = intValue + 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new java.lang.IllegalStateException("Unknown pointer size");
            }
            f76655xd338b673 = intValue + 3;
        }
        f76654xd42c9c63 = r1.arrayBaseOffset(java.lang.Object[].class) + (32 << (f76655xd338b673 - intValue));
    }

    public AbstractC30113x9498046e(int i17) {
        int m163295xa94ca879 = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30123x260cfa.m163295xa94ca879(i17);
        this.f76658x3306ec = m163295xa94ca879 - 1;
        this.f76657xaddb9440 = (E[]) new java.lang.Object[(m163295xa94ca879 << f76656x21811d83) + 64];
    }

    /* renamed from: calcElementOffset */
    public final long m163273xdbbe2a5a(long j17) {
        return m163274xdbbe2a5a(j17, this.f76658x3306ec);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: lpElement */
    public final E m163275xff7e2cd8(long j17) {
        return m163276xff7e2cd8(this.f76657xaddb9440, j17);
    }

    /* renamed from: lvElement */
    public final E m163277x6ec53a12(long j17) {
        return m163278x6ec53a12(this.f76657xaddb9440, j17);
    }

    /* renamed from: soElement */
    public final void m163279xa57c0900(long j17, E e17) {
        m163280xa57c0900(this.f76657xaddb9440, j17, e17);
    }

    /* renamed from: spElement */
    public final void m163281xd5d35df(long j17, E e17) {
        m163282xd5d35df(this.f76657xaddb9440, j17, e17);
    }

    /* renamed from: calcElementOffset */
    public final long m163274xdbbe2a5a(long j17, long j18) {
        return f76654xd42c9c63 + ((j17 & j18) << f76655xd338b673);
    }

    /* renamed from: lpElement */
    public final E m163276xff7e2cd8(E[] eArr, long j17) {
        return (E) rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getObject(eArr, j17);
    }

    /* renamed from: lvElement */
    public final E m163278x6ec53a12(E[] eArr, long j17) {
        return (E) rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getObjectVolatile(eArr, j17);
    }

    /* renamed from: soElement */
    public final void m163280xa57c0900(E[] eArr, long j17, E e17) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedObject(eArr, j17, e17);
    }

    /* renamed from: spElement */
    public final void m163282xd5d35df(E[] eArr, long j17, E e17) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putObject(eArr, j17, e17);
    }
}
