package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
class ExposureStateImpl implements androidx.camera.core.ExposureState {
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private int mExposureCompensation;
    private final java.lang.Object mLock = new java.lang.Object();

    public ExposureStateImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, int i17) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mExposureCompensation = i17;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i17;
        synchronized (this.mLock) {
            i17 = this.mExposureCompensation;
        }
        return i17;
    }

    @Override // androidx.camera.core.ExposureState
    public android.util.Range<java.lang.Integer> getExposureCompensationRange() {
        return (android.util.Range) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public android.util.Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? android.util.Rational.ZERO : (android.util.Rational) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        android.util.Range range = (android.util.Range) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((java.lang.Integer) range.getLower()).intValue() == 0 || ((java.lang.Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public void setExposureCompensationIndex(int i17) {
        synchronized (this.mLock) {
            this.mExposureCompensation = i17;
        }
    }
}
