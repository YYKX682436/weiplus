package bp2;

/* loaded from: classes3.dex */
public final class b implements android.view.TextureView.SurfaceTextureListener {
    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "liveView#onSurfaceTextureAvailable surface:" + surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "liveView#onSurfaceTextureDestroyed surface:" + surface);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "liveView#onSurfaceTextureSizeChanged");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
