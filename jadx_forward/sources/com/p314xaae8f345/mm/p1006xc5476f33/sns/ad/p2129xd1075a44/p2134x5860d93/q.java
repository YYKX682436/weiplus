package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* loaded from: classes4.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y f244889d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar) {
        this.f244889d = yVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar = this.f244889d;
        android.widget.FrameLayout B = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y.B(yVar);
        if (B != null) {
            B.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.j(), "hideAlphaAnim onAnimationEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f244889d.j(), "hideAlphaAnim onAnimationStart");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }
}
