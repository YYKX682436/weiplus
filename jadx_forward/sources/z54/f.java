package z54;

/* loaded from: classes4.dex */
public final class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.g f551813d;

    public f(z54.g gVar) {
        this.f551813d = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        z54.g gVar = this.f551813d;
        if (z54.g.e(gVar) != null) {
            z54.g.e(gVar).mo69472xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        z54.g gVar = this.f551813d;
        if (z54.g.e(gVar) != null) {
            z54.g.e(gVar).mo69473xd7e2f2fd();
        }
        android.view.View f17 = z54.g.f(gVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenShrinkAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenShrinkAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
    }
}
