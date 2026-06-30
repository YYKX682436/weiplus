package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl */
/* loaded from: classes14.dex */
public class C0271x537b0704 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 {
    private static final java.lang.String TAG = "SyncCaptureSessionImpl";

    /* renamed from: mCloseSurfaceQuirk */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0416x5c292046 f548x6809b43c;

    /* renamed from: mClosed */
    private final java.util.concurrent.atomic.AtomicBoolean f549xfe820839;

    /* renamed from: mDeferrableSurfaces */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f550xd581ef6d;

    /* renamed from: mForceCloseSessionQuirk */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0415x93d27bbd f551xbf195602;

    /* renamed from: mObjectLock */
    private final java.lang.Object f552x1bc51d57;

    /* renamed from: mOpenSessionBlockerFuture */
    wa.a f553x1462c85e;

    /* renamed from: mRequestMonitor */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb f554xe1c13d98;

    /* renamed from: mScheduledExecutorService */
    private final java.util.concurrent.ScheduledExecutorService f555xf3483782;

    /* renamed from: mSessionResetPolicy */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0428xcd79bf0b f556x5f055e38;

    public C0271x537b0704(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc952, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa c0222xaa5cc7fa, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.os.Handler handler) {
        super(c0222xaa5cc7fa, executor, scheduledExecutorService, handler);
        this.f552x1bc51d57 = new java.lang.Object();
        this.f549xfe820839 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f548x6809b43c = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0416x5c292046(c0744x90dabc95, c0744x90dabc952);
        this.f554xe1c13d98 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb(c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0367xcc4b3832.class) || c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0386x48446c8e.class));
        this.f551xbf195602 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0415x93d27bbd(c0744x90dabc952);
        this.f556x5f055e38 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0428xcd79bf0b(c0744x90dabc952);
        this.f555xf3483782 = scheduledExecutorService;
    }

    /* renamed from: closeCreatedSession */
    private void m3624x9d165ea6() {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> it = this.f533xf2ed9167.m3362xbaeb27cd().iterator();
        while (it.hasNext()) {
            it.next().mo3591x5a5ddf8();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$close$2 */
    public /* synthetic */ void m3625x595530a9() {
        m3628x20a68ff1("Session call super.close()");
        super.mo3591x5a5ddf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onConfigured$1 */
    public /* synthetic */ void m3626x3ec4a947(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        super.mo3356xf8bc597d(interfaceC0264x1b7732c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$openCaptureSession$0 */
    public /* synthetic */ wa.a m3627xc4eb1c23(android.hardware.camera2.CameraDevice cameraDevice, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2, java.util.List list, java.util.List list2) {
        if (this.f556x5f055e38.m4107x2416f1ac()) {
            m3624x9d165ea6();
        }
        m3628x20a68ff1("start openCaptureSession");
        return super.mo3606xf3dae15a(cameraDevice, c0355x6096c1c2, list);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: captureBurstRequests */
    public int mo3587x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return super.mo3587x6e0a775e(list, this.f554xe1c13d98.m4100x88996b92(captureCallback));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: close */
    public void mo3591x5a5ddf8() {
        if (!this.f549xfe820839.compareAndSet(false, true)) {
            m3628x20a68ff1("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f556x5f055e38.m4107x2416f1ac()) {
            try {
                m3628x20a68ff1("Call abortCaptures() before closing session.");
                mo3586xd96a793d();
            } catch (java.lang.Exception e17) {
                m3628x20a68ff1("Exception when calling abortCaptures()" + e17);
            }
        }
        m3628x20a68ff1("Session call close()");
        this.f554xe1c13d98.m4101xf4435217().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0271x537b0704.this.m3625x595530a9();
            }
        }, mo3605xf5a03649());
    }

    /* renamed from: debugLog */
    public void m3628x20a68ff1(java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "[" + this + "] " + str);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: finishClose */
    public void mo3592x4ec94525() {
        super.mo3592x4ec94525();
        this.f554xe1c13d98.m4103x360802();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: getOpeningBlocker */
    public wa.a mo3595x4f81be78() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6024xe7063736(1500L, this.f555xf3483782, this.f554xe1c13d98.m4101xf4435217());
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: onCameraDeviceError */
    public void mo3597xbde300ce(int i17) {
        super.mo3597xbde300ce(i17);
        if (i17 == 5) {
            synchronized (this.f552x1bc51d57) {
                if (m3621xcd984e29() && this.f550xd581ef6d != null) {
                    m3628x20a68ff1("Close DeferrableSurfaces for CameraDevice error.");
                    java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = this.f550xd581ef6d.iterator();
                    while (it.hasNext()) {
                        it.next().mo5401x5a5ddf8();
                    }
                }
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onClosed */
    public void mo3612x3e0ab82b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        synchronized (this.f552x1bc51d57) {
            this.f548x6809b43c.m4080x2a2adda4(this.f550xd581ef6d);
        }
        m3628x20a68ff1("onClosed()");
        super.mo3612x3e0ab82b(interfaceC0264x1b7732c4);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onConfigured */
    public void mo3356xf8bc597d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        m3628x20a68ff1("Session onConfigured()");
        this.f551xbf195602.m4078x69db6155(interfaceC0264x1b7732c4, this.f533xf2ed9167.m3364xfc3a9dd4(), this.f533xf2ed9167.m3362xbaeb27cd(), new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0415x93d27bbd.OnConfigured() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$c
            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0415x93d27bbd.OnConfigured
            public final void run(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c42) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0271x537b0704.this.m3626x3ec4a947(interfaceC0264x1b7732c42);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: openCaptureSession */
    public wa.a mo3606xf3dae15a(final android.hardware.camera2.CameraDevice cameraDevice, final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2, final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        wa.a m6025x3918f316;
        synchronized (this.f552x1bc51d57) {
            java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> m3362xbaeb27cd = this.f533xf2ed9167.m3362xbaeb27cd();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> it = m3362xbaeb27cd.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo3595x4f81be78());
            }
            wa.a m6029xf7c1832a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6029xf7c1832a(arrayList);
            this.f553x1462c85e = m6029xf7c1832a;
            m6025x3918f316 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(m6029xf7c1832a).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$b
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3627xc4eb1c23;
                    m3627xc4eb1c23 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0271x537b0704.this.m3627xc4eb1c23(cameraDevice, c0355x6096c1c2, list, (java.util.List) obj);
                    return m3627xc4eb1c23;
                }
            }, mo3605xf5a03649()));
        }
        return m6025x3918f316;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: setSingleRepeatingRequest */
    public int mo3600x95252392(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return super.mo3600x95252392(captureRequest, this.f554xe1c13d98.m4100x88996b92(captureCallback));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: startWithDeferrableSurface */
    public wa.a mo3607xf0e7b34b(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list, long j17) {
        wa.a mo3607xf0e7b34b;
        synchronized (this.f552x1bc51d57) {
            this.f550xd581ef6d = list;
            mo3607xf0e7b34b = super.mo3607xf0e7b34b(list, j17);
        }
        return mo3607xf0e7b34b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: stop */
    public boolean mo3608x360802() {
        boolean mo3608x360802;
        synchronized (this.f552x1bc51d57) {
            if (m3621xcd984e29()) {
                this.f548x6809b43c.m4080x2a2adda4(this.f550xd581ef6d);
            } else {
                wa.a aVar = this.f553x1462c85e;
                if (aVar != null) {
                    aVar.cancel(true);
                }
            }
            mo3608x360802 = super.mo3608x360802();
        }
        return mo3608x360802;
    }
}
