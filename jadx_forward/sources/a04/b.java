package a04;

/* loaded from: classes15.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2042xac8f1cfd.C17322xb99fb086 f82006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f82007e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2042xac8f1cfd.C17322xb99fb086 c17322xb99fb086, android.animation.Animator.AnimatorListener animatorListener) {
        this.f82006d = c17322xb99fb086;
        this.f82007e = animatorListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f82006d.f241053e;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeButton");
            throw null;
        }
        e04.i3.b(imageView, true, null);
        android.animation.Animator.AnimatorListener animatorListener = this.f82007e;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }
}
