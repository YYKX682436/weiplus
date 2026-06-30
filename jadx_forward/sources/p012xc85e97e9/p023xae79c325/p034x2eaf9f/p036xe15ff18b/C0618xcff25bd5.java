package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.ProcessingNode */
/* loaded from: classes14.dex */
public class C0618xcff25bd5 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In, java.lang.Void> {
    private static final java.lang.String TAG = "ProcessingNode";

    /* renamed from: mBitmap2JpegBytes */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]>> f1363xe6ab75cd;

    /* renamed from: mBitmapEffect */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap>> f1364x6a65d0ad;

    /* renamed from: mBlockingExecutor */
    final java.util.concurrent.Executor f1365xfa1a8eb5;

    /* renamed from: mHasIncorrectJpegMetadataQuirk */
    private final boolean f1366x683245ef;

    /* renamed from: mImage2Bitmap */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3>, android.graphics.Bitmap> f1367x239ab353;

    /* renamed from: mImage2JpegBytes */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]>> f1368xa38c4c3f;

    /* renamed from: mImageProcessor */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0897xd1ba49b4 f1369xa1f32344;

    /* renamed from: mInput2Packet */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3>> f1370x5228155d;

    /* renamed from: mInputEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In f1371xe06e8eba;

    /* renamed from: mJpegBytes2CroppedBitmap */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap>> f1372xfc45d3f2;

    /* renamed from: mJpegBytes2Disk */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults> f1373x9e3947b9;

    /* renamed from: mJpegBytes2Image */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3>> f1374x2937b2bf;

    /* renamed from: mJpegImage2Result */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> f1375xa09a1449;

    /* renamed from: mQuirks */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 f1376x16e1f742;

    /* renamed from: androidx.camera.core.imagecapture.ProcessingNode$In */
    /* loaded from: classes14.dex */
    public static abstract class In {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In of(int i17, int i18) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0589xb63553d2(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd(), i17, i18);
        }

        /* renamed from: getEdge */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> mo4896xfb7ed633();

        /* renamed from: getInputFormat */
        public abstract int mo4897xb124032b();

        /* renamed from: getOutputFormat */
        public abstract int mo4898x42b80ace();

        /* renamed from: getPostviewEdge */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket> mo4899x8114cd18();
    }

    /* renamed from: androidx.camera.core.imagecapture.ProcessingNode$InputPacket */
    /* loaded from: classes14.dex */
    public static abstract class InputPacket {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0590x878cfce5(c0627xbfd50fdc, interfaceC0536x1ffeadf3);
        }

        /* renamed from: getImageProxy */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4903x976d89c9();

        /* renamed from: getProcessingRequest */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc mo4904x28455746();
    }

    public C0618xcff25bd5(java.util.concurrent.Executor executor) {
        this(executor, null, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0851xcf1a968b.m6170xb5882a6b());
    }

    /* renamed from: cropAndMaybeApplyEffect */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> m5005x70be5c5e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> abstractC0903x8e0938a8, int i17) {
        m3.h.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6222xb838964a(abstractC0903x8e0938a8.mo6258x19771aed()), null);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> mo4926x58b836e = this.f1372xfc45d3f2.mo4926x58b836e(abstractC0903x8e0938a8);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap>> interfaceC0902xda8cf547 = this.f1364x6a65d0ad;
        if (interfaceC0902xda8cf547 != null) {
            mo4926x58b836e = interfaceC0902xda8cf547.mo4926x58b836e(mo4926x58b836e);
        }
        return this.f1363xe6ab75cd.mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In.of(mo4926x58b836e, i17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$transform$1 */
    public /* synthetic */ void m5011x2717679c(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket) {
        if (inputPacket.mo4904x28455746().m5029x963a6b45()) {
            inputPacket.mo4903x976d89c9().close();
        } else {
            this.f1365xfa1a8eb5.execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$f
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.this.m5010x2717679b(inputPacket);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$transform$3 */
    public /* synthetic */ void m5013x2717679e(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket) {
        if (!inputPacket.mo4904x28455746().m5029x963a6b45()) {
            this.f1365xfa1a8eb5.execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$e
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.this.m5012x2717679d(inputPacket);
                }
            });
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "The postview image is closed due to request aborted");
            inputPacket.mo4903x976d89c9().close();
        }
    }

    /* renamed from: sendError */
    private static void m5014x288760(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$d
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc.this.m5038xe8fa07da(c0524xb471f04);
            }
        });
    }

    /* renamed from: injectProcessingInput2Packet */
    public void m5015xc46bddf4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3>> interfaceC0902xda8cf547) {
        this.f1370x5228155d = interfaceC0902xda8cf547;
    }

    /* renamed from: processInMemoryCapture */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m5016xf5b7a371(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc mo4904x28455746 = inputPacket.mo4904x28455746();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> mo4926x58b836e = this.f1370x5228155d.mo4926x58b836e(inputPacket);
        if ((mo4926x58b836e.mo6258x19771aed() == 35 || this.f1364x6a65d0ad != null || this.f1366x683245ef) && this.f1371xe06e8eba.mo4898x42b80ace() == 256) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> mo4926x58b836e2 = this.f1368xa38c4c3f.mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In.of(mo4926x58b836e, mo4904x28455746.m5022x354bfa41()));
            if (this.f1364x6a65d0ad != null) {
                mo4926x58b836e2 = m5005x70be5c5e(mo4926x58b836e2, mo4904x28455746.m5022x354bfa41());
            }
            mo4926x58b836e = this.f1374x2937b2bf.mo4926x58b836e(mo4926x58b836e2);
        }
        return this.f1375xa09a1449.mo4926x58b836e(mo4926x58b836e);
    }

    /* renamed from: processInputPacket, reason: merged with bridge method [inline-methods] */
    public void m5010x2717679b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc mo4904x28455746 = inputPacket.mo4904x28455746();
        try {
            if (inputPacket.mo4904x28455746().m5030xd2d80756()) {
                final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m5016xf5b7a371 = m5016xf5b7a371(inputPacket);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$g
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc.this.m5035x965a8dd4(m5016xf5b7a371);
                    }
                });
            } else {
                final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults m5018x5e04fd5b = m5018x5e04fd5b(inputPacket);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc.this.m5034x965a8dd4(m5018x5e04fd5b);
                    }
                });
            }
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 e17) {
            m5014x288760(mo4904x28455746, e17);
        } catch (java.lang.OutOfMemoryError e18) {
            m5014x288760(mo4904x28455746, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(0, "Processing failed due to low memory.", e18));
        } catch (java.lang.RuntimeException e19) {
            m5014x288760(mo4904x28455746, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(0, "Processing failed.", e19));
        }
    }

    /* renamed from: processOnDiskCapture */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults m5018x5e04fd5b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket) {
        int mo4898x42b80ace = this.f1371xe06e8eba.mo4898x42b80ace();
        m3.h.b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6222xb838964a(mo4898x42b80ace), java.lang.String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", java.lang.Integer.valueOf(mo4898x42b80ace)));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc mo4904x28455746 = inputPacket.mo4904x28455746();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> mo4926x58b836e = this.f1368xa38c4c3f.mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c.In.of(this.f1370x5228155d.mo4926x58b836e(inputPacket), mo4904x28455746.m5022x354bfa41()));
        if (mo4926x58b836e.m6318x29b830bc() || this.f1364x6a65d0ad != null) {
            mo4926x58b836e = m5005x70be5c5e(mo4926x58b836e, mo4904x28455746.m5022x354bfa41());
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults> interfaceC0902xda8cf547 = this.f1373x9e3947b9;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions m5023xf578610b = mo4904x28455746.m5023xf578610b();
        java.util.Objects.requireNonNull(m5023xf578610b);
        return interfaceC0902xda8cf547.mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In.of(mo4926x58b836e, m5023xf578610b));
    }

    /* renamed from: processPostviewInputPacket, reason: merged with bridge method [inline-methods] */
    public void m5012x2717679d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket) {
        int mo4898x42b80ace = this.f1371xe06e8eba.mo4898x42b80ace();
        m3.h.b(mo4898x42b80ace == 35 || mo4898x42b80ace == 256, java.lang.String.format("Postview only support YUV and JPEG output formats. Output format: %s", java.lang.Integer.valueOf(mo4898x42b80ace)));
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc mo4904x28455746 = inputPacket.mo4904x28455746();
        try {
            final android.graphics.Bitmap mo4926x58b836e = this.f1367x239ab353.mo4926x58b836e(this.f1370x5228155d.mo4926x58b836e(inputPacket));
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc.this.m5037x945ddf76(mo4926x58b836e);
                }
            });
        } catch (java.lang.Exception e17) {
            inputPacket.mo4903x976d89c9().close();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "process postview input packet failed.", e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: release */
    public void mo4945x41012807() {
    }

    public C0618xcff25bd5(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this(executor, null, c0744x90dabc95);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: transform, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.lang.Void mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In in6) {
        this.f1371xe06e8eba = in6;
        in6.mo4896xfb7ed633().m6294xc6cf6336(new m3.a() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$b
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.this.m5011x2717679c((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket) obj);
            }
        });
        in6.mo4899x8114cd18().m6294xc6cf6336(new m3.a() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$c
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.this.m5013x2717679e((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket) obj);
            }
        });
        this.f1370x5228155d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0617x5fbc2723();
        this.f1368xa38c4c3f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0608x9870d44c(this.f1376x16e1f742);
        this.f1372xfc45d3f2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0611xaf9bfeff();
        this.f1363xe6ab75cd = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60();
        this.f1373x9e3947b9 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c();
        this.f1375xa09a1449 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0614x48468ddc();
        this.f1367x239ab353 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0607x95d0ee66();
        if (in6.mo4897xb124032b() == 35 || this.f1369xa1f32344 != null || this.f1366x683245ef) {
            this.f1374x2937b2bf = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0613x1e1c3acc();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0897xd1ba49b4 c0897xd1ba49b4 = this.f1369xa1f32344;
        if (c0897xd1ba49b4 == null) {
            return null;
        }
        this.f1364x6a65d0ad = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0594xdc9c0bc0(c0897xd1ba49b4);
        return null;
    }

    public C0618xcff25bd5(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0897xd1ba49b4 c0897xd1ba49b4) {
        this(executor, c0897xd1ba49b4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0851xcf1a968b.m6170xb5882a6b());
    }

    public C0618xcff25bd5(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0897xd1ba49b4 c0897xd1ba49b4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0851xcf1a968b.get(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0857xc371a769.class) != null) {
            this.f1365xfa1a8eb5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5985x592e8cb2(executor);
        } else {
            this.f1365xfa1a8eb5 = executor;
        }
        this.f1369xa1f32344 = c0897xd1ba49b4;
        this.f1376x16e1f742 = c0744x90dabc95;
        this.f1366x683245ef = c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0855x81969d42.class);
    }
}
