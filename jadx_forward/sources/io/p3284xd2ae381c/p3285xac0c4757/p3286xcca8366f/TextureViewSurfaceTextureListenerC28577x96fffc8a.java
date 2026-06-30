package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.SwapTextureViewRenderSurface */
/* loaded from: classes15.dex */
public class TextureViewSurfaceTextureListenerC28577x96fffc8a extends android.view.TextureView implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344, android.view.TextureView.SurfaceTextureListener {
    private static final java.lang.String TAG = "SwapTextureViewRenderSurface";

    /* renamed from: controller */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6 f70775x25fe639c;

    /* renamed from: nextSurfaceUpdateCallback */
    private java.lang.Runnable f70776xfcfc9508;

    /* renamed from: textureSurface */
    private android.view.Surface f70777x21bacb12;

    public TextureViewSurfaceTextureListenerC28577x96fffc8a(android.content.Context context) {
        super(context);
        this.f70776xfcfc9508 = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: attachToFlutterView */
    public void mo137395x65cf2121(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        this.f70775x25fe639c = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6(c28553x45ef20c1, this);
        c28553x45ef20c1.addView(this, new android.view.ViewGroup.LayoutParams(1, 1));
        setSurfaceTextureListener(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: onNextSurfaceUpdate */
    public void mo137396xf93a2f84(java.lang.Runnable runnable) {
        this.f70776xfcfc9508 = runnable;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.f70777x21bacb12 = surface;
        this.f70775x25fe639c.m137389x2e34b09c(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f70775x25fe639c.m137390xd05ebbec();
        this.f70777x21bacb12.release();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f70775x25fe639c.m137391xf2544486(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Runnable runnable = this.f70776xfcfc9508;
        if (runnable != null) {
            runnable.run();
            this.f70776xfcfc9508 = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: resumeSurface */
    public void mo137397xd9789fc0() {
        this.f70775x25fe639c.m137388xd9789fc0();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: swapSurface */
    public void mo137398x614179a() {
        this.f70775x25fe639c.m137392x614179a();
    }

    public TextureViewSurfaceTextureListenerC28577x96fffc8a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70776xfcfc9508 = null;
    }

    public TextureViewSurfaceTextureListenerC28577x96fffc8a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f70776xfcfc9508 = null;
    }
}
