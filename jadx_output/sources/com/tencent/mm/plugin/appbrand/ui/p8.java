package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class p8 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f89921a;

    public p8(com.tencent.mm.plugin.appbrand.ui.u8 u8Var, java.lang.Runnable runnable) {
        this.f89921a = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        java.lang.Runnable runnable = this.f89921a;
        if (runnable != null) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }
}
