package pn0;

/* loaded from: classes14.dex */
public class f implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn0.h f438486d;

    public f(pn0.h hVar) {
        this.f438486d = hVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        pn0.h hVar = this.f438486d;
        android.graphics.SurfaceTexture Da = hVar.f438479j.Da();
        if (Da == null || hVar.f438489m.getSurfaceTexture() == Da) {
            hVar.f438490n = surfaceTexture;
        } else {
            try {
                hVar.f438489m.setSurfaceTexture(Da);
                hVar.f438490n = Da;
                hVar.f438479j.v3(null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f438488l, "setSurfaceTexture error onSurfacetextureAvailable " + e17);
                hVar.f438490n = surfaceTexture;
            }
        }
        hVar.f438477h = true;
        hVar.u(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f438488l, "onSurfaceTextureAvailable surfaceTexture = " + surfaceTexture + " " + hVar.f438470a + " " + hVar.f438471b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        pn0.h hVar = this.f438486d;
        if (hVar.f438491o) {
            hVar.f438479j.v3(surfaceTexture);
        } else {
            if (surfaceTexture == hVar.f438479j.Da()) {
                hVar.f438479j.v3(null);
            }
            hVar.f438490n = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f438488l, "onSurfaceTextureDestroyed mSaveSurfaceTexture = " + hVar.f438479j.Da());
        return hVar.f438479j.Da() == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        pn0.h hVar = this.f438486d;
        hVar.u(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f438488l, "onSurfaceTextureSizeChanged " + surfaceTexture + " " + hVar.f438470a + " " + hVar.f438471b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
