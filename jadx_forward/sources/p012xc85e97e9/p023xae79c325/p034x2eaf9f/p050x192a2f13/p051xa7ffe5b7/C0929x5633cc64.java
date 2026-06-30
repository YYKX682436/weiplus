package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.processing.concurrent.AutoValue_DualSurfaceProcessorNode_In */
/* loaded from: classes14.dex */
public final class C0929x5633cc64 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In {

    /* renamed from: outConfigs */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> f2224x5d109a43;

    /* renamed from: primarySurfaceEdge */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f2225x30d5d4a8;

    /* renamed from: secondarySurfaceEdge */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f2226xb47e35f6;

    public C0929x5633cc64(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea2, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> list) {
        if (c0905xfc457ea == null) {
            throw new java.lang.NullPointerException("Null primarySurfaceEdge");
        }
        this.f2225x30d5d4a8 = c0905xfc457ea;
        if (c0905xfc457ea2 == null) {
            throw new java.lang.NullPointerException("Null secondarySurfaceEdge");
        }
        this.f2226xb47e35f6 = c0905xfc457ea2;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outConfigs");
        }
        this.f2224x5d109a43 = list;
    }

    /* renamed from: equals */
    public boolean m6392xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In in6 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In) obj;
        return this.f2225x30d5d4a8.equals(in6.mo6394x4432369e()) && this.f2226xb47e35f6.equals(in6.mo6395x6249f26c()) && this.f2224x5d109a43.equals(in6.mo6393x4b515239());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In
    /* renamed from: getOutConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> mo6393x4b515239() {
        return this.f2224x5d109a43;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In
    /* renamed from: getPrimarySurfaceEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6394x4432369e() {
        return this.f2225x30d5d4a8;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In
    /* renamed from: getSecondarySurfaceEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6395x6249f26c() {
        return this.f2226xb47e35f6;
    }

    /* renamed from: hashCode */
    public int m6396x8cdac1b() {
        return ((((this.f2225x30d5d4a8.hashCode() ^ 1000003) * 1000003) ^ this.f2226xb47e35f6.hashCode()) * 1000003) ^ this.f2224x5d109a43.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6397x9616526c() {
        return "In{primarySurfaceEdge=" + this.f2225x30d5d4a8 + ", secondarySurfaceEdge=" + this.f2226xb47e35f6 + ", outConfigs=" + this.f2224x5d109a43 + "}";
    }
}
