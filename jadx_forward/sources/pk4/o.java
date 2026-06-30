package pk4;

/* loaded from: classes10.dex */
public final class o implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 f438046d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9) {
        this.f438046d = c18691x35cf85c9;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = this.f438046d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18691x35cf85c9.f256076d, "onSurfaceTextureAvailable, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", enableEffect:" + c18691x35cf85c9.f256081i);
        c18691x35cf85c9.f256080h = surface;
        c18691x35cf85c9.getClass();
        c18691x35cf85c9.getClass();
        ((gk4.h0) c18691x35cf85c9.getEffector()).f(i17, i18);
        if (c18691x35cf85c9.f256081i) {
            ((gk4.h0) c18691x35cf85c9.getEffector()).c(surface);
            return;
        }
        c18691x35cf85c9.f256082m = surface;
        android.view.Surface surface2 = c18691x35cf85c9.f256083n;
        if (surface2 != null && surface2 != null) {
            surface2.release();
        }
        c18691x35cf85c9.f256083n = new android.view.Surface(c18691x35cf85c9.f256082m);
        kk4.b player = c18691x35cf85c9.getPlayer();
        if (player != null) {
            ((kk4.v) player).J(c18691x35cf85c9.f256083n, true);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        android.view.Surface surface2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = this.f438046d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18691x35cf85c9.f256076d, "onSurfaceTextureDestroyed, surface:" + surface.hashCode() + ", enableEffect:" + c18691x35cf85c9.f256081i);
        c18691x35cf85c9.f256080h = null;
        if (!c18691x35cf85c9.f256081i && (surface2 = c18691x35cf85c9.f256083n) != null) {
            surface2.release();
        }
        kk4.b player = c18691x35cf85c9.getPlayer();
        if (player == null) {
            return true;
        }
        kk4.b.h(player, null, false, 2, null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = this.f438046d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18691x35cf85c9.f256076d, "onSurfaceTextureSizeChanged, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", layout size:[" + c18691x35cf85c9.getWidth() + ',' + c18691x35cf85c9.getHeight() + ']');
        c18691x35cf85c9.f256080h = surface;
        c18691x35cf85c9.getClass();
        c18691x35cf85c9.getClass();
        ((gk4.h0) c18691x35cf85c9.getEffector()).f(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9.f256075p;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = this.f438046d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749 m71989x3a06c52a = c18691x35cf85c9.m71989x3a06c52a();
        if (m71989x3a06c52a != null) {
            m71989x3a06c52a.setAlpha(1.0f);
        }
        c18691x35cf85c9.f256080h = surface;
    }
}
