package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class DefaultSurfaceProcessor implements androidx.camera.core.processing.SurfaceProcessorInternal, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "DefaultSurfaceProcessor";
    private final java.util.concurrent.Executor mGlExecutor;
    final android.os.Handler mGlHandler;
    private final androidx.camera.core.processing.OpenGlRenderer mGlRenderer;
    final android.os.HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final java.util.concurrent.atomic.AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> mOutputSurfaces;
    private final java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> mPendingSnapshots;
    private final float[] mSurfaceOutputMatrix;
    private final float[] mTextureMatrix;

    /* loaded from: classes14.dex */
    public static class Factory {
        private static r.a sSupplier = new androidx.camera.core.processing.DefaultSurfaceProcessor$Factory$$a();

        private Factory() {
        }

        public static androidx.camera.core.processing.SurfaceProcessorInternal newInstance(androidx.camera.core.DynamicRange dynamicRange) {
            return (androidx.camera.core.processing.SurfaceProcessorInternal) sSupplier.apply(dynamicRange);
        }

        public static void setSupplier(r.a aVar) {
            sSupplier = aVar;
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class PendingSnapshot {
        public static androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot of(int i17, int i18, t2.k kVar) {
            return new androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot(i17, i18, kVar);
        }

        public abstract t2.k getCompleter();

        public abstract int getJpegQuality();

        public abstract int getRotationDegrees();
    }

    public DefaultSurfaceProcessor(androidx.camera.core.DynamicRange dynamicRange) {
        this(dynamicRange, java.util.Collections.emptyMap());
    }

    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            java.util.Iterator<androidx.camera.core.SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            java.util.Iterator<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> it6 = this.mPendingSnapshots.iterator();
            while (it6.hasNext()) {
                it6.next().getCompleter().b(new java.lang.Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    private void executeSafely(java.lang.Runnable runnable) {
        executeSafely(runnable, new androidx.camera.core.processing.DefaultSurfaceProcessor$$o());
    }

    private void failAllPendingSnapshots(java.lang.Throwable th6) {
        java.util.Iterator<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> it = this.mPendingSnapshots.iterator();
        while (it.hasNext()) {
            it.next().getCompleter().b(th6);
        }
        this.mPendingSnapshots.clear();
    }

    private android.graphics.Bitmap getBitmap(android.util.Size size, float[] fArr, int i17) {
        float[] fArr2 = (float[]) fArr.clone();
        androidx.camera.core.impl.utils.MatrixExt.preRotate(fArr2, i17, 0.5f, 0.5f);
        androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(fArr2, 0.5f);
        return this.mGlRenderer.snapshot(androidx.camera.core.impl.utils.TransformUtils.rotateSize(size, i17), fArr2);
    }

    private void initGlRenderer(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        try {
            ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$a
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$initGlRenderer$10;
                    lambda$initGlRenderer$10 = androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$initGlRenderer$10(dynamicRange, map, kVar);
                    return lambda$initGlRenderer$10;
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
    public static /* synthetic */ void lambda$executeSafely$11() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeSafely$12(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        if (this.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$initGlRenderer$10(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map map, final t2.k kVar) {
        executeSafely(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$m
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$initGlRenderer$9(dynamicRange, map, kVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGlRenderer$9(androidx.camera.core.DynamicRange dynamicRange, java.util.Map map, t2.k kVar) {
        try {
            this.mGlRenderer.init(dynamicRange, map);
            kVar.a(null);
        } catch (java.lang.RuntimeException e17) {
            kVar.b(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$0(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat = androidx.camera.core.processing.util.GLUtils.InputFormat.DEFAULT;
        if (surfaceRequest.getDynamicRange().is10BitHdr() && transformationInfo.hasCameraTransform()) {
            inputFormat = androidx.camera.core.processing.util.GLUtils.InputFormat.YUV;
        }
        this.mGlRenderer.setInputFormat(inputFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$1(androidx.camera.core.SurfaceRequest surfaceRequest, android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, androidx.camera.core.SurfaceRequest.Result result) {
        surfaceRequest.clearTransformationInfoListener();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.mInputSurfaceCount--;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$2(final androidx.camera.core.SurfaceRequest surfaceRequest) {
        this.mInputSurfaceCount++;
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.mGlRenderer.getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        surfaceRequest.setTransformationInfoListener(this.mGlExecutor, new androidx.camera.core.SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$b
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$onInputSurface$0(surfaceRequest, transformationInfo);
            }
        });
        surfaceRequest.provideSurface(surface, this.mGlExecutor, new m3.a() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$c
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$onInputSurface$1(surfaceRequest, surfaceTexture, surface, (androidx.camera.core.SurfaceRequest.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.mGlHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$3(androidx.camera.core.SurfaceOutput surfaceOutput, androidx.camera.core.SurfaceOutput.Event event) {
        surfaceOutput.close();
        android.view.Surface remove = this.mOutputSurfaces.remove(surfaceOutput);
        if (remove != null) {
            this.mGlRenderer.unregisterOutputSurface(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$4(final androidx.camera.core.SurfaceOutput surfaceOutput) {
        android.view.Surface surface = surfaceOutput.getSurface(this.mGlExecutor, new m3.a() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$d
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$onOutputSurface$3(surfaceOutput, (androidx.camera.core.SurfaceOutput.Event) obj);
            }
        });
        this.mGlRenderer.registerOutputSurface(surface);
        this.mOutputSurfaces.put(surfaceOutput, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$5() {
        this.mIsReleased = true;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$snapshot$6(androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot) {
        this.mPendingSnapshots.add(pendingSnapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$snapshot$7(t2.k kVar) {
        kVar.b(new java.lang.Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$snapshot$8(int i17, int i18, final t2.k kVar) {
        final androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot of6 = androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot.of(i17, i18, kVar);
        executeSafely(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$e
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$snapshot$6(of6);
            }
        }, new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor.lambda$snapshot$7(t2.k.this);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void takeSnapshotAndDrawJpeg(jz5.o oVar) {
        if (this.mPendingSnapshots.isEmpty()) {
            return;
        }
        if (oVar == null) {
            failAllPendingSnapshots(new java.lang.Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.Iterator<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> it = this.mPendingSnapshots.iterator();
                int i17 = -1;
                int i18 = -1;
                android.graphics.Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot next = it.next();
                    if (i17 != next.getRotationDegrees() || bitmap == null) {
                        i17 = next.getRotationDegrees();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = getBitmap((android.util.Size) oVar.f302842e, (float[]) oVar.f302843f, i17);
                        i18 = -1;
                    }
                    if (i18 != next.getJpegQuality()) {
                        byteArrayOutputStream.reset();
                        i18 = next.getJpegQuality();
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i18, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    android.view.Surface surface = (android.view.Surface) oVar.f302841d;
                    java.util.Objects.requireNonNull(bArr);
                    androidx.camera.core.ImageProcessingUtil.writeJpegBytesToSurface(surface, bArr);
                    next.getCompleter().a(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th6) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (java.io.IOException e17) {
            failAllPendingSnapshots(e17);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.mIsReleaseRequested.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.mTextureMatrix);
        jz5.o oVar = null;
        for (java.util.Map.Entry<androidx.camera.core.SurfaceOutput, android.view.Surface> entry : this.mOutputSurfaces.entrySet()) {
            android.view.Surface value = entry.getValue();
            androidx.camera.core.SurfaceOutput key = entry.getKey();
            key.updateTransformMatrix(this.mSurfaceOutputMatrix, this.mTextureMatrix);
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), this.mSurfaceOutputMatrix, value);
                } catch (java.lang.RuntimeException e17) {
                    androidx.camera.core.Logger.e(TAG, "Failed to render with OpenGL.", e17);
                }
            } else {
                m3.h.e(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                m3.h.e(oVar == null, "Only one JPEG output is supported.");
                oVar = new jz5.o(value, key.getSize(), (float[]) this.mSurfaceOutputMatrix.clone());
            }
        }
        try {
            takeSnapshotAndDrawJpeg(oVar);
        } catch (java.lang.RuntimeException e18) {
            failAllPendingSnapshots(e18);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final androidx.camera.core.SurfaceRequest surfaceRequest) {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$j
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$onInputSurface$2(surfaceRequest);
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
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$g
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$onOutputSurface$4(surfaceOutput);
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
        executeSafely(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$n
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$release$5();
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public wa.a snapshot(final int i17, final int i18) {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$l
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$snapshot$8;
                lambda$snapshot$8 = androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$snapshot$8(i17, i18, kVar);
                return lambda$snapshot$8;
            }
        }));
    }

    public DefaultSurfaceProcessor(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        this.mIsReleaseRequested = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mTextureMatrix = new float[16];
        this.mSurfaceOutputMatrix = new float[16];
        this.mOutputSurfaces = new java.util.LinkedHashMap();
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mPendingSnapshots = new java.util.ArrayList();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new androidx.camera.core.processing.OpenGlRenderer();
        try {
            initGlRenderer(dynamicRange, map);
        } catch (java.lang.RuntimeException e17) {
            release();
            throw e17;
        }
    }

    private void executeSafely(final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$i
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.DefaultSurfaceProcessor.this.lambda$executeSafely$12(runnable2, runnable);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            androidx.camera.core.Logger.w(TAG, "Unable to executor runnable", e17);
            runnable2.run();
        }
    }
}
