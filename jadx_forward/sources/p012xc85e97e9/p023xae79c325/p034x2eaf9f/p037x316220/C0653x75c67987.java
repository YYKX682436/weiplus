package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_OutputSurfaceConfiguration */
/* loaded from: classes14.dex */
final class C0653x75c67987 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a {

    /* renamed from: imageAnalysisOutputSurface */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f1457x10619855;

    /* renamed from: imageCaptureOutputSurface */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f1458x4b7504c1;

    /* renamed from: postviewOutputSurface */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f1459xccf95d27;

    /* renamed from: previewOutputSurface */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f1460xdf792984;

    public C0653x75c67987(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c4) {
        if (abstractC0737x4073a84c == null) {
            throw new java.lang.NullPointerException("Null previewOutputSurface");
        }
        this.f1460xdf792984 = abstractC0737x4073a84c;
        if (abstractC0737x4073a84c2 == null) {
            throw new java.lang.NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f1458x4b7504c1 = abstractC0737x4073a84c2;
        this.f1457x10619855 = abstractC0737x4073a84c3;
        this.f1459xccf95d27 = abstractC0737x4073a84c4;
    }

    /* renamed from: equals */
    public boolean m5160xb2c87fbf(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a abstractC0738x8f67d80a = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a) obj;
        if (this.f1460xdf792984.equals(abstractC0738x8f67d80a.mo5164x8d44e5fa()) && this.f1458x4b7504c1.equals(abstractC0738x8f67d80a.mo5162x1cfaa20b()) && ((abstractC0737x4073a84c = this.f1457x10619855) != null ? abstractC0737x4073a84c.equals(abstractC0738x8f67d80a.mo5161x6f8fa44b()) : abstractC0738x8f67d80a.mo5161x6f8fa44b() == null)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c2 = this.f1459xccf95d27;
            if (abstractC0737x4073a84c2 == null) {
                if (abstractC0738x8f67d80a.mo5163xd8a52f71() == null) {
                    return true;
                }
            } else if (abstractC0737x4073a84c2.equals(abstractC0738x8f67d80a.mo5163xd8a52f71())) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a
    /* renamed from: getImageAnalysisOutputSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c mo5161x6f8fa44b() {
        return this.f1457x10619855;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a
    /* renamed from: getImageCaptureOutputSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c mo5162x1cfaa20b() {
        return this.f1458x4b7504c1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a
    /* renamed from: getPostviewOutputSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c mo5163xd8a52f71() {
        return this.f1459xccf95d27;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a
    /* renamed from: getPreviewOutputSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c mo5164x8d44e5fa() {
        return this.f1460xdf792984;
    }

    /* renamed from: hashCode */
    public int m5165x8cdac1b() {
        int hashCode = (((this.f1460xdf792984.hashCode() ^ 1000003) * 1000003) ^ this.f1458x4b7504c1.hashCode()) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c = this.f1457x10619855;
        int hashCode2 = (hashCode ^ (abstractC0737x4073a84c == null ? 0 : abstractC0737x4073a84c.hashCode())) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c2 = this.f1459xccf95d27;
        return hashCode2 ^ (abstractC0737x4073a84c2 != null ? abstractC0737x4073a84c2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m5166x9616526c() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f1460xdf792984 + ", imageCaptureOutputSurface=" + this.f1458x4b7504c1 + ", imageAnalysisOutputSurface=" + this.f1457x10619855 + ", postviewOutputSurface=" + this.f1459xccf95d27 + "}";
    }
}
