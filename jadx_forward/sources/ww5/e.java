package ww5;

/* loaded from: classes8.dex */
public final class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final long f531933d;

    /* renamed from: e, reason: collision with root package name */
    public final vw5.c f531934e;

    public e(long j17, vw5.c delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f531933d = j17;
        this.f531934e = delegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        ((com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd.C27732x57207a66) this.f531934e).b(this.f531933d, new android.view.Surface(surface));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        ((com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd.C27732x57207a66) this.f531934e).c(this.f531933d);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        ((com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd.C27732x57207a66) this.f531934e).a(this.f531933d, 0, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
