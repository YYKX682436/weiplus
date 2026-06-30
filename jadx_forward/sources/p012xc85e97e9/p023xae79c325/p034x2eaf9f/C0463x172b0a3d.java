package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.AutoValue_SurfaceRequest_Result */
/* loaded from: classes14.dex */
public final class C0463x172b0a3d extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result {

    /* renamed from: resultCode */
    private final int f819xdde293aa;

    /* renamed from: surface */
    private final android.view.Surface f820x9189ecad;

    public C0463x172b0a3d(int i17, android.view.Surface surface) {
        this.f819xdde293aa = i17;
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.f820x9189ecad = surface;
    }

    /* renamed from: equals */
    public boolean m4238xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result result = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result) obj;
        return this.f819xdde293aa == result.mo4239xcc234ba0() && this.f820x9189ecad.equals(result.mo4240xcf572877());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result
    /* renamed from: getResultCode */
    public int mo4239xcc234ba0() {
        return this.f819xdde293aa;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result
    /* renamed from: getSurface */
    public android.view.Surface mo4240xcf572877() {
        return this.f820x9189ecad;
    }

    /* renamed from: hashCode */
    public int m4241x8cdac1b() {
        return ((this.f819xdde293aa ^ 1000003) * 1000003) ^ this.f820x9189ecad.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4242x9616526c() {
        return "Result{resultCode=" + this.f819xdde293aa + ", surface=" + this.f820x9189ecad + "}";
    }
}
