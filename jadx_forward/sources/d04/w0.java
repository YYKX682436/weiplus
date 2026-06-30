package d04;

/* loaded from: classes3.dex */
public final class w0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f307064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f307065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f307066f;

    public w0(android.view.View view, boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f307064d = view;
        this.f307065e = z17;
        this.f307066f = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f307066f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f307064d;
        int i17 = this.f307065e ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$animateViewAlpha$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$animateViewAlpha$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f307066f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f307066f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f307066f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f307066f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f307066f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
    }
}
