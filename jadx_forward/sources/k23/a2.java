package k23;

/* loaded from: classes3.dex */
public final class a2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f385045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f385046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f385047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385048g;

    public a2(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.view.View view, float f17, android.animation.AnimatorSet animatorSet, k23.j2 j2Var) {
        this.f385045d = f0Var;
        this.f385046e = view;
        this.f385047f = animatorSet;
        this.f385048g = j2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f385045d;
        int i17 = f0Var.f391649d + 1;
        f0Var.f391649d = i17;
        if (i17 > 1) {
            this.f385048g.l();
            return;
        }
        android.view.View view = this.f385046e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupAndStartShimmerAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupAndStartShimmerAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f385046e.setTranslationX(0.0f);
        this.f385047f.start();
    }
}
