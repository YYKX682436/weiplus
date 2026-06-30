package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks */
/* loaded from: classes14.dex */
public final class C0206x8fafb1b2 {

    /* renamed from: androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks$ComboSessionStateCallback */
    /* loaded from: classes14.dex */
    public static final class ComboSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {

        /* renamed from: mCallbacks */
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> f355x3c7f32e1 = new java.util.ArrayList();

        public ComboSessionStateCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
            for (android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0206x8fafb1b2.NoOpSessionStateCallback)) {
                    this.f355x3c7f32e1.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.f355x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.f355x3c7f32e1.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api26Impl.m3693xf5ec0e83(it.next(), cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.f355x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.f355x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.f355x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.f355x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.f355x3c7f32e1.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api23Impl.m3690xa39a382b(it.next(), cameraCaptureSession, surface);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks$NoOpSessionStateCallback */
    /* loaded from: classes14.dex */
    public static final class NoOpSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
        }
    }

    private C0206x8fafb1b2() {
    }

    /* renamed from: createComboCallback */
    public static android.hardware.camera2.CameraCaptureSession.StateCallback m3302x20225057(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return m3304x8e6ae903();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0206x8fafb1b2.ComboSessionStateCallback(list);
    }

    /* renamed from: createNoOpCallback */
    public static android.hardware.camera2.CameraCaptureSession.StateCallback m3304x8e6ae903() {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0206x8fafb1b2.NoOpSessionStateCallback();
    }

    /* renamed from: createComboCallback */
    public static android.hardware.camera2.CameraCaptureSession.StateCallback m3303x20225057(android.hardware.camera2.CameraCaptureSession.StateCallback... stateCallbackArr) {
        return m3302x20225057((java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback>) java.util.Arrays.asList(stateCallbackArr));
    }
}
