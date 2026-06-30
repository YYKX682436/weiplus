package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl */
/* loaded from: classes14.dex */
public class C0265x33c39f75 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener {
    private static final java.lang.String TAG = "SyncCaptureSessionBase";

    /* renamed from: mCameraCaptureSessionCompat */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7 f532x96967524;

    /* renamed from: mCaptureSessionRepository */
    final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa f533xf2ed9167;

    /* renamed from: mCaptureSessionStateCallback */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback f534xc042e0b9;

    /* renamed from: mCompatHandler */
    final android.os.Handler f536xffbc2dfb;

    /* renamed from: mExecutor */
    final java.util.concurrent.Executor f537x9ec3a060;

    /* renamed from: mOpenCaptureSessionCompleter */
    t2.k f540xb2552572;

    /* renamed from: mOpenCaptureSessionFuture */
    wa.a f541x61d85d4a;

    /* renamed from: mScheduledExecutorService */
    private final java.util.concurrent.ScheduledExecutorService f543xf3483782;

    /* renamed from: mStartingSurface */
    private wa.a f545x72030c20;

    /* renamed from: mLock */
    final java.lang.Object f539x6243b38 = new java.lang.Object();

    /* renamed from: mHeldDeferrableSurfaces */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f538xb7de8902 = null;

    /* renamed from: mClosed */
    private boolean f535xfe820839 = false;

    /* renamed from: mOpenerDisabled */
    private boolean f542xcdff09e0 = false;

    /* renamed from: mSessionFinished */
    private boolean f544x7228e0fb = false;

