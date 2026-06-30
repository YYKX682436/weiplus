package h1;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public e1.n0 f359485d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359486e;

    /* renamed from: f, reason: collision with root package name */
    public e1.z f359487f;

    /* renamed from: g, reason: collision with root package name */
    public float f359488g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public p2.s f359489h = p2.s.Ltr;

    public abstract boolean a(float f17);

    public abstract boolean e(e1.z zVar);

    public boolean f(p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        return false;
    }

    public final void g(g1.i draw, long j17, float f17, e1.z zVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draw, "$this$draw");
        if (!(this.f359488g == f17)) {
            if (!a(f17)) {
                if (f17 == 1.0f) {
                    e1.n0 n0Var = this.f359485d;
                    if (n0Var != null) {
                        ((e1.g) n0Var).c(f17);
                    }
                    this.f359486e = false;
                } else {
                    e1.n0 n0Var2 = this.f359485d;
                    if (n0Var2 == null) {
                        n0Var2 = new e1.g();
                        this.f359485d = n0Var2;
                    }
                    ((e1.g) n0Var2).c(f17);
                    this.f359486e = true;
                }
            }
            this.f359488g = f17;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359487f, zVar)) {
            if (!e(zVar)) {
                if (zVar == null) {
                    e1.n0 n0Var3 = this.f359485d;
                    if (n0Var3 != null) {
                        ((e1.g) n0Var3).f(null);
                    }
                    this.f359486e = false;
                } else {
                    e1.n0 n0Var4 = this.f359485d;
                    if (n0Var4 == null) {
                        n0Var4 = new e1.g();
                        this.f359485d = n0Var4;
                    }
                    ((e1.g) n0Var4).f(zVar);
                    this.f359486e = true;
                }
            }
            this.f359487f = zVar;
        }
        p2.s mo130620x6fcfed3f = draw.mo130620x6fcfed3f();
        if (this.f359489h != mo130620x6fcfed3f) {
            f(mo130620x6fcfed3f);
            this.f359489h = mo130620x6fcfed3f;
        }
        float d17 = d1.k.d(draw.a()) - d1.k.d(j17);
        float b17 = d1.k.b(draw.a()) - d1.k.b(j17);
        ((g1.d) ((g1.b) draw.p()).f349037a).b(0.0f, 0.0f, d17, b17);
        if (f17 > 0.0f && d1.k.d(j17) > 0.0f && d1.k.b(j17) > 0.0f) {
            if (this.f359486e) {
                d1.g a17 = d1.h.a(d1.e.f307156b, d1.l.a(d1.k.d(j17), d1.k.b(j17)));
                e1.u a18 = ((g1.b) draw.p()).a();
                e1.n0 n0Var5 = this.f359485d;
                if (n0Var5 == null) {
                    n0Var5 = new e1.g();
                    this.f359485d = n0Var5;
                }
                try {
                    a18.k(a17, n0Var5);
                    i(draw);
                } finally {
                    a18.b();
                }
            } else {
                i(draw);
            }
        }
        ((g1.d) ((g1.b) draw.p()).f349037a).b(-0.0f, -0.0f, -d17, -b17);
    }

    public abstract long h();

    public abstract void i(g1.i iVar);
}
