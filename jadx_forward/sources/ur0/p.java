package ur0;

/* loaded from: classes14.dex */
public final class p extends android.hardware.camera2.CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur0.s f511854a;

    public p(ur0.s sVar) {
        this.f511854a = sVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        super.onClosed(session);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "sessionCallback onClosed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera2Impl", "sessionCallback onConfigureFailed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "sessionCallback onConfigured");
        ur0.s sVar = this.f511854a;
        nr0.y yVar = sVar.f492966g;
        if (yVar != null) {
            ((pr0.n) yVar).m("afterSessionFinishToPreview", new ur0.o(sVar, session, null));
        }
    }
}
