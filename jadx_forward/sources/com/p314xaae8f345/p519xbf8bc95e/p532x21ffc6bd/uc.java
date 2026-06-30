package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class uc extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f133926a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq f133927b;

    /* renamed from: c, reason: collision with root package name */
    private android.graphics.SurfaceTexture f133928c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f133929d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f133930e;

    /* renamed from: f, reason: collision with root package name */
    private int f133931f;

    /* renamed from: g, reason: collision with root package name */
    private int f133932g;

    public uc(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        super(bdVar.mo36630x76847179());
        this.f133929d = false;
        this.f133930e = false;
        this.f133926a = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d();
        setSurfaceTextureListener(this);
        setOpaque(bdVar.q());
        this.f133927b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq(this.f133926a);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq.a(bdVar.p());
        this.f133927b.f133697a = bdVar.r();
        this.f133927b.start();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a() {
        this.f133930e = false;
        if (this.f133928c != null && this.f133929d && getSurfaceTexture() != this.f133928c && isAvailable()) {
            setSurfaceTexture(this.f133928c);
            this.f133929d = false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133927b;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void b() {
        this.f133930e = true;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133927b;
        if (tqVar != null) {
            tqVar.a();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133927b;
        if (tqVar != null) {
            tqVar.c();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f133928c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f133928c = null;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133927b;
        if (tqVar != null) {
            synchronized (tqVar) {
                this.f133927b.notify();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133926a;
        if (trVar == null || !trVar.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final boolean e() {
        return isOpaque();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getMapHeight */
    public final int mo36661x223a1eed() {
        int i17 = this.f133932g;
        return i17 > 0 ? i17 : getHeight();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getMapWidth */
    public final int mo36662x8610cf40() {
        int i17 = this.f133931f;
        return i17 > 0 ? i17 : getWidth();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getView */
    public final android.view.View mo36663xfb86a31b() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f133931f = i17;
        this.f133932g = i18;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133926a;
        if (trVar != null) {
            trVar.e(i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f133928c = surfaceTexture;
        a(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f133929d = true;
        return !this.f133930e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133926a;
        if (trVar != null) {
            trVar.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133927b;
            if (tqVar != null) {
                tqVar.d();
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: setMapOpaque */
    public final void mo36664x8b17525b(boolean z17) {
        if (this.f133926a != null) {
            setOpaque(z17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: setZOrderMediaOverlay */
    public final void mo36665xe5e6c0e2(boolean z17) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a(java.lang.Object obj, int i17, int i18) {
        this.f133927b.a(obj);
        this.f133931f = i17;
        this.f133932g = i18;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133926a;
        if (trVar != null) {
            trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
            this.f133926a.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a(float f17) {
        if (this.f133927b != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq.a(f17);
        }
    }
}
