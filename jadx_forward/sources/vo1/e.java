package vo1;

/* loaded from: classes3.dex */
public final class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f520043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f520044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f520045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f520046g;

    public e(vo1.q qVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f520043d = qVar;
        this.f520044e = k3Var;
        this.f520045f = view;
        this.f520046g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.View view = this.f520045f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateAddImpl$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateAddImpl$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f520046g.setListener(null);
        vo1.q qVar = this.f520043d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f520044e;
        qVar.h(k3Var);
        qVar.f520086o.remove(k3Var);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f520043d.getClass();
    }
}
