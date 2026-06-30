package z54;

/* loaded from: classes4.dex */
public final class i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.j f551815d;

    public i(z54.j jVar) {
        this.f551815d = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        z54.j jVar = this.f551815d;
        if (z54.j.e(jVar) != null) {
            z54.j.e(jVar).mo69472xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        z54.j jVar = this.f551815d;
        if (z54.j.e(jVar) != null) {
            z54.j.e(jVar).mo69473xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation$2");
    }
}
