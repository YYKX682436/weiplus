package wb4;

/* loaded from: classes4.dex */
public class x extends wb4.j {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.o0 f525963b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f525964c;

    public x(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, dc4.v vVar) {
        try {
            this.f525963b = (dc4.o0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new wb4.v(this));
            ofFloat.setDuration(400L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f525964c = animatorSet;
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(new wb4.w(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SlideFullCardItemAdClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.o0 b(wb4.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        dc4.o0 o0Var = xVar.f525963b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        return o0Var;
    }

    @Override // wb4.j
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f525964c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
    }
}
