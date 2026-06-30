package rh4;

/* loaded from: classes3.dex */
public class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh4.z f477337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f477338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477339f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f477340g;

    public y(rh4.b0 b0Var, rh4.z zVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f477340g = b0Var;
        this.f477337d = zVar;
        this.f477338e = viewPropertyAnimator;
        this.f477339f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f477338e.setListener(null);
        android.view.View view = this.f477339f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f477339f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        rh4.z zVar = this.f477337d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = zVar.f477342b;
        rh4.b0 b0Var = this.f477340g;
        b0Var.h(k3Var);
        b0Var.f477236r.remove(zVar.f477342b);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f477337d.f477342b;
        this.f477340g.getClass();
    }
}
