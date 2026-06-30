package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl */
/* loaded from: classes14.dex */
public class C0350x1e5aea5 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8 {

    /* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 */
    /* loaded from: classes14.dex */
    public static final class OutputConfigurationParamsApi24 {

        /* renamed from: mDynamicRangeProfile */
        long f661x3bb3d5de = 1;

        /* renamed from: mIsShared */
        boolean f662x174f45bc;

        /* renamed from: mOutputConfiguration */
        final android.hardware.camera2.params.OutputConfiguration f663x378c03c8;

        /* renamed from: mPhysicalCameraId */
        java.lang.String f664x11acdfa4;

        public OutputConfigurationParamsApi24(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
            this.f663x378c03c8 = outputConfiguration;
        }

        /* renamed from: equals */
        public boolean m3869xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24)) {
                return false;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24 outputConfigurationParamsApi24 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) obj;
            return java.util.Objects.equals(this.f663x378c03c8, outputConfigurationParamsApi24.f663x378c03c8) && this.f662x174f45bc == outputConfigurationParamsApi24.f662x174f45bc && this.f661x3bb3d5de == outputConfigurationParamsApi24.f661x3bb3d5de && java.util.Objects.equals(this.f664x11acdfa4, outputConfigurationParamsApi24.f664x11acdfa4);
        }

        /* renamed from: hashCode */
        public int m3870x8cdac1b() {
            int hashCode = this.f663x378c03c8.hashCode() ^ 31;
            int i17 = (this.f662x174f45bc ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i18 = (i17 << 5) - i17;
            java.lang.String str = this.f664x11acdfa4;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i18;
            return java.lang.Long.hashCode(this.f661x3bb3d5de) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public C0350x1e5aea5(android.view.Surface surface) {
        this(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24(new android.hardware.camera2.params.OutputConfiguration(surface)));
    }

    /* renamed from: wrap */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5 m3867x37d04a(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24(outputConfiguration));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: enableSurfaceSharing */
    public void mo3852x7847ffd2() {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) this.f672x126cca0c).f662x174f45bc = true;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getDynamicRangeProfile */
    public long mo3853xa947a455() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) this.f672x126cca0c).f661x3bb3d5de;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getOutputConfiguration */
    public java.lang.Object mo3856xa51fd23f() {
        m3.h.a(this.f672x126cca0c instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24);
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) this.f672x126cca0c).f663x378c03c8;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo3857x936d7c8d() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) this.f672x126cca0c).f664x11acdfa4;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getSurface */
    public android.view.Surface mo3859xcf572877() {
        return ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).getSurface();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getSurfaceGroupId */
    public int mo3860x7e2da783() {
        return ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).getSurfaceGroupId();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getSurfaces */
    public java.util.List<android.view.Surface> mo3861x1b8de6dc() {
        return java.util.Collections.singletonList(mo3859xcf572877());
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8
    /* renamed from: isSurfaceSharingEnabled */
    public boolean mo3868x50249c8() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) this.f672x126cca0c).f662x174f45bc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setDynamicRangeProfile */
    public void mo3863xf78c63c9(long j17) {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) this.f672x126cca0c).f661x3bb3d5de = j17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setPhysicalCameraId */
    public void mo3865x376a1199(java.lang.String str) {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24) this.f672x126cca0c).f664x11acdfa4 = str;
    }

    public C0350x1e5aea5(int i17, android.view.Surface surface) {
        this(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.OutputConfigurationParamsApi24(new android.hardware.camera2.params.OutputConfiguration(i17, surface)));
    }

    public C0350x1e5aea5(java.lang.Object obj) {
        super(obj);
    }
}
