package df2;

/* loaded from: classes.dex */
public final class y2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f313377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313378e;

    public y2(yz5.a aVar) {
        this.f313378e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator a17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        this.f313377d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        if (this.f313377d) {
            return;
        }
        this.f313378e.mo152xb9724478();
    }
}
