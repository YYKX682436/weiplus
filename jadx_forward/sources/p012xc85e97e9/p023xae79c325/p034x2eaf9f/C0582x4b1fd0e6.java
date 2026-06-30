package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ViewPort */
/* loaded from: classes14.dex */
public final class C0582x4b1fd0e6 {

    /* renamed from: FILL_CENTER */
    public static final int f1278x525a2691 = 1;

    /* renamed from: FILL_END */
    public static final int f1279x344afff = 2;

    /* renamed from: FILL_START */
    public static final int f1280x45a0ae86 = 0;
    public static final int FIT = 3;

    /* renamed from: mAspectRatio */
    private android.util.Rational f1281xeb2653e6;

    /* renamed from: mLayoutDirection */
    private int f1282x5b1c4b48;

    /* renamed from: mRotation */
    private int f1283x2296b70b;

    /* renamed from: mScaleType */
    private int f1284xac8a1b7;

    /* renamed from: androidx.camera.core.ViewPort$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder {

        /* renamed from: DEFAULT_LAYOUT_DIRECTION */
        private static final int f1285xb6f5fae8 = 0;

        /* renamed from: DEFAULT_SCALE_TYPE */
        private static final int f1286x99335e0d = 1;

        /* renamed from: mAspectRatio */
        private final android.util.Rational f1287xeb2653e6;

        /* renamed from: mRotation */
        private final int f1289x2296b70b;

        /* renamed from: mScaleType */
        private int f1290xac8a1b7 = 1;

        /* renamed from: mLayoutDirection */
        private int f1288x5b1c4b48 = 0;

        public Builder(android.util.Rational rational, int i17) {
            this.f1287xeb2653e6 = rational;
            this.f1289x2296b70b = i17;
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 m4864x59bc66e() {
            m3.h.d(this.f1287xeb2653e6, "The crop aspect ratio must be set.");
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6(this.f1290xac8a1b7, this.f1287xeb2653e6, this.f1289x2296b70b, this.f1288x5b1c4b48);
        }

        /* renamed from: setLayoutDirection */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6.Builder m4865xa6a686b3(int i17) {
            this.f1288x5b1c4b48 = i17;
            return this;
        }

        /* renamed from: setScaleType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6.Builder m4866xebd28962(int i17) {
            this.f1290xac8a1b7 = i17;
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ViewPort$LayoutDirection */
    /* loaded from: classes6.dex */
    public @interface LayoutDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ViewPort$ScaleType */
    /* loaded from: classes6.dex */
    public @interface ScaleType {
    }

    public C0582x4b1fd0e6(int i17, android.util.Rational rational, int i18, int i19) {
        this.f1284xac8a1b7 = i17;
        this.f1281xeb2653e6 = rational;
        this.f1283x2296b70b = i18;
        this.f1282x5b1c4b48 = i19;
    }

    /* renamed from: getAspectRatio */
    public android.util.Rational m4860x1aef895d() {
        return this.f1281xeb2653e6;
    }

    /* renamed from: getLayoutDirection */
    public int m4861x6fcfed3f() {
        return this.f1282x5b1c4b48;
    }

    /* renamed from: getRotation */
    public int m4862x79734cf4() {
        return this.f1283x2296b70b;
    }

    /* renamed from: getScaleType */
    public int m4863x8f7ec8ee() {
        return this.f1284xac8a1b7;
    }
}
