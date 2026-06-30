package androidx.camera.core;

/* loaded from: classes14.dex */
final class AndroidImageProxy implements androidx.camera.core.ImageProxy {
    private final android.media.Image mImage;
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final androidx.camera.core.AndroidImageProxy.PlaneProxy[] mPlanes;

    /* loaded from: classes14.dex */
    public static final class PlaneProxy implements androidx.camera.core.ImageProxy.PlaneProxy {
        private final android.media.Image.Plane mPlane;

        public PlaneProxy(android.media.Image.Plane plane) {
            this.mPlane = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public java.nio.ByteBuffer getBuffer() {
            return this.mPlane.getBuffer();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return this.mPlane.getPixelStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return this.mPlane.getRowStride();
        }
    }

    public AndroidImageProxy(android.media.Image image) {
        this.mImage = image;
        android.media.Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.mPlanes = new androidx.camera.core.AndroidImageProxy.PlaneProxy[planes.length];
            for (int i17 = 0; i17 < planes.length; i17++) {
                this.mPlanes[i17] = new androidx.camera.core.AndroidImageProxy.PlaneProxy(planes[i17]);
            }
        } else {
            this.mPlanes = new androidx.camera.core.AndroidImageProxy.PlaneProxy[0];
        }
        this.mImageInfo = androidx.camera.core.ImmutableImageInfo.create(androidx.camera.core.impl.TagBundle.emptyBundle(), image.getTimestamp(), 0, new android.graphics.Matrix());
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        this.mImage.close();
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
        return this.mImage;
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageInfo getImageInfo() {
        return this.mImageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
        return this.mPlanes;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.mImage.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(android.graphics.Rect rect) {
        this.mImage.setCropRect(rect);
    }
}
