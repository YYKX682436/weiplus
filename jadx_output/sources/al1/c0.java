package al1;

/* loaded from: classes7.dex */
public final class c0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout f5761d;

    public c0(com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout) {
        this.f5761d = appBrandTranslateLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout.f91038s;
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout = this.f5761d;
        appBrandTranslateLayout.e(-1);
        appBrandTranslateLayout.f91044i = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
