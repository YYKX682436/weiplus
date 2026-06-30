package xb4;

/* loaded from: classes4.dex */
public class f1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.i1 f534468d;

    public f1(xb4.i1 i1Var) {
        this.f534468d = i1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$2");
        if (xb4.i1.b(this.f534468d).f250836w0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereCardAdBackAnimation", "holder is busy");
            xb4.i1 i1Var = this.f534468d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
            android.animation.AnimatorSet animatorSet = i1Var.f534480c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
            java.util.Iterator<android.animation.Animator> it = animatorSet.getChildAnimations().iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$2");
            return;
        }
        xb4.i1.b(this.f534468d).f250836w0 = true;
        android.view.View view = xb4.i1.b(this.f534468d).D0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = xb4.i1.b(this.f534468d).E0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$2");
    }
}
