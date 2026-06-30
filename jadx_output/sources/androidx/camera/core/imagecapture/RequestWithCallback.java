package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class RequestWithCallback implements androidx.camera.core.imagecapture.TakePictureCallback {
    private t2.k mCaptureCompleter;
    private wa.a mCaptureRequestFuture;
    private t2.k mCompleteCompleter;
    private final androidx.camera.core.imagecapture.TakePictureRequest.RetryControl mRetryControl;
    private final androidx.camera.core.imagecapture.TakePictureRequest mTakePictureRequest;
    private boolean mIsAborted = false;
    private boolean mIsStarted = false;
    private final wa.a mCaptureFuture = t2.p.a(new t2.m() { // from class: androidx.camera.core.imagecapture.RequestWithCallback$$a
        @Override // t2.m
        public final java.lang.Object attachCompleter(t2.k kVar) {
            java.lang.Object lambda$new$0;
            lambda$new$0 = androidx.camera.core.imagecapture.RequestWithCallback.this.lambda$new$0(kVar);
            return lambda$new$0;
        }
    });
    private final wa.a mCompleteFuture = t2.p.a(new t2.m() { // from class: androidx.camera.core.imagecapture.RequestWithCallback$$b
        @Override // t2.m
        public final java.lang.Object attachCompleter(t2.k kVar) {
            java.lang.Object lambda$new$1;
            lambda$new$1 = androidx.camera.core.imagecapture.RequestWithCallback.this.lambda$new$1(kVar);
            return lambda$new$1;
        }
    });

    public RequestWithCallback(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.imagecapture.TakePictureRequest.RetryControl retryControl) {
        this.mTakePictureRequest = takePictureRequest;
        this.mRetryControl = retryControl;
    }

    private void abort(androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mIsAborted = true;
        wa.a aVar = this.mCaptureRequestFuture;
        java.util.Objects.requireNonNull(aVar);
        aVar.cancel(true);
        this.mCaptureCompleter.b(imageCaptureException);
        this.mCompleteCompleter.a(null);
    }

    private void checkOnImageCaptured() {
        m3.h.e(this.mCaptureFuture.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$new$0(t2.k kVar) {
        this.mCaptureCompleter = kVar;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$new$1(t2.k kVar) {
        this.mCompleteCompleter = kVar;
        return "RequestCompleteFuture";
    }

    private void markComplete() {
        m3.h.e(!this.mCompleteFuture.isDone(), "The callback can only complete once.");
        this.mCompleteCompleter.a(null);
    }

    private void onFailure(androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mTakePictureRequest.onError(imageCaptureException);
    }

    public void abortAndSendErrorToApp(androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mCompleteFuture.isDone()) {
            return;
        }
        abort(imageCaptureException);
        onFailure(imageCaptureException);
    }

    public void abortSilentlyAndRetry() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mCompleteFuture.isDone()) {
            return;
        }
        abort(new androidx.camera.core.ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.mRetryControl.retryRequest(this.mTakePictureRequest);
    }

    public wa.a getCaptureFuture() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.mCaptureFuture;
    }

    public wa.a getCompleteFuture() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.mCompleteFuture;
    }

    public androidx.camera.core.imagecapture.TakePictureRequest getTakePictureRequest() {
        return this.mTakePictureRequest;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public boolean isAborted() {
        return this.mIsAborted;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureFailure(androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        boolean decrementRetryCounter = this.mTakePictureRequest.decrementRetryCounter();
        if (!decrementRetryCounter) {
            onFailure(imageCaptureException);
        }
        markComplete();
        this.mCaptureCompleter.b(imageCaptureException);
        if (decrementRetryCounter) {
            this.mRetryControl.retryRequest(this.mTakePictureRequest);
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureProcessProgressed(int i17) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        this.mTakePictureRequest.onCaptureProcessProgressed(i17);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureStarted() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted || this.mIsStarted) {
            return;
        }
        this.mIsStarted = true;
        androidx.camera.core.ImageCapture.OnImageCapturedCallback inMemoryCallback = this.mTakePictureRequest.getInMemoryCallback();
        if (inMemoryCallback != null) {
            inMemoryCallback.onCaptureStarted();
        }
        androidx.camera.core.ImageCapture.OnImageSavedCallback onDiskCallback = this.mTakePictureRequest.getOnDiskCallback();
        if (onDiskCallback != null) {
            onDiskCallback.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onFinalResult(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        checkOnImageCaptured();
        markComplete();
        this.mTakePictureRequest.onResult(outputFileResults);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onImageCaptured() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        if (!this.mIsStarted) {
            onCaptureStarted();
        }
        this.mCaptureCompleter.a(null);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        this.mTakePictureRequest.onPostviewBitmapAvailable(bitmap);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onProcessFailure(androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        checkOnImageCaptured();
        markComplete();
        onFailure(imageCaptureException);
    }

    public void setCaptureRequestFuture(wa.a aVar) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        m3.h.e(this.mCaptureRequestFuture == null, "CaptureRequestFuture can only be set once.");
        this.mCaptureRequestFuture = aVar;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onFinalResult(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.mIsAborted) {
            imageProxy.close();
            return;
        }
        checkOnImageCaptured();
        markComplete();
        this.mTakePictureRequest.onResult(imageProxy);
    }
}
