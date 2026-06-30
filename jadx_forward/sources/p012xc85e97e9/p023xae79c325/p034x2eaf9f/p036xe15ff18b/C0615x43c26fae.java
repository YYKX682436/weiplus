package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.NoMetadataImageReader */
/* loaded from: classes14.dex */
public class C0615x43c26fae implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 {

    /* renamed from: mPendingRequest */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc f1361xc0bf62c5;

    /* renamed from: mWrappedImageReader */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 f1362xe1a92786;

    public C0615x43c26fae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        this.f1362xe1a92786 = interfaceC0719xa3f4ef30;
    }

    /* renamed from: createImageProxyWithEmptyMetadata */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4995x9ea2b047(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (interfaceC0536x1ffeadf3 == null) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c m5701x298eb42f = this.f1361xc0bf62c5 == null ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c.m5701x298eb42f() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c.m5700xaf65a0fc(new android.util.Pair(this.f1361xc0bf62c5.m5028xb0e6ee79(), this.f1361xc0bf62c5.m5027xc9b4d050().get(0)));
        this.f1361xc0bf62c5 = null;
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0564x7c326fbf(interfaceC0536x1ffeadf3, new android.util.Size(interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d()), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0830x9b01aa8b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0966x87d7faf3(m5701x298eb42f, interfaceC0536x1ffeadf3.mo4173xcb10cdf3().mo4212x2b69a60())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setOnImageAvailableListener$0 */
    public /* synthetic */ void m4996x93584572(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        onImageAvailableListener.mo3686xdf8fff6d(this);
    }

    /* renamed from: acceptProcessingRequest */
    public void m4997x30fd0bd4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc) {
        m3.h.e(this.f1361xc0bf62c5 == null, "Pending request should be null");
        this.f1361xc0bf62c5 = c0627xbfd50fdc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireLatestImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e() {
        return m4995x9ea2b047(this.f1362xe1a92786.mo4183xaf314b5e());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireNextImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4184x825b5df2() {
        return m4995x9ea2b047(this.f1362xe1a92786.mo4184x825b5df2());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: clearOnImageAvailableListener */
    public void mo4185xc0146eae() {
        this.f1362xe1a92786.mo4185xc0146eae();
    }

    /* renamed from: clearProcessingRequest */
    public void m4998xef731d2f() {
        this.f1361xc0bf62c5 = null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: close */
    public void mo4186x5a5ddf8() {
        this.f1362xe1a92786.mo4186x5a5ddf8();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getHeight */
    public int mo4187x1c4fb41d() {
        return this.f1362xe1a92786.mo4187x1c4fb41d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getImageFormat */
    public int mo4188x450a23fc() {
        return this.f1362xe1a92786.mo4188x450a23fc();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getMaxImages */
    public int mo4189xcb8dea46() {
        return this.f1362xe1a92786.mo4189xcb8dea46();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getSurface */
    public android.view.Surface mo4190xcf572877() {
        return this.f1362xe1a92786.mo4190xcf572877();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getWidth */
    public int mo4191x755bd410() {
        return this.f1362xe1a92786.mo4191x755bd410();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: setOnImageAvailableListener */
    public void mo4192x6034c5c3(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        this.f1362xe1a92786.mo4192x6034c5c3(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.NoMetadataImageReader$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
            /* renamed from: onImageAvailable */
            public final void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0615x43c26fae.this.m4996x93584572(onImageAvailableListener, interfaceC0719xa3f4ef30);
            }
        }, executor);
    }
}
