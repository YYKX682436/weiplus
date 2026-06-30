package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession */
/* loaded from: classes14.dex */
public final class C0256xeb77a83 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 {
    private static final java.lang.String TAG = "ProcessingCaptureSession";

    /* renamed from: TIMEOUT_GET_SURFACE_IN_MS */
    private static final long f470x9f667807 = 5000;

    /* renamed from: sHeldProcessorSurfaces */
    private static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f471xe6dbeeb0 = new java.util.ArrayList();

    /* renamed from: sNextInstanceId */
    private static int f472x851e736 = 0;

    /* renamed from: mCamera2CameraInfoImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 f473xedcba6d3;

    /* renamed from: mCaptureSession */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 f474x15e0c23d;

    /* renamed from: mExecutor */
    final java.util.concurrent.Executor f475x9ec3a060;

    /* renamed from: mInstanceId */
    private int f476x11f5c4dd;

    /* renamed from: mProcessorSessionConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f479xe9f176d3;

    /* renamed from: mProcessorState */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState f480x558e9cec;

    /* renamed from: mRequestProcessor */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0202x3251ae70 f481x94b0b550;

    /* renamed from: mScheduledExecutorService */
    private final java.util.concurrent.ScheduledExecutorService f482xf3483782;

    /* renamed from: mSessionConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f483x3700320b;

    /* renamed from: mSessionProcessor */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc f485x6e733d29;

    /* renamed from: mSessionProcessorCaptureCallback */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.SessionProcessorCaptureCallback f486x9c800942;

    /* renamed from: mOutputSurfaces */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f477x106d9f54 = new java.util.ArrayList();

    /* renamed from: mPendingCaptureConfigs */
    private volatile java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> f478x813f2255 = null;

    /* renamed from: mSessionOptions */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 f484x25dbb0f5 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder().mo2888x59bc66e();

    /* renamed from: mStillCaptureOptions */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 f487x9ab17293 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder().mo2888x59bc66e();

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$CaptureCallbackAdapter */
    /* loaded from: classes14.dex */
    public static class CaptureCallbackAdapter implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback {

        /* renamed from: mCameraCaptureCallbacks */
        private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f489xd57b1a3a;

        /* renamed from: mCaptureConfigId */
        private final int f490x2fe37936;

