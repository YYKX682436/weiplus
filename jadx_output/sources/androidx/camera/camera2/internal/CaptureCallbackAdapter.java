package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class CaptureCallbackAdapter extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    private final androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback;

    public CaptureCallbackAdapter(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback == null) {
            throw new java.lang.NullPointerException("cameraCaptureCallback is null");
        }
        this.mCameraCaptureCallback = cameraCaptureCallback;
    }

    private int getCaptureConfigId(android.hardware.camera2.CaptureRequest captureRequest) {
        java.lang.Integer num;
        if ((captureRequest.getTag() instanceof androidx.camera.core.impl.TagBundle) && (num = (java.lang.Integer) ((androidx.camera.core.impl.TagBundle) captureRequest.getTag()).getTag(androidx.camera.core.impl.CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY)) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.impl.TagBundle emptyBundle;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        java.lang.Object tag = captureRequest.getTag();
        if (tag != null) {
            m3.h.b(tag instanceof androidx.camera.core.impl.TagBundle, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            emptyBundle = (androidx.camera.core.impl.TagBundle) tag;
        } else {
            emptyBundle = androidx.camera.core.impl.TagBundle.emptyBundle();
        }
        this.mCameraCaptureCallback.onCaptureCompleted(getCaptureConfigId(captureRequest), new androidx.camera.camera2.internal.Camera2CameraCaptureResult(emptyBundle, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.mCameraCaptureCallback.onCaptureFailed(getCaptureConfigId(captureRequest), new androidx.camera.core.impl.CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
        this.mCameraCaptureCallback.onCaptureStarted(getCaptureConfigId(captureRequest));
    }
}
