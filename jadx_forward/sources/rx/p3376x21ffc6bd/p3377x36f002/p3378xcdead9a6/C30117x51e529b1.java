package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.MpmcArrayQueue */
/* loaded from: classes16.dex */
public class C30117x51e529b1<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30118x77024473<E> {

    /* renamed from: p30, reason: collision with root package name */
    long f482261p30;

    /* renamed from: p31, reason: collision with root package name */
    long f482262p31;

    /* renamed from: p32, reason: collision with root package name */
    long f482263p32;

    /* renamed from: p33, reason: collision with root package name */
    long f482264p33;

    /* renamed from: p34, reason: collision with root package name */
    long f482265p34;

    /* renamed from: p35, reason: collision with root package name */
    long f482266p35;

    /* renamed from: p36, reason: collision with root package name */
    long f482267p36;
    long p37;

    /* renamed from: p40, reason: collision with root package name */
    long f482268p40;

    /* renamed from: p41, reason: collision with root package name */
    long f482269p41;

    /* renamed from: p42, reason: collision with root package name */
    long f482270p42;

    /* renamed from: p43, reason: collision with root package name */
    long f482271p43;

    /* renamed from: p44, reason: collision with root package name */
    long f482272p44;

    /* renamed from: p45, reason: collision with root package name */
    long f482273p45;

    /* renamed from: p46, reason: collision with root package name */
    long f482274p46;

    public C30117x51e529b1(int i17) {
        super(java.lang.Math.max(2, i17));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public boolean isEmpty() {
        return m163289x221cb112() == m163292x8ba446f6();
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        long j17 = this.f76658x3306ec + 1;
        long[] jArr = this.f76661x9ace6361;
        long j18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        while (true) {
            long m163292x8ba446f6 = m163292x8ba446f6();
            long m163284xf29c4169 = m163284xf29c4169(m163292x8ba446f6);
            long m163285xbad1bf6b = m163285xbad1bf6b(jArr, m163284xf29c4169) - m163292x8ba446f6;
            if (m163285xbad1bf6b == 0) {
                long j19 = m163292x8ba446f6 + 1;
                if (m163291x4506268b(m163292x8ba446f6, j19)) {
                    m163281xd5d35df(m163273xdbbe2a5a(m163292x8ba446f6), e17);
                    m163286x5af4ce3d(jArr, m163284xf29c4169, j19);
                    return true;
                }
            } else if (m163285xbad1bf6b < 0) {
                long j27 = m163292x8ba446f6 - j17;
                if (j27 <= j18) {
                    j18 = m163289x221cb112();
                    if (j27 <= j18) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public E peek() {
        long m163289x221cb112;
        E m163275xff7e2cd8;
        do {
            m163289x221cb112 = m163289x221cb112();
            m163275xff7e2cd8 = m163275xff7e2cd8(m163273xdbbe2a5a(m163289x221cb112));
            if (m163275xff7e2cd8 != null) {
                break;
            }
        } while (m163289x221cb112 != m163292x8ba446f6());
        return m163275xff7e2cd8;
    }

    @Override // java.util.Queue, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public E poll() {
        long[] jArr = this.f76661x9ace6361;
        long j17 = -1;
        while (true) {
            long m163289x221cb112 = m163289x221cb112();
            long m163284xf29c4169 = m163284xf29c4169(m163289x221cb112);
            long j18 = m163289x221cb112 + 1;
            long m163285xbad1bf6b = m163285xbad1bf6b(jArr, m163284xf29c4169) - j18;
            if (m163285xbad1bf6b == 0) {
                if (m163288xdb7e90a7(m163289x221cb112, j18)) {
                    long m163273xdbbe2a5a = m163273xdbbe2a5a(m163289x221cb112);
                    E m163275xff7e2cd8 = m163275xff7e2cd8(m163273xdbbe2a5a);
                    m163281xd5d35df(m163273xdbbe2a5a, null);
                    m163286x5af4ce3d(jArr, m163284xf29c4169, m163289x221cb112 + this.f76658x3306ec + 1);
                    return m163275xff7e2cd8;
                }
            } else if (m163285xbad1bf6b < 0 && m163289x221cb112 >= j17) {
                j17 = m163292x8ba446f6();
                if (m163289x221cb112 == j17) {
                    return null;
                }
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30116x35533ae7
    public int size() {
        long m163289x221cb112 = m163289x221cb112();
        while (true) {
            long m163292x8ba446f6 = m163292x8ba446f6();
            long m163289x221cb1122 = m163289x221cb112();
            if (m163289x221cb112 == m163289x221cb1122) {
                return (int) (m163292x8ba446f6 - m163289x221cb1122);
            }
            m163289x221cb112 = m163289x221cb1122;
        }
    }
}
