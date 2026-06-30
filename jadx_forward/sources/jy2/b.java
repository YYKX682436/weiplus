package jy2;

/* loaded from: classes3.dex */
public final class b extends xt2.m6 implements jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f384019d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f384020e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f384021f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f384022g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f384023h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f384024i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f384025m;

    public b(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f384019d = root;
        this.f384020e = statusMonitor;
        this.f384021f = basePlugin;
        this.f384022g = "portrait_action_goto_create_lottery";
        this.f384023h = true;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.p_3);
        this.f384024i = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.p8x);
        this.f384025m = "anchorlive.bottom.tools.vote";
        root.setOnClickListener(new jy2.a(this));
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.tools.vote", findViewById, textView, null, 16, null);
    }

    @Override // jf2.l
    public void F(int i17) {
    }

    @Override // jf2.h
    public void b() {
        if (this.f384023h) {
            ll2.e.f400666a.j(this.f384025m, false);
            this.f384023h = false;
        }
        this.f384019d.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80154x99185005), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.ej_));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f384019d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f384019d.findViewById(com.p314xaae8f345.mm.R.id.p97);
    }

    @Override // jf2.h
    public void g() {
        this.f384019d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f384019d;
    }

    @Override // jf2.h
    public boolean i() {
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderLiveVotingSwitch", 0) == 1;
        dk2.ef efVar = dk2.ef.f314905a;
        if (dk2.ef.f314917g) {
            return z17;
        }
        return (((mm2.c1) this.f384021f.P0(mm2.c1.class)).T || (((mm2.n0) this.f384021f.P0(mm2.n0.class)).f410806r)) && z17;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f384019d.findViewById(com.p314xaae8f345.mm.R.id.fqi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 2;
    }

    @Override // jf2.o
    public boolean u() {
        return !zl2.r4.f555483a.w1();
    }
}
