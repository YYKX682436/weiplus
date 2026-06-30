package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.AutoValue_ProcessingNode_In */
/* loaded from: classes14.dex */
final class C0589xb63553d2 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In {

    /* renamed from: edge */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> f1309x2f6dbd;

    /* renamed from: inputFormat */
    private final int f1310xd74dbc61;

    /* renamed from: outputFormat */
    private final int f1311xe1c57858;

    /* renamed from: postviewEdge */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> f1312x20223aa2;

    public C0589xb63553d2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> c0895x20e1dd, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> c0895x20e1dd2, int i17, int i18) {
        if (c0895x20e1dd == null) {
            throw new java.lang.NullPointerException("Null edge");
        }
        this.f1309x2f6dbd = c0895x20e1dd;
        if (c0895x20e1dd2 == null) {
            throw new java.lang.NullPointerException("Null postviewEdge");
        }
        this.f1312x20223aa2 = c0895x20e1dd2;
        this.f1310xd74dbc61 = i17;
        this.f1311xe1c57858 = i18;
    }

    /* renamed from: equals */
    public boolean m4895xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In in6 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In) obj;
        return this.f1309x2f6dbd.equals(in6.mo4896xfb7ed633()) && this.f1312x20223aa2.equals(in6.mo4899x8114cd18()) && this.f1310xd74dbc61 == in6.mo4897xb124032b() && this.f1311xe1c57858 == in6.mo4898x42b80ace();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In
    /* renamed from: getEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> mo4896xfb7ed633() {
        return this.f1309x2f6dbd;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In
    /* renamed from: getInputFormat */
    public int mo4897xb124032b() {
        return this.f1310xd74dbc61;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In
    /* renamed from: getOutputFormat */
    public int mo4898x42b80ace() {
        return this.f1311xe1c57858;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In
    /* renamed from: getPostviewEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> mo4899x8114cd18() {
        return this.f1312x20223aa2;
    }

    /* renamed from: hashCode */
    public int m4900x8cdac1b() {
        return ((((((this.f1309x2f6dbd.hashCode() ^ 1000003) * 1000003) ^ this.f1312x20223aa2.hashCode()) * 1000003) ^ this.f1310xd74dbc61) * 1000003) ^ this.f1311xe1c57858;
    }

    /* renamed from: toString */
    public java.lang.String m4901x9616526c() {
        return "In{edge=" + this.f1309x2f6dbd + ", postviewEdge=" + this.f1312x20223aa2 + ", inputFormat=" + this.f1310xd74dbc61 + ", outputFormat=" + this.f1311xe1c57858 + "}";
    }
}
