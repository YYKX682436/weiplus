package xb4;

/* loaded from: classes4.dex */
public class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f534496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xb4.n0 f534497e;

    public m0(xb4.n0 n0Var, u74.d dVar) {
        this.f534497e = n0Var;
        this.f534496d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAnim.back", "onAnimation end");
        android.view.View view = this.f534496d.f506698z;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        this.f534496d.f506698z.setScaleY(1.0f);
        android.view.View view2 = this.f534496d.f506698z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f534496d.f506675c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = this.f534496d.f506678f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(valueOf);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        xb4.x xVar = this.f534497e.f534530a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        this.f534496d.T.f506667d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAnim.back", "onAnimation start");
        u74.d dVar = this.f534496d;
        if (dVar.T.f506671h && (c18401x8b62a617 = dVar.f506689q) != null) {
            c18401x8b62a617.h(true);
            dVar.f506689q.g();
        }
        xb4.x xVar = this.f534497e.f534530a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
    }
}
