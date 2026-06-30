package a04;

/* loaded from: classes15.dex */
public final class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent f471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f472e;

    public a(com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent, android.animation.Animator.AnimatorListener animatorListener) {
        this.f471d = scanUITopOpButtonComponent;
        this.f472e = animatorListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent = this.f471d;
        android.widget.TextView textView = scanUITopOpButtonComponent.f159521f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("cancelButton");
            throw null;
        }
        textView.setAlpha(0.0f);
        android.widget.TextView textView2 = scanUITopOpButtonComponent.f159521f;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("cancelButton");
            throw null;
        }
        e04.i3.b(textView2, true, null);
        android.animation.Animator.AnimatorListener animatorListener = this.f472e;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }
}
