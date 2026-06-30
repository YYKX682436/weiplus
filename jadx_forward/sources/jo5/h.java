package jo5;

/* loaded from: classes14.dex */
public final class h extends android.hardware.camera2.CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jo5.c f382477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.hardware.camera2.CameraDevice f382478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f382479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo5.i f382480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f382481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f382482f;

    public h(jo5.c cVar, android.hardware.camera2.CameraDevice cameraDevice, android.view.Surface surface, jo5.i iVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f382477a = cVar;
        this.f382478b = cameraDevice;
        this.f382479c = surface;
        this.f382480d = iVar;
        this.f382481e = c0Var;
        this.f382482f = countDownLatch;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f382482f.countDown();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        jo5.c cVar = this.f382477a;
        cVar.f382470d = session;
        try {
            android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = this.f382478b.createCaptureRequest(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createCaptureRequest, "createCaptureRequest(...)");
            createCaptureRequest.addTarget(this.f382479c);
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            android.util.Range range = cVar.f382472f;
            if (range == null) {
                range = new android.util.Range(15, 15);
            }
            createCaptureRequest.set(key, range);
            session.setRepeatingRequest(createCaptureRequest.build(), null, this.f382480d.b());
            cVar.f382469c.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusStarted;
            this.f382481e.f391645d = true;
        } catch (java.lang.Exception unused) {
        }
        this.f382482f.countDown();
    }
}
