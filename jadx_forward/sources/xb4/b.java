package xb4;

/* loaded from: classes4.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.f f534447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.x f534448e;

    public b(xb4.f fVar, w64.x xVar) {
        this.f534447d = fVar;
        this.f534448e = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        xb4.f fVar = this.f534447d;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        boolean z17 = fVar.f534466c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
            return;
        }
        w64.x xVar = this.f534448e;
        if (!vb4.a.a(xVar.b())) {
            vb4.a.b(xVar.b(), true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdCommonBackAnimation", "holder is busy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAnimatorSet$p", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAnimatorSet$p", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        android.animation.AnimatorSet animatorSet = fVar.f534465b;
        java.util.ArrayList<android.animation.Animator> childAnimations = animatorSet != null ? animatorSet.getChildAnimations() : null;
        if (childAnimations == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
            return;
        }
        java.util.Iterator<android.animation.Animator> it = childAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
    }
}
