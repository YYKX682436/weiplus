package cn2;

/* loaded from: classes3.dex */
public final class q0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.y0 f43608d;

    public q0(cn2.y0 y0Var) {
        this.f43608d = y0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        cn2.y0 y0Var = this.f43608d;
        java.lang.Object target = y0Var.f43648h.getTarget();
        android.view.View view = target instanceof android.view.View ? (android.view.View) target : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveHotCommentWidget$cntTransferAnimatorSetListener$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveHotCommentWidget$cntTransferAnimatorSetListener$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.lang.Object target2 = y0Var.f43646f.getTarget();
        android.view.View view2 = target2 instanceof android.view.View ? (android.view.View) target2 : null;
        if (view2 != null) {
            view2.setScaleX(1.0f);
        }
        java.lang.Object target3 = y0Var.f43647g.getTarget();
        android.view.View view3 = target3 instanceof android.view.View ? (android.view.View) target3 : null;
        if (view3 != null) {
            view3.setScaleY(1.0f);
        }
        cn2.y0.a(y0Var);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        java.lang.Integer[] numArr = cn2.y0.f43640n;
        cn2.y0 y0Var = this.f43608d;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView c17 = y0Var.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("x");
        java.util.List list = y0Var.f43649i;
        kotlin.jvm.internal.o.f(list, "access$getCntQueue$p(...)");
        sb6.append(kz5.h0.C(list));
        c17.setText(sb6.toString());
    }
}
