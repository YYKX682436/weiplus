package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.Image2JpegBytes */
/* loaded from: classes14.dex */
final class C0608x9870d44c implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]>> {

    /* renamed from: mJpegMetadataCorrector */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0865x105499b6 f1344x57450f69;

    /* renamed from: androidx.camera.core.imagecapture.Image2JpegBytes$In */
    /* loaded from: classes14.dex */
    public static abstract class In {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> abstractC0903x8e0938a8, int i17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0587x2d551495(abstractC0903x8e0938a8, i17);
        }

        /* renamed from: getJpegQuality */
        public abstract int mo4886x354bfa41();

        /* renamed from: getPacket */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> mo4887x29bb6f7e();
    }

    public C0608x9870d44c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f1344x57450f69 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0865x105499b6(c0744x90dabc95);
    }

    /* renamed from: extractExif */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 m4959x6c9fe131(byte[] bArr) {
        try {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.m5831x599f9544(new java.io.ByteArrayInputStream(bArr));
        } catch (java.io.IOException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(0, "Failed to extract Exif from YUV-generated JPEG", e17);
        }
    }

    /* renamed from: processJpegImage */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> m4960x6948a824(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In in6, int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> mo4887x29bb6f7e = in6.mo4887x29bb6f7e();
        byte[] m6200x3d94199b = this.f1344x57450f69.m6200x3d94199b(mo4887x29bb6f7e.mo6256xfb7e5820());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 mo6257xfb7f2186 = mo4887x29bb6f7e.mo6257xfb7f2186();
        java.util.Objects.requireNonNull(mo6257xfb7f2186);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8.of(m6200x3d94199b, mo6257xfb7f2186, i17, mo4887x29bb6f7e.mo6261xfb854877(), mo4887x29bb6f7e.mo6255xfa2ffe0a(), mo4887x29bb6f7e.mo6259x2a7ffb93(), mo4887x29bb6f7e.mo6260x65554241(), mo4887x29bb6f7e.mo6254xedfdbca8());
    }

    /* renamed from: processYuvImage */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> m4961x77508030(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In in6) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> mo4887x29bb6f7e = in6.mo4887x29bb6f7e();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo6256xfb7e5820 = mo4887x29bb6f7e.mo6256xfb7e5820();
        android.graphics.Rect mo6255xfa2ffe0a = mo4887x29bb6f7e.mo6255xfa2ffe0a();
        try {
            byte[] m6229xa5ff610d = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6229xa5ff610d(mo6256xfb7e5820, mo6255xfa2ffe0a, in6.mo4886x354bfa41(), mo4887x29bb6f7e.mo6259x2a7ffb93());
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8.of(m6229xa5ff610d, m4959x6c9fe131(m6229xa5ff610d), 256, new android.util.Size(mo6255xfa2ffe0a.width(), mo6255xfa2ffe0a.height()), new android.graphics.Rect(0, 0, mo6255xfa2ffe0a.width(), mo6255xfa2ffe0a.height()), mo4887x29bb6f7e.mo6259x2a7ffb93(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5972xf59ba76e(mo4887x29bb6f7e.mo6260x65554241(), mo6255xfa2ffe0a), mo4887x29bb6f7e.mo6254xedfdbca8());
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to encode the image to JPEG.", e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547
    /* renamed from: apply, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In in6) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> m4961x77508030;
        try {
            int mo6258x19771aed = in6.mo4887x29bb6f7e().mo6258x19771aed();
            if (mo6258x19771aed != 35) {
                if (mo6258x19771aed != 256 && mo6258x19771aed != 4101) {
                    throw new java.lang.IllegalArgumentException("Unexpected format: " + mo6258x19771aed);
                }
                m4961x77508030 = m4960x6948a824(in6, mo6258x19771aed);
            } else {
                m4961x77508030 = m4961x77508030(in6);
            }
            return m4961x77508030;
        } finally {
            in6.mo4887x29bb6f7e().mo6256xfb7e5820().close();
        }
    }
}
