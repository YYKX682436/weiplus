package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.AutoValue_SupportedSurfaceCombination_FeatureSettings */
/* loaded from: classes14.dex */
final class C0112xa3713c0d extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings {

    /* renamed from: cameraMode */
    private final int f133x880e5668;

    /* renamed from: previewStabilizationOn */
    private final boolean f134x947f736;

    /* renamed from: requiredMaxBitDepth */
    private final int f135x7df9361b;

    /* renamed from: ultraHdrOn */
    private final boolean f136x7caa1b29;

    public C0112xa3713c0d(int i17, int i18, boolean z17, boolean z18) {
        this.f133x880e5668 = i17;
        this.f135x7df9361b = i18;
        this.f134x947f736 = z17;
        this.f136x7caa1b29 = z18;
    }

    /* renamed from: equals */
    public boolean m2918xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings featureSettings = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings) obj;
        return this.f133x880e5668 == featureSettings.mo2919x764f0e5e() && this.f135x7df9361b == featureSettings.mo2920xd62912e5() && this.f134x947f736 == featureSettings.mo2922xe97c1500() && this.f136x7caa1b29 == featureSettings.mo2923xfe1517f3();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings
    /* renamed from: getCameraMode */
    public int mo2919x764f0e5e() {
        return this.f133x880e5668;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings
    /* renamed from: getRequiredMaxBitDepth */
    public int mo2920xd62912e5() {
        return this.f135x7df9361b;
    }

    /* renamed from: hashCode */
    public int m2921x8cdac1b() {
        return ((((((this.f133x880e5668 ^ 1000003) * 1000003) ^ this.f135x7df9361b) * 1000003) ^ (this.f134x947f736 ? 1231 : 1237)) * 1000003) ^ (this.f136x7caa1b29 ? 1231 : 1237);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings
    /* renamed from: isPreviewStabilizationOn */
    public boolean mo2922xe97c1500() {
        return this.f134x947f736;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings
    /* renamed from: isUltraHdrOn */
    public boolean mo2923xfe1517f3() {
        return this.f136x7caa1b29;
    }

    /* renamed from: toString */
    public java.lang.String m2924x9616526c() {
        return "FeatureSettings{cameraMode=" + this.f133x880e5668 + ", requiredMaxBitDepth=" + this.f135x7df9361b + ", previewStabilizationOn=" + this.f134x947f736 + ", ultraHdrOn=" + this.f136x7caa1b29 + "}";
    }
}
