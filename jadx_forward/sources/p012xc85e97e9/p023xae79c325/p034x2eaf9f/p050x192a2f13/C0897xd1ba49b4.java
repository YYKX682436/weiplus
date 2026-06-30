package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.InternalImageProcessor */
/* loaded from: classes14.dex */
public class C0897xd1ba49b4 {

    /* renamed from: mErrorListener */
    private final m3.a f2159x761b7b6f;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f2160x9ec3a060;

    /* renamed from: mImageProcessor */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597 f2161xa1f32344;

    public C0897xd1ba49b4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36) {
        m3.h.a(abstractC0468xb9790d36.m4264xe21cfccc() == 4);
        this.f2160x9ec3a060 = abstractC0468xb9790d36.m4260xf5a03649();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597 m4261x89d7e66d = abstractC0468xb9790d36.m4261x89d7e66d();
        java.util.Objects.requireNonNull(m4261x89d7e66d);
        this.f2161xa1f32344 = m4261x89d7e66d;
        this.f2159x761b7b6f = abstractC0468xb9790d36.m4259xd86d2f26();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$safeProcess$0 */
    public /* synthetic */ void m6295x1ebdd811(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Request request, t2.k kVar) {
        try {
            kVar.a(this.f2161xa1f32344.m4641xed8d1e6f(request));
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0557x4dc3ce5c e17) {
            this.f2159x761b7b6f.mo3938xab27b508(e17);
            kVar.b(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$safeProcess$1 */
    public /* synthetic */ java.lang.Object m6296x1ebdd812(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Request request, final t2.k kVar) {
        this.f2160x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.InternalImageProcessor$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0897xd1ba49b4.this.m6295x1ebdd811(request, kVar);
            }
        });
        return "InternalImageProcessor#process " + request.hashCode();
    }

    /* renamed from: safeProcess */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Response m6297xd270ce22(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Request request) {
        try {
            return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Response) ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.InternalImageProcessor$$b
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m6296x1ebdd812;
                    m6296x1ebdd812 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0897xd1ba49b4.this.m6296x1ebdd812(request, kVar);
                    return m6296x1ebdd812;
                }
            })).get();
        } catch (java.lang.Exception e17) {
            e = e17;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
