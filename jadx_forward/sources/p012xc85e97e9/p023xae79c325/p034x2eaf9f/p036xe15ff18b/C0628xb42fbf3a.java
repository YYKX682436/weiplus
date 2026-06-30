package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.RequestWithCallback */
/* loaded from: classes14.dex */
public class C0628xb42fbf3a implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc {

    /* renamed from: mCaptureCompleter */
    private t2.k f1389xa8dfe840;

    /* renamed from: mCaptureRequestFuture */
    private wa.a f1391x1bdcab99;

    /* renamed from: mCompleteCompleter */
    private t2.k f1392x5510bc33;

    /* renamed from: mRetryControl */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.RetryControl f1396x300a26a2;

    /* renamed from: mTakePictureRequest */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 f1397x84189765;

    /* renamed from: mIsAborted */
    private boolean f1394x10f1b558 = false;

    /* renamed from: mIsStarted */
    private boolean f1395xe713d20a = false;

    /* renamed from: mCaptureFuture */
    private final wa.a f1390xb9db3d3c = t2.p.a(new t2.m() { // from class: androidx.camera.core.imagecapture.RequestWithCallback$$a
        @Override // t2.m
        /* renamed from: attachCompleter */
        public final java.lang.Object mo3008x586b6594(t2.k kVar) {
            java.lang.Object m5041x51ef5f0f;
            m5041x51ef5f0f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a.this.m5041x51ef5f0f(kVar);
            return m5041x51ef5f0f;
        }
    });

    /* renamed from: mCompleteFuture */
    private final wa.a f1393x31ed2629 = t2.p.a(new t2.m() { // from class: androidx.camera.core.imagecapture.RequestWithCallback$$b
        @Override // t2.m
        /* renamed from: attachCompleter */
        public final java.lang.Object mo3008x586b6594(t2.k kVar) {
            java.lang.Object m5042x51ef5f10;
            m5042x51ef5f10 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a.this.m5042x51ef5f10(kVar);
            return m5042x51ef5f10;
        }
    });

    public C0628xb42fbf3a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.RetryControl retryControl) {
        this.f1397x84189765 = abstractC0637xf28cf838;
        this.f1396x300a26a2 = retryControl;
    }

    /* renamed from: abort */
    private void m5039x5852330(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1394x10f1b558 = true;
        wa.a aVar = this.f1391x1bdcab99;
        java.util.Objects.requireNonNull(aVar);
        aVar.cancel(true);
        this.f1389xa8dfe840.b(c0524xb471f04);
        this.f1392x5510bc33.a(null);
    }

    /* renamed from: checkOnImageCaptured */
    private void m5040x6e1eaa92() {
        m3.h.e(this.f1390xb9db3d3c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ java.lang.Object m5041x51ef5f0f(t2.k kVar) {
        this.f1389xa8dfe840 = kVar;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1 */
    public /* synthetic */ java.lang.Object m5042x51ef5f10(t2.k kVar) {
        this.f1392x5510bc33 = kVar;
        return "RequestCompleteFuture";
    }

    /* renamed from: markComplete */
    private void m5043x52b97f26() {
        m3.h.e(!this.f1393x31ed2629.isDone(), "The callback can only complete once.");
        this.f1392x5510bc33.a(null);
    }

    /* renamed from: onFailure */
    private void m5044xee232ab(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1397x84189765.m5088xaf8aa769(c0524xb471f04);
    }

    /* renamed from: abortAndSendErrorToApp */
    public void m5045x7e2e68d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1393x31ed2629.isDone()) {
            return;
        }
        m5039x5852330(c0524xb471f04);
        m5044xee232ab(c0524xb471f04);
    }

    /* renamed from: abortSilentlyAndRetry */
    public void m5046xc900d123() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1393x31ed2629.isDone()) {
            return;
        }
        m5039x5852330(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(3, "The request is aborted silently and retried.", null));
        this.f1396x300a26a2.mo5077xa10c9ac7(this.f1397x84189765);
    }

    /* renamed from: getCaptureFuture */
    public wa.a m5047x1c2cf0f3() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        return this.f1390xb9db3d3c;
    }

    /* renamed from: getCompleteFuture */
    public wa.a m5048x19d1e952() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        return this.f1393x31ed2629;
    }

    /* renamed from: getTakePictureRequest */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 m5049x98259e0e() {
        return this.f1397x84189765;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: isAborted */
    public boolean mo5050x963a6b45() {
        return this.f1394x10f1b558;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onCaptureFailure */
    public void mo5051x86e70f23(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558) {
            return;
        }
        boolean m5084x7570da67 = this.f1397x84189765.m5084x7570da67();
        if (!m5084x7570da67) {
            m5044xee232ab(c0524xb471f04);
        }
        m5043x52b97f26();
        this.f1389xa8dfe840.b(c0524xb471f04);
        if (m5084x7570da67) {
            this.f1396x300a26a2.mo5077xa10c9ac7(this.f1397x84189765);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onCaptureProcessProgressed */
    public void mo5052x1c9165b4(int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558) {
            return;
        }
        this.f1397x84189765.m5087x1c9165b4(i17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onCaptureStarted */
    public void mo5053x56961e1a() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558 || this.f1395xe713d20a) {
            return;
        }
        this.f1395xe713d20a = true;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback mo4916x7ecb8c61 = this.f1397x84189765.mo4916x7ecb8c61();
        if (mo4916x7ecb8c61 != null) {
            mo4916x7ecb8c61.mo4369x56961e1a();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback mo4918x263afd77 = this.f1397x84189765.mo4918x263afd77();
        if (mo4918x263afd77 != null) {
            mo4918x263afd77.mo4376x56961e1a();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onFinalResult */
    public void mo5054x965a8dd4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults outputFileResults) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558) {
            return;
        }
        m5040x6e1eaa92();
        m5043x52b97f26();
        this.f1397x84189765.m5090x57429edc(outputFileResults);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onImageCaptured */
    public void mo5056x818788ba() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558) {
            return;
        }
        if (!this.f1395xe713d20a) {
            mo5053x56961e1a();
        }
        this.f1389xa8dfe840.a(null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onPostviewBitmapAvailable */
    public void mo5057x945ddf76(android.graphics.Bitmap bitmap) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558) {
            return;
        }
        this.f1397x84189765.m5089x945ddf76(bitmap);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onProcessFailure */
    public void mo5058xe8fa07da(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558) {
            return;
        }
        m5040x6e1eaa92();
        m5043x52b97f26();
        m5044xee232ab(c0524xb471f04);
    }

    /* renamed from: setCaptureRequestFuture */
    public void m5059xdb15db0e(wa.a aVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m3.h.e(this.f1391x1bdcab99 == null, "CaptureRequestFuture can only be set once.");
        this.f1391x1bdcab99 = aVar;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc
    /* renamed from: onFinalResult */
    public void mo5055x965a8dd4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1394x10f1b558) {
            interfaceC0536x1ffeadf3.close();
            return;
        }
        m5040x6e1eaa92();
        m5043x52b97f26();
        this.f1397x84189765.m5091x57429edc(interfaceC0536x1ffeadf3);
    }
}
