package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.DynamicRange */
/* loaded from: classes14.dex */
public final class C0491x2bb48c5e {

    /* renamed from: BIT_DEPTH_10_BIT */
    public static final int f938xc0009dfb = 10;

    /* renamed from: BIT_DEPTH_8_BIT */
    public static final int f939x6a92778 = 8;

    /* renamed from: BIT_DEPTH_UNSPECIFIED */
    public static final int f940x3493dca9 = 0;

    /* renamed from: ENCODING_DOLBY_VISION */
    public static final int f943xcfb3fc3b = 6;

    /* renamed from: ENCODING_HDR10 */
    public static final int f944xa673b589 = 4;

    /* renamed from: ENCODING_HDR10_PLUS */
    public static final int f945x35bd9690 = 5;

    /* renamed from: ENCODING_HDR_UNSPECIFIED */
    public static final int f946x69e97042 = 2;

    /* renamed from: ENCODING_HLG */
    public static final int f947x578c82d7 = 3;

    /* renamed from: ENCODING_SDR */
    public static final int f948x578cab35 = 1;

    /* renamed from: ENCODING_UNSPECIFIED */
    public static final int f949xebaf362b = 0;

    /* renamed from: mBitDepth */
    private final int f955x657f2543;

    /* renamed from: mEncoding */
    private final int f956x8afcd4e0;

    /* renamed from: UNSPECIFIED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f954x1f661f17 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(0, 0);
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e SDR = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(1, 8);

    /* renamed from: HDR_UNSPECIFIED_10_BIT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f952x25b0b8fe = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(2, 10);

    /* renamed from: HLG_10_BIT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f953x804a42c9 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(3, 10);

    /* renamed from: HDR10_10_BIT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f950xc96beed7 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(4, 10);

    /* renamed from: HDR10_PLUS_10_BIT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f951x1f9c7b48 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(5, 10);

    /* renamed from: DOLBY_VISION_10_BIT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f941x1341243d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(6, 10);

    /* renamed from: DOLBY_VISION_8_BIT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f942x9dfdd0f6 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(6, 8);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.DynamicRange$BitDepth */
    /* loaded from: classes6.dex */
    public @interface BitDepth {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.DynamicRange$DynamicRangeEncoding */
    /* loaded from: classes6.dex */
    public @interface DynamicRangeEncoding {
    }

    public C0491x2bb48c5e(int i17, int i18) {
        this.f956x8afcd4e0 = i17;
        this.f955x657f2543 = i18;
    }

    /* renamed from: getEncodingLabel */
    private static java.lang.String m4383x9ad379ab(int i17) {
        switch (i17) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    /* renamed from: equals */
    public boolean m4384xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e) obj;
        return this.f956x8afcd4e0 == c0491x2bb48c5e.m4386xe1d96ac9() && this.f955x657f2543 == c0491x2bb48c5e.m4385xbc5bbb2c();
    }

    /* renamed from: getBitDepth */
    public int m4385xbc5bbb2c() {
        return this.f955x657f2543;
    }

    /* renamed from: getEncoding */
    public int m4386xe1d96ac9() {
        return this.f956x8afcd4e0;
    }

    /* renamed from: hashCode */
    public int m4387x8cdac1b() {
        return ((this.f956x8afcd4e0 ^ 1000003) * 1000003) ^ this.f955x657f2543;
    }

    /* renamed from: is10BitHdr */
    public boolean m4388x10bf48d2() {
        return m4389x3f7fd8d0() && m4386xe1d96ac9() != 1 && m4385xbc5bbb2c() == 10;
    }

    /* renamed from: isFullySpecified */
    public boolean m4389x3f7fd8d0() {
        return (m4386xe1d96ac9() == 0 || m4386xe1d96ac9() == 2 || m4385xbc5bbb2c() == 0) ? false : true;
    }

    /* renamed from: toString */
    public java.lang.String m4390x9616526c() {
        return "DynamicRange@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "{encoding=" + m4383x9ad379ab(this.f956x8afcd4e0) + ", bitDepth=" + this.f955x657f2543 + "}";
    }
}
