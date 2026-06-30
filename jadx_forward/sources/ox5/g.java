package ox5;

/* loaded from: classes14.dex */
public class g implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView.SurfaceTextureListener f431344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 f431345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox5.a f431346f;

    public g(ox5.a aVar, android.view.TextureView.SurfaceTextureListener surfaceTextureListener, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4) {
        this.f431346f = aVar;
        this.f431344d = surfaceTextureListener;
        this.f431345e = c28552x398ac0c4;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f431344d.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        return this.f431344d.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f431344d.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f431344d.onSurfaceTextureUpdated(surfaceTexture);
        this.f431346f.f431328d.postOnAnimation(new ox5.f(this));
    }
}
