package b04;

/* loaded from: classes4.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b04.z f16923e;

    public l(android.widget.ImageView imageView, b04.z zVar) {
        this.f16922d = imageView;
        this.f16923e = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f16922d;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setAlpha(1.0f);
        this.f16923e.f16962v = null;
    }
}
