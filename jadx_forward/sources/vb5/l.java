package vb5;

@yn.c(m177365x976763e5 = vb5.m.class)
/* loaded from: classes5.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements vb5.m {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.ref.WeakReference f516388q;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f516389e = "MicroMsg.ChattingTipsBarComponent" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f516390f;

    /* renamed from: g, reason: collision with root package name */
    public long f516391g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f516392h;

    /* renamed from: i, reason: collision with root package name */
    public long f516393i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f516394m;

    /* renamed from: n, reason: collision with root package name */
    public int f516395n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f516396o;

    /* renamed from: p, reason: collision with root package name */
    public final l75.q0 f516397p;

    public l() {
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        arrayList.add(new yj5.c0());
        arrayList.add(new yj5.d());
        arrayList.add(new yj5.b());
        arrayList.add(new yj5.t());
        arrayList.add(new yj5.k());
        arrayList.add(new yj5.p());
        arrayList.add(new yj5.r());
        arrayList.add(new yj5.v());
        arrayList.add(new yj5.a0());
        arrayList.add(new yj5.s());
        this.f516392h = arrayList;
        this.f516395n = 8;
        this.f516396o = new java.util.ArrayList();
        this.f516397p = new vb5.i(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(this.f280113d.x())) {
            pm0.v.M(this.f516389e, false, new vb5.g(this), 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        java.util.Iterator it = this.f516392h.iterator();
        while (it.hasNext()) {
            ((yj5.a) it.next()).I();
        }
        if (gm0.j1.b().m()) {
            c01.d9.b().l().mo49775xc84af884(this.f516397p);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        n0();
        this.f516391g = 0L;
        f516388q = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        if (gm0.j1.b().m()) {
            c01.d9.b().l().mo49775xc84af884(this.f516397p);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        java.util.Iterator it = this.f516392h.iterator();
        while (it.hasNext()) {
            ((yj5.a) it.next()).L(dVar);
        }
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        q0();
    }

    @Override // yn.d
    public void X() {
        if (this.f516394m) {
            this.f516394m = false;
            com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f516390f;
            if (c22490xdfa0051c == null) {
                return;
            }
            c22490xdfa0051c.setVisibility(this.f516395n);
        }
    }

    public java.util.Map m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        xj5.a aVar = null;
        if (f9Var == null) {
            return null;
        }
        for (xj5.a aVar2 : this.f516396o) {
            if ((aVar2 instanceof xj5.n) && ((xj5.n) aVar2).f536449v.m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            return aVar.b();
        }
        return kz5.c1.m(xj5.n.f536447w.a(f9Var), kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_list_length", java.lang.Integer.valueOf(this.f516396o.size()))), com.p314xaae8f345.mm.ui.p2738xb1dfbddb.s.a(this.f280113d.v())));
    }

    public final void n0() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            o0();
        } else {
            this.f280113d.q().mo77785xc570fb34(new vb5.a(this));
        }
    }

    public final void o0() {
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f516390f;
        if (c22490xdfa0051c != null) {
            c22490xdfa0051c.b();
        }
        this.f516396o = new java.util.ArrayList();
        java.util.Iterator it = this.f516392h.iterator();
        while (it.hasNext()) {
            ((yj5.a) it.next()).n0();
        }
    }

    public final void p0(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf) ((sb5.a1) this.f280113d.f542241c.a(sb5.a1.class));
            rfVar.f281370p |= 1;
            if (rfVar.f281371q) {
                rfVar.F0();
            }
        }
    }

    public final void q0() {
        if (this.f516394m) {
            return;
        }
        this.f516394m = true;
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f516390f;
        this.f516395n = c22490xdfa0051c != null ? c22490xdfa0051c.getVisibility() : 8;
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c2 = this.f516390f;
        if (c22490xdfa0051c2 == null) {
            return;
        }
        c22490xdfa0051c2.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        this.f516393i = java.lang.System.currentTimeMillis();
        ym5.a1.f(new vb5.k(this, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.e.f291463e, true));
        f516388q = new java.lang.ref.WeakReference(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f516391g = java.lang.System.currentTimeMillis();
        f516388q = new java.lang.ref.WeakReference(this);
        c01.d9.b().l().add(this.f516397p);
    }
}
