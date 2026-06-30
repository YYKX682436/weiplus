package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public class Camera2PhysicalCameraInfoImpl implements androidx.camera.core.CameraInfo {
    private final androidx.camera.camera2.interop.Camera2CameraInfo mCamera2CameraInfo = new androidx.camera.camera2.interop.Camera2CameraInfo(this);
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final java.lang.String mCameraId;

    public Camera2PhysicalCameraInfoImpl(java.lang.String str, androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat) {
        this.mCameraId = str;
        this.mCameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
    }

    public androidx.camera.camera2.interop.Camera2CameraInfo getCamera2CameraInfo() {
        return this.mCamera2CameraInfo;
    }

    public androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.mCameraCharacteristicsCompat;
    }

    public java.lang.String getCameraId() {
        return this.mCameraId;
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.camera.core.CameraSelector getCameraSelector() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getCameraState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.camera.core.ExposureState getExposureState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public java.lang.String getImplementationType() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public float getIntrinsicZoomRatio() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
        m3.h.b(num != null, "Unable to get the lens facing of the camera.");
        return androidx.camera.camera2.internal.LensFacingUtil.getCameraSelectorLensFacing(num.intValue());
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<androidx.camera.core.CameraInfo> getPhysicalCameraInfos() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    public int getSensorOrientation() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return num.intValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getTorchState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getZoomState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<androidx.camera.core.DynamicRange> querySupportedDynamicRanges(java.util.Set<androidx.camera.core.DynamicRange> set) {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i17) {
        return androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i17), getSensorOrientation(), 1 == getLensFacing());
    }
}
