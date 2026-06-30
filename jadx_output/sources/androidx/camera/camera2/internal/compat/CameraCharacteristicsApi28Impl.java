package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraCharacteristicsApi28Impl extends androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl {
    private static final java.lang.String TAG = "CameraCharacteristicsImpl";

    public CameraCharacteristicsApi28Impl(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public java.util.Set<java.lang.String> getPhysicalCameraIds() {
        try {
            return this.mCameraCharacteristics.getPhysicalCameraIds();
        } catch (java.lang.Exception e17) {
            androidx.camera.core.Logger.e(TAG, "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e17);
            return java.util.Collections.emptySet();
        }
    }
}
