package s74;

/* loaded from: classes4.dex */
public final class j4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.a1 f485904d;

    public j4(s74.a1 a1Var) {
        this.f485904d = a1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        s74.a1 a1Var = this.f485904d;
        if (a1Var.c().getAlpha() == 1.0f) {
            a1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicViewContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicViewContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
            int optInt = a1Var.d().optInt("click-index");
            s74.f3 f3Var = a1Var.f485733d;
            f3Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f3Var.W = optInt;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$1$1");
    }
}
