package wb4;

/* loaded from: classes4.dex */
public class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f525926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wb4.d f525928f;

    public c(wb4.d dVar, java.util.List list, android.view.View view) {
        this.f525928f = dVar;
        this.f525926d = list;
        this.f525927e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardBackAnimation$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailBackAnimation", "onAnimation end");
        android.view.View view = this.f525927e;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f525927e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f525926d;
            if (i17 >= list.size()) {
                break;
            }
            android.view.View view3 = (android.view.View) list.get(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(valueOf);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            i17++;
        }
        xb4.x xVar = this.f525928f.f525945a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardBackAnimation$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardBackAnimation$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailBackAnimation", "onAnimation start");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f525926d;
            if (i17 >= list.size()) {
                break;
            }
            android.view.View view = (android.view.View) list.get(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            i17++;
        }
        xb4.x xVar = this.f525928f.f525945a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardBackAnimation$3");
    }
}
