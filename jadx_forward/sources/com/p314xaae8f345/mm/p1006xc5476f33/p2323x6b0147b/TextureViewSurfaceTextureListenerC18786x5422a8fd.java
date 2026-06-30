package com.p314xaae8f345.mm.p1006xc5476f33.p2323x6b0147b;

/* renamed from: com.tencent.mm.plugin.video.ObservableTextureView */
/* loaded from: classes10.dex */
public class TextureViewSurfaceTextureListenerC18786x5422a8fd extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public fo4.b f257060h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257061i;

    public TextureViewSurfaceTextureListenerC18786x5422a8fd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f257061i = false;
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    @Override // android.view.TextureView
    public boolean isAvailable() {
        return this.f257061i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
        C();
        this.f257061i = true;
        fo4.b bVar = this.f257060h;
        if (bVar != null) {
            bVar.mo66986xb7df39dc(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
        this.f257061i = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    /* renamed from: setTextureChangeCallback */
    public void m72364xdb0582ce(fo4.b bVar) {
        this.f257060h = bVar;
    }

    public TextureViewSurfaceTextureListenerC18786x5422a8fd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f257061i = false;
    }
}
