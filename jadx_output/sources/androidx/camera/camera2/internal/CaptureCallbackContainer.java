package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class CaptureCallbackContainer extends androidx.camera.core.impl.CameraCaptureCallback {
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback mCaptureCallback;

    private CaptureCallbackContainer(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new java.lang.NullPointerException("captureCallback is null");
        }
        this.mCaptureCallback = captureCallback;
    }

    public static androidx.camera.camera2.internal.CaptureCallbackContainer create(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return new androidx.camera.camera2.internal.CaptureCallbackContainer(captureCallback);
    }

    public android.hardware.camera2.CameraCaptureSession.CaptureCallback getCaptureCallback() {
        return this.mCaptureCallback;
    }
}
