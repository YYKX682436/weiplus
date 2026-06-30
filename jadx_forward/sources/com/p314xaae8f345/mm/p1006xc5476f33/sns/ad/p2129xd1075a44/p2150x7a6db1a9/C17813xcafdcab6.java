package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView */
/* loaded from: classes4.dex */
public class C17813xcafdcab6 extends android.widget.LinearLayout implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f245382d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f245383e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f245384f;

    /* renamed from: g, reason: collision with root package name */
    public f54.d f245385g;

    /* renamed from: h, reason: collision with root package name */
    public a94.b0 f245386h;

    /* renamed from: i, reason: collision with root package name */
    public a94.x f245387i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f245388m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245389n;

    public C17813xcafdcab6(android.content.Context context) {
        super(context);
        this.f245388m = false;
        this.f245389n = false;
        a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        setOrientation(0);
        setGravity(16);
        this.f245382d = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cq9, this);
        this.f245383e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dga);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dgb);
        this.f245384f = textView;
        ca4.m0.x0(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.a_h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4().a(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public void b() {
        f54.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        if (this.f245388m || this.f245389n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShakeRandomEncoreView", "startListenShake, isUIPaused=" + this.f245389n + ", isDestroyed=" + this.f245388m);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
            return;
        }
        a94.b0 b0Var = this.f245386h;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShakeRandomEncoreView", "startListenShake, shakeSensor==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
            return;
        }
        if (!b0Var.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeRandomEncoreView", "sensor not support");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 3);
        if (!this.f245386h.b() && (dVar = this.f245385g) != null) {
            int i17 = dVar.f341239d;
            int i18 = dVar.f341240e;
            if (i17 < 8) {
                i17 = 8;
            }
            if (i18 < 10) {
                i18 = 10;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "startListenShake， min=" + i17 + ", max=" + i18);
            this.f245386h.d(new a94.z(this, i17, i18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        a94.b0 b0Var = this.f245386h;
        if (b0Var != null) {
            if (b0Var.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "stopListenShake");
            }
            this.f245386h.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "onDetachedFromWindow");
        this.f245388m = true;
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onUIPause */
    public void m69688xfe061103() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "onUIPause");
        this.f245389n = true;
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onUIResume */
    public void m69689xc65d3ec0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "onUIResume");
        this.f245389n = false;
        b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    /* renamed from: setOnShakeListener */
    public void m69690xebbf6179(a94.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        this.f245387i = xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public C17813xcafdcab6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245388m = false;
        this.f245389n = false;
        a(context);
    }
}
