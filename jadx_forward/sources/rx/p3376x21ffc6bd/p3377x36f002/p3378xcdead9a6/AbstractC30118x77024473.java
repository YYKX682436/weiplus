package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.MpmcArrayQueueConsumerField */
/* loaded from: classes16.dex */
abstract class AbstractC30118x77024473<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30120x3e3d2a3c<E> {

    /* renamed from: C_INDEX_OFFSET */
    private static final long f76662xea97873c = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163330x342078eb(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30118x77024473.class, "consumerIndex");

    /* renamed from: consumerIndex */
    private volatile long f76663xedb1be7c;

    public AbstractC30118x77024473(int i17) {
        super(i17);
    }

    /* renamed from: casConsumerIndex */
    public final boolean m163288xdb7e90a7(long j17, long j18) {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.compareAndSwapLong(this, f76662xea97873c, j17, j18);
    }

    /* renamed from: lvConsumerIndex */
    public final long m163289x221cb112() {
        return this.f76663xedb1be7c;
    }
}
