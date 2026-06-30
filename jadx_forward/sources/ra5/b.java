package ra5;

/* loaded from: classes3.dex */
public final class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f475088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ra5.c f475089e;

    public b(android.graphics.drawable.Drawable drawable, ra5.c cVar) {
        this.f475088d = drawable;
        this.f475089e = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        onAnimationEnd(animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f475088d.setAlpha(255);
        this.f475089e.f475090d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
