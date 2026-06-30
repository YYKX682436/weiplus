package lg2;

/* loaded from: classes10.dex */
public abstract class d extends lg2.a implements kg2.b {

    /* renamed from: p, reason: collision with root package name */
    public ig2.n f400102p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f400103q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f400104r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f400105s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f400106t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f400107u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public ig2.g b() {
        return (ig2.g) z();
    }

    public ig2.j d() {
        return (ig2.j) z();
    }

    @Override // kg2.b
    public void e(ig2.n switchLiveParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchLiveParams, "switchLiveParams");
        this.f400102p = switchLiveParams;
        this.f400103q = switchLiveParams.f372938d;
        l();
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        u(onAnimationEndCallback);
    }

    @Override // ez2.b
    public void h() {
        android.animation.AnimatorSet animatorSet = this.f400097o;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        p();
    }

    @Override // kg2.b
    public boolean i() {
        return this.f400104r;
    }

    @Override // lg2.a
    public void k() {
        android.view.View view = this.f400103q;
        android.view.View rootView = view != null ? view.getRootView() : null;
        this.f400107u = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f400091f, this.f400092g);
        android.view.ViewGroup viewGroup = this.f400107u;
        if (viewGroup != null) {
            viewGroup.addView(this.f400105s, layoutParams);
        }
        this.f400104r = false;
    }

    @Override // lg2.a
    public android.graphics.Rect n() {
        return qg2.d.c(qg2.d.f444326a, z(), null, 2, null);
    }

    @Override // lg2.a
    public android.view.View o() {
        android.content.Context context = this.f400089d;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f400105s = frameLayout;
        frameLayout.setTag("fluent_view_tag");
        android.widget.FrameLayout frameLayout2 = this.f400105s;
        if (frameLayout2 != null) {
            ((zy2.c8) i95.n0.c(zy2.c8.class)).getClass();
            frameLayout2.setTag(com.p314xaae8f345.mm.R.id.fo8, java.lang.Long.valueOf(z().f372936b));
        }
        android.widget.FrameLayout frameLayout3 = this.f400105s;
        if (frameLayout3 != null) {
            frameLayout3.setBackground(context.getResources().getDrawable(w()));
        }
        android.widget.FrameLayout frameLayout4 = this.f400105s;
        if (frameLayout4 != null) {
            frameLayout4.setOnTouchListener(new lg2.c(this));
        }
        this.f400106t = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55(context);
        v();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(q().width(), q().height());
        layoutParams.leftMargin = q().left;
        layoutParams.topMargin = q().top;
        android.widget.FrameLayout frameLayout5 = this.f400105s;
        if (frameLayout5 != null) {
            frameLayout5.addView(this.f400106t, layoutParams);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f400106t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22646x1e9ca55);
        return c22646x1e9ca55;
    }

    public abstract void v();

    public int w() {
        return c92.g.f121271a.b() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b;
    }

    public final ig2.n z() {
        ig2.n nVar = this.f400102p;
        if (nVar != null) {
            return nVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("transitionParams");
        throw null;
    }
}
