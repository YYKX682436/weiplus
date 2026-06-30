package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraCharacteristicsBaseImpl implements androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl {
    protected final android.hardware.camera2.CameraCharacteristics mCameraCharacteristics;

    public CameraCharacteristicsBaseImpl(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        return (T) this.mCameraCharacteristics.get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public java.util.Set<java.lang.String> getPhysicalCameraIds() {
        return java.util.Collections.emptySet();
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public android.hardware.camera2.CameraCharacteristics unwrap() {
        return this.mCameraCharacteristics;
    }
}
