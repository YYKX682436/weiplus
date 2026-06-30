package g1;

/* loaded from: classes14.dex */
public final class c implements g1.i {

    /* renamed from: d, reason: collision with root package name */
    public final g1.a f349039d = new g1.a(null, null, null, 0, 15, null);

    /* renamed from: e, reason: collision with root package name */
    public final g1.g f349040e = new g1.b(this);

    /* renamed from: f, reason: collision with root package name */
    public e1.n0 f349041f;

    /* renamed from: g, reason: collision with root package name */
    public e1.n0 f349042g;

    public static e1.n0 b(g1.c cVar, long j17, g1.j jVar, float f17, e1.z zVar, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 32) != 0) {
            i18 = 1;
        }
        e1.n0 j18 = cVar.j(jVar);
        long i27 = cVar.i(j17, f17);
        e1.g gVar = (e1.g) j18;
        android.graphics.Paint paint = gVar.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
        if (!e1.y.c(e1.a0.b(paint.getColor()), i27)) {
            gVar.e(i27);
        }
        if (gVar.f327789c != null) {
            gVar.h(null);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f327790d, zVar)) {
            gVar.f(zVar);
        }
        if (!(gVar.f327788b == i17)) {
            gVar.d(i17);
        }
        android.graphics.Paint paint2 = gVar.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
        if (!(paint2.isFilterBitmap() == i18)) {
            gVar.g(i18);
        }
        return j18;
    }

    public static /* synthetic */ e1.n0 g(g1.c cVar, e1.r rVar, g1.j jVar, float f17, e1.z zVar, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 32) != 0) {
            i18 = 1;
        }
        return cVar.c(rVar, jVar, f17, zVar, i17, i18);
    }

    @Override // g1.i
    public void A(long j17, long j18, long j19, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.q(d1.e.c(j18), d1.e.d(j18), d1.e.c(j18) + d1.k.d(j19), d1.e.d(j18) + d1.k.b(j19), b(this, j17, style, f17, zVar, i17, 0, 32, null));
    }

    @Override // g1.i
    public void F(long j17, long j18, long j19, float f17, int i17, e1.q0 q0Var, float f18, e1.z zVar, int i18) {
        e1.u uVar = this.f349039d.f349035c;
        e1.n0 n0Var = this.f349042g;
        e1.n0 n0Var2 = n0Var;
        if (n0Var == null) {
            e1.g gVar = new e1.g();
            gVar.l(1);
            this.f349042g = gVar;
            n0Var2 = gVar;
        }
        long i19 = i(j17, f18);
        e1.g gVar2 = (e1.g) n0Var2;
        android.graphics.Paint paint = gVar2.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
        if (!e1.y.c(e1.a0.b(paint.getColor()), i19)) {
            gVar2.e(i19);
        }
        if (gVar2.f327789c != null) {
            gVar2.h(null);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar2.f327790d, zVar)) {
            gVar2.f(zVar);
        }
        if (!(gVar2.f327788b == i18)) {
            gVar2.d(i18);
        }
        android.graphics.Paint paint2 = gVar2.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
        if (!(paint2.getStrokeWidth() == f17)) {
            gVar2.k(f17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
        if (!(paint2.getStrokeMiter() == 4.0f)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
            paint2.setStrokeMiter(4.0f);
        }
        if (!(gVar2.a() == i17)) {
            gVar2.i(i17);
        }
        if (!(gVar2.b() == 0)) {
            gVar2.j(0);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, q0Var)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(q0Var);
            paint2.setPathEffect(null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
        if (!(paint2.isFilterBitmap())) {
            gVar2.g(1);
        }
        uVar.u(j18, j19, n0Var2);
    }

    @Override // p2.f
    public int G(float f17) {
        return p2.e.a(this, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return p2.e.d(this, j17);
    }

    @Override // g1.i
    public void L(e1.r brush, long j17, long j18, long j19, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.s(d1.e.c(j17), d1.e.d(j17), d1.e.c(j17) + d1.k.d(j18), d1.e.d(j17) + d1.k.b(j18), d1.a.b(j19), d1.a.c(j19), g(this, brush, style, f17, zVar, i17, 0, 32, null));
    }

    @Override // g1.i
    public void M(long j17, long j18, long j19, long j27, g1.j style, float f17, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.s(d1.e.c(j18), d1.e.d(j18), d1.e.c(j18) + d1.k.d(j19), d1.e.d(j18) + d1.k.b(j19), d1.a.b(j27), d1.a.c(j27), b(this, j17, style, f17, zVar, i17, 0, 32, null));
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * mo7005x9a59d0b2();
    }

    @Override // g1.i
    public void T(e1.p0 path, e1.r brush, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.l(path, g(this, brush, style, f17, zVar, i17, 0, 32, null));
    }

    @Override // g1.i
    public void U(long j17, float f17, long j18, float f18, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.r(j18, f17, b(this, j17, style, f18, zVar, i17, 0, 32, null));
    }

    @Override // g1.i
    public long a() {
        return ((g1.b) p()).b();
    }

    public final e1.n0 c(e1.r rVar, g1.j jVar, float f17, e1.z zVar, int i17, int i18) {
        e1.n0 j17 = j(jVar);
        if (rVar != null) {
            rVar.a(a(), j17, f17);
        } else {
            e1.g gVar = (e1.g) j17;
            android.graphics.Paint paint = gVar.f327787a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
            if (!(((float) paint.getAlpha()) / 255.0f == f17)) {
                gVar.c(f17);
            }
        }
        e1.g gVar2 = (e1.g) j17;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar2.f327790d, zVar)) {
            gVar2.f(zVar);
        }
        if (!(gVar2.f327788b == i17)) {
            gVar2.d(i17);
        }
        android.graphics.Paint paint2 = gVar2.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
        if (!(paint2.isFilterBitmap() == i18)) {
            gVar2.g(i18);
        }
        return j17;
    }

    @Override // g1.i
    public void d(e1.r brush, long j17, long j18, float f17, int i17, e1.q0 q0Var, float f18, e1.z zVar, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        e1.u uVar = this.f349039d.f349035c;
        e1.n0 n0Var = this.f349042g;
        e1.n0 n0Var2 = n0Var;
        if (n0Var == null) {
            e1.g gVar = new e1.g();
            gVar.l(1);
            this.f349042g = gVar;
            n0Var2 = gVar;
        }
        brush.a(a(), n0Var2, f18);
        e1.g gVar2 = (e1.g) n0Var2;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar2.f327790d, zVar)) {
            gVar2.f(zVar);
        }
        if (!(gVar2.f327788b == i18)) {
            gVar2.d(i18);
        }
        android.graphics.Paint paint = gVar2.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
        if (!(paint.getStrokeWidth() == f17)) {
            gVar2.k(f17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
        if (!(paint.getStrokeMiter() == 4.0f)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
            paint.setStrokeMiter(4.0f);
        }
        if (!(gVar2.a() == i17)) {
            gVar2.i(i17);
        }
        if (!(gVar2.b() == 0)) {
            gVar2.j(0);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, q0Var)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(q0Var);
            paint.setPathEffect(null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
        if (!(paint.isFilterBitmap())) {
            gVar2.g(1);
        }
        uVar.u(j17, j18, n0Var2);
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    @Override // g1.i
    public void f(e1.g0 image, long j17, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.f(image, j17, g(this, null, style, f17, zVar, i17, 0, 32, null));
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f349039d.f349033a.mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f349039d.f349033a.mo7006xa2f3d785();
    }

    @Override // g1.i
    /* renamed from: getLayoutDirection */
    public p2.s mo130620x6fcfed3f() {
        return this.f349039d.f349034b;
    }

    @Override // g1.i
    public void h(long j17, float f17, float f18, boolean z17, long j18, long j19, float f19, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.j(d1.e.c(j18), d1.e.d(j18), d1.e.c(j18) + d1.k.d(j19), d1.e.d(j18) + d1.k.b(j19), f17, f18, z17, b(this, j17, style, f19, zVar, i17, 0, 32, null));
    }

    public final long i(long j17, float f17) {
        return !((f17 > 1.0f ? 1 : (f17 == 1.0f ? 0 : -1)) == 0) ? e1.y.b(j17, e1.y.d(j17) * f17, 0.0f, 0.0f, 0.0f, 14, null) : j17;
    }

    public final e1.n0 j(g1.j jVar) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar, g1.m.f349045a)) {
            e1.n0 n0Var = this.f349041f;
            if (n0Var != null) {
                return n0Var;
            }
            e1.g gVar = new e1.g();
            gVar.l(0);
            this.f349041f = gVar;
            return gVar;
        }
        if (!(jVar instanceof g1.n)) {
            throw new jz5.j();
        }
        e1.n0 n0Var2 = this.f349042g;
        e1.n0 n0Var3 = n0Var2;
        if (n0Var2 == null) {
            e1.g gVar2 = new e1.g();
            gVar2.l(1);
            this.f349042g = gVar2;
            n0Var3 = gVar2;
        }
        e1.g gVar3 = (e1.g) n0Var3;
        android.graphics.Paint paint = gVar3.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
        float strokeWidth = paint.getStrokeWidth();
        g1.n nVar = (g1.n) jVar;
        float f17 = nVar.f349046a;
        if (!(strokeWidth == f17)) {
            gVar3.k(f17);
        }
        int a17 = gVar3.a();
        int i17 = nVar.f349048c;
        if (!(a17 == i17)) {
            gVar3.i(i17);
        }
        android.graphics.Paint paint2 = gVar3.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
        float strokeMiter = paint2.getStrokeMiter();
        float f18 = nVar.f349047b;
        if (!(strokeMiter == f18)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
            paint2.setStrokeMiter(f18);
        }
        int b17 = gVar3.b();
        int i18 = nVar.f349049d;
        if (!(b17 == i18)) {
            gVar3.j(i18);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
            paint2.setPathEffect(null);
        }
        return n0Var3;
    }

    @Override // p2.f
    public float n(int i17) {
        return p2.e.b(this, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / mo7005x9a59d0b2();
    }

    @Override // g1.i
    public g1.g p() {
        return this.f349040e;
    }

    @Override // g1.i
    public void q(e1.r brush, long j17, long j18, float f17, g1.j style, e1.z zVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.q(d1.e.c(j17), d1.e.d(j17), d1.e.c(j17) + d1.k.d(j18), d1.e.d(j17) + d1.k.b(j18), g(this, brush, style, f17, zVar, i17, 0, 32, null));
    }

    @Override // g1.i
    public long r() {
        return d1.l.b(((g1.b) p()).b());
    }

    @Override // p2.f
    public long t(long j17) {
        return p2.e.e(this, j17);
    }

    @Override // g1.i
    public void w(e1.g0 image, long j17, long j18, long j19, long j27, float f17, g1.j style, e1.z zVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f349039d.f349035c.t(image, j17, j18, j19, j27, c(null, style, f17, zVar, i17, i18));
    }

    @Override // p2.f
    public long z(float f17) {
        return p2.e.f(this, f17);
    }
}
