package xb4;

/* loaded from: classes4.dex */
public final class j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.l f534481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f534483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w64.x f534484g;

    public j(xb4.l lVar, android.view.View view, java.util.List list, w64.x xVar) {
        this.f534481d = lVar;
        this.f534482e = view;
        this.f534483f = list;
        this.f534484g = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdCommonClickAnimation", "onAnimation end");
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        android.view.View view = this.f534482e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f534482e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.List list = this.f534483f;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view3 = (android.view.View) list.get(i17);
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(valueOf);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        w64.x xVar = this.f534484g;
        w64.w d17 = xVar.d();
        if (d17 != null) {
            d17.a(0);
        }
        xb4.l lVar = this.f534481d;
        xb4.x xVar2 = lVar.f534534b;
        if (xVar2 != null) {
            xVar2.mo71145xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        boolean z17 = lVar.f534492d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        if (!z17) {
            vb4.a.b(xVar.b(), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdCommonClickAnimation", "onAnimation start");
        xb4.x xVar = this.f534481d.f534534b;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
    }
}
