package xb4;

/* loaded from: classes4.dex */
public class i1 extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 f534479b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f534480c;

    public i1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        try {
            this.f534479b = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0) baseViewHolder;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xb4.e1(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.f1(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new xb4.g1(this));
            ofFloat2.setDuration(100L);
            ofFloat2.setStartDelay(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f534480c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new xb4.h1(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereCardAdBackAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 b(xb4.i1 i1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var = i1Var.f534479b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        return p0Var;
    }

    @Override // xb4.w
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f534480c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
    }
}
