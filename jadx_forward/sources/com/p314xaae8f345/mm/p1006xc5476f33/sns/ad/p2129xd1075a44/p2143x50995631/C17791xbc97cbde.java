package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2143x50995631;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout */
/* loaded from: classes4.dex */
public class C17791xbc97cbde extends android.widget.LinearLayout implements p012xc85e97e9.p093xedfae76a.x, q84.d {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f245061d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f245062e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f245063f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f245064g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f245065h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f245066i;

    /* renamed from: m, reason: collision with root package name */
    public long f245067m;

    /* renamed from: n, reason: collision with root package name */
    public q84.a f245068n;

    public C17791xbc97cbde(android.content.Context context) {
        super(context);
        this.f245066i = true;
        this.f245067m = -1L;
        b(context);
    }

    /* renamed from: setDateTime */
    private void m69573xe16dce1d(a84.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        if (e0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.CountDownTimerLayout", "the date time is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            return;
        }
        if (e0Var.f83805a > 0) {
            a84.y0.p(this.f245062e, true);
            a84.y0.p(this.f245061d, true);
            c(this.f245062e, java.lang.String.valueOf(e0Var.f83805a));
        } else {
            a84.y0.p(this.f245062e, false);
            a84.y0.p(this.f245061d, false);
        }
        c(this.f245063f, a84.f0.a(e0Var.f83806b));
        c(this.f245064g, a84.f0.a(e0Var.f83807c));
        c(this.f245065h, a84.f0.a(e0Var.f83808d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @Override // q84.d
    public void a(long j17, a84.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            this.f245067m = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            boolean isAttachedToWindow = isAttachedToWindow();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            if (isAttachedToWindow && this.f245066i) {
                m69573xe16dce1d(e0Var);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public void b(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqg, this);
            this.f245068n = new q84.a(this);
            this.f245061d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568513n26);
            this.f245062e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568512n25);
            this.f245063f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n27);
            this.f245064g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n28);
            this.f245065h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n29);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public final void c(android.widget.TextView textView, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        if (textView != null) {
            textView.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: doPause */
    public final void m69574x6bee482b(p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPause", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            this.f245066i = false;
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: doResume */
    public final void m69575x157bec98(p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            this.f245066i = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        } catch (java.lang.Throwable unused) {
        }
        if (this.f245066i) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            boolean isAttachedToWindow = isAttachedToWindow();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            if (isAttachedToWindow) {
                long j17 = this.f245067m;
                if (j17 >= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
                    a84.e0 d17 = a84.f0.d(j17, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
                    m69573xe16dce1d(d17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @Override // q84.d
    /* renamed from: getCountDownVM */
    public q84.e mo69576x32d7cb92() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        super.onAttachedToWindow();
        try {
            android.content.Context context = getContext();
            if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context).mo273xed6858b4().a(this);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        super.onDetachedFromWindow();
        try {
            android.content.Context context = getContext();
            if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context).mo273xed6858b4().c(this);
            }
            q84.e mo69576x32d7cb92 = mo69576x32d7cb92();
            q84.a aVar = this.f245068n;
            if (aVar != null) {
                aVar.b(mo69576x32d7cb92);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CountDownTimerLayout", "onDetachedFromWindow, exp=" + th6);
            ca4.q.c("CountDownTimerLayout, stopCountDown", new java.lang.RuntimeException("stopCountDown"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public C17791xbc97cbde(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245066i = true;
        this.f245067m = -1L;
        b(context);
    }

    public C17791xbc97cbde(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f245066i = true;
        this.f245067m = -1L;
        b(context);
    }

    public C17791xbc97cbde(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f245066i = true;
        this.f245067m = -1L;
        b(context);
    }
}
