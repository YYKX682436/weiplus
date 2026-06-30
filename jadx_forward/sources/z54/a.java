package z54;

/* loaded from: classes4.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.d f551809d;

    public a(z54.d dVar) {
        this.f551809d = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$1");
            return;
        }
        float floatValue = f17.floatValue();
        boolean z17 = floatValue == 1.0f;
        z54.d dVar = this.f551809d;
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = z54.d.f(dVar).getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$1");
                return;
            }
            android.view.ViewParent parent = z54.d.f(dVar).getParent();
            if ((parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$1");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetWidth$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i17 = dVar.f516337k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetWidth$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getWidthDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i18 = dVar.f516335i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getWidthDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            float f18 = i17 - (i18 * floatValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetHeight$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i19 = dVar.f516336j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetHeight$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getHeightDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i27 = dVar.f516334h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getHeightDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            float f19 = i19 - (i27 * floatValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumb_left$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i28 = dVar.f516330d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumb_left$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetLeft$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i29 = dVar.f516338l;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetLeft$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i37 = (int) ((i28 - i29) * floatValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetLeft$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i38 = dVar.f516338l;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetLeft$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            layoutParams2.leftMargin = i37 + i38;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumb_top$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i39 = dVar.f516331e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumb_top$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetTop$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i47 = dVar.f516339m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetTop$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i48 = (int) ((i39 - i47) * floatValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetTop$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            int i49 = dVar.f516339m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetTop$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
            layoutParams2.topMargin = i48 + i49;
            layoutParams2.rightMargin = (int) ((r3.getWidth() - f18) - layoutParams2.leftMargin);
            layoutParams2.bottomMargin = (int) ((r3.getHeight() - f19) - layoutParams2.topMargin);
            layoutParams2.width = (int) f18;
            layoutParams2.height = (int) f19;
            z54.d.f(dVar).setLayoutParams(layoutParams2);
        }
        if (z54.d.e(dVar) != null) {
            z54.d.e(dVar).b(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$1");
    }
}
