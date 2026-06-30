package wb4;

/* loaded from: classes4.dex */
public class n extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.d0 f525950b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f525951c;

    public n(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, dc4.v vVar) {
        this.f525950b = (dc4.d0) vVar;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new wb4.k(this));
        ofFloat.setDuration(400L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new wb4.l(this));
        ofFloat2.setDuration(100L);
        ofFloat2.setStartDelay(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f525951c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new wb4.m(this));
    }

    public static /* synthetic */ dc4.d0 b(wb4.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        dc4.d0 d0Var = nVar.f525950b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        return d0Var;
    }

    @Override // wb4.i
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f525951c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
    }
}
