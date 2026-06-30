package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.AutoValue_Bitmap2JpegBytes_In */
/* loaded from: classes14.dex */
final class C0585x982623a7 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In {

    /* renamed from: jpegQuality */
    private final int f1294x5b75b377;

    /* renamed from: packet */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> f1295xc4a44c88;

    public C0585x982623a7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> abstractC0903x8e0938a8, int i17) {
        if (abstractC0903x8e0938a8 == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.f1295xc4a44c88 = abstractC0903x8e0938a8;
        this.f1294x5b75b377 = i17;
    }

    /* renamed from: equals */
    public boolean m4868xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In in6 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In) obj;
        return this.f1295xc4a44c88.equals(in6.mo4870x29bb6f7e()) && this.f1294x5b75b377 == in6.mo4869x354bfa41();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In
    /* renamed from: getJpegQuality */
    public int mo4869x354bfa41() {
        return this.f1294x5b75b377;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In
    /* renamed from: getPacket */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> mo4870x29bb6f7e() {
        return this.f1295xc4a44c88;
    }

    /* renamed from: hashCode */
    public int m4871x8cdac1b() {
        return ((this.f1295xc4a44c88.hashCode() ^ 1000003) * 1000003) ^ this.f1294x5b75b377;
    }

    /* renamed from: toString */
    public java.lang.String m4872x9616526c() {
        return "In{packet=" + this.f1295xc4a44c88 + ", jpegQuality=" + this.f1294x5b75b377 + "}";
    }
}
