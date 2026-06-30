package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2143x50995631;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout */
/* loaded from: classes4.dex */
public class C17792xc6c22fda extends android.widget.RelativeLayout implements q84.d, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f245069d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f245070e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f245071f;

    /* renamed from: g, reason: collision with root package name */
    public q84.e f245072g;

    /* renamed from: h, reason: collision with root package name */
    public q84.a f245073h;

    public C17792xc6c22fda(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // q84.d
    public void a(long j17, a84.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        if (j17 <= 0) {
            try {
                setVisibility(8);
            } catch (java.lang.Throwable unused) {
            }
        }
        android.view.KeyEvent.Callback callback = this.f245069d;
        if (callback instanceof q84.d) {
            ((q84.d) callback).a(j17, e0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public void b(q84.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PromotionBarLayout", "startCountDown");
            if (!isAttachedToWindow()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PromotionBarLayout", "startCountDown, !isAttachedToWindow");
            }
            q84.a aVar = this.f245073h;
            if (aVar != null) {
                aVar.a(eVar);
            }
            this.f245072g = eVar;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PromotionBarLayout", "startCountDown, exp=" + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    @Override // q84.d
    /* renamed from: getCountDownVM */
    public q84.e mo69576x32d7cb92() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        q84.e eVar = this.f245072g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        super.onDetachedFromWindow();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PromotionBarLayout", "onDetachedFromWindow");
            q84.a aVar = this.f245073h;
            if (aVar != null) {
                aVar.b(this.f245072g);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PromotionBarLayout", "onDetachedFromWindow, exp=" + th6);
            ca4.q.c("PromotionBarLayout, stopCountDown", new java.lang.RuntimeException("stopCountDown"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        super.onFinishInflate();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PromotionBarLayout", "onFinishInflate");
            this.f245073h = new q84.a(this);
            this.f245069d = findViewById(com.p314xaae8f345.mm.R.id.f564197km);
            this.f245070e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564198kn);
            this.f245071f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n2b);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    /* renamed from: setPromotionalPrice */
    public void m69577x30a8aa5d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPromotionalPrice", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        if (this.f245070e != null && !android.text.TextUtils.isEmpty(str)) {
            this.f245070e.setText(str);
            android.widget.TextView textView = this.f245070e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewWeChatSansTypeface", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            if (textView != null) {
                try {
                    if (a84.y0.f83911a == null) {
                        a84.y0.f83911a = android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), "fonts/WeChatSansStd-Medium.ttf");
                    }
                    if (a84.y0.f83911a != null) {
                        android.graphics.Typeface typeface = textView.getTypeface();
                        android.graphics.Typeface typeface2 = a84.y0.f83911a;
                        if (typeface != typeface2) {
                            textView.setTypeface(typeface2);
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewWeChatSansTypeface", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPromotionalPrice", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    /* renamed from: setRightTitle */
    public void m69578xc90f679e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRightTitle", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        android.widget.TextView textView = this.f245071f;
        if (textView != null) {
            textView.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRightTitle", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public C17792xc6c22fda(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
