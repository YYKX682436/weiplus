package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraCaptureSessionCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {
    final android.hardware.camera2.CameraCaptureSession mCameraCaptureSession;
    final java.lang.Object mObject;

    /* loaded from: classes14.dex */
    public static class CameraCaptureSessionCompatParamsApi21 {
        final android.os.Handler mCompatHandler;

        public CameraCaptureSessionCompatParamsApi21(android.os.Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public CameraCaptureSessionCompatBaseImpl(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, java.lang.Object obj) {
        cameraCaptureSession.getClass();
        this.mCameraCaptureSession = cameraCaptureSession;
        this.mObject = obj;
    }

    public static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl create(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.os.Handler handler) {
        return new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl(cameraCaptureSession, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.captureBurst(list, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.capture(captureRequest, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.setRepeatingBurst(list, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.setRepeatingRequest(captureRequest, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public android.hardware.camera2.CameraCaptureSession unwrap() {
        return this.mCameraCaptureSession;
    }
}
