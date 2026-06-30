package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public class f0 implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener, android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f245243d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f245244e;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f245246g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 f245247h;

    /* renamed from: i, reason: collision with root package name */
    public int f245248i = 0;

    /* renamed from: m, reason: collision with root package name */
    public float f245249m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public int f245250n = 1;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f245245f = new android.os.Handler(android.os.Looper.getMainLooper(), this);

    public f0(android.widget.TextView textView, android.widget.TextView textView2) {
        this.f245243d = textView;
        this.f245244e = textView2;
    }

    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkTextViewValid", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        boolean z17 = (this.f245244e == null || this.f245243d == null) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTextViewValid", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        return z17;
    }

    public void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setTranslationY(0.0f);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 g0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            e();
            if (g0Var != null && g0Var.mo69674x7444f759() > 0 && a()) {
                this.f245248i = 0;
                java.lang.String b17 = g0Var.b(0);
                this.f245243d.setVisibility(0);
                this.f245243d.setText(b17);
                if (g0Var.mo69674x7444f759() > 1) {
                    this.f245245f.sendEmptyMessageDelayed(1, 2000L);
                }
            }
            this.f245247h = g0Var;
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureAnimator", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            if (this.f245246g == null) {
                android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
                this.f245246g = duration;
                duration.addUpdateListener(this);
                this.f245246g.addListener(this);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureAnimator", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            if (a()) {
                this.f245249m = this.f245243d.getHeight();
                this.f245246g.start();
                this.f245250n = 0;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            this.f245250n = 1;
            this.f245245f.removeMessages(1);
            android.animation.ValueAnimator valueAnimator = this.f245246g;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f245246g.cancel();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            if (message.what == 1) {
                d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        return false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            b(this.f245244e);
            b(this.f245243d);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 g0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            g0Var = this.f245247h;
        } catch (java.lang.Throwable unused) {
        }
        if (g0Var != null && g0Var.mo69674x7444f759() > 0 && a()) {
            android.widget.TextView textView = this.f245244e;
            android.widget.TextView textView2 = this.f245243d;
            this.f245244e = textView2;
            this.f245243d = textView;
            b(textView2);
            this.f245248i = (this.f245248i + 1) % g0Var.mo69674x7444f759();
            this.f245249m = 0.0f;
            if (this.f245250n == 0) {
                this.f245245f.sendEmptyMessageDelayed(1, 2000L);
            }
            this.f245246g = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 g0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            g0Var = this.f245247h;
        } catch (java.lang.Throwable unused) {
        }
        if (g0Var != null && g0Var.mo69674x7444f759() > 0 && a()) {
            this.f245244e.setTranslationY(this.f245249m);
            this.f245244e.setAlpha(0.0f);
            this.f245244e.setVisibility(0);
            this.f245244e.setText(g0Var.b((this.f245248i + 1) % g0Var.mo69674x7444f759()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof java.lang.Float) {
                float floatValue = ((java.lang.Float) animatedValue).floatValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onValueUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                if (a()) {
                    float f17 = this.f245249m;
                    float f18 = f17 * floatValue;
                    this.f245244e.setTranslationY(f17 - f18);
                    this.f245244e.setAlpha(floatValue);
                    this.f245243d.setTranslationY(-f18);
                    this.f245243d.setAlpha(1.0f - floatValue);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onValueUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }
}
