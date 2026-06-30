package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class md extends android.graphics.drawable.Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.ld f89871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar f89872b;

    public md(android.graphics.drawable.Animatable2 animatable2, com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar simplifiedLoadingProgressBar) {
        this.f89872b = simplifiedLoadingProgressBar;
        this.f89871a = new com.tencent.mm.plugin.appbrand.ui.ld(animatable2, simplifiedLoadingProgressBar);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        super.onAnimationEnd(drawable);
        this.f89872b.removeCallbacks(this.f89871a);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationStart(android.graphics.drawable.Drawable drawable) {
        super.onAnimationStart(drawable);
        this.f89872b.postOnAnimation(this.f89871a);
    }
}
