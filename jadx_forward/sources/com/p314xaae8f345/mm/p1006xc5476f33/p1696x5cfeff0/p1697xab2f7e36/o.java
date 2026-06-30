package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 f218698d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809) {
        this.f218698d = textureViewSurfaceTextureListenerC15532xe9ad4809;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218698d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "faceReflectMask.post faceTipTextViewBefore.getHeight():%s", java.lang.Integer.valueOf(textureViewSurfaceTextureListenerC15532xe9ad4809.f218601g.getTop()));
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218599e.m63498x98ef2439(textureViewSurfaceTextureListenerC15532xe9ad4809.f218601g.getTop() + textureViewSurfaceTextureListenerC15532xe9ad4809.f218601g.getHeight() + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 48));
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218599e.invalidate();
        textureViewSurfaceTextureListenerC15532xe9ad4809.e();
    }
}
