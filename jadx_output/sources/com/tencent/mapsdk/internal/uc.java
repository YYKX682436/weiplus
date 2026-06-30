package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class uc extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, com.tencent.mapsdk.internal.bu {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tr f52393a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tq f52394b;

    /* renamed from: c, reason: collision with root package name */
    private android.graphics.SurfaceTexture f52395c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f52396d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f52397e;

    /* renamed from: f, reason: collision with root package name */
    private int f52398f;

    /* renamed from: g, reason: collision with root package name */
    private int f52399g;

    public uc(com.tencent.mapsdk.internal.bd bdVar) {
        super(bdVar.getContext());
        this.f52396d = false;
        this.f52397e = false;
        this.f52393a = (com.tencent.mapsdk.internal.tr) bdVar.d();
        setSurfaceTextureListener(this);
        setOpaque(bdVar.q());
        this.f52394b = new com.tencent.mapsdk.internal.tq(this.f52393a);
        com.tencent.mapsdk.internal.tq.a(bdVar.p());
        this.f52394b.f52164a = bdVar.r();
        this.f52394b.start();
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a() {
        this.f52397e = false;
        if (this.f52395c != null && this.f52396d && getSurfaceTexture() != this.f52395c && isAvailable()) {
            setSurfaceTexture(this.f52395c);
            this.f52396d = false;
        }
        com.tencent.mapsdk.internal.tq tqVar = this.f52394b;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void b() {
        this.f52397e = true;
        com.tencent.mapsdk.internal.tq tqVar = this.f52394b;
        if (tqVar != null) {
            tqVar.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void c() {
        com.tencent.mapsdk.internal.tq tqVar = this.f52394b;
        if (tqVar != null) {
            tqVar.c();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f52395c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f52395c = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void d() {
        com.tencent.mapsdk.internal.tq tqVar = this.f52394b;
        if (tqVar != null) {
            synchronized (tqVar) {
                this.f52394b.notify();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mapsdk.internal.tr trVar = this.f52393a;
        if (trVar == null || !trVar.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final boolean e() {
        return isOpaque();
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final int getMapHeight() {
        int i17 = this.f52399g;
        return i17 > 0 ? i17 : getHeight();
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final int getMapWidth() {
        int i17 = this.f52398f;
        return i17 > 0 ? i17 : getWidth();
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final android.view.View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View, com.tencent.mapsdk.internal.bu
    public final void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f52398f = i17;
        this.f52399g = i18;
        com.tencent.mapsdk.internal.tr trVar = this.f52393a;
        if (trVar != null) {
            trVar.e(i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f52395c = surfaceTexture;
        a(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f52396d = true;
        return !this.f52397e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mapsdk.internal.tr trVar = this.f52393a;
        if (trVar != null) {
            trVar.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
            com.tencent.mapsdk.internal.tq tqVar = this.f52394b;
            if (tqVar != null) {
                tqVar.d();
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setMapOpaque(boolean z17) {
        if (this.f52393a != null) {
            setOpaque(z17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setZOrderMediaOverlay(boolean z17) {
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(java.lang.Object obj, int i17, int i18) {
        this.f52394b.a(obj);
        this.f52398f = i17;
        this.f52399g = i18;
        com.tencent.mapsdk.internal.tr trVar = this.f52393a;
        if (trVar != null) {
            trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
            this.f52393a.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(float f17) {
        if (this.f52394b != null) {
            com.tencent.mapsdk.internal.tq.a(f17);
        }
    }
}
