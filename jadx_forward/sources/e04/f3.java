package e04;

/* loaded from: classes3.dex */
public final class f3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f327471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f327472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f327473f;

    public f3(android.animation.Animator.AnimatorListener animatorListener, android.view.View view, boolean z17) {
        this.f327471d = animatorListener;
        this.f327472e = view;
        this.f327473f = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f327471d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f327472e;
        int i17 = this.f327473f ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewUtils$animateAlpha$listener$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewUtils$animateAlpha$listener$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.animation.Animator.AnimatorListener animatorListener = this.f327471d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f327471d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f327471d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation);
        }
    }
}
