package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rx.internal.util.unsafe.SpmcArrayQueueConsumerField */
/* loaded from: classes16.dex */
public abstract class AbstractC30126xcee8a8f9<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30128x103b74c2<E> {

    /* renamed from: C_INDEX_OFFSET */
    protected static final long f76666xea97873c = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163330x342078eb(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30126xcee8a8f9.class, "consumerIndex");

    /* renamed from: consumerIndex */
    private volatile long f76667xedb1be7c;

    public AbstractC30126xcee8a8f9(int i17) {
        super(i17);
    }

    /* renamed from: casHead */
    public final boolean m163299x2105cf55(long j17, long j18) {
        return rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.compareAndSwapLong(this, f76666xea97873c, j17, j18);
    }

    /* renamed from: lvConsumerIndex */
    public final long m163300x221cb112() {
        return this.f76667xedb1be7c;
    }
}
