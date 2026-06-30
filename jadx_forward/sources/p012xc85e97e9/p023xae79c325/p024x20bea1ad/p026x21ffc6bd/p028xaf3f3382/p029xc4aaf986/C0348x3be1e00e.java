package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat */
/* loaded from: classes14.dex */
public final class C0348x3be1e00e {

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl f653x622d82d;

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi31Impl */
    /* loaded from: classes14.dex */
    public static final class InputConfigurationCompatApi31Impl extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatApi23Impl {
        public InputConfigurationCompatApi31Impl(java.lang.Object obj) {
            super(obj);
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatApi23Impl, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: isMultiResolution */
        public boolean mo3827xf095283b() {
            return ((android.hardware.camera2.params.InputConfiguration) mo3824x189a2742()).isMultiResolution();
        }

        public InputConfigurationCompatApi31Impl(int i17, int i18, int i19) {
            super(i17, i18, i19);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatBaseImpl */
    /* loaded from: classes14.dex */
    public static final class InputConfigurationCompatBaseImpl implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl {

        /* renamed from: mFormat */
        private final int f655x3cc1ec4;

        /* renamed from: mHeight */
        private final int f656x6a4b7f4;

        /* renamed from: mWidth */
        private final int f657xbefb7959;

        public InputConfigurationCompatBaseImpl(int i17, int i18, int i19) {
            this.f657xbefb7959 = i17;
            this.f656x6a4b7f4 = i18;
            this.f655x3cc1ec4 = i19;
        }

        /* renamed from: equals */
        public boolean m3829xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatBaseImpl)) {
                return false;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatBaseImpl inputConfigurationCompatBaseImpl = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatBaseImpl) obj;
            return inputConfigurationCompatBaseImpl.mo3825x755bd410() == this.f657xbefb7959 && inputConfigurationCompatBaseImpl.mo3823x1c4fb41d() == this.f656x6a4b7f4 && inputConfigurationCompatBaseImpl.mo3822x19771aed() == this.f655x3cc1ec4;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getFormat */
        public int mo3822x19771aed() {
            return this.f655x3cc1ec4;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getHeight */
        public int mo3823x1c4fb41d() {
            return this.f656x6a4b7f4;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getInputConfiguration */
        public java.lang.Object mo3824x189a2742() {
            return null;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getWidth */
        public int mo3825x755bd410() {
            return this.f657xbefb7959;
        }

        /* renamed from: hashCode */
        public int m3830x8cdac1b() {
            int i17 = 31 ^ this.f657xbefb7959;
            int i18 = this.f656x6a4b7f4 ^ ((i17 << 5) - i17);
            return this.f655x3cc1ec4 ^ ((i18 << 5) - i18);
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: isMultiResolution */
        public boolean mo3827xf095283b() {
            return false;
        }

        /* renamed from: toString */
        public java.lang.String m3831x9616526c() {
            return java.lang.String.format("InputConfiguration(w:%d, h:%d, format:%d)", java.lang.Integer.valueOf(this.f657xbefb7959), java.lang.Integer.valueOf(this.f656x6a4b7f4), java.lang.Integer.valueOf(this.f655x3cc1ec4));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl */
    /* loaded from: classes14.dex */
    public interface InputConfigurationCompatImpl {
        /* renamed from: getFormat */
        int mo3822x19771aed();

        /* renamed from: getHeight */
        int mo3823x1c4fb41d();

        /* renamed from: getInputConfiguration */
        java.lang.Object mo3824x189a2742();

        /* renamed from: getWidth */
        int mo3825x755bd410();

        /* renamed from: isMultiResolution */
        boolean mo3827xf095283b();
    }

    public C0348x3be1e00e(int i17, int i18, int i19) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.f653x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatApi31Impl(i17, i18, i19);
        } else {
            this.f653x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatApi23Impl(i17, i18, i19);
        }
    }

    /* renamed from: wrap */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e m3812x37d04a(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return android.os.Build.VERSION.SDK_INT >= 31 ? new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatApi31Impl(obj)) : new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatApi23Impl(obj));
    }

    /* renamed from: equals */
    public boolean m3813xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e) {
            return this.f653x622d82d.equals(((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e) obj).f653x622d82d);
        }
        return false;
    }

    /* renamed from: getFormat */
    public int m3814x19771aed() {
        return this.f653x622d82d.mo3822x19771aed();
    }

    /* renamed from: getHeight */
    public int m3815x1c4fb41d() {
        return this.f653x622d82d.mo3823x1c4fb41d();
    }

    /* renamed from: getWidth */
    public int m3816x755bd410() {
        return this.f653x622d82d.mo3825x755bd410();
    }

    /* renamed from: hashCode */
    public int m3817x8cdac1b() {
        return this.f653x622d82d.hashCode();
    }

    /* renamed from: isMultiResolution */
    public boolean m3818xf095283b() {
        return this.f653x622d82d.mo3827xf095283b();
    }

    /* renamed from: toString */
    public java.lang.String m3819x9616526c() {
        return this.f653x622d82d.toString();
    }

    /* renamed from: unwrap */
    public java.lang.Object m3820xcdecea63() {
        return this.f653x622d82d.mo3824x189a2742();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi23Impl */
    /* loaded from: classes14.dex */
    public static class InputConfigurationCompatApi23Impl implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl {

        /* renamed from: mObject */
        private final android.hardware.camera2.params.InputConfiguration f654x126cca0c;

        public InputConfigurationCompatApi23Impl(java.lang.Object obj) {
            this.f654x126cca0c = (android.hardware.camera2.params.InputConfiguration) obj;
        }

        /* renamed from: equals */
        public boolean m3821xb2c87fbf(java.lang.Object obj) {
            if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl) {
                return java.util.Objects.equals(this.f654x126cca0c, ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl) obj).mo3824x189a2742());
            }
            return false;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getFormat */
        public int mo3822x19771aed() {
            return this.f654x126cca0c.getFormat();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getHeight */
        public int mo3823x1c4fb41d() {
            return this.f654x126cca0c.getHeight();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getInputConfiguration */
        public java.lang.Object mo3824x189a2742() {
            return this.f654x126cca0c;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: getWidth */
        public int mo3825x755bd410() {
            return this.f654x126cca0c.getWidth();
        }

        /* renamed from: hashCode */
        public int m3826x8cdac1b() {
            return this.f654x126cca0c.hashCode();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl
        /* renamed from: isMultiResolution */
        public boolean mo3827xf095283b() {
            return false;
        }

        /* renamed from: toString */
        public java.lang.String m3828x9616526c() {
            return this.f654x126cca0c.toString();
        }

        public InputConfigurationCompatApi23Impl(int i17, int i18, int i19) {
            this(new android.hardware.camera2.params.InputConfiguration(i17, i18, i19));
        }
    }

    private C0348x3be1e00e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.InputConfigurationCompatImpl inputConfigurationCompatImpl) {
        this.f653x622d82d = inputConfigurationCompatImpl;
    }
}
