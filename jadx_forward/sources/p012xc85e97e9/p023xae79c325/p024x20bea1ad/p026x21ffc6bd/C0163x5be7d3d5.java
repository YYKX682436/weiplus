package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2CaptureCallbacks */
/* loaded from: classes14.dex */
public final class C0163x5be7d3d5 {

    /* renamed from: androidx.camera.camera2.internal.Camera2CaptureCallbacks$ComboSessionCaptureCallback */
    /* loaded from: classes14.dex */
    public static final class ComboSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

        /* renamed from: mCallbacks */
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> f283x3c7f32e1 = new java.util.ArrayList();

        public ComboSessionCaptureCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
            for (android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback : list) {
                if (!(captureCallback instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0163x5be7d3d5.NoOpSessionCaptureCallback)) {
                    this.f283x3c7f32e1.add(captureCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.f283x3c7f32e1.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api24Impl.m3691xf66d3f4b(it.next(), cameraCaptureSession, captureRequest, surface, j17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.f283x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.f283x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.f283x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.f283x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceAborted(cameraCaptureSession, i17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.f283x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceCompleted(cameraCaptureSession, i17, j17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.f283x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CaptureCallbacks$NoOpSessionCaptureCallback */
    /* loaded from: classes14.dex */
    public static final class NoOpSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
        }
    }

    private C0163x5be7d3d5() {
    }

    /* renamed from: createComboCallback */
    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback m3197x20225057(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0163x5be7d3d5.ComboSessionCaptureCallback(list);
    }

    /* renamed from: createNoOpCallback */
    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback m3199x8e6ae903() {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0163x5be7d3d5.NoOpSessionCaptureCallback();
    }

    /* renamed from: createComboCallback */
    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback m3198x20225057(android.hardware.camera2.CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return m3197x20225057((java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>) java.util.Arrays.asList(captureCallbackArr));
    }
}
