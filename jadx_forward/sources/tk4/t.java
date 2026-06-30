package tk4;

/* loaded from: classes2.dex */
public final class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f501543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f501544e;

    public t(int i17, android.view.View view) {
        this.f501543d = i17;
        this.f501544e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = this.f501543d;
        if (i17 < 0) {
            java.lang.Math.abs(i17);
            android.view.ViewConfiguration.get(this.f501544e.getContext()).getScaledTouchSlop();
        }
    }
}
