package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class InternalImageProcessor {
    private final m3.a mErrorListener;
    private final java.util.concurrent.Executor mExecutor;
    private final androidx.camera.core.ImageProcessor mImageProcessor;

    public InternalImageProcessor(androidx.camera.core.CameraEffect cameraEffect) {
        m3.h.a(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getExecutor();
        androidx.camera.core.ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        java.util.Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$safeProcess$0(androidx.camera.core.ImageProcessor.Request request, t2.k kVar) {
        try {
            kVar.a(this.mImageProcessor.process(request));
        } catch (androidx.camera.core.ProcessingException e17) {
            this.mErrorListener.accept(e17);
            kVar.b(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$safeProcess$1(final androidx.camera.core.ImageProcessor.Request request, final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.InternalImageProcessor$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.InternalImageProcessor.this.lambda$safeProcess$0(request, kVar);
            }
        });
        return "InternalImageProcessor#process " + request.hashCode();
    }

    public androidx.camera.core.ImageProcessor.Response safeProcess(final androidx.camera.core.ImageProcessor.Request request) {
        try {
            return (androidx.camera.core.ImageProcessor.Response) ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.InternalImageProcessor$$b
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$safeProcess$1;
                    lambda$safeProcess$1 = androidx.camera.core.processing.InternalImageProcessor.this.lambda$safeProcess$1(request, kVar);
                    return lambda$safeProcess$1;
                }
            })).get();
        } catch (java.lang.Exception e17) {
            e = e17;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new androidx.camera.core.ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
