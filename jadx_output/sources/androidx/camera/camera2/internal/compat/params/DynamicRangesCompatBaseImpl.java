package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes14.dex */
class DynamicRangesCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    static final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat COMPAT_INSTANCE = new androidx.camera.camera2.internal.compat.params.DynamicRangesCompat(new androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl());
    private static final java.util.Set<androidx.camera.core.DynamicRange> SDR_ONLY = java.util.Collections.singleton(androidx.camera.core.DynamicRange.SDR);

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange) {
        m3.h.b(androidx.camera.core.DynamicRange.SDR.equals(dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange) {
        m3.h.b(androidx.camera.core.DynamicRange.SDR.equals(dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public android.hardware.camera2.params.DynamicRangeProfiles unwrap() {
        return null;
    }
}
