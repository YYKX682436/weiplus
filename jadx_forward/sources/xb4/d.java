package xb4;

/* loaded from: classes4.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f534454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.x f534455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xb4.f f534456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534457g;

    public d(java.util.List list, w64.x xVar, xb4.f fVar, android.view.View view) {
        this.f534454d = list;
        this.f534455e = xVar;
        this.f534456f = fVar;
        this.f534457g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdCommonBackAnimation", "onAnimation end");
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        android.view.View view = this.f534457g;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f534457g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.List list = this.f534454d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view3 = (android.view.View) list.get(i17);
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(valueOf);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        xb4.f fVar = this.f534456f;
        xb4.x xVar = fVar.f534530a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        boolean z17 = fVar.f534466c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        if (!z17) {
            vb4.a.b(this.f534455e.b(), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617;
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdCommonBackAnimation", "onAnimation start");
        java.util.List list2 = this.f534454d;
        int size = list2.size();
        int i17 = 0;
        while (i17 < size) {
            android.view.View view = (android.view.View) list2.get(i17);
            if (view == null) {
                list = list2;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                list = list2;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            i17++;
            list2 = list;
        }
        w64.u a17 = this.f534455e.a();
        if (a17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("backAnimStart", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$backAnimListener$1");
            u74.d dVar = ((l44.h4) a17).f397699a;
            u74.c cVar = dVar.T;
            if (cVar != null && cVar.f506671h && (c18401x8b62a617 = dVar.f506689q) != null) {
                c18401x8b62a617.h(true);
                dVar.f506689q.g();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClickActionHelper", "mSnsAdBreakFrameVideoView restart");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("backAnimStart", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$backAnimListener$1");
        }
        xb4.x xVar = this.f534456f.f534530a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
    }
}
