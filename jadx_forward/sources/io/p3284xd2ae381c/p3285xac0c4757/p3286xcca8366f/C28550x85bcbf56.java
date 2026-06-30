package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterSurfaceView */
/* loaded from: classes15.dex */
public class C28550x85bcbf56 extends android.view.SurfaceView implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 {
    private static final java.lang.String TAG = "FlutterSurfaceView";

    /* renamed from: flutterRenderer */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f70612x5ace00ff;

    /* renamed from: isPaused */
    private boolean f70613xecd98af8;

    /* renamed from: isSurfaceAvailableForRendering */
    private boolean f70614xffa3e4c9;

    /* renamed from: isSurfaceSwapOut */
    private boolean f70615xb8cc5f18;

    /* renamed from: nextSurfaceUpdateCallback */
    private java.lang.Runnable f70616xfcfc9508;

    /* renamed from: renderTransparently */
    private final boolean f70617xe4d41069;

    /* renamed from: surfaceCallback */
    private final android.view.SurfaceHolder.Callback f70618x3ab37412;

    /* renamed from: surfaceHolderCallbackCompat */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520 f70619xbc637d40;

    public C28550x85bcbf56(android.content.Context context) {
        this(context, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: changeSurfaceSize */
    public void m137214xfdfb887e(int i17, int i18) {
        if (this.f70612x5ace00ff == null) {
            throw new java.lang.IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        if (this.f70615xb8cc5f18) {
            io.p3284xd2ae381c.Log.i(TAG, "already swap out this surface, ignore change surface size");
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i17 + " x " + i18);
        this.f70612x5ace00ff.m138051xaa23e147(i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: connectSurfaceToRenderer */
    public void m137215x85a81521() {
        java.lang.Runnable runnable;
        if (this.f70612x5ace00ff == null || getHolder() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        if (this.f70615xb8cc5f18) {
            io.p3284xd2ae381c.Log.i(TAG, "already swap out this surface, not connect to renderer");
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "connectSurfaceToRenderer");
        this.f70612x5ace00ff.m138048x9a9e0888(getHolder().getSurface(), this.f70613xecd98af8);
        if (this.f70615xb8cc5f18 || !this.f70614xffa3e4c9 || (runnable = this.f70616xfcfc9508) == null) {
            return;
        }
        runnable.run();
        this.f70616xfcfc9508 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: disconnectSurfaceFromRenderer */
    public void m137216xec9b299e() {
        if (this.f70612x5ace00ff == null) {
            throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        io.p3284xd2ae381c.Log.i(TAG, "disconnectSurfaceFromRenderer, isSurfaceAvailableForRendering: " + this.f70614xffa3e4c9);
        if (this.f70615xb8cc5f18) {
            io.p3284xd2ae381c.Log.i(TAG, "already swap out this surface, ignore disconnect renderer");
        }
    }

    /* renamed from: init */
    private void m137217x316510() {
        if (this.f70617xe4d41069) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f70619xbc637d40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldNotify */
    public boolean m137219xa92f46dc() {
        return (this.f70612x5ace00ff == null || this.f70613xecd98af8) ? false : true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: attachToRenderer */
    public void mo137189xb6928083(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
        io.p3284xd2ae381c.Log.i(TAG, "Attaching to FlutterRenderer.");
        if (this.f70612x5ace00ff != null) {
            io.p3284xd2ae381c.Log.i(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f70612x5ace00ff.m138050xc19ba428(mo137194x19cc2a81());
        }
        this.f70612x5ace00ff = c28641x1f60b8df;
        this.f70619xbc637d40.m137375x68953482(c28641x1f60b8df);
        mo137201xc84dc82d();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: detachFromRenderer */
    public void mo137191x77fe19c0() {
        io.p3284xd2ae381c.Log.v(TAG, "Detaching from FlutterRenderer.");
        if (this.f70612x5ace00ff == null) {
            io.p3284xd2ae381c.Log.w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            m137216xec9b299e();
        }
        this.f70619xbc637d40.m137376xb423c9ff();
        this.f70612x5ace00ff = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i17 = iArr[0];
        region.op(i17, iArr[1], (getRight() + i17) - getLeft(), (iArr[1] + getBottom()) - getTop(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: getAttachedRenderer */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df mo137192x385aa5fd() {
        return this.f70612x5ace00ff;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: getRenderSurface */
    public android.view.Surface mo137194x19cc2a81() {
        return getHolder().getSurface();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: isAvailableForRendering */
    public boolean mo137196x1f8c622() {
        return this.f70614xffa3e4c9 && getHolder().getSurface() != null;
    }

    /* renamed from: isSurfaceAvailableForRendering */
    public boolean m137220xffa3e4c9() {
        return this.f70614xffa3e4c9;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: markSurfaceIsSwapOut */
    public void mo137197x669ed6f1(boolean z17) {
        java.lang.Runnable runnable;
        io.p3284xd2ae381c.Log.i(TAG, "markSurfaceIsSwapOut:" + z17);
        this.f70615xb8cc5f18 = z17;
        if (z17 || !this.f70614xffa3e4c9 || (runnable = this.f70616xfcfc9508) == null) {
            return;
        }
        runnable.run();
        this.f70616xfcfc9508 = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: onRenderSurfaceNextUpdate */
    public void mo137198x896c3e54(final java.lang.Runnable runnable) {
        if (this.f70615xb8cc5f18 || !this.f70614xffa3e4c9 || runnable == null) {
            this.f70616xfcfc9508 = runnable;
        } else {
            android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: io.flutter.embedding.android.FlutterSurfaceView$$a
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j17) {
                    runnable.run();
                }
            });
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: pause */
    public void mo137199x65825f6() {
        if (this.f70612x5ace00ff == null) {
            io.p3284xd2ae381c.Log.w(TAG, "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f70613xecd98af8 = true;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: resume */
    public void mo137201xc84dc82d() {
        if (this.f70612x5ace00ff == null) {
            io.p3284xd2ae381c.Log.w(TAG, "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f70619xbc637d40.m137377x57429eec();
        if (m137220xffa3e4c9()) {
            io.p3284xd2ae381c.Log.v(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m137215x85a81521();
        }
        this.f70613xecd98af8 = false;
    }

    public C28550x85bcbf56(android.content.Context context, boolean z17) {
        this(context, null, z17);
    }

    public C28550x85bcbf56(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    private C28550x85bcbf56(android.content.Context context, android.util.AttributeSet attributeSet, boolean z17) {
        super(context, attributeSet);
        this.f70614xffa3e4c9 = false;
        this.f70613xecd98af8 = false;
        this.f70615xb8cc5f18 = false;
        this.f70616xfcfc9508 = null;
        android.view.SurfaceHolder.Callback callback = new android.view.SurfaceHolder.Callback() { // from class: io.flutter.embedding.android.FlutterSurfaceView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "SurfaceHolder.Callback.surfaceChanged()");
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.m137219xa92f46dc()) {
                    io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "start dispatch nativeSurfaceChanged");
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.m137214xfdfb887e(i18, i19);
                    io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "end dispatch nativeSurfaceChanged");
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "SurfaceHolder.Callback.startRenderingToSurface()");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.f70614xffa3e4c9 = true;
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.m137219xa92f46dc()) {
                    io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "start dispatch nativeSurfaceCreated");
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.m137215x85a81521();
                    io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "finished dispatch nativeSurfaceCreated");
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "SurfaceHolder.Callback.stopRenderingToSurface()");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.f70614xffa3e4c9 = false;
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.m137219xa92f46dc() && !io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.f70615xb8cc5f18) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.this.m137216xec9b299e();
                }
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56.TAG, "surfaceDestroyed remove all msg");
            }
        };
        this.f70618x3ab37412 = callback;
        this.f70617xe4d41069 = z17;
        this.f70619xbc637d40 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520(callback, this, this.f70612x5ace00ff);
        m137217x316510();
    }
}
