package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.Packet */
/* loaded from: classes14.dex */
public abstract class AbstractC0903x8e0938a8<T> {
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> of(android.graphics.Bitmap bitmap, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, android.graphics.Rect rect, int i17, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0876x1887baa5(bitmap, c0785x212d30, 42, new android.util.Size(bitmap.getWidth(), bitmap.getHeight()), rect, i17, matrix, interfaceC0663xe081a7be);
    }

    /* renamed from: getCameraCaptureResult */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be mo6254xedfdbca8();

    /* renamed from: getCropRect */
    public abstract android.graphics.Rect mo6255xfa2ffe0a();

    /* renamed from: getData */
    public abstract T mo6256xfb7e5820();

    /* renamed from: getExif */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 mo6257xfb7f2186();

    /* renamed from: getFormat */
    public abstract int mo6258x19771aed();

    /* renamed from: getRotationDegrees */
    public abstract int mo6259x2a7ffb93();

    /* renamed from: getSensorToBufferTransform */
    public abstract android.graphics.Matrix mo6260x65554241();

    /* renamed from: getSize */
    public abstract android.util.Size mo6261xfb854877();

    /* renamed from: hasCropping */
    public boolean m6318x29b830bc() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5955x29b830bc(mo6255xfa2ffe0a(), mo6261xfb854877());
    }

    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, android.graphics.Rect rect, int i17, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        return of(interfaceC0536x1ffeadf3, c0785x212d30, new android.util.Size(interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d()), rect, i17, matrix, interfaceC0663xe081a7be);
    }

    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, android.util.Size size, android.graphics.Rect rect, int i17, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6222xb838964a(interfaceC0536x1ffeadf3.mo4170x19771aed())) {
            m3.h.d(c0785x212d30, "JPEG image must have Exif.");
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0876x1887baa5(interfaceC0536x1ffeadf3, c0785x212d30, interfaceC0536x1ffeadf3.mo4170x19771aed(), size, rect, i17, matrix, interfaceC0663xe081a7be);
    }

    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> of(byte[] bArr, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, int i17, android.util.Size size, android.graphics.Rect rect, int i18, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0876x1887baa5(bArr, c0785x212d30, i17, size, rect, i18, matrix, interfaceC0663xe081a7be);
    }
}
