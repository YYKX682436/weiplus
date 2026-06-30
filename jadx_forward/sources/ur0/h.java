package ur0;

/* loaded from: classes14.dex */
public final class h extends vs0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur0.s f511831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f511832b;

    public h(ur0.s sVar, int i17) {
        this.f511831a = sVar;
        this.f511832b = i17;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(android.hardware.camera2.CameraDevice camera) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera2Impl", "sessionCallback onDisconnected " + camera.hashCode());
        ur0.s sVar = this.f511831a;
        nr0.y yVar = sVar.f492966g;
        if (yVar != null) {
            ((pr0.n) yVar).m("Camera2Close", new ur0.e(camera, sVar, null));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(android.hardware.camera2.CameraDevice camera, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera2Impl", "sessionCallback onError:" + i17);
        as0.a.f94958a.b(this.f511832b, false);
        ur0.s sVar = this.f511831a;
        nr0.y yVar = sVar.f492966g;
        if (yVar != null) {
            ((pr0.n) yVar).m("Camera2Close", new ur0.f(camera, sVar, null));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(android.hardware.camera2.CameraDevice camera) {
        ur0.s sVar;
        nr0.y yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "sessionCallback onOpened " + camera.hashCode());
        if (this.f511831a.f492970n.f537693b.f537708a.f537706a > 0 && (yVar = (sVar = this.f511831a).f492966g) != null) {
            ((pr0.n) yVar).m("createCaptureSession", new ur0.g(camera, sVar, null));
        }
    }
}
