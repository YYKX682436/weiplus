package v03;

/* loaded from: classes11.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v03.b f513831d;

    public a(v03.b bVar) {
        this.f513831d = bVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        this.f513831d.f513836h = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventSink, "eventSink");
        this.f513831d.f513836h = eventSink;
    }
}
