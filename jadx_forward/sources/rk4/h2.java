package rk4;

/* loaded from: classes11.dex */
public final class h2 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478218d;

    public h2(rk4.l3 l3Var) {
        this.f478218d = l3Var;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        this.f478218d.f478353h = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventSink, "eventSink");
        if (obj != null && (obj instanceof java.lang.String) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "interruptEvent")) {
            this.f478218d.f478353h = eventSink;
        }
    }
}
