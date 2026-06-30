package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ImageProxy */
/* loaded from: classes14.dex */
public interface InterfaceC0536x1ffeadf3 extends java.lang.AutoCloseable {

    /* renamed from: androidx.camera.core.ImageProxy$PlaneProxy */
    /* loaded from: classes14.dex */
    public interface PlaneProxy {
        /* renamed from: getBuffer */
        java.nio.ByteBuffer mo4177x12f2b736();

        /* renamed from: getPixelStride */
        int mo4178x9149e7c9();

        /* renamed from: getRowStride */
        int mo4179x3bc92a9d();
    }

    @Override // java.lang.AutoCloseable
    void close();

    /* renamed from: getCropRect */
    android.graphics.Rect mo4169xfa2ffe0a();

    /* renamed from: getFormat */
    int mo4170x19771aed();

    /* renamed from: getHeight */
    int mo4171x1c4fb41d();

    /* renamed from: getImage */
    android.media.Image mo4172x74984fa5();

    /* renamed from: getImageInfo */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 mo4173xcb10cdf3();

    /* renamed from: getPlanes */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] mo4174x2a55948d();

    /* renamed from: getWidth */
    int mo4175x755bd410();

    /* renamed from: setCropRect */
    void mo4176xf4e85f16(android.graphics.Rect rect);

    /* renamed from: toBitmap */
    default android.graphics.Bitmap m4645x7879e38a() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6211x2497b748(this);
    }
}
