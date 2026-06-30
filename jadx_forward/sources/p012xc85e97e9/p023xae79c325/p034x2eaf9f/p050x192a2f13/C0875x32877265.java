package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot */
/* loaded from: classes14.dex */
final class C0875x32877265 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot {

    /* renamed from: completer */
    private final t2.k f2131xac60f659;

    /* renamed from: jpegQuality */
    private final int f2132x5b75b377;

    /* renamed from: rotationDegrees */
    private final int f2133x461e29c9;

    public C0875x32877265(int i17, int i18, t2.k kVar) {
        this.f2132x5b75b377 = i17;
        this.f2133x461e29c9 = i18;
        if (kVar == null) {
            throw new java.lang.NullPointerException("Null completer");
        }
        this.f2131xac60f659 = kVar;
    }

    /* renamed from: equals */
    public boolean m6247xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot pendingSnapshot = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot) obj;
        return this.f2132x5b75b377 == pendingSnapshot.mo6249x354bfa41() && this.f2133x461e29c9 == pendingSnapshot.mo6250x2a7ffb93() && this.f2131xac60f659.equals(pendingSnapshot.mo6248xabce67a3());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot
    /* renamed from: getCompleter */
    public t2.k mo6248xabce67a3() {
        return this.f2131xac60f659;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot
    /* renamed from: getJpegQuality */
    public int mo6249x354bfa41() {
        return this.f2132x5b75b377;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot
    /* renamed from: getRotationDegrees */
    public int mo6250x2a7ffb93() {
        return this.f2133x461e29c9;
    }

    /* renamed from: hashCode */
    public int m6251x8cdac1b() {
        return ((((this.f2132x5b75b377 ^ 1000003) * 1000003) ^ this.f2133x461e29c9) * 1000003) ^ this.f2131xac60f659.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6252x9616526c() {
        return "PendingSnapshot{jpegQuality=" + this.f2132x5b75b377 + ", rotationDegrees=" + this.f2133x461e29c9 + ", completer=" + this.f2131xac60f659 + "}";
    }
}
