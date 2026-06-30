package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.MpmcArrayQueueProducerField */
/* loaded from: classes16.dex */
abstract class AbstractC30121xe089da57<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30119x3e3cb5dd<E> {

    /* renamed from: P_INDEX_OFFSET */
    private static final long f76664x62dac44f = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163330x342078eb(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30121xe089da57.class, "producerIndex");

    /* renamed from: producerIndex */
    private volatile long f76665x57395460;

    public AbstractC30121xe089da57(int i17) {
        super(i17);
    }

    /* renamed from: casProducerIndex */
    public final boolean m163291x4506268b(long j17, long j18) {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.compareAndSwapLong(this, f76664x62dac44f, j17, j18);
    }

    /* renamed from: lvProducerIndex */
    public final long m163292x8ba446f6() {
        return this.f76665x57395460;
    }
}
