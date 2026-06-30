package androidx.camera.camera2.internal.compat.params;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class OutputConfigurationCompatApi28Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl {

    /* loaded from: classes14.dex */
    public static final class OutputConfigurationParamsApi28 {
        long mDynamicRangeProfile = 1;
        final android.hardware.camera2.params.OutputConfiguration mOutputConfiguration;

        public OutputConfigurationParamsApi28(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28 outputConfigurationParamsApi28 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) obj;
            return java.util.Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi28.mOutputConfiguration) && this.mDynamicRangeProfile == outputConfigurationParamsApi28.mDynamicRangeProfile;
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            return java.lang.Long.hashCode(this.mDynamicRangeProfile) ^ ((hashCode << 5) - hashCode);
        }
    }

    public OutputConfigurationCompatApi28Impl(android.view.Surface surface) {
        this(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28(new android.hardware.camera2.params.OutputConfiguration(surface)));
    }

    public static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl wrap(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) this.mObject).mDynamicRangeProfile;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        return ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.Object getOutputConfiguration() {
        m3.h.a(this.mObject instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28);
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) this.mObject).mOutputConfiguration;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.String getPhysicalCameraId() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(android.view.Surface surface) {
        ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j17) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) this.mObject).mDynamicRangeProfile = j17;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(java.lang.String str) {
        ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }

    public OutputConfigurationCompatApi28Impl(int i17, android.view.Surface surface) {
        this(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28(new android.hardware.camera2.params.OutputConfiguration(i17, surface)));
    }

    public OutputConfigurationCompatApi28Impl(java.lang.Object obj) {
        super(obj);
    }
}
