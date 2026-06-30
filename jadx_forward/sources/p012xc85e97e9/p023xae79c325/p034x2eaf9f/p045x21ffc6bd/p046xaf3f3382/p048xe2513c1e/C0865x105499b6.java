package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e;

/* renamed from: androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector */
/* loaded from: classes13.dex */
public class C0865x105499b6 {

    /* renamed from: mQuirk */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0855x81969d42 f2108xbeac7351;

    public C0865x105499b6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f2108xbeac7351 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0855x81969d42) c0744x90dabc95.get(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0855x81969d42.class);
    }

    /* renamed from: jpegImageToJpegByteArray */
    public byte[] m6200x3d94199b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0855x81969d42 c0855x81969d42 = this.f2108xbeac7351;
        if (c0855x81969d42 != null) {
            return c0855x81969d42.m6184x3d94199b(interfaceC0536x1ffeadf3);
        }
        java.nio.ByteBuffer mo4177x12f2b736 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736();
        byte[] bArr = new byte[mo4177x12f2b736.capacity()];
        mo4177x12f2b736.rewind();
        mo4177x12f2b736.get(bArr);
        return bArr;
    }

    /* renamed from: needCorrectJpegMetadata */
    public boolean m6201x3bc60cb() {
        return this.f2108xbeac7351 != null;
    }
}
