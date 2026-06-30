package wb4;

/* loaded from: classes4.dex */
public class c0 extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.v0 f525929b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f525930c;

    public c0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, dc4.v vVar) {
        try {
            this.f525929b = (dc4.v0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new wb4.y(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new wb4.z(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new wb4.a0(this));
            ofFloat2.setDuration(100L);
            ofFloat2.setStartDelay(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f525930c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new wb4.b0(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereCardAdDetailBackAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.v0 b(wb4.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        dc4.v0 v0Var = c0Var.f525929b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        return v0Var;
    }

    @Override // wb4.i
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f525930c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
    }
}
