package xb4;

/* loaded from: classes4.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.l f534472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.x f534473e;

    public h(xb4.l lVar, w64.x xVar) {
        this.f534472d = lVar;
        this.f534473e = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        xb4.l lVar = this.f534472d;
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        boolean z17 = lVar.f534492d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
            return;
        }
        w64.x xVar = this.f534473e;
        if (!vb4.a.a(xVar.b())) {
            vb4.a.b(xVar.b(), true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdCommonClickAnimation", "holder is busy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        android.animation.AnimatorSet animatorSet = lVar.f534491c;
        if (animatorSet != null) {
            animatorSet.end();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
    }
}
