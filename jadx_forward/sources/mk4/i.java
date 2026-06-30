package mk4;

/* loaded from: classes14.dex */
public final class i implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56 f408693d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56 c18687x1c450e56) {
        this.f408693d = c18687x1c450e56;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56 c18687x1c450e56 = this.f408693d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18687x1c450e56.m71933x23aed0ac(), "onSurfaceTextureAvailable surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + c18687x1c450e56.f256038e);
        c18687x1c450e56.getClass();
        mk4.a aVar = c18687x1c450e56.f256038e;
        if (aVar != null) {
            aVar.c(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56 c18687x1c450e56 = this.f408693d;
        mk4.a aVar = c18687x1c450e56.f256038e;
        boolean a17 = aVar != null ? aVar.a(surface) : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18687x1c450e56.m71933x23aed0ac(), "onSurfaceTextureDestroyed surface:" + surface + " result:" + a17 + " listener:" + c18687x1c450e56.f256038e);
        return a17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56 c18687x1c450e56 = this.f408693d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18687x1c450e56.m71933x23aed0ac(), "onSurfaceTextureSizeChanged surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + c18687x1c450e56.f256038e);
        mk4.a aVar = c18687x1c450e56.f256038e;
        if (aVar != null) {
            aVar.b(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        mk4.a aVar = this.f408693d.f256038e;
        if (aVar != null) {
            aVar.d(surface);
        }
    }
}
