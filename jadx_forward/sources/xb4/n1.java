package xb4;

/* loaded from: classes4.dex */
public class n1 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 f534501c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.AnimatorSet f534502d;

    public n1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        try {
            this.f534533a = abstractActivityC21394xb3d2c0cf;
            this.f534501c = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0) baseViewHolder;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new xb4.j1(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.k1(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new xb4.l1(this));
            ofFloat2.setDuration(100L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f534502d = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new xb4.m1(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereCardAdClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 b(xb4.n1 n1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var = n1Var.f534501c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        return p0Var;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f534502d;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
    }
}
