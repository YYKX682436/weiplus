package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.imagecapture.AutoValue_CaptureNode_In */
/* loaded from: classes14.dex */
public final class C0586xb3b1f99 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In {

    /* renamed from: errorEdge */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError> f1296x139d6fe5;

    /* renamed from: imageReaderProxyProvider */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 f1297x699b0521;

    /* renamed from: inputFormat */
    private final int f1298xd74dbc61;

    /* renamed from: outputFormat */
    private final int f1299xe1c57858;

    /* renamed from: postviewImageFormat */
    private final int f1300x3330b4ad;

    /* renamed from: postviewSize */
    private final android.util.Size f1301x2028ace6;

    /* renamed from: requestEdge */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc> f1302x4485f4ec;

    /* renamed from: size */
    private final android.util.Size f1303x35e001;

    /* renamed from: virtualCamera */
    private final boolean f1304xfff91a10;

    public C0586xb3b1f99(android.util.Size size, int i17, int i18, boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941, android.util.Size size2, int i19, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc> c0895x20e1dd, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError> c0895x20e1dd2) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.f1303x35e001 = size;
        this.f1298xd74dbc61 = i17;
        this.f1299xe1c57858 = i18;
        this.f1304xfff91a10 = z17;
        this.f1297x699b0521 = interfaceC0539xe9692941;
        this.f1301x2028ace6 = size2;
        this.f1300x3330b4ad = i19;
        if (c0895x20e1dd == null) {
            throw new java.lang.NullPointerException("Null requestEdge");
        }
        this.f1302x4485f4ec = c0895x20e1dd;
        if (c0895x20e1dd2 == null) {
            throw new java.lang.NullPointerException("Null errorEdge");
        }
        this.f1296x139d6fe5 = c0895x20e1dd2;
    }

    /* renamed from: equals */
    public boolean m4873xb2c87fbf(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941;
        android.util.Size size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In in6 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In) obj;
        return this.f1303x35e001.equals(in6.mo4881xfb854877()) && this.f1298xd74dbc61 == in6.mo4876xb124032b() && this.f1299xe1c57858 == in6.mo4877x42b80ace() && this.f1304xfff91a10 == in6.mo4883x81387106() && ((interfaceC0539xe9692941 = this.f1297x699b0521) != null ? interfaceC0539xe9692941.equals(in6.mo4875x99a79697()) : in6.mo4875x99a79697() == null) && ((size = this.f1301x2028ace6) != null ? size.equals(in6.mo4879x811b3f5c()) : in6.mo4879x811b3f5c() == null) && this.f1300x3330b4ad == in6.mo4878x8b609177() && this.f1302x4485f4ec.equals(in6.mo4880x1e5c3bb6()) && this.f1296x139d6fe5.equals(in6.mo4874x130ae12f());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getErrorEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError> mo4874x130ae12f() {
        return this.f1296x139d6fe5;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getImageReaderProxyProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 mo4875x99a79697() {
        return this.f1297x699b0521;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getInputFormat */
    public int mo4876xb124032b() {
        return this.f1298xd74dbc61;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getOutputFormat */
    public int mo4877x42b80ace() {
        return this.f1299xe1c57858;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getPostviewImageFormat */
    public int mo4878x8b609177() {
        return this.f1300x3330b4ad;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getPostviewSize */
    public android.util.Size mo4879x811b3f5c() {
        return this.f1301x2028ace6;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getRequestEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc> mo4880x1e5c3bb6() {
        return this.f1302x4485f4ec;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: getSize */
    public android.util.Size mo4881xfb854877() {
        return this.f1303x35e001;
    }

    /* renamed from: hashCode */
    public int m4882x8cdac1b() {
        int hashCode = (((((((this.f1303x35e001.hashCode() ^ 1000003) * 1000003) ^ this.f1298xd74dbc61) * 1000003) ^ this.f1299xe1c57858) * 1000003) ^ (this.f1304xfff91a10 ? 1231 : 1237)) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941 = this.f1297x699b0521;
        int hashCode2 = (hashCode ^ (interfaceC0539xe9692941 == null ? 0 : interfaceC0539xe9692941.hashCode())) * 1000003;
        android.util.Size size = this.f1301x2028ace6;
        return ((((((hashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f1300x3330b4ad) * 1000003) ^ this.f1302x4485f4ec.hashCode()) * 1000003) ^ this.f1296x139d6fe5.hashCode();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In
    /* renamed from: isVirtualCamera */
    public boolean mo4883x81387106() {
        return this.f1304xfff91a10;
    }

    /* renamed from: toString */
    public java.lang.String m4884x9616526c() {
        return "In{size=" + this.f1303x35e001 + ", inputFormat=" + this.f1298xd74dbc61 + ", outputFormat=" + this.f1299xe1c57858 + ", virtualCamera=" + this.f1304xfff91a10 + ", imageReaderProxyProvider=" + this.f1297x699b0521 + ", postviewSize=" + this.f1301x2028ace6 + ", postviewImageFormat=" + this.f1300x3330b4ad + ", requestEdge=" + this.f1302x4485f4ec + ", errorEdge=" + this.f1296x139d6fe5 + "}";
    }
}
