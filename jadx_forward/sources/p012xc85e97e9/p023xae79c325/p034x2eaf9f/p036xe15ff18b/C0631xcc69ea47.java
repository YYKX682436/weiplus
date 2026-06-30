package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.RgbaImageProxy */
/* loaded from: classes14.dex */
public final class C0631xcc69ea47 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 {

    /* renamed from: mCropRect */
    private final android.graphics.Rect f1398xa3536821;

    /* renamed from: mHeight */
    private final int f1399x6a4b7f4;

    /* renamed from: mImageInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 f1400x465aa6bc;

    /* renamed from: mLock */
    private final java.lang.Object f1401x6243b38;

    /* renamed from: mPlaneProxy */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] f1402x116811bf;

    /* renamed from: mWidth */
    private final int f1403xbefb7959;

    public C0631xcc69ea47(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> abstractC0903x8e0938a8) {
        this(abstractC0903x8e0938a8.mo6256xfb7e5820(), abstractC0903x8e0938a8.mo6255xfa2ffe0a(), abstractC0903x8e0938a8.mo6259x2a7ffb93(), abstractC0903x8e0938a8.mo6260x65554241(), abstractC0903x8e0938a8.mo6254xedfdbca8().mo2936x2b69a60());
    }

    /* renamed from: checkNotClosed */
    private void m5060x9e8331f7() {
        synchronized (this.f1401x6243b38) {
            m3.h.e(this.f1402x116811bf != null, "The image is closed.");
        }
    }

    /* renamed from: createImageInfo */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 m5061x744f370d(final long j17, final int i17, final android.graphics.Matrix matrix) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.2
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
            /* renamed from: getRotationDegrees */
            public int mo4209x2a7ffb93() {
                return i17;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
            /* renamed from: getSensorToBufferTransformMatrix */
            public android.graphics.Matrix mo4210xa4435162() {
                return new android.graphics.Matrix(matrix);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
            /* renamed from: getTagBundle */
            public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c mo4211x4aa7b206() {
                throw new java.lang.UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
            /* renamed from: getTimestamp */
            public long mo4212x2b69a60() {
                return j17;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
            /* renamed from: populateExifData */
            public void mo4612xd74657e4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder builder) {
                throw new java.lang.UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
            }
        };
    }

    /* renamed from: createPlaneProxy */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy m5062xa2058b8e(final java.nio.ByteBuffer byteBuffer, final int i17, final int i18) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
            /* renamed from: getBuffer */
            public java.nio.ByteBuffer mo4177x12f2b736() {
                return byteBuffer;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
            /* renamed from: getPixelStride */
            public int mo4178x9149e7c9() {
                return i18;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
            /* renamed from: getRowStride */
            public int mo4179x3bc92a9d() {
                return i17;
            }
        };
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            this.f1402x116811bf = null;
        }
    }

    /* renamed from: createBitmap */
    public android.graphics.Bitmap m5063x3dedd14b() {
        android.graphics.Bitmap m6213x1efb9fc7;
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            m6213x1efb9fc7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6213x1efb9fc7(mo4174x2a55948d(), mo4175x755bd410(), mo4171x1c4fb41d());
        }
        return m6213x1efb9fc7;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getCropRect */
    public android.graphics.Rect mo4169xfa2ffe0a() {
        android.graphics.Rect rect;
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            rect = this.f1398xa3536821;
        }
        return rect;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getFormat */
    public int mo4170x19771aed() {
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
        }
        return 1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getHeight */
    public int mo4171x1c4fb41d() {
        int i17;
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            i17 = this.f1399x6a4b7f4;
        }
        return i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getImage */
    public android.media.Image mo4172x74984fa5() {
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
        }
        return null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getImageInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 mo4173xcb10cdf3() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 interfaceC0531x43157c89;
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            interfaceC0531x43157c89 = this.f1400x465aa6bc;
        }
        return interfaceC0531x43157c89;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getPlanes */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] mo4174x2a55948d() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] planeProxyArr;
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] planeProxyArr2 = this.f1402x116811bf;
            java.util.Objects.requireNonNull(planeProxyArr2);
            planeProxyArr = planeProxyArr2;
        }
        return planeProxyArr;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getWidth */
    public int mo4175x755bd410() {
        int i17;
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            i17 = this.f1403xbefb7959;
        }
        return i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: setCropRect */
    public void mo4176xf4e85f16(android.graphics.Rect rect) {
        synchronized (this.f1401x6243b38) {
            m5060x9e8331f7();
            if (rect != null) {
                this.f1398xa3536821.set(rect);
            }
        }
    }

    public C0631xcc69ea47(android.graphics.Bitmap bitmap, android.graphics.Rect rect, int i17, android.graphics.Matrix matrix, long j17) {
        this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6215x3448d14d(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i17, matrix, j17);
    }

    public C0631xcc69ea47(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, android.graphics.Rect rect, int i27, android.graphics.Matrix matrix, long j17) {
        this.f1401x6243b38 = new java.lang.Object();
        this.f1403xbefb7959 = i18;
        this.f1399x6a4b7f4 = i19;
        this.f1398xa3536821 = rect;
        this.f1400x465aa6bc = m5061x744f370d(j17, i27, matrix);
        byteBuffer.rewind();
        this.f1402x116811bf = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[]{m5062xa2058b8e(byteBuffer, i18 * i17, i17)};
    }
}
