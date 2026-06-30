package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.x f93778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f93779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f93780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.z f93781g;

    public v(p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f93781g = zVar;
        this.f93778d = xVar;
        this.f93779e = viewPropertyAnimator;
        this.f93780f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f93779e.setListener(null);
        android.view.View view = this.f93780f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f93780f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar = this.f93778d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = xVar.f93795a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = this.f93781g;
        zVar.h(k3Var);
        zVar.f93840r.remove(xVar.f93795a);
        zVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f93778d.f93795a;
        this.f93781g.getClass();
    }
}
