package al1;

/* loaded from: classes7.dex */
public final class f0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout f5768d;

    public f0(com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout) {
        this.f5768d = appBrandTranslateLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f5768d.f91044i = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        al1.b0 b0Var = this.f5768d.f91047o;
    }
}
