package vo1;

/* loaded from: classes3.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f520049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.c f520050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f520051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f520052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f520053h;

    public h(vo1.q qVar, vo1.c cVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.animation.AnimatorSet animatorSet, android.view.View view) {
        this.f520049d = qVar;
        this.f520050e = cVar;
        this.f520051f = viewPropertyAnimator;
        this.f520052g = animatorSet;
        this.f520053h = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f520051f.setListener(null);
        this.f520052g.cancel();
        android.view.View view = this.f520053h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f520053h;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        vo1.c cVar = this.f520050e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = cVar.f520031a;
        vo1.q qVar = this.f520049d;
        qVar.h(k3Var);
        qVar.f520089r.remove(cVar.f520031a);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f520050e.f520031a;
        this.f520049d.getClass();
    }
}
