package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef */
/* loaded from: classes16.dex */
abstract class AbstractC30112x9cb5a578<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30110xfb642164<E> {

    /* renamed from: P_NODE_OFFSET */
    protected static final long f76651xb24fb001 = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163330x342078eb(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30112x9cb5a578.class, "producerNode");

    /* renamed from: producerNode */
    protected v56.b f76652x23dad8b4;

    /* renamed from: lpProducerNode */
    public final v56.b m163269xd08a1458() {
        return this.f76652x23dad8b4;
    }

    /* renamed from: lvProducerNode */
    public final v56.b m163270x679c3b5e() {
        return (v56.b) rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getObjectVolatile(this, f76651xb24fb001);
    }

    /* renamed from: spProducerNode */
    public final void m163271xfd9a97b1(v56.b bVar) {
        this.f76652x23dad8b4 = bVar;
    }
}
