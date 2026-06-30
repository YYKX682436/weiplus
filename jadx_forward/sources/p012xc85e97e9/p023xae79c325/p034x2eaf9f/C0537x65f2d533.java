package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ImageProxyDownsampler */
/* loaded from: classes14.dex */
final class C0537x65f2d533 {

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod */
    /* loaded from: classes.dex */
    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$ForwardingImageProxyImpl */
    /* loaded from: classes14.dex */
    public static final class ForwardingImageProxyImpl extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0 {

        /* renamed from: mDownsampledHeight */
        private final int f1124xc7b5d372;

        /* renamed from: mDownsampledPlanes */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] f1125xd5bbb3e2;

        /* renamed from: mDownsampledWidth */
        private final int f1126xd5b9f61b;

        public ForwardingImageProxyImpl(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] planeProxyArr, int i17, int i18) {
            super(interfaceC0536x1ffeadf3);
            this.f1125xd5bbb3e2 = planeProxyArr;
            this.f1126xd5b9f61b = i17;
            this.f1124xc7b5d372 = i18;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
        /* renamed from: getHeight */
        public int mo4171x1c4fb41d() {
            return this.f1124xc7b5d372;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
        /* renamed from: getPlanes */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] mo4174x2a55948d() {
            return this.f1125xd5bbb3e2;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
        /* renamed from: getWidth */
        public int mo4175x755bd410() {
            return this.f1126xd5b9f61b;
        }
    }

    private C0537x65f2d533() {
    }

    /* renamed from: createPlaneProxy */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy m4646xa2058b8e(int i17, int i18, byte[] bArr) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy(bArr, i17, i18) { // from class: androidx.camera.core.ImageProxyDownsampler.1

            /* renamed from: mBuffer */
            final java.nio.ByteBuffer f1117xfd47bb0d;

            /* renamed from: val$data */
            final /* synthetic */ byte[] f1118xa77cc34d;

            /* renamed from: val$pixelStride */
            final /* synthetic */ int f1119x6be1fffc;

            /* renamed from: val$rowStride */
            final /* synthetic */ int f1120x41dfb390;

            {
                this.f1118xa77cc34d = bArr;
                this.f1120x41dfb390 = i17;
                this.f1119x6be1fffc = i18;
                this.f1117xfd47bb0d = java.nio.ByteBuffer.wrap(bArr);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
            /* renamed from: getBuffer */
            public java.nio.ByteBuffer mo4177x12f2b736() {
                return this.f1117xfd47bb0d;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
            /* renamed from: getPixelStride */
            public int mo4178x9149e7c9() {
                return this.f1119x6be1fffc;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
            /* renamed from: getRowStride */
            public int mo4179x3bc92a9d() {
                return this.f1120x41dfb390;
            }
        };
    }

    /* renamed from: downsample */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0 m4647x84bd18cc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, int i17, int i18, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0537x65f2d533.DownsamplingMethod downsamplingMethod) {
        int i19;
        byte[] bArr;
        if (interfaceC0536x1ffeadf3.mo4170x19771aed() != 35) {
            throw new java.lang.UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (interfaceC0536x1ffeadf3.mo4175x755bd410() < i17 || interfaceC0536x1ffeadf3.mo4171x1c4fb41d() < i18) {
            throw new java.lang.IllegalArgumentException("Downsampled dimension " + new android.util.Size(i17, i18) + " is not <= original dimension " + new android.util.Size(interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d()) + ".");
        }
        if (interfaceC0536x1ffeadf3.mo4175x755bd410() == i17 && interfaceC0536x1ffeadf3.mo4171x1c4fb41d() == i18) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0537x65f2d533.ForwardingImageProxyImpl(interfaceC0536x1ffeadf3, interfaceC0536x1ffeadf3.mo4174x2a55948d(), i17, i18);
        }
        int[] iArr = {interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4175x755bd410() / 2, interfaceC0536x1ffeadf3.mo4175x755bd410() / 2};
        int[] iArr2 = {interfaceC0536x1ffeadf3.mo4171x1c4fb41d(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d() / 2, interfaceC0536x1ffeadf3.mo4171x1c4fb41d() / 2};
        int i27 = i17 / 2;
        int[] iArr3 = {i17, i27, i27};
        int i28 = i18 / 2;
        int[] iArr4 = {i18, i28, i28};
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] planeProxyArr = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[3];
        int i29 = 0;
        for (int i37 = 3; i29 < i37; i37 = 3) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy planeProxy = interfaceC0536x1ffeadf3.mo4174x2a55948d()[i29];
            java.nio.ByteBuffer mo4177x12f2b736 = planeProxy.mo4177x12f2b736();
            byte[] bArr2 = new byte[iArr3[i29] * iArr4[i29]];
            int ordinal = downsamplingMethod.ordinal();
            if (ordinal == 0) {
                i19 = 1;
                bArr = bArr2;
                m4649xa4a7ae1c(mo4177x12f2b736, iArr[i29], planeProxy.mo4178x9149e7c9(), planeProxy.mo4179x3bc92a9d(), iArr2[i29], bArr, iArr3[i29], iArr4[i29]);
            } else if (ordinal != 1) {
                i19 = 1;
                bArr = bArr2;
            } else {
                i19 = 1;
                m4648xf0f57546(mo4177x12f2b736, iArr[i29], planeProxy.mo4178x9149e7c9(), planeProxy.mo4179x3bc92a9d(), iArr2[i29], bArr2, iArr3[i29], iArr4[i29]);
                bArr = bArr2;
            }
            planeProxyArr[i29] = m4646xa2058b8e(iArr3[i29], i19, bArr);
            i29++;
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0537x65f2d533.ForwardingImageProxyImpl(interfaceC0536x1ffeadf3, planeProxyArr, i17, i18);
    }

    /* renamed from: resizeAveraging */
    private static void m4648xf0f57546(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, byte[] bArr, int i28, int i29) {
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

    /* renamed from: resizeNearestNeighbor */
    private static void m4649xa4a7ae1c(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, byte[] bArr, int i28, int i29) {
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
