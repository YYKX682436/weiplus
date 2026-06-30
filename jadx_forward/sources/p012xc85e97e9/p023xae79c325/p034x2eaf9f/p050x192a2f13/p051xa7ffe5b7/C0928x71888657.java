package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7;

/* renamed from: androidx.camera.core.processing.concurrent.AutoValue_DualOutConfig */
/* loaded from: classes14.dex */
final class C0928x71888657 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4 {

    /* renamed from: primaryOutConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 f2222x4024a04e;

    /* renamed from: secondaryOutConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 f2223xe570fd1c;

    public C0928x71888657(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 abstractC0951xabff0c10, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 abstractC0951xabff0c102) {
        if (abstractC0951xabff0c10 == null) {
            throw new java.lang.NullPointerException("Null primaryOutConfig");
        }
        this.f2222x4024a04e = abstractC0951xabff0c10;
        if (abstractC0951xabff0c102 == null) {
            throw new java.lang.NullPointerException("Null secondaryOutConfig");
        }
        this.f2223xe570fd1c = abstractC0951xabff0c102;
    }

    /* renamed from: equals */
    public boolean m6387xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4 abstractC0931x4a0cef4 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4) obj;
        return this.f2222x4024a04e.equals(abstractC0931x4a0cef4.mo6388xe7fd07c4()) && this.f2223xe570fd1c.equals(abstractC0931x4a0cef4.mo6389xf8cd5f12());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4
    /* renamed from: getPrimaryOutConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 mo6388xe7fd07c4() {
        return this.f2222x4024a04e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4
    /* renamed from: getSecondaryOutConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 mo6389xf8cd5f12() {
        return this.f2223xe570fd1c;
    }

    /* renamed from: hashCode */
    public int m6390x8cdac1b() {
        return ((this.f2222x4024a04e.hashCode() ^ 1000003) * 1000003) ^ this.f2223xe570fd1c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6391x9616526c() {
        return "DualOutConfig{primaryOutConfig=" + this.f2222x4024a04e + ", secondaryOutConfig=" + this.f2223xe570fd1c + "}";
    }
}
