package androidx.camera.camera2.internal.compat.params;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class OutputConfigurationCompatApi24Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl {

    /* loaded from: classes14.dex */
    public static final class OutputConfigurationParamsApi24 {
        long mDynamicRangeProfile = 1;
        boolean mIsShared;
        final android.hardware.camera2.params.OutputConfiguration mOutputConfiguration;
        java.lang.String mPhysicalCameraId;

        public OutputConfigurationParamsApi24(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24 outputConfigurationParamsApi24 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) obj;
            return java.util.Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi24.mOutputConfiguration) && this.mIsShared == outputConfigurationParamsApi24.mIsShared && this.mDynamicRangeProfile == outputConfigurationParamsApi24.mDynamicRangeProfile && java.util.Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi24.mPhysicalCameraId);
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i17 = (this.mIsShared ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i18 = (i17 << 5) - i17;
            java.lang.String str = this.mPhysicalCameraId;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i18;
            return java.lang.Long.hashCode(this.mDynamicRangeProfile) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public OutputConfigurationCompatApi24Impl(android.view.Surface surface) {
        this(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24(new android.hardware.camera2.params.OutputConfiguration(surface)));
    }

    public static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl wrap(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mIsShared = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mDynamicRangeProfile;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.Object getOutputConfiguration() {
        m3.h.a(this.mObject instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24);
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mOutputConfiguration;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.String getPhysicalCameraId() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public android.view.Surface getSurface() {
        return ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
        return ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.util.List<android.view.Surface> getSurfaces() {
        return java.util.Collections.singletonList(getSurface());
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public boolean isSurfaceSharingEnabled() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mIsShared;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j17) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mDynamicRangeProfile = j17;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(java.lang.String str) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId = str;
    }

    public OutputConfigurationCompatApi24Impl(int i17, android.view.Surface surface) {
        this(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24(new android.hardware.camera2.params.OutputConfiguration(i17, surface)));
    }

    public OutputConfigurationCompatApi24Impl(java.lang.Object obj) {
        super(obj);
    }
}
