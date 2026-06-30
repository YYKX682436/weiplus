package d84;

/* loaded from: classes4.dex */
public abstract class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b F;
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b G;
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f308608J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public final jz5.g O;
    public final jz5.g P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public float U;
    public int V;
    public boolean W;
    public boolean X;
    public final android.os.Handler Y;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f308609a0;

    /* renamed from: b0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f308610b0;

    /* renamed from: c0, reason: collision with root package name */
    public final d84.l f308611c0;

    /* renamed from: d0, reason: collision with root package name */
    public final d84.o f308612d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d84.y f308613e0;

    /* renamed from: f0, reason: collision with root package name */
    public final d84.k f308614f0;

    /* renamed from: g0, reason: collision with root package name */
    public final d84.n f308615g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d84.x f308616h0;

    /* renamed from: i0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2130x5e45d47b.C17770x1cc333d0 f308617i0;

    /* renamed from: j0, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnWindowFocusChangeListener f308618j0;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f308619o;

    /* renamed from: p, reason: collision with root package name */
    public final int f308620p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f308621q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f308622r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f308623s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Context f308624t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f308625u;

    /* renamed from: v, reason: collision with root package name */
    public d84.l0 f308626v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f308627w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f308628x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f308629y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f308630z;

    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1] */
    public j0(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        super(str, yVar, view);
        this.f308619o = view;
        this.f308620p = i17;
        this.f308621q = z17;
        this.f308622r = nVar;
        this.f308623s = iVar;
        this.f308628x = jz5.h.b(new d84.z(this));
        this.f308630z = jz5.h.b(new d84.w(this));
        this.A = jz5.h.b(new d84.q(this));
        this.B = jz5.h.b(new d84.v(this));
        this.C = jz5.h.b(new d84.a0(this));
        this.D = jz5.h.b(new d84.b0(this));
        this.E = jz5.h.b(new d84.i(this));
        this.I = jz5.h.b(new d84.r(this));
        this.f308608J = jz5.h.b(new d84.t(this));
        this.K = jz5.h.b(new d84.s(this));
        this.L = jz5.h.b(new d84.u(this));
        this.M = jz5.h.b(new d84.m(this));
        this.N = jz5.h.b(new d84.p(this));
        this.O = jz5.h.b(new d84.c0(this));
        this.P = jz5.h.b(new d84.j(this));
        this.Y = new android.os.Handler(android.os.Looper.getMainLooper());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.Z = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(bool);
        this.f308609a0 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(bool);
        this.f308611c0 = new d84.l(this);
        this.f308612d0 = new d84.o(this);
        this.f308613e0 = new d84.y(this);
        this.f308614f0 = new d84.k(this);
        this.f308615g0 = new d84.n(this);
        this.f308616h0 = new d84.x(this);
        android.content.Context context = view != null ? view.getContext() : null;
        final p012xc85e97e9.p093xedfae76a.y yVar2 = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        yVar2 = yVar2 == null ? com.p314xaae8f345.mm.app.a0.f134821d : yVar2;
        this.f308617i0 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6041x7b842b40>(yVar2) { // from class: com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1
            {
                this.f39173x3fe91575 = -623739088;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6041x7b842b40 c6041x7b842b40) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6041x7b842b40 event = c6041x7b842b40;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str2 = event.f136330g.f88242a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                d84.j0 j0Var = d84.j0.this;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = j0Var.f308625u;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                java.lang.String m70367x7525eefd = c17933xe8d1b226 != null ? c17933xe8d1b226.m70367x7525eefd() : null;
                if (m70367x7525eefd == null) {
                    m70367x7525eefd = "";
                }
                java.lang.String j17 = j0Var.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snsId is ");
                sb6.append(str2);
                sb6.append(", snsIdFromSnsInfo is ");
                sb6.append(m70367x7525eefd);
                sb6.append(", source is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                sb6.append(j0Var.f308620p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m70367x7525eefd, str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.j(), "event callback, pageValue is true, focusValue is " + ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d84.j0.F(j0Var)).mo144003x754a37bb()).booleanValue());
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d84.j0.A(j0Var)).k(java.lang.Boolean.TRUE);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                return false;
            }
        };
        this.f308618j0 = new d84.d0(this);
    }

    public static final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 A(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHalfDynamicPageNotifyFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = j0Var.Z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHalfDynamicPageNotifyFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return j2Var;
    }

    public static final /* synthetic */ android.widget.ImageView B(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView N = j0Var.N();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return N;
    }

    public static final /* synthetic */ android.widget.ImageView C(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView O = j0Var.O();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return O;
    }

    public static final /* synthetic */ android.widget.ImageView D(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView P = j0Var.P();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return P;
    }

    public static final /* synthetic */ android.widget.LinearLayout E(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsAdRockPaperScissorsView$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.LinearLayout linearLayout = j0Var.f308629y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsAdRockPaperScissorsView$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return linearLayout;
    }

    public static final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 F(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMWindowFocusChangeFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = j0Var.f308609a0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMWindowFocusChangeFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return j2Var;
    }

    public static /* synthetic */ void I(d84.j0 j0Var, android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (obj == null) {
            j0Var.H(view, i17, i18, (i37 & 8) != 0 ? 0 : i19, (i37 & 16) != 0 ? 0 : i27, (i37 & 32) != 0 ? 0 : i28, (i37 & 64) != 0 ? 0 : i29);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        } else {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLayoutView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            throw unsupportedOperationException;
        }
    }

    public static /* synthetic */ void K(d84.j0 j0Var, android.view.View view, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayoutViewMargins$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (obj == null) {
            j0Var.J(view, (i28 & 2) != 0 ? 0 : i17, (i28 & 4) != 0 ? 0 : i18, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) == 0 ? i27 : 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutViewMargins$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        } else {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLayoutViewMargins");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutViewMargins$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            throw unsupportedOperationException;
        }
    }

    public static final /* synthetic */ d84.l0 y(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdRockPaperScissorsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        d84.l0 l0Var = j0Var.f308626v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdRockPaperScissorsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return l0Var;
    }

    public static final /* synthetic */ android.content.Context z(d84.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.content.Context context = j0Var.f308624t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return context;
    }

    public final void G() {
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        java.lang.String j17 = j();
        try {
            mo48813x58998cd();
            android.content.Context context = this.f308624t;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnWindowFocusChangeListener(this.f308618j0);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void H(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = i17;
            marginLayoutParams.height = i18;
            marginLayoutParams.leftMargin = i19;
            marginLayoutParams.topMargin = i27;
            marginLayoutParams.rightMargin = i28;
            marginLayoutParams.bottomMargin = i29;
        }
        view.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void J(android.view.View view, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayoutViewMargins", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutViewMargins", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i17;
            marginLayoutParams.topMargin = i18;
            marginLayoutParams.rightMargin = i19;
            marginLayoutParams.bottomMargin = i27;
        }
        view.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutViewMargins", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void L() {
        float f17;
        int i17;
        int i18;
        double d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdRockPaperScissorsTwoLinesTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.C).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdRockPaperScissorsTwoLinesTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (linearLayout == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        int N = (int) ca4.m0.N(R());
        int i19 = this.T;
        int i27 = N < i19 ? i19 : N;
        double N2 = ca4.m0.N(M());
        int i28 = (int) (i27 + N2 + this.V);
        int i29 = (i28 * 34) / 44;
        this.R = this.Q - (i29 * 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.I).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        I(this, frameLayout, i29, i28, 0, 0, 0, 0, 120, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ((jz5.n) this.f308608J).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        I(this, frameLayout2, i29, i28, 0, 0, 0, 0, 120, null);
        I(this, linearLayout, this.R, i28, 0, 0, 0, 0, 120, null);
        int i37 = this.R - (this.T * 4);
        ca4.m0.c(this.f308624t, R(), this.U, i37, i27);
        ca4.m0.c(this.f308624t, M(), this.U, this.R, (float) N2);
        int N3 = (int) ca4.m0.N(R());
        int i38 = this.T;
        int i39 = N3 < i38 ? i38 : N3;
        int N4 = (int) ca4.m0.N(M());
        this.S = N4;
        float f18 = (((i28 - this.V) - i39) - N4) * 0.5f;
        if (i39 <= 0 || N4 <= 0 || f18 <= 0.0f) {
            f17 = f18;
            i17 = N4;
            i18 = i39;
            d17 = N2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ((jz5.n) this.D).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            int i47 = (int) f18;
            f17 = f18;
            i17 = N4;
            i18 = i39;
            d17 = N2;
            I(this, linearLayout2, this.R, i39, 0, i47, 0, 0, 96, null);
            H(M(), this.R, i17, 0, this.V, 0, i47);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "doResizeUI, titleContainerTotalHeight is " + i27 + ", descTotalHeight is " + d17 + ", titleContainerTotalHeightForAutoSize is " + i18 + ", descTotalHeightForAutoSize is " + i17 + ", twoLinesTextContainerHeight is " + i28 + ", mAvailableWidth is " + this.Q + ", textContainerWidth is " + this.R + ", titleMaxWidth is " + i37 + ", margin is " + f17);
        android.widget.LinearLayout linearLayout3 = this.f308629y;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final android.widget.TextView M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMDesc", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.P).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMDesc", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return textView;
    }

    public final android.widget.ImageView N() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.A).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return imageView;
    }

    public final android.widget.ImageView O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.K).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return imageView;
    }

    public final android.widget.ImageView P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.L).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return imageView;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 Q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdRockPaperScissorsPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194) ((jz5.n) this.f308630z).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdRockPaperScissorsPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return c22642x62f5b194;
    }

    public final android.widget.TextView R() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMTitle", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.O).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMTitle", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return textView;
    }

    public final void S(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestDynamicData", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        p3325xe03a0797.p3326xc267989b.y0 h17 = h();
        if (h17 != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(h17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new d84.f0(c17933xe8d1b226, this, null), 2, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 h18 = h();
        if (h18 != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(h18, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new d84.h0(c17933xe8d1b226, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestDynamicData", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void T() {
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        this.W = false;
        android.widget.LinearLayout linearLayout = this.f308629y;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.Y.removeCallbacksAndMessages(null);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.Z;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(bool);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f308609a0).k(bool);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        java.lang.String j17 = j();
        try {
            mo48814x2efc64();
            android.content.Context context = this.f308624t;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(this.f308618j0);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetAndRemovePAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        java.lang.String j18 = j();
        try {
            U();
            V();
            W();
        } catch (java.lang.Throwable th7) {
            ca4.q.c(j18, th7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetAndRemovePAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        this.X = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.G;
        if (c22789xd23e9a9b != null) {
            a84.y0.i(c22789xd23e9a9b);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.G;
            this.G = null;
            d84.l lVar = this.f308611c0;
            d84.k kVar = this.f308614f0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            if (c22789xd23e9a9b2 != null) {
                try {
                    c22789xd23e9a9b2.i(lVar);
                    c22789xd23e9a9b2.j(kVar);
                    c22789xd23e9a9b2.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.b0(c22789xd23e9a9b2));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "resetAndRemovePAGView success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j(), "resetAndRemovePAGView, leftDecorPAGView is not created");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void V() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.H;
        if (c22789xd23e9a9b != null) {
            a84.y0.i(c22789xd23e9a9b);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.H;
            this.H = null;
            d84.o oVar = this.f308612d0;
            d84.n nVar = this.f308615g0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            if (c22789xd23e9a9b2 != null) {
                try {
                    c22789xd23e9a9b2.i(oVar);
                    c22789xd23e9a9b2.j(nVar);
                    c22789xd23e9a9b2.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.b0(c22789xd23e9a9b2));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "resetAndRemovePAGView success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j(), "resetAndRemovePAGView, rightDecorPAGView is not created");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.F;
        if (c22789xd23e9a9b != null) {
            a84.y0.i(c22789xd23e9a9b);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.F;
            this.F = null;
            d84.y yVar = this.f308613e0;
            d84.x xVar = this.f308616h0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            if (c22789xd23e9a9b2 != null) {
                try {
                    c22789xd23e9a9b2.i(yVar);
                    c22789xd23e9a9b2.j(xVar);
                    c22789xd23e9a9b2.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.b0(c22789xd23e9a9b2));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "resetAndRemovePAGView success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j(), "resetAndRemovePAGView, snsAdRockPaperScissorsPAGView is not created");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void X(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        d84.l0 l0Var = this.f308626v;
        if (l0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            c17702x544f64e9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) l0Var.f308647m).a(l0Var, d84.l0.f308634o[2]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
        } else {
            c17702x544f64e9 = null;
        }
        if (c17702x544f64e9 != null) {
            c17702x544f64e9.f244102a = 35;
            w64.n nVar = this.f308622r;
            if (nVar != null) {
                nVar.n(c17702x544f64e9, c17933xe8d1b226);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.E).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (view != null) {
            view.setOnClickListener(new d84.i0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        java.lang.String str;
        android.content.Context context;
        java.lang.String str2;
        java.lang.String str3;
        d84.l0 l0Var;
        java.lang.String str4;
        mb4.e eVar;
        r45.jj4 b17;
        r45.jj4 jj4Var;
        int i17;
        java.lang.String str5;
        int e17;
        s34.g1 g1Var;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57;
        s34.g1 g1Var2;
        mb4.e eVar2;
        mb4.e eVar3;
        mb4.e eVar4;
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        android.view.View view = this.f308619o;
        if (view == null || (context = view.getContext()) == null) {
            str = "bindComponentModel";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        } else {
            this.f308624t = context;
            java.lang.String j17 = j();
            try {
                if (!this.f308627w) {
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdRockPaperScissorsStub", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                        android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f308628x).mo141623x754a37bb();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdRockPaperScissorsStub", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                        android.view.View h17 = a84.y0.h(viewStub);
                        this.f308629y = h17 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) h17 : null;
                        this.f308627w = true;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str3 = j17;
                        str = "bindComponentModel";
                    }
                }
                this.f308625u = model;
                l0Var = model.m70354x74235b3e().f38203x6623f7c9;
            } catch (java.lang.Throwable th7) {
                th = th7;
                str2 = j17;
                str = "bindComponentModel";
            }
            if (l0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                str = "bindComponentModel";
            } else {
                this.f308626v = l0Var;
                this.Q = ca4.m0.y(j(), this.f308624t, this.f308620p, this.f308621q);
                d84.l0 l0Var2 = this.f308626v;
                int i18 = l0Var2 != null ? l0Var2.f308635a : 0;
                int i19 = l0Var2 != null ? l0Var2.f308636b : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.f68891x29d1292e) + ", isSame is " + z17 + ", containerWidth is " + i18 + ", containerHeight is " + i19);
                if (i18 <= 0 || i19 <= 0) {
                    str2 = j17;
                    str = "bindComponentModel";
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                    }
                } else {
                    try {
                        android.widget.LinearLayout linearLayout2 = this.f308629y;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(4);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f308610b0;
                        if (baseViewHolder != null && (linearLayout = this.f308629y) != null) {
                            linearLayout.setTag(baseViewHolder);
                        }
                        android.widget.ImageView O = O();
                        if (O != null) {
                            O.setVisibility(0);
                        }
                        android.widget.ImageView P = P();
                        if (P != null) {
                            P.setVisibility(0);
                        }
                        android.widget.ImageView N = N();
                        if (N != null) {
                            N.setVisibility(0);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 Q = Q();
                        if (Q != null) {
                            Q.m81432x205ac394(i65.a.b(this.f308624t, 8));
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 Q2 = Q();
                        int i27 = this.Q;
                        int i28 = i19;
                        int i29 = i18;
                        str2 = j17;
                        str4 = "bindComponentModel";
                        try {
                            I(this, Q2, i27, (i27 * i19) / i18, 0, 0, 0, 0, 120, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.view.View view2 = (android.view.View) ((jz5.n) this.E).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            int i37 = this.Q;
                            int i38 = (int) (i37 * 0.5f);
                            I(this, view2, i38, (i37 * i28) / i29, i38, 0, 0, 0, 112, null);
                            if (com.p314xaae8f345.mm.ui.bk.C()) {
                                d84.l0 l0Var3 = this.f308626v;
                                if (l0Var3 != null && (eVar4 = l0Var3.f308638d) != null) {
                                    b17 = eVar4.b();
                                    jj4Var = b17;
                                }
                                jj4Var = null;
                            } else {
                                d84.l0 l0Var4 = this.f308626v;
                                if (l0Var4 != null && (eVar = l0Var4.f308637c) != null) {
                                    b17 = eVar.b();
                                    jj4Var = b17;
                                }
                                jj4Var = null;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                            android.widget.ImageView N2 = N();
                            android.content.Context context2 = this.f308624t;
                            int hashCode = context2 != null ? context2.hashCode() : 0;
                            com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
                            s7Var.f276846b = model.m70371x485d7().f39015xc86e6609;
                            hj6.W(jj4Var, N2, -1, hashCode, s7Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                            d84.l0 l0Var5 = this.f308626v;
                            r45.jj4 b18 = (l0Var5 == null || (eVar3 = l0Var5.f308645k) == null) ? null : eVar3.b();
                            android.widget.ImageView O2 = O();
                            android.content.Context context3 = this.f308624t;
                            int hashCode2 = context3 != null ? context3.hashCode() : 0;
                            s7Var.f276846b = model.m70371x485d7().f39015xc86e6609;
                            hj7.W(b18, O2, -1, hashCode2, s7Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                            d84.l0 l0Var6 = this.f308626v;
                            r45.jj4 b19 = (l0Var6 == null || (eVar2 = l0Var6.f308646l) == null) ? null : eVar2.b();
                            android.widget.ImageView P2 = P();
                            android.content.Context context4 = this.f308624t;
                            int hashCode3 = context4 != null ? context4.hashCode() : 0;
                            s7Var.f276846b = model.m70371x485d7().f39015xc86e6609;
                            hj8.W(b19, P2, -1, hashCode3, s7Var);
                            if (com.p314xaae8f345.mm.ui.bk.C()) {
                                d84.l0 l0Var7 = this.f308626v;
                                if (l0Var7 != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                    java.lang.String str6 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) l0Var7.f308642h).a(l0Var7, d84.l0.f308634o[1]);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                    str5 = str6;
                                } else {
                                    str5 = null;
                                }
                                i17 = 0;
                            } else {
                                d84.l0 l0Var8 = this.f308626v;
                                if (l0Var8 != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                    i17 = 0;
                                    str5 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) l0Var8.f308641g).a(l0Var8, d84.l0.f308634o[0]);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                } else {
                                    i17 = 0;
                                    str5 = null;
                                }
                            }
                            this.T = i65.a.b(this.f308624t, 8);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            jz5.g gVar = this.M;
                            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            a84.m.b(str5, imageView);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            jz5.g gVar2 = this.N;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            a84.m.b(str5, imageView2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.widget.ImageView imageView3 = (android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            int i39 = this.T;
                            int i47 = i17;
                            I(this, imageView3, i39, i39, 0, 0, 0, 0, 120, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.widget.ImageView imageView4 = (android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            int i48 = this.T;
                            I(this, imageView4, i48, i48, 0, 0, 0, 0, 120, null);
                            if (com.p314xaae8f345.mm.ui.bk.C()) {
                                d84.l0 l0Var9 = this.f308626v;
                                e17 = ca4.n0.e((l0Var9 == null || (g1Var2 = l0Var9.f308640f) == null) ? null : g1Var2.b(), android.graphics.Color.parseColor("#D39A4A"));
                            } else {
                                d84.l0 l0Var10 = this.f308626v;
                                e17 = ca4.n0.e((l0Var10 == null || (g1Var = l0Var10.f308640f) == null) ? null : g1Var.a(), android.graphics.Color.parseColor("#D39A4A"));
                            }
                            float b27 = i65.a.b(this.f308624t, 17);
                            float b28 = i65.a.b(this.f308624t, 14) * i65.a.q(this.f308624t);
                            this.U = b28 > b27 ? b27 : b28;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "bindComponentModel, currentSizePx is " + b28 + ", maxSizePx is " + b27 + ", mTryMaxSizePx is " + this.U);
                            android.widget.TextView R = R();
                            if (R != null) {
                                d84.l0 l0Var11 = this.f308626v;
                                R.setText(l0Var11 != null ? l0Var11.f308639e : null);
                                R.setTextColor(e17);
                                R.setTextSize(i47, this.U);
                            }
                            android.widget.TextView M = M();
                            if (M != null) {
                                d84.l0 l0Var12 = this.f308626v;
                                M.setText(l0Var12 != null ? l0Var12.f308643i : null);
                                M.setTextSize(i47, this.U);
                            }
                            this.V = i65.a.b(this.f308624t, 4);
                            android.widget.TextView R2 = R();
                            int i49 = this.T;
                            J(R2, i49, 0, i49, 0);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdRockPaperScissorsBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ((jz5.n) this.B).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdRockPaperScissorsBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            K(this, linearLayout3, 0, i65.a.b(this.f308624t, 12), 0, 0, 24, null);
                            K(this, M(), 0, this.V, 0, 0, 24, null);
                            L();
                            S(model);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            p3325xe03a0797.p3326xc267989b.y0 h18 = h();
                            if (h18 != null) {
                                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                                interfaceC29045xdcb5ca57 = null;
                                p3325xe03a0797.p3326xc267989b.l.d(h18, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new d84.h(model, this, null), 2, null);
                            } else {
                                interfaceC29045xdcb5ca57 = null;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            X(this.f308624t, model);
                            G();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleAtCommentClick", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            p3325xe03a0797.p3326xc267989b.y0 h19 = h();
                            if (h19 != null) {
                                p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                                p3325xe03a0797.p3326xc267989b.l.d(h19, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new d84.d(this, interfaceC29045xdcb5ca57), 2, null);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAtCommentClick", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            this.X = true;
                            str = str4;
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            str = str4;
                            str3 = str2;
                            ca4.q.c(str3, th);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        str2 = j17;
                        str4 = "bindComponentModel";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                }
                str3 = str2;
                ca4.q.c(str3, th);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void s(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        super.s(model);
        if (this.X) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "onResume, requestDynamicData");
            S(model);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "resetComponentState");
        T();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }
}
