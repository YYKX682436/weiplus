package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ye implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f111162d;

    public ye(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f111162d = afVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.af afVar = this.f111162d;
        int V6 = afVar.V6(60);
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = afVar.I;
        if (roundCornerRelativeLayout == null) {
            kotlin.jvm.internal.o.o("bottomAreaJumpGroup");
            throw null;
        }
        float f17 = V6;
        roundCornerRelativeLayout.setTranslationY((animatedFraction * f17) - f17);
    }
}
