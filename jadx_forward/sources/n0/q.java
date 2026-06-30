package n0;

/* loaded from: classes14.dex */
public final class q extends n0.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f415206a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f415207b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Set f415208c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f415209d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f415210e = n0.s4.c(r0.d.f449495f, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f415211f;

    public q(n0.y0 y0Var, int i17, boolean z17) {
        this.f415211f = y0Var;
        this.f415206a = i17;
        this.f415207b = z17;
    }

    @Override // n0.g1
    public void a(n0.p1 composition, yz5.p content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f415211f.f415295c.a(composition, content);
    }

    @Override // n0.g1
    public void b() {
        n0.y0 y0Var = this.f415211f;
        y0Var.A--;
    }

    @Override // n0.g1
    public boolean c() {
        return this.f415207b;
    }

    @Override // n0.g1
    public p0.f d() {
        return (p0.f) ((n0.q4) this.f415210e).mo128745x754a37bb();
    }

    @Override // n0.g1
    public int e() {
        return this.f415206a;
    }

    @Override // n0.g1
    public oz5.l f() {
        return this.f415211f.f415295c.f();
    }

    @Override // n0.g1
    public void g(n0.p1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        n0.y0 y0Var = this.f415211f;
        y0Var.f415295c.g(y0Var.f415300h);
        y0Var.f415295c.g(composition);
    }

    @Override // n0.g1
    public n0.t2 h(n0.u2 reference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reference, "reference");
        return this.f415211f.f415295c.h(reference);
    }

    @Override // n0.g1
    public void i(java.util.Set table) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        java.util.Set set = this.f415208c;
        if (set == null) {
            set = new java.util.HashSet();
            this.f415208c = set;
        }
        set.add(table);
    }

    @Override // n0.g1
    public void j(n0.o composer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composer, "composer");
        this.f415209d.add(composer);
    }

    @Override // n0.g1
    public void k() {
        this.f415211f.A++;
    }

    @Override // n0.g1
    public void l(n0.o composer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composer, "composer");
        java.util.Set set = this.f415208c;
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((java.util.Set) it.next()).remove(((n0.y0) composer).f415296d);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(this.f415209d).remove(composer);
    }

    @Override // n0.g1
    public void m(n0.p1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        this.f415211f.f415295c.m(composition);
    }

    public final void n() {
        java.util.Set<n0.y0> set = this.f415209d;
        if (!set.isEmpty()) {
            java.util.Set set2 = this.f415208c;
            if (set2 != null) {
                for (n0.y0 y0Var : set) {
                    java.util.Iterator it = ((java.util.HashSet) set2).iterator();
                    while (it.hasNext()) {
                        ((java.util.Set) it.next()).remove(y0Var.f415296d);
                    }
                }
            }
            set.clear();
        }
    }
}
