package androidx.camera.core;

/* loaded from: classes14.dex */
final class SingleCloseImageProxy extends androidx.camera.core.ForwardingImageProxy {
    private final java.util.concurrent.atomic.AtomicBoolean mClosed;

    public SingleCloseImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        super(imageProxy);
        this.mClosed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        if (this.mClosed.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
