package xb4;

/* loaded from: classes4.dex */
public class n0 extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.AnimatorSet f534500b;

    public n0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, u74.d dVar) {
        try {
            int i17 = dVar.T.f506664a;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xb4.j0(this, dVar));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.k0(this, dVar));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new xb4.l0(this, dVar));
            ofFloat2.setDuration(100L);
            ofFloat2.setStartDelay(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f534500b = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new xb4.m0(this, dVar));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAnim.back", "init exp=" + th6.toString());
        }
    }

    @Override // xb4.w
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
        android.animation.AnimatorSet animatorSet = this.f534500b;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
    }
}
