package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class SingleImageProxyBundle implements androidx.camera.core.impl.ImageProxyBundle {
    private final int mCaptureId;
    private final androidx.camera.core.ImageProxy mImageProxy;

    public SingleImageProxyBundle(androidx.camera.core.ImageProxy imageProxy, java.lang.String str) {
        androidx.camera.core.ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo != null) {
            java.lang.Integer num = (java.lang.Integer) imageInfo.getTagBundle().getTag(str);
            if (num != null) {
                this.mCaptureId = num.intValue();
                this.mImageProxy = imageProxy;
                return;
            }
            throw new java.lang.IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new java.lang.IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    public void close() {
        this.mImageProxy.close();
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public java.util.List<java.lang.Integer> getCaptureIds() {
        return java.util.Collections.singletonList(java.lang.Integer.valueOf(this.mCaptureId));
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public wa.a getImageProxy(int i17) {
        return i17 != this.mCaptureId ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException("Capture id does not exist in the bundle")) : androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.mImageProxy);
    }

    public SingleImageProxyBundle(androidx.camera.core.ImageProxy imageProxy, int i17) {
        this.mCaptureId = i17;
        this.mImageProxy = imageProxy;
    }
}
