package xb4;

/* loaded from: classes4.dex */
public class v extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final s74.p0 f534525c;

    /* renamed from: d, reason: collision with root package name */
    public final s74.o2 f534526d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.AnimatorSet f534527e;

    public v(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        this.f534533a = abstractActivityC21394xb3d2c0cf;
        s74.p0 p0Var = (s74.p0) baseViewHolder;
        this.f534525c = p0Var;
        s74.o2 H = ((s74.z0) p0Var.f250816m0).H();
        this.f534526d = H;
        if (H == null) {
            return;
        }
        android.view.View I = H.I();
        java.util.List J2 = H.J();
        if (I == null || J2 == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new xb4.r(this, I));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.s(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new xb4.t(this, J2));
        ofFloat2.setDuration(100L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f534527e = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.u(this, I, J2));
    }

    public static /* synthetic */ s74.o2 b(xb4.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        s74.o2 o2Var = vVar.f534526d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        return o2Var;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDynamicCardClickAnimation", "error ! do not use this class!");
        ca4.q.a("MicroMsg.AdDynamicCardClickAnimation", "useOldAnimation", 8);
        android.animation.AnimatorSet animatorSet = this.f534527e;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
    }
}
