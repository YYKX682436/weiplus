package com.p314xaae8f345.mm.rfx;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 f273758d;

    public d(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17) {
        this.f273758d = textureViewSurfaceTextureListenerC20956x37a43b17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17 = this.f273758d;
        boolean isOpaque = textureViewSurfaceTextureListenerC20956x37a43b17.isOpaque();
        textureViewSurfaceTextureListenerC20956x37a43b17.setOpaque(!isOpaque);
        textureViewSurfaceTextureListenerC20956x37a43b17.setOpaque(isOpaque);
    }
}
