package vs0;

/* loaded from: classes10.dex */
public final class h extends android.hardware.camera2.CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs0.j f521386a;

    public h(vs0.j jVar) {
        this.f521386a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        super.onClosed(session);
        vs0.j jVar = this.f521386a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f521390y, "session on close");
        jVar.K = true;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f521386a.f521390y, "configure failed ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 5L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenFailed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1099L, 2L, 1L);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        vs0.j jVar = this.f521386a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f521390y, "session on onConfigured");
        if (jVar.D == null) {
            return;
        }
        jVar.K = false;
        jVar.F = session;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenSuccess");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(985L, 4L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenSuccess");
        g0Var.C(1099L, 1L, 1L);
        try {
            android.hardware.camera2.CaptureRequest.Builder builder = jVar.E;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(builder);
            android.hardware.camera2.CaptureRequest build = builder.build();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
            jVar.G = build;
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = jVar.F;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(build, jVar.T, jVar.f503056e.f511982c);
            }
        } catch (android.hardware.camera2.CameraAccessException unused) {
        }
    }
}
