package com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8;

/* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView */
/* loaded from: classes10.dex */
public class TextureViewSurfaceTextureListenerC10904xbfa2a6d8 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public boolean f150469h;

    public TextureViewSurfaceTextureListenerC10904xbfa2a6d8(android.content.Context context) {
        super(context);
        this.f150469h = false;
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    @Override // android.view.TextureView
    public boolean isAvailable() {
        return this.f150469h;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
        C();
        this.f150469h = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
        this.f150469h = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    /* renamed from: setTextureChangeCallback */
    public void m46857xdb0582ce(et0.a aVar) {
    }

    public TextureViewSurfaceTextureListenerC10904xbfa2a6d8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150469h = false;
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    public TextureViewSurfaceTextureListenerC10904xbfa2a6d8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150469h = false;
    }
}
