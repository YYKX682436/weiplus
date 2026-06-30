package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class Camera2CameraCaptureFailure extends androidx.camera.core.impl.CameraCaptureFailure {
    private final android.hardware.camera2.CaptureFailure mCaptureFailure;

    public Camera2CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason reason, android.hardware.camera2.CaptureFailure captureFailure) {
        super(reason);
        this.mCaptureFailure = captureFailure;
    }

    @Override // androidx.camera.core.impl.CameraCaptureFailure
    public java.lang.Object getCaptureFailure() {
        return this.mCaptureFailure;
    }
}
