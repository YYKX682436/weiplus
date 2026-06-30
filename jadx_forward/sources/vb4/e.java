package vb4;

/* loaded from: classes4.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f516342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.f f516343e;

    public e(vb4.f fVar, boolean z17) {
        this.f516343e = fVar;
        this.f516342d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.f fVar = this.f516343e;
        fVar.f516346p = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.c cVar = fVar.f516329c;
        if (cVar != null) {
            cVar.mo69472xbb3aa236();
        }
        if (!this.f516342d) {
            android.view.View view = fVar.f516327a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.f fVar = this.f516343e;
        fVar.f516345o = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) fVar.f516327a.getLayoutParams();
        layoutParams.leftMargin = fVar.f516330d;
        layoutParams.topMargin = fVar.f516331e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) fVar.f516327a.getParent();
        if (this.f516342d) {
            layoutParams.rightMargin = (viewGroup.getWidth() - (fVar.f516337k - fVar.f516335i)) - layoutParams.leftMargin;
            layoutParams.bottomMargin = (viewGroup.getHeight() - (fVar.f516336j - fVar.f516334h)) - layoutParams.topMargin;
        } else {
            layoutParams.rightMargin = (viewGroup.getWidth() - fVar.f516332f) - layoutParams.leftMargin;
            layoutParams.bottomMargin = (viewGroup.getHeight() - fVar.f516333g) - layoutParams.topMargin;
        }
        fVar.f516327a.setLayoutParams(layoutParams);
        android.view.View view = fVar.f516327a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        vb4.c cVar = fVar.f516329c;
        if (cVar != null) {
            cVar.mo69473xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
    }
}
