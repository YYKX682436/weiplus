package ua5;

/* loaded from: classes10.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua5.f f507514d;

    public c(ua5.f fVar) {
        this.f507514d = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(this.f507514d.f507522d).remove(animation);
    }
}
