package s74;

/* loaded from: classes4.dex */
public final class l4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f485944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.a1 f485945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f485946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f485947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f485948h;

    public l4(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, s74.a1 a1Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.animation.AnimatorSet animatorSet, android.animation.Animator animator) {
        this.f485944d = f0Var;
        this.f485945e = a1Var;
        this.f485946f = c0Var;
        this.f485947g = animatorSet;
        this.f485948h = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f485946f.f391645d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Utils", "onAnimationCancel, anim: " + this.f485948h + ", animId:" + this.f485945e.a().optString("animationId"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f485944d;
        f0Var.f391649d++;
        int optInt = this.f485945e.a().optInt("repeat-count");
        if (optInt == 0) {
            optInt = Integer.MAX_VALUE;
        }
        if (f0Var.f391649d < optInt && !this.f485946f.f391645d) {
            this.f485947g.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Utils", "onAnimationStart, anim: " + this.f485948h + ", animId:" + this.f485945e.a().optString("animationId"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
    }
}
