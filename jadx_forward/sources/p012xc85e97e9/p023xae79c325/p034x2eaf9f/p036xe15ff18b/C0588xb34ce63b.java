package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.imagecapture.AutoValue_JpegBytes2Disk_In */
/* loaded from: classes13.dex */
public final class C0588xb34ce63b extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In {

    /* renamed from: outputFileOptions */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions f1307xa243d9c1;

    /* renamed from: packet */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> f1308xc4a44c88;

    public C0588xb34ce63b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> abstractC0903x8e0938a8, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        if (abstractC0903x8e0938a8 == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.f1308xc4a44c88 = abstractC0903x8e0938a8;
        if (outputFileOptions == null) {
            throw new java.lang.NullPointerException("Null outputFileOptions");
        }
        this.f1307xa243d9c1 = outputFileOptions;
    }

    /* renamed from: equals */
    public boolean m4890xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In in6 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In) obj;
        return this.f1308xc4a44c88.equals(in6.mo4892x29bb6f7e()) && this.f1307xa243d9c1.equals(in6.mo4891xf578610b());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In
    /* renamed from: getOutputFileOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions mo4891xf578610b() {
        return this.f1307xa243d9c1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In
    /* renamed from: getPacket */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> mo4892x29bb6f7e() {
        return this.f1308xc4a44c88;
    }

    /* renamed from: hashCode */
    public int m4893x8cdac1b() {
        return ((this.f1308xc4a44c88.hashCode() ^ 1000003) * 1000003) ^ this.f1307xa243d9c1.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4894x9616526c() {
        return "In{packet=" + this.f1308xc4a44c88 + ", outputFileOptions=" + this.f1307xa243d9c1 + "}";
    }
}
