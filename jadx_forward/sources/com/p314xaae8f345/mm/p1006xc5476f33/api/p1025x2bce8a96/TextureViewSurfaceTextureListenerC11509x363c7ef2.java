package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* renamed from: com.tencent.mm.plugin.api.recordView.MMSightRecordTextureView */
/* loaded from: classes10.dex */
class TextureViewSurfaceTextureListenerC11509x363c7ef2 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.g f156248h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.f f156249i;

    public TextureViewSurfaceTextureListenerC11509x363c7ef2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureAvailable, surface: %s, width: %s, height: %s", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f156248h = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.g();
        this.f156249i = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.f(surfaceTexture, this.f156248h);
        this.f156248h.a(i17, i18);
        this.f156249i.f156267m = true;
        this.f156249i.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f156249i.f156267m = false;
        try {
            this.f156249i.join();
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightRecordTextureViewImpl", e17, "onSurfaceTextureDestroyed error: %s", e17.getMessage());
        }
        this.f156249i = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureSizeChanged, surface: %s, width: %s, height: %s", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f156248h.a(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC11509x363c7ef2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }
}
