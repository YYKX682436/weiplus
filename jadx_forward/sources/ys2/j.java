package ys2;

/* loaded from: classes10.dex */
public final class j implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.o f546700d;

    public j(ys2.o oVar) {
        this.f546700d = oVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        ys2.o oVar = this.f546700d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f546706m, "onSurfaceTextureAvailable");
        kk4.c cVar = oVar.f546712s;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100970x42c875eb(new android.view.Surface(surface));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f546700d.f546706m, "onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f546700d.f546706m, "onSurfaceTextureSizeChanged  width = " + i17 + "  height = " + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
