package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f12220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f12221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f12222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.z f12223g;

    public t(androidx.recyclerview.widget.z zVar, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f12223g = zVar;
        this.f12220d = k3Var;
        this.f12221e = view;
        this.f12222f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.f12221e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f12222f.setListener(null);
        androidx.recyclerview.widget.z zVar = this.f12223g;
        androidx.recyclerview.widget.k3 k3Var = this.f12220d;
        zVar.h(k3Var);
        zVar.f12304o.remove(k3Var);
        zVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f12223g.getClass();
    }
}
