package sc2;

/* loaded from: classes2.dex */
public final class l4 extends sc2.k4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.m4 f487580h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(android.view.View view, sc2.m4 m4Var, long j17, int i17, java.lang.String str) {
        super(j17, i17, str);
        this.f487579g = view;
        this.f487580h = m4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f487579g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver$transformView$1$scaleYAnimator$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver$transformView$1$scaleYAnimator$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sc2.m4 m4Var = this.f487580h;
        m4Var.getClass();
        m4Var.H(19, xc2.k0.f534706y.a(this.f487549d, this.f487550e, this.f487551f));
        xc2.u0[] u0VarArr = xc2.u0.f534841d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53 c5476xff2a9b53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53();
        long j17 = m4Var.f84678f;
        am.lb lbVar = c5476xff2a9b53.f135814g;
        lbVar.f88767a = j17;
        lbVar.f88768b = 1;
        c5476xff2a9b53.e();
        m4Var.A = false;
    }
}
