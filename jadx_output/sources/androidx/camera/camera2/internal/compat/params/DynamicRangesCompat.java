package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes14.dex */
public final class DynamicRangesCompat {
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl mImpl;

    /* loaded from: classes14.dex */
    public interface DynamicRangeProfilesCompatImpl {
        java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange);

        java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

        boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange);

        android.hardware.camera2.params.DynamicRangeProfiles unwrap();
    }

    public DynamicRangesCompat(androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl dynamicRangeProfilesCompatImpl) {
        this.mImpl = dynamicRangeProfilesCompatImpl;
    }

    public static androidx.camera.camera2.internal.compat.params.DynamicRangesCompat fromCameraCharacteristics(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        androidx.camera.camera2.internal.compat.params.DynamicRangesCompat dynamicRangesCompat = android.os.Build.VERSION.SDK_INT >= 33 ? toDynamicRangesCompat((android.hardware.camera2.params.DynamicRangeProfiles) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) : null;
        return dynamicRangesCompat == null ? androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl.COMPAT_INSTANCE : dynamicRangesCompat;
    }

    public static androidx.camera.camera2.internal.compat.params.DynamicRangesCompat toDynamicRangesCompat(android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        m3.h.e(android.os.Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new androidx.camera.camera2.internal.compat.params.DynamicRangesCompat(new androidx.camera.camera2.internal.compat.params.DynamicRangesCompatApi33Impl(dynamicRangeProfiles));
    }

    public java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange) {
        return this.mImpl.getDynamicRangeCaptureRequestConstraints(dynamicRange);
    }

    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return this.mImpl.getSupportedDynamicRanges();
    }

    public boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange) {
        return this.mImpl.isExtraLatencyPresent(dynamicRange);
    }

    public android.hardware.camera2.params.DynamicRangeProfiles toDynamicRangeProfiles() {
        m3.h.e(android.os.Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.mImpl.unwrap();
    }
}
