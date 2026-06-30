package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public final class RgbaImageProxy implements androidx.camera.core.ImageProxy {
    private final android.graphics.Rect mCropRect;
    private final int mHeight;
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final java.lang.Object mLock;
    androidx.camera.core.ImageProxy.PlaneProxy[] mPlaneProxy;
    private final int mWidth;

    public RgbaImageProxy(androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet) {
        this(packet.getData(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult().getTimestamp());
    }

    private void checkNotClosed() {
        synchronized (this.mLock) {
            m3.h.e(this.mPlaneProxy != null, "The image is closed.");
        }
    }

    private static androidx.camera.core.ImageInfo createImageInfo(final long j17, final int i17, final android.graphics.Matrix matrix) {
        return new androidx.camera.core.ImageInfo() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.2
            @Override // androidx.camera.core.ImageInfo
            public int getRotationDegrees() {
                return i17;
            }

            @Override // androidx.camera.core.ImageInfo
            public android.graphics.Matrix getSensorToBufferTransformMatrix() {
                return new android.graphics.Matrix(matrix);
            }

            @Override // androidx.camera.core.ImageInfo
            public androidx.camera.core.impl.TagBundle getTagBundle() {
                throw new java.lang.UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
            }

            @Override // androidx.camera.core.ImageInfo
            public long getTimestamp() {
                return j17;
            }

            @Override // androidx.camera.core.ImageInfo
            public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
                throw new java.lang.UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
            }
        };
    }

    private static androidx.camera.core.ImageProxy.PlaneProxy createPlaneProxy(final java.nio.ByteBuffer byteBuffer, final int i17, final int i18) {
        return new androidx.camera.core.ImageProxy.PlaneProxy() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.1
            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public java.nio.ByteBuffer getBuffer() {
                return byteBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return i18;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return i17;
            }
        };
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            checkNotClosed();
            this.mPlaneProxy = null;
        }
    }

    public android.graphics.Bitmap createBitmap() {
        android.graphics.Bitmap createBitmapFromPlane;
        synchronized (this.mLock) {
            checkNotClosed();
            createBitmapFromPlane = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromPlane(getPlanes(), getWidth(), getHeight());
        }
        return createBitmapFromPlane;
    }

    @Override // androidx.camera.core.ImageProxy
    public android.graphics.Rect getCropRect() {
        android.graphics.Rect rect;
        synchronized (this.mLock) {
            checkNotClosed();
            rect = this.mCropRect;
        }
        return rect;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        synchronized (this.mLock) {
            checkNotClosed();
        }
        return 1;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        int i17;
        synchronized (this.mLock) {
            checkNotClosed();
            i17 = this.mHeight;
        }
        return i17;
    }

    @Override // androidx.camera.core.ImageProxy
    public android.media.Image getImage() {
        synchronized (this.mLock) {
            checkNotClosed();
        }
        return null;
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageInfo getImageInfo() {
        androidx.camera.core.ImageInfo imageInfo;
        synchronized (this.mLock) {
            checkNotClosed();
            imageInfo = this.mImageInfo;
        }
        return imageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
        androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr;
        synchronized (this.mLock) {
            checkNotClosed();
            androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr2 = this.mPlaneProxy;
            java.util.Objects.requireNonNull(planeProxyArr2);
            planeProxyArr = planeProxyArr2;
        }
        return planeProxyArr;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        int i17;
        synchronized (this.mLock) {
            checkNotClosed();
            i17 = this.mWidth;
        }
        return i17;
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(android.graphics.Rect rect) {
        synchronized (this.mLock) {
            checkNotClosed();
            if (rect != null) {
                this.mCropRect.set(rect);
            }
        }
    }

    public RgbaImageProxy(android.graphics.Bitmap bitmap, android.graphics.Rect rect, int i17, android.graphics.Matrix matrix, long j17) {
        this(androidx.camera.core.internal.utils.ImageUtil.createDirectByteBuffer(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i17, matrix, j17);
    }

    public RgbaImageProxy(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, android.graphics.Rect rect, int i27, android.graphics.Matrix matrix, long j17) {
        this.mLock = new java.lang.Object();
        this.mWidth = i18;
        this.mHeight = i19;
        this.mCropRect = rect;
        this.mImageInfo = createImageInfo(j17, i27, matrix);
        byteBuffer.rewind();
        this.mPlaneProxy = new androidx.camera.core.ImageProxy.PlaneProxy[]{createPlaneProxy(byteBuffer, i18 * i17, i17)};
    }
}
