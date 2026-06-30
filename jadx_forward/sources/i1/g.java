package i1;

/* loaded from: classes13.dex */
public final class g extends i1.d0 {

    /* renamed from: b, reason: collision with root package name */
    public e1.r f368427b;

    /* renamed from: c, reason: collision with root package name */
    public float f368428c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f368429d;

    /* renamed from: e, reason: collision with root package name */
    public float f368430e;

    /* renamed from: f, reason: collision with root package name */
    public float f368431f;

    /* renamed from: g, reason: collision with root package name */
    public e1.r f368432g;

    /* renamed from: h, reason: collision with root package name */
    public int f368433h;

    /* renamed from: i, reason: collision with root package name */
    public int f368434i;

    /* renamed from: j, reason: collision with root package name */
    public float f368435j;

    /* renamed from: k, reason: collision with root package name */
    public float f368436k;

    /* renamed from: l, reason: collision with root package name */
    public float f368437l;

    /* renamed from: m, reason: collision with root package name */
    public float f368438m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f368439n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f368440o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f368441p;

    /* renamed from: q, reason: collision with root package name */
    public g1.n f368442q;

    /* renamed from: r, reason: collision with root package name */
    public final e1.p0 f368443r;

    /* renamed from: s, reason: collision with root package name */
    public final e1.p0 f368444s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f368445t;

    /* renamed from: u, reason: collision with root package name */
    public final i1.c0 f368446u;

    public g() {
        super(null);
        this.f368428c = 1.0f;
        int i17 = i1.p1.f368534a;
        this.f368429d = kz5.p0.f395529d;
        this.f368430e = 1.0f;
        this.f368433h = 0;
        this.f368434i = 0;
        this.f368435j = 4.0f;
        this.f368437l = 1.0f;
        this.f368439n = true;
        this.f368440o = true;
        this.f368441p = true;
        this.f368443r = e1.k.a();
        this.f368444s = e1.k.a();
        this.f368445t = jz5.h.a(jz5.i.f384364f, i1.f.f368423d);
        this.f368446u = new i1.c0();
    }

    @Override // i1.d0
    public void a(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        if (this.f368439n) {
            i1.c0 c0Var = this.f368446u;
            ((java.util.ArrayList) c0Var.f368379a).clear();
            e1.p0 p0Var = this.f368443r;
            ((e1.i) p0Var).c();
            java.util.List nodes = this.f368429d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodes, "nodes");
            ((java.util.ArrayList) c0Var.f368379a).addAll(nodes);
            c0Var.c(p0Var);
            e();
        } else if (this.f368441p) {
            e();
        }
        this.f368439n = false;
        this.f368441p = false;
        e1.r rVar = this.f368427b;
        e1.p0 p0Var2 = this.f368444s;
        if (rVar != null) {
            g1.h.f(iVar, p0Var2, rVar, this.f368428c, null, null, 0, 56, null);
        }
        e1.r rVar2 = this.f368432g;
        if (rVar2 != null) {
            g1.n nVar = this.f368442q;
            if (this.f368440o || nVar == null) {
                nVar = new g1.n(this.f368431f, this.f368435j, this.f368433h, this.f368434i, null, 16, null);
                this.f368442q = nVar;
                this.f368440o = false;
            }
            g1.h.f(iVar, p0Var2, rVar2, this.f368430e, nVar, null, 0, 48, null);
        }
    }

    public final void e() {
        android.graphics.Path path;
        e1.p0 p0Var = this.f368444s;
        ((e1.i) p0Var).c();
        boolean z17 = this.f368436k == 0.0f;
        e1.p0 p0Var2 = this.f368443r;
        if (z17) {
            if (this.f368437l == 1.0f) {
                e1.o0.a(p0Var, p0Var2, 0L, 2, null);
                return;
            }
        }
        jz5.g gVar = this.f368445t;
        e1.j jVar = (e1.j) ((e1.s0) gVar.mo141623x754a37bb());
        if (p0Var2 != null) {
            jVar.getClass();
            if (!(p0Var2 instanceof e1.i)) {
                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path = ((e1.i) p0Var2).f327796a;
        } else {
            path = null;
        }
        jVar.f327808a.setPath(path, false);
        float length = ((e1.j) ((e1.s0) gVar.mo141623x754a37bb())).f327808a.getLength();
        float f17 = this.f368436k;
        float f18 = this.f368438m;
        float f19 = ((f17 + f18) % 1.0f) * length;
        float f27 = ((this.f368437l + f18) % 1.0f) * length;
        if (f19 <= f27) {
            ((e1.j) ((e1.s0) gVar.mo141623x754a37bb())).a(f19, f27, p0Var, true);
        } else {
            ((e1.j) ((e1.s0) gVar.mo141623x754a37bb())).a(f19, length, p0Var, true);
            ((e1.j) ((e1.s0) gVar.mo141623x754a37bb())).a(0.0f, f27, p0Var, true);
        }
    }

    /* renamed from: toString */
    public java.lang.String m134441x9616526c() {
        return this.f368443r.toString();
    }
}
