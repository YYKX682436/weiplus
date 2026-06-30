package androidx.camera.core;

/* loaded from: classes14.dex */
public class MetadataImageReader implements androidx.camera.core.impl.ImageReaderProxy, androidx.camera.core.ForwardingImageProxy.OnImageCloseListener {
    private static final java.lang.String TAG = "MetadataImageReader";
    private final java.util.List<androidx.camera.core.ImageProxy> mAcquiredImageProxies;
    private androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback;
    private boolean mClosed;
    private java.util.concurrent.Executor mExecutor;
    private int mImageProxiesIndex;
    private final androidx.camera.core.impl.ImageReaderProxy mImageReaderProxy;
    androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mListener;
    private final java.lang.Object mLock;
    private final java.util.List<androidx.camera.core.ImageProxy> mMatchedImageProxies;
    private final android.util.LongSparseArray<androidx.camera.core.ImageInfo> mPendingImageInfos;
    private final android.util.LongSparseArray<androidx.camera.core.ImageProxy> mPendingImages;
    private androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mTransformedListener;
    private int mUnAcquiredAvailableImageCount;

    public MetadataImageReader(int i17, int i18, int i19, int i27) {
        this(createImageReaderProxy(i17, i18, i19, i27));
    }

    private static androidx.camera.core.impl.ImageReaderProxy createImageReaderProxy(int i17, int i18, int i19, int i27) {
        return new androidx.camera.core.AndroidImageReaderProxy(android.media.ImageReader.newInstance(i17, i18, i19, i27));
    }

