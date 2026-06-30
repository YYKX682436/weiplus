package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterTextureView */
/* loaded from: classes15.dex */
public class C28552x398ac0c4 extends android.view.TextureView implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 {
    private static final java.lang.String TAG = "FlutterTextureView";

    /* renamed from: flutterRenderer */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f70621x5ace00ff;

    /* renamed from: isPaused */
    private boolean f70622xecd98af8;

    /* renamed from: isSetExternalSurfaceTexture */
    private boolean f70623x1932d51;

    /* renamed from: isSurfaceAvailableForRendering */
    private boolean f70624xffa3e4c9;

    /* renamed from: isSurfaceSwapOut */
    private boolean f70625xb8cc5f18;

    /* renamed from: nextTextureUpdateCallback */
    private java.lang.Runnable f70626xa64224f6;

    /* renamed from: renderSurface */
    private android.view.Surface f70627x5c6c6e37;

    /* renamed from: surfaceTextureListener */
    private final android.view.TextureView.SurfaceTextureListener f70628x7e2dee82;

    public C28552x398ac0c4(android.content.Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: changeSurfaceSize */
    public void m137232xfdfb887e(int i17, int i18) {
        if (this.f70621x5ace00ff == null) {
            throw new java.lang.IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        if (this.f70625xb8cc5f18) {
            io.p3284xd2ae381c.Log.i(TAG, "already swap out this surface, ignore change surface size");
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i17 + " x " + i18);
        this.f70621x5ace00ff.m138051xaa23e147(i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: connectSurfaceToRenderer */
    public void m137233x85a81521() {
        if (this.f70621x5ace00ff == null || getSurfaceTexture() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        if (this.f70625xb8cc5f18) {
            io.p3284xd2ae381c.Log.i(TAG, "already swap out this surface, not connect to renderer");
            return;
        }
        android.view.Surface surface = this.f70627x5c6c6e37;
        if (surface != null) {
            surface.release();
            this.f70627x5c6c6e37 = null;
        }
        this.f70627x5c6c6e37 = new android.view.Surface(getSurfaceTexture());
        io.p3284xd2ae381c.Log.i(TAG, "connectSurfaceToRenderer, renderSurface:" + this.f70627x5c6c6e37 + ", isSetExternalSurfaceTexture:" + this.f70623x1932d51);
        if (this.f70623x1932d51) {
            return;
        }
        this.f70621x5ace00ff.m138048x9a9e0888(this.f70627x5c6c6e37, this.f70622xecd98af8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: disconnectSurfaceFromRenderer */
    public void m137234xec9b299e() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df = this.f70621x5ace00ff;
        if (c28641x1f60b8df == null) {
            throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        if (this.f70625xb8cc5f18) {
            io.p3284xd2ae381c.Log.i(TAG, "already swap out this surface, ignore disconnect renderer");
            return;
        }
        c28641x1f60b8df.m138050xc19ba428(mo137194x19cc2a81());
        android.view.Surface surface = this.f70627x5c6c6e37;
        if (surface != null) {
            surface.release();
            this.f70627x5c6c6e37 = null;
        }
    }

    /* renamed from: init */
    private void m137235x316510() {
        setSurfaceTextureListener(this.f70628x7e2dee82);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldNotify */
    public boolean m137236xa92f46dc() {
        return (this.f70621x5ace00ff == null || this.f70622xecd98af8) ? false : true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: attachToRenderer */
    public void mo137189xb6928083(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
        io.p3284xd2ae381c.Log.i(TAG, "Attaching to FlutterRenderer.");
        if (this.f70621x5ace00ff != null) {
            io.p3284xd2ae381c.Log.i(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f70621x5ace00ff.m138050xc19ba428(mo137194x19cc2a81());
        }
        this.f70621x5ace00ff = c28641x1f60b8df;
        mo137201xc84dc82d();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: detachFromRenderer */
    public void mo137191x77fe19c0() {
        if (this.f70621x5ace00ff == null) {
            io.p3284xd2ae381c.Log.w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.p3284xd2ae381c.Log.i(TAG, "Disconnecting FlutterRenderer from Android surface.");
            m137234xec9b299e();
        }
        this.f70621x5ace00ff = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: getAttachedRenderer */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df mo137192x385aa5fd() {
        return this.f70621x5ace00ff;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: getRenderSurface */
    public android.view.Surface mo137194x19cc2a81() {
        return this.f70627x5c6c6e37;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: isAvailableForRendering */
    public boolean mo137196x1f8c622() {
        return this.f70624xffa3e4c9 && this.f70627x5c6c6e37 != null;
    }

    /* renamed from: isSurfaceAvailableForRendering */
    public boolean m137237xffa3e4c9() {
        return this.f70624xffa3e4c9;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: markSurfaceIsSwapOut */
    public void mo137197x669ed6f1(boolean z17) {
        io.p3284xd2ae381c.Log.i(TAG, "markSurfaceIsSwapOut:" + z17);
        this.f70625xb8cc5f18 = z17;
        if (z17) {
            this.f70626xa64224f6 = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: onRenderSurfaceNextUpdate */
    public void mo137198x896c3e54(java.lang.Runnable runnable) {
        this.f70626xa64224f6 = runnable;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: pause */
    public void mo137199x65825f6() {
        if (this.f70621x5ace00ff == null) {
            io.p3284xd2ae381c.Log.w(TAG, "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f70622xecd98af8 = true;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: resume */
    public void mo137201xc84dc82d() {
        if (this.f70621x5ace00ff == null) {
            io.p3284xd2ae381c.Log.w(TAG, "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (m137237xffa3e4c9()) {
            io.p3284xd2ae381c.Log.i(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m137233x85a81521();
        }
        this.f70622xecd98af8 = false;
    }

    /* renamed from: setRenderSurface */
    public void m137238xaca290f5(android.view.Surface surface) {
        io.p3284xd2ae381c.Log.i(TAG, "setRenderSurface:" + surface);
        this.f70627x5c6c6e37 = surface;
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
        io.p3284xd2ae381c.Log.i(TAG, "setSurfaceTexture:" + surfaceTexture + ", isAttachedToFlutterRenderer:" + m137236xa92f46dc());
        this.f70624xffa3e4c9 = true;
        this.f70623x1932d51 = true;
        if (m137236xa92f46dc()) {
            m137233x85a81521();
        }
    }

    public C28552x398ac0c4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70624xffa3e4c9 = false;
        this.f70622xecd98af8 = false;
        this.f70625xb8cc5f18 = false;
        this.f70626xa64224f6 = null;
        this.f70623x1932d51 = false;
        this.f70628x7e2dee82 = new android.view.TextureView.SurfaceTextureListener() { // from class: io.flutter.embedding.android.FlutterTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70624xffa3e4c9 = true;
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.m137236xa92f46dc()) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.m137233x85a81521();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.TAG, "SurfaceTextureListener.onSurfaceTextureDestroyed()");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70624xffa3e4c9 = false;
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.m137236xa92f46dc()) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.m137234xec9b299e();
                }
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70627x5c6c6e37 != null) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70627x5c6c6e37.release();
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70627x5c6c6e37 = null;
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70623x1932d51 = false;
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.m137236xa92f46dc()) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.m137232xfdfb887e(i17, i18);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70625xb8cc5f18 || io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70626xa64224f6 == null) {
                    return;
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70626xa64224f6.run();
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4.this.f70626xa64224f6 = null;
            }
        };
        m137235x316510();
    }
}
