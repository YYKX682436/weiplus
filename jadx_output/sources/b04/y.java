package b04;

/* loaded from: classes3.dex */
public final class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f16944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f16945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b04.z f16946f;

    public y(android.view.View view, android.widget.LinearLayout linearLayout, b04.z zVar) {
        this.f16944d = view;
        this.f16945e = linearLayout;
        this.f16946f = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f16944d.getLayoutParams().height = -2;
        android.widget.LinearLayout linearLayout = this.f16945e;
        linearLayout.getLayoutParams().height = -2;
        linearLayout.setAlpha(1.0f);
        this.f16946f.f16961u = null;
    }
}
