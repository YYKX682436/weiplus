package e04;

/* loaded from: classes15.dex */
public final class g1 extends e04.f1 {

    /* renamed from: i, reason: collision with root package name */
    public boolean f327476i;

    /* renamed from: j, reason: collision with root package name */
    public qt5.d f327477j;

    public g1() {
        super(null, 0L, 3, null);
    }

    public void a() {
        this.f327450a = null;
        this.f327451b = -1L;
        this.f327452c = false;
        this.f327453d = false;
        this.f327454e = -1L;
        this.f327455f = -1L;
        this.f327456g = -1L;
        this.f327457h = false;
        this.f327476i = false;
    }

    @Override // e04.f1
    /* renamed from: toString */
    public java.lang.String mo126570x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OpenCameraTaskResult{errCode: ");
        qt5.d dVar = this.f327477j;
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f448210a) : null);
        sb6.append(", opened: ");
        sb6.append(this.f327476i);
        sb6.append(", ");
        sb6.append(super.mo126570x9616526c());
        sb6.append('}');
        return sb6.toString();
    }
}
