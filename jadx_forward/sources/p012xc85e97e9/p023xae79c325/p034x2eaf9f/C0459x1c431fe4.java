package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AutoValue_ImmutableImageInfo */
/* loaded from: classes14.dex */
final class C0459x1c431fe4 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167 {

    /* renamed from: rotationDegrees */
    private final int f802x461e29c9;

    /* renamed from: sensorToBufferTransformMatrix */
    private final android.graphics.Matrix f803x74c16918;

    /* renamed from: tagBundle */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c f804x4b3a40bc;

    /* renamed from: timestamp */
    private final long f805x3492916;

    public C0459x1c431fe4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, long j17, int i17, android.graphics.Matrix matrix) {
        if (c0760xc2ac609c == null) {
            throw new java.lang.NullPointerException("Null tagBundle");
        }
        this.f804x4b3a40bc = c0760xc2ac609c;
        this.f805x3492916 = j17;
        this.f802x461e29c9 = i17;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f803x74c16918 = matrix;
    }

    /* renamed from: equals */
    public boolean m4208xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167 abstractC0541xa100b167 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167) obj;
        return this.f804x4b3a40bc.equals(abstractC0541xa100b167.mo4211x4aa7b206()) && this.f805x3492916 == abstractC0541xa100b167.mo4212x2b69a60() && this.f802x461e29c9 == abstractC0541xa100b167.mo4209x2a7ffb93() && this.f803x74c16918.equals(abstractC0541xa100b167.mo4210xa4435162());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getRotationDegrees */
    public int mo4209x2a7ffb93() {
        return this.f802x461e29c9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getSensorToBufferTransformMatrix */
    public android.graphics.Matrix mo4210xa4435162() {
        return this.f803x74c16918;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getTagBundle */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c mo4211x4aa7b206() {
        return this.f804x4b3a40bc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getTimestamp */
    public long mo4212x2b69a60() {
        return this.f805x3492916;
    }

    /* renamed from: hashCode */
    public int m4213x8cdac1b() {
        int hashCode = (this.f804x4b3a40bc.hashCode() ^ 1000003) * 1000003;
        long j17 = this.f805x3492916;
        return ((((hashCode ^ ((int) (j17 ^ (j17 >>> 32)))) * 1000003) ^ this.f802x461e29c9) * 1000003) ^ this.f803x74c16918.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4214x9616526c() {
        return "ImmutableImageInfo{tagBundle=" + this.f804x4b3a40bc + ", timestamp=" + this.f805x3492916 + ", rotationDegrees=" + this.f802x461e29c9 + ", sensorToBufferTransformMatrix=" + this.f803x74c16918 + "}";
    }
}
