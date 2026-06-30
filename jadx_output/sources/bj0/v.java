package bj0;

/* loaded from: classes13.dex */
public final class v implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f21136d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f21137e;

    public v(android.view.TextureView.SurfaceTextureListener surfaceTextureListener, android.view.TextureView.SurfaceTextureListener newListener) {
        kotlin.jvm.internal.o.g(newListener, "newListener");
        this.f21136d = surfaceTextureListener;
        this.f21137e = newListener;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f21136d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surface, i17, i18);
        }
        this.f21137e.onSurfaceTextureAvailable(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f21136d;
        return (surfaceTextureListener != null ? surfaceTextureListener.onSurfaceTextureDestroyed(surface) : true) || this.f21137e.onSurfaceTextureDestroyed(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f21136d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i17, i18);
        }
        this.f21137e.onSurfaceTextureSizeChanged(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f21136d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surface);
        }
        this.f21137e.onSurfaceTextureUpdated(surface);
    }
}
