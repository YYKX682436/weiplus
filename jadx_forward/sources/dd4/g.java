package dd4;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f310534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 f310535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f310536f;

    public g(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40, android.animation.AnimatorSet animatorSet) {
        this.f310534d = view;
        this.f310535e = c18280x2556ea40;
        this.f310536f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToPlayView$1");
        android.view.View view = this.f310534d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.05f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.05f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("aniToPlayView >> centerWidth: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = this.f310535e;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.g(c18280x2556ea40).getWidth() / 2.0f);
        sb6.append(" centerHeight: ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.g(c18280x2556ea40).getHeight() / 2.0f);
        c18280x2556ea40.m(sb6.toString());
        view.setPivotX(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.g(c18280x2556ea40).getWidth() / 2.0f);
        view.setPivotY(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.g(c18280x2556ea40).getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = this.f310536f;
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToPlayView$1");
    }
}
