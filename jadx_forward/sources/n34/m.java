package n34;

/* loaded from: classes.dex */
public final class m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.p f416208d;

    public m(n34.p pVar) {
        this.f416208d = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doScaleGoneAni$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getStarIcon", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        android.view.View d17 = this.f416208d.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getStarIcon", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/sns/CommentDetailStarHelper$doScaleGoneAni$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/sns/CommentDetailStarHelper$doScaleGoneAni$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doScaleGoneAni$1$1");
    }
}
