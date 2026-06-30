package cp2;

/* loaded from: classes2.dex */
public abstract class q1 implements cp2.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f302415d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 f302416e;

    /* renamed from: f, reason: collision with root package name */
    public final cp2.c f302417f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f302418g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f302419h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.dd2 f302420i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f302421m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f302422n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f302423o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f302424p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f302425q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f302426r;

    /* renamed from: s, reason: collision with root package name */
    public final ml2.d f302427s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f302428t;

    /* renamed from: u, reason: collision with root package name */
    public final cp2.u1 f302429u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 f302430v;

    /* renamed from: w, reason: collision with root package name */
    public final cp2.p1 f302431w;

    public q1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf baseContext, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301, cp2.c presenter, android.view.View parent, boolean z17, r45.dd2 dd2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseContext, "baseContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f302415d = baseContext;
        this.f302416e = abstractC14499x6ba3301;
        this.f302417f = presenter;
        this.f302418g = parent;
        this.f302419h = z17;
        this.f302420i = dd2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "#init");
        this.f302421m = jz5.h.b(new cp2.k1(this));
        this.f302422n = jz5.h.b(new cp2.j1(this));
        this.f302423o = jz5.h.b(new cp2.b1(this));
        jz5.h.b(new cp2.l1(this));
        this.f302424p = jz5.h.b(new cp2.m1(this));
        this.f302425q = jz5.h.b(new cp2.n1(this));
        this.f302426r = jz5.h.b(new cp2.o1(this));
        this.f302427s = new ml2.d();
        this.f302429u = new cp2.u1(baseContext, abstractC14499x6ba3301, presenter.mo122374x8fadefe3(), presenter);
        this.f302431w = new cp2.p1(this, l());
    }

    public final r45.qt2 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = this.f302416e;
        if (abstractC14499x6ba3301 != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(abstractC14499x6ba3301).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f302415d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f302422n).mo141623x754a37bb();
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f302415d;
    }

    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f l17 = l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "<get-rlLayout>(...)");
        return l17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f l() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) this.f302421m.mo141623x754a37bb();
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f302426r).mo141623x754a37bb();
    }

    public final int q() {
        r45.dd2 dd2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = this.f302416e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba3301 : null;
        if (c14521x246f2bd == null || (dd2Var = c14521x246f2bd.f203052s) == null) {
            return 0;
        }
        return dd2Var.m75939xb282bd08(0);
    }

    public void s(java.util.List cacheData) {
        java.util.List m82898xfb7e5820;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheData, "cacheData");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f302428t;
        if (c22848x6ddd90cf != null && (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) != null) {
            m82898xfb7e5820.clear();
            m82898xfb7e5820.addAll(cacheData);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f302428t;
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.m8146xced61ae5();
        }
    }
}
