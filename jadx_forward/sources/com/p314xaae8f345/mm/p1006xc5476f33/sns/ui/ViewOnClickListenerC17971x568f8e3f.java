package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC17971x568f8e3f extends android.widget.RelativeLayout implements android.view.View.OnClickListener, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1, android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, com.p314xaae8f345.mm.p2470x93e71c27.ui.d1 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f247883p1 = 0;
    public java.lang.String A;
    public boolean B;
    public int C;
    public int D;
    public volatile boolean E;
    public volatile int F;
    public volatile boolean G;
    public volatile boolean H;
    public volatile boolean I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f247884J;
    public volatile boolean K;
    public volatile boolean L;
    public long M;
    public int N;
    public int P;
    public int Q;
    public int R;
    public int S;
    public long T;
    public long U;
    public int V;
    public final android.view.View.OnClickListener W;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f247885d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.GestureDetector f247886e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f247887f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f247888g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f247889h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f247890i;

    /* renamed from: l1, reason: collision with root package name */
    public final java.lang.Runnable f247891l1;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c f247892m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf f247893n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f247894o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f247895p;

    /* renamed from: p0, reason: collision with root package name */
    public final m34.e f247896p0;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f247897q;

    /* renamed from: r, reason: collision with root package name */
    public int f247898r;

    /* renamed from: s, reason: collision with root package name */
    public int f247899s;

    /* renamed from: t, reason: collision with root package name */
    public int f247900t;

    /* renamed from: u, reason: collision with root package name */
    public int f247901u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f247902v;

    /* renamed from: w, reason: collision with root package name */
    public int f247903w;

    /* renamed from: x, reason: collision with root package name */
    public int f247904x;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a f247905x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f247906y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.Runnable f247907y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f247908z;

    public ViewOnClickListenerC17971x568f8e3f(android.content.Context context) {
        super(context);
        this.f247887f = null;
        this.E = false;
        this.F = 0;
        this.G = true;
        this.H = false;
        this.I = true;
        this.f247884J = false;
        this.K = true;
        this.L = false;
        this.M = 0L;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j5 j5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j5(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.W = j5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k5 k5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k5(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f247896p0 = k5Var;
        this.f247907y0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l5(this);
        this.f247891l1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m5(this);
        this.f247885d = context;
        this.f247886e = new android.view.GestureDetector(this);
    }

    public static /* synthetic */ void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        viewOnClickListenerC17971x568f8e3f.m70596x52fd1596(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf = viewOnClickListenerC17971x568f8e3f.f247893n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return c19744xe1ab67bf;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c c17921x3d04160c = viewOnClickListenerC17971x568f8e3f.f247892m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return c17921x3d04160c;
    }

    public static /* synthetic */ void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        viewOnClickListenerC17971x568f8e3f.B(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public static /* synthetic */ int g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        int i17 = viewOnClickListenerC17971x568f8e3f.f247903w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return i17;
    }

    /* renamed from: setFocus */
    private void m70596x52fd1596(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFocus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a aVar = this.f247905x0;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5) aVar).V6(true);
                }
                this.f247893n.setVisibility(0);
                this.f247895p.setVisibility(0);
                this.f247894o.setVisibility(0);
                h(this.f247907y0);
            } else {
                this.I = false;
                this.f247893n.setVisibility(4);
                this.f247895p.setVisibility(8);
                this.f247894o.setVisibility(8);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f247907y0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a aVar2 = this.f247905x0;
                if (aVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5) aVar2).V6(false);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFocus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "starting play, downFailed=" + this.H);
            if (this.H) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", "last download fail ,try again");
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf = this.f247893n;
                    if (c19744xe1ab67bf != null && c19744xe1ab67bf.getParent() != null) {
                        ((android.view.ViewGroup) this.f247893n.getParent()).removeView(this.f247893n);
                    }
                    this.f247892m.m70215xec596ddd(true);
                    this.f247892m.h(false, this.A, 0);
                    if (this.f247885d.getResources().getConfiguration().orientation == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                        p();
                    } else if (this.f247885d.getResources().getConfiguration().orientation == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                        s();
                    }
                    this.f247892m.a(0.0d, true);
                    this.f247892m.k();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    return;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h5(this));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void B(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f247893n.mo61296x11f3be80(z17);
            this.f247893n.m75824x20617a52().getLayoutParams().width = this.f247900t;
            this.f247893n.m75824x20617a52().getLayoutParams().height = this.f247900t;
            android.content.Context context = this.f247885d;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "startPlay");
                this.f247893n.m75824x20617a52().setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80595xfe9eb87));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "pausePlay");
                this.f247893n.m75824x20617a52().setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80594xed5384c7));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoEnded", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.R++;
            this.f247892m.m();
            this.f247892m.e();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoEnded", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", "online play error, %s", str3);
        this.H = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, 18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.E = true;
        this.U = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "mediaId = " + str2 + ", start loading");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.d1
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoopCompletion", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            int mo61523x898ffe25 = this.f247892m.mo61523x898ffe25();
            if (mo61523x898ffe25 >= this.f247904x) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "onLoopCompletion, currPosSec is " + mo61523x898ffe25);
                this.R = this.R + 1;
                this.f247892m.a(0.0d, true);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoopCompletion", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void h(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 4000L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        if (this.U != 0) {
            this.V = (int) (this.V + (java.lang.System.currentTimeMillis() - this.U));
            this.U = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f247895p.setImageDrawable(i65.a.i(this.f247885d, com.p314xaae8f345.mm.R.raw.f79602xd1416a50));
            this.f247892m.mo61536x764d819b(true);
            this.f247906y = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f247891l1);
            android.view.View view = this.f247897q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            B(true);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public android.content.Intent m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createLongVideoIntent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        android.content.Intent intent = new android.content.Intent();
        try {
            if (this.f247892m.mo61531xc00617a4() && this.M != 0) {
                this.T += java.lang.System.currentTimeMillis() - this.M;
                this.M = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "playTimeInterval update");
            }
            intent.putExtra("KComponentVideoType", this.f247901u);
            intent.putExtra("KComponentCid", this.f247902v);
            intent.putExtra("KComponentCurrentTime", this.f247892m.mo61523x898ffe25());
            intent.putExtra("KComponentVoiceType", this.f247906y);
            intent.putExtra("KComponentProgressType", this.f247892m.mo61531xc00617a4());
            intent.putExtra("KComponentClickPlayControlCount", this.N);
            intent.putExtra("KComponentDoubleClickCount", this.P);
            intent.putExtra("KComponentClickVoiceControlCount", this.Q);
            intent.putExtra("KComponentPlayCompletedCount", this.R);
            intent.putExtra("KComponentPlayCount", this.S);
            intent.putExtra("KComponentPlayTimeInterval", this.T);
            intent.putExtra("KComponentIsWaiting", this.E);
            intent.putExtra("KComponentSeekTimeDueWaiting", this.F);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createLongVideoIntent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return intent;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.E = false;
        this.F = 0;
        j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "mediaId = " + str2 + ", end loading");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c c17921x3d04160c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepared", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.H = false;
        if (this.f247904x <= 0 && (c17921x3d04160c = this.f247892m) != null) {
            this.f247904x = c17921x3d04160c.mo61527x6d590e18();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepared", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            if (view.getId() == com.p314xaae8f345.mm.R.id.f568536n56) {
                this.Q++;
                m70596x52fd1596(true);
                if (this.f247906y) {
                    y();
                } else {
                    k();
                }
            } else if (view.getId() == com.p314xaae8f345.mm.R.id.f568535n55) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f247891l1);
                android.view.View view2 = this.f247897q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.app.Activity) this.f247885d).finish();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        super.onConfigurationChanged(configuration);
        try {
            int i17 = configuration.orientation;
            if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                s();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTap", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "onDoubleTap");
            if (!this.H) {
                this.P++;
            }
            h(this.f247907y0);
            if (this.f247892m.mo61531xc00617a4()) {
                z();
            } else {
                if (this.f247906y) {
                    k();
                } else {
                    y();
                }
                A();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDown", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDown", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFling", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFling", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekComplete", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekComplete", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowPress", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowPress", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "onSingleTapConfirmed");
            if (this.I) {
                this.I = false;
                m70596x52fd1596(false);
            } else {
                this.I = true;
                m70596x52fd1596(true);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f247886e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return onTouchEvent;
    }

    public final void p() {
        android.content.Context context = this.f247885d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            android.view.ViewParent parent = this.f247893n.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f247893n);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f247889h.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 64);
            layoutParams.rightMargin = i65.a.b(context, 64);
            ((android.widget.RelativeLayout.LayoutParams) this.f247890i.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.widget.RelativeLayout.LayoutParams) this.f247894o.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.view.ViewGroup) this.f247889h).addView(this.f247893n, new android.widget.RelativeLayout.LayoutParams(this.f247899s - i65.a.b(context, 232), -2));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void q() {
        android.content.Context context = this.f247885d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLongVideoComponents", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f247889h = this.f247887f.findViewById(com.p314xaae8f345.mm.R.id.ate);
            this.f247890i = this.f247887f.findViewById(com.p314xaae8f345.mm.R.id.h5t);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf) this.f247887f.findViewById(com.p314xaae8f345.mm.R.id.lbl);
            this.f247893n = c19744xe1ab67bf;
            c19744xe1ab67bf.setVisibility(0);
            this.f247893n.mo69284xb892d55(this.W);
            this.f247893n.mo69283xbdcdae58(this.f247896p0);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568535n55);
            this.f247894o = imageView;
            imageView.setVisibility(0);
            this.f247894o.setOnClickListener(this);
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568536n56);
            this.f247895p = imageView2;
            imageView2.setVisibility(0);
            this.f247895p.setOnClickListener(this);
            android.view.View findViewById = this.f247887f.findViewById(com.p314xaae8f345.mm.R.id.kqc);
            this.f247897q = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "initLongVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "initLongVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewParent parent = this.f247893n.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f247893n);
            }
            this.f247892m.mo64632xb9405cf9(this.f247893n);
            if (context.getResources().getConfiguration().orientation == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (context.getResources().getConfiguration().orientation == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                s();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLongVideoComponents", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void r() {
        android.content.Context context = this.f247885d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLongVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570769bt5, (android.view.ViewGroup) this, true);
            this.f247887f = inflate;
            this.f247888g = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.oxs);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c c17921x3d04160c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c(context, null);
            this.f247892m = c17921x3d04160c;
            this.f247888g.addView(c17921x3d04160c);
            this.f247892m.m70216x526554de(this);
            this.f247892m.m70215xec596ddd(true);
            this.f247892m.h(false, this.A, 0);
            this.f247892m.setClickable(true);
            this.f247892m.setOnTouchListener(this);
            this.f247892m.mo48236x764cf626(true);
            this.f247892m.mo64630x8fda8107(this);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLongVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void s() {
        android.content.Context context = this.f247885d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPortraitParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            android.view.ViewParent parent = this.f247893n.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f247893n);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f247889h.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 0);
            layoutParams.rightMargin = i65.a.b(context, 0);
            ((android.widget.RelativeLayout.LayoutParams) this.f247890i.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.widget.RelativeLayout.LayoutParams) this.f247894o.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.view.ViewGroup) this.f247889h).addView(this.f247893n, new android.widget.RelativeLayout.LayoutParams(this.f247898r - i65.a.b(context, 74), -2));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPortraitParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: setProgressBarStatusListener */
    public void m70597xb0e184ca(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f247905x0 = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void t(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initScreenParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (i18 >= i17) {
                this.f247898r = i17;
                this.f247899s = i18;
            } else {
                this.f247899s = i17;
                this.f247898r = i18;
            }
            this.f247900t = i65.a.b(this.f247885d, 32);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initScreenParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVideoView", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            r();
            q();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLongVideoPlayStatus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            try {
                if (this.f247906y) {
                    k();
                } else {
                    y();
                }
                A();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLongVideoPlayStatus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            m70596x52fd1596(true);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVideoView", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void v(int i17, java.lang.String str, int i18, int i19, boolean z17, boolean z18, java.lang.String str2, java.lang.String str3, boolean z19, int i27, int i28) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.G = true;
            this.K = true;
            this.f247901u = i17;
            this.f247902v = str;
            this.f247903w = i18;
            this.f247904x = i19;
            this.f247906y = z17;
            this.f247908z = z18;
            this.A = str3;
            this.B = z19;
            this.C = i27;
            this.D = i28;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f247892m.m();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f247907y0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f247891l1);
            j();
            ca4.e0.a("landing_page_video_comp_loading_time", java.lang.String.valueOf(this.V), 2, 0, "");
            this.f247892m.d();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void x() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (!this.K && !this.f247892m.mo61531xc00617a4() && this.L) {
                A();
                this.L = false;
            }
            this.K = false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f247895p.setImageDrawable(i65.a.i(this.f247885d, com.p314xaae8f345.mm.R.raw.f79603x5954b0de));
            this.f247892m.mo61536x764d819b(false);
            this.f247906y = false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i5(this));
            if (this.M != 0) {
                this.T += java.lang.System.currentTimeMillis() - this.M;
                this.M = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongVideoFullScreenView", "playTimeInterval update");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public ViewOnClickListenerC17971x568f8e3f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247887f = null;
        this.E = false;
        this.F = 0;
        this.G = true;
        this.H = false;
        this.I = true;
        this.f247884J = false;
        this.K = true;
        this.L = false;
        this.M = 0L;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j5 j5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j5(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.W = j5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k5 k5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k5(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f247896p0 = k5Var;
        this.f247907y0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l5(this);
        this.f247891l1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m5(this);
        this.f247885d = context;
        this.f247886e = new android.view.GestureDetector(this);
    }

    public ViewOnClickListenerC17971x568f8e3f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f247887f = null;
        this.E = false;
        this.F = 0;
        this.G = true;
        this.H = false;
        this.I = true;
        this.f247884J = false;
        this.K = true;
        this.L = false;
        this.M = 0L;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j5 j5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j5(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.W = j5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k5 k5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k5(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f247896p0 = k5Var;
        this.f247907y0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l5(this);
        this.f247891l1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m5(this);
        this.f247885d = context;
        this.f247886e = new android.view.GestureDetector(this);
    }
}
