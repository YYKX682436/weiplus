package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public final class CameraRequest {
    private final androidx.camera.core.imagecapture.TakePictureCallback mCallback;
    private final java.util.List<androidx.camera.core.impl.CaptureConfig> mCaptureConfigs;

    public CameraRequest(java.util.List<androidx.camera.core.impl.CaptureConfig> list, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback) {
        this.mCaptureConfigs = list;
        this.mCallback = takePictureCallback;
    }

    public java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs() {
        return this.mCaptureConfigs;
    }

    public boolean isAborted() {
        return this.mCallback.isAborted();
    }
}
