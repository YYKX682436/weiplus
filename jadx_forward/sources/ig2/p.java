package ig2;

/* loaded from: classes3.dex */
public class p implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f372945d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f372946e;

    public p(java.lang.String source, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f372945d = source;
        this.f372946e = z17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FluentSwitchTextureView", this.f372945d + " onSurfaceTextureAvailable surface:" + surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FluentSwitchTextureView", this.f372945d + " onSurfaceTextureDestroyed surface:" + surface);
        return this.f372946e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FluentSwitchTextureView", this.f372945d + " onSurfaceTextureSizeChanged surface:" + surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
