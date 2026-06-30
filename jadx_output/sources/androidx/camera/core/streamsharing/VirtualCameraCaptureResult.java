package androidx.camera.core.streamsharing;

/* loaded from: classes14.dex */
public class VirtualCameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
    private static final long INVALID_TIMESTAMP = -1;
    private final androidx.camera.core.impl.CameraCaptureResult mBaseCameraCaptureResult;
    private final androidx.camera.core.impl.TagBundle mTagBundle;
    private final long mTimestamp;

    public VirtualCameraCaptureResult(androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        this(cameraCaptureResult, tagBundle, -1L);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AeMode getAeMode() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeMode() : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeState() : androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfMode() : androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfState() : androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbMode getAwbMode() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbMode() : androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbState() : androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getFlashState() : androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j17 = this.mTimestamp;
        if (j17 != -1) {
            return j17;
        }
        throw new java.lang.IllegalStateException("No timestamp is available.");
    }

    public VirtualCameraCaptureResult(androidx.camera.core.impl.TagBundle tagBundle, long j17) {
        this(null, tagBundle, j17);
    }

    private VirtualCameraCaptureResult(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult, androidx.camera.core.impl.TagBundle tagBundle, long j17) {
        this.mBaseCameraCaptureResult = cameraCaptureResult;
        this.mTagBundle = tagBundle;
        this.mTimestamp = j17;
    }
}
