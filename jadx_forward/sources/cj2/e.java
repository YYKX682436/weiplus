package cj2;

/* loaded from: classes10.dex */
public final class e implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj2.h f123394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f123395e;

    public e(cj2.h hVar, android.graphics.SurfaceTexture surfaceTexture) {
        this.f123394d = hVar;
        this.f123395e = surfaceTexture;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        cj2.h hVar = this.f123394d;
        hVar.getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = hVar.f123404m;
        if (surfaceTextureListener == null) {
            return true;
        }
        surfaceTextureListener.onSurfaceTextureSizeChanged(this.f123395e, hVar.getWidth(), hVar.getHeight());
        return true;
    }
}
