package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition */
/* loaded from: classes13.dex */
final class C0658xa3811e84 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21 {

    /* renamed from: analysisSize */
    private final android.util.Size f1487x97cab8fd;

    /* renamed from: maximumSizeMap */
    private final java.util.Map<java.lang.Integer, android.util.Size> f1488x1a4b7f5b;

    /* renamed from: previewSize */
    private final android.util.Size f1489xb30913e9;

    /* renamed from: recordSize */
    private final android.util.Size f1490x2bcd2ff2;

    /* renamed from: s1440pSizeMap */
    private final java.util.Map<java.lang.Integer, android.util.Size> f1491x9b4ca7dd;

    /* renamed from: s720pSizeMap */
    private final java.util.Map<java.lang.Integer, android.util.Size> f1492x4858946d;

    /* renamed from: ultraMaximumSizeMap */
    private final java.util.Map<java.lang.Integer, android.util.Size> f1493xd70d0627;

    public C0658xa3811e84(android.util.Size size, java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size2, java.util.Map<java.lang.Integer, android.util.Size> map2, android.util.Size size3, java.util.Map<java.lang.Integer, android.util.Size> map3, java.util.Map<java.lang.Integer, android.util.Size> map4) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null analysisSize");
        }
        this.f1487x97cab8fd = size;
        if (map == null) {
            throw new java.lang.NullPointerException("Null s720pSizeMap");
        }
        this.f1492x4858946d = map;
        if (size2 == null) {
            throw new java.lang.NullPointerException("Null previewSize");
        }
        this.f1489xb30913e9 = size2;
        if (map2 == null) {
            throw new java.lang.NullPointerException("Null s1440pSizeMap");
        }
        this.f1491x9b4ca7dd = map2;
        if (size3 == null) {
            throw new java.lang.NullPointerException("Null recordSize");
        }
        this.f1490x2bcd2ff2 = size3;
        if (map3 == null) {
            throw new java.lang.NullPointerException("Null maximumSizeMap");
        }
        this.f1488x1a4b7f5b = map3;
        if (map4 == null) {
            throw new java.lang.NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f1493xd70d0627 = map4;
    }

    /* renamed from: equals */
    public boolean m5208xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21 abstractC0759xcbc97a21 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21) obj;
        return this.f1487x97cab8fd.equals(abstractC0759xcbc97a21.mo5209xf8bd4b73()) && this.f1492x4858946d.equals(abstractC0759xcbc97a21.mo5214xa94b26e3()) && this.f1489xb30913e9.equals(abstractC0759xcbc97a21.mo5211x8cdf5ab3()) && this.f1491x9b4ca7dd.equals(abstractC0759xcbc97a21.mo5213x58ac6427()) && this.f1490x2bcd2ff2.equals(abstractC0759xcbc97a21.mo5212x1a0de7e8()) && this.f1488x1a4b7f5b.equals(abstractC0759xcbc97a21.mo5210x8e34c51()) && this.f1493xd70d0627.equals(abstractC0759xcbc97a21.mo5215x2f3ce2f1());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21
    /* renamed from: getAnalysisSize */
    public android.util.Size mo5209xf8bd4b73() {
        return this.f1487x97cab8fd;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21
    /* renamed from: getMaximumSizeMap */
    public java.util.Map<java.lang.Integer, android.util.Size> mo5210x8e34c51() {
        return this.f1488x1a4b7f5b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21
    /* renamed from: getPreviewSize */
    public android.util.Size mo5211x8cdf5ab3() {
        return this.f1489xb30913e9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21
    /* renamed from: getRecordSize */
    public android.util.Size mo5212x1a0de7e8() {
        return this.f1490x2bcd2ff2;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21
    /* renamed from: getS1440pSizeMap */
    public java.util.Map<java.lang.Integer, android.util.Size> mo5213x58ac6427() {
        return this.f1491x9b4ca7dd;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21
    /* renamed from: getS720pSizeMap */
    public java.util.Map<java.lang.Integer, android.util.Size> mo5214xa94b26e3() {
        return this.f1492x4858946d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21
    /* renamed from: getUltraMaximumSizeMap */
    public java.util.Map<java.lang.Integer, android.util.Size> mo5215x2f3ce2f1() {
        return this.f1493xd70d0627;
    }

    /* renamed from: hashCode */
    public int m5216x8cdac1b() {
        return ((((((((((((this.f1487x97cab8fd.hashCode() ^ 1000003) * 1000003) ^ this.f1492x4858946d.hashCode()) * 1000003) ^ this.f1489xb30913e9.hashCode()) * 1000003) ^ this.f1491x9b4ca7dd.hashCode()) * 1000003) ^ this.f1490x2bcd2ff2.hashCode()) * 1000003) ^ this.f1488x1a4b7f5b.hashCode()) * 1000003) ^ this.f1493xd70d0627.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m5217x9616526c() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f1487x97cab8fd + ", s720pSizeMap=" + this.f1492x4858946d + ", previewSize=" + this.f1489xb30913e9 + ", s1440pSizeMap=" + this.f1491x9b4ca7dd + ", recordSize=" + this.f1490x2bcd2ff2 + ", maximumSizeMap=" + this.f1488x1a4b7f5b + ", ultraMaximumSizeMap=" + this.f1493xd70d0627 + "}";
    }
}
