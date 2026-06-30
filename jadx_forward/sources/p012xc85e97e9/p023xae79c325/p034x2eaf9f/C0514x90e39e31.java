package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer */
/* loaded from: classes14.dex */
public final class C0514x90e39e31 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f {

    /* renamed from: mBackgroundExecutor */
    final java.util.concurrent.Executor f1022x72aeff6e;

    /* renamed from: mCachedImage */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 f1023xe5f4eeac;

    /* renamed from: mLock */
    private final java.lang.Object f1024x6243b38 = new java.lang.Object();

    /* renamed from: mPostedImage */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31.CacheAnalyzingImageProxy f1025xf46b3caf;

    /* renamed from: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy */
    /* loaded from: classes14.dex */
    public static class CacheAnalyzingImageProxy extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0 {

        /* renamed from: mNonBlockingAnalyzerWeakReference */
        final java.lang.ref.WeakReference<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31> f1028xf77c5338;

        public CacheAnalyzingImageProxy(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31 c0514x90e39e31) {
            super(interfaceC0536x1ffeadf3);
            this.f1028xf77c5338 = new java.lang.ref.WeakReference<>(c0514x90e39e31);
            m4405x5b6423b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$b
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener
                /* renamed from: onImageClose */
                public final void mo4407x6f90449c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31.CacheAnalyzingImageProxy.this.m4498x51ef5f10(interfaceC0536x1ffeadf32);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$new$1 */
        public /* synthetic */ void m4498x51ef5f10(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
            final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31 c0514x90e39e31 = this.f1028xf77c5338.get();
            if (c0514x90e39e31 != null) {
                c0514x90e39e31.f1022x72aeff6e.execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31.this.m4496x99c7206d();
                    }
                });
            }
        }
    }

    public C0514x90e39e31(java.util.concurrent.Executor executor) {
        this.f1022x72aeff6e = executor;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f
    /* renamed from: acquireImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4482xf0e56e25(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        return interfaceC0719xa3f4ef30.mo4183xaf314b5e();
    }

    /* renamed from: analyzeCachedImage */
    public void m4496x99c7206d() {
        synchronized (this.f1024x6243b38) {
            this.f1025xf46b3caf = null;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3 = this.f1023xe5f4eeac;
            if (interfaceC0536x1ffeadf3 != null) {
                this.f1023xe5f4eeac = null;
                mo4487xab9c626b(interfaceC0536x1ffeadf3);
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f
    /* renamed from: clearCache */
    public void mo4485xd2bef135() {
        synchronized (this.f1024x6243b38) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3 = this.f1023xe5f4eeac;
            if (interfaceC0536x1ffeadf3 != null) {
                interfaceC0536x1ffeadf3.close();
                this.f1023xe5f4eeac = null;
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f
    /* renamed from: onValidImageAvailable */
    public void mo4487xab9c626b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        synchronized (this.f1024x6243b38) {
            if (!this.f1002xcd061d3b) {
                interfaceC0536x1ffeadf3.close();
                return;
            }
            if (this.f1025xf46b3caf == null) {
                final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31.CacheAnalyzingImageProxy cacheAnalyzingImageProxy = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31.CacheAnalyzingImageProxy(interfaceC0536x1ffeadf3, this);
                this.f1025xf46b3caf = cacheAnalyzingImageProxy;
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(m4483xfecb6f(cacheAnalyzingImageProxy), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.1
                    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                    /* renamed from: onFailure */
                    public void mo3120xee232ab(java.lang.Throwable th6) {
                        cacheAnalyzingImageProxy.close();
                    }

                    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                    /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public void mo3121xe05b4124(java.lang.Void r17) {
                    }
                }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            } else {
                if (interfaceC0536x1ffeadf3.mo4173xcb10cdf3().mo4212x2b69a60() <= this.f1025xf46b3caf.mo4173xcb10cdf3().mo4212x2b69a60()) {
                    interfaceC0536x1ffeadf3.close();
                } else {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32 = this.f1023xe5f4eeac;
                    if (interfaceC0536x1ffeadf32 != null) {
                        interfaceC0536x1ffeadf32.close();
                    }
                    this.f1023xe5f4eeac = interfaceC0536x1ffeadf3;
                }
            }
        }
    }
}
