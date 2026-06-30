package qk4;

/* loaded from: classes10.dex */
public final class c implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 f445971d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806) {
        this.f445971d = c18698xd8450806;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806 = this.f445971d;
        java.lang.String tag = c18698xd8450806.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSurfaceTextureAvailable, surface:");
        android.view.Surface surface = c18698xd8450806.getSurface();
        sb6.append(surface != null ? surface.hashCode() : 0);
        sb6.append(", width:");
        sb6.append(i17);
        sb6.append(", height:");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        c18698xd8450806.m72050x588fab4c(new android.view.Surface(surfaceTexture));
        kk4.v player = c18698xd8450806.getPlayer();
        if (player != null) {
            player.J(c18698xd8450806.getSurface(), true);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806 = this.f445971d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18698xd8450806.getTAG(), "onSurfaceTextureDestroyed, surface:" + surface.hashCode());
        kk4.v player = c18698xd8450806.getPlayer();
        if (player == null) {
            return true;
        }
        kk4.b.h(player, null, false, 2, null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806 = this.f445971d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18698xd8450806.getTAG(), "onSurfaceTextureSizeChanged, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", layout size:[" + c18698xd8450806.getWidth() + ',' + c18698xd8450806.getHeight() + ']');
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749 c18693x84c11749 = this.f445971d.textureView;
        if (c18693x84c11749 == null) {
            return;
        }
        c18693x84c11749.setAlpha(1.0f);
    }
}
