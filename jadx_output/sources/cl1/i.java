package cl1;

/* loaded from: classes8.dex */
public class i implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView f42874d;

    public i(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView) {
        this.f42874d = appBrandDesktopDragView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = this.f42874d;
        appBrandDesktopDragView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "enableScroll %b", java.lang.Boolean.TRUE);
        appBrandDesktopDragView.f91122z = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
