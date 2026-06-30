package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout */
/* loaded from: classes4.dex */
public class C17806x48d2cd43 extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f245196d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0 f245197e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 f245198f;

    public C17806x48d2cd43(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245198f = null;
    }

    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0 f0Var = this.f245197e;
        if (f0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 g0Var = f0Var.f245247h;
        boolean z17 = g0Var == null || g0Var.mo69674x7444f759() <= 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        return z17;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0 f0Var = this.f245197e;
        if (f0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 g0Var = f0Var.f245247h;
                if (g0Var != null && g0Var.mo69674x7444f759() > 0 && f0Var.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideController", "notifyCurrentDataChange, mCurrentVisibleView pre text is " + ((java.lang.Object) f0Var.f245243d.getText()) + ", mToVisibleView pre text is " + ((java.lang.Object) f0Var.f245244e.getText()));
                    java.lang.String b17 = f0Var.f245247h.b(f0Var.f245248i);
                    f0Var.f245243d.setText(b17);
                    java.lang.String b18 = f0Var.f245247h.b((f0Var.f245248i + 1) % f0Var.f245247h.mo69674x7444f759());
                    f0Var.f245244e.setText(b18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideController", "notifyCurrentDataChange, mCurrentVisibleView: " + b17 + ", mToVisibleView: " + b18);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideController", th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopSlide", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0 f0Var = this.f245197e;
        if (f0Var != null) {
            f0Var.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopSlide", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.LivingDescBarLayout", "onAttachedToWindow is called!!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0 f0Var = this.f245197e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 g0Var = this.f245198f;
        if (f0Var != null && g0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingDescBarLayout", "the LivingDescBarLayout attached to window, and record adapter is not null, set adapter");
            f0Var.c(g0Var);
        }
        this.f245198f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0 f0Var = this.f245197e;
        if (f0Var != null) {
            f0Var.c(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onFinishInflate();
        try {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564185ka);
            this.f245196d = imageView;
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78372xa799cd96);
            this.f245197e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564183k8), (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564184k9));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    /* renamed from: setIconImage */
    public void m69671x7a79220(android.graphics.drawable.Drawable drawable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        android.widget.ImageView imageView = this.f245196d;
        if (imageView != null && drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    /* renamed from: setSlideAdapter */
    public void m69672x13daf1e0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 g0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSlideAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f0 f0Var = this.f245197e;
        if (f0Var != null) {
            if (isAttachedToWindow()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingDescBarLayout", "the LivingDescBarLayout has attach to window, set adapter");
                f0Var.c(g0Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.LivingDescBarLayout", "the LivingDescBarLayout has not attach to window, record adapter");
                this.f245198f = g0Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSlideAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public C17806x48d2cd43(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f245198f = null;
    }
}
