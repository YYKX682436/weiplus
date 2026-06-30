package uw2;

/* loaded from: classes.dex */
public final class g extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513199d;

    public g(android.view.View view) {
        this.f513199d = view;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f513199d;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f513199d;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
