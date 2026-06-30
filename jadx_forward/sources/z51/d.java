package z51;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.g f551711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 f551712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f551713f;

    public d(z51.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465, android.widget.FrameLayout frameLayout) {
        this.f551711d = gVar;
        this.f551712e = c18697xb57c3465;
        this.f551713f = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.AnimatorSet.Builder play;
        android.animation.AnimatorSet.Builder with;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        z51.g gVar = this.f551711d;
        gVar.f551718f = animatorSet;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f551712e;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c18697xb57c3465, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c18697xb57c3465, "scaleX", 1.0f, 1.05f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c18697xb57c3465, "scaleY", 1.0f, 1.05f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("aniToPlayView >> centerWidth: ");
        android.widget.FrameLayout frameLayout = this.f551713f;
        sb6.append(frameLayout.getWidth() / 2.0f);
        sb6.append(" centerHeight: ");
        sb6.append(frameLayout.getHeight() / 2.0f);
        gVar.f(sb6.toString());
        c18697xb57c3465.setPivotX(frameLayout.getWidth() / 2.0f);
        c18697xb57c3465.setPivotY(frameLayout.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet2 = gVar.f551718f;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(300L);
        }
        android.animation.AnimatorSet animatorSet3 = gVar.f551718f;
        if (animatorSet3 != null) {
            animatorSet3.setInterpolator(new android.view.animation.DecelerateInterpolator());
        }
        android.animation.AnimatorSet animatorSet4 = gVar.f551718f;
        if (animatorSet4 != null && (play = animatorSet4.play(ofFloat2)) != null && (with = play.with(ofFloat3)) != null) {
            with.with(ofFloat);
        }
        android.animation.AnimatorSet animatorSet5 = gVar.f551718f;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }
}
