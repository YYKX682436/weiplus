package xb4;

/* loaded from: classes4.dex */
public class r0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f534514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xb4.s0 f534515e;

    public r0(xb4.s0 s0Var, u74.d dVar) {
        this.f534515e = s0Var;
        this.f534514d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAnim.click", "onAnimation end");
        android.view.View view = this.f534514d.f506698z;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        this.f534514d.f506698z.setScaleY(1.0f);
        android.view.View view2 = this.f534514d.f506698z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f534514d.f506675c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = this.f534514d.f506678f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(valueOf);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        xb4.x xVar = this.f534515e.f534534b;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        this.f534514d.T.f506667d = false;
        u74.d dVar = this.f534514d;
        if (dVar.T.f506666c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = dVar.f506695w;
            if (c18390xafce807 != null) {
                c18390xafce807.M(0, false);
            }
        } else if (dVar.f506687o.f249950g.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424 c18406x5acd4424 = this.f534514d.f506687o.f249950g;
            c18406x5acd4424.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            m3.a aVar = c18406x5acd4424.f252363z;
            if (aVar != null) {
                aVar.mo3938xab27b508(java.lang.Boolean.TRUE);
            }
            c18406x5acd4424.k(0, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAnim.click", "seek newVideoView to 0");
        }
        fd4.l lVar = this.f534514d.T.f506668e;
        if (lVar != null) {
            lVar.e();
        }
        c84.f fVar = this.f534514d.T.f506669f;
        if (fVar != null) {
            fVar.onAnimationEnd(animator);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAnim.click", "onAnimation start");
        xb4.x xVar = this.f534515e.f534534b;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
    }
}
