package wb4;

/* loaded from: classes4.dex */
public class d extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.p f525931b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f525932c;

    public d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, dc4.v vVar) {
        dc4.p pVar = (dc4.p) vVar;
        this.f525931b = pVar;
        if (pVar.l() == null) {
            return;
        }
        android.view.View I = pVar.l().I();
        java.util.List J2 = pVar.l().J();
        if (I == null || J2 == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new wb4.a(this, I));
        ofFloat.setDuration(400L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new wb4.b(this, J2));
        ofFloat2.setDuration(100L);
        ofFloat2.setStartDelay(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f525932c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new wb4.c(this, J2, I));
    }

    @Override // wb4.i
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardBackAnimation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailBackAnimation", "error ! do not use this class!");
        ca4.q.a("MicroMsg.CardAdDetailBackAnimation", "useOldAnimation", 8);
        android.animation.AnimatorSet animatorSet = this.f525932c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardBackAnimation");
    }
}
