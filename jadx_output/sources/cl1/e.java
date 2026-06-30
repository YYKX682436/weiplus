package cl1;

/* loaded from: classes8.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView f42861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42862e;

    public e(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView, boolean z17) {
        this.f42861d = appBrandDesktopContainerView;
        this.f42862e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        cl1.p0 p0Var;
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView;
        androidx.recyclerview.widget.f2 f2Var;
        int itemCount;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView = this.f42861d;
        appBrandDesktopContainerView.f91077m = false;
        if (!this.f42862e || (p0Var = appBrandDesktopContainerView.f91073f) == null || (f2Var = (appBrandDesktopView = (com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView) p0Var).f91093q2) == null || (itemCount = f2Var.getItemCount()) < 1) {
            return;
        }
        cl1.o oVar = new cl1.o(appBrandDesktopView, appBrandDesktopView.getContext());
        oVar.f12049a = itemCount - 1;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = appBrandDesktopView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.startSmoothScroll(oVar);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
