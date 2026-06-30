package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.ConcurrentSequencedCircularArrayQueue */
/* loaded from: classes16.dex */
public abstract class AbstractC30115x788c1803<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30113x9498046e<E> {

    /* renamed from: ARRAY_BASE */
    private static final long f76659xd65fb917;

    /* renamed from: ELEMENT_SHIFT */
    private static final int f76660xcd31ed3f;

    /* renamed from: sequenceBuffer */
    protected final long[] f76661x9ace6361;

    static {
        if (8 != rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.arrayIndexScale(long[].class)) {
            throw new java.lang.IllegalStateException("Unexpected long[] element size");
        }
        f76660xcd31ed3f = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30113x9498046e.f76656x21811d83 + 3;
        f76659xd65fb917 = r0.arrayBaseOffset(long[].class) + (32 << (r3 - r2));
    }

    public AbstractC30115x788c1803(int i17) {
        super(i17);
        int i18 = (int) (this.f76658x3306ec + 1);
        this.f76661x9ace6361 = new long[(i18 << rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30113x9498046e.f76656x21811d83) + 64];
        for (long j17 = 0; j17 < i18; j17++) {
            m163286x5af4ce3d(this.f76661x9ace6361, m163284xf29c4169(j17), j17);
        }
    }

    /* renamed from: calcSequenceOffset */
    public final long m163284xf29c4169(long j17) {
        return f76659xd65fb917 + ((j17 & this.f76658x3306ec) << f76660xcd31ed3f);
    }

    /* renamed from: lvSequence */
    public final long m163285xbad1bf6b(long[] jArr, long j17) {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getLongVolatile(jArr, j17);
    }

    /* renamed from: soSequence */
    public final void m163286x5af4ce3d(long[] jArr, long j17, long j18) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedLong(jArr, j17, j18);
    }
}
