package dm1;

/* loaded from: classes.dex */
public final class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f323167d;

    public e(yz5.a aVar) {
        this.f323167d = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f323167d.mo152xb9724478();
    }
}
