package rh4;

/* loaded from: classes3.dex */
public class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f477319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f477320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f477322g;

    public u(rh4.b0 b0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f477322g = b0Var;
        this.f477319d = k3Var;
        this.f477320e = viewPropertyAnimator;
        this.f477321f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f477320e.setListener(null);
        android.view.View view = this.f477321f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rh4.b0 b0Var = this.f477322g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f477319d;
        b0Var.y(k3Var);
        b0Var.f477235q.remove(k3Var);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f477322g.C(this.f477319d);
    }
}
