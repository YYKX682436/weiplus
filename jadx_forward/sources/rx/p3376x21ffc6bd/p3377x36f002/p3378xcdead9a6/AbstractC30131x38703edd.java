package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.SpmcArrayQueueProducerField */
/* loaded from: classes16.dex */
abstract class AbstractC30131x38703edd<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30127x103b0063<E> {

    /* renamed from: P_INDEX_OFFSET */
    protected static final long f76668x62dac44f = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163330x342078eb(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30131x38703edd.class, "producerIndex");

    /* renamed from: producerIndex */
    private volatile long f76669x57395460;

    public AbstractC30131x38703edd(int i17) {
        super(i17);
    }

    /* renamed from: lvProducerIndex */
    public final long m163302x8ba446f6() {
        return this.f76669x57395460;
    }

    /* renamed from: soTail */
    public final void m163303xca8128cc(long j17) {
        rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.putOrderedLong(this, f76668x62dac44f, j17);
    }
}
