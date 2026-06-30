package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class md extends android.graphics.drawable.Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ld f171404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562 f171405b;

    public md(android.graphics.drawable.Animatable2 animatable2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562 c12699x37a66562) {
        this.f171405b = c12699x37a66562;
        this.f171404a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ld(animatable2, c12699x37a66562);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        super.onAnimationEnd(drawable);
        this.f171405b.removeCallbacks(this.f171404a);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationStart(android.graphics.drawable.Drawable drawable) {
        super.onAnimationStart(drawable);
        this.f171405b.postOnAnimation(this.f171404a);
    }
}
