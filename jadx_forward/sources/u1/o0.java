package u1;

/* loaded from: classes14.dex */
public final class o0 implements g1.i, g1.f {

    /* renamed from: d, reason: collision with root package name */
    public final g1.c f505185d;

    /* renamed from: e, reason: collision with root package name */
    public u1.o f505186e;

    public o0(g1.c canvasDrawScope, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        canvasDrawScope = (i17 & 1) != 0 ? new g1.c() : canvasDrawScope;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasDrawScope, "canvasDrawScope");
        this.f505185d = canvasDrawScope;
    }

    @Override // g1.i
    public void A(long j17, long j18, long j19, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.A(j17, j18, j19, f17, style, zVar, i17);
    }

    @Override // g1.i
    public void F(long j17, long j18, long j19, float f17, int i17, e1.q0 q0Var, float f18, e1.z zVar, int i18) {
        this.f505185d.F(j17, j18, j19, f17, i17, q0Var, f18, zVar, i18);
    }

    @Override // p2.f
    public int G(float f17) {
        g1.c cVar = this.f505185d;
        cVar.getClass();
        return p2.e.a(cVar, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        g1.c cVar = this.f505185d;
        cVar.getClass();
        return p2.e.d(cVar, j17);
    }

    @Override // g1.i
    public void L(e1.r brush, long j17, long j18, long j19, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.L(brush, j17, j18, j19, f17, style, zVar, i17);
    }

    @Override // g1.i
    public void M(long j17, long j18, long j19, long j27, g1.j style, float f17, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.M(j17, j18, j19, j27, style, f17, zVar, i17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * this.f505185d.mo7005x9a59d0b2();
    }

    @Override // g1.i
    public void T(e1.p0 path, e1.r brush, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.T(path, brush, f17, style, zVar, i17);
    }

    @Override // g1.i
    public void U(long j17, float f17, long j18, float f18, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.U(j17, f17, j18, f18, style, zVar, i17);
    }

    @Override // g1.i
    public long a() {
        return this.f505185d.a();
    }

    public void b() {
        e1.u a17 = ((g1.b) p()).a();
        u1.o oVar = this.f505186e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        u1.o oVar2 = (u1.o) oVar.f505189f;
        if (oVar2 != null) {
            oVar2.c(a17);
        } else {
            oVar.f505187d.y0(a17);
        }
    }

    @Override // g1.i
    public void d(e1.r brush, long j17, long j18, float f17, int i17, e1.q0 q0Var, float f18, e1.z zVar, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        this.f505185d.d(brush, j17, j18, f17, i17, q0Var, f18, zVar, i18);
    }

    @Override // p2.f
    public long e(long j17) {
        g1.c cVar = this.f505185d;
        cVar.getClass();
        return p2.e.c(cVar, j17);
    }

    @Override // g1.i
    public void f(e1.g0 image, long j17, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.f(image, j17, f17, style, zVar, i17);
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f505185d.mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f505185d.mo7006xa2f3d785();
    }

    @Override // g1.i
    /* renamed from: getLayoutDirection */
    public p2.s mo130620x6fcfed3f() {
        return this.f505185d.f349039d.f349034b;
    }

    @Override // g1.i
    public void h(long j17, float f17, float f18, boolean z17, long j18, long j19, float f19, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.h(j17, f17, f18, z17, j18, j19, f19, style, zVar, i17);
    }

    @Override // p2.f
    public float n(int i17) {
        g1.c cVar = this.f505185d;
        cVar.getClass();
        return p2.e.b(cVar, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / this.f505185d.mo7005x9a59d0b2();
    }

    @Override // g1.i
    public g1.g p() {
        return this.f505185d.f349040e;
    }

    @Override // g1.i
    public void q(e1.r brush, long j17, long j18, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.q(brush, j17, j18, f17, style, zVar, i17);
    }

    @Override // g1.i
    public long r() {
        return this.f505185d.r();
    }

    @Override // p2.f
    public long t(long j17) {
        g1.c cVar = this.f505185d;
        cVar.getClass();
        return p2.e.e(cVar, j17);
    }

    @Override // g1.i
    public void w(e1.g0 image, long j17, long j18, long j19, long j27, float f17, g1.j style, e1.z zVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f505185d.w(image, j17, j18, j19, j27, f17, style, zVar, i17, i18);
    }

    @Override // p2.f
    public long z(float f17) {
        g1.c cVar = this.f505185d;
        cVar.getClass();
        return p2.e.f(cVar, f17);
    }
}
