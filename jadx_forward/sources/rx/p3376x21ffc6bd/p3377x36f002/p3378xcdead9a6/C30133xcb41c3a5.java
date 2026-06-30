package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.SpscArrayQueue */
/* loaded from: classes16.dex */
public final class C30133xcb41c3a5<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30138xf4371d27<E> {
    public C30133xcb41c3a5(int i17) {
        super(i17);
    }

    /* renamed from: lvConsumerIndex */
    private long m163306x221cb112() {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getLongVolatile(this, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30135xe80a76ff.f76673xea97873c);
    }

    /* renamed from: lvProducerIndex */
    private long m163307x8ba446f6() {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getLongVolatile(this, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30139xe0af8ff0.f76675x62dac44f);
    }

    /* renamed from: soConsumerIndex */
    private void m163308x6a0c1580(long j17) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedLong(this, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30135xe80a76ff.f76673xea97873c, j17);
    }

    /* renamed from: soProducerIndex */
    private void m163309xd393ab64(long j17) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedLong(this, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30139xe0af8ff0.f76675x62dac44f, j17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public boolean isEmpty() {
        return m163307x8ba446f6() == m163306x221cb112();
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        E[] eArr = this.f76657xaddb9440;
        long j17 = this.f76676x57395460;
        long m163273xdbbe2a5a = m163273xdbbe2a5a(j17);
        if (m163278x6ec53a12(eArr, m163273xdbbe2a5a) != null) {
            return false;
        }
        m163280xa57c0900(eArr, m163273xdbbe2a5a, e17);
        m163309xd393ab64(j17 + 1);
        return true;
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public E peek() {
        return m163277x6ec53a12(m163273xdbbe2a5a(this.f76674xedb1be7c));
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public E poll() {
        long j17 = this.f76674xedb1be7c;
        long m163273xdbbe2a5a = m163273xdbbe2a5a(j17);
        E[] eArr = this.f76657xaddb9440;
        E m163278x6ec53a12 = m163278x6ec53a12(eArr, m163273xdbbe2a5a);
        if (m163278x6ec53a12 == null) {
            return null;
        }
        m163280xa57c0900(eArr, m163273xdbbe2a5a, null);
        m163308x6a0c1580(j17 + 1);
        return m163278x6ec53a12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public int size() {
        long m163306x221cb112 = m163306x221cb112();
        while (true) {
            long m163307x8ba446f6 = m163307x8ba446f6();
            long m163306x221cb1122 = m163306x221cb112();
            if (m163306x221cb112 == m163306x221cb1122) {
                return (int) (m163307x8ba446f6 - m163306x221cb1122);
            }
            m163306x221cb112 = m163306x221cb1122;
        }
    }
}
