package nn0;

/* loaded from: classes14.dex */
public class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.h f420093d;

    public e(nn0.h hVar) {
        this.f420093d = hVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        nn0.h hVar = this.f420093d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f420096d, "onSurfaceTextureAvailable " + hVar.f420108s + " " + hVar.f420109t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        nn0.h hVar = this.f420093d;
        if (hVar.f420114y) {
            hVar.f420113x = surfaceTexture;
        } else {
            if (surfaceTexture == hVar.f420113x) {
                hVar.f420113x = null;
            }
            hVar.f420104o = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f420096d, "onSurfaceTextureDestroyed");
        return hVar.f420113x == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        nn0.h hVar = this.f420093d;
        hVar.u(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f420096d, "onSurfaceTextureSizeChanged " + hVar.f420108s + " " + hVar.f420109t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420093d.f420096d, "onSurfaceTextureUpdated");
    }
}
