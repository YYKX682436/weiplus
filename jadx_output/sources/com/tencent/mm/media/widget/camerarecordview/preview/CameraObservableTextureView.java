package com.tencent.mm.media.widget.camerarecordview.preview;

/* loaded from: classes10.dex */
public class CameraObservableTextureView extends com.tencent.mm.ui.base.MMTextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public boolean f68936h;

    public CameraObservableTextureView(android.content.Context context) {
        super(context);
        this.f68936h = false;
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    @Override // android.view.TextureView
    public boolean isAvailable() {
        return this.f68936h;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
        C();
        this.f68936h = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
        this.f68936h = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public void setTextureChangeCallback(et0.a aVar) {
    }

    public CameraObservableTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68936h = false;
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    public CameraObservableTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68936h = false;
    }
}
