package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef */
/* loaded from: classes16.dex */
abstract class AbstractC30109x76bbf894<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30111xfb642165<E> {

    /* renamed from: C_NODE_OFFSET */
    protected static final long f76649x95a85b74 = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163330x342078eb(rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30109x76bbf894.class, "consumerNode");

    /* renamed from: consumerNode */
    protected v56.b f76650xcddebb18;

    /* renamed from: lpConsumerNode */
    public final v56.b m163265x7a8df6bc() {
        return this.f76650xcddebb18;
    }

    /* renamed from: lvConsumerNode */
    public final v56.b m163266x11a01dc2() {
        return (v56.b) rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.f76693x957dcda6.getObjectVolatile(this, f76649x95a85b74);
    }

    /* renamed from: spConsumerNode */
    public final void m163267xa79e7a15(v56.b bVar) {
        this.f76650xcddebb18 = bVar;
    }
}
