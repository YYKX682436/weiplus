package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In */
/* loaded from: classes14.dex */
public final class C0877xc04d7200 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In {

    /* renamed from: outConfigs */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> f2142x5d109a43;

    /* renamed from: surfaceEdge */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f2143xac5ab00a;

    public C0877xc04d7200(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> list) {
        if (c0905xfc457ea == null) {
            throw new java.lang.NullPointerException("Null surfaceEdge");
        }
        this.f2143xac5ab00a = c0905xfc457ea;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outConfigs");
        }
        this.f2142x5d109a43 = list;
    }

    /* renamed from: equals */
    public boolean m6264xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In in6 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In) obj;
        return this.f2143xac5ab00a.equals(in6.mo6266x8630f6d4()) && this.f2142x5d109a43.equals(in6.mo6265x4b515239());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In
    /* renamed from: getOutConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> mo6265x4b515239() {
        return this.f2142x5d109a43;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In
    /* renamed from: getSurfaceEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6266x8630f6d4() {
        return this.f2143xac5ab00a;
    }

    /* renamed from: hashCode */
    public int m6267x8cdac1b() {
        return ((this.f2143xac5ab00a.hashCode() ^ 1000003) * 1000003) ^ this.f2142x5d109a43.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6268x9616526c() {
        return "In{surfaceEdge=" + this.f2143xac5ab00a + ", outConfigs=" + this.f2142x5d109a43 + "}";
    }
}
