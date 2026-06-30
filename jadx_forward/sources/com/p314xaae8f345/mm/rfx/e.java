package com.p314xaae8f345.mm.rfx;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f273759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 f273760e;

    public e(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17, android.graphics.SurfaceTexture surfaceTexture) {
        this.f273760e = textureViewSurfaceTextureListenerC20956x37a43b17;
        this.f273759d = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f273760e.m77547x6153d753(this.f273759d);
    }
}
