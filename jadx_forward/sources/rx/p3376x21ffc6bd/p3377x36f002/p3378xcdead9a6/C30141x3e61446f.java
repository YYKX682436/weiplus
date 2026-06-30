package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.SpscUnboundedArrayQueue */
/* loaded from: classes16.dex */
public class C30141x3e61446f<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30143xdd1c0e75<E> implements rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30124x96537922 {

    /* renamed from: C_INDEX_OFFSET */
    private static final long f76678xea97873c;

    /* renamed from: P_INDEX_OFFSET */
    private static final long f76681x62dac44f;

    /* renamed from: REF_ARRAY_BASE */
    private static final long f76682xd42c9c63;

    /* renamed from: REF_ELEMENT_SHIFT */
    private static final int f76683xd338b673;

    /* renamed from: MAX_LOOK_AHEAD_STEP */
    static final int f76680x53335b4f = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: HAS_NEXT */
    private static final java.lang.Object f76679x38cb2198 = new java.lang.Object();

    static {
        sun.misc.Unsafe unsafe = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6;
        int arrayIndexScale = unsafe.arrayIndexScale(java.lang.Object[].class);
        if (4 == arrayIndexScale) {
            f76683xd338b673 = 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new java.lang.IllegalStateException("Unknown pointer size");
            }
            f76683xd338b673 = 3;
        }
        f76682xd42c9c63 = unsafe.arrayBaseOffset(java.lang.Object[].class);
        try {
            f76681x62dac44f = unsafe.objectFieldOffset(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30146x8dd0e73a.class.getDeclaredField("producerIndex"));
            try {
                f76678xea97873c = unsafe.objectFieldOffset(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30143xdd1c0e75.class.getDeclaredField("consumerIndex"));
            } catch (java.lang.NoSuchFieldException e17) {
                java.lang.InternalError internalError = new java.lang.InternalError();
                internalError.initCause(e17);
                throw internalError;
            }
        } catch (java.lang.NoSuchFieldException e18) {
            java.lang.InternalError internalError2 = new java.lang.InternalError();
            internalError2.initCause(e18);
            throw internalError2;
        }
    }

    public C30141x3e61446f(int i17) {
        int m163295xa94ca879 = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30123x260cfa.m163295xa94ca879(i17);
        long j17 = m163295xa94ca879 - 1;
        E[] eArr = (E[]) new java.lang.Object[m163295xa94ca879 + 1];
        this.f76687x8462da72 = eArr;
        this.f76690x23da319e = j17;
        m163314x1c42bcff(m163295xa94ca879);
        this.f76684xbcf7b3d6 = eArr;
        this.f76685xcdde1402 = j17;
        this.f76688x29b1fef0 = j17 - 1;
        m163327xd393ab64(0L);
    }

    /* renamed from: adjustLookAheadStep */
    private void m163314x1c42bcff(int i17) {
        this.f76689xf1e081dc = java.lang.Math.min(i17 / 4, f76680x53335b4f);
    }

    /* renamed from: calcDirectOffset */
    private static long m163315xe37d90d1(long j17) {
        return f76682xd42c9c63 + (j17 << f76683xd338b673);
    }

    /* renamed from: calcWrappedOffset */
    private static long m163316xc20a8523(long j17, long j18) {
        return m163315xe37d90d1(j17 & j18);
    }

    /* renamed from: lvConsumerIndex */
    private long m163317x221cb112() {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getLongVolatile(this, f76678xea97873c);
    }

    /* renamed from: lvElement */
    private static <E> java.lang.Object m163318x6ec53a12(E[] eArr, long j17) {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getObjectVolatile(eArr, j17);
    }

    /* renamed from: lvNext */
    private E[] m163319xbeef379d(E[] eArr) {
        return (E[]) ((java.lang.Object[]) m163318x6ec53a12(eArr, m163315xe37d90d1(eArr.length - 1)));
    }

    /* renamed from: lvProducerIndex */
    private long m163320x8ba446f6() {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getLongVolatile(this, f76681x62dac44f);
    }

    /* renamed from: newBufferPeek */
    private E m163321xa421577b(E[] eArr, long j17, long j18) {
        this.f76684xbcf7b3d6 = eArr;
        return (E) m163318x6ec53a12(eArr, m163316xc20a8523(j17, j18));
    }

    /* renamed from: newBufferPoll */
    private E m163322xa4217ddf(E[] eArr, long j17, long j18) {
        this.f76684xbcf7b3d6 = eArr;
        long m163316xc20a8523 = m163316xc20a8523(j17, j18);
        E e17 = (E) m163318x6ec53a12(eArr, m163316xc20a8523);
        if (e17 == null) {
            return null;
        }
        m163325xa57c0900(eArr, m163316xc20a8523, null);
        m163324x6a0c1580(j17 + 1);
        return e17;
    }

    /* renamed from: resize */
    private void m163323xc84d9cb4(E[] eArr, long j17, long j18, E e17, long j19) {
        E[] eArr2 = (E[]) new java.lang.Object[eArr.length];
        this.f76687x8462da72 = eArr2;
        this.f76688x29b1fef0 = (j19 + j17) - 1;
        m163325xa57c0900(eArr2, j18, e17);
        m163326xca7e7f6f(eArr, eArr2);
        m163325xa57c0900(eArr, j18, f76679x38cb2198);
        m163327xd393ab64(j17 + 1);
    }

    /* renamed from: soConsumerIndex */
    private void m163324x6a0c1580(long j17) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedLong(this, f76678xea97873c, j17);
    }

    /* renamed from: soElement */
    private static void m163325xa57c0900(java.lang.Object[] objArr, long j17, java.lang.Object obj) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedObject(objArr, j17, obj);
    }

    /* renamed from: soNext */
    private void m163326xca7e7f6f(E[] eArr, E[] eArr2) {
        m163325xa57c0900(eArr, m163315xe37d90d1(eArr.length - 1), eArr2);
    }

    /* renamed from: soProducerIndex */
    private void m163327xd393ab64(long j17) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedLong(this, f76681x62dac44f, j17);
    }

    /* renamed from: writeToQueue */
    private boolean m163328x5c056677(E[] eArr, E e17, long j17, long j18) {
        m163325xa57c0900(eArr, j18, e17);
        m163327xd393ab64(j17 + 1);
        return true;
    }

    @Override // rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30124x96537922
    /* renamed from: currentConsumerIndex */
    public long mo163296x17b49d83() {
        return m163317x221cb112();
    }

    @Override // rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.InterfaceC30124x96537922
    /* renamed from: currentProducerIndex */
    public long mo163297x813c3367() {
        return m163320x8ba446f6();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.f76687x8462da72;
        long j17 = this.f76691x57395460;
        long j18 = this.f76690x23da319e;
        long m163316xc20a8523 = m163316xc20a8523(j17, j18);
        if (j17 < this.f76688x29b1fef0) {
            return m163328x5c056677(eArr, e17, j17, m163316xc20a8523);
        }
        long j19 = this.f76689xf1e081dc + j17;
        if (m163318x6ec53a12(eArr, m163316xc20a8523(j19, j18)) == null) {
            this.f76688x29b1fef0 = j19 - 1;
            return m163328x5c056677(eArr, e17, j17, m163316xc20a8523);
        }
        if (m163318x6ec53a12(eArr, m163316xc20a8523(1 + j17, j18)) != null) {
            return m163328x5c056677(eArr, e17, j17, m163316xc20a8523);
        }
        m163323xc84d9cb4(eArr, j17, m163316xc20a8523, e17, j18);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.f76684xbcf7b3d6;
        long j17 = this.f76686xedb1be7c;
        long j18 = this.f76685xcdde1402;
        E e17 = (E) m163318x6ec53a12(eArr, m163316xc20a8523(j17, j18));
        return e17 == f76679x38cb2198 ? m163321xa421577b(m163319xbeef379d(eArr), j17, j18) : e17;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.f76684xbcf7b3d6;
        long j17 = this.f76686xedb1be7c;
        long j18 = this.f76685xcdde1402;
        long m163316xc20a8523 = m163316xc20a8523(j17, j18);
        E e17 = (E) m163318x6ec53a12(eArr, m163316xc20a8523);
        boolean z17 = e17 == f76679x38cb2198;
        if (e17 == null || z17) {
            if (z17) {
                return m163322xa4217ddf(m163319xbeef379d(eArr), j17, j18);
            }
            return null;
        }
        m163325xa57c0900(eArr, m163316xc20a8523, null);
        m163324x6a0c1580(j17 + 1);
        return e17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long m163317x221cb112 = m163317x221cb112();
        while (true) {
            long m163320x8ba446f6 = m163320x8ba446f6();
            long m163317x221cb1122 = m163317x221cb112();
            if (m163317x221cb112 == m163317x221cb1122) {
                return (int) (m163320x8ba446f6 - m163317x221cb1122);
            }
            m163317x221cb112 = m163317x221cb1122;
        }
    }
}
