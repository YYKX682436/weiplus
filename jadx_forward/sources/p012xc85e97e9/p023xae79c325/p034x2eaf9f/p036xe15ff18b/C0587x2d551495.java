package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.AutoValue_Image2JpegBytes_In */
/* loaded from: classes14.dex */
final class C0587x2d551495 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In {

    /* renamed from: jpegQuality */
    private final int f1305x5b75b377;

    /* renamed from: packet */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> f1306xc4a44c88;

    public C0587x2d551495(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> abstractC0903x8e0938a8, int i17) {
        if (abstractC0903x8e0938a8 == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.f1306xc4a44c88 = abstractC0903x8e0938a8;
        this.f1305x5b75b377 = i17;
    }

    /* renamed from: equals */
    public boolean m4885xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In in6 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In) obj;
        return this.f1306xc4a44c88.equals(in6.mo4887x29bb6f7e()) && this.f1305x5b75b377 == in6.mo4886x354bfa41();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In
    /* renamed from: getJpegQuality */
    public int mo4886x354bfa41() {
        return this.f1305x5b75b377;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In
    /* renamed from: getPacket */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> mo4887x29bb6f7e() {
        return this.f1306xc4a44c88;
    }

    /* renamed from: hashCode */
    public int m4888x8cdac1b() {
        return ((this.f1306xc4a44c88.hashCode() ^ 1000003) * 1000003) ^ this.f1305x5b75b377;
    }

    /* renamed from: toString */
    public java.lang.String m4889x9616526c() {
        return "In{packet=" + this.f1306xc4a44c88 + ", jpegQuality=" + this.f1305x5b75b377 + "}";
    }
}
