package wb4;

/* loaded from: classes4.dex */
public class b0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.c0 f525925d;

    public b0(wb4.c0 c0Var) {
        this.f525925d = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereCardAdDetailBackAnimation", "onAnimation end");
        wb4.c0 c0Var = this.f525925d;
        android.view.View view = wb4.c0.b(c0Var).f310383z;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        wb4.c0.b(c0Var).f310383z.setScaleY(1.0f);
        android.view.View view2 = wb4.c0.b(c0Var).f310383z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = wb4.c0.b(c0Var).f310374q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = wb4.c0.b(c0Var).f310375r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(valueOf);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        xb4.x xVar = c0Var.f525945a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereCardAdDetailBackAnimation", "onAnimation start");
        xb4.x xVar = this.f525925d.f525945a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
    }
}
