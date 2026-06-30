package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl */
/* loaded from: classes13.dex */
class C0354x204c12e8 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl {
    static final java.lang.String TAG = "OutputConfigCompat";

    /* renamed from: mObject */
    final java.lang.Object f672x126cca0c;

    /* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 */
    /* loaded from: classes13.dex */
    public static final class OutputConfigurationParamsApi21 {

        /* renamed from: DETECT_SURFACE_TYPE_METHOD */
        private static final java.lang.String f673xea46e938 = "detectSurfaceType";

        /* renamed from: GET_GENERATION_ID_METHOD */
        private static final java.lang.String f674xa1ebab87 = "getGenerationId";

        /* renamed from: GET_SURFACE_SIZE_METHOD */
        private static final java.lang.String f675xada46ba4 = "getSurfaceSize";

        /* renamed from: LEGACY_CAMERA_DEVICE_CLASS */
        private static final java.lang.String f676x80fe7b93 = "android.hardware.camera2.legacy.LegacyCameraDevice";

        /* renamed from: MAX_SURFACES_COUNT */
        static final int f677xb8434531 = 1;

        /* renamed from: mConfiguredFormat */
        final int f678x4c9a8262;

        /* renamed from: mConfiguredGenerationId */
        final int f679xa3989a7e;

        /* renamed from: mConfiguredSize */
        final android.util.Size f680xffd6092c;

        /* renamed from: mPhysicalCameraId */
        java.lang.String f683x11acdfa4;

        /* renamed from: mSurfaces */
        final java.util.List<android.view.Surface> f684xc4b150f3;

        /* renamed from: mIsShared */
        boolean f682x174f45bc = false;

        /* renamed from: mDynamicRangeProfile */
        long f681x3bb3d5de = 1;

        public OutputConfigurationParamsApi21(android.view.Surface surface) {
            m3.h.d(surface, "Surface must not be null");
            this.f684xc4b150f3 = java.util.Collections.singletonList(surface);
            this.f680xffd6092c = m3884x86376918(surface);
            this.f678x4c9a8262 = m3882xc023974e(surface);
            this.f679xa3989a7e = m3883x4d414e6a(surface);
        }

        /* renamed from: getSurfaceFormat */
        private static int m3882xc023974e(android.view.Surface surface) {
            try {
                return ((java.lang.Integer) java.lang.Class.forName(f676x80fe7b93).getDeclaredMethod(f673xea46e938, android.view.Surface.class).invoke(null, surface)).intValue();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.TAG, "Unable to retrieve surface format.", e17);
                return 0;
            }
        }

        /* renamed from: getSurfaceGenerationId */
        private static int m3883x4d414e6a(android.view.Surface surface) {
            try {
                return ((java.lang.Integer) android.view.Surface.class.getDeclaredMethod(f674xa1ebab87, new java.lang.Class[0]).invoke(surface, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.TAG, "Unable to retrieve surface generation id.", e17);
                return -1;
            }
        }

        /* renamed from: getSurfaceSize */
        private static android.util.Size m3884x86376918(android.view.Surface surface) {
            try {
                java.lang.reflect.Method declaredMethod = java.lang.Class.forName(f676x80fe7b93).getDeclaredMethod(f675xada46ba4, android.view.Surface.class);
                declaredMethod.setAccessible(true);
                return (android.util.Size) declaredMethod.invoke(null, surface);
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.TAG, "Unable to retrieve surface size.", e17);
                return null;
            }
        }

