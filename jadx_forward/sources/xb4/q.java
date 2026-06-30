package xb4;

/* loaded from: classes4.dex */
public class q extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final s74.p0 f534510b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f534511c;

    public q(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        s74.p0 p0Var = (s74.p0) baseViewHolder;
        this.f534510b = p0Var;
        s74.o2 H = ((s74.z0) p0Var.f250816m0).H();
        if (H == null) {
            return;
        }
        android.view.View I = H.I();
        java.util.List J2 = H.J();
        if (I == null || J2 == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new xb4.m(this, I));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.n(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new xb4.o(this, J2));
        ofFloat2.setDuration(100L);
        ofFloat2.setStartDelay(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f534511c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.p(this, J2, I));
    }

    @Override // xb4.w
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDynamicCardBackAnimation", "error ! do not use this class!");
        ca4.q.a("MicroMsg.AdDynamicCardBackAnimation", "useOldAnimation", 8);
        android.animation.AnimatorSet animatorSet = this.f534511c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
    }
}
