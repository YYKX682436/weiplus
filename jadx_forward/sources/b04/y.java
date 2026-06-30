package b04;

/* loaded from: classes3.dex */
public final class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f98477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f98478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b04.z f98479f;

    public y(android.view.View view, android.widget.LinearLayout linearLayout, b04.z zVar) {
        this.f98477d = view;
        this.f98478e = linearLayout;
        this.f98479f = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f98477d.getLayoutParams().height = -2;
        android.widget.LinearLayout linearLayout = this.f98478e;
        linearLayout.getLayoutParams().height = -2;
        linearLayout.setAlpha(1.0f);
        this.f98479f.f98494u = null;
    }
}
