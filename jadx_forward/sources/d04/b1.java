package d04;

/* loaded from: classes3.dex */
public final class b1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc f306913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306915f;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc, boolean z17, yz5.a aVar) {
        this.f306913d = c17328xd29825bc;
        this.f306914e = z17;
        this.f306915f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        this.f306913d.f241243q = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.ViewPropertyAnimator animate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc = this.f306913d;
        android.view.View view = c17328xd29825bc.f241234e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = c17328xd29825bc.f241234e;
        if (view2 != null && (animate = view2.animate()) != null) {
            animate.setListener(null);
        }
        c17328xd29825bc.f241243q = false;
        if (this.f306914e) {
            this.f306915f.mo152xb9724478();
        }
    }
}
