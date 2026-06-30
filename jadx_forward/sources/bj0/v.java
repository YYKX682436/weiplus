package bj0;

/* loaded from: classes13.dex */
public final class v implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f102669d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f102670e;

    public v(android.view.TextureView.SurfaceTextureListener surfaceTextureListener, android.view.TextureView.SurfaceTextureListener newListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newListener, "newListener");
        this.f102669d = surfaceTextureListener;
        this.f102670e = newListener;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f102669d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surface, i17, i18);
        }
        this.f102670e.onSurfaceTextureAvailable(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f102669d;
        return (surfaceTextureListener != null ? surfaceTextureListener.onSurfaceTextureDestroyed(surface) : true) || this.f102670e.onSurfaceTextureDestroyed(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f102669d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i17, i18);
        }
        this.f102670e.onSurfaceTextureSizeChanged(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f102669d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surface);
        }
        this.f102670e.onSurfaceTextureUpdated(surface);
    }
}
