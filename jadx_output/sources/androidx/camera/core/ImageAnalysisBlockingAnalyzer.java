package androidx.camera.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class ImageAnalysisBlockingAnalyzer extends androidx.camera.core.ImageAnalysisAbstractAnalyzer {
    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public androidx.camera.core.ImageProxy acquireImage(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void clearCache() {
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void onValidImageAvailable(final androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.futures.Futures.addCallback(analyzeImage(imageProxy), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.ImageAnalysisBlockingAnalyzer.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                imageProxy.close();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r17) {
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }
}
