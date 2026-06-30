package rh4;

/* loaded from: classes3.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f477244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f477246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.k f477247g;

    public e(rh4.k kVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f477247g = kVar;
        this.f477244d = k3Var;
        this.f477245e = view;
        this.f477246f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.f477245e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f477245e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f477246f.setListener(null);
        rh4.k kVar = this.f477247g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f477244d;
        kVar.h(k3Var);
        kVar.f477288o.remove(k3Var);
        kVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f477247g.getClass();
    }
}
