package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.ImagePipeline */
/* loaded from: classes14.dex */
public class C0610x6ae15cfd {

    /* renamed from: EXIF_ROTATION_AVAILABILITY */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0863xe40f1549 f1345xc51eca8d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0863xe40f1549();

    /* renamed from: JPEG_QUALITY_MAX_QUALITY */
    static final byte f1346xaf340f2d = 100;

    /* renamed from: JPEG_QUALITY_MIN_LATENCY */
    static final byte f1347x5d3bce1a = 95;

    /* renamed from: sNextRequestId */
    private static int f1348x48ed8ca4;

    /* renamed from: mCaptureConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 f1349xb46532bb;

    /* renamed from: mCaptureNode */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48 f1350xb3c0e7bb;

    /* renamed from: mPipelineIn */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In f1351x9c048bb4;

    /* renamed from: mProcessingNode */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5 f1352x125e9982;

    /* renamed from: mUseCaseConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad f1353xaebf740c;

    public C0610x6ae15cfd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad, android.util.Size size) {
        this(c0713xaaf0b8ad, size, null, false, null, 35);
    }

    /* renamed from: createCameraRequest */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0596x2447138a m4963x5557ec0e(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 interfaceC0689x87960748, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc interfaceC0632x6c3ecfbc) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String valueOf = java.lang.String.valueOf(interfaceC0689x87960748.hashCode());
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78> mo4360x32450065 = interfaceC0689x87960748.mo4360x32450065();
        java.util.Objects.requireNonNull(mo4360x32450065);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78 interfaceC0691x36dafb78 : mo4360x32450065) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
            builder.m5366x5d0f9056(this.f1349xb46532bb.m5337x26c6954a());
            builder.m5347x2f697c6b(this.f1349xb46532bb.m5333xca0018d6());
            builder.m5343xc7f822cd(abstractC0637xf28cf838.mo4922x2c9b21cf());
            builder.m5348x34744cc(this.f1351x9c048bb4.m4955xcf572877());
            builder.m5364x9b39c37a(m4967xfd02467b());
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6222xb838964a(this.f1351x9c048bb4.mo4876xb124032b())) {
                if (f1345xc51eca8d.m6196x7957b7d1()) {
                    builder.m5346xcffb2508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1604x5742e808, java.lang.Integer.valueOf(abstractC0637xf28cf838.mo4920x2a7ffb93()));
                }
                builder.m5346xcffb2508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1602x542c7792, java.lang.Integer.valueOf(m4972xfd7ffae3(abstractC0637xf28cf838)));
            }
            builder.m5347x2f697c6b(interfaceC0691x36dafb78.mo5369x16b6e672().m5333xca0018d6());
            builder.m5349xab35ff39(valueOf, java.lang.Integer.valueOf(interfaceC0691x36dafb78.mo5370x5db1b11()));
            builder.m5362x684351d(i17);
            builder.m5345xd4aa81a5(this.f1351x9c048bb4.m4953x6f411e10());
            arrayList.add(builder.m5350x59bc66e());
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0596x2447138a(arrayList, interfaceC0632x6c3ecfbc);
    }

    /* renamed from: createCaptureBundle */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m4964xb8a6dfcc() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m5454x155693b2 = this.f1353xaebf740c.m5454x155693b2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0486x6b2ae22b.m4359x55d6e70f());
        java.util.Objects.requireNonNull(m5454x155693b2);
        return m5454x155693b2;
    }

    /* renamed from: createProcessingRequest */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc m4965xd3fe0660(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 interfaceC0689x87960748, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc interfaceC0632x6c3ecfbc, wa.a aVar) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc(interfaceC0689x87960748, abstractC0637xf28cf838.mo4919xf578610b(), abstractC0637xf28cf838.mo4915xfa2ffe0a(), abstractC0637xf28cf838.mo4920x2a7ffb93(), abstractC0637xf28cf838.mo4917x354bfa41(), abstractC0637xf28cf838.mo4921x65554241(), interfaceC0632x6c3ecfbc, aVar, i17);
    }

    /* renamed from: getOutputFormat */
    private int m4966x42b80ace() {
        java.lang.Integer num = (java.lang.Integer) this.f1353xaebf740c.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1670xf700768c, null);
        if (num != null) {
            return num.intValue();
        }
        java.lang.Integer num2 = (java.lang.Integer) this.f1353xaebf740c.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    /* renamed from: shouldEnablePostview */
    private boolean m4967xfd02467b() {
        return this.f1351x9c048bb4.m4954x55dd8b72() != null;
    }

    /* renamed from: close */
    public void m4968x5a5ddf8() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1350xb3c0e7bb.mo4945x41012807();
        this.f1352x125e9982.mo4945x41012807();
    }

    /* renamed from: createRequests */
    public m3.d m4969x1f8ca8e0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc interfaceC0632x6c3ecfbc, wa.a aVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m4964xb8a6dfcc = m4964xb8a6dfcc();
        int i17 = f1348x48ed8ca4;
        f1348x48ed8ca4 = i17 + 1;
        return new m3.d(m4963x5557ec0e(i17, m4964xb8a6dfcc, abstractC0637xf28cf838, interfaceC0632x6c3ecfbc), m4965xd3fe0660(i17, m4964xb8a6dfcc, abstractC0637xf28cf838, interfaceC0632x6c3ecfbc, aVar));
    }

    /* renamed from: createSessionConfigBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4970x7933c61f(android.util.Size size) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5603x51964ec6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder.m5603x51964ec6(this.f1353xaebf740c, size);
        m5603x51964ec6.m5611x96a2a8d2(this.f1351x9c048bb4.m4955xcf572877());
        if (this.f1351x9c048bb4.m4954x55dd8b72() != null) {
            m5603x51964ec6.m5628x8cb424e6(this.f1351x9c048bb4.m4954x55dd8b72());
        }
        return m5603x51964ec6;
    }

    /* renamed from: expectsMetadata */
    public boolean m4971x7f6ea489() {
        return this.f1350xb3c0e7bb.m4942x480634e5().m4762x7e091286() instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f;
    }

    /* renamed from: getCameraRequestJpegQuality */
    public int m4972xfd7ffae3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838) {
        return ((abstractC0637xf28cf838.mo4918x263afd77() != null) && p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5955x29b830bc(abstractC0637xf28cf838.mo4915xfa2ffe0a(), this.f1351x9c048bb4.mo4881xfb854877())) ? abstractC0637xf28cf838.mo4914xe389a8d3() == 0 ? 100 : 95 : abstractC0637xf28cf838.mo4917x354bfa41();
    }

    /* renamed from: getCapacity */
    public int m4973x77cf5230() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        return this.f1350xb3c0e7bb.m4940x77cf5230();
    }

    /* renamed from: getCaptureNode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48 m4974xe38a1d32() {
        return this.f1350xb3c0e7bb;
    }

    /* renamed from: getPostviewSize */
    public android.util.Size m4975x811b3f5c() {
        return this.f1351x9c048bb4.mo4879x811b3f5c();
    }

    /* renamed from: getProcessingNode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5 m4976xfa435cab() {
        return this.f1352x125e9982;
    }

    /* renamed from: notifyCaptureError */
    public void m4977x71cefc4b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError captureError) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1351x9c048bb4.mo4874x130ae12f().mo3938xab27b508(captureError);
    }

    /* renamed from: setOnImageCloseListener */
    public void m4978xe2f5fcf2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener onImageCloseListener) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1350xb3c0e7bb.m4947xe2f5fcf2(onImageCloseListener);
    }

    /* renamed from: submitProcessingRequest */
    public void m4979x6eae02c4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1351x9c048bb4.mo4880x1e5c3bb6().mo3938xab27b508(c0627xbfd50fdc);
    }

    public C0610x6ae15cfd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36, boolean z17) {
        this(c0713xaaf0b8ad, size, abstractC0468xb9790d36, z17, null, 35);
    }

    public C0610x6ae15cfd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36, boolean z17, android.util.Size size2, int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1353xaebf740c = c0713xaaf0b8ad;
        this.f1349xb46532bb = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder.m5341x51964ec6(c0713xaaf0b8ad).m5350x59bc66e();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48 c0597x6d1d7e48 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48();
        this.f1350xb3c0e7bb = c0597x6d1d7e48;
        java.util.concurrent.Executor mo5462xe7ac9c0f = c0713xaaf0b8ad.mo5462xe7ac9c0f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5980xf96be419());
        java.util.Objects.requireNonNull(mo5462xe7ac9c0f);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5 c0618xcff25bd5 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5(mo5462xe7ac9c0f, abstractC0468xb9790d36 != null ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0897xd1ba49b4(abstractC0468xb9790d36) : null);
        this.f1352x125e9982 = c0618xcff25bd5;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In of6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In.of(size, c0713xaaf0b8ad.mo5446xb124032b(), m4966x42b80ace(), z17, c0713xaaf0b8ad.m5460x99a79697(), size2, i17);
        this.f1351x9c048bb4 = of6;
        c0618xcff25bd5.mo4948x3ebe6b6c(c0597x6d1d7e48.mo4948x3ebe6b6c(of6));
    }
}
