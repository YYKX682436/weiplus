package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl */
/* loaded from: classes14.dex */
public class C0351x201dda7 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5 {

    /* renamed from: MAX_SHARED_SURFACES_COUNT_FIELD */
    private static final java.lang.String f665x5210f750 = "MAX_SURFACES_COUNT";

    /* renamed from: SURFACES_FIELD */
    private static final java.lang.String f666x3ad780c1 = "mSurfaces";

    /* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 */
    /* loaded from: classes14.dex */
    public static final class OutputConfigurationParamsApi26 {

        /* renamed from: mDynamicRangeProfile */
        long f667x3bb3d5de = 1;

        /* renamed from: mOutputConfiguration */
        final android.hardware.camera2.params.OutputConfiguration f668x378c03c8;

        /* renamed from: mPhysicalCameraId */
        java.lang.String f669x11acdfa4;

        public OutputConfigurationParamsApi26(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
            this.f668x378c03c8 = outputConfiguration;
        }

        /* renamed from: equals */
        public boolean m3874xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26)) {
                return false;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26) obj;
            return java.util.Objects.equals(this.f668x378c03c8, outputConfigurationParamsApi26.f668x378c03c8) && this.f667x3bb3d5de == outputConfigurationParamsApi26.f667x3bb3d5de && java.util.Objects.equals(this.f669x11acdfa4, outputConfigurationParamsApi26.f669x11acdfa4);
        }

        /* renamed from: hashCode */
        public int m3875x8cdac1b() {
            int hashCode = this.f668x378c03c8.hashCode() ^ 31;
            int i17 = (hashCode << 5) - hashCode;
            java.lang.String str = this.f669x11acdfa4;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i17;
            return java.lang.Long.hashCode(this.f667x3bb3d5de) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public C0351x201dda7(android.view.Surface surface) {
        this(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26(new android.hardware.camera2.params.OutputConfiguration(surface)));
    }

    /* renamed from: getMaxSharedSurfaceCountApi26 */
    private static int m3871x7d3cbea9() {
        java.lang.reflect.Field declaredField = android.hardware.camera2.params.OutputConfiguration.class.getDeclaredField(f665x5210f750);
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    /* renamed from: getMutableSurfaceListApi26 */
    private static java.util.List<android.view.Surface> m3872xb4c0b0c3(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        java.lang.reflect.Field declaredField = android.hardware.camera2.params.OutputConfiguration.class.getDeclaredField(f666x3ad780c1);
        declaredField.setAccessible(true);
        return (java.util.List) declaredField.get(outputConfiguration);
    }

    /* renamed from: wrap */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7 m3873x37d04a(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26(outputConfiguration));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: addSurface */
    public void mo3851x34744cc(android.view.Surface surface) {
        ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).addSurface(surface);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: enableSurfaceSharing */
    public void mo3852x7847ffd2() {
        ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).enableSurfaceSharing();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getDynamicRangeProfile */
    public long mo3853xa947a455() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26) this.f672x126cca0c).f667x3bb3d5de;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getMaxSharedSurfaceCount */
    public int mo3854xc1a40c35() {
        try {
            return m3871x7d3cbea9();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e("OutputConfigCompat", "Unable to retrieve max shared surface count.", e17);
            return super.mo3854xc1a40c35();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getOutputConfiguration */
    public java.lang.Object mo3856xa51fd23f() {
        m3.h.a(this.f672x126cca0c instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26);
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26) this.f672x126cca0c).f668x378c03c8;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo3857x936d7c8d() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26) this.f672x126cca0c).f669x11acdfa4;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getSurfaces */
    public java.util.List<android.view.Surface> mo3861x1b8de6dc() {
        return ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).getSurfaces();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8
    /* renamed from: isSurfaceSharingEnabled */
    public final boolean mo3868x50249c8() {
        throw new java.lang.AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: removeSurface */
    public void mo3862xd8cbaf89(android.view.Surface surface) {
        if (mo3859xcf572877() == surface) {
            throw new java.lang.IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        try {
            if (m3872xb4c0b0c3((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).remove(surface)) {
            } else {
                throw new java.lang.IllegalArgumentException("Surface is not part of this output configuration");
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e("OutputConfigCompat", "Unable to remove surface from this output configuration.", e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setDynamicRangeProfile */
    public void mo3863xf78c63c9(long j17) {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26) this.f672x126cca0c).f667x3bb3d5de = j17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setPhysicalCameraId */
    public void mo3865x376a1199(java.lang.String str) {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26) this.f672x126cca0c).f669x11acdfa4 = str;
    }

    public C0351x201dda7(int i17, android.view.Surface surface) {
        this(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.OutputConfigurationParamsApi26(new android.hardware.camera2.params.OutputConfiguration(i17, surface)));
    }

    public C0351x201dda7(java.lang.Object obj) {
        super(obj);
    }
}
