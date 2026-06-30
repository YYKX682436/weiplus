package xb4;

/* loaded from: classes4.dex */
public class d1 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final q74.d f534460c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.AnimatorSet f534461d;

    public d1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        try {
            this.f534533a = abstractActivityC21394xb3d2c0cf;
            this.f534460c = (q74.d) baseViewHolder;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new xb4.a1(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.b1(this));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f534461d = animatorSet;
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(new xb4.c1(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SlideFullCardItemAdClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ q74.d b(xb4.d1 d1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        q74.d dVar = d1Var.f534460c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        return dVar;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f534461d;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
    }
}
