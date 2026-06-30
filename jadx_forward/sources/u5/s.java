package u5;

/* loaded from: classes14.dex */
public final class s extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f506259i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f506260m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f506261n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f506262o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f506263p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.v2 f506264q;

    /* renamed from: r, reason: collision with root package name */
    public final n0.v2 f506265r;

    /* renamed from: s, reason: collision with root package name */
    public u5.e f506266s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f506267t;

    /* renamed from: u, reason: collision with root package name */
    public final n0.v2 f506268u;

    /* renamed from: v, reason: collision with root package name */
    public final n0.v2 f506269v;

    /* renamed from: w, reason: collision with root package name */
    public final n0.v2 f506270w;

    public s(p3325xe03a0797.p3326xc267989b.y0 parentScope, c6.j request, r5.j imageLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentScope, "parentScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageLoader, "imageLoader");
        this.f506259i = parentScope;
        int i17 = d1.k.f307176d;
        this.f506262o = n0.s4.c(new d1.k(d1.k.f307174b), null, 2, null);
        this.f506263p = n0.s4.c(java.lang.Float.valueOf(1.0f), null, 2, null);
        this.f506264q = n0.s4.c(null, null, 2, null);
        this.f506265r = n0.s4.c(null, null, 2, null);
        int i18 = u5.e.f506235a;
        this.f506266s = u5.d.f506234b;
        this.f506268u = n0.s4.c(u5.g.f506239a, null, 2, null);
        this.f506269v = n0.s4.c(request, null, 2, null);
        this.f506270w = n0.s4.c(imageLoader, null, 2, null);
    }

    @Override // h1.c
    public boolean a(float f17) {
        ((n0.q4) this.f506263p).mo148714x53d8522f(java.lang.Float.valueOf(f17));
        return true;
    }

    @Override // n0.e4
    public void b() {
        if (this.f506267t) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f506260m;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        oz5.l f93115e = this.f506259i.getF93115e();
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(f93115e.mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.s3((p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d))));
        this.f506260m = a17;
        p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new u5.q(this, null), 3, null);
    }

    @Override // n0.e4
    public void c() {
        d();
    }

    @Override // n0.e4
    public void d() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f506260m;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f506260m = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f506261n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f506261n = null;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        ((n0.q4) this.f506264q).mo148714x53d8522f(zVar);
        return true;
    }

    @Override // h1.c
    public long h() {
        h1.c cVar = (h1.c) ((n0.q4) this.f506265r).mo128745x754a37bb();
        d1.k kVar = cVar == null ? null : new d1.k(cVar.h());
        return kVar == null ? d1.k.f307175c : kVar.f307177a;
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        long a17 = iVar.a();
        ((n0.q4) this.f506262o).mo148714x53d8522f(new d1.k(a17));
        h1.c cVar = (h1.c) ((n0.q4) this.f506265r).mo128745x754a37bb();
        if (cVar == null) {
            return;
        }
        cVar.g(iVar, iVar.a(), ((java.lang.Number) ((n0.q4) this.f506263p).mo128745x754a37bb()).floatValue(), (e1.z) ((n0.q4) this.f506264q).mo128745x754a37bb());
    }
}
