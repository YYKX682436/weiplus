package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.u f246874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f246875e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y yVar, ab4.u uVar, android.widget.Button button) {
        this.f246874d = uVar;
        this.f246875e = button;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$10");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f246874d.Z)) {
            java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
            android.graphics.drawable.Drawable drawable = this.f246875e.getCompoundDrawables()[0];
            if (drawable != null) {
                drawable.setColorFilter(num.intValue(), android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$10");
    }
}
