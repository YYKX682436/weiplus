package z54;

/* loaded from: classes4.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.g f551812d;

    public e(z54.g gVar) {
        this.f551812d = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
            return;
        }
        float floatValue = f17.floatValue();
        boolean z17 = floatValue == 0.0f;
        z54.g gVar = this.f551812d;
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = z54.g.f(gVar).getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
                return;
            }
            android.view.ViewParent parent = z54.g.f(gVar).getParent();
            if ((parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetWidth$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i17 = gVar.f516337k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetWidth$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getWidthDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i18 = gVar.f516335i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getWidthDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            float f18 = i17 - (i18 * floatValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetHeight$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i19 = gVar.f516336j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetHeight$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getHeightDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i27 = gVar.f516334h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getHeightDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            float f19 = i19 - (i27 * floatValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i28 = gVar.f516338l;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumb_left$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i29 = gVar.f516330d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumb_left$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i37 = gVar.f516338l;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            layoutParams2.leftMargin = (int) (i28 + ((i29 - i37) * floatValue));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i38 = gVar.f516339m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumb_top$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i39 = gVar.f516331e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumb_top$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i47 = gVar.f516339m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            layoutParams2.topMargin = (int) (i38 + ((i39 - i47) * floatValue));
            layoutParams2.rightMargin = (int) ((r3.getWidth() - f18) - layoutParams2.leftMargin);
            layoutParams2.bottomMargin = (int) ((r3.getHeight() - f19) - layoutParams2.topMargin);
            layoutParams2.width = (int) f18;
            layoutParams2.height = (int) f19;
            z54.g.f(gVar).setLayoutParams(layoutParams2);
        }
        if (z54.g.e(gVar) != null) {
            z54.g.e(gVar).b(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
    }
}
