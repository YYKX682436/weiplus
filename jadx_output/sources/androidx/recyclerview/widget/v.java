package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.x f12245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f12246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f12247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.z f12248g;

    public v(androidx.recyclerview.widget.z zVar, androidx.recyclerview.widget.x xVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f12248g = zVar;
        this.f12245d = xVar;
        this.f12246e = viewPropertyAnimator;
        this.f12247f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f12246e.setListener(null);
        android.view.View view = this.f12247f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f12247f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        androidx.recyclerview.widget.x xVar = this.f12245d;
        androidx.recyclerview.widget.k3 k3Var = xVar.f12262a;
        androidx.recyclerview.widget.z zVar = this.f12248g;
        zVar.h(k3Var);
        zVar.f12307r.remove(xVar.f12262a);
        zVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        androidx.recyclerview.widget.k3 k3Var = this.f12245d.f12262a;
        this.f12248g.getClass();
    }
}
