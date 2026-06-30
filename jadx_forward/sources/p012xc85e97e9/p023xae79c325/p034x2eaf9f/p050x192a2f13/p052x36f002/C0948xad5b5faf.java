package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002;

/* renamed from: androidx.camera.core.processing.util.AutoValue_OutputSurface */
/* loaded from: classes14.dex */
final class C0948xad5b5faf extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c {

    /* renamed from: eglSurface */
    private final android.opengl.EGLSurface f2265xd043bd43;

    /* renamed from: height */
    private final int f2266xb7389127;

    /* renamed from: width */
    private final int f2267x6be2dc6;

    public C0948xad5b5faf(android.opengl.EGLSurface eGLSurface, int i17, int i18) {
        if (eGLSurface == null) {
            throw new java.lang.NullPointerException("Null eglSurface");
        }
        this.f2265xd043bd43 = eGLSurface;
        this.f2267x6be2dc6 = i17;
        this.f2266xb7389127 = i18;
    }

    /* renamed from: equals */
    public boolean m6447xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c abstractC0952x4073a84c = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c) obj;
        return this.f2265xd043bd43.equals(abstractC0952x4073a84c.mo6448xbe847539()) && this.f2267x6be2dc6 == abstractC0952x4073a84c.mo6450x755bd410() && this.f2266xb7389127 == abstractC0952x4073a84c.mo6449x1c4fb41d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c
    /* renamed from: getEglSurface */
    public android.opengl.EGLSurface mo6448xbe847539() {
        return this.f2265xd043bd43;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c
    /* renamed from: getHeight */
    public int mo6449x1c4fb41d() {
        return this.f2266xb7389127;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c
    /* renamed from: getWidth */
    public int mo6450x755bd410() {
        return this.f2267x6be2dc6;
    }

    /* renamed from: hashCode */
    public int m6451x8cdac1b() {
        return ((((this.f2265xd043bd43.hashCode() ^ 1000003) * 1000003) ^ this.f2267x6be2dc6) * 1000003) ^ this.f2266xb7389127;
    }

    /* renamed from: toString */
    public java.lang.String m6452x9616526c() {
        return "OutputSurface{eglSurface=" + this.f2265xd043bd43 + ", width=" + this.f2267x6be2dc6 + ", height=" + this.f2266xb7389127 + "}";
    }
}
