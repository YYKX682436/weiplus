package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd;

/* renamed from: androidx.camera.camera2.interop.Camera2CameraControl */
/* loaded from: classes14.dex */
public final class C0437xca24f9eb {

    /* renamed from: mCamera2CameraControlImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f775x22a3ac18;

    /* renamed from: mCompleter */
    t2.k f776x2718406c;

    /* renamed from: mExecutor */
    final java.util.concurrent.Executor f777x9ec3a060;

    /* renamed from: mIsActive */
    private boolean f778xf85a185d = false;

    /* renamed from: mPendingUpdate */
    private boolean f780x7745e9d3 = false;

    /* renamed from: mLock */
    final java.lang.Object f779x6243b38 = new java.lang.Object();

    /* renamed from: mBuilder */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder f774xabdca26e = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();

    public C0437xca24f9eb(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, java.util.concurrent.Executor executor) {
        this.f775x22a3ac18 = c0116xda12e2ab;
        this.f777x9ec3a060 = executor;
    }

    /* renamed from: addCaptureRequestOptionsInternal */
    private void m4128x44c9aab1(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 c0448xec52add5) {
        synchronized (this.f779x6243b38) {
            this.f774xabdca26e.m2890x156e0956(c0448xec52add5);
        }
    }

    /* renamed from: clearCaptureRequestOptionsInternal */
    private void m4129xea8ddc85() {
        synchronized (this.f779x6243b38) {
            this.f774xabdca26e = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: completeInFlightUpdate */
    public void m4130xed2a4cb7() {
        t2.k kVar = this.f776x2718406c;
        if (kVar != null) {
            kVar.a(null);
            this.f776x2718406c = null;
        }
    }

    /* renamed from: failInFlightUpdate */
    private void m4131xbc563ddc(java.lang.Exception exc) {
        t2.k kVar = this.f776x2718406c;
        if (kVar != null) {
            if (exc == null) {
                exc = new java.lang.Exception("Camera2CameraControl failed with unknown error.");
            }
            kVar.b(exc);
            this.f776x2718406c = null;
        }
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb m4132x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658 interfaceC0467x1baf8658) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 mo5278x52ed78a8 = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935) interfaceC0467x1baf8658).mo5278x52ed78a8();
        m3.h.b(mo5278x52ed78a8 instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab, "CameraControl doesn't contain Camera2 implementation.");
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab) mo5278x52ed78a8).m2964x6c2b8241();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addCaptureRequestOptions$3 */
    public /* synthetic */ java.lang.Object m4134x3582d660(final t2.k kVar) {
        this.f777x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4133x3582d65f(kVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$clearCaptureRequestOptions$5 */
    public /* synthetic */ java.lang.Object m4136xfa892bf6(final t2.k kVar) {
        this.f777x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4135xfa892bf5(kVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setCaptureRequestOptions$1 */
    public /* synthetic */ java.lang.Object m4139x9b13e97d(final t2.k kVar) {
        this.f777x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$f
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4138x9b13e97c(kVar);
            }
        });
        return "setCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setActiveInternal, reason: merged with bridge method [inline-methods] */
    public void m4137xb2249b3d(boolean z17) {
        if (this.f778xf85a185d == z17) {
            return;
        }
        this.f778xf85a185d = z17;
        if (!z17) {
            m4131xbc563ddc(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("The camera control has became inactive."));
        } else if (this.f780x7745e9d3) {
            m4142x1d261d8d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateConfig, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m4138x9b13e97c(t2.k kVar) {
        this.f780x7745e9d3 = true;
        m4131xbc563ddc(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.f776x2718406c = kVar;
        if (this.f778xf85a185d) {
            m4142x1d261d8d();
        }
    }

    /* renamed from: updateSession */
    private void m4142x1d261d8d() {
        this.f775x22a3ac18.m3006xe7bc88d().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$h
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4130xed2a4cb7();
            }
        }, this.f777x9ec3a060);
        this.f780x7745e9d3 = false;
    }

    /* renamed from: addCaptureRequestOptions */
    public wa.a m4143xf08693d4(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 c0448xec52add5) {
        m4128x44c9aab1(c0448xec52add5);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$e
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m4134x3582d660;
                m4134x3582d660 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4134x3582d660(kVar);
                return m4134x3582d660;
            }
        }));
    }

    /* renamed from: applyOptionsToBuilder */
    public void m4144x6cbe9f30(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        synchronized (this.f779x6243b38) {
            builder.m2891x156e0956(this.f774xabdca26e.mo2889xc37a2e52(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.ALWAYS_OVERRIDE);
        }
    }

    /* renamed from: clearCaptureRequestOptions */
    public wa.a m4145xd8b3d9a8() {
        m4129xea8ddc85();
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$d
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m4136xfa892bf6;
                m4136xfa892bf6 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4136xfa892bf6(kVar);
                return m4136xfa892bf6;
            }
        }));
    }

    /* renamed from: getCamera2ImplConfig */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef m4146x97c84a59() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef mo2888x59bc66e;
        synchronized (this.f779x6243b38) {
            mo2888x59bc66e = this.f774xabdca26e.mo2888x59bc66e();
        }
        return mo2888x59bc66e;
    }

    /* renamed from: getCaptureRequestOptions */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 m4147x8b1d303f() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 mo2888x59bc66e;
        synchronized (this.f779x6243b38) {
            mo2888x59bc66e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4165x3017aa(this.f774xabdca26e.mo2888x59bc66e()).mo2888x59bc66e();
        }
        return mo2888x59bc66e;
    }

    /* renamed from: setActive */
    public void m4148x37bd608(final boolean z17) {
        this.f777x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4137xb2249b3d(z17);
            }
        });
    }

    /* renamed from: setCaptureRequestOptions */
    public wa.a m4149x5b2fe2b3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 c0448xec52add5) {
        m4129xea8ddc85();
        m4128x44c9aab1(c0448xec52add5);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$g
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m4139x9b13e97d;
                m4139x9b13e97d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb.this.m4139x9b13e97d(kVar);
                return m4139x9b13e97d;
            }
        }));
    }
}
