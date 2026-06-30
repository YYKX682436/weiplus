package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class x implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 f218723a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809) {
        this.f218723a = textureViewSurfaceTextureListenerC15532xe9ad4809;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        wu5.c cVar = this.f218723a.G;
        if (cVar != null) {
            cVar.cancel(false);
            this.f218723a.G = null;
        }
        this.f218723a.G = ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.w(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "after onAnimationStart ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218723a;
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218614v.b(textureViewSurfaceTextureListenerC15532xe9ad4809.f218602h);
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218602h.setVisibility(0);
    }
}
