package v74;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: v, reason: collision with root package name */
    public static final v74.l0 f515423v = new v74.l0(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f515424a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f515425b;

    /* renamed from: c, reason: collision with root package name */
    public v74.m f515426c;

    /* renamed from: d, reason: collision with root package name */
    public s34.s f515427d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17763x43ffafc5 f515428e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f515429f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f515430g;

    /* renamed from: h, reason: collision with root package name */
    public int f515431h;

    /* renamed from: i, reason: collision with root package name */
    public int f515432i;

    /* renamed from: j, reason: collision with root package name */
    public int f515433j;

    /* renamed from: k, reason: collision with root package name */
    public double f515434k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f515435l;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f515436m;

    /* renamed from: n, reason: collision with root package name */
    public int f515437n;

    /* renamed from: o, reason: collision with root package name */
    public long f515438o;

    /* renamed from: p, reason: collision with root package name */
    public int f515439p;

    /* renamed from: q, reason: collision with root package name */
    public int f515440q;

    /* renamed from: r, reason: collision with root package name */
    public final v74.o0 f515441r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f515442s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f515443t;

    /* renamed from: u, reason: collision with root package name */
    public final int f515444u;

    public s0(android.content.Context mContext, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f515424a = mContext;
        this.f515425b = "";
        this.f515435l = true;
        this.f515436m = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f515439p = Integer.MAX_VALUE;
        this.f515441r = new v74.o0(this);
        this.f515444u = 150;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "clearAll");
        this.f515436m.removeCallbacksAndMessages(null);
        b();
        e();
        this.f515425b = "";
        this.f515426c = null;
        this.f515427d = null;
        this.f515431h = 0;
        this.f515432i = 0;
        this.f515433j = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearPagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "clearPagView");
        try {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f515429f;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.n();
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f515430g;
            if (c22789xd23e9a9b2 != null) {
                c22789xd23e9a9b2.n();
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdLookbookPagAnimLogic", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17763x43ffafc5 c17763x43ffafc5 = this.f515428e;
        if (c17763x43ffafc5 != null) {
            c17763x43ffafc5.removeAllViews();
        }
        this.f515429f = null;
        this.f515430g = null;
        android.animation.ValueAnimator valueAnimator = this.f515442s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f515443t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f515435l = true;
        this.f515434k = 0.0d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearPagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        int i17 = this.f515439p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        return i17;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        this.f515436m.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f515429f;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.getAlpha();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideThemePagView$default", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f515429f;
            if (c22789xd23e9a9b2 != null) {
                android.animation.ValueAnimator valueAnimator = this.f515442s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ValueAnimator valueAnimator2 = this.f515443t;
                boolean isRunning = valueAnimator2 != null ? valueAnimator2.isRunning() : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "hideThemePagView, isAnimRun=" + isRunning + ", curAlpha=" + c22789xd23e9a9b2.getAlpha());
                if (c22789xd23e9a9b2.getAlpha() > 0.0f && !isRunning) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(c22789xd23e9a9b2.getAlpha(), 0.0f);
                    ofFloat.setDuration(c22789xd23e9a9b2.getAlpha() * this.f515444u);
                    ofFloat.addUpdateListener(new v74.n0(this));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "do hideThemePagView, duration=" + ofFloat.getDuration());
                    ofFloat.start();
                    this.f515443t = ofFloat;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideThemePagView$default", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            if (c22789xd23e9a9b.f()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "doPause themePag, progress=" + this.f515434k);
                c22789xd23e9a9b.n();
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f515429f;
                this.f515434k = c22789xd23e9a9b3 != null ? c22789xd23e9a9b3.m82577x402effa3() : 0.0d;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "clearFrameRate");
        this.f515440q = 0;
        this.f515437n = 0;
        this.f515438o = 0L;
        this.f515439p = Integer.MAX_VALUE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFrameCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        this.f515437n = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFrameCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f515429f;
        if (c22789xd23e9a9b != null) {
            if (!z17) {
                c22789xd23e9a9b.setAlpha(1.0f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
                return;
            }
            android.animation.ValueAnimator valueAnimator = this.f515443t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator valueAnimator2 = this.f515442s;
            boolean isRunning = valueAnimator2 != null ? valueAnimator2.isRunning() : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "showThemePagView, isAnimRun=" + isRunning + ", curAlpha=" + c22789xd23e9a9b.getAlpha());
            if (c22789xd23e9a9b.getAlpha() < 1.0f && !isRunning) {
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(c22789xd23e9a9b.getAlpha(), 1.0f);
                ofFloat.setDuration((1 - c22789xd23e9a9b.getAlpha()) * this.f515444u);
                ofFloat.addUpdateListener(new v74.q0(this));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "do showThemePagView, duration=" + ofFloat.getDuration());
                ofFloat.start();
                this.f515442s = ofFloat;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }
}
