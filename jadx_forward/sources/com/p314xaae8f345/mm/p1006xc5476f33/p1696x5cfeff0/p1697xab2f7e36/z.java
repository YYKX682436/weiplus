package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a0 f218725d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a0 a0Var) {
        this.f218725d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "startTranslateAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218725d.f218648e;
        android.view.animation.Animation animation = textureViewSurfaceTextureListenerC15532xe9ad4809.f218618y;
        animation.cancel();
        animation.setDuration(500L);
        animation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.u(textureViewSurfaceTextureListenerC15532xe9ad4809));
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218601g.startAnimation(animation);
        android.view.animation.Animation animation2 = textureViewSurfaceTextureListenerC15532xe9ad4809.f218620z;
        animation2.cancel();
        animation2.setDuration(500L);
        animation2.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.x(textureViewSurfaceTextureListenerC15532xe9ad4809));
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218602h.startAnimation(animation2);
    }
}
