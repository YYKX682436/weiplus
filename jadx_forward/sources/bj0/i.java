package bj0;

/* loaded from: classes11.dex */
public final class i extends bj0.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f102643d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f102644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 f102645f;

    public i(com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263) {
        this.f102645f = c10717xfba6b263;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        io.p3284xd2ae381c.Log.i(this.f102645f.C, "onSurfaceTextureAvailable:" + surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        io.p3284xd2ae381c.Log.i(this.f102645f.C, "onSurfaceTextureDestroyed:" + surface);
        return true;
    }

    @Override // bj0.a, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        boolean z17 = this.f102643d;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f102645f;
        if (!z17) {
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263.a(c10717xfba6b263, bj0.f.f102637d);
            this.f102643d = true;
        }
        if (!c10717xfba6b263.f149680y) {
            c10717xfba6b263.f149680y = true;
            io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "onSurfaceTextureUpdated first called");
        }
        if (c10717xfba6b263.e() && !this.f102644e) {
            io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "onSurfaceTextureUpdated, try switchToSurfaceView");
            c10717xfba6b263.j();
            this.f102644e = true;
        }
        if (c10717xfba6b263.e() || !c10717xfba6b263.f149681z) {
            return;
        }
        io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "onSurfaceTextureUpdated switchToSurfaceViewWaitTextureViewUpdate");
        c10717xfba6b263.j();
    }
}
