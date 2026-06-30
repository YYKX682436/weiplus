package vs0;

/* loaded from: classes10.dex */
public final class e extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs0.j f521383a;

    public e(vs0.j jVar) {
        this.f521383a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        vs0.c cVar = vs0.c.f521363a;
        android.hardware.camera2.CaptureRequest.Builder builder = this.f521383a.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(builder);
        cVar.e(builder);
    }
}
