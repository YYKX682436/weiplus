package z51;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 f551715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.g f551716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f551717f;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465, z51.g gVar, android.widget.FrameLayout frameLayout) {
        this.f551715d = c18697xb57c3465;
        this.f551716e = gVar;
        this.f551717f = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.AnimatorSet.Builder play;
        android.animation.AnimatorSet.Builder with;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f551715d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c18697xb57c3465, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c18697xb57c3465, "scaleX", 1.05f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c18697xb57c3465, "scaleY", 1.05f, 1.0f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("aniToThumbView >> centerWidth: ");
        android.widget.FrameLayout frameLayout = this.f551717f;
        sb6.append(frameLayout.getWidth() / 2.0f);
        sb6.append(" centerHeight: ");
        sb6.append(frameLayout.getHeight() / 2.0f);
        java.lang.String sb7 = sb6.toString();
        z51.g gVar = this.f551716e;
        gVar.f(sb7);
        c18697xb57c3465.setPivotX(frameLayout.getWidth() / 2.0f);
        c18697xb57c3465.setPivotY(frameLayout.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = gVar.f551719g;
        if (animatorSet != null) {
            animatorSet.setDuration(300L);
        }
        android.animation.AnimatorSet animatorSet2 = gVar.f551719g;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        }
        android.animation.AnimatorSet animatorSet3 = gVar.f551719g;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new z51.e(c18697xb57c3465));
        }
        android.animation.AnimatorSet animatorSet4 = gVar.f551719g;
        if (animatorSet4 != null && (play = animatorSet4.play(ofFloat2)) != null && (with = play.with(ofFloat3)) != null) {
            with.with(ofFloat);
        }
        android.animation.AnimatorSet animatorSet5 = gVar.f551719g;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }
}