    /* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$Api23Impl */
    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        /* renamed from: getInputSurface */
        public static android.view.Surface m3623x2d4747f9(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            return cameraCaptureSession.getInputSurface();
        }
    }

    public C0265x33c39f75(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa c0222xaa5cc7fa, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.os.Handler handler) {
        this.f533xf2ed9167 = c0222xaa5cc7fa;
        this.f536xffbc2dfb = handler;
        this.f537x9ec3a060 = executor;
        this.f543xf3483782 = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$close$2 */
    public /* synthetic */ void m3614x595530a9() {
        mo3358x4d620149(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onClosed$3 */
    public /* synthetic */ void m3615x2526daf7(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        this.f533xf2ed9167.m3366x1ab30e7b(this);
        mo3358x4d620149(interfaceC0264x1b7732c4);
        if (this.f532x96967524 != null) {
            java.util.Objects.requireNonNull(this.f534xc042e0b9);
            this.f534xc042e0b9.mo3612x3e0ab82b(interfaceC0264x1b7732c4);
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onSessionFinished$4 */
    public /* synthetic */ void m3616xf37da73c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Objects.requireNonNull(this.f534xc042e0b9);
        this.f534xc042e0b9.mo3358x4d620149(interfaceC0264x1b7732c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$openCaptureSession$0 */
    public /* synthetic */ java.lang.Object m3617xc4eb1c23(java.util.List list, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d c0323x2c84e95d, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2, t2.k kVar) {
        java.lang.String str;
        synchronized (this.f539x6243b38) {
            m3620x6f71333f(list);
            m3.h.e(this.f540xb2552572 == null, "The openCaptureSessionCompleter can only set once!");
            this.f540xb2552572 = kVar;
            c0323x2c84e95d.m3739xc47ebc8c(c0355x6096c1c2);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startWithDeferrableSurface$1 */
    public /* synthetic */ wa.a m3618xd52d28d5(java.util.List list, java.util.List list2) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "[" + this + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException("Surface closed", (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293) list.get(list2.indexOf(null)))) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(list2);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: abortCaptures */
    public void mo3586xd96a793d() {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        this.f532x96967524.m3708xcf839a10().abortCaptures();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: captureBurstRequests */
    public int mo3587x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3704x6e0a775e(list, mo3605xf5a03649(), captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: captureSingleRequest */
    public int mo3589x33370f81(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3705x33370f81(captureRequest, mo3605xf5a03649(), captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: close */
    public void mo3591x5a5ddf8() {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        this.f533xf2ed9167.m3367x3baed186(this);
        this.f532x96967524.m3708xcf839a10().close();
        mo3605xf5a03649().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$e
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3614x595530a9();
            }
        });
    }

    /* renamed from: createCaptureSessionCompat */
    public void m3619x680e432e(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        if (this.f532x96967524 == null) {
            this.f532x96967524 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.m3703x27efedb2(cameraCaptureSession, this.f536xffbc2dfb);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: createSessionConfigurationCompat */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 mo3604x200dfbe(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback stateCallback) {
        this.f534xc042e0b9 = stateCallback;
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2(i17, list, mo3605xf5a03649(), new android.hardware.camera2.CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.2
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onActive(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3619x680e432e(cameraCaptureSession);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                c0265x33c39f75.mo3610x3a2455c5(c0265x33c39f75);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3619x680e432e(cameraCaptureSession);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                c0265x33c39f75.mo3611xf5ec0e83(c0265x33c39f75);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onClosed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3619x680e432e(cameraCaptureSession);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                c0265x33c39f75.mo3612x3e0ab82b(c0265x33c39f75);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                t2.k kVar;
                try {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3619x680e432e(cameraCaptureSession);
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                    c0265x33c39f75.mo3355xa3b7eee4(c0265x33c39f75);
                    synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f539x6243b38) {
                        m3.h.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f540xb2552572, "OpenCaptureSession completer should not null");
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f752 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                        kVar = c0265x33c39f752.f540xb2552572;
                        c0265x33c39f752.f540xb2552572 = null;
                    }
                    kVar.b(new java.lang.IllegalStateException("onConfigureFailed"));
                } catch (java.lang.Throwable th6) {
                    synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f539x6243b38) {
                        m3.h.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f540xb2552572, "OpenCaptureSession completer should not null");
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f753 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                        t2.k kVar2 = c0265x33c39f753.f540xb2552572;
                        c0265x33c39f753.f540xb2552572 = null;
                        kVar2.b(new java.lang.IllegalStateException("onConfigureFailed"));
                        throw th6;
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                t2.k kVar;
                try {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3619x680e432e(cameraCaptureSession);
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                    c0265x33c39f75.mo3356xf8bc597d(c0265x33c39f75);
                    synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f539x6243b38) {
                        m3.h.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f540xb2552572, "OpenCaptureSession completer should not null");
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f752 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                        kVar = c0265x33c39f752.f540xb2552572;
                        c0265x33c39f752.f540xb2552572 = null;
                    }
                    kVar.a(null);
                } catch (java.lang.Throwable th6) {
                    synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f539x6243b38) {
                        m3.h.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.f540xb2552572, "OpenCaptureSession completer should not null");
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f753 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                        t2.k kVar2 = c0265x33c39f753.f540xb2552572;
                        c0265x33c39f753.f540xb2552572 = null;
                        kVar2.a(null);
                        throw th6;
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3619x680e432e(cameraCaptureSession);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                c0265x33c39f75.mo3357xb03baf04(c0265x33c39f75);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3619x680e432e(cameraCaptureSession);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                c0265x33c39f75.mo3613xa39a382b(c0265x33c39f75, surface);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: finishClose */
    public void mo3592x4ec94525() {
        m3622xe5a62487();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: getDevice */
    public android.hardware.camera2.CameraDevice mo3593x1582414c() {
        this.f532x96967524.getClass();
        return this.f532x96967524.m3708xcf839a10().getDevice();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: getExecutor */
    public java.util.concurrent.Executor mo3605xf5a03649() {
        return this.f537x9ec3a060;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: getInputSurface */
    public android.view.Surface mo3594x2d4747f9() {
        this.f532x96967524.getClass();
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.Api23Impl.m3623x2d4747f9(this.f532x96967524.m3708xcf839a10());
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: getOpeningBlocker */
    public wa.a mo3595x4f81be78() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: getStateCallback */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback mo3596xf33fe440() {
        return this;
    }

    /* renamed from: holdDeferrableSurfaces */
    public void m3620x6f71333f(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        synchronized (this.f539x6243b38) {
            m3622xe5a62487();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5415xd57d0bb2(list);
            this.f538xb7de8902 = list;
        }
    }

    /* renamed from: isCameraCaptureSessionOpen */
    public boolean m3621xcd984e29() {
        boolean z17;
        synchronized (this.f539x6243b38) {
            z17 = this.f541x61d85d4a != null;
        }
        return z17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onActive */
    public void mo3610x3a2455c5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Objects.requireNonNull(this.f534xc042e0b9);
        this.f534xc042e0b9.mo3610x3a2455c5(interfaceC0264x1b7732c4);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: onCameraDeviceError */
    public void mo3597xbde300ce(int i17) {
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onCaptureQueueEmpty */
    public void mo3611xf5ec0e83(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Objects.requireNonNull(this.f534xc042e0b9);
        this.f534xc042e0b9.mo3611xf5ec0e83(interfaceC0264x1b7732c4);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onClosed */
    public void mo3612x3e0ab82b(final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        wa.a aVar;
        synchronized (this.f539x6243b38) {
            if (this.f535xfe820839) {
                aVar = null;
            } else {
                this.f535xfe820839 = true;
                m3.h.d(this.f541x61d85d4a, "Need to call openCaptureSession before using this API.");
                aVar = this.f541x61d85d4a;
            }
        }
        mo3592x4ec94525();
        if (aVar != null) {
            aVar.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$d
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3615x2526daf7(interfaceC0264x1b7732c4);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onConfigureFailed */
    public void mo3355xa3b7eee4(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Objects.requireNonNull(this.f534xc042e0b9);
        mo3592x4ec94525();
        this.f533xf2ed9167.m3368xd82e9f35(this);
        this.f534xc042e0b9.mo3355xa3b7eee4(interfaceC0264x1b7732c4);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onConfigured */
    public void mo3356xf8bc597d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Objects.requireNonNull(this.f534xc042e0b9);
        this.f533xf2ed9167.m3369x4556f3b9(this);
        this.f534xc042e0b9.mo3356xf8bc597d(interfaceC0264x1b7732c4);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onReady */
    public void mo3357xb03baf04(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Objects.requireNonNull(this.f534xc042e0b9);
        this.f534xc042e0b9.mo3357xb03baf04(interfaceC0264x1b7732c4);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onSessionFinished */
    public void mo3358x4d620149(final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        wa.a aVar;
        synchronized (this.f539x6243b38) {
            if (this.f544x7228e0fb) {
                aVar = null;
            } else {
                this.f544x7228e0fb = true;
                m3.h.d(this.f541x61d85d4a, "Need to call openCaptureSession before using this API.");
                aVar = this.f541x61d85d4a;
            }
        }
        if (aVar != null) {
            aVar.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3616xf37da73c(interfaceC0264x1b7732c4);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onSurfacePrepared */
    public void mo3613xa39a382b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4, android.view.Surface surface) {
        java.util.Objects.requireNonNull(this.f534xc042e0b9);
        this.f534xc042e0b9.mo3613xa39a382b(interfaceC0264x1b7732c4, surface);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: openCaptureSession */
    public wa.a mo3606xf3dae15a(android.hardware.camera2.CameraDevice cameraDevice, final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2, final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        synchronized (this.f539x6243b38) {
            if (this.f542xcdff09e0) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.util.concurrent.CancellationException("Opener is disabled"));
            }
            this.f533xf2ed9167.m3370x8df9590b(this);
            final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d m3738x4eba6f18 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.m3738x4eba6f18(cameraDevice, this.f536xffbc2dfb);
            wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$c
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3617xc4eb1c23;
                    m3617xc4eb1c23 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3617xc4eb1c23(list, m3738x4eba6f18, c0355x6096c1c2, kVar);
                    return m3617xc4eb1c23;
                }
            });
            this.f541x61d85d4a = a17;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(a17, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.1
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                /* renamed from: onFailure */
                public void mo3120xee232ab(java.lang.Throwable th6) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.mo3592x4ec94525();
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75 c0265x33c39f75 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this;
                    c0265x33c39f75.f533xf2ed9167.m3368xd82e9f35(c0265x33c39f75);
                }

                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo3121xe05b4124(java.lang.Void r17) {
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f541x61d85d4a);
        }
    }

    /* renamed from: releaseDeferrableSurfaces */
    public void m3622xe5a62487() {
        synchronized (this.f539x6243b38) {
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list = this.f538xb7de8902;
            if (list != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5414x72fa880e(list);
                this.f538xb7de8902 = null;
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: setRepeatingBurstRequests */
    public int mo3598x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3706x28cf2edf(list, mo3605xf5a03649(), captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: setSingleRepeatingRequest */
    public int mo3600x95252392(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3707x95252392(captureRequest, mo3605xf5a03649(), captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: startWithDeferrableSurface */
    public wa.a mo3607xf0e7b34b(final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list, long j17) {
        synchronized (this.f539x6243b38) {
            if (this.f542xcdff09e0) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.util.concurrent.CancellationException("Opener is disabled"));
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e m6005x9aa1ea70 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5418x29262dd0(list, false, j17, mo3605xf5a03649(), this.f543xf3483782)).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$b
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3618xd52d28d5;
                    m3618xd52d28d5 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0265x33c39f75.this.m3618xd52d28d5(list, (java.util.List) obj);
                    return m3618xd52d28d5;
                }
            }, mo3605xf5a03649());
            this.f545x72030c20 = m6005x9aa1ea70;
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(m6005x9aa1ea70);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener
    /* renamed from: stop */
    public boolean mo3608x360802() {
        boolean z17;
        try {
            synchronized (this.f539x6243b38) {
                if (!this.f542xcdff09e0) {
                    wa.a aVar = this.f545x72030c20;
                    r1 = aVar != null ? aVar : null;
                    this.f542xcdff09e0 = true;
                }
                z17 = !m3621xcd984e29();
            }
            return z17;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: stopRepeating */
    public void mo3602x6108ba85() {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        this.f532x96967524.m3708xcf839a10().stopRepeating();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: toCameraCaptureSessionCompat */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7 mo3603x27efedb2() {
        this.f532x96967524.getClass();
        return this.f532x96967524;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: captureBurstRequests */
    public int mo3588x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3704x6e0a775e(list, executor, captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: captureSingleRequest */
    public int mo3590x33370f81(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3705x33370f81(captureRequest, executor, captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: setRepeatingBurstRequests */
    public int mo3599x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3706x28cf2edf(list, executor, captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4
    /* renamed from: setSingleRepeatingRequest */
    public int mo3601x95252392(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.f532x96967524, "Need to call openCaptureSession before using this API.");
        return this.f532x96967524.m3707x95252392(captureRequest, executor, captureCallback);
    }
}
