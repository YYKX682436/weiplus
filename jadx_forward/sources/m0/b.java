package m0;

/* loaded from: classes14.dex */
public final class b extends m0.w implements n0.e4 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f403962e;

    /* renamed from: f, reason: collision with root package name */
    public final float f403963f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.e5 f403964g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.e5 f403965h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.t f403966i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f403967m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f403968n;

    /* renamed from: o, reason: collision with root package name */
    public long f403969o;

    /* renamed from: p, reason: collision with root package name */
    public int f403970p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.a f403971q;

    public b(boolean z17, float f17, n0.e5 e5Var, n0.e5 e5Var2, m0.t tVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(z17, e5Var2);
        this.f403962e = z17;
        this.f403963f = f17;
        this.f403964g = e5Var;
        this.f403965h = e5Var2;
        this.f403966i = tVar;
        this.f403967m = n0.s4.c(null, null, 2, null);
        this.f403968n = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f403969o = d1.k.f307174b;
        this.f403970p = -1;
        this.f403971q = new m0.a(this);
    }

    @Override // a0.s1
    public void a(g1.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        u1.o0 o0Var = (u1.o0) fVar;
        this.f403969o = o0Var.a();
        float f17 = this.f403963f;
        this.f403970p = java.lang.Float.isNaN(f17) ? a06.d.b(m0.s.a(fVar, this.f403962e, o0Var.a())) : o0Var.G(f17);
        long j17 = ((e1.y) this.f403964g.mo128745x754a37bb()).f327855a;
        float f18 = ((m0.j) this.f403965h.mo128745x754a37bb()).f404011d;
        o0Var.b();
        f(fVar, f17, j17);
        e1.u a17 = ((g1.b) o0Var.f505185d.f349040e).a();
        ((java.lang.Boolean) ((n0.q4) this.f403968n).mo128745x754a37bb()).booleanValue();
        m0.v vVar = (m0.v) ((n0.q4) this.f403967m).mo128745x754a37bb();
        if (vVar != null) {
            vVar.e(o0Var.a(), this.f403970p, j17, f18);
            android.graphics.Canvas canvas = e1.c.f327762a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
            vVar.draw(((e1.b) a17).f327758a);
        }
    }

    @Override // n0.e4
    public void b() {
    }

    @Override // n0.e4
    public void c() {
        h();
    }

    @Override // n0.e4
    public void d() {
        h();
    }

    @Override // m0.w
    public void e(c0.r interaction, p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interaction, "interaction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        m0.t tVar = this.f403966i;
        tVar.getClass();
        m0.u uVar = tVar.f404044g;
        uVar.getClass();
        m0.v rippleHostView = (m0.v) ((java.util.LinkedHashMap) uVar.f404046a).get(this);
        if (rippleHostView == null) {
            rippleHostView = (m0.v) kz5.h0.C(tVar.f404043f);
            java.util.Map map = uVar.f404047b;
            if (rippleHostView == null) {
                int i17 = tVar.f404045h;
                java.util.List list = tVar.f404042e;
                if (i17 > kz5.c0.h(list)) {
                    android.content.Context context = tVar.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
                    rippleHostView = new m0.v(context);
                    tVar.addView(rippleHostView);
                    ((java.util.ArrayList) list).add(rippleHostView);
                } else {
                    rippleHostView = (m0.v) ((java.util.ArrayList) list).get(tVar.f404045h);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rippleHostView, "rippleHostView");
                    m0.b bVar = (m0.b) ((java.util.LinkedHashMap) map).get(rippleHostView);
                    if (bVar != null) {
                        ((n0.q4) bVar.f403967m).mo148714x53d8522f(null);
                        uVar.a(bVar);
                        rippleHostView.c();
                    }
                }
                int i18 = tVar.f404045h;
                if (i18 < tVar.f404041d - 1) {
                    tVar.f404045h = i18 + 1;
                } else {
                    tVar.f404045h = 0;
                }
            }
            uVar.f404046a.put(this, rippleHostView);
            map.put(rippleHostView, this);
        }
        rippleHostView.b(interaction, this.f403962e, this.f403969o, this.f403970p, ((e1.y) this.f403964g.mo128745x754a37bb()).f327855a, ((m0.j) this.f403965h.mo128745x754a37bb()).f404011d, this.f403971q);
        ((n0.q4) this.f403967m).mo148714x53d8522f(rippleHostView);
    }

    @Override // m0.w
    public void g(c0.r interaction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interaction, "interaction");
        m0.v vVar = (m0.v) ((n0.q4) this.f403967m).mo128745x754a37bb();
        if (vVar != null) {
            vVar.d();
        }
    }

    public final void h() {
        m0.t tVar = this.f403966i;
        tVar.getClass();
        ((n0.q4) this.f403967m).mo148714x53d8522f(null);
        m0.u uVar = tVar.f404044g;
        uVar.getClass();
        m0.v vVar = (m0.v) ((java.util.LinkedHashMap) uVar.f404046a).get(this);
        if (vVar != null) {
            vVar.c();
            uVar.a(this);
            ((java.util.ArrayList) tVar.f404043f).add(vVar);
        }
    }
}
