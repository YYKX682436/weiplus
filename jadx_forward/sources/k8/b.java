package k8;

/* loaded from: classes15.dex */
public class b implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k8.c f386385e;

    public b(k8.c cVar, android.app.Activity activity) {
        this.f386385e = cVar;
        this.f386384d = activity;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        k8.c cVar = this.f386385e;
        android.view.OrientationEventListener orientationEventListener = cVar.f386389g;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            cVar.f386389g = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        k8.a aVar = new k8.a(this, this.f386384d, eventSink);
        k8.c cVar = this.f386385e;
        cVar.f386389g = aVar;
        if (cVar.f386389g.canDetectOrientation()) {
            cVar.f386389g.enable();
        } else {
            eventSink.mo138417x5c4d208("SensorError", "Cannot detect sensors. Not enabled", null);
        }
    }
}
