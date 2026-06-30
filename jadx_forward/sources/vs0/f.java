package vs0;

/* loaded from: classes10.dex */
public final class f extends vs0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs0.j f521384a;

    public f(vs0.j jVar) {
        this.f521384a = jVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(android.hardware.camera2.CameraDevice camera) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        vs0.j jVar = this.f521384a;
        jVar.B.release();
        camera.close();
        jVar.D = null;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(android.hardware.camera2.CameraDevice camera, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        onDisconnected(camera);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(android.hardware.camera2.CameraDevice camera) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        vs0.j jVar = this.f521384a;
        jVar.B.release();
        jVar.D = camera;
    }
}
