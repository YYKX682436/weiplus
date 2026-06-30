package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC18000xb62389be extends android.widget.RelativeLayout implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f248182x0 = 0;
    public volatile boolean A;
    public volatile boolean B;
    public int C;
    public java.lang.String D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f248183J;
    public final android.view.View.OnClickListener K;
    public final m34.e L;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a M;
    public long N;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public long U;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f9 V;
    public final java.lang.Runnable W;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f248184d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f248185e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f248186f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f248187g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d f248188h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf f248189i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f248190m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f248191n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f248192o;

    /* renamed from: p, reason: collision with root package name */
    public int f248193p;

    /* renamed from: p0, reason: collision with root package name */
    public final java.lang.Runnable f248194p0;

    /* renamed from: q, reason: collision with root package name */
    public int f248195q;

    /* renamed from: r, reason: collision with root package name */
    public int f248196r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f248197s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f248198t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.GestureDetector f248199u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f248200v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f248201w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f248202x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f248203y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f248204z;

    public ViewOnClickListenerC18000xb62389be(android.content.Context context) {
        super(context);
        this.f248184d = null;
        this.f248200v = false;
        this.f248201w = false;
        this.f248202x = true;
        this.f248203y = true;
        this.f248204z = false;
        this.A = true;
        this.B = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b9 b9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.K = b9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c9 c9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.L = c9Var;
        this.N = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0L;
        this.W = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d9(this);
        this.f248194p0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e9(this);
        this.f248197s = context;
        this.f248199u = new android.view.GestureDetector(this);
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d = viewOnClickListenerC18000xb62389be.f248188h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return c17982x5116533d;
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        viewOnClickListenerC18000xb62389be.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateProgressBarSeek", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y8(viewOnClickListenerC18000xb62389be, i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateProgressBarSeek", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public static /* synthetic */ void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        viewOnClickListenerC18000xb62389be.C(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public static /* synthetic */ android.view.View e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        android.view.View view = viewOnClickListenerC18000xb62389be.f248192o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return view;
    }

    public static /* synthetic */ void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        viewOnClickListenerC18000xb62389be.m70691x52fd1596(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public static /* synthetic */ int h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        int i17 = viewOnClickListenerC18000xb62389be.E;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return i17;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf = viewOnClickListenerC18000xb62389be.f248189i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return c19744xe1ab67bf;
    }

    public static /* synthetic */ boolean j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        boolean z17 = viewOnClickListenerC18000xb62389be.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return z17;
    }

    public static void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        viewOnClickListenerC18000xb62389be.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initsightVideoThumbImage", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            java.lang.String l17 = za4.t0.l("adId", viewOnClickListenerC18000xb62389be.I);
            if (com.p314xaae8f345.mm.vfs.w6.j(l17)) {
                viewOnClickListenerC18000xb62389be.f248188h.e(l17);
            } else {
                za4.t0.b("adId", viewOnClickListenerC18000xb62389be.I, false, 1000000001, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v8(viewOnClickListenerC18000xb62389be));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initsightVideoThumbImage", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: setFocus */
    private void m70691x52fd1596(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a aVar = this.M;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5) aVar).V6(true);
                }
                this.f248189i.setVisibility(0);
                this.f248191n.setVisibility(0);
                this.f248190m.setVisibility(0);
                l(this.W);
            } else {
                this.f248203y = false;
                this.f248189i.setVisibility(4);
                this.f248191n.setVisibility(8);
                this.f248190m.setVisibility(8);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.W);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a aVar2 = this.M;
                if (aVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5) aVar2).V6(false);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sightVideoPausePlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a9(this));
        if (this.N != 0) {
            this.U += java.lang.System.currentTimeMillis() - this.N;
            this.N = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "playTimeInterval update");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sightVideoPausePlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        if (this.f248200v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", "last download fail, try again");
            this.f248188h.p();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            return;
        }
        if (!this.f248201w && !android.text.TextUtils.isEmpty(this.f248198t)) {
            this.f248188h.j(this.f248198t);
            this.f248201w = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z8(this));
        this.N = java.lang.System.currentTimeMillis();
        this.T++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void C(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f248189i.mo61296x11f3be80(z17);
            this.f248189i.m75824x20617a52().getLayoutParams().width = this.f248196r;
            this.f248189i.m75824x20617a52().getLayoutParams().height = this.f248196r;
            android.content.Context context = this.f248197s;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "startPlay");
                this.f248189i.m75824x20617a52().setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80595xfe9eb87));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "pausePlay");
                this.f248189i.m75824x20617a52().setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80594xed5384c7));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void a() {
        android.content.Context context;
        android.media.AudioManager audioManager;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            context = this.f248197s;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", "abandonAudioFocus has something wrong!");
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", "context is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            return;
        }
        if (this.V != null && (audioManager = (android.media.AudioManager) context.getSystemService("audio")) != null) {
            audioManager.abandonAudioFocus(this.V);
            this.V = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void l(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 4000L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f248191n.setImageDrawable(i65.a.i(this.f248197s, com.p314xaae8f345.mm.R.raw.f79602xd1416a50));
            this.f248188h.m70613x764d819b(true);
            this.G = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public android.content.Intent o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSightVideoIntent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        android.content.Intent intent = new android.content.Intent();
        try {
            if (this.f248188h.h() && this.N != 0) {
                this.U += java.lang.System.currentTimeMillis() - this.N;
                this.N = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "playTimeInterval update");
            }
            intent.putExtra("KComponentVideoType", this.C);
            intent.putExtra("KComponentCid", this.D);
            intent.putExtra("KComponentCurrentTime", this.f248188h.m70608xddd35a52());
            intent.putExtra("KComponentVoiceType", this.G);
            intent.putExtra("KComponentProgressType", this.f248188h.h());
            intent.putExtra("KComponentClickPlayControlCount", this.P);
            intent.putExtra("KComponentDoubleClickCount", this.Q);
            intent.putExtra("KComponentClickVoiceControlCount", this.R);
            intent.putExtra("KComponentPlayCompletedCount", this.S);
            intent.putExtra("KComponentPlayCount", this.T);
            intent.putExtra("KComponentPlayTimeInterval", this.U);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSightVideoIntent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return intent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            if (view.getId() == com.p314xaae8f345.mm.R.id.f568536n56) {
                this.R++;
                m70691x52fd1596(true);
                if (this.G) {
                    y();
                } else {
                    m();
                }
            } else if (view.getId() == com.p314xaae8f345.mm.R.id.f568535n55) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f248194p0);
                android.view.View view2 = this.f248192o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.app.Activity) this.f248197s).finish();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        super.onConfigurationChanged(configuration);
        try {
            int i17 = configuration.orientation;
            if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "ORIENTATION_PORTRAIT");
                q();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "onDoubleTap");
            this.Q++;
            l(this.W);
            if (this.f248188h.h()) {
                A();
            } else {
                if (this.G) {
                    m();
                } else {
                    y();
                }
                B();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDown", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDown", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFling", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFling", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowPress", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowPress", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "onSingleTapConfirmed");
            if (this.f248203y) {
                this.f248203y = false;
                m70691x52fd1596(false);
            } else {
                this.f248203y = true;
                m70691x52fd1596(true);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f248199u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return onTouchEvent;
    }

    public final void p() {
        android.content.Context context = this.f248197s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f248186f.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 64);
            layoutParams.rightMargin = i65.a.b(context, 64);
            ((android.widget.RelativeLayout.LayoutParams) this.f248187g.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.widget.RelativeLayout.LayoutParams) this.f248190m.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.widget.RelativeLayout.LayoutParams) this.f248189i.getLayoutParams()).width = this.f248195q - i65.a.b(context, 232);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void q() {
        android.content.Context context = this.f248197s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPortraitParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f248186f.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 0);
            layoutParams.rightMargin = i65.a.b(context, 0);
            ((android.widget.RelativeLayout.LayoutParams) this.f248187g.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.widget.RelativeLayout.LayoutParams) this.f248190m.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.widget.RelativeLayout.LayoutParams) this.f248189i.getLayoutParams()).width = this.f248193p - i65.a.b(context, 74);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPortraitParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void r(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initScreenParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (i18 >= i17) {
                this.f248193p = i17;
                this.f248195q = i18;
            } else {
                this.f248195q = i17;
                this.f248193p = i18;
            }
            this.f248196r = i65.a.b(this.f248197s, 32);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initScreenParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void s() {
        android.content.Context context = this.f248197s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSightVideoComponents", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cns, (android.view.ViewGroup) this, true);
            this.f248184d = inflate;
            this.f248185e = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.oxs);
            this.f248186f = this.f248184d.findViewById(com.p314xaae8f345.mm.R.id.ate);
            this.f248187g = this.f248184d.findViewById(com.p314xaae8f345.mm.R.id.h5t);
            this.f248189i = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf) this.f248184d.findViewById(com.p314xaae8f345.mm.R.id.lbl);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d(context, null);
            this.f248188h = c17982x5116533d;
            c17982x5116533d.setClickable(true);
            this.f248188h.setOnTouchListener(this);
            this.f248188h.m70615x22dcbf1d(2);
            this.f248185e.addView(this.f248188h);
            this.f248189i.setVisibility(0);
            this.f248189i.mo69284xb892d55(this.K);
            this.f248189i.mo69283xbdcdae58(this.L);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568535n55);
            this.f248190m = imageView;
            imageView.setVisibility(0);
            this.f248190m.setOnClickListener(this);
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568536n56);
            this.f248191n = imageView2;
            imageView2.setVisibility(0);
            this.f248191n.setOnClickListener(this);
            android.view.View findViewById = this.f248184d.findViewById(com.p314xaae8f345.mm.R.id.kqc);
            this.f248192o = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "initSightVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "initSightVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (context.getResources().getConfiguration().orientation == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (context.getResources().getConfiguration().orientation == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "ORIENTATION_PORTRAIT");
                q();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSightVideoComponents", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: setProgressBarStatusListener */
    public void m70692xb0e184ca(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.M = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVideoStatus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            int mo69281xdf1112ec = this.f248189i.mo69281xdf1112ec();
            int i17 = this.F;
            if (mo69281xdf1112ec != i17 / 1000) {
                this.f248189i.mo61298xa7077af8(i17 / 1000);
            }
            this.f248189i.a(this.E / 1000);
            C(this.H);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVideoStatus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVideoView", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            s();
            t();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSightVideoPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            try {
                this.f248188h.m70617x360a109e(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x8(this));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSightVideoPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            this.f248188h.p();
            m70691x52fd1596(true);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVideoView", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void v(int i17, java.lang.String str, int i18, int i19, boolean z17, boolean z18, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f248202x = true;
            this.A = true;
            this.C = i17;
            this.D = str;
            this.E = i18;
            this.F = i19;
            this.G = z17;
            this.H = z18;
            this.I = str2;
            this.f248183J = str3;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            a();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.W);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f248194p0);
            this.f248188h.i();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void x() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (this.A) {
                z();
            } else if (!this.f248188h.h() && this.B) {
                B();
                this.B = false;
            }
            this.A = false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f248191n.setImageDrawable(i65.a.i(this.f248197s, com.p314xaae8f345.mm.R.raw.f79603x5954b0de));
            this.f248188h.m70613x764d819b(false);
            this.G = false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void z() {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            context = this.f248197s;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", "requestAudioFocus has something wrong!");
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", "context is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            return;
        }
        if (this.V == null) {
            this.V = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f9(this);
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                int requestAudioFocus = audioManager.requestAudioFocus(this.V, 3, 2);
                if (requestAudioFocus == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "requestAudioFocus successfully!");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "requestAudioFocus is not granted. value = " + requestAudioFocus);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public ViewOnClickListenerC18000xb62389be(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248184d = null;
        this.f248200v = false;
        this.f248201w = false;
        this.f248202x = true;
        this.f248203y = true;
        this.f248204z = false;
        this.A = true;
        this.B = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b9 b9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.K = b9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c9 c9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.L = c9Var;
        this.N = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0L;
        this.W = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d9(this);
        this.f248194p0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e9(this);
        this.f248197s = context;
        this.f248199u = new android.view.GestureDetector(this);
    }

    public ViewOnClickListenerC18000xb62389be(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f248184d = null;
        this.f248200v = false;
        this.f248201w = false;
        this.f248202x = true;
        this.f248203y = true;
        this.f248204z = false;
        this.A = true;
        this.B = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b9 b9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.K = b9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c9 c9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.L = c9Var;
        this.N = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0L;
        this.W = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d9(this);
        this.f248194p0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e9(this);
        this.f248197s = context;
        this.f248199u = new android.view.GestureDetector(this);
    }
}
