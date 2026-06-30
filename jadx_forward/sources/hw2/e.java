package hw2;

/* loaded from: classes5.dex */
public final class e implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f367045d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f367046e;

    /* renamed from: f, reason: collision with root package name */
    public iu3.i f367047f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f367048g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f367049h;

    /* renamed from: i, reason: collision with root package name */
    public final st3.k f367050i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f367051m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f367052n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f367053o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f367054p;

    /* renamed from: q, reason: collision with root package name */
    public final long f367055q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f367056r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f367057s;

    public e(android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f367045d = parent;
        this.f367046e = status;
        this.f367049h = kz5.p0.f395529d;
        this.f367050i = new st3.k();
        this.f367054p = true;
        this.f367055q = 500L;
        this.f367056r = new java.util.ArrayList();
        this.f367057s = new hw2.d(this);
    }

    public final void a() {
        if (this.f367048g != null) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f367045d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e(context, null);
        this.f367048g = c17040x9d8b708e;
        c17040x9d8b708e.setVisibility(8);
        viewGroup.addView(this.f367048g);
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        this.f367047f = new iu3.i(context2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e2 = this.f367048g;
        if (c17040x9d8b708e2 != null) {
            c17040x9d8b708e2.mo68193xccfd5b30(com.p314xaae8f345.mm.R.C30861xcebc809e.b8v);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e3 = this.f367048g;
        if (c17040x9d8b708e3 != null) {
            c17040x9d8b708e3.mo68199x466a35c6(new hw2.b(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e4 = this.f367048g;
        if (c17040x9d8b708e4 != null) {
            c17040x9d8b708e4.mo68178x928c0216(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.v0.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e5 = this.f367048g;
        if (c17040x9d8b708e5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c.m68299x335e6d3f(c17040x9d8b708e5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f562462fm), null, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563675b40), null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80881x4db40400), null, null, null, null, null, null, null, true, 8144, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e6 = this.f367048g;
        if (c17040x9d8b708e6 != null) {
            c17040x9d8b708e6.mo68194x6c4ebec7(new hw2.c(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e7 = this.f367048g;
        if (c17040x9d8b708e7 != null) {
            c17040x9d8b708e7.mo68195x60eb836b(this.f367049h);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e8 = this.f367048g;
        if (c17040x9d8b708e8 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c.m68300x20d2931a(c17040x9d8b708e8, "", new java.util.ArrayList(), -1L, -1L, false, this.f367050i, this.f367051m, 16, null);
        }
    }

    public final void b() {
        iu3.i iVar = this.f367047f;
        if (iVar != null) {
            iVar.a();
        }
        java.util.Iterator it = this.f367056r.iterator();
        while (it.hasNext()) {
            ((hw2.a) it.next()).getClass();
        }
    }

    public final void c() {
        iu3.i iVar = this.f367047f;
        if (iVar != null) {
            iVar.e();
        }
        java.util.Iterator it = this.f367056r.iterator();
        while (it.hasNext()) {
            ((hw2.a) it.next()).getClass();
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, boolean z17, boolean z18) {
        java.lang.Integer valueOf = c16993xacc19624 != null ? java.lang.Integer.valueOf(c16993xacc19624.F) : null;
        st3.k kVar = this.f367050i;
        if (valueOf != null && valueOf.intValue() == 2) {
            st3.v vVar = st3.v.f494139e;
            kVar.getClass();
            kVar.f494084f = vVar;
            kVar.f494080b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_video_editor_lyrics_enable, 0) == 1;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            st3.v vVar2 = st3.v.f494141g;
            kVar.getClass();
            kVar.f494084f = vVar2;
        } else if (valueOf != null && valueOf.intValue() == 3) {
            st3.v vVar3 = st3.v.f494138d;
            kVar.getClass();
            kVar.f494084f = vVar3;
            kVar.f494080b = true;
            kVar.f494083e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_story_visitor_enable, false);
        } else if (valueOf != null && valueOf.intValue() == 5) {
            st3.v vVar4 = st3.v.f494140f;
            kVar.getClass();
            kVar.f494084f = vVar4;
        } else if (valueOf != null && valueOf.intValue() == 11) {
            st3.v vVar5 = st3.v.f494142h;
            kVar.getClass();
            kVar.f494084f = vVar5;
            kVar.f494080b = false;
        }
        kVar.f494082d = z17;
        this.f367051m = z18;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f367048g;
        return c17040x9d8b708e != null && c17040x9d8b708e.mo68190x4ceae47d();
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        b();
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        if (!this.f367053o || this.f367052n == null) {
            return;
        }
        c();
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        this.f367052n = null;
        iu3.i iVar = this.f367047f;
        if (iVar != null) {
            iVar.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f367048g;
        if (c17040x9d8b708e != null) {
            c17040x9d8b708e.mo68177x5cd39ffa();
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        iu3.i iVar;
        if (this.f367052n == null || (iVar = this.f367047f) == null) {
            return;
        }
        iVar.f(0L);
    }
}
