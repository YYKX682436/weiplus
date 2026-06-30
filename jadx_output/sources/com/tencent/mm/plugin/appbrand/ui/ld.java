package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class ld implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Animatable2 f89853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar f89854e;

    public ld(android.graphics.drawable.Animatable2 animatable2, com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar simplifiedLoadingProgressBar) {
        this.f89853d = animatable2;
        this.f89854e = simplifiedLoadingProgressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        boolean verifyDrawable;
        android.graphics.drawable.Animatable2 animatable2 = this.f89853d;
        kotlin.jvm.internal.o.e(animatable2, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar simplifiedLoadingProgressBar = this.f89854e;
        verifyDrawable = simplifiedLoadingProgressBar.verifyDrawable((android.graphics.drawable.Drawable) animatable2);
        if (verifyDrawable && animatable2.isRunning()) {
            ((android.graphics.drawable.Drawable) animatable2).invalidateSelf();
            simplifiedLoadingProgressBar.postOnAnimation(this);
        }
    }
}
