package jo5;

/* loaded from: classes14.dex */
public final class a extends android.hardware.camera2.CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jo5.b f382457a;

    public a(jo5.b bVar) {
        this.f382457a = bVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(android.hardware.camera2.CameraDevice camera) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusClosed;
        jo5.b bVar = this.f382457a;
        bVar.f382463f = eVar;
        bVar.f382464g.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(android.hardware.camera2.CameraDevice camera) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        jo5.b bVar = this.f382457a;
        java.lang.String str = bVar.f382459b;
        camera.close();
        bVar.f382462e = null;
        bVar.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusDisconnected;
        bVar.f382464g.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(android.hardware.camera2.CameraDevice camera, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        jo5.b bVar = this.f382457a;
        java.lang.String str = bVar.f382459b;
        camera.close();
        bVar.f382462e = null;
        if (i17 == 1 || i17 == 3) {
            bVar.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusDisconnected;
        } else {
            bVar.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusClosed;
        }
        bVar.f382464g.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(android.hardware.camera2.CameraDevice camera) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        jo5.b bVar = this.f382457a;
        bVar.f382462e = camera;
        bVar.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusOpened;
        bVar.f382465h = true;
        bVar.f382464g.release();
    }
}
