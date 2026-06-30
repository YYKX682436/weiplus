package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.SpmcArrayQueue */
/* loaded from: classes16.dex */
public final class C30125x9d17e36b<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30129x103be921<E> {
    public C30125x9d17e36b(int i17) {
        super(i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public boolean isEmpty() {
        return m163300x221cb112() == m163302x8ba446f6();
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.f76657xaddb9440;
        long j17 = this.f76658x3306ec;
        long m163302x8ba446f6 = m163302x8ba446f6();
        long m163273xdbbe2a5a = m163273xdbbe2a5a(m163302x8ba446f6);
        if (m163278x6ec53a12(eArr, m163273xdbbe2a5a) != null) {
            if (m163302x8ba446f6 - m163300x221cb112() > j17) {
                return false;
            }
            do {
            } while (m163278x6ec53a12(eArr, m163273xdbbe2a5a) != null);
        }
        m163282xd5d35df(eArr, m163273xdbbe2a5a, e17);
        m163303xca8128cc(m163302x8ba446f6 + 1);
        return true;
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public E peek() {
        E m163277x6ec53a12;
        long m163304x35bd622c = m163304x35bd622c();
        do {
            long m163300x221cb112 = m163300x221cb112();
            if (m163300x221cb112 >= m163304x35bd622c) {
                long m163302x8ba446f6 = m163302x8ba446f6();
                if (m163300x221cb112 >= m163302x8ba446f6) {
                    return null;
                }
                m163305x8b2a3ec5(m163302x8ba446f6);
            }
            m163277x6ec53a12 = m163277x6ec53a12(m163273xdbbe2a5a(m163300x221cb112));
        } while (m163277x6ec53a12 == null);
        return m163277x6ec53a12;
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public E poll() {
        long m163300x221cb112;
        long m163304x35bd622c = m163304x35bd622c();
        do {
            m163300x221cb112 = m163300x221cb112();
            if (m163300x221cb112 >= m163304x35bd622c) {
                long m163302x8ba446f6 = m163302x8ba446f6();
                if (m163300x221cb112 >= m163302x8ba446f6) {
                    return null;
                }
                m163305x8b2a3ec5(m163302x8ba446f6);
            }
        } while (!m163299x2105cf55(m163300x221cb112, 1 + m163300x221cb112));
        long m163273xdbbe2a5a = m163273xdbbe2a5a(m163300x221cb112);
        E[] eArr = this.f76657xaddb9440;
        E m163276xff7e2cd8 = m163276xff7e2cd8(eArr, m163273xdbbe2a5a);
        m163280xa57c0900(eArr, m163273xdbbe2a5a, null);
        return m163276xff7e2cd8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public int size() {
        long m163300x221cb112 = m163300x221cb112();
        while (true) {
            long m163302x8ba446f6 = m163302x8ba446f6();
            long m163300x221cb1122 = m163300x221cb112();
            if (m163300x221cb112 == m163300x221cb1122) {
                return (int) (m163302x8ba446f6 - m163300x221cb1122);
            }
            m163300x221cb112 = m163300x221cb1122;
        }
    }
}
