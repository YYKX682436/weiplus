package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.SurfaceProcessorWithExecutor */
/* loaded from: classes14.dex */
public class C0924x100952de implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 {
    private static final java.lang.String TAG = "SurfaceProcessor";

    /* renamed from: mErrorListener */
    private final m3.a f2219x761b7b6f;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f2220x9ec3a060;

    /* renamed from: mSurfaceProcessor */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 f2221x3eca3cf2;

    public C0924x100952de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 m4263xc08ad9db = abstractC0468xb9790d36.m4263xc08ad9db();
        java.util.Objects.requireNonNull(m4263xc08ad9db);
        this.f2221x3eca3cf2 = m4263xc08ad9db;
        this.f2220x9ec3a060 = abstractC0468xb9790d36.m4260xf5a03649();
        this.f2219x761b7b6f = abstractC0468xb9790d36.m4259xd86d2f26();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onInputSurface$0 */
    public /* synthetic */ void m6378xb130184b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42) {
        try {
            this.f2221x3eca3cf2.mo4774x41974102(c0569x83ae3d42);
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0557x4dc3ce5c e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to setup SurfaceProcessor input.", e17);
            this.f2219x761b7b6f.mo3938xab27b508(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onOutputSurface$1 */
    public /* synthetic */ void m6379x6cbbbe7d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
        try {
            this.f2221x3eca3cf2.mo4775x43e35ccd(interfaceC0567x42142bee);
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0557x4dc3ce5c e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to setup SurfaceProcessor output.", e17);
            this.f2219x761b7b6f.mo3938xab27b508(e17);
        }
    }

    /* renamed from: getExecutor */
    public java.util.concurrent.Executor m6380xf5a03649() {
        return this.f2220x9ec3a060;
    }

    /* renamed from: getProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 m6381xbe2cbddc() {
        return this.f2221x3eca3cf2;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685
    /* renamed from: onInputSurface */
    public void mo4774x41974102(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42) {
        this.f2220x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0924x100952de.this.m6378xb130184b(c0569x83ae3d42);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685
    /* renamed from: onOutputSurface */
    public void mo4775x43e35ccd(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
        this.f2220x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0924x100952de.this.m6379x6cbbbe7d(interfaceC0567x42142bee);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62
    /* renamed from: release */
    public void mo6289x41012807() {
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62
    /* renamed from: snapshot */
    public wa.a mo6290x10fad5c4(int i17, int i18) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.Exception("Snapshot not supported by external SurfaceProcessor"));
    }
}
