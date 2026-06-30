package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.SingleCloseImageProxy */
/* loaded from: classes14.dex */
final class C0565x1eeae063 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0 {

    /* renamed from: mClosed */
    private final java.util.concurrent.atomic.AtomicBoolean f1214xfe820839;

    public C0565x1eeae063(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        super(interfaceC0536x1ffeadf3);
        this.f1214xfe820839 = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3, java.lang.AutoCloseable
    public void close() {
        if (this.f1214xfe820839.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
