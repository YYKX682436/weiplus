package ur0;

/* loaded from: classes14.dex */
public final class i extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f511833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ur0.s f511834b;

    public i(int i17, ur0.s sVar) {
        this.f511833a = i17;
        this.f511834b = sVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.view.Surface target, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        super.onCaptureBufferLost(session, request, target, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureBufferLost request:" + request);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureCompleted");
        super.onCaptureCompleted(session, request, result);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "handleAFResult");
        java.lang.Integer num = (java.lang.Integer) result.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "STATE_TOUCH_FOCUSING and state is  " + result.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE));
            ur0.s sVar = this.f511834b;
            android.hardware.camera2.CaptureRequest.Builder builder = sVar.f511865v;
            if (builder != null) {
                builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            android.hardware.camera2.CaptureRequest.Builder builder2 = sVar.f511865v;
            if (builder2 != null) {
                builder2.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            }
            sVar.O();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureFailure failure) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failure, "failure");
        super.onCaptureFailed(session, request, failure);
        as0.a.f94958a.b(this.f511833a, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera2Impl", "onCaptureFailed request:" + request);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(partialResult, "partialResult");
        super.onCaptureProgressed(session, request, partialResult);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureProgressed request:" + request);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession session, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        super.onCaptureSequenceAborted(session, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureSequenceAborted");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession session, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        super.onCaptureSequenceCompleted(session, i17, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureSequenceCompleted sequenceId:" + i17);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureStarted");
        super.onCaptureStarted(session, request, j17, j18);
    }
}
