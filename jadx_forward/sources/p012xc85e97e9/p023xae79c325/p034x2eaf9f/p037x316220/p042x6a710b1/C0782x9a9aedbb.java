package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper */
/* loaded from: classes15.dex */
public final class C0782x9a9aedbb {

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl f1867x622d82d;

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardApi30Impl */
    /* loaded from: classes15.dex */
    public static final class CloseGuardApi30Impl implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl {

        /* renamed from: mPlatformImpl */
        private final android.util.CloseGuard f1868xa0d5e640 = new android.util.CloseGuard();

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl
        /* renamed from: close */
        public void mo5813x5a5ddf8() {
            this.f1868xa0d5e640.close();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl
        /* renamed from: open */
        public void mo5814x34264a(java.lang.String str) {
            this.f1868xa0d5e640.open(str);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl
        /* renamed from: warnIfOpen */
        public void mo5815x3b99d32d() {
            this.f1868xa0d5e640.warnIfOpen();
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl */
    /* loaded from: classes15.dex */
    public interface CloseGuardImpl {
        /* renamed from: close */
        void mo5813x5a5ddf8();

        /* renamed from: open */
        void mo5814x34264a(java.lang.String str);

        /* renamed from: warnIfOpen */
        void mo5815x3b99d32d();
    }

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardNoOpImpl */
    /* loaded from: classes15.dex */
    public static final class CloseGuardNoOpImpl implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl {
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl
        /* renamed from: close */
        public void mo5813x5a5ddf8() {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl
        /* renamed from: open */
        public void mo5814x34264a(java.lang.String str) {
            m3.h.d(str, "CloseMethodName must not be null.");
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl
        /* renamed from: warnIfOpen */
        public void mo5815x3b99d32d() {
        }
    }

    private C0782x9a9aedbb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardImpl closeGuardImpl) {
        this.f1867x622d82d = closeGuardImpl;
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb m5809xaf65a0fc() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardApi30Impl()) : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0782x9a9aedbb.CloseGuardNoOpImpl());
    }

    /* renamed from: close */
    public void m5810x5a5ddf8() {
        this.f1867x622d82d.mo5813x5a5ddf8();
    }

    /* renamed from: open */
    public void m5811x34264a(java.lang.String str) {
        this.f1867x622d82d.mo5814x34264a(str);
    }

    /* renamed from: warnIfOpen */
    public void m5812x3b99d32d() {
        this.f1867x622d82d.mo5815x3b99d32d();
    }
}
