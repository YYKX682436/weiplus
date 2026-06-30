package xb4;

/* loaded from: classes4.dex */
public class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f534505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xb4.q f534507f;

    public p(xb4.q qVar, java.util.List list, android.view.View view) {
        this.f534507f = qVar;
        this.f534505d = list;
        this.f534506e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDynamicCardBackAnimation", "onAnimation end");
        android.view.View view = this.f534506e;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        this.f534506e.setScaleY(1.0f);
        android.view.View view2 = this.f534506e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        for (int i17 = 0; i17 < this.f534505d.size(); i17++) {
            android.view.View view3 = (android.view.View) this.f534505d.get(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(valueOf);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        xb4.x xVar = this.f534507f.f534530a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        xb4.q qVar = this.f534507f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
        s74.p0 p0Var = qVar.f534510b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
        p0Var.f250836w0 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDynamicCardBackAnimation", "onAnimation start");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f534505d;
            if (i17 >= list.size()) {
                break;
            }
            android.view.View view = (android.view.View) list.get(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            i17++;
        }
        xb4.x xVar = this.f534507f.f534530a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
    }
}
