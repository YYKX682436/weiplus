package androidx.camera.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class ImageAnalysisNonBlockingAnalyzer extends androidx.camera.core.ImageAnalysisAbstractAnalyzer {
    final java.util.concurrent.Executor mBackgroundExecutor;
    androidx.camera.core.ImageProxy mCachedImage;
    private final java.lang.Object mLock = new java.lang.Object();
    private androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy mPostedImage;

    /* loaded from: classes14.dex */
    public static class CacheAnalyzingImageProxy extends androidx.camera.core.ForwardingImageProxy {
        final java.lang.ref.WeakReference<androidx.camera.core.ImageAnalysisNonBlockingAnalyzer> mNonBlockingAnalyzerWeakReference;

        public CacheAnalyzingImageProxy(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
            super(imageProxy);
            this.mNonBlockingAnalyzerWeakReference = new java.lang.ref.WeakReference<>(imageAnalysisNonBlockingAnalyzer);
            addOnImageCloseListener(new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$b
                @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
                public final void onImageClose(androidx.camera.core.ImageProxy imageProxy2) {
                    androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy.this.lambda$new$1(imageProxy2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(androidx.camera.core.ImageProxy imageProxy) {
            final androidx.camera.core.ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = this.mNonBlockingAnalyzerWeakReference.get();
            if (imageAnalysisNonBlockingAnalyzer != null) {
                imageAnalysisNonBlockingAnalyzer.mBackgroundExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.this.analyzeCachedImage();
                    }
                });
            }
        }
    }

    public ImageAnalysisNonBlockingAnalyzer(java.util.concurrent.Executor executor) {
        this.mBackgroundExecutor = executor;
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public androidx.camera.core.ImageProxy acquireImage(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    public void analyzeCachedImage() {
        synchronized (this.mLock) {
            this.mPostedImage = null;
            androidx.camera.core.ImageProxy imageProxy = this.mCachedImage;
            if (imageProxy != null) {
                this.mCachedImage = null;
                onValidImageAvailable(imageProxy);
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void clearCache() {
        synchronized (this.mLock) {
            androidx.camera.core.ImageProxy imageProxy = this.mCachedImage;
            if (imageProxy != null) {
                imageProxy.close();
                this.mCachedImage = null;
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void onValidImageAvailable(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (!this.mIsAttached) {
                imageProxy.close();
                return;
            }
            if (this.mPostedImage == null) {
                final androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy cacheAnalyzingImageProxy = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy(imageProxy, this);
                this.mPostedImage = cacheAnalyzingImageProxy;
                androidx.camera.core.impl.utils.futures.Futures.addCallback(analyzeImage(cacheAnalyzingImageProxy), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(java.lang.Throwable th6) {
                        cacheAnalyzingImageProxy.close();
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(java.lang.Void r17) {
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            } else {
                if (imageProxy.getImageInfo().getTimestamp() <= this.mPostedImage.getImageInfo().getTimestamp()) {
                    imageProxy.close();
                } else {
                    androidx.camera.core.ImageProxy imageProxy2 = this.mCachedImage;
                    if (imageProxy2 != null) {
                        imageProxy2.close();
                    }
                    this.mCachedImage = imageProxy;
                }
            }
        }
    }
}
