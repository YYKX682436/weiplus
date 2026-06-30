package e04;

/* loaded from: classes15.dex */
public final class h1 extends e04.f1 {

    /* renamed from: i, reason: collision with root package name */
    public boolean f327482i;

    /* renamed from: j, reason: collision with root package name */
    public qt5.d f327483j;

    public h1() {
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
        this.f327482i = false;
    }

    @Override // e04.f1
    /* renamed from: toString */
    public java.lang.String mo126570x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreviewCameraTaskResult{errCode: ");
        qt5.d dVar = this.f327483j;
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f448210a) : null);
        sb6.append(", previewed: ");
        sb6.append(this.f327482i);
        sb6.append(", ");
        sb6.append(super.mo126570x9616526c());
        sb6.append('}');
        return sb6.toString();
    }
}
