package xb4;

/* loaded from: classes4.dex */
public class x0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.z0 f534532d;

    public x0(xb4.z0 z0Var) {
        this.f534532d = z0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
        if (!xb4.z0.b(this.f534532d).f250836w0) {
            xb4.z0.b(this.f534532d).f250836w0 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "holder is busy");
        xb4.z0 z0Var = this.f534532d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        android.animation.AnimatorSet animatorSet = z0Var.f534538c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        java.util.Iterator<android.animation.Animator> it = animatorSet.getChildAnimations().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
    }
}
