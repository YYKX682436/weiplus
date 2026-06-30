package mf3;

/* loaded from: classes12.dex */
public abstract class e implements mf3.n, kg3.d, com.p314xaae8f345.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public final mf3.p f407637d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f407638e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f407639f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f407640g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f407641h;

    /* renamed from: i, reason: collision with root package name */
    public int f407642i;

    /* renamed from: m, reason: collision with root package name */
    public mf3.s f407643m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f407644n;

    public e(mf3.p apiCenter, java.lang.String logLabel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logLabel, "logLabel");
        this.f407637d = apiCenter;
        this.f407638e = logLabel;
        this.f407639f = "";
        this.f407642i = -1;
    }

    private final java.lang.String N(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" {holder@" + L() + " #" + this.f407642i + '}');
        return sb6.toString();
    }

    @Override // mf3.l
    public void F() {
        this.f407644n = true;
    }

    @Override // mf3.n
    public mf3.p G() {
        return this.f407637d;
    }

    public void H2() {
    }

    public abstract android.view.View J(android.content.Context context);

    public final android.content.Context K() {
        android.content.Context context = this.f407641h;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
        throw null;
    }

    public java.lang.String L() {
        return this.f407639f;
    }

    public final android.view.View M() {
        android.view.View view = this.f407640g;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    public final void O(java.lang.String format, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        N(format);
        java.util.Arrays.copyOf(args, args.length);
    }

    public final void P(java.lang.String format, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f407638e, N(format), java.util.Arrays.copyOf(args, args.length));
    }

    public final void Q(java.lang.String format, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407638e, N(format), java.util.Arrays.copyOf(args, args.length));
    }

    public final void R() {
        kg3.n nVar = new kg3.n(K(), this, this.f407644n);
        android.content.Context context = nVar.f389254a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return;
        }
        if (nVar.b(activity) || nVar.a()) {
            ym5.a1.f(new kg3.l(nVar));
        } else {
            ym5.a1.f(new kg3.m(nVar));
        }
    }

    public void h4() {
    }

    @Override // mf3.l
    public void i() {
        this.f407644n = false;
    }

    @Override // com.p314xaae8f345.mm.ui.fa
    /* renamed from: onConfigurationChanged */
    public void mo74853x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        new kg3.n(K(), this, this.f407644n).c(newConfig);
    }

    @Override // mf3.n
    public void p(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f407639f = str;
    }

    public void r(int i17, int i18) {
        R();
    }

    @Override // mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        android.content.Context K = K();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = K instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) K : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78550x87bf02d5(this);
        }
        this.f407644n = false;
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        mf3.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        this.f407642i = bindContext.f407651b;
        this.f407643m = bindContext;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindLayer mediaId: ");
        mf3.s sVar = this.f407643m;
        sb6.append((sVar == null || (kVar = sVar.f407650a) == null) ? null : kVar.mo2110x5db1b11());
        Q(sb6.toString(), new java.lang.Object[0]);
        android.content.Context K = K();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = K instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) K : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78488x9f743232(this);
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        android.content.Context context = parentView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f407641h = context;
        android.content.Context context2 = parentView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        android.view.View J2 = J(context2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(J2, "<set-?>");
        this.f407640g = J2;
        android.view.ViewGroup viewGroup = parentView instanceof android.view.ViewGroup ? (android.view.ViewGroup) parentView : null;
        if (viewGroup != null) {
            viewGroup.addView(M());
        }
    }

    public /* synthetic */ e(mf3.p pVar, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(pVar, (i17 & 2) != 0 ? "" : str);
    }
}
