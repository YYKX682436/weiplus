package b04;

/* loaded from: classes4.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b04.z f98456e;

    public l(android.widget.ImageView imageView, b04.z zVar) {
        this.f98455d = imageView;
        this.f98456e = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f98455d;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setAlpha(1.0f);
        this.f98456e.f98495v = null;
    }
}
