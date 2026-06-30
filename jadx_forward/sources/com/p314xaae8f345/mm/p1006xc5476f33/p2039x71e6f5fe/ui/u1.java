package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public class u1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 f241186d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6) {
        this.f241186d = textureViewSurfaceTextureListenerC17306x32f4bae6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = this.f241186d;
        if (floatValue <= 0.1f) {
            textureViewSurfaceTextureListenerC17306x32f4bae6.f240896t.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            textureViewSurfaceTextureListenerC17306x32f4bae6.f240896t.setAlpha((1.0f - floatValue) * 10.0f);
        }
        textureViewSurfaceTextureListenerC17306x32f4bae6.f240896t.setTranslationY(floatValue * (textureViewSurfaceTextureListenerC17306x32f4bae6.F - r0.getHeight()));
    }
}
