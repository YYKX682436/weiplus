package rp1;

/* loaded from: classes3.dex */
public class f2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.h2 f479929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f479930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f479932g;

    public f2(rp1.k2 k2Var, rp1.h2 h2Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f479932g = k2Var;
        this.f479929d = h2Var;
        this.f479930e = viewPropertyAnimator;
        this.f479931f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f479930e.setListener(null);
        android.view.View view = this.f479931f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f479931f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        rp1.h2 h2Var = this.f479929d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = h2Var.f479944a;
        rp1.k2 k2Var = this.f479932g;
        k2Var.h(k3Var);
        k2Var.f479997r.remove(h2Var.f479944a);
        k2Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f479929d.f479944a;
        this.f479932g.getClass();
    }
}
