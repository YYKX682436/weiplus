package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AutoValue_ImageReaderFormatRecommender_FormatCombo */
/* loaded from: classes16.dex */
final class C0458x4d8e5669 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0538xc89ecfb4.FormatCombo {

    /* renamed from: imageAnalysisFormat */
    private final int f800x5106fc2e;

    /* renamed from: imageCaptureFormat */
    private final int f801x424d7142;

    public C0458x4d8e5669(int i17, int i18) {
        this.f801x424d7142 = i17;
        this.f800x5106fc2e = i18;
    }

    /* renamed from: equals */
    public boolean m4203xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0538xc89ecfb4.FormatCombo)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0538xc89ecfb4.FormatCombo formatCombo = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0538xc89ecfb4.FormatCombo) obj;
        return this.f801x424d7142 == formatCombo.mo4206x424d7142() && this.f800x5106fc2e == formatCombo.mo4205x5106fc2e();
    }

    /* renamed from: hashCode */
    public int m4204x8cdac1b() {
        return ((this.f801x424d7142 ^ 1000003) * 1000003) ^ this.f800x5106fc2e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0538xc89ecfb4.FormatCombo
    /* renamed from: imageAnalysisFormat */
    public int mo4205x5106fc2e() {
        return this.f800x5106fc2e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0538xc89ecfb4.FormatCombo
    /* renamed from: imageCaptureFormat */
    public int mo4206x424d7142() {
        return this.f801x424d7142;
    }

    /* renamed from: toString */
    public java.lang.String m4207x9616526c() {
        return "FormatCombo{imageCaptureFormat=" + this.f801x424d7142 + ", imageAnalysisFormat=" + this.f800x5106fc2e + "}";
    }
}