        /* renamed from: equals */
        public boolean m3885xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21)) {
                return false;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21 outputConfigurationParamsApi21 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) obj;
            if (!this.f680xffd6092c.equals(outputConfigurationParamsApi21.f680xffd6092c) || this.f678x4c9a8262 != outputConfigurationParamsApi21.f678x4c9a8262 || this.f679xa3989a7e != outputConfigurationParamsApi21.f679xa3989a7e || this.f682x174f45bc != outputConfigurationParamsApi21.f682x174f45bc || this.f681x3bb3d5de != outputConfigurationParamsApi21.f681x3bb3d5de || !java.util.Objects.equals(this.f683x11acdfa4, outputConfigurationParamsApi21.f683x11acdfa4)) {
                return false;
            }
            int min = java.lang.Math.min(this.f684xc4b150f3.size(), outputConfigurationParamsApi21.f684xc4b150f3.size());
            for (int i17 = 0; i17 < min; i17++) {
                if (this.f684xc4b150f3.get(i17) != outputConfigurationParamsApi21.f684xc4b150f3.get(i17)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: hashCode */
        public int m3886x8cdac1b() {
            int hashCode = this.f684xc4b150f3.hashCode() ^ 31;
            int i17 = this.f679xa3989a7e ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f680xffd6092c.hashCode() ^ ((i17 << 5) - i17);
            int i18 = this.f678x4c9a8262 ^ ((hashCode2 << 5) - hashCode2);
            int i19 = (this.f682x174f45bc ? 1 : 0) ^ ((i18 << 5) - i18);
            int i27 = (i19 << 5) - i19;
            java.lang.String str = this.f683x11acdfa4;
            int hashCode3 = (str == null ? 0 : str.hashCode()) ^ i27;
            return java.lang.Long.hashCode(this.f681x3bb3d5de) ^ ((hashCode3 << 5) - hashCode3);
        }
    }

    public C0354x204c12e8(android.view.Surface surface) {
        this.f672x126cca0c = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21(surface);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: addSurface */
    public void mo3851x34744cc(android.view.Surface surface) {
        m3.h.d(surface, "Surface must not be null");
        if (mo3859xcf572877() == surface) {
            throw new java.lang.IllegalStateException("Surface is already added!");
        }
        if (!mo3868x50249c8()) {
            throw new java.lang.IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new java.lang.IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: enableSurfaceSharing */
    public void mo3852x7847ffd2() {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f682x174f45bc = true;
    }

    /* renamed from: equals */
    public boolean mo3880xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8) {
            return java.util.Objects.equals(this.f672x126cca0c, ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8) obj).f672x126cca0c);
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getDynamicRangeProfile */
    public long mo3853xa947a455() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f681x3bb3d5de;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getMaxSharedSurfaceCount */
    public int mo3854xc1a40c35() {
        return 1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getMirrorMode */
    public int mo3855x5638d9f8() {
        return 0;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getOutputConfiguration */
    public java.lang.Object mo3856xa51fd23f() {
        return null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo3857x936d7c8d() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f683x11acdfa4;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getStreamUseCase */
    public long mo3858xd0b82e01() {
        return -1L;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getSurface */
    public android.view.Surface mo3859xcf572877() {
        java.util.List<android.view.Surface> list = ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f684xc4b150f3;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getSurfaceGroupId */
    public int mo3860x7e2da783() {
        return -1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: getSurfaces */
    public java.util.List<android.view.Surface> mo3861x1b8de6dc() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f684xc4b150f3;
    }

    /* renamed from: hashCode */
    public int mo3881x8cdac1b() {
        return this.f672x126cca0c.hashCode();
    }

    /* renamed from: isSurfaceSharingEnabled */
    public boolean mo3868x50249c8() {
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f682x174f45bc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: removeSurface */
    public void mo3862xd8cbaf89(android.view.Surface surface) {
        if (mo3859xcf572877() != surface) {
            throw new java.lang.IllegalArgumentException("Surface is not part of this output configuration");
        }
        throw new java.lang.IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setDynamicRangeProfile */
    public void mo3863xf78c63c9(long j17) {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f681x3bb3d5de = j17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setMirrorMode */
    public void mo3864x845d2804(int i17) {
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setPhysicalCameraId */
    public void mo3865x376a1199(java.lang.String str) {
        ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0354x204c12e8.OutputConfigurationParamsApi21) this.f672x126cca0c).f683x11acdfa4 = str;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.OutputConfigurationCompatImpl
    /* renamed from: setStreamUseCase */
    public void mo3866x638e9475(long j17) {
    }

    public C0354x204c12e8(java.lang.Object obj) {
        this.f672x126cca0c = obj;
    }
}
