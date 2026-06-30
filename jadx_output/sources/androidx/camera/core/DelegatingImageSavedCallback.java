package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/camera/core/DelegatingImageSavedCallback;", "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "Ljz5/f0;", "dispose", "onCaptureStarted", "", "progress", "onCaptureProcessProgressed", "Landroid/graphics/Bitmap;", "bitmap", "onPostviewBitmapAvailable", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "outputFileResults", "onImageSaved", "Landroidx/camera/core/ImageCaptureException;", "exception", "onError", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "_delegate", "Ljava/util/concurrent/atomic/AtomicReference;", "getDelegate", "()Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "delegate", "<init>", "(Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", "camera-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes14.dex */
final class DelegatingImageSavedCallback implements androidx.camera.core.ImageCapture.OnImageSavedCallback {
    private final java.util.concurrent.atomic.AtomicReference<androidx.camera.core.ImageCapture.OnImageSavedCallback> _delegate;

    public DelegatingImageSavedCallback(androidx.camera.core.ImageCapture.OnImageSavedCallback delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this._delegate = new java.util.concurrent.atomic.AtomicReference<>(delegate);
    }

    private final androidx.camera.core.ImageCapture.OnImageSavedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureProcessProgressed(int i17) {
        androidx.camera.core.ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(i17);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureStarted() {
        androidx.camera.core.ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onError(androidx.camera.core.ImageCaptureException exception) {
        kotlin.jvm.internal.o.g(exception, "exception");
        androidx.camera.core.ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(exception);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onImageSaved(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
        kotlin.jvm.internal.o.g(outputFileResults, "outputFileResults");
        androidx.camera.core.ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onImageSaved(outputFileResults);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        androidx.camera.core.ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }
}
