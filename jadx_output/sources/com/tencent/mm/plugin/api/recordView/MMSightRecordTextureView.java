package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes10.dex */
class MMSightRecordTextureView extends com.tencent.mm.ui.base.MMTextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.api.recordView.g f74715h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.api.recordView.f f74716i;

    public MMSightRecordTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureAvailable, surface: %s, width: %s, height: %s", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f74715h = new com.tencent.mm.plugin.api.recordView.g();
        this.f74716i = new com.tencent.mm.plugin.api.recordView.f(surfaceTexture, this.f74715h);
        this.f74715h.a(i17, i18);
        this.f74716i.f74734m = true;
        this.f74716i.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f74716i.f74734m = false;
        try {
            this.f74716i.join();
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightRecordTextureViewImpl", e17, "onSurfaceTextureDestroyed error: %s", e17.getMessage());
        }
        this.f74716i = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureSizeChanged, surface: %s, width: %s, height: %s", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f74715h.a(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public MMSightRecordTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }
}
