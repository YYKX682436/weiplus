package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public class w extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.x f93785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f93786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f93787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.z f93788g;

    public w(p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f93788g = zVar;
        this.f93785d = xVar;
        this.f93786e = viewPropertyAnimator;
        this.f93787f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f93786e.setListener(null);
        android.view.View view = this.f93787f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f93787f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar = this.f93785d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = xVar.f93796b;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = this.f93788g;
        zVar.h(k3Var);
        zVar.f93840r.remove(xVar.f93796b);
        zVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f93785d.f93796b;
        this.f93788g.getClass();
    }
}
