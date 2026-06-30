package k84;

/* loaded from: classes4.dex */
public abstract class q1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public static final k84.l Y = new k84.l(null);
    public static final int Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f386719a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final double f386720b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final double f386721c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final double f386722d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final double f386723e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final double f386724f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final double f386725g0;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f386726J;
    public final jz5.g K;
    public android.animation.ValueAnimator L;
    public android.animation.ValueAnimator M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final java.util.Map R;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 S;
    public k84.n T;
    public final java.util.Map U;
    public long V;
    public p3325xe03a0797.p3326xc267989b.r2 W;
    public boolean X;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f f386727o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 f386728p;

    /* renamed from: q, reason: collision with root package name */
    public final int f386729q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f386730r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f386731s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r0 f386732t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Random f386733u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f386734v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f386735w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f386736x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f386737y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f386738z;

    static {
        int a17 = a84.d0.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e);
        Z = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        int a18 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (float) 89.6d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        f386719a0 = a18;
        f386720b0 = 0.267949d;
        f386721c0 = 0.965926d;
        double d17 = a18;
        f386722d0 = (d17 / 2.0d) / 0.965926d;
        f386723e0 = d17 * 0.965926d;
        double d18 = d17 * 0.25882d;
        f386724f0 = (a17 * 0.965926d) + d18;
        f386725g0 = d18;
    }

    public q1(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 c17780x7da32526, int i17, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        super(str, yVar, view);
        this.f386727o = c17781x303781f;
        this.f386728p = c17780x7da32526;
        this.f386729q = i17;
        this.f386730r = b1Var;
        this.f386731s = iVar;
        int i18 = p3325xe03a0797.p3326xc267989b.r0.N0;
        this.f386732t = new k84.l0(p3325xe03a0797.p3326xc267989b.q0.f392100d, this);
        this.f386733u = new java.util.Random();
        this.f386734v = jz5.h.b(new k84.p(this));
        this.f386735w = jz5.h.b(new k84.s(this));
        this.f386736x = jz5.h.b(new k84.q(this));
        this.f386737y = jz5.h.b(new k84.r(this));
        this.f386738z = jz5.h.b(new k84.o(this));
        this.A = jz5.h.b(new k84.j0(this));
        this.B = jz5.h.b(new k84.k0(this));
        this.C = jz5.h.b(new k84.e1(view, this, yVar));
        this.D = jz5.h.b(new k84.d1(this));
        this.E = jz5.h.b(new k84.i1(this));
        this.F = jz5.h.b(new k84.g1(this));
        this.G = jz5.h.b(new k84.j1(this));
        this.H = jz5.h.b(new k84.c1(this));
        this.I = jz5.h.b(new k84.b1(this));
        this.f386726J = jz5.h.b(new k84.h1(this));
        this.K = jz5.h.b(new k84.f1(this));
        this.N = 1;
        this.O = -1;
        this.P = -1;
        this.R = new java.util.LinkedHashMap();
        this.S = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.T = new k84.n(0, null, 0, 0, 0);
        this.U = new java.util.LinkedHashMap();
        this.V = -1L;
    }

    public static final /* synthetic */ int A(k84.q1 q1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        int i17 = q1Var.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return i17;
    }

    public static final /* synthetic */ void B(k84.q1 q1Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.Q = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final void C(k84.q1 q1Var, android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        if (view != null) {
            view.setClipToOutline(true);
        }
        if (view != null) {
            view.setOutlineProvider(new al5.z1(a84.d0.a(4)));
        }
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i18;
        }
        if (view != null) {
            view.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final void D(k84.q1 q1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.j(), "startBreezeAnim");
        android.animation.ValueAnimator valueAnimator = q1Var.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        q1Var.L = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(1000L);
        }
        android.animation.ValueAnimator valueAnimator2 = q1Var.L;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(s74.q4.f486046a.h());
        }
        android.view.ViewGroup J2 = q1Var.J();
        int measuredHeight = J2 != null ? J2.getMeasuredHeight() : 0;
        android.view.ViewGroup J3 = q1Var.J();
        int measuredWidth = J3 != null ? J3.getMeasuredWidth() : 0;
        int max = java.lang.Math.max(measuredHeight - a84.d0.a(6), 0);
        float f17 = measuredWidth;
        float max2 = f17 > 0.0f ? java.lang.Math.max(measuredWidth - a84.d0.a(6), 0) / f17 : 1.0f;
        float f18 = measuredHeight > 0 ? max / measuredHeight : 1.0f;
        int max3 = java.lang.Math.max(a84.d0.a(6) + measuredHeight, 0);
        float max4 = f17 > 0.0f ? java.lang.Math.max(measuredWidth + a84.d0.a(6), 0) / f17 : 1.0f;
        float f19 = measuredHeight;
        float f27 = f19 > 0.0f ? max3 / f19 : 1.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.j(), "scaleLimit   " + max2 + "  " + f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.j(), "scaleAlphaLimit   " + max4 + "  " + f27);
        android.animation.ValueAnimator valueAnimator3 = q1Var.L;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new k84.u0(max2, f18, q1Var, max4, f27));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        android.animation.ValueAnimator valueAnimator4 = q1Var.L;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new k84.s0(c0Var));
        }
        android.animation.ValueAnimator valueAnimator5 = q1Var.L;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new k84.t0(q1Var, c0Var));
        }
        android.animation.ValueAnimator valueAnimator6 = q1Var.L;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final void E(k84.q1 q1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = q1Var.W;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        q1Var.V = java.lang.System.currentTimeMillis() + 3000;
        p3325xe03a0797.p3326xc267989b.y0 h17 = q1Var.h();
        q1Var.W = h17 != null ? p3325xe03a0797.p3326xc267989b.l.d(h17, q1Var.f386732t, null, new k84.w0(q1Var, null), 2, null) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final boolean U(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        mb4.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        boolean z17 = ((c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (cVar = m70354x74235b3e.f38211x1b3eca3e) == null) ? null : cVar.f406920l) != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return z17;
    }

    public static /* synthetic */ void Y(k84.q1 q1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUIForNoAnim");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            throw unsupportedOperationException;
        }
        if ((i17 & 1) != 0) {
            c17933xe8d1b226 = null;
        }
        q1Var.X(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final /* synthetic */ java.util.Map y(k84.q1 q1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBannerBitmaps$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        java.util.Map map = q1Var.R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBannerBitmaps$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return map;
    }

    public static final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 z(k84.q1 q1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContinuousLikeStateFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = q1Var.S;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContinuousLikeStateFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return j2Var;
    }

    public final android.widget.FrameLayout F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudeAnimBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f386738z).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudeAnimBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return frameLayout;
    }

    public final android.view.ViewGroup G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f386734v).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudeContinuousBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f386736x).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudeContinuousBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudeContinuousBgAlpha", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f386737y).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudeContinuousBgAlpha", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudeContinuousContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f386735w).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudeContinuousContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudePlayView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 c17780x7da32526 = this.f386728p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudePlayView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return c17780x7da32526;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386727o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return c17781x303781f;
    }

    public final mb4.p M(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        mb4.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContinuousLikeInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        mb4.p pVar = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (cVar = m70354x74235b3e.f38211x1b3eca3e) == null) ? null : cVar.f406920l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContinuousLikeInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return pVar;
    }

    public final android.view.ViewGroup N() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.I).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.widget.TextView O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagAnimWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.H).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagAnimWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return textView;
    }

    public final android.view.ViewGroup P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.D).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup Q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.C).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup R() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagLikingContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.F).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagLikingContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 S() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375) ((jz5.n) this.E).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return c0092xf45d4375;
    }

    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 T() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375) ((jz5.n) this.G).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return c0092xf45d4375;
    }

    public final void V() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup G = G();
        if (G != null) {
            int childCount = G.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = G.getChildAt(i17);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, F())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public final void W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetWordings", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375) ((jz5.n) this.f386726J).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        if (c0092xf45d4375 != null) {
            c0092xf45d4375.setText("");
            c0092xf45d4375.setTextSize(1, 14.0f);
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(c0092xf45d4375, 1, a84.d0.a(14), 1, 0);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 T = T();
        if (T != null) {
            T.setText("");
            T.setTextSize(1, 14.0f);
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(T, 1, a84.d0.a(14), 1, 0);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 S = S();
        if (S != null) {
            S.setText("");
            S.setTextSize(1, 14.0f);
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(S, 1, a84.d0.a(14), 1, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetWordings", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public final void X(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386727o;
        boolean z17 = !(c17781x303781f != null ? c17781x303781f.m() : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "continuousLikeStateFlow  checkLikeStatus = " + z17);
        if (c17933xe8d1b226 != null) {
            z17 = c17933xe8d1b226.m70360xbd8ebd19() != 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "refresh  checkLikeStatus = " + z17);
        if (z17) {
            android.view.ViewGroup P = P();
            if (P != null) {
                P.setVisibility(4);
            }
            android.view.ViewGroup R = R();
            if (R != null) {
                R.setVisibility(4);
            }
            android.view.ViewGroup N = N();
            if (N != null) {
                N.setVisibility(0);
            }
        } else {
            android.view.ViewGroup P2 = P();
            if (P2 != null) {
                P2.setVisibility(0);
            }
            android.view.ViewGroup R2 = R();
            if (R2 != null) {
                R2.setVisibility(4);
            }
            android.view.ViewGroup N2 = N();
            if (N2 != null) {
                N2.setVisibility(4);
            }
        }
        android.view.ViewGroup J2 = J();
        if (J2 != null) {
            J2.setVisibility(8);
        }
        android.view.ViewGroup G = G();
        if (G != null) {
            G.setVisibility(0);
        }
        android.view.ViewGroup G2 = G();
        if (G2 != null) {
            G2.setBackground(new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f2 = this.f386727o;
        if (c17781x303781f2 != null) {
            c17781x303781f2.setVisibility(0);
        }
        android.widget.FrameLayout F = F();
        android.view.ViewGroup.LayoutParams layoutParams = F != null ? F.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = 0;
        }
        android.widget.FrameLayout F2 = F();
        android.view.ViewGroup.LayoutParams layoutParams2 = F2 != null ? F2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = 0;
        }
        android.widget.FrameLayout F3 = F();
        if (F3 != null) {
            F3.requestLayout();
        }
        android.view.ViewGroup H = H();
        android.view.ViewGroup.LayoutParams layoutParams3 = H != null ? H.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = 0;
        }
        android.view.ViewGroup H2 = H();
        android.view.ViewGroup.LayoutParams layoutParams4 = H2 != null ? H2.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = 0;
        }
        android.view.ViewGroup H3 = H();
        if (H3 != null) {
            H3.requestLayout();
        }
        android.view.ViewGroup I = I();
        android.view.ViewGroup.LayoutParams layoutParams5 = I != null ? I.getLayoutParams() : null;
        if (layoutParams5 != null) {
            layoutParams5.width = 0;
        }
        android.view.ViewGroup I2 = I();
        android.view.ViewGroup.LayoutParams layoutParams6 = I2 != null ? I2.getLayoutParams() : null;
        if (layoutParams6 != null) {
            layoutParams6.height = 0;
        }
        android.view.ViewGroup I3 = I();
        if (I3 != null) {
            I3.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x019d, code lost:
    
        if (r13 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0091, code lost:
    
        if (r15 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00f5  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.q1.d(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r2 != null && r2.a()) == false) goto L17;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onEveryFillItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) r8
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            super.q(r8)
            kotlinx.coroutines.flow.j2 r2 = r7.S
            kotlinx.coroutines.flow.h3 r2 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r2
            java.lang.Object r2 = r2.mo144003x754a37bb()
            k84.m r2 = (k84.m) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L26
            boolean r5 = r2.b()
            if (r5 != r3) goto L26
            r5 = r3
            goto L27
        L26:
            r5 = r4
        L27:
            if (r5 != 0) goto L37
            if (r2 == 0) goto L33
            boolean r2 = r2.a()
            if (r2 != r3) goto L33
            r2 = r3
            goto L34
        L33:
            r2 = r4
        L34:
            if (r2 != 0) goto L37
            goto L38
        L37:
            r3 = r4
        L38:
            java.lang.String r2 = r7.j()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onEveryFillItem isNotInAnim "
            r5.<init>(r6)
            r5.append(r3)
            r6 = 32
            r5.append(r6)
            boolean r6 = r7.X
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5)
            if (r3 == 0) goto L63
            boolean r2 = r7.X
            if (r2 == 0) goto L63
            r7.X(r8)
            r7.X = r4
        L63:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.q1.q(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "onResume"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) r9
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "model"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r2)
            super.s(r9)
            kotlinx.coroutines.flow.j2 r9 = r8.S
            kotlinx.coroutines.flow.h3 r9 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r9
            java.lang.Object r9 = r9.mo144003x754a37bb()
            k84.m r9 = (k84.m) r9
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L2c
            boolean r4 = r9.b()
            if (r4 != r2) goto L2c
            r4 = r2
            goto L2d
        L2c:
            r4 = r3
        L2d:
            if (r4 != 0) goto L3e
            if (r9 == 0) goto L39
            boolean r4 = r9.a()
            if (r4 != r2) goto L39
            r4 = r2
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r4 != 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r3
        L3f:
            java.lang.String r5 = r8.j()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "onResume isContinuousClickAnim "
            r6.<init>(r7)
            if (r9 == 0) goto L56
            boolean r7 = r9.a()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L57
        L56:
            r7 = 0
        L57:
            r6.append(r7)
            java.lang.String r7 = " isNotInAnim "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6)
            if (r9 == 0) goto L73
            boolean r9 = r9.a()
            if (r9 != r2) goto L73
            r9 = r2
            goto L74
        L73:
            r9 = r3
        L74:
            if (r9 == 0) goto L7f
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView r9 = r8.f386728p
            if (r9 != 0) goto L7b
            goto L83
        L7b:
            r9.setVisibility(r3)
            goto L83
        L7f:
            if (r4 == 0) goto L83
            r8.X = r2
        L83:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.q1.s(java.lang.Object):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        V();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetClipView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.U;
        java.util.Set<android.view.ViewGroup> keySet = linkedHashMap.keySet();
        if (keySet != null) {
            for (android.view.ViewGroup viewGroup : keySet) {
                jz5.l lVar = (jz5.l) linkedHashMap.get(viewGroup);
                if (viewGroup != null) {
                    viewGroup.setClipChildren((lVar == null || (bool2 = (java.lang.Boolean) lVar.f384366d) == null) ? true : bool2.booleanValue());
                }
                if (viewGroup != null) {
                    viewGroup.setClipToPadding((lVar == null || (bool = (java.lang.Boolean) lVar.f384367e) == null) ? true : bool.booleanValue());
                }
            }
        }
        linkedHashMap.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetClipView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.S).k(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386727o;
        if (c17781x303781f != null) {
            c17781x303781f.setBackground(new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f2 = this.f386727o;
        if (c17781x303781f2 != null) {
            c17781x303781f2.setVisibility(8);
        }
        android.view.ViewGroup G = G();
        android.view.ViewGroup.LayoutParams layoutParams = G != null ? G.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 8388611;
        }
        android.view.ViewGroup G2 = G();
        if (G2 != null) {
            G2.setBackground(null);
        }
        android.widget.FrameLayout F = F();
        android.view.ViewGroup.LayoutParams layoutParams3 = F != null ? F.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = 0;
        }
        android.widget.FrameLayout F2 = F();
        android.view.ViewGroup.LayoutParams layoutParams4 = F2 != null ? F2.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = 0;
        }
        android.widget.FrameLayout F3 = F();
        if (F3 != null) {
            F3.setScaleX(1.0f);
        }
        android.widget.FrameLayout F4 = F();
        if (F4 != null) {
            F4.setScaleY(1.0f);
        }
        android.widget.FrameLayout F5 = F();
        if (F5 != null) {
            F5.requestLayout();
        }
        android.view.ViewGroup J2 = J();
        if (J2 != null) {
            J2.setAlpha(0.0f);
        }
        android.view.ViewGroup J3 = J();
        if (J3 != null) {
            J3.setVisibility(8);
        }
        android.view.ViewGroup J4 = J();
        if (J4 != null) {
            J4.setOnTouchListener(null);
        }
        android.view.ViewGroup J5 = J();
        if (J5 != null) {
            J5.setOnClickListener(null);
        }
        android.view.ViewGroup Q = Q();
        if (Q != null) {
            Q.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 c17780x7da32526 = this.f386728p;
        if (c17780x7da32526 != null) {
            c17780x7da32526.setVisibility(8);
        }
        android.view.ViewGroup P = P();
        if (P != null) {
            P.setVisibility(0);
        }
        android.view.ViewGroup R = R();
        if (R != null) {
            R.setVisibility(4);
        }
        android.view.ViewGroup N = N();
        if (N != null) {
            N.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f3 = this.f386727o;
        if (c17781x303781f3 != null) {
            c17781x303781f3.setClipChildren(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f4 = this.f386727o;
        if (c17781x303781f4 != null) {
            c17781x303781f4.setClipToPadding(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f5 = this.f386727o;
        if (c17781x303781f5 != null) {
            c17781x303781f5.setClipToOutline(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f6 = this.f386727o;
        if (c17781x303781f6 != null) {
            c17781x303781f6.setOutlineProvider(new al5.z1(a84.d0.a(4)));
        }
        this.N = 1;
        this.Q = 0;
        W();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }
}
