package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes14.dex */
class DynamicRangesCompatApi33Impl implements androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    private final android.hardware.camera2.params.DynamicRangeProfiles mDynamicRangeProfiles;

    public DynamicRangesCompatApi33Impl(java.lang.Object obj) {
        this.mDynamicRangeProfiles = (android.hardware.camera2.params.DynamicRangeProfiles) obj;
    }

    private java.lang.Long dynamicRangeToFirstSupportedProfile(androidx.camera.core.DynamicRange dynamicRange) {
        return androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, this.mDynamicRangeProfiles);
    }

    private static java.util.Set<androidx.camera.core.DynamicRange> profileSetToDynamicRangeSet(java.util.Set<java.lang.Long> set) {
        if (set.isEmpty()) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet(set.size());
        java.util.Iterator<java.lang.Long> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(profileToDynamicRange(it.next().longValue()));
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    private static androidx.camera.core.DynamicRange profileToDynamicRange(long j17) {
        androidx.camera.core.DynamicRange profileToDynamicRange = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.profileToDynamicRange(j17);
        m3.h.d(profileToDynamicRange, "Dynamic range profile cannot be converted to a DynamicRange object: " + j17);
        return profileToDynamicRange;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange) {
        java.lang.Long dynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        m3.h.b(dynamicRangeToFirstSupportedProfile != null, "DynamicRange is not supported: " + dynamicRange);
        return profileSetToDynamicRangeSet(this.mDynamicRangeProfiles.getProfileCaptureRequestConstraints(dynamicRangeToFirstSupportedProfile.longValue()));
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return profileSetToDynamicRangeSet(this.mDynamicRangeProfiles.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange) {
        java.lang.Long dynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        m3.h.b(dynamicRangeToFirstSupportedProfile != null, "DynamicRange is not supported: " + dynamicRange);
        return this.mDynamicRangeProfiles.isExtraLatencyPresent(dynamicRangeToFirstSupportedProfile.longValue());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public android.hardware.camera2.params.DynamicRangeProfiles unwrap() {
        return this.mDynamicRangeProfiles;
    }
}
