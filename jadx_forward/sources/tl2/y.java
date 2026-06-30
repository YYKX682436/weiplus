package tl2;

/* loaded from: classes3.dex */
public final class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f501822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f501823e;

    public y(u4.m1 m1Var, u4.m1 m1Var2) {
        this.f501822d = m1Var;
        this.f501823e = m1Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        android.view.View view;
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        u4.m1 m1Var = this.f501822d;
        android.view.View view3 = m1Var != null ? m1Var.f506048b : null;
        float f17 = 0.0f;
        u4.m1 m1Var2 = this.f501823e;
        if (view3 != null) {
            view3.setTranslationX((m1Var2 == null || (view2 = m1Var2.f506048b) == null) ? 0.0f : view2.getTranslationX());
        }
        android.view.View view4 = m1Var != null ? m1Var.f506048b : null;
        if (view4 == null) {
            return;
        }
        if (m1Var2 != null && (view = m1Var2.f506048b) != null) {
            f17 = view.getTranslationY();
        }
        view4.setTranslationY(f17);
    }
}
