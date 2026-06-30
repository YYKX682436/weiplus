package pk4;

/* loaded from: classes15.dex */
public final class b1 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public long f437997d = -1;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f437998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 f437999f;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349) {
        this.f437999f = c18696xc5bcd349;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437999f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "onSurfaceTextureAvailable： " + surfaceTexture + '(' + i17 + " x " + i18 + ')');
        android.view.Surface surface = this.f437998e;
        if (surface != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c18696xc5bcd349.f256129h, "surface is already valid");
            return;
        }
        if (surface != null) {
            surface.release();
        }
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        this.f437998e = surface2;
        kk4.c cVar = c18696xc5bcd349.f256130i;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100971x42c875eb(surface2, 1);
        }
        c18696xc5bcd349.f256137s = false;
        c18696xc5bcd349.o();
        java.lang.Double d17 = c18696xc5bcd349.f256133o;
        if (d17 != null) {
            c18696xc5bcd349.a(d17.doubleValue(), c18696xc5bcd349.f256132n);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437999f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c18696xc5bcd349.f256129h, "onSurfaceTextureDestroyed");
        android.view.Surface surface = this.f437998e;
        if (surface != null) {
            surface.release();
        }
        this.f437998e = null;
        c18696xc5bcd349.f256137s = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437999f.f256129h, "onSurfaceTextureSizeChanged: " + i17 + " x " + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f437997d = surface.getTimestamp();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437999f;
        yz5.a aVar = c18696xc5bcd349.f256135q.f438059c;
        if (aVar != null) {
            aVar.mo152xb9724478();
            c18696xc5bcd349.f256135q.f438059c = null;
        }
    }
}
