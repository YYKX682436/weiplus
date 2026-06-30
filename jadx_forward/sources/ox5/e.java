package ox5;

/* loaded from: classes14.dex */
public class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView.SurfaceTextureListener f431340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f431341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f431342f;

    public e(ox5.c cVar, android.view.TextureView.SurfaceTextureListener surfaceTextureListener, boolean z17, android.view.TextureView textureView) {
        this.f431340d = surfaceTextureListener;
        this.f431341e = z17;
        this.f431342f = textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f431340d;
        if (surfaceTextureListener == null || this.f431341e) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f431340d;
        if (surfaceTextureListener == null || this.f431341e) {
            return true;
        }
        return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f431340d;
        if (surfaceTextureListener == null || this.f431341e) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f431340d;
        if (surfaceTextureListener != null && !this.f431341e) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        this.f431342f.postOnAnimation(new ox5.d(this));
    }
}
