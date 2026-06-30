package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl */
/* loaded from: classes14.dex */
public class C0352x21e0ca9 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7 {

    /* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 */
    /* loaded from: classes14.dex */
    public static final class OutputConfigurationParamsApi28 {

        /* renamed from: mDynamicRangeProfile */
        long f670x3bb3d5de = 1;

        /* renamed from: mOutputConfiguration */
        final android.hardware.camera2.params.OutputConfiguration f671x378c03c8;

        public OutputConfigurationParamsApi28(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
            this.f671x378c03c8 = outputConfiguration;
        }

        /* renamed from: equals */
        public boolean m3877xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28)) {
                return false;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28 outputConfigurationParamsApi28 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28) obj;
            return java.util.Objects.equals(this.f671x378c03c8, outputConfigurationParamsApi28.f671x378c03c8) && this.f670x3bb3d5de == outputConfigurationParamsApi28.f670x3bb3d5de;
        }

        /* renamed from: hashCode */
        public int m3878x8cdac1b() {
            int hashCode = this.f671x378c03c8.hashCode() ^ 31;
            return java.lang.Long.hashCode(this.f670x3bb3d5de) ^ ((hashCode << 5) - hashCode);
        }
    }

    public C0352x21e0ca9(android.view.Surface surface) {
        this(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28(new android.hardware.camera2.params.OutputConfiguration(surface)));
    }

    /* renamed from: wrap */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9 m3876x37d04a(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28(outputConfiguration));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getDynamicRangeProfile */
    public long mo3853xa947a455() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28) this.f672x126cca0c).f670x3bb3d5de;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getMaxSharedSurfaceCount */
    public int mo3854xc1a40c35() {
        return ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).getMaxSharedSurfaceCount();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getOutputConfiguration */
    public java.lang.Object mo3856xa51fd23f() {
        m3.h.a(this.f672x126cca0c instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28);
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28) this.f672x126cca0c).f671x378c03c8;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo3857x936d7c8d() {
        return null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: removeSurface */
    public void mo3862xd8cbaf89(android.view.Surface surface) {
        ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).removeSurface(surface);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setDynamicRangeProfile */
    public void mo3863xf78c63c9(long j17) {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28) this.f672x126cca0c).f670x3bb3d5de = j17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setPhysicalCameraId */
    public void mo3865x376a1199(java.lang.String str) {
        ((android.hardware.camera2.params.OutputConfiguration) mo3856xa51fd23f()).setPhysicalCameraId(str);
    }

    public C0352x21e0ca9(int i17, android.view.Surface surface) {
        this(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.OutputConfigurationParamsApi28(new android.hardware.camera2.params.OutputConfiguration(i17, surface)));
    }

    public C0352x21e0ca9(java.lang.Object obj) {
        super(obj);
    }
}
