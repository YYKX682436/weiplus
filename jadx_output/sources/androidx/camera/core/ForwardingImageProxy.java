package androidx.camera.core;

/* loaded from: classes14.dex */
public abstract class ForwardingImageProxy implements androidx.camera.core.ImageProxy {
    protected final androidx.camera.core.ImageProxy mImage;
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.Set<androidx.camera.core.ForwardingImageProxy.OnImageCloseListener> mOnImageCloseListeners = new java.util.HashSet();

    /* loaded from: classes14.dex */
    public interface OnImageCloseListener {
        void onImageClose(androidx.camera.core.ImageProxy imageProxy);
    }

    public ForwardingImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        this.mImage = imageProxy;
    }

    public void addOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        synchronized (this.mLock) {
            this.mOnImageCloseListeners.add(onImageCloseListener);
        }
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        this.mImage.close();
        notifyOnImageCloseListeners();
    }

    @Override // androidx.camera.core.ImageProxy
    public android.graphics.Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        return this.mImage.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.mImage.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public android.media.Image getImage() {
        return this.mImage.getImage();
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageInfo getImageInfo() {
        return this.mImage.getImageInfo();
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
        return this.mImage.getPlanes();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.mImage.getWidth();
    }

    public void notifyOnImageCloseListeners() {
        java.util.HashSet hashSet;
        synchronized (this.mLock) {
            hashSet = new java.util.HashSet(this.mOnImageCloseListeners);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.camera.core.ForwardingImageProxy.OnImageCloseListener) it.next()).onImageClose(this);
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(android.graphics.Rect rect) {
        this.mImage.setCropRect(rect);
    }
}
