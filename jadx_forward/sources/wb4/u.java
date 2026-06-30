package wb4;

/* loaded from: classes4.dex */
public class u extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.o0 f525959b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f525960c;

    public u(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, dc4.v vVar) {
        try {
            this.f525959b = (dc4.o0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new wb4.s(this));
            ofFloat.setDuration(400L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f525960c = animatorSet;
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(new wb4.t(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SlideFullCardItemAdBackAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.o0 b(wb4.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        dc4.o0 o0Var = uVar.f525959b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        return o0Var;
    }

    @Override // wb4.i
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f525960c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
    }
}
