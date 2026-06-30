package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* renamed from: com.tencent.mm.plugin.voip.widget.VoIPVideoView */
/* loaded from: classes10.dex */
public class TextureViewSurfaceTextureListenerC18935x91b63e0 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f258632h;

    public TextureViewSurfaceTextureListenerC18935x91b63e0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        E();
    }

    public final void E() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f258632h = paint;
        paint.setColor(-16777216);
        this.f258632h.setFilterBitmap(true);
        this.f258632h.setTextSize(40.0f);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(surfaceTexture != null);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureAvailable %b %d %d", objArr);
        C();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(surfaceTexture != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureDestroyed %b", objArr);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(surfaceTexture != null);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureSizeChanged %b %d %d", objArr);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC18935x91b63e0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        E();
    }
}
