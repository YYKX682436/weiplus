package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.SurfaceHolderCallbackCompat */
/* loaded from: classes15.dex */
public class SurfaceHolderCallback2C28569x92416520 implements android.view.SurfaceHolder.Callback2 {
    private static final java.lang.String TAG = "SurfaceHolderCallbackCompat";

    /* renamed from: alphaCallback */
    final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 f70751x27fff7c3 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.SurfaceHolderCallbackCompat.1
        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
        /* renamed from: onFlutterUiDisplayed */
        public void mo2121x6c956b30() {
            io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.TAG, "onFlutterUiDisplayed()");
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70753x17f90336.setAlpha(1.0f);
            if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff != null) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff.m138037x4c436f6(this);
            }
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
        /* renamed from: onFlutterUiNoLongerDisplayed */
        public void mo2122xb9179606() {
        }
    };

    /* renamed from: flutterRenderer */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f70752x5ace00ff;

    /* renamed from: flutterSurfaceView */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 f70753x17f90336;

    /* renamed from: innerCallback */
    private final android.view.SurfaceHolder.Callback f70754x7d611cbb;

    /* renamed from: lifecycleCallback */
    final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback f70755x721061cf;

    /* renamed from: shouldSetAlpha */
    private final boolean f70756xeaf88ef;

    /* renamed from: io.flutter.embedding.android.SurfaceHolderCallbackCompat$FlutterRendererLifecycleCallback */
    /* loaded from: classes15.dex */
    public interface FlutterRendererLifecycleCallback {
        /* renamed from: onAttachToRenderer */
        void mo137378x68953482(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df);

        /* renamed from: onDetachFromRenderer */
        void mo137379xb423c9ff();

        /* renamed from: onResume */
        void mo137380x57429eec();
    }

    /* renamed from: io.flutter.embedding.android.SurfaceHolderCallbackCompat$FlutterRendererLifecycleCallbackApi26AndUp */
    /* loaded from: classes15.dex */
    public class FlutterRendererLifecycleCallbackApi26AndUp implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback {
        public FlutterRendererLifecycleCallbackApi26AndUp() {
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback
        /* renamed from: onAttachToRenderer */
        public void mo137378x68953482(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff = c28641x1f60b8df;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback
        /* renamed from: onDetachFromRenderer */
        public void mo137379xb423c9ff() {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff = null;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback
        /* renamed from: onResume */
        public void mo137380x57429eec() {
        }
    }

    /* renamed from: io.flutter.embedding.android.SurfaceHolderCallbackCompat$FlutterRendererLifecycleCallbackPreApi26 */
    /* loaded from: classes15.dex */
    public class FlutterRendererLifecycleCallbackPreApi26 implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback {
        public FlutterRendererLifecycleCallbackPreApi26() {
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback
        /* renamed from: onAttachToRenderer */
        public void mo137378x68953482(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
            if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff != null) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff.m138037x4c436f6(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70751x27fff7c3);
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff = c28641x1f60b8df;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback
        /* renamed from: onDetachFromRenderer */
        public void mo137379xb423c9ff() {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70753x17f90336.setAlpha(0.0f);
            if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff != null) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff.m138037x4c436f6(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70751x27fff7c3);
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff = null;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallback
        /* renamed from: onResume */
        public void mo137380x57429eec() {
            if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff != null) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff.m138017x9a2d27f9(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70751x27fff7c3);
            }
        }
    }

    public SurfaceHolderCallback2C28569x92416520(android.view.SurfaceHolder.Callback callback, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
        boolean z17 = android.os.Build.VERSION.SDK_INT < 26;
        this.f70756xeaf88ef = z17;
        this.f70755x721061cf = z17 ? new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallbackPreApi26() : new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.FlutterRendererLifecycleCallbackApi26AndUp();
        this.f70754x7d611cbb = callback;
        this.f70752x5ace00ff = c28641x1f60b8df;
        this.f70753x17f90336 = c28550x85bcbf56;
        io.p3284xd2ae381c.Log.v(TAG, "SurfaceHolderCallbackCompat()");
        if (z17) {
            c28550x85bcbf56.setAlpha(0.0f);
        }
    }

    /* renamed from: onAttachToRenderer */
    public void m137375x68953482(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
        this.f70755x721061cf.mo137378x68953482(c28641x1f60b8df);
    }

    /* renamed from: onDetachFromRenderer */
    public void m137376xb423c9ff() {
        this.f70755x721061cf.mo137379xb423c9ff();
    }

    /* renamed from: onResume */
    public void m137377x57429eec() {
        this.f70755x721061cf.mo137380x57429eec();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        android.view.SurfaceHolder.Callback callback = this.f70754x7d611cbb;
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i17, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        android.view.SurfaceHolder.Callback callback = this.f70754x7d611cbb;
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        android.view.SurfaceHolder.Callback callback = this.f70754x7d611cbb;
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
        io.p3284xd2ae381c.Log.v(TAG, "SurfaceHolder.Callback2.surfaceRedrawNeeded()");
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(android.view.SurfaceHolder surfaceHolder, final java.lang.Runnable runnable) {
        io.p3284xd2ae381c.Log.v(TAG, "SurfaceHolder.Callback2.surfaceRedrawNeededAsync()");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df = this.f70752x5ace00ff;
        if (c28641x1f60b8df == null) {
            return;
        }
        c28641x1f60b8df.m138017x9a2d27f9(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.SurfaceHolderCallbackCompat.2
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                runnable.run();
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff != null) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallback2C28569x92416520.this.f70752x5ace00ff.m138037x4c436f6(this);
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
            }
        });
    }
}
