package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat */
/* loaded from: classes14.dex */
public final class C0349x1437c937 {

    /* renamed from: STREAM_USE_CASE_NONE */
    public static final int f658xb1114f90 = -1;

    /* renamed from: SURFACE_GROUP_ID_NONE */
    public static final int f659x49c075ca = -1;

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl f660x622d82d;

    /* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl */
    /* loaded from: classes14.dex */
    public interface OutputConfigurationCompatImpl {
        /* renamed from: addSurface */
        void mo3851x34744cc(android.view.Surface surface);

        /* renamed from: enableSurfaceSharing */
        void mo3852x7847ffd2();

        /* renamed from: getDynamicRangeProfile */
        long mo3853xa947a455();

        /* renamed from: getMaxSharedSurfaceCount */
        int mo3854xc1a40c35();

        /* renamed from: getMirrorMode */
        int mo3855x5638d9f8();

        /* renamed from: getOutputConfiguration */
        java.lang.Object mo3856xa51fd23f();

        /* renamed from: getPhysicalCameraId */
        java.lang.String mo3857x936d7c8d();

        /* renamed from: getStreamUseCase */
        long mo3858xd0b82e01();

        /* renamed from: getSurface */
        android.view.Surface mo3859xcf572877();

        /* renamed from: getSurfaceGroupId */
        int mo3860x7e2da783();

        /* renamed from: getSurfaces */
        java.util.List<android.view.Surface> mo3861x1b8de6dc();

        /* renamed from: removeSurface */
        void mo3862xd8cbaf89(android.view.Surface surface);

        /* renamed from: setDynamicRangeProfile */
        void mo3863xf78c63c9(long j17);

        /* renamed from: setMirrorMode */
        void mo3864x845d2804(int i17);

        /* renamed from: setPhysicalCameraId */
        void mo3865x376a1199(java.lang.String str);

        /* renamed from: setStreamUseCase */
        void mo3866x638e9475(long j17);
    }

    public C0349x1437c937(android.view.Surface surface) {
        this(-1, surface);
    }

    /* renamed from: wrap */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937 m3832x37d04a(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl m3879x37d04a = i17 >= 33 ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0353x38c6fc3.m3879x37d04a((android.hardware.camera2.params.OutputConfiguration) obj) : i17 >= 28 ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.m3876x37d04a((android.hardware.camera2.params.OutputConfiguration) obj) : i17 >= 26 ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.m3873x37d04a((android.hardware.camera2.params.OutputConfiguration) obj) : p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5.m3867x37d04a((android.hardware.camera2.params.OutputConfiguration) obj);
        if (m3879x37d04a == null) {
            return null;
        }
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937(m3879x37d04a);
    }

    /* renamed from: addSurface */
    public void m3833x34744cc(android.view.Surface surface) {
        this.f660x622d82d.mo3851x34744cc(surface);
    }

    /* renamed from: enableSurfaceSharing */
    public void m3834x7847ffd2() {
        this.f660x622d82d.mo3852x7847ffd2();
    }

    /* renamed from: equals */
    public boolean m3835xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937) {
            return this.f660x622d82d.equals(((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937) obj).f660x622d82d);
        }
        return false;
    }

    /* renamed from: getDynamicRangeProfile */
    public long m3836xa947a455() {
        return this.f660x622d82d.mo3853xa947a455();
    }

    /* renamed from: getMaxSharedSurfaceCount */
    public int m3837xc1a40c35() {
        return this.f660x622d82d.mo3854xc1a40c35();
    }

    /* renamed from: getMirrorMode */
    public int m3838x5638d9f8() {
        return this.f660x622d82d.mo3855x5638d9f8();
    }

    /* renamed from: getPhysicalCameraId */
    public java.lang.String m3839x936d7c8d() {
        return this.f660x622d82d.mo3857x936d7c8d();
    }

    /* renamed from: getStreamUseCase */
    public long m3840xd0b82e01() {
        return this.f660x622d82d.mo3858xd0b82e01();
    }

    /* renamed from: getSurface */
    public android.view.Surface m3841xcf572877() {
        return this.f660x622d82d.mo3859xcf572877();
    }

    /* renamed from: getSurfaceGroupId */
    public int m3842x7e2da783() {
        return this.f660x622d82d.mo3860x7e2da783();
    }

    /* renamed from: getSurfaces */
    public java.util.List<android.view.Surface> m3843x1b8de6dc() {
        return this.f660x622d82d.mo3861x1b8de6dc();
    }

    /* renamed from: hashCode */
    public int m3844x8cdac1b() {
        return this.f660x622d82d.hashCode();
    }

    /* renamed from: removeSurface */
    public void m3845xd8cbaf89(android.view.Surface surface) {
        this.f660x622d82d.mo3862xd8cbaf89(surface);
    }

    /* renamed from: setDynamicRangeProfile */
    public void m3846xf78c63c9(long j17) {
        this.f660x622d82d.mo3863xf78c63c9(j17);
    }

    /* renamed from: setMirrorMode */
    public void m3847x845d2804(int i17) {
        this.f660x622d82d.mo3864x845d2804(i17);
    }

    /* renamed from: setPhysicalCameraId */
    public void m3848x376a1199(java.lang.String str) {
        this.f660x622d82d.mo3865x376a1199(str);
    }

    /* renamed from: setStreamUseCase */
    public void m3849x638e9475(long j17) {
        this.f660x622d82d.mo3866x638e9475(j17);
    }

    /* renamed from: unwrap */
    public java.lang.Object m3850xcdecea63() {
        return this.f660x622d82d.mo3856xa51fd23f();
    }

    public C0349x1437c937(int i17, android.view.Surface surface) {
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 33) {
            this.f660x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0353x38c6fc3(i17, surface);
            return;
        }
        if (i18 >= 28) {
            this.f660x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9(i17, surface);
        } else if (i18 >= 26) {
            this.f660x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7(i17, surface);
        } else {
            this.f660x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0350x1e5aea5(i17, surface);
        }
    }

    public <T> C0349x1437c937(android.util.Size size, java.lang.Class<T> cls) {
        android.hardware.camera2.params.OutputConfiguration m3692x9ad6fb5 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api26Impl.m3692x9ad6fb5(size, cls);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            this.f660x622d82d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0353x38c6fc3.m3879x37d04a(m3692x9ad6fb5);
        } else if (i17 >= 28) {
            this.f660x622d82d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0352x21e0ca9.m3876x37d04a(m3692x9ad6fb5);
        } else {
            this.f660x622d82d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0351x201dda7.m3873x37d04a(m3692x9ad6fb5);
        }
    }

    public C0349x1437c937(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        this.f660x622d82d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0353x38c6fc3.m3879x37d04a(outputConfiguration);
    }

    private C0349x1437c937(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.f660x622d82d = outputConfigurationCompatImpl;
    }
}
