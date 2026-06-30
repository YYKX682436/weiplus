package s74;

/* loaded from: classes3.dex */
public final class k4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f485930d;

    public k4(android.animation.AnimatorSet animatorSet) {
        this.f485930d = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f485930d.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$2$1");
    }
}
