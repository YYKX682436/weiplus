package pk4;

/* loaded from: classes10.dex */
public final class f implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c f438011d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c) {
        this.f438011d = c18689xd498e45c;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438011d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18689xd498e45c.f256045d, "onSurfaceTextureAvailable, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", enableEffect:" + c18689xd498e45c.f256056r);
        c18689xd498e45c.f256055q = surface;
        c18689xd498e45c.getEffector().f(i17, i18);
        if (c18689xd498e45c.f256056r) {
            c18689xd498e45c.getEffector().c(surface);
            return;
        }
        c18689xd498e45c.f256057s = surface;
        android.view.Surface surface2 = c18689xd498e45c.f256058t;
        if (surface2 != null && surface2 != null) {
            surface2.release();
        }
        c18689xd498e45c.f256058t = new android.view.Surface(c18689xd498e45c.f256057s);
        kk4.v currentPlayer = c18689xd498e45c.getCurrentPlayer();
        if (currentPlayer != null) {
            currentPlayer.J(c18689xd498e45c.f256058t, true);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        android.view.Surface surface2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438011d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18689xd498e45c.f256045d, "onSurfaceTextureDestroyed, surface:" + surface.hashCode() + ' ' + c18689xd498e45c.c());
        c18689xd498e45c.f256055q = null;
        if (!c18689xd498e45c.f256056r && (surface2 = c18689xd498e45c.f256058t) != null) {
            surface2.release();
        }
        kk4.v currentPlayer = c18689xd498e45c.getCurrentPlayer();
        if (currentPlayer == null) {
            return true;
        }
        kk4.b.h(currentPlayer, null, false, 2, null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438011d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18689xd498e45c.f256045d, "onSurfaceTextureSizeChanged " + surface + ", size:[" + i17 + ',' + i18 + ']');
        c18689xd498e45c.f256055q = surface;
        c18689xd498e45c.getEffector().f(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438011d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749 c18693x84c11749 = c18689xd498e45c.textureView;
        if (c18693x84c11749 != null) {
            c18693x84c11749.setAlpha(1.0f);
        }
        c18689xd498e45c.f256055q = surface;
    }
}
