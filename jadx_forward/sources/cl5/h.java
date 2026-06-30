package cl5;

/* loaded from: classes2.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f124518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124519e;

    public h(int i17, android.view.View view) {
        this.f124518d = i17;
        this.f124519e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = this.f124518d;
        if (i17 < 0) {
            java.lang.Math.abs(i17);
            android.view.ViewConfiguration.get(this.f124519e.getContext()).getScaledTouchSlop();
        }
    }
}
