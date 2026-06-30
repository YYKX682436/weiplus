package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class TakePictureManager implements androidx.camera.core.ForwardingImageProxy.OnImageCloseListener, androidx.camera.core.imagecapture.TakePictureRequest.RetryControl {
    private static final java.lang.String TAG = "TakePictureManager";
    private androidx.camera.core.imagecapture.RequestWithCallback mCapturingRequest;
    final androidx.camera.core.imagecapture.ImageCaptureControl mImageCaptureControl;
    androidx.camera.core.imagecapture.ImagePipeline mImagePipeline;
    private final java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> mIncompleteRequests;
    final java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> mNewRequests = new java.util.ArrayDeque();
    boolean mPaused = false;

    /* loaded from: classes14.dex */
    public static abstract class CaptureError {
        public static androidx.camera.core.imagecapture.TakePictureManager.CaptureError of(int i17, androidx.camera.core.ImageCaptureException imageCaptureException) {
            return new androidx.camera.core.imagecapture.AutoValue_TakePictureManager_CaptureError(i17, imageCaptureException);
        }

        public abstract androidx.camera.core.ImageCaptureException getImageCaptureException();

        public abstract int getRequestId();
    }

    public TakePictureManager(androidx.camera.core.imagecapture.ImageCaptureControl imageCaptureControl) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mImageCaptureControl = imageCaptureControl;
        this.mIncompleteRequests = new java.util.ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackCurrentRequests$0() {
        this.mCapturingRequest = null;
        issueNextRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackCurrentRequests$1(androidx.camera.core.imagecapture.RequestWithCallback requestWithCallback) {
        this.mIncompleteRequests.remove(requestWithCallback);
    }

    private wa.a submitCameraRequest(final androidx.camera.core.imagecapture.CameraRequest cameraRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mImageCaptureControl.lockFlashMode();
        wa.a submitStillCaptureRequests = this.mImageCaptureControl.submitStillCaptureRequests(cameraRequest.getCaptureConfigs());
        androidx.camera.core.impl.utils.futures.Futures.addCallback(submitStillCaptureRequests, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManager.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                if (cameraRequest.isAborted()) {
                    return;
                }
                int id6 = cameraRequest.getCaptureConfigs().get(0).getId();
                if (th6 instanceof androidx.camera.core.ImageCaptureException) {
                    androidx.camera.core.imagecapture.TakePictureManager.this.mImagePipeline.notifyCaptureError(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.of(id6, (androidx.camera.core.ImageCaptureException) th6));
                } else {
                    androidx.camera.core.imagecapture.TakePictureManager.this.mImagePipeline.notifyCaptureError(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.of(id6, new androidx.camera.core.ImageCaptureException(2, "Failed to submit capture request", th6)));
                }
                androidx.camera.core.imagecapture.TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r17) {
                androidx.camera.core.imagecapture.TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        return submitStillCaptureRequests;
    }

    private void trackCurrentRequests(final androidx.camera.core.imagecapture.RequestWithCallback requestWithCallback) {
        m3.h.e(!hasCapturingRequest(), null);
        this.mCapturingRequest = requestWithCallback;
        requestWithCallback.getCaptureFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManager$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureManager.this.lambda$trackCurrentRequests$0();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        this.mIncompleteRequests.add(requestWithCallback);
        requestWithCallback.getCompleteFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManager$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureManager.this.lambda$trackCurrentRequests$1(requestWithCallback);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public void abortRequests() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.ImageCaptureException imageCaptureException = new androidx.camera.core.ImageCaptureException(3, "Camera is closed.", null);
        java.util.Iterator<androidx.camera.core.imagecapture.TakePictureRequest> it = this.mNewRequests.iterator();
        while (it.hasNext()) {
            it.next().onError(imageCaptureException);
        }
        this.mNewRequests.clear();
        java.util.Iterator it6 = new java.util.ArrayList(this.mIncompleteRequests).iterator();
        while (it6.hasNext()) {
            ((androidx.camera.core.imagecapture.RequestWithCallback) it6.next()).abortAndSendErrorToApp(imageCaptureException);
        }
    }

    public androidx.camera.core.imagecapture.RequestWithCallback getCapturingRequest() {
        return this.mCapturingRequest;
    }

    public androidx.camera.core.imagecapture.ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    public java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> getIncompleteRequests() {
        return this.mIncompleteRequests;
    }

    public boolean hasCapturingRequest() {
        return this.mCapturingRequest != null;
    }

    public void issueNextRequest() {
        androidx.camera.core.imagecapture.TakePictureRequest poll;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (hasCapturingRequest() || this.mPaused || this.mImagePipeline.getCapacity() == 0 || (poll = this.mNewRequests.poll()) == null) {
            return;
        }
        androidx.camera.core.imagecapture.RequestWithCallback requestWithCallback = new androidx.camera.core.imagecapture.RequestWithCallback(poll, this);
        trackCurrentRequests(requestWithCallback);
        m3.d createRequests = this.mImagePipeline.createRequests(poll, requestWithCallback, requestWithCallback.getCaptureFuture());
        androidx.camera.core.imagecapture.CameraRequest cameraRequest = (androidx.camera.core.imagecapture.CameraRequest) createRequests.f323092a;
        java.util.Objects.requireNonNull(cameraRequest);
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = (androidx.camera.core.imagecapture.ProcessingRequest) createRequests.f323093b;
        java.util.Objects.requireNonNull(processingRequest);
        this.mImagePipeline.submitProcessingRequest(processingRequest);
        requestWithCallback.setCaptureRequestFuture(submitCameraRequest(cameraRequest));
    }

    public void offerRequest(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mNewRequests.offer(takePictureRequest);
        issueNextRequest();
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManager$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureManager.this.issueNextRequest();
            }
        });
    }

    public void pause() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mPaused = true;
        androidx.camera.core.imagecapture.RequestWithCallback requestWithCallback = this.mCapturingRequest;
        if (requestWithCallback != null) {
            requestWithCallback.abortSilentlyAndRetry();
        }
    }

    public void resume() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mPaused = false;
        issueNextRequest();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.RetryControl
    public void retryRequest(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.Logger.d(TAG, "Add a new request for retrying.");
        this.mNewRequests.addFirst(takePictureRequest);
        issueNextRequest();
    }

    public void setImagePipeline(androidx.camera.core.imagecapture.ImagePipeline imagePipeline) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mImagePipeline = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }
}
