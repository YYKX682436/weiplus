package com.p314xaae8f345.mm.rfx;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f273761d;

    public f(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17, android.graphics.SurfaceTexture surfaceTexture) {
        this.f273761d = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f273761d.release();
    }
}
