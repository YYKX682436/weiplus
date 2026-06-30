package androidx.camera.core;

/* loaded from: classes14.dex */
final class ImageProxyDownsampler {

    /* loaded from: classes.dex */
    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    /* loaded from: classes14.dex */
    public static final class ForwardingImageProxyImpl extends androidx.camera.core.ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final androidx.camera.core.ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        public ForwardingImageProxyImpl(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr, int i17, int i18) {
            super(imageProxy);
            this.mDownsampledPlanes = planeProxyArr;
            this.mDownsampledWidth = i17;
            this.mDownsampledHeight = i18;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.mDownsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.mDownsampledWidth;
        }
    }

    private ImageProxyDownsampler() {
    }

    private static androidx.camera.core.ImageProxy.PlaneProxy createPlaneProxy(int i17, int i18, byte[] bArr) {
        return new androidx.camera.core.ImageProxy.PlaneProxy(bArr, i17, i18) { // from class: androidx.camera.core.ImageProxyDownsampler.1
            final java.nio.ByteBuffer mBuffer;
            final /* synthetic */ byte[] val$data;
            final /* synthetic */ int val$pixelStride;
            final /* synthetic */ int val$rowStride;

            {
                this.val$data = bArr;
                this.val$rowStride = i17;
                this.val$pixelStride = i18;
                this.mBuffer = java.nio.ByteBuffer.wrap(bArr);
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public java.nio.ByteBuffer getBuffer() {
                return this.mBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return this.val$pixelStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return this.val$rowStride;
            }
        };
    }

    public static androidx.camera.core.ForwardingImageProxy downsample(androidx.camera.core.ImageProxy imageProxy, int i17, int i18, androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod downsamplingMethod) {
        int i19;
        byte[] bArr;
        if (imageProxy.getFormat() != 35) {
            throw new java.lang.UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (imageProxy.getWidth() < i17 || imageProxy.getHeight() < i18) {
            throw new java.lang.IllegalArgumentException("Downsampled dimension " + new android.util.Size(i17, i18) + " is not <= original dimension " + new android.util.Size(imageProxy.getWidth(), imageProxy.getHeight()) + ".");
        }
        if (imageProxy.getWidth() == i17 && imageProxy.getHeight() == i18) {
            return new androidx.camera.core.ImageProxyDownsampler.ForwardingImageProxyImpl(imageProxy, imageProxy.getPlanes(), i17, i18);
        }
        int[] iArr = {imageProxy.getWidth(), imageProxy.getWidth() / 2, imageProxy.getWidth() / 2};
        int[] iArr2 = {imageProxy.getHeight(), imageProxy.getHeight() / 2, imageProxy.getHeight() / 2};
        int i27 = i17 / 2;
        int[] iArr3 = {i17, i27, i27};
        int i28 = i18 / 2;
        int[] iArr4 = {i18, i28, i28};
        androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr = new androidx.camera.core.ImageProxy.PlaneProxy[3];
        int i29 = 0;
        for (int i37 = 3; i29 < i37; i37 = 3) {
            androidx.camera.core.ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[i29];
            java.nio.ByteBuffer buffer = planeProxy.getBuffer();
            byte[] bArr2 = new byte[iArr3[i29] * iArr4[i29]];
            int ordinal = downsamplingMethod.ordinal();
            if (ordinal == 0) {
                i19 = 1;
                bArr = bArr2;
                resizeNearestNeighbor(buffer, iArr[i29], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i29], bArr, iArr3[i29], iArr4[i29]);
            } else if (ordinal != 1) {
                i19 = 1;
                bArr = bArr2;
            } else {
                i19 = 1;
                resizeAveraging(buffer, iArr[i29], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i29], bArr2, iArr3[i29], iArr4[i29]);
                bArr = bArr2;
            }
            planeProxyArr[i29] = createPlaneProxy(iArr3[i29], i19, bArr);
            i29++;
        }
        return new androidx.camera.core.ImageProxyDownsampler.ForwardingImageProxyImpl(imageProxy, planeProxyArr, i17, i18);
    }

    private static void resizeAveraging(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, byte[] bArr, int i28, int i29) {
        float f17 = i17 / i28;
        float f18 = i27 / i29;
        byte[] bArr2 = new byte[i19];
        byte[] bArr3 = new byte[i19];
        int[] iArr = new int[i28];
        int i37 = 0;
        for (int i38 = 0; i38 < i28; i38++) {
            iArr[i38] = ((int) (i38 * f17)) * i18;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            int i39 = 0;
            while (i39 < i29) {
                int i47 = (int) (i39 * f18);
                int i48 = i27 - 1;
                int min = java.lang.Math.min(i47, i48) * i19;
                int min2 = java.lang.Math.min(i47 + 1, i48) * i19;
                int i49 = i39 * i28;
                byteBuffer.position(min);
                byteBuffer.get(bArr2, i37, java.lang.Math.min(i19, byteBuffer.remaining()));
                byteBuffer.position(min2);
                byteBuffer.get(bArr3, i37, java.lang.Math.min(i19, byteBuffer.remaining()));
                for (int i57 = i37; i57 < i28; i57++) {
                    int i58 = iArr[i57];
                    bArr[i49 + i57] = (byte) ((((((bArr2[i58] & 255) + (bArr2[i58 + i18] & 255)) + (bArr3[i58] & 255)) + (bArr3[i58 + i18] & 255)) / 4) & 255);
                }
                i39++;
                i37 = 0;
            }
        }
    }

    private static void resizeNearestNeighbor(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, byte[] bArr, int i28, int i29) {
        float f17 = i17 / i28;
        float f18 = i27 / i29;
        byte[] bArr2 = new byte[i19];
        int[] iArr = new int[i28];
        for (int i37 = 0; i37 < i28; i37++) {
            iArr[i37] = ((int) (i37 * f17)) * i18;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            for (int i38 = 0; i38 < i29; i38++) {
                int i39 = i38 * i28;
                byteBuffer.position(java.lang.Math.min((int) (i38 * f18), i27 - 1) * i19);
                byteBuffer.get(bArr2, 0, java.lang.Math.min(i19, byteBuffer.remaining()));
                for (int i47 = 0; i47 < i28; i47++) {
                    bArr[i39 + i47] = bArr2[iArr[i47]];
                }
            }
        }
    }
}
