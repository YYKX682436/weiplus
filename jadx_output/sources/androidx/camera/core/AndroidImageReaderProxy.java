package androidx.camera.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class AndroidImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {
    private final android.media.ImageReader mImageReader;
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mIsImageAvailableListenerCleared = true;

    public AndroidImageReaderProxy(android.media.ImageReader imageReader) {
        this.mImageReader = imageReader;
    }

    private boolean isImageReaderContextNotInitializedException(java.lang.RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$0(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$1(java.util.concurrent.Executor executor, final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, android.media.ImageReader imageReader) {
        synchronized (this.mLock) {
            if (!this.mIsImageAvailableListenerCleared) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.AndroidImageReaderProxy$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.AndroidImageReaderProxy.this.lambda$setOnImageAvailableListener$0(onImageAvailableListener);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        android.media.Image image;
        synchronized (this.mLock) {
            try {
                image = this.mImageReader.acquireLatestImage();
            } catch (java.lang.RuntimeException e17) {
                if (!isImageReaderContextNotInitializedException(e17)) {
                    throw e17;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.AndroidImageProxy(image);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        android.media.Image image;
        synchronized (this.mLock) {
            try {
                image = this.mImageReader.acquireNextImage();
            } catch (java.lang.RuntimeException e17) {
                if (!isImageReaderContextNotInitializedException(e17)) {
                    throw e17;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.AndroidImageProxy(image);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mIsImageAvailableListenerCleared = true;
            this.mImageReader.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            this.mImageReader.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReader.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReader.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReader.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        android.view.Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReader.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReader.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final java.util.concurrent.Executor executor) {
        synchronized (this.mLock) {
            this.mIsImageAvailableListenerCleared = false;
            this.mImageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.AndroidImageReaderProxy$$b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(android.media.ImageReader imageReader) {
                    androidx.camera.core.AndroidImageReaderProxy.this.lambda$setOnImageAvailableListener$1(executor, onImageAvailableListener, imageReader);
                }
            }, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
        }
    }
}
