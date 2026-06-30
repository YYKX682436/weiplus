package xn2;

/* loaded from: classes2.dex */
public final class f1 implements xn2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f537025d;

    /* renamed from: e, reason: collision with root package name */
    public final xn2.a f537026e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f537027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f537028g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f537029h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f537030i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f537031m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f537032n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f537033o;

    public f1(android.app.Activity context, xn2.a megaVideoPresenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(megaVideoPresenter, "megaVideoPresenter");
        this.f537025d = context;
        this.f537026e = megaVideoPresenter;
        this.f537029h = jz5.h.b(new xn2.c1(this));
        this.f537030i = jz5.h.b(new xn2.x0(this));
        this.f537031m = jz5.h.b(new xn2.z0(this));
        this.f537032n = jz5.h.b(new xn2.b1(this));
        this.f537033o = jz5.h.b(new xn2.e1(this));
    }

    public ym5.q1 a() {
        return new xn2.s0(this, j());
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 g() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) ((jz5.n) this.f537030i).mo141623x754a37bb();
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        android.app.Activity activity = this.f537025d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        return (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity;
    }

    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m175696x4905e9fa() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f537033o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22849x81a93d25, "<get-rv>(...)");
        return c22849x81a93d25;
    }

    public final android.view.View h() {
        return (android.view.View) ((jz5.n) this.f537029h).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f j() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) ((jz5.n) this.f537032n).mo141623x754a37bb();
    }

    public void l(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoViewCallback", "onUserVisible new visible=" + z17 + ",fetching=" + this.f537028g);
        this.f537027f = z17;
        if (!z17) {
            g().setVisibility(8);
        } else if (this.f537028g) {
            g().setVisibility(0);
        } else {
            g().setVisibility(8);
        }
    }
}
