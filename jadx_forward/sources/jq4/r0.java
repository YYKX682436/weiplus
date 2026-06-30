package jq4;

/* loaded from: classes3.dex */
public final class r0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f382723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382725f;

    public r0(int i17, android.view.View view, jq4.z0 z0Var) {
        this.f382723d = i17;
        this.f382724e = view;
        this.f382725f = z0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = this.f382723d;
        if (i17 >= 0 || java.lang.Math.abs(i17) <= android.view.ViewConfiguration.get(this.f382724e.getContext()).getScaledTouchSlop()) {
            return;
        }
        this.f382725f.q();
    }
}
