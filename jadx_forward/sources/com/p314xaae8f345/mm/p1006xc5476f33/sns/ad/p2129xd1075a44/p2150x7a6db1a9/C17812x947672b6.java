package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView */
/* loaded from: classes4.dex */
public class C17812x947672b6 extends android.widget.FrameLayout implements p012xc85e97e9.p093xedfae76a.x {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public a94.x B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f245362d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f245363e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f245364f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f245365g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17798x4367c7e7 f245366h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f245367i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f245368m;

    /* renamed from: n, reason: collision with root package name */
    public a94.a f245369n;

    /* renamed from: o, reason: collision with root package name */
    public a94.b0 f245370o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f245371p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f245372q;

    /* renamed from: r, reason: collision with root package name */
    public int f245373r;

    /* renamed from: s, reason: collision with root package name */
    public fd4.r f245374s;

    /* renamed from: t, reason: collision with root package name */
    public final android.os.Handler f245375t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f245376u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f245377v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f245378w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f245379x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f245380y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f245381z;

    public C17812x947672b6(android.content.Context context) {
        super(context);
        this.f245371p = false;
        this.f245372q = false;
        this.f245375t = new a94.s(this);
        this.f245376u = true;
        this.f245377v = false;
        this.f245378w = false;
        this.f245379x = false;
        this.f245380y = false;
        this.f245381z = false;
        this.A = false;
        d(context);
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c17812x947672b6.f245362d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        return c22789xd23e9a9b;
    }

    public void b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.arg1 = (int) j17;
        android.os.Handler handler = this.f245375t;
        handler.removeMessages(1);
        handler.sendMessageDelayed(obtain, 50L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "doOnPause");
        f();
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f245367i = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cq8, (android.view.ViewGroup) this, true);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById(com.p314xaae8f345.mm.R.id.ko6);
        this.f245362d = c22789xd23e9a9b;
        c22789xd23e9a9b.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) == 1);
        this.f245363e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_o);
        this.f245364f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_e);
        this.f245365g = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.o_s);
        this.f245366h = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17798x4367c7e7) findViewById(com.p314xaae8f345.mm.R.id.f564578v4);
        ca4.m0.y0(this.f245363e, com.p314xaae8f345.mm.R.C30860x5b28f31.a_x);
        ca4.m0.y0(this.f245364f, com.p314xaae8f345.mm.R.C30860x5b28f31.a_w);
        this.f245362d.post(new a94.r(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4().a(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "startShakeAnim, isUIPaused=" + this.f245372q + ", isDestroy=" + this.f245371p);
        if (this.f245371p || this.f245372q) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        this.f245381z = true;
        this.f245362d.post(new a94.v(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        a94.b0 b0Var = this.f245370o;
        if (b0Var != null) {
            if (b0Var.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "stopListenShake");
            }
            this.f245370o.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (this.f245381z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "stopShakeAnim");
        }
        this.f245381z = false;
        this.f245362d.post(new a94.w(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public final void h(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (!this.f245380y) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "unSpreadUp, isForDestroy=" + z17);
        this.f245380y = false;
        this.A = false;
        if (z17) {
            this.f245365g.setVisibility(4);
            this.f245366h.setVisibility(4);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17798x4367c7e7 c17798x4367c7e7 = this.f245366h;
            c17798x4367c7e7.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverAnimView", "unSpreadUp, scale=" + c17798x4367c7e7.f245120e);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c17798x4367c7e7.f245119d, "alpha", 0.7f, 0.7f);
            long j17 = (long) com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a;
            ofFloat.setDuration(j17);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c17798x4367c7e7.f245119d, "scaleX", c17798x4367c7e7.f245120e, 1.0f);
            ofFloat2.setDuration(j17);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c17798x4367c7e7.f245119d, "scaleY", c17798x4367c7e7.f245120e, 1.0f);
            ofFloat3.setDuration(j17);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.start();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f245365g, "alpha", 1.0f, 0.0f);
            ofFloat4.setDuration(500L);
            ofFloat4.addListener(new a94.u(this));
            ofFloat4.start();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "onDetachedFromWindow");
        if (this.f245378w && !this.f245379x) {
            a94.m.b(this.f245368m, 2, this.f245373r);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f245371p = true;
        this.f245375t.removeCallbacksAndMessages(null);
        c();
        h(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f245376u = true;
        this.f245377v = false;
        this.f245379x = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        super.onStartTemporaryDetach();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onUIPause */
    public void m69685xfe061103() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "onUIPause");
        this.f245372q = true;
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onUIResume */
    public void m69686xc65d3ec0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "onUIResume");
        this.f245372q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: setOnShakeListener */
    public void m69687xebbf6179(a94.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.B = xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public C17812x947672b6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245371p = false;
        this.f245372q = false;
        this.f245375t = new a94.s(this);
        this.f245376u = true;
        this.f245377v = false;
        this.f245378w = false;
        this.f245379x = false;
        this.f245380y = false;
        this.f245381z = false;
        this.A = false;
        d(context);
    }
}
