package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public class x1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 f241347d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6) {
        this.f241347d = textureViewSurfaceTextureListenerC17306x32f4bae6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = this.f241347d;
        textureViewSurfaceTextureListenerC17306x32f4bae6.f240889m.setTranslationY((textureViewSurfaceTextureListenerC17306x32f4bae6.f240889m.getHeight() + ((android.widget.RelativeLayout.LayoutParams) textureViewSurfaceTextureListenerC17306x32f4bae6.f240889m.getLayoutParams()).bottomMargin) * floatValue);
        textureViewSurfaceTextureListenerC17306x32f4bae6.f240895s.setTranslationY(floatValue * (r1 + textureViewSurfaceTextureListenerC17306x32f4bae6.f240895s.getHeight() + ((android.widget.RelativeLayout.LayoutParams) textureViewSurfaceTextureListenerC17306x32f4bae6.f240895s.getLayoutParams()).bottomMargin));
    }
}
