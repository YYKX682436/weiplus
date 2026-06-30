package androidx.camera.core.processing.concurrent;

/* loaded from: classes14.dex */
public class DualSurfaceProcessor implements androidx.camera.core.processing.SurfaceProcessorInternal, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "DualSurfaceProcessor";
    private final java.util.concurrent.Executor mGlExecutor;
    final android.os.Handler mGlHandler;
    private final androidx.camera.core.processing.concurrent.DualOpenGlRenderer mGlRenderer;
    final android.os.HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final java.util.concurrent.atomic.AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> mOutputSurfaces;
    private android.graphics.SurfaceTexture mPrimarySurfaceTexture;
    private android.graphics.SurfaceTexture mSecondarySurfaceTexture;

    /* loaded from: classes14.dex */
    public static class Factory {
        private static yz5.q sSupplier = new androidx.camera.core.processing.concurrent.DualSurfaceProcessor$Factory$$a();

        private Factory() {
        }

        public static androidx.camera.core.processing.SurfaceProcessorInternal newInstance(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.LayoutSettings layoutSettings, androidx.camera.core.LayoutSettings layoutSettings2) {
            return (androidx.camera.core.processing.SurfaceProcessorInternal) sSupplier.invoke(dynamicRange, layoutSettings, layoutSettings2);
        }

        public static void setSupplier(yz5.q qVar) {
            sSupplier = qVar;
        }
    }

    public DualSurfaceProcessor(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.LayoutSettings layoutSettings, androidx.camera.core.LayoutSettings layoutSettings2) {
        this(dynamicRange, java.util.Collections.emptyMap(), layoutSettings, layoutSettings2);
    }

    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            java.util.Iterator<androidx.camera.core.SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    private void executeSafely(java.lang.Runnable runnable) {
        executeSafely(runnable, new androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$h());
    }

    private void initGlRenderer(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        try {
            ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$g
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$initGlRenderer$6;
                    lambda$initGlRenderer$6 = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$initGlRenderer$6(dynamicRange, map, kVar);
                    return lambda$initGlRenderer$6;
                }
            })).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            e = e17;
            if (e instanceof java.util.concurrent.ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof java.lang.RuntimeException)) {
                throw new java.lang.IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((java.lang.RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$executeSafely$7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeSafely$8(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        if (this.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGlRenderer$5(androidx.camera.core.DynamicRange dynamicRange, java.util.Map map, t2.k kVar) {
        try {
            this.mGlRenderer.init(dynamicRange, map);
            kVar.a(null);
        } catch (java.lang.RuntimeException e17) {
            kVar.b(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$initGlRenderer$6(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map map, final t2.k kVar) {
        executeSafely(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$initGlRenderer$5(dynamicRange, map, kVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$0(android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, androidx.camera.core.SurfaceRequest.Result result) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.mInputSurfaceCount--;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$1(androidx.camera.core.SurfaceRequest surfaceRequest) {
        this.mInputSurfaceCount++;
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.mGlRenderer.getTextureName(surfaceRequest.isPrimary()));
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, this.mGlExecutor, new m3.a() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$e
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$onInputSurface$0(surfaceTexture, surface, (androidx.camera.core.SurfaceRequest.Result) obj);
            }
        });
        if (surfaceRequest.isPrimary()) {
            this.mPrimarySurfaceTexture = surfaceTexture;
        } else {
            this.mSecondarySurfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.mGlHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$2(androidx.camera.core.SurfaceOutput surfaceOutput, androidx.camera.core.SurfaceOutput.Event event) {
        surfaceOutput.close();
        android.view.Surface remove = this.mOutputSurfaces.remove(surfaceOutput);
        if (remove != null) {
            this.mGlRenderer.unregisterOutputSurface(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$3(final androidx.camera.core.SurfaceOutput surfaceOutput) {
        android.view.Surface surface = surfaceOutput.getSurface(this.mGlExecutor, new m3.a() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$c
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$onOutputSurface$2(surfaceOutput, (androidx.camera.core.SurfaceOutput.Event) obj);
            }
        });
        this.mGlRenderer.registerOutputSurface(surface);
        this.mOutputSurfaces.put(surfaceOutput, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$4() {
        this.mIsReleased = true;
        checkReadyToRelease();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2;
        if (this.mIsReleaseRequested.get() || (surfaceTexture2 = this.mPrimarySurfaceTexture) == null || this.mSecondarySurfaceTexture == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.mSecondarySurfaceTexture.updateTexImage();
        for (java.util.Map.Entry<androidx.camera.core.SurfaceOutput, android.view.Surface> entry : this.mOutputSurfaces.entrySet()) {
            android.view.Surface value = entry.getValue();
            androidx.camera.core.SurfaceOutput key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), value, key, this.mPrimarySurfaceTexture, this.mSecondarySurfaceTexture);
                } catch (java.lang.RuntimeException e17) {
                    androidx.camera.core.Logger.e(TAG, "Failed to render with OpenGL.", e17);
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final androidx.camera.core.SurfaceRequest surfaceRequest) {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$onInputSurface$1(surfaceRequest);
            }
        };
        java.util.Objects.requireNonNull(surfaceRequest);
        executeSafely(runnable, new androidx.camera.core.processing.DefaultSurfaceProcessor$$k(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final androidx.camera.core.SurfaceOutput surfaceOutput) {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$d
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$onOutputSurface$3(surfaceOutput);
            }
        };
        java.util.Objects.requireNonNull(surfaceOutput);
        executeSafely(runnable, new androidx.camera.core.processing.DefaultSurfaceProcessor$$h(surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$release$4();
            }
        });
    }

    public DualSurfaceProcessor(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map, androidx.camera.core.LayoutSettings layoutSettings, androidx.camera.core.LayoutSettings layoutSettings2) {
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mIsReleaseRequested = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mOutputSurfaces = new java.util.LinkedHashMap();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new androidx.camera.core.processing.concurrent.DualOpenGlRenderer(layoutSettings, layoutSettings2);
        try {
            initGlRenderer(dynamicRange, map);
        } catch (java.lang.RuntimeException e17) {
            release();
            throw e17;
        }
    }

    private void executeSafely(final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$i
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.lambda$executeSafely$8(runnable2, runnable);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            androidx.camera.core.Logger.w(TAG, "Unable to executor runnable", e17);
            runnable2.run();
        }
    }
}
