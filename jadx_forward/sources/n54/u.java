package n54;

/* loaded from: classes14.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 f416687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f416688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n54.o f416689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f416690g;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0, yz5.q qVar, n54.o oVar, float f17) {
        this.f416687d = c17742x250976b0;
        this.f416688e = qVar;
        this.f416689f = oVar;
        this.f416690g = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0.f244596w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        this.f416687d.f244604q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd the translationY  ");
        float f17 = this.f416690g;
        sb6.append(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollableFrameLayout", sb6.toString());
        yz5.q qVar = this.f416688e;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f416689f, 1, java.lang.Float.valueOf(f17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0.f244596w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        this.f416687d.f244604q = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        yz5.q qVar = this.f416688e;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f416689f, 0, java.lang.Float.valueOf(0.0f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }
}
