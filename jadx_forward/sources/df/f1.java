package df;

/* loaded from: classes13.dex */
public final class f1 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f310988d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f310989e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f310990f;

    public f1(android.view.TextureView.SurfaceTextureListener surfaceTextureListener, android.view.TextureView.SurfaceTextureListener newListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newListener, "newListener");
        this.f310988d = surfaceTextureListener;
        this.f310989e = newListener;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f310988d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surface, i17, i18);
        }
        this.f310989e.onSurfaceTextureAvailable(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        boolean z17 = this.f310990f;
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f310989e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineSurfaceTextureListenerWrap", " skipTextureDestroyed=true ,can reuse SurfaceTexture again", new java.lang.Object[0]);
            this.f310990f = false;
            return surfaceTextureListener.onSurfaceTextureDestroyed(surface);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineSurfaceTextureListenerWrap", " skipTextureDestroyed=false ,can;t reuse SurfaceTexture again", new java.lang.Object[0]);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f310988d;
        return (surfaceTextureListener2 != null ? surfaceTextureListener2.onSurfaceTextureDestroyed(surface) : true) || surfaceTextureListener.onSurfaceTextureDestroyed(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f310988d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i17, i18);
        }
        this.f310989e.onSurfaceTextureSizeChanged(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f310988d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surface);
        }
        this.f310989e.onSurfaceTextureUpdated(surface);
    }
}
