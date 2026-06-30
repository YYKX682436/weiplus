package wb4;

/* loaded from: classes4.dex */
public class h0 extends wb4.j {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.v0 f525943b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f525944c;

    public h0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, dc4.v vVar) {
        try {
            this.f525943b = (dc4.v0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new wb4.d0(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new wb4.e0(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new wb4.f0(this));
            ofFloat2.setDuration(100L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f525944c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new wb4.g0(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereCardAdDetailClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.v0 b(wb4.h0 h0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        dc4.v0 v0Var = h0Var.f525943b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        return v0Var;
    }

    @Override // wb4.j
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f525944c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
    }
}
