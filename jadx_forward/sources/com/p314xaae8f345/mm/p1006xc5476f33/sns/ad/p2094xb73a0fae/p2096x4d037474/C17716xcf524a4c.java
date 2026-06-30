package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/AdLandingPagePickCardTipView;", "Landroid/widget/FrameLayout;", "", "getCurrentUnPickedNum", "Lcom/tencent/mm/plugin/sns/ad/landingpage/helper/anim/i0;", "helper", "Ljz5/f0;", "setAdLandingPageEggCardHelper", "Landroid/view/View$OnClickListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnBtnClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView */
/* loaded from: classes4.dex */
public final class C17716xcf524a4c extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f244229n = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f244230d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f244231e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f244232f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f244233g;

    /* renamed from: h, reason: collision with root package name */
    public final p44.b f244234h;

    /* renamed from: i, reason: collision with root package name */
    public int f244235i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 f244236m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17716xcf524a4c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reStartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        c();
        setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePickCardTipView", "reStartAnim");
        this.f244234h.sendEmptyMessage(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reStartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    public final int b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        if (this.f244235i == 0) {
            int a17 = c44.b.a(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            return a17;
        }
        int i18 = (int) ((r2 * i17) / 375.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        return i18;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePickCardTipView", "resetAnim");
        android.widget.LinearLayout linearLayout = this.f244231e;
        if (linearLayout != null) {
            p44.q.f433365a.b(linearLayout);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f244232f;
        if (c22646x1e9ca55 != null) {
            p44.q.f433365a.b(c22646x1e9ca55);
        }
        android.widget.LinearLayout linearLayout2 = this.f244231e;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = this.f244232f;
        if (c22646x1e9ca552 != null) {
            c22646x1e9ca552.setAlpha(0.0f);
        }
        this.f244234h.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    /* renamed from: getCurrentUnPickedNum */
    public final int m69350xaf91f0a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentUnPickedNum", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        int i17 = this.f244230d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentUnPickedNum", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        return i17;
    }

    /* renamed from: setAdLandingPageEggCardHelper */
    public final void m69351x87cf8a62(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdLandingPageEggCardHelper", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        this.f244236m = i0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdLandingPageEggCardHelper", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    /* renamed from: setOnBtnClickListener */
    public final void m69352xfd3c6561(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnBtnClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        setOnClickListener(onClickListener);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnBtnClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17716xcf524a4c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f244234h = new p44.b(this, android.os.Looper.getMainLooper());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePickCardTipView", "initLifeCycleListener");
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = yVar.mo273xed6858b4();
            if (mo273xed6858b4 != null) {
                mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1
                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onPause */
                    public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePickCardTipView", "onPause");
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c.f244229n;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c.this.f244233g = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                    }

                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onResume */
                    public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume, pauseFlag=");
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c.f244229n;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c c17716xcf524a4c = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c.this;
                        boolean z17 = c17716xcf524a4c.f244233g;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        sb6.append(z17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePickCardTipView", sb6.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        boolean z18 = c17716xcf524a4c.f244233g;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        if (z18) {
                            c17716xcf524a4c.a();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                            c17716xcf524a4c.f244233g = false;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                    }
                });
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }
}
