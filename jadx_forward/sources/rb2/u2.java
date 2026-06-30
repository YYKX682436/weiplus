package rb2;

/* loaded from: classes.dex */
public final class u2 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f475326d;

    public u2(android.view.ViewGroup viewGroup) {
        this.f475326d = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f475326d;
        viewGroup.setAlpha(1.0f);
        viewGroup.setTranslationY(0.0f);
    }
}
