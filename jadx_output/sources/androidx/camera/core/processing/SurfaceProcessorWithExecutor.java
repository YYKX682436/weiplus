package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class SurfaceProcessorWithExecutor implements androidx.camera.core.processing.SurfaceProcessorInternal {
    private static final java.lang.String TAG = "SurfaceProcessor";
    private final m3.a mErrorListener;
    private final java.util.concurrent.Executor mExecutor;
    private final androidx.camera.core.SurfaceProcessor mSurfaceProcessor;

    public SurfaceProcessorWithExecutor(androidx.camera.core.CameraEffect cameraEffect) {
        androidx.camera.core.SurfaceProcessor surfaceProcessor = cameraEffect.getSurfaceProcessor();
        java.util.Objects.requireNonNull(surfaceProcessor);
        this.mSurfaceProcessor = surfaceProcessor;
        this.mExecutor = cameraEffect.getExecutor();
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$0(androidx.camera.core.SurfaceRequest surfaceRequest) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceRequest);
        } catch (androidx.camera.core.ProcessingException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to setup SurfaceProcessor input.", e17);
            this.mErrorListener.accept(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$1(androidx.camera.core.SurfaceOutput surfaceOutput) {
        try {
            this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
        } catch (androidx.camera.core.ProcessingException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to setup SurfaceProcessor output.", e17);
            this.mErrorListener.accept(e17);
        }
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    public androidx.camera.core.SurfaceProcessor getProcessor() {
        return this.mSurfaceProcessor;
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final androidx.camera.core.SurfaceRequest surfaceRequest) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.SurfaceProcessorWithExecutor.this.lambda$onInputSurface$0(surfaceRequest);
            }
        });
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final androidx.camera.core.SurfaceOutput surfaceOutput) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.SurfaceProcessorWithExecutor.this.lambda$onOutputSurface$1(surfaceOutput);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public wa.a snapshot(int i17, int i18) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.Exception("Snapshot not supported by external SurfaceProcessor"));
    }
}
