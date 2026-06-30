package nn0;

/* loaded from: classes14.dex */
public class d implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.h f420090d;

    public d(nn0.h hVar) {
        this.f420090d = hVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        nn0.h hVar = this.f420090d;
        if (hVar.f420113x != null) {
            android.graphics.SurfaceTexture surfaceTexture2 = hVar.f420102m.getSurfaceTexture();
            android.graphics.SurfaceTexture surfaceTexture3 = hVar.f420113x;
            if (surfaceTexture2 != surfaceTexture3) {
                try {
                    hVar.f420102m.setSurfaceTexture(surfaceTexture3);
                    hVar.f420104o = hVar.f420113x;
                    hVar.f420113x = null;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f420096d, "setSurfaceTexture error onSurfacetextureAvailable " + e17);
                    hVar.f420104o = surfaceTexture;
                }
                hVar.f420105p = null;
                hVar.f420106q = null;
                hVar.K = true;
                hVar.u(i17, i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f420096d, "onSurfaceTextureAvailable " + hVar.f420108s + " " + hVar.f420109t);
            }
        }
        hVar.f420104o = surfaceTexture;
        hVar.f420105p = null;
        hVar.f420106q = null;
        hVar.K = true;
        hVar.u(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f420096d, "onSurfaceTextureAvailable " + hVar.f420108s + " " + hVar.f420109t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        nn0.h hVar = this.f420090d;
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
        nn0.h hVar = this.f420090d;
        hVar.u(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f420096d, "onSurfaceTextureSizeChanged " + hVar.f420108s + " " + hVar.f420109t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
