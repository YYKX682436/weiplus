package wb4;

/* loaded from: classes4.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f525938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wb4.h f525939f;

    public g(wb4.h hVar, android.view.View view, java.util.List list) {
        this.f525939f = hVar;
        this.f525937d = view;
        this.f525938e = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation end");
        android.view.View view = this.f525937d;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f525937d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f525938e;
            if (i17 >= list.size()) {
                break;
            }
            android.view.View view3 = (android.view.View) list.get(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(valueOf);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation");
        wb4.h hVar = this.f525939f;
        dc4.p pVar = hVar.f525941b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation");
        s74.o2 l17 = pVar.l();
        if (l17 != null && a84.y0.e(l17.C().b())) {
            android.view.View childAt = l17.C().b().getChildAt(0);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) childAt).M(0, false);
            }
        }
        xb4.x xVar = hVar.f525946a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation start");
        xb4.x xVar = this.f525939f.f525946a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
    }
}
