package rs;

/* loaded from: classes3.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f480775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f480776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f480777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rs.k f480778g;

    public d(rs.k kVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f480778g = kVar;
        this.f480775d = k3Var;
        this.f480776e = viewPropertyAnimator;
        this.f480777f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f480776e.setListener(null);
        android.view.View view = this.f480777f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rs.k kVar = this.f480778g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f480775d;
        kVar.y(k3Var);
        kVar.f480818q.remove(k3Var);
        kVar.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f480778g.C(this.f480775d);
    }
}