        /* renamed from: mCaptureResult */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be f491xcd737796;

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureCompleted */
        public void mo3513x34cad1a4(long j17, int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
            this.f491xcd737796 = interfaceC0663xe081a7be;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureFailed */
        public void mo3514x90bd1f84(int i17) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f489xd57b1a3a.iterator();
            while (it.hasNext()) {
                it.next().mo3017x90bd1f84(this.f490x2fe37936, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609.Reason.ERROR));
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureProcessProgressed */
        public void mo3515x1c9165b4(int i17) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f489xd57b1a3a.iterator();
            while (it.hasNext()) {
                it.next().mo4951x1c9165b4(this.f490x2fe37936, i17);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureSequenceCompleted */
        public void mo3516xc68039e3(int i17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f491xcd737796;
            if (interfaceC0663xe081a7be == null) {
                interfaceC0663xe081a7be = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be.EmptyCameraCaptureResult();
            }
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f489xd57b1a3a.iterator();
            while (it.hasNext()) {
                it.next().mo3016x34cad1a4(this.f490x2fe37936, interfaceC0663xe081a7be);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureStarted */
        public void mo3517x56961e1a(int i17, long j17) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f489xd57b1a3a.iterator();
            while (it.hasNext()) {
                it.next().mo4952x56961e1a(this.f490x2fe37936);
            }
        }

        private CaptureCallbackAdapter(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list) {
            this.f491xcd737796 = null;
            this.f490x2fe37936 = i17;
            this.f489xd57b1a3a = list;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState */
    /* loaded from: classes14.dex */
    public enum ProcessorState {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$SessionProcessorCaptureCallback */
    /* loaded from: classes14.dex */
    public static class SessionProcessorCaptureCallback implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback {
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureCompleted */
        public void mo3513x34cad1a4(long j17, int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureFailed */
        public void mo3514x90bd1f84(int i17) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureProcessStarted */
        public void mo3522x2841c359(int i17) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureSequenceAborted */
        public void mo3523x98946d67(int i17) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureSequenceCompleted */
        public void mo3516xc68039e3(int i17) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback
        /* renamed from: onCaptureStarted */
        public void mo3517x56961e1a(int i17, long j17) {
        }
    }

    public C0256xeb77a83(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc interfaceC0752x161fb6bc, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 c0160xa6db3120, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 c0345x87152bb7, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f476x11f5c4dd = 0;
        this.f474x15e0c23d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490(c0345x87152bb7, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0366xe3778f0c.class) != null);
        this.f485x6e733d29 = interfaceC0752x161fb6bc;
        this.f473xedcba6d3 = c0160xa6db3120;
        this.f475x9ec3a060 = executor;
        this.f482xf3483782 = scheduledExecutorService;
        this.f480x558e9cec = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.UNINITIALIZED;
        this.f486x9c800942 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.SessionProcessorCaptureCallback();
        int i17 = f472x851e736;
        f472x851e736 = i17 + 1;
        this.f476x11f5c4dd = i17;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "New ProcessingCaptureSession (id=" + this.f476x11f5c4dd + ")");
    }

    /* renamed from: cancelRequests */
    private static void m3496x7572d85e(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08 : list) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = c0690x88f65a08.m5329x78e2a463().iterator();
            while (it.hasNext()) {
                it.next().mo3015xa4d204aa(c0690x88f65a08.m5332x5db1b11());
            }
        }
    }

    /* renamed from: getSessionProcessorSurfaceList */
    private static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251> m3497xe3052179(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 : list) {
            m3.h.b(abstractC0697x654a0293 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251, "Surface must be SessionProcessorSurface");
            arrayList.add((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251) abstractC0697x654a0293);
        }
        return arrayList;
    }

    /* renamed from: hasPreviewSurface */
    private static boolean m3498x8e18ff(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 : c0690x88f65a08.m5335x1b8de6dc()) {
            if (m3501xca7a2b3e(abstractC0697x654a0293) || m3502x17e32032(abstractC0697x654a0293)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isImageAnalysis */
    private static boolean m3499x959f0c4d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        return java.util.Objects.equals(abstractC0697x654a0293.m5404x2009e26d(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.class);
    }

    /* renamed from: isImageCapture */
    private static boolean m3500x17377bb5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        return java.util.Objects.equals(abstractC0697x654a0293.m5404x2009e26d(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.class);
    }

    /* renamed from: isPreview */
    private static boolean m3501xca7a2b3e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        return java.util.Objects.equals(abstractC0697x654a0293.m5404x2009e26d(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.class);
    }

    /* renamed from: isStreamSharing */
    private static boolean m3502x17e32032(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        return java.util.Objects.equals(abstractC0697x654a0293.m5404x2009e26d(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.class);
    }

    /* renamed from: isTemplateTypeForStillCapture */
    private boolean m3503x19deee9(int i17) {
        return i17 == 2 || i17 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$open$0 */
    public /* synthetic */ void m3504xee4543d3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5414x72fa880e(this.f477x106d9f54);
        if (abstractC0697x654a0293 != null) {
            abstractC0697x654a0293.m5402xc13e57b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$open$1 */
    public static /* synthetic */ void m3505xee4543d4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        f471xe6dbeeb0.remove(abstractC0697x654a0293);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$open$2 */
    public wa.a m3506xee4543d5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, android.hardware.camera2.CameraDevice cameraDevice, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener opener, java.util.List list) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "-- getSurfaces done, start init (id=" + this.f476x11f5c4dd + ")");
        if (this.f480x558e9cec == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.DE_INITIALIZED) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = null;
        if (list.contains(null)) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException("Surface closed", c0750xb915958.m5601x1b8de6dc().get(list.indexOf(null))));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c2 = null;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c3 = null;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c4 = null;
        for (int i17 = 0; i17 < c0750xb915958.m5601x1b8de6dc().size(); i17++) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a02932 = c0750xb915958.m5601x1b8de6dc().get(i17);
            if (m3501xca7a2b3e(abstractC0697x654a02932) || m3502x17e32032(abstractC0697x654a02932)) {
                abstractC0737x4073a84c2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c.m5540xaf65a0fc((android.view.Surface) abstractC0697x654a02932.m5407xcf572877().get(), abstractC0697x654a02932.m5405xee2bb02e(), abstractC0697x654a02932.m5406x676de6c4());
            } else if (m3500x17377bb5(abstractC0697x654a02932)) {
                abstractC0737x4073a84c3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c.m5540xaf65a0fc((android.view.Surface) abstractC0697x654a02932.m5407xcf572877().get(), abstractC0697x654a02932.m5405xee2bb02e(), abstractC0697x654a02932.m5406x676de6c4());
            } else if (m3499x959f0c4d(abstractC0697x654a02932)) {
                abstractC0737x4073a84c4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c.m5540xaf65a0fc((android.view.Surface) abstractC0697x654a02932.m5407xcf572877().get(), abstractC0697x654a02932.m5405xee2bb02e(), abstractC0697x654a02932.m5406x676de6c4());
            }
        }
        if (c0750xb915958.m5595xc20ed7fe() != null) {
            abstractC0697x654a0293 = c0750xb915958.m5595xc20ed7fe().mo5172xcf572877();
            abstractC0737x4073a84c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c.m5540xaf65a0fc((android.view.Surface) abstractC0697x654a0293.m5407xcf572877().get(), abstractC0697x654a0293.m5405xee2bb02e(), abstractC0697x654a0293.m5406x676de6c4());
        } else {
            abstractC0737x4073a84c = null;
        }
        this.f480x558e9cec = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.SESSION_INITIALIZED;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f477x106d9f54);
            if (abstractC0697x654a0293 != null) {
                arrayList.add(abstractC0697x654a0293);
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5415xd57d0bb2(arrayList);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "== initSession (id=" + this.f476x11f5c4dd + ")");
            try {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo5653xc4fee366 = this.f485x6e733d29.mo5653xc4fee366(this.f473xedcba6d3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a.m5541xaf65a0fc(abstractC0737x4073a84c2, abstractC0737x4073a84c3, abstractC0737x4073a84c4, abstractC0737x4073a84c));
                this.f479xe9f176d3 = mo5653xc4fee366;
                mo5653xc4fee366.m5601x1b8de6dc().get(0).m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.this.m3504xee4543d3(abstractC0697x654a0293);
                    }
                }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
                for (final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a02933 : this.f479xe9f176d3.m5601x1b8de6dc()) {
                    f471xe6dbeeb0.add(abstractC0697x654a02933);
                    abstractC0697x654a02933.m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.m3505xee4543d4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.this);
                        }
                    }, this.f475x9ec3a060);
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder validatingBuilder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder();
                validatingBuilder.add(c0750xb915958);
                validatingBuilder.m5646x73b326d3();
                validatingBuilder.add(this.f479xe9f176d3);
                m3.h.b(validatingBuilder.m5647x7b953cf2(), "Cannot transform the SessionConfig");
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5645x59bc66e = validatingBuilder.m5645x59bc66e();
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490 = this.f474x15e0c23d;
                cameraDevice.getClass();
                wa.a mo3346x34264a = c0216xd3748490.mo3346x34264a(m5645x59bc66e, cameraDevice, opener);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(mo3346x34264a, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession.1
                    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                    /* renamed from: onFailure */
                    public void mo3120xee232ab(java.lang.Throwable th6) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.TAG, "open session failed ", th6);
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.this.mo3336x5a5ddf8();
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.this.mo3347x41012807(false);
                    }

                    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                    /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public void mo3121xe05b4124(java.lang.Void r17) {
                    }
                }, this.f475x9ec3a060);
                return mo3346x34264a;
            } catch (java.lang.Throwable th6) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "initSession failed", th6);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5414x72fa880e(this.f477x106d9f54);
                if (abstractC0697x654a0293 != null) {
                    abstractC0697x654a0293.m5402xc13e57b();
                }
                throw th6;
            }
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException e17) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$open$3 */
    public /* synthetic */ java.lang.Void m3507xee4543d6(java.lang.Void r17) {
        m3512xf8bc597d(this.f474x15e0c23d);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$4 */
    public /* synthetic */ void m3508x7afbb63a() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "== deInitSession (id=" + this.f476x11f5c4dd + ")");
        this.f485x6e733d29.mo5649x5cad5425();
    }

    /* renamed from: updateParameters */
    private void m3509xced42f93(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 c0448xec52add5, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 c0448xec52add52) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        builder.m2890x156e0956(c0448xec52add5);
        builder.m2890x156e0956(c0448xec52add52);
        this.f485x6e733d29.mo5656x37bcc7ec(builder.mo2888x59bc66e());
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: cancelIssuedCaptureRequests */
    public void mo3335x247bf0a5() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "cancelIssuedCaptureRequests (id=" + this.f476x11f5c4dd + ")");
        if (this.f478x813f2255 != null) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08 : this.f478x813f2255) {
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = c0690x88f65a08.m5329x78e2a463().iterator();
                while (it.hasNext()) {
                    it.next().mo3015xa4d204aa(c0690x88f65a08.m5332x5db1b11());
                }
            }
            this.f478x813f2255 = null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: close */
    public void mo3336x5a5ddf8() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "close (id=" + this.f476x11f5c4dd + ") state=" + this.f480x558e9cec);
        if (this.f480x558e9cec == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "== onCaptureSessionEnd (id = " + this.f476x11f5c4dd + ")");
            this.f485x6e733d29.mo5654xe7df0e2c();
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0202x3251ae70 c0202x3251ae70 = this.f481x94b0b550;
            if (c0202x3251ae70 != null) {
                c0202x3251ae70.m3288x5a5ddf8();
            }
            this.f480x558e9cec = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.ON_CAPTURE_SESSION_ENDED;
        }
        this.f474x15e0c23d.mo3336x5a5ddf8();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: getCaptureConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> mo3338xc025e841() {
        return this.f478x813f2255 != null ? this.f478x813f2255 : java.util.Collections.emptyList();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: getSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo3339x9951e5c2() {
        return this.f483x3700320b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: isInOpenState */
    public boolean mo3341x8844b538() {
        return this.f474x15e0c23d.mo3341x8844b538();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: issueCaptureRequests */
    public void mo3343xbe8e0711(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
        if (list.isEmpty()) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "issueCaptureRequests (id=" + this.f476x11f5c4dd + ") + state =" + this.f480x558e9cec);
        int ordinal = this.f480x558e9cec.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (this.f478x813f2255 == null) {
                this.f478x813f2255 = list;
                return;
            } else {
                m3496x7572d85e(list);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (ordinal == 2) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08 : list) {
                if (m3503x19deee9(c0690x88f65a08.m5337x26c6954a())) {
                    m3510xca51a698(c0690x88f65a08);
                } else {
                    m3511x824e5af0(c0690x88f65a08);
                }
            }
            return;
        }
        if (ordinal == 3 || ordinal == 4) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Run issueCaptureRequests in wrong state, state = " + this.f480x558e9cec);
            m3496x7572d85e(list);
        }
    }

    /* renamed from: issueStillCaptureRequest */
    public void m3510xca51a698(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder m4165x3017aa = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4165x3017aa(c0690x88f65a08.m5333xca0018d6());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5333xca0018d6 = c0690x88f65a08.m5333xca0018d6();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1604x5742e808;
        if (m5333xca0018d6.mo5374xdccd9774(option)) {
            m4165x3017aa.m4168xea2ad5c0(android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION, (java.lang.Integer) c0690x88f65a08.m5333xca0018d6().mo5379x77ba97d1(option));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5333xca0018d62 = c0690x88f65a08.m5333xca0018d6();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1602x542c7792;
        if (m5333xca0018d62.mo5374xdccd9774(option2)) {
            m4165x3017aa.m4168xea2ad5c0(android.hardware.camera2.CaptureRequest.JPEG_QUALITY, java.lang.Byte.valueOf(((java.lang.Integer) c0690x88f65a08.m5333xca0018d6().mo5379x77ba97d1(option2)).byteValue()));
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 mo2888x59bc66e = m4165x3017aa.mo2888x59bc66e();
        this.f487x9ab17293 = mo2888x59bc66e;
        m3509xced42f93(this.f484x25dbb0f5, mo2888x59bc66e);
        this.f485x6e733d29.mo5657x18ec4884(c0690x88f65a08.m5339xaec6c9b2(), c0690x88f65a08.m5336x4aa7b206(), new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.CaptureCallbackAdapter(c0690x88f65a08.m5332x5db1b11(), c0690x88f65a08.m5329x78e2a463()));
    }

    /* renamed from: issueTriggerRequest */
    public void m3511x824e5af0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        boolean z17;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "issueTriggerRequest");
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 mo2888x59bc66e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4165x3017aa(c0690x88f65a08.m5333xca0018d6()).mo2888x59bc66e();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>> it = mo2888x59bc66e.mo5378xc8202020().iterator();
        while (it.hasNext()) {
            android.hardware.camera2.CaptureRequest.Key key = (android.hardware.camera2.CaptureRequest.Key) it.next().mo5111x75346043();
            if (key.equals(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                z17 = true;
                break;
            }
        }
        z17 = false;
        if (z17) {
            this.f485x6e733d29.mo5659xb8cfd6f6(mo2888x59bc66e, c0690x88f65a08.m5336x4aa7b206(), new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.CaptureCallbackAdapter(c0690x88f65a08.m5332x5db1b11(), c0690x88f65a08.m5329x78e2a463()));
        } else {
            m3496x7572d85e(java.util.Arrays.asList(c0690x88f65a08));
        }
    }

    /* renamed from: onConfigured */
    public void m3512xf8bc597d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490) {
        if (this.f480x558e9cec != p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.SESSION_INITIALIZED) {
            return;
        }
        this.f481x94b0b550 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0202x3251ae70(c0216xd3748490, m3497xe3052179(this.f479xe9f176d3.m5601x1b8de6dc()));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "== onCaptureSessinStarted (id = " + this.f476x11f5c4dd + ")");
        this.f485x6e733d29.mo5655x6d1c3973(this.f481x94b0b550);
        this.f480x558e9cec = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.ON_CAPTURE_SESSION_STARTED;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958 = this.f483x3700320b;
        if (c0750xb915958 != null) {
            mo3348x2c284c36(c0750xb915958);
        }
        if (this.f478x813f2255 != null) {
            mo3343xbe8e0711(this.f478x813f2255);
            this.f478x813f2255 = null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: open */
    public wa.a mo3346x34264a(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, final android.hardware.camera2.CameraDevice cameraDevice, final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener opener) {
        m3.h.b(this.f480x558e9cec == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.UNINITIALIZED, "Invalid state state:" + this.f480x558e9cec);
        m3.h.b(c0750xb915958.m5601x1b8de6dc().isEmpty() ^ true, "SessionConfig contains no surfaces");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "open (id=" + this.f476x11f5c4dd + ")");
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> m5601x1b8de6dc = c0750xb915958.m5601x1b8de6dc();
        this.f477x106d9f54 = m5601x1b8de6dc;
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5418x29262dd0(m5601x1b8de6dc, false, f470x9f667807, this.f475x9ec3a060, this.f482xf3483782)).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$d
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
            /* renamed from: apply */
            public final wa.a mo3010x58b836e(java.lang.Object obj) {
                wa.a m3506xee4543d5;
                m3506xee4543d5 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.this.m3506xee4543d5(c0750xb915958, cameraDevice, opener, (java.util.List) obj);
                return m3506xee4543d5;
            }
        }, this.f475x9ec3a060).m6004x3ebe6b6c(new r.a() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$e
            @Override // r.a
            /* renamed from: apply */
            public final java.lang.Object mo1850x58b836e(java.lang.Object obj) {
                java.lang.Void m3507xee4543d6;
                m3507xee4543d6 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.this.m3507xee4543d6((java.lang.Void) obj);
                return m3507xee4543d6;
            }
        }, this.f475x9ec3a060);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: release */
    public wa.a mo3347x41012807(boolean z17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "release (id=" + this.f476x11f5c4dd + ") mProcessorState=" + this.f480x558e9cec);
        wa.a mo3347x41012807 = this.f474x15e0c23d.mo3347x41012807(z17);
        int ordinal = this.f480x558e9cec.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            mo3347x41012807.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.this.m3508x7afbb63a();
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
        this.f480x558e9cec = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.DE_INITIALIZED;
        return mo3347x41012807;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: setSessionConfig */
    public void mo3348x2c284c36(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "setSessionConfig (id=" + this.f476x11f5c4dd + ")");
        this.f483x3700320b = c0750xb915958;
        if (c0750xb915958 == null) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0202x3251ae70 c0202x3251ae70 = this.f481x94b0b550;
        if (c0202x3251ae70 != null) {
            c0202x3251ae70.m3294xd8cf6f2f(c0750xb915958);
        }
        if (this.f480x558e9cec == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83.ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 mo2888x59bc66e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4165x3017aa(c0750xb915958.m5592xca0018d6()).mo2888x59bc66e();
            this.f484x25dbb0f5 = mo2888x59bc66e;
            m3509xced42f93(mo2888x59bc66e, this.f487x9ab17293);
            if (m3498x8e18ff(c0750xb915958.m5597x57482ff7())) {
                this.f485x6e733d29.mo5658xc3d1ea25(c0750xb915958.m5597x57482ff7().m5336x4aa7b206(), this.f486x9c800942);
            } else {
                this.f485x6e733d29.mo5660x6108ba85();
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: setStreamUseCaseMap */
    public void mo3349x8d2f48a7(java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, java.lang.Long> map) {
    }
}
