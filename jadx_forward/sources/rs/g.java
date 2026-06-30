package rs;

/* loaded from: classes3.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs.i f480789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f480790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f480791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rs.k f480792g;

    public g(rs.k kVar, rs.i iVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f480792g = kVar;
        this.f480789d = iVar;
        this.f480790e = viewPropertyAnimator;
        this.f480791f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f480790e.setListener(null);
        android.view.View view = this.f480791f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f480791f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        rs.i iVar = this.f480789d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = iVar.f480797a;
        rs.k kVar = this.f480792g;
        kVar.h(k3Var);
        kVar.f480819r.remove(iVar.f480797a);
        kVar.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f480789d.f480797a;
        this.f480792g.getClass();
    }
}
