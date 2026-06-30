package df2;

/* loaded from: classes2.dex */
public final class ct implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f311442d;

    public ct(android.view.ViewGroup viewGroup) {
        this.f311442d = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.ViewGroup viewGroup = this.f311442d;
        if (viewGroup != null) {
            viewGroup.setScaleX(floatValue);
        }
        if (viewGroup == null) {
            return;
        }
        viewGroup.setScaleY(floatValue);
    }
}
