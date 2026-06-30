package q74;

/* loaded from: classes4.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.t f442020d;

    public q(q74.t tVar) {
        this.f442020d = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doTwoStatusEnterOrExitAnim onAnimationCancel, mIndex is ");
        q74.t tVar = this.f442020d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdSlideProductItemViewLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.Long c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doTwoStatusEnterOrExitAnim onAnimationEnd, mIndex is ");
        q74.t tVar = this.f442020d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        android.widget.ImageView h17 = q74.t.h(tVar);
        if (h17 != null) {
            h17.setAlpha(0.0f);
        }
        android.view.View d17 = q74.t.d(tVar);
        if (d17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            d17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewGroup b17 = q74.t.b(tVar);
        if (b17 != null) {
            b17.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k17 = q74.t.k(tVar);
        if (k17 != null) {
            k17.setAlpha(1.0f);
        }
        android.widget.ImageView g17 = q74.t.g(tVar);
        if (g17 != null) {
            g17.setAlpha(1.0f);
        }
        android.widget.ImageView g18 = q74.t.g(tVar);
        if (g18 != null) {
            g18.setTranslationX(0.0f);
        }
        s34.o1 i17 = q74.t.i(tVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.s(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        a84.y0.i(q74.t.g(tVar));
        android.widget.ImageView g19 = q74.t.g(tVar);
        android.widget.ImageView h18 = q74.t.h(tVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.f442061j = h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.f442060i = g19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMProductIconContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMProductIconContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        a84.y0.b(tVar.f442059h, q74.t.h(tVar), 0);
        q74.t.c(tVar).mo50302x6b17ad39(null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 c18 = q74.t.c(tVar);
        q74.p pVar = new q74.p(tVar);
        s34.o1 i18 = q74.t.i(tVar);
        c18.mo50297x7c4d7ca2(pVar, (i18 == null || (c17 = i18.c()) == null) ? 1500L : c17.longValue());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doTwoStatusEnterOrExitAnim onAnimationStart, mIndex is ");
        q74.t tVar = this.f442020d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        android.widget.ImageView h17 = q74.t.h(tVar);
        if (h17 != null) {
            h17.setAlpha(1.0f);
        }
        android.view.View d17 = q74.t.d(tVar);
        if (d17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            d17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewGroup b17 = q74.t.b(tVar);
        if (b17 != null) {
            b17.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k17 = q74.t.k(tVar);
        if (k17 != null) {
            k17.setTranslationX(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k18 = q74.t.k(tVar);
        if (k18 != null) {
            k18.setAlpha(0.0f);
        }
        android.widget.ImageView g17 = q74.t.g(tVar);
        if (g17 != null) {
            g17.setAlpha(0.0f);
        }
        if (q74.t.e(tVar) > q74.t.f(tVar)) {
            android.widget.ImageView g18 = q74.t.g(tVar);
            if (g18 != null) {
                g18.setTranslationX(-q74.t.a(tVar));
            }
        } else {
            android.widget.ImageView g19 = q74.t.g(tVar);
            if (g19 != null) {
                g19.setTranslationX(q74.t.a(tVar));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusEnterOrExitAnim$1");
    }
}
