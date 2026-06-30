package cj2;

/* loaded from: classes10.dex */
public final class e implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj2.h f41861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f41862e;

    public e(cj2.h hVar, android.graphics.SurfaceTexture surfaceTexture) {
        this.f41861d = hVar;
        this.f41862e = surfaceTexture;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        cj2.h hVar = this.f41861d;
        hVar.getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = hVar.f41871m;
        if (surfaceTextureListener == null) {
            return true;
        }
        surfaceTextureListener.onSurfaceTextureSizeChanged(this.f41862e, hVar.getWidth(), hVar.getHeight());
        return true;
    }
}
