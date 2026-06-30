package vo1;

/* loaded from: classes3.dex */
public final class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f520056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.c f520057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f520058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f520059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f520060h;

    public k(vo1.q qVar, vo1.c cVar, android.view.ViewPropertyAnimator viewPropertyAnimator, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view) {
        this.f520056d = qVar;
        this.f520057e = cVar;
        this.f520058f = viewPropertyAnimator;
        this.f520059g = h0Var;
        this.f520060h = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f520058f.setListener(null);
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) this.f520059g.f391656d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.view.View view = this.f520060h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f520060h;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        vo1.c cVar = this.f520057e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = cVar.f520032b;
        vo1.q qVar = this.f520056d;
        qVar.h(k3Var);
        qVar.f520089r.remove(cVar.f520032b);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f520057e.f520032b;
        this.f520056d.getClass();
    }
}
