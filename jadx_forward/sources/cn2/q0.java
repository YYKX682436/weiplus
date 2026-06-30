package cn2;

/* loaded from: classes3.dex */
public final class q0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.y0 f125141d;

    public q0(cn2.y0 y0Var) {
        this.f125141d = y0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        cn2.y0 y0Var = this.f125141d;
        java.lang.Object target = y0Var.f125181h.getTarget();
        android.view.View view = target instanceof android.view.View ? (android.view.View) target : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveHotCommentWidget$cntTransferAnimatorSetListener$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveHotCommentWidget$cntTransferAnimatorSetListener$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.lang.Object target2 = y0Var.f125179f.getTarget();
        android.view.View view2 = target2 instanceof android.view.View ? (android.view.View) target2 : null;
        if (view2 != null) {
            view2.setScaleX(1.0f);
        }
        java.lang.Object target3 = y0Var.f125180g.getTarget();
        android.view.View view3 = target3 instanceof android.view.View ? (android.view.View) target3 : null;
        if (view3 != null) {
            view3.setScaleY(1.0f);
        }
        cn2.y0.a(y0Var);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        java.lang.Integer[] numArr = cn2.y0.f125173n;
        cn2.y0 y0Var = this.f125141d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c17 = y0Var.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("x");
        java.util.List list = y0Var.f125182i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getCntQueue$p(...)");
        sb6.append(kz5.h0.C(list));
        c17.setText(sb6.toString());
    }
}
