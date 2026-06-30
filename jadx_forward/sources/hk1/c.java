package hk1;

/* loaded from: classes7.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk1.e f363404d;

    public c(hk1.e eVar) {
        this.f363404d = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f363404d.f363409f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(java.lang.Boolean.FALSE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f363404d.f363409f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(java.lang.Boolean.TRUE);
    }
}
