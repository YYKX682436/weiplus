package cl1;

/* loaded from: classes8.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView f42857d;

    public d(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView) {
        this.f42857d = appBrandDesktopContainerView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView = this.f42857d;
        appBrandDesktopContainerView.f91077m = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainerView", "hideDesktopViewDirectly");
        appBrandDesktopContainerView.contentView.setVisibility(8);
        appBrandDesktopContainerView.f91072e.setVisibility(8);
        ((com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView) appBrandDesktopContainerView.f91073f).l1(true);
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
