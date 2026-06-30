package af1;

/* loaded from: classes15.dex */
public class v implements u9.t, n8.n, z8.f, i9.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af1.x f4499d;

    public v(af1.x xVar, af1.k kVar) {
        this.f4499d = xVar;
    }

    @Override // n8.n
    public void B(com.google.android.exoplayer2.Format format) {
        this.f4499d.A.B(format);
    }

    @Override // i9.k
    public void a(java.util.List list) {
    }

    @Override // n8.n
    public void c(java.lang.String str, long j17, long j18) {
        this.f4499d.A.c(str, j17, j18);
    }

    @Override // u9.t
    public void g(int i17, long j17) {
        this.f4499d.A.C();
    }

    @Override // u9.t
    public void h(int i17, int i18, int i19, float f17) {
        af1.x xVar = this.f4499d;
        xVar.A.h(i17, i18, i19, f17);
        xVar.getClass();
        android.util.Size size = new android.util.Size(i17, i18);
        int width = size.getWidth();
        int height = size.getHeight();
        xVar.F = width;
        xVar.G = height;
        xVar.L(width, height);
    }

    @Override // n8.n
    public void i(o8.f fVar) {
        af1.x xVar = this.f4499d;
        xVar.A.i(fVar);
        xVar.W = null;
    }

    @Override // u9.t
    public void j(o8.f fVar) {
        af1.x xVar = this.f4499d;
        xVar.A.C();
        xVar.V = fVar;
    }

    @Override // u9.t
    public void l(java.lang.String str, long j17, long j18) {
        this.f4499d.A.C();
    }

    @Override // n8.n
    public void m(int i17) {
        this.f4499d.A.getClass();
    }

    @Override // u9.t
    public void n(android.view.Surface surface) {
        af1.x xVar = this.f4499d;
        xVar.A.n(surface);
        xVar.I(3, 0);
    }

    @Override // n8.n
    public void o(o8.f fVar) {
        af1.x xVar = this.f4499d;
        xVar.A.C();
        xVar.W = fVar;
    }

    @Override // z8.f
    public void p(com.google.android.exoplayer2.metadata.Metadata metadata) {
        this.f4499d.A.F(metadata, "  ");
    }

    @Override // u9.t
    public void q(o8.f fVar) {
        af1.x xVar = this.f4499d;
        xVar.A.q(fVar);
        xVar.V = null;
    }

    @Override // u9.t
    public void s(com.google.android.exoplayer2.Format format) {
        this.f4499d.A.s(format);
    }

    @Override // n8.n
    public void x(int i17, long j17, long j18) {
        this.f4499d.A.x(i17, j17, j18);
    }
}
