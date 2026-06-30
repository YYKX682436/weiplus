package q74;

/* loaded from: classes4.dex */
public final class o implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.t f442014d;

    public o(q74.t tVar) {
        this.f442014d = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doTwoStatusAnim onAnimationCancel, mIndex is ");
        q74.t tVar = this.f442014d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdSlideProductItemViewLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doTwoStatusAnim onAnimationEnd, mIndex is ");
        q74.t tVar = this.f442014d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        android.widget.ImageView h17 = q74.t.h(tVar);
        if (h17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStatusTwoTranslationX$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            float f17 = tVar.f442077z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStatusTwoTranslationX$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            h17.setTranslationX(-f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k17 = q74.t.k(tVar);
        if (k17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStatusTwoTranslationX$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            float f18 = tVar.f442077z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStatusTwoTranslationX$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            k17.setTranslationX(-f18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k18 = q74.t.k(tVar);
        if (k18 != null) {
            k18.setAlpha(0.0f);
        }
        android.view.View d17 = q74.t.d(tVar);
        if (d17 != null) {
            d17.setTranslationX(0.0f);
        }
        android.view.View d18 = q74.t.d(tVar);
        if (d18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d18, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusAnim$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            d18.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(d18, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusAnim$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewGroup b17 = q74.t.b(tVar);
        if (b17 != null) {
            b17.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMIsStatusTwoFinish$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.B = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMIsStatusTwoFinish$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doTwoStatusAnim onAnimationStart, mIndex is ");
        q74.t tVar = this.f442014d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        android.widget.ImageView h17 = q74.t.h(tVar);
        if (h17 != null) {
            h17.setTranslationX(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k17 = q74.t.k(tVar);
        if (k17 != null) {
            k17.setTranslationX(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k18 = q74.t.k(tVar);
        if (k18 != null) {
            k18.setAlpha(1.0f);
        }
        android.view.View d17 = q74.t.d(tVar);
        if (d17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHighlightBackgroundTranslationX$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            float f17 = tVar.A;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHighlightBackgroundTranslationX$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            d17.setTranslationX(f17);
        }
        android.view.View d18 = q74.t.d(tVar);
        if (d18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d18, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusAnim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            d18.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(d18, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusAnim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewGroup b17 = q74.t.b(tVar);
        if (b17 != null) {
            b17.setAlpha(0.0f);
        }
        android.view.View d19 = q74.t.d(tVar);
        if (d19 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(d19, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusAnim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(d19, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$doTwoStatusAnim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doTwoStatusAnim$1");
    }
}
