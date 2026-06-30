package androidx.camera.core;

/* loaded from: classes14.dex */
public final class SettableImageProxy extends androidx.camera.core.ForwardingImageProxy {
    private android.graphics.Rect mCropRect;
    private final int mHeight;
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final java.lang.Object mLock;
    private final int mWidth;

    public SettableImageProxy(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageInfo imageInfo) {
        this(imageProxy, null, imageInfo);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public android.graphics.Rect getCropRect() {
        synchronized (this.mLock) {
            if (this.mCropRect == null) {
                return new android.graphics.Rect(0, 0, getWidth(), getHeight());
            }
            return new android.graphics.Rect(this.mCropRect);
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.mHeight;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageInfo getImageInfo() {
        return this.mImageInfo;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.mWidth;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public void setCropRect(android.graphics.Rect rect) {
        if (rect != null) {
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.mLock) {
            this.mCropRect = rect;
        }
    }

    public SettableImageProxy(androidx.camera.core.ImageProxy imageProxy, android.util.Size size, androidx.camera.core.ImageInfo imageInfo) {
        super(imageProxy);
        this.mLock = new java.lang.Object();
        if (size == null) {
            this.mWidth = super.getWidth();
            this.mHeight = super.getHeight();
        } else {
            this.mWidth = size.getWidth();
            this.mHeight = size.getHeight();
        }
        this.mImageInfo = imageInfo;
    }
}
