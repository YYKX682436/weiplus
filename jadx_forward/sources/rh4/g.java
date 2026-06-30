package rh4;

/* loaded from: classes3.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh4.i f477256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f477257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.k f477259g;

    public g(rh4.k kVar, rh4.i iVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f477259g = kVar;
        this.f477256d = iVar;
        this.f477257e = viewPropertyAnimator;
        this.f477258f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f477257e.setListener(null);
        android.view.View view = this.f477258f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rh4.i iVar = this.f477256d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = iVar.f477268a;
        rh4.k kVar = this.f477259g;
        kVar.h(k3Var);
        kVar.f477291r.remove(iVar.f477268a);
        kVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f477256d.f477268a;
        this.f477259g.getClass();
    }
}
