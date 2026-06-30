package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AndroidImageProxy */
/* loaded from: classes14.dex */
final class C0451xf2492582 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 {

    /* renamed from: mImage */
    private final android.media.Image f786xbe37f4ee;

    /* renamed from: mImageInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 f787x465aa6bc;

    /* renamed from: mPlanes */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0451xf2492582.PlaneProxy[] f788x14aa9864;

    /* renamed from: androidx.camera.core.AndroidImageProxy$PlaneProxy */
    /* loaded from: classes14.dex */
    public static final class PlaneProxy implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy {

        /* renamed from: mPlane */
        private final android.media.Image.Plane f789xbe9a25ef;

        public PlaneProxy(android.media.Image.Plane plane) {
            this.f789xbe9a25ef = plane;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
        /* renamed from: getBuffer */
        public java.nio.ByteBuffer mo4177x12f2b736() {
            return this.f789xbe9a25ef.getBuffer();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
        /* renamed from: getPixelStride */
        public int mo4178x9149e7c9() {
            return this.f789xbe9a25ef.getPixelStride();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy
        /* renamed from: getRowStride */
        public int mo4179x3bc92a9d() {
            return this.f789xbe9a25ef.getRowStride();
        }
    }

    public C0451xf2492582(android.media.Image image) {
        this.f786xbe37f4ee = image;
        android.media.Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f788x14aa9864 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0451xf2492582.PlaneProxy[planes.length];
            for (int i17 = 0; i17 < planes.length; i17++) {
                this.f788x14aa9864[i17] = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0451xf2492582.PlaneProxy(planes[i17]);
            }
        } else {
            this.f788x14aa9864 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0451xf2492582.PlaneProxy[0];
        }
        this.f787x465aa6bc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167.m4658xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c.m5701x298eb42f(), image.getTimestamp(), 0, new android.graphics.Matrix());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3, java.lang.AutoCloseable
    public void close() {
        this.f786xbe37f4ee.close();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getCropRect */
    public android.graphics.Rect mo4169xfa2ffe0a() {
        return this.f786xbe37f4ee.getCropRect();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getFormat */
    public int mo4170x19771aed() {
        return this.f786xbe37f4ee.getFormat();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getHeight */
    public int mo4171x1c4fb41d() {
        return this.f786xbe37f4ee.getHeight();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getImage */
    public android.media.Image mo4172x74984fa5() {
        return this.f786xbe37f4ee;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getImageInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 mo4173xcb10cdf3() {
        return this.f787x465aa6bc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getPlanes */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] mo4174x2a55948d() {
        return this.f788x14aa9864;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getWidth */
    public int mo4175x755bd410() {
        return this.f786xbe37f4ee.getWidth();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: setCropRect */
    public void mo4176xf4e85f16(android.graphics.Rect rect) {
        this.f786xbe37f4ee.setCropRect(rect);
    }
}
