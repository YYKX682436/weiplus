package xb4;

/* loaded from: classes4.dex */
public class i0 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.k f534477c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.AnimatorSet f534478d;

    public i0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        this.f534533a = abstractActivityC21394xb3d2c0cf;
        this.f534477c = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.k) baseViewHolder;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new xb4.e0(this));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.f0(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new xb4.g0(this));
        ofFloat2.setDuration(100L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f534478d = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.h0(this));
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.k b(xb4.i0 i0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.k kVar = i0Var.f534477c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        return kVar;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f534478d;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
    }
}