    private void dequeImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.mLock) {
            int indexOf = this.mMatchedImageProxies.indexOf(imageProxy);
            if (indexOf >= 0) {
                this.mMatchedImageProxies.remove(indexOf);
                int i17 = this.mImageProxiesIndex;
                if (indexOf <= i17) {
                    this.mImageProxiesIndex = i17 - 1;
                }
            }
            this.mAcquiredImageProxies.remove(imageProxy);
            if (this.mUnAcquiredAvailableImageCount > 0) {
                imageIncoming(this.mImageReaderProxy);
            }
        }
    }

    private void enqueueImageProxy(androidx.camera.core.SettableImageProxy settableImageProxy) {
        final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        java.util.concurrent.Executor executor;
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.size() < getMaxImages()) {
                settableImageProxy.addOnImageCloseListener(this);
                this.mMatchedImageProxies.add(settableImageProxy);
                onImageAvailableListener = this.mListener;
                executor = this.mExecutor;
            } else {
                androidx.camera.core.Logger.d("TAG", "Maximum image number reached.");
                settableImageProxy.close();
                onImageAvailableListener = null;
                executor = null;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.MetadataImageReader$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.MetadataImageReader.this.lambda$enqueueImageProxy$1(onImageAvailableListener);
                    }
                });
            } else {
                onImageAvailableListener.onImageAvailable(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enqueueImageProxy$1(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            this.mUnAcquiredAvailableImageCount++;
        }
        imageIncoming(imageReaderProxy);
    }

    private void matchImages() {
        synchronized (this.mLock) {
            for (int size = this.mPendingImageInfos.size() - 1; size >= 0; size--) {
                androidx.camera.core.ImageInfo valueAt = this.mPendingImageInfos.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                androidx.camera.core.ImageProxy imageProxy = this.mPendingImages.get(timestamp);
                if (imageProxy != null) {
                    this.mPendingImages.remove(timestamp);
                    this.mPendingImageInfos.removeAt(size);
                    enqueueImageProxy(new androidx.camera.core.SettableImageProxy(imageProxy, valueAt));
                }
            }
            removeStaleData();
        }
    }

    private void removeStaleData() {
        synchronized (this.mLock) {
            if (this.mPendingImages.size() != 0 && this.mPendingImageInfos.size() != 0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(this.mPendingImages.keyAt(0));
                java.lang.Long valueOf2 = java.lang.Long.valueOf(this.mPendingImageInfos.keyAt(0));
                m3.h.a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                        if (this.mPendingImages.keyAt(size) < valueOf2.longValue()) {
                            this.mPendingImages.valueAt(size).close();
                            this.mPendingImages.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.mPendingImageInfos.size() - 1; size2 >= 0; size2--) {
                        if (this.mPendingImageInfos.keyAt(size2) < valueOf.longValue()) {
                            this.mPendingImageInfos.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < this.mMatchedImageProxies.size() - 1; i17++) {
                if (!this.mAcquiredImageProxies.contains(this.mMatchedImageProxies.get(i17))) {
                    arrayList.add(this.mMatchedImageProxies.get(i17));
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.ImageProxy) it.next()).close();
            }
            int size = this.mMatchedImageProxies.size() - 1;
            java.util.List<androidx.camera.core.ImageProxy> list = this.mMatchedImageProxies;
            this.mImageProxiesIndex = size + 1;
            androidx.camera.core.ImageProxy imageProxy = list.get(size);
            this.mAcquiredImageProxies.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.List<androidx.camera.core.ImageProxy> list = this.mMatchedImageProxies;
            int i17 = this.mImageProxiesIndex;
            this.mImageProxiesIndex = i17 + 1;
            androidx.camera.core.ImageProxy imageProxy = list.get(i17);
            this.mAcquiredImageProxies.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReaderProxy.clearOnImageAvailableListener();
            this.mListener = null;
            this.mExecutor = null;
            this.mUnAcquiredAvailableImageCount = 0;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.mMatchedImageProxies).iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.ImageProxy) it.next()).close();
            }
            this.mMatchedImageProxies.clear();
            this.mImageReaderProxy.close();
            this.mClosed = true;
        }
    }

    public androidx.camera.core.impl.CameraCaptureCallback getCameraCaptureCallback() {
        return this.mCameraCaptureCallback;
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

    public void imageIncoming(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        androidx.camera.core.ImageProxy imageProxy;
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            int size = this.mPendingImages.size() + this.mMatchedImageProxies.size();
            if (size >= imageReaderProxy.getMaxImages()) {
                androidx.camera.core.Logger.d(TAG, "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    imageProxy = imageReaderProxy.acquireNextImage();
                    if (imageProxy != null) {
                        this.mUnAcquiredAvailableImageCount--;
                        size++;
                        this.mPendingImages.put(imageProxy.getImageInfo().getTimestamp(), imageProxy);
                        matchImages();
                    }
                } catch (java.lang.IllegalStateException e17) {
                    androidx.camera.core.Logger.d(TAG, "Failed to acquire next image.", e17);
                    imageProxy = null;
                }
                if (imageProxy == null || this.mUnAcquiredAvailableImageCount <= 0) {
                    break;
                }
            } while (size < imageReaderProxy.getMaxImages());
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.mLock) {
            dequeImageProxy(imageProxy);
        }
    }

    public void resultIncoming(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mPendingImageInfos.put(cameraCaptureResult.getTimestamp(), new androidx.camera.core.internal.CameraCaptureResultImageInfo(cameraCaptureResult));
            matchImages();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        synchronized (this.mLock) {
            onImageAvailableListener.getClass();
            this.mListener = onImageAvailableListener;
            executor.getClass();
            this.mExecutor = executor;
            this.mImageReaderProxy.setOnImageAvailableListener(this.mTransformedListener, executor);
        }
    }

    public MetadataImageReader(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.mLock = new java.lang.Object();
        this.mCameraCaptureCallback = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.core.MetadataImageReader.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                super.onCaptureCompleted(i17, cameraCaptureResult);
                androidx.camera.core.MetadataImageReader.this.resultIncoming(cameraCaptureResult);
            }
        };
        this.mUnAcquiredAvailableImageCount = 0;
        this.mTransformedListener = new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.MetadataImageReader$$b
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy2) {
                androidx.camera.core.MetadataImageReader.this.lambda$new$0(imageReaderProxy2);
            }
        };
        this.mClosed = false;
        this.mPendingImageInfos = new android.util.LongSparseArray<>();
        this.mPendingImages = new android.util.LongSparseArray<>();
        this.mAcquiredImageProxies = new java.util.ArrayList();
        this.mImageReaderProxy = imageReaderProxy;
        this.mImageProxiesIndex = 0;
        this.mMatchedImageProxies = new java.util.ArrayList(getMaxImages());
    }
}
