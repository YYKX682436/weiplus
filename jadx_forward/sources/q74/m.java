package q74;

/* loaded from: classes4.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.t f442009d;

    public m(q74.t tVar) {
        this.f442009d = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, doOneStatusEnterOrExitAnimFirst onAnimationCancel, mIndex is ");
        q74.t tVar = this.f442009d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdSlideProductItemViewLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.Long c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, mOneStatusEnterOrExitAnimSetFirst onAnimationEnd, mIndex is ");
        q74.t tVar = this.f442009d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        if (q74.t.e(tVar) > q74.t.f(tVar)) {
            android.widget.ImageView h17 = q74.t.h(tVar);
            if (h17 != null) {
                h17.setTranslationX(q74.t.a(tVar));
            }
            android.widget.ImageView h18 = q74.t.h(tVar);
            if (h18 != null) {
                h18.setAlpha(0.0f);
            }
            android.widget.ImageView g17 = q74.t.g(tVar);
            if (g17 != null) {
                g17.setTranslationX(0.0f);
            }
            android.widget.ImageView g18 = q74.t.g(tVar);
            if (g18 != null) {
                g18.setAlpha(1.0f);
            }
        } else {
            android.widget.ImageView g19 = q74.t.g(tVar);
            if (g19 != null) {
                g19.setTranslationX(0.0f);
            }
            android.widget.ImageView g27 = q74.t.g(tVar);
            if (g27 != null) {
                g27.setAlpha(1.0f);
            }
            android.widget.ImageView h19 = q74.t.h(tVar);
            if (h19 != null) {
                h19.setTranslationX(q74.t.a(tVar));
            }
            android.widget.ImageView h27 = q74.t.h(tVar);
            if (h27 != null) {
                h27.setAlpha(0.0f);
            }
        }
        a84.y0.i(q74.t.h(tVar));
        android.widget.ImageView g28 = q74.t.g(tVar);
        android.widget.ImageView h28 = q74.t.h(tVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.f442061j = h28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.f442060i = g28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMProductIconContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMProductIconContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        a84.y0.b(tVar.f442059h, q74.t.g(tVar), -1);
        q74.t.c(tVar).mo50302x6b17ad39(null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 c18 = q74.t.c(tVar);
        q74.l lVar = new q74.l(tVar);
        s34.o1 i17 = q74.t.i(tVar);
        c18.mo50297x7c4d7ca2(lVar, (i17 == null || (c17 = i17.c()) == null) ? 1500L : c17.longValue());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, mOneStatusEnterOrExitAnimSetFirst onAnimationStart, mIndex is ");
        q74.t tVar = this.f442009d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        if (q74.t.e(tVar) > q74.t.f(tVar)) {
            android.widget.ImageView h17 = q74.t.h(tVar);
            if (h17 != null) {
                h17.setTranslationX(0.0f);
            }
            android.widget.ImageView h18 = q74.t.h(tVar);
            if (h18 != null) {
                h18.setAlpha(1.0f);
            }
            android.widget.ImageView g17 = q74.t.g(tVar);
            if (g17 != null) {
                g17.setTranslationX(-q74.t.a(tVar));
            }
            android.widget.ImageView g18 = q74.t.g(tVar);
            if (g18 != null) {
                g18.setAlpha(0.0f);
            }
        } else {
            android.widget.ImageView g19 = q74.t.g(tVar);
            if (g19 != null) {
                g19.setTranslationX(q74.t.a(tVar));
            }
            android.widget.ImageView g27 = q74.t.g(tVar);
            if (g27 != null) {
                g27.setAlpha(0.0f);
            }
            android.widget.ImageView h19 = q74.t.h(tVar);
            if (h19 != null) {
                h19.setTranslationX(0.0f);
            }
            android.widget.ImageView h27 = q74.t.h(tVar);
            if (h27 != null) {
                h27.setAlpha(1.0f);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$3");
    }
}
