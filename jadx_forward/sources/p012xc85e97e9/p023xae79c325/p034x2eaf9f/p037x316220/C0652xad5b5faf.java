package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_OutputSurface */
/* loaded from: classes14.dex */
final class C0652xad5b5faf extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c {

    /* renamed from: imageFormat */
    private final int f1454x6b33dd32;

    /* renamed from: size */
    private final android.util.Size f1455x35e001;

    /* renamed from: surface */
    private final android.view.Surface f1456x9189ecad;

    public C0652xad5b5faf(android.view.Surface surface, android.util.Size size, int i17) {
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.f1456x9189ecad = surface;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.f1455x35e001 = size;
        this.f1454x6b33dd32 = i17;
    }

    /* renamed from: equals */
    public boolean m5154xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c) obj;
        return this.f1456x9189ecad.equals(abstractC0737x4073a84c.mo5157xcf572877()) && this.f1455x35e001.equals(abstractC0737x4073a84c.mo5156xfb854877()) && this.f1454x6b33dd32 == abstractC0737x4073a84c.mo5155x450a23fc();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c
    /* renamed from: getImageFormat */
    public int mo5155x450a23fc() {
        return this.f1454x6b33dd32;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c
    /* renamed from: getSize */
    public android.util.Size mo5156xfb854877() {
        return this.f1455x35e001;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c
    /* renamed from: getSurface */
    public android.view.Surface mo5157xcf572877() {
        return this.f1456x9189ecad;
    }

    /* renamed from: hashCode */
    public int m5158x8cdac1b() {
        return ((((this.f1456x9189ecad.hashCode() ^ 1000003) * 1000003) ^ this.f1455x35e001.hashCode()) * 1000003) ^ this.f1454x6b33dd32;
    }

    /* renamed from: toString */
    public java.lang.String m5159x9616526c() {
        return "OutputSurface{surface=" + this.f1456x9189ecad + ", size=" + this.f1455x35e001 + ", imageFormat=" + this.f1454x6b33dd32 + "}";
    }
}
