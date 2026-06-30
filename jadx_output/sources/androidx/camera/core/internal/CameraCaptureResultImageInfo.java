package androidx.camera.core.internal;

/* loaded from: classes14.dex */
public final class CameraCaptureResultImageInfo implements androidx.camera.core.ImageInfo {
    private final androidx.camera.core.impl.CameraCaptureResult mCameraCaptureResult;

    public CameraCaptureResultImageInfo(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        this.mCameraCaptureResult = cameraCaptureResult;
    }

    public androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
        return this.mCameraCaptureResult;
    }

    @Override // androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
        return 0;
    }

    @Override // androidx.camera.core.ImageInfo
    public android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return new android.graphics.Matrix();
    }

    @Override // androidx.camera.core.ImageInfo
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.mCameraCaptureResult.getTagBundle();
    }

    @Override // androidx.camera.core.ImageInfo
    public long getTimestamp() {
        return this.mCameraCaptureResult.getTimestamp();
    }

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
        this.mCameraCaptureResult.populateExifData(builder);
    }
}
