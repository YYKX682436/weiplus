package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class h6 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI f89753d;

    public h6(com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI appBrandPluginUI) {
        this.f89753d = appBrandPluginUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener;
        super.onAnimationEnd(animator);
        com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI appBrandPluginUI = this.f89753d;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC o76 = appBrandPluginUI.o7();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = o76 == null ? null : o76.L1;
        if (halfScreenConfig != null && (weAppHalfScreenStatusChangeListener = halfScreenConfig.f77366p) != null) {
            weAppHalfScreenStatusChangeListener.b(false);
        }
        super/*com.tencent.mm.plugin.appbrand.ui.AppBrandUI*/.finish();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener;
        super.onAnimationStart(animator);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC o76 = this.f89753d.o7();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = o76 == null ? null : o76.L1;
        if (halfScreenConfig == null || (weAppHalfScreenStatusChangeListener = halfScreenConfig.f77366p) == null) {
            return;
        }
        weAppHalfScreenStatusChangeListener.b(true);
    }
}
