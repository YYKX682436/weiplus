package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class p7 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 f273371d;

    public p7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4) {
        this.f273371d = c19745xad58a1a4;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f273371d.F(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f273371d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c19745xad58a1a4.f272981h, "onSurfaceTextureDestroyed %d surface[%d] destroyed ", java.lang.Integer.valueOf(c19745xad58a1a4.hashCode()), java.lang.Integer.valueOf(surfaceTexture.hashCode()));
        c19745xad58a1a4.I(c19745xad58a1a4.f272990t);
        c19745xad58a1a4.f272990t = null;
        c19745xad58a1a4.D = false;
        c19745xad58a1a4.E = false;
        if (c19745xad58a1a4.f272983m == null) {
            c19745xad58a1a4.D = false;
        } else if (c19745xad58a1a4.mo69311xc00617a4()) {
            c19745xad58a1a4.D = true;
            c19745xad58a1a4.f272983m.mo158541x65825f6();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f273371d;
        java.lang.String str = c19745xad58a1a4.f272981h;
        surfaceTexture.hashCode();
        c19745xad58a1a4.J();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f273371d.G(surfaceTexture);
    }
}
