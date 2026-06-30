package androidx.camera.core.imagecapture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CaptureNode implements androidx.camera.core.processing.Node<androidx.camera.core.imagecapture.CaptureNode.In, androidx.camera.core.imagecapture.ProcessingNode.In> {
    static final int MAX_IMAGES = 4;
    private static final java.lang.String TAG = "CaptureNode";
    private androidx.camera.core.imagecapture.CaptureNode.In mInputEdge;
    private androidx.camera.core.imagecapture.ProcessingNode.In mOutputEdge;
    androidx.camera.core.SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;
    androidx.camera.core.SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    androidx.camera.core.imagecapture.ProcessingRequest mCurrentRequest = null;
    private androidx.camera.core.imagecapture.NoMetadataImageReader mNoMetadataImageReader = null;

    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 extends androidx.camera.core.impl.CameraCaptureCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProcessProgressed$1(int i17) {
            androidx.camera.core.imagecapture.ProcessingRequest processingRequest = androidx.camera.core.imagecapture.CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i17);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0() {
            androidx.camera.core.imagecapture.ProcessingRequest processingRequest = androidx.camera.core.imagecapture.CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i17, final int i18) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1.this.lambda$onCaptureProcessProgressed$1(i18);
                }
            });
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i17) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1.this.lambda$onCaptureStarted$0();
                }
            });
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class In {
        private androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };
        private androidx.camera.core.impl.DeferrableSurface mPostviewSurface = null;
        private androidx.camera.core.impl.DeferrableSurface mSurface;

        public static androidx.camera.core.imagecapture.CaptureNode.In of(android.util.Size size, int i17, int i18, boolean z17, androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider) {
            return new androidx.camera.core.imagecapture.AutoValue_CaptureNode_In(size, i17, i18, z17, imageReaderProxyProvider, null, 35, new androidx.camera.core.processing.Edge(), new androidx.camera.core.processing.Edge());
        }

        public androidx.camera.core.impl.CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        public abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> getErrorEdge();

        public abstract androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract int getPostviewImageFormat();

        public abstract android.util.Size getPostviewSize();

        public androidx.camera.core.impl.DeferrableSurface getPostviewSurface() {
            return this.mPostviewSurface;
        }

        public abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getRequestEdge();

        public abstract android.util.Size getSize();

        public androidx.camera.core.impl.DeferrableSurface getSurface() {
            androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.mSurface;
            java.util.Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public abstract boolean isVirtualCamera();

        public void setCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setPostviewSurface(android.view.Surface surface, android.util.Size size, int i17) {
            this.mPostviewSurface = new androidx.camera.core.impl.ImmediateSurface(surface, size, i17);
        }

        public void setSurface(android.view.Surface surface) {
            m3.h.e(this.mSurface == null, "The surface is already set.");
            this.mSurface = new androidx.camera.core.impl.ImmediateSurface(surface, getSize(), getInputFormat());
        }

        public static androidx.camera.core.imagecapture.CaptureNode.In of(android.util.Size size, int i17, int i18, boolean z17, androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider, android.util.Size size2, int i19) {
            return new androidx.camera.core.imagecapture.AutoValue_CaptureNode_In(size, i17, i18, z17, imageReaderProxyProvider, size2, i19, new androidx.camera.core.processing.Edge(), new androidx.camera.core.processing.Edge());
        }
    }

    private static androidx.camera.core.impl.ImageReaderProxy createImageReaderProxy(androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider, int i17, int i18, int i19) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i17, i18, i19, 4, 0L) : androidx.camera.core.ImageReaderProxys.createIsolatedReader(i17, i18, i19, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseInputResources$4(androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$0(androidx.camera.core.imagecapture.ProcessingRequest processingRequest) {
        onRequestAvailable(processingRequest);
        this.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        try {
            androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                onImageProxyAvailable(acquireLatestImage);
            } else {
                androidx.camera.core.imagecapture.ProcessingRequest processingRequest = this.mCurrentRequest;
                if (processingRequest != null) {
                    sendCaptureError(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.of(processingRequest.getRequestId(), new androidx.camera.core.ImageCaptureException(2, "Failed to acquire latest image", null)));
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            androidx.camera.core.imagecapture.ProcessingRequest processingRequest2 = this.mCurrentRequest;
            if (processingRequest2 != null) {
                sendCaptureError(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.of(processingRequest2.getRequestId(), new androidx.camera.core.ImageCaptureException(2, "Failed to acquire latest image", e17)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$2(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        try {
            androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                propagatePostviewImage(acquireLatestImage);
            }
        } catch (java.lang.IllegalStateException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to acquire latest image of postview", e17);
        }
    }

    private void matchAndPropagateImage(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.ProcessingNode.In in6 = this.mOutputEdge;
        java.util.Objects.requireNonNull(in6);
        in6.getEdge().accept(androidx.camera.core.imagecapture.ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = this.mCurrentRequest;
        this.mCurrentRequest = null;
        processingRequest.onImageCaptured();
    }

    private void propagatePostviewImage(androidx.camera.core.ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            androidx.camera.core.Logger.w(TAG, "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            androidx.camera.core.imagecapture.ProcessingNode.In in6 = this.mOutputEdge;
            java.util.Objects.requireNonNull(in6);
            in6.getPostviewEdge().accept(androidx.camera.core.imagecapture.ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        }
    }

    private void releaseInputResources(androidx.camera.core.imagecapture.CaptureNode.In in6, final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy, final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        in6.getSurface().close();
        in6.getSurface().getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$$f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.SafeCloseImageReaderProxy.this.safeClose();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        if (in6.getPostviewSurface() != null) {
            in6.getPostviewSurface().close();
            in6.getPostviewSurface().getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$$g
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.CaptureNode.lambda$releaseInputResources$4(androidx.camera.core.SafeCloseImageReaderProxy.this);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        }
    }

    public int getCapacity() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        m3.h.e(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    public androidx.camera.core.imagecapture.CaptureNode.In getInputEdge() {
        androidx.camera.core.imagecapture.CaptureNode.In in6 = this.mInputEdge;
        java.util.Objects.requireNonNull(in6);
        return in6;
    }

    public androidx.camera.core.SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        java.util.Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    public void onImageProxyAvailable(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mCurrentRequest == null) {
            androidx.camera.core.Logger.w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((java.lang.Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey())) != null) {
            matchAndPropagateImage(imageProxy);
        } else {
            androidx.camera.core.Logger.w(TAG, "Discarding ImageProxy which was acquired for aborted request");
            imageProxy.close();
        }
    }

    public void onRequestAvailable(final androidx.camera.core.imagecapture.ProcessingRequest processingRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        m3.h.e(processingRequest.getStageIds().size() == 1, "only one capture stage is supported.");
        m3.h.e(getCapacity() > 0, "Too many acquire images. Close image to be able to process next.");
        this.mCurrentRequest = processingRequest;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(processingRequest.getCaptureFuture(), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                androidx.camera.core.impl.utils.Threads.checkMainThread();
                if (processingRequest == androidx.camera.core.imagecapture.CaptureNode.this.mCurrentRequest) {
                    androidx.camera.core.Logger.w(androidx.camera.core.imagecapture.CaptureNode.TAG, "request aborted, id=" + androidx.camera.core.imagecapture.CaptureNode.this.mCurrentRequest.getRequestId());
                    if (androidx.camera.core.imagecapture.CaptureNode.this.mNoMetadataImageReader != null) {
                        androidx.camera.core.imagecapture.CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    androidx.camera.core.imagecapture.CaptureNode.this.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r17) {
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.CaptureNode.In in6 = this.mInputEdge;
        java.util.Objects.requireNonNull(in6);
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        java.util.Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(in6, safeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
    }

    public void sendCaptureError(androidx.camera.core.imagecapture.TakePictureManager.CaptureError captureError) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest == null || processingRequest.getRequestId() != captureError.getRequestId()) {
            return;
        }
        this.mCurrentRequest.onCaptureFailure(captureError.getImageCaptureException());
    }

    public void setOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        m3.h.e(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.processing.Node
    public androidx.camera.core.imagecapture.ProcessingNode.In transform(androidx.camera.core.imagecapture.CaptureNode.In in6) {
        m3.a aVar;
        androidx.camera.core.imagecapture.NoMetadataImageReader noMetadataImageReader;
        m3.h.e(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = in6;
        android.util.Size size = in6.getSize();
        int inputFormat = in6.getInputFormat();
        boolean z17 = !in6.isVirtualCamera();
        androidx.camera.core.impl.CameraCaptureCallback anonymousClass1 = new androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1();
        if (z17 && in6.getImageReaderProxyProvider() == null) {
            androidx.camera.core.MetadataImageReader metadataImageReader = new androidx.camera.core.MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
            anonymousClass1 = androidx.camera.core.impl.CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader.getCameraCaptureCallback());
            aVar = new m3.a() { // from class: androidx.camera.core.imagecapture.CaptureNode$$a
                @Override // m3.a
                public final void accept(java.lang.Object obj) {
                    androidx.camera.core.imagecapture.CaptureNode.this.onRequestAvailable((androidx.camera.core.imagecapture.ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = metadataImageReader;
        } else {
            androidx.camera.core.imagecapture.NoMetadataImageReader noMetadataImageReader2 = new androidx.camera.core.imagecapture.NoMetadataImageReader(createImageReaderProxy(in6.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader2;
            aVar = new m3.a() { // from class: androidx.camera.core.imagecapture.CaptureNode$$b
                @Override // m3.a
                public final void accept(java.lang.Object obj) {
                    androidx.camera.core.imagecapture.CaptureNode.this.lambda$transform$0((androidx.camera.core.imagecapture.ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        }
        in6.setCameraCaptureCallback(anonymousClass1);
        android.view.Surface surface = noMetadataImageReader.getSurface();
        java.util.Objects.requireNonNull(surface);
        in6.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new androidx.camera.core.SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.CaptureNode$$c
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                androidx.camera.core.imagecapture.CaptureNode.this.lambda$transform$1(imageReaderProxy);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        if (in6.getPostviewSize() != null) {
            androidx.camera.core.impl.ImageReaderProxy createImageReaderProxy = createImageReaderProxy(in6.getImageReaderProxyProvider(), in6.getPostviewSize().getWidth(), in6.getPostviewSize().getHeight(), in6.getPostviewImageFormat());
            createImageReaderProxy.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.CaptureNode$$d
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                    androidx.camera.core.imagecapture.CaptureNode.this.lambda$transform$2(imageReaderProxy);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
            this.mSafeCloseImageReaderForPostview = new androidx.camera.core.SafeCloseImageReaderProxy(createImageReaderProxy);
            in6.setPostviewSurface(createImageReaderProxy.getSurface(), in6.getPostviewSize(), in6.getPostviewImageFormat());
        }
        in6.getRequestEdge().setListener(aVar);
        in6.getErrorEdge().setListener(new m3.a() { // from class: androidx.camera.core.imagecapture.CaptureNode$$e
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.imagecapture.CaptureNode.this.sendCaptureError((androidx.camera.core.imagecapture.TakePictureManager.CaptureError) obj);
            }
        });
        androidx.camera.core.imagecapture.ProcessingNode.In of6 = androidx.camera.core.imagecapture.ProcessingNode.In.of(in6.getInputFormat(), in6.getOutputFormat());
        this.mOutputEdge = of6;
        return of6;
    }
}
