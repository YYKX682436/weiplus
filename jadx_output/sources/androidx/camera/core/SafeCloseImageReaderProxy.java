package androidx.camera.core;

/* loaded from: classes14.dex */
public class SafeCloseImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {
    private androidx.camera.core.ForwardingImageProxy.OnImageCloseListener mForwardingImageCloseListener;
    private final androidx.camera.core.impl.ImageReaderProxy mImageReaderProxy;
    private final android.view.Surface mSurface;
    private final java.lang.Object mLock = new java.lang.Object();
    private int mOutstandingImages = 0;
    private boolean mIsClosed = false;
    private final androidx.camera.core.ForwardingImageProxy.OnImageCloseListener mImageCloseListener = new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$a
        @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
        public final void onImageClose(androidx.camera.core.ImageProxy imageProxy) {
            androidx.camera.core.SafeCloseImageReaderProxy.this.lambda$new$0(imageProxy);
        }
    };

    public SafeCloseImageReaderProxy(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.mImageReaderProxy = imageReaderProxy;
        this.mSurface = imageReaderProxy.getSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener;
        synchronized (this.mLock) {
            int i17 = this.mOutstandingImages - 1;
            this.mOutstandingImages = i17;
            if (this.mIsClosed && i17 == 0) {
                close();
            }
            onImageCloseListener = this.mForwardingImageCloseListener;
        }
        if (onImageCloseListener != null) {
            onImageCloseListener.onImageClose(imageProxy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$1(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    private androidx.camera.core.ImageProxy wrapImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        this.mOutstandingImages++;
        androidx.camera.core.SingleCloseImageProxy singleCloseImageProxy = new androidx.camera.core.SingleCloseImageProxy(imageProxy);
        singleCloseImageProxy.addOnImageCloseListener(this.mImageCloseListener);
        return singleCloseImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        androidx.camera.core.ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireLatestImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        androidx.camera.core.ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireNextImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReaderProxy.clearOnImageAvailableListener();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            android.view.Surface surface = this.mSurface;
            if (surface != null) {
                surface.release();
            }
            this.mImageReaderProxy.close();
        }
    }

    public int getCapacity() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages() - this.mOutstandingImages;
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    public androidx.camera.core.impl.ImageReaderProxy getImageReaderProxy() {
        androidx.camera.core.impl.ImageReaderProxy imageReaderProxy;
        synchronized (this.mLock) {
            imageReaderProxy = this.mImageReaderProxy;
        }
        return imageReaderProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        android.view.Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    public boolean isClosed() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = this.mIsClosed;
        }
        return z17;
    }

    public void safeClose() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mImageReaderProxy.clearOnImageAvailableListener();
            if (this.mOutstandingImages == 0) {
                close();
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        synchronized (this.mLock) {
            this.mImageReaderProxy.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$b
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                    androidx.camera.core.SafeCloseImageReaderProxy.this.lambda$setOnImageAvailableListener$1(onImageAvailableListener, imageReaderProxy);
                }
            }, executor);
        }
    }

    public void setOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        synchronized (this.mLock) {
            this.mForwardingImageCloseListener = onImageCloseListener;
        }
    }
}
