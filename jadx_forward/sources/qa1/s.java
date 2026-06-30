package qa1;

/* loaded from: classes10.dex */
public class s extends qa1.h {

    /* renamed from: q, reason: collision with root package name */
    public boolean f442552q;

    /* renamed from: r, reason: collision with root package name */
    public int f442553r;

    /* renamed from: s, reason: collision with root package name */
    public int f442554s;

    /* renamed from: t, reason: collision with root package name */
    public ms0.c f442555t;

    public s(android.content.Context context) {
        super(context);
        this.f442552q = false;
        this.f442553r = 0;
        this.f442554s = 0;
        this.f442555t = null;
    }

    @Override // qa1.h, qa1.u
    /* renamed from: getAbsSurfaceRenderer */
    public ms0.c mo159658xb03c03b4() {
        return this.f442555t;
    }

    @Override // qa1.h, qa1.u
    /* renamed from: getSurfaceHeight */
    public int mo159661xc2fc307e() {
        return this.f442554s;
    }

    @Override // qa1.h, qa1.u
    /* renamed from: getSurfaceWidth */
    public int mo159663x40edc78f() {
        return this.f442553r;
    }

    @Override // android.view.TextureView, qa1.u
    /* renamed from: isAvailable */
    public boolean mo159665x1a7eccbf() {
        return this.f442552q;
    }

    @Override // qa1.h, gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenView", "onSurfaceTextureAvailable, surface:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        try {
            qa1.q qVar = new qa1.q(this, 1, 2);
            this.f442555t = qVar;
            qVar.u(i17, i18);
            this.f442555t.t(i17, i18);
            mo159668xea80abe9(new qa1.r(this, 1, 2, i17, i18));
            synchronized (this) {
                this.f442552q = true;
                this.f442553r = i17;
                this.f442554s = i18;
            }
            super.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenView", "onSurfaceTextureAvailable, error:" + e17.getMessage());
        }
    }

    @Override // qa1.h, gh.k, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenView", "onSurfaceTextureDestroyed, surface:" + surfaceTexture);
        ms0.c cVar = this.f442555t;
        if (cVar != null) {
            cVar.n(true);
        }
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    @Override // qa1.h, gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenView", "onSurfaceTextureSizeChanged, surface:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        super.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
