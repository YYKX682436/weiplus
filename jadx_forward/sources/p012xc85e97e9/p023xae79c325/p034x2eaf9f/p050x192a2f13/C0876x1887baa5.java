package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.processing.AutoValue_Packet */
/* loaded from: classes14.dex */
public final class C0876x1887baa5<T> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<T> {

    /* renamed from: cameraCaptureResult */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be f2134x95cddfde;

    /* renamed from: cropRect */
    private final android.graphics.Rect f2135x7e55c094;

    /* renamed from: data */
    private final T f2136x2eefaa;

    /* renamed from: exif */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 f2137x2fb910;

    /* renamed from: format */
    private final int f2138xb45ff7f7;

    /* renamed from: rotationDegrees */
    private final int f2139x461e29c9;

    /* renamed from: sensorToBufferTransform */
    private final android.graphics.Matrix f2140x9554da77;

    /* renamed from: size */
    private final android.util.Size f2141x35e001;

    public C0876x1887baa5(T t17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, int i17, android.util.Size size, android.graphics.Rect rect, int i18, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        if (t17 == null) {
            throw new java.lang.NullPointerException("Null data");
        }
        this.f2136x2eefaa = t17;
        this.f2137x2fb910 = c0785x212d30;
        this.f2138xb45ff7f7 = i17;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.f2141x35e001 = size;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null cropRect");
        }
        this.f2135x7e55c094 = rect;
        this.f2139x461e29c9 = i18;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransform");
        }
        this.f2140x9554da77 = matrix;
        if (interfaceC0663xe081a7be == null) {
            throw new java.lang.NullPointerException("Null cameraCaptureResult");
        }
        this.f2134x95cddfde = interfaceC0663xe081a7be;
    }

    /* renamed from: equals */
    public boolean m6253xb2c87fbf(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8 abstractC0903x8e0938a8 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8) obj;
        return this.f2136x2eefaa.equals(abstractC0903x8e0938a8.mo6256xfb7e5820()) && ((c0785x212d30 = this.f2137x2fb910) != null ? c0785x212d30.equals(abstractC0903x8e0938a8.mo6257xfb7f2186()) : abstractC0903x8e0938a8.mo6257xfb7f2186() == null) && this.f2138xb45ff7f7 == abstractC0903x8e0938a8.mo6258x19771aed() && this.f2141x35e001.equals(abstractC0903x8e0938a8.mo6261xfb854877()) && this.f2135x7e55c094.equals(abstractC0903x8e0938a8.mo6255xfa2ffe0a()) && this.f2139x461e29c9 == abstractC0903x8e0938a8.mo6259x2a7ffb93() && this.f2140x9554da77.equals(abstractC0903x8e0938a8.mo6260x65554241()) && this.f2134x95cddfde.equals(abstractC0903x8e0938a8.mo6254xedfdbca8());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getCameraCaptureResult */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be mo6254xedfdbca8() {
        return this.f2134x95cddfde;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getCropRect */
    public android.graphics.Rect mo6255xfa2ffe0a() {
        return this.f2135x7e55c094;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getData */
    public T mo6256xfb7e5820() {
        return this.f2136x2eefaa;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getExif */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 mo6257xfb7f2186() {
        return this.f2137x2fb910;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getFormat */
    public int mo6258x19771aed() {
        return this.f2138xb45ff7f7;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getRotationDegrees */
    public int mo6259x2a7ffb93() {
        return this.f2139x461e29c9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getSensorToBufferTransform */
    public android.graphics.Matrix mo6260x65554241() {
        return this.f2140x9554da77;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8
    /* renamed from: getSize */
    public android.util.Size mo6261xfb854877() {
        return this.f2141x35e001;
    }

    /* renamed from: hashCode */
    public int m6262x8cdac1b() {
        int hashCode = (this.f2136x2eefaa.hashCode() ^ 1000003) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30 = this.f2137x2fb910;
        return ((((((((((((hashCode ^ (c0785x212d30 == null ? 0 : c0785x212d30.hashCode())) * 1000003) ^ this.f2138xb45ff7f7) * 1000003) ^ this.f2141x35e001.hashCode()) * 1000003) ^ this.f2135x7e55c094.hashCode()) * 1000003) ^ this.f2139x461e29c9) * 1000003) ^ this.f2140x9554da77.hashCode()) * 1000003) ^ this.f2134x95cddfde.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6263x9616526c() {
        return "Packet{data=" + this.f2136x2eefaa + ", exif=" + this.f2137x2fb910 + ", format=" + this.f2138xb45ff7f7 + ", size=" + this.f2141x35e001 + ", cropRect=" + this.f2135x7e55c094 + ", rotationDegrees=" + this.f2139x461e29c9 + ", sensorToBufferTransform=" + this.f2140x9554da77 + ", cameraCaptureResult=" + this.f2134x95cddfde + "}";
    }
}
