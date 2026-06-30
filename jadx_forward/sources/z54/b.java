package z54;

/* loaded from: classes4.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.d f551810d;

    public b(z54.d dVar) {
        this.f551810d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        z54.d dVar = this.f551810d;
        if (z54.d.e(dVar) != null) {
            z54.d.e(dVar).mo69472xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        z54.d dVar = this.f551810d;
        if (z54.d.e(dVar) != null) {
            z54.d.e(dVar).mo69473xd7e2f2fd();
        }
        android.view.ViewGroup.LayoutParams layoutParams = z54.d.f(dVar).getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
            return;
        }
        android.view.ViewParent parent = z54.d.f(dVar).getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetWidth$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i17 = dVar.f516337k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetWidth$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getWidthDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i18 = dVar.f516335i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getWidthDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i19 = i17 - i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTargetHeight$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i27 = dVar.f516336j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTargetHeight$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getHeightDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i28 = dVar.f516334h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getHeightDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i29 = i27 - i28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumb_left$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i37 = dVar.f516330d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumb_left$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        layoutParams2.leftMargin = i37;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumb_top$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i38 = dVar.f516331e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumb_top$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        layoutParams2.topMargin = i38;
        layoutParams2.rightMargin = (viewGroup.getWidth() - i19) - layoutParams2.leftMargin;
        layoutParams2.bottomMargin = (viewGroup.getHeight() - i29) - layoutParams2.topMargin;
        layoutParams2.width = i19;
        layoutParams2.height = i29;
        z54.d.f(dVar).setLayoutParams(layoutParams2);
        android.view.View f17 = z54.d.f(dVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenExpandAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenExpandAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
    }
}
