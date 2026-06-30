package a04;

/* loaded from: classes15.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent f473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f474e;

    public b(com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent, android.animation.Animator.AnimatorListener animatorListener) {
        this.f473d = scanUITopOpButtonComponent;
        this.f474e = animatorListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f473d.f159520e;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("closeButton");
            throw null;
        }
        e04.i3.b(imageView, true, null);
        android.animation.Animator.AnimatorListener animatorListener = this.f474e;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }
}
