package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl */
/* loaded from: classes14.dex */
public class C0116xda12e2ab implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 {

    /* renamed from: DEFAULT_TEMPLATE */
    private static final int f140x440c60d8 = 1;
    private static final java.lang.String TAG = "Camera2CameraControlImp";

    /* renamed from: TAG_SESSION_UPDATE_ID */
    static final java.lang.String f141xd9241043 = "CameraControlSessionUpdateId";

    /* renamed from: mAeFpsRange */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0408xdae04e38 f142x40406a65;

    /* renamed from: mAutoFlashAEModeDisabler */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0409x88444532 f143xd4ee1a25;

    /* renamed from: mCamera2CameraControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb f144x274581d8;

    /* renamed from: mCamera2CapturePipeline */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb f145xaf340368;

    /* renamed from: mCameraCaptureCallbackSet */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CameraCaptureCallbackSet f146x631d0849;

    /* renamed from: mCameraCharacteristics */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f147x43bc1de6;

    /* renamed from: mControlUpdateCallback */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.ControlUpdateCallback f148x3cab47e;

    /* renamed from: mCurrentSessionUpdateId */
    private long f149x94a54a8e;

    /* renamed from: mExecutor */
    final java.util.concurrent.Executor f150x9ec3a060;

    /* renamed from: mExposureControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0228xee00d236 f151xf91c4a29;

    /* renamed from: mFlashMode */
    private volatile int f152x36526fc6;

    /* renamed from: mFlashModeChangeSessionUpdateFuture */
    private volatile wa.a f153xf9b22eac;

    /* renamed from: mFocusMeteringControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c f154xf3b18b79;

    /* renamed from: mIsTorchOn */
    private volatile boolean f155x145a6084;

    /* renamed from: mLock */
    private final java.lang.Object f156x6243b38;

    /* renamed from: mNextSessionUpdateId */
    private final java.util.concurrent.atomic.AtomicLong f157xbb22bb5a;

    /* renamed from: mScreenFlash */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash f158xa617b437;

    /* renamed from: mSessionCallback */
    final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CameraControlSessionCallback f159x900c40ce;

    /* renamed from: mSessionConfigBuilder */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder f160xcb6d0310;

    /* renamed from: mTemplate */
    private int f161xd6387407;

    /* renamed from: mTorchControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0277x40949e1 f162x91d30ece;

    /* renamed from: mUseCount */
    private int f163x12919f55;

    /* renamed from: mVideoUsageControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077 f164x30e327aa;

    /* renamed from: mZoomControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea f165xab5e875d;

    /* renamed from: mZslControl */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa f166x50dea9d7;

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet */
    /* loaded from: classes14.dex */
    public static final class CameraCaptureCallbackSet extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 {

        /* renamed from: mCallbacks */
        java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f168x3c7f32e1 = new java.util.HashSet();

        /* renamed from: mCallbackExecutors */
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6, java.util.concurrent.Executor> f167x9700264e = new android.util.ArrayMap();

        /* renamed from: addCaptureCallback */
        public void m3014x57b46eca(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            this.f168x3c7f32e1.add(abstractC0659xd0769ba6);
            this.f167x9700264e.put(abstractC0659xd0769ba6, executor);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureCancelled */
        public void mo3015xa4d204aa(final int i17) {
            for (final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6 : this.f168x3c7f32e1) {
                try {
                    this.f167x9700264e.get(abstractC0659xd0769ba6).execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6.this.mo3015xa4d204aa(i17);
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.TAG, "Executor rejected to invoke onCaptureCancelled.", e17);
                }
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureCompleted */
        public void mo3016x34cad1a4(final int i17, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
            for (final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6 : this.f168x3c7f32e1) {
                try {
                    this.f167x9700264e.get(abstractC0659xd0769ba6).execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6.this.mo3016x34cad1a4(i17, interfaceC0663xe081a7be);
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.TAG, "Executor rejected to invoke onCaptureCompleted.", e17);
                }
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureFailed */
        public void mo3017x90bd1f84(final int i17, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
            for (final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6 : this.f168x3c7f32e1) {
                try {
                    this.f167x9700264e.get(abstractC0659xd0769ba6).execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6.this.mo3017x90bd1f84(i17, c0661xad844609);
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.TAG, "Executor rejected to invoke onCaptureFailed.", e17);
                }
            }
        }

        /* renamed from: removeCaptureCallback */
        public void m3018x35b4cc87(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            this.f168x3c7f32e1.remove(abstractC0659xd0769ba6);
            this.f167x9700264e.remove(abstractC0659xd0769ba6);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraControlSessionCallback */
    /* loaded from: classes14.dex */
    public static final class CameraControlSessionCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f169x9ec3a060;

        /* renamed from: mResultListeners */
        final java.util.Set<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener> f170x49812a75 = new java.util.HashSet();

        public CameraControlSessionCallback(java.util.concurrent.Executor executor) {
            this.f169x9ec3a060 = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureCompleted$0 */
        public /* synthetic */ void m3019x89a021ed(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener : this.f170x49812a75) {
                if (captureResultListener.mo3009xa5745364(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f170x49812a75.removeAll(hashSet);
        }

        /* renamed from: addListener */
        public void m3020x162a7075(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener) {
            this.f170x49812a75.add(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.f169x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraControlSessionCallback$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CameraControlSessionCallback.this.m3019x89a021ed(totalCaptureResult);
                }
            });
        }

        /* renamed from: removeListener */
        public void m3021xf1335d58(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener) {
            this.f170x49812a75.remove(captureResultListener);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener */
    /* loaded from: classes14.dex */
    public interface CaptureResultListener {
        /* renamed from: onCaptureResult */
        boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult);
    }

    public C0116xda12e2ab(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.ControlUpdateCallback controlUpdateCallback) {
        this(c0322x11ef9595, scheduledExecutorService, executor, controlUpdateCallback, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95(new java.util.ArrayList()));
    }

    /* renamed from: getSupportedAwbMode */
    private int m2939xdf2bfd97(int i17) {
        int[] iArr = (int[]) this.f147x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m2941xc3eb33b0(i17, iArr) ? i17 : m2941xc3eb33b0(1, iArr) ? 1 : 0;
    }

    /* renamed from: isControlInUse */
    private boolean m2940x70a9610f() {
        return m2982x696e353e() > 0;
    }

    /* renamed from: isModeInList */
    private static boolean m2941xc3eb33b0(int i17, int[] iArr) {
        for (int i18 : iArr) {
            if (i17 == i18) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSessionUpdated */
    public static boolean m2942x254890f(android.hardware.camera2.TotalCaptureResult totalCaptureResult, long j17) {
        java.lang.Long l17;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        java.lang.Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c) && (l17 = (java.lang.Long) ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c) tag).m5703xb5887064(f141xd9241043)) != null && l17.longValue() >= j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addInteropConfig$0 */
    public static /* synthetic */ void m2943xd024bb47() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addSessionCameraCaptureCallback$8 */
    public /* synthetic */ void m2944x410a6ec8(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        this.f146x631d0849.m3014x57b46eca(executor, abstractC0659xd0769ba6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$clearInteropConfig$1 */
    public static /* synthetic */ void m2945x6d3e4dc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCameraCapturePipelineAsync$5 */
    public /* synthetic */ wa.a m2946xcbefd603(int i17, int i18, int i19, java.lang.Void r47) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(this.f145xaf340368.m3209x6357a86d(i17, i18, i19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeSessionCameraCaptureCallback$9 */
    public /* synthetic */ void m2947x368413c6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        this.f146x631d0849.m3018x35b4cc87(abstractC0659xd0769ba6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$submitStillCaptureRequests$4 */
    public /* synthetic */ wa.a m2948xc1288c67(java.util.List list, int i17, int i18, int i19, java.lang.Void r57) {
        return this.f145xaf340368.m3211xd95c167d(list, i17, i18, i19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateSessionConfigAsync$6 */
    public /* synthetic */ void m2949xaafdc0dc(t2.k kVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6026xd4b03729(m2953x8b3dbec6(m3007x34db709a()), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateSessionConfigAsync$7 */
    public /* synthetic */ java.lang.Object m2950xaafdc0dd(final t2.k kVar) {
        this.f150x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$k
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2949xaafdc0dc(kVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$waitForSessionUpdateId$2 */
    public static /* synthetic */ boolean m2951x3b41a811(long j17, t2.k kVar, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (!m2942x254890f(totalCaptureResult, j17)) {
            return false;
        }
        kVar.a(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$waitForSessionUpdateId$3 */
    public /* synthetic */ java.lang.Object m2952x3b41a812(final long j17, final t2.k kVar) {
        m2954x6b801ab6(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$e
            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
            /* renamed from: onCaptureResult */
            public final boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean m2951x3b41a811;
                m2951x3b41a811 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.m2951x3b41a811(j17, kVar, totalCaptureResult);
                return m2951x3b41a811;
            }
        });
        return "waitForSessionUpdateId:" + j17;
    }

    /* renamed from: waitForSessionUpdateId */
    private wa.a m2953x8b3dbec6(final long j17) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$i
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m2952x3b41a812;
                m2952x3b41a812 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2952x3b41a812(j17, kVar);
                return m2952x3b41a812;
            }
        });
    }

    /* renamed from: addCaptureResultListener */
    public void m2954x6b801ab6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener) {
        this.f159x900c40ce.m3020x162a7075(captureResultListener);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: addInteropConfig */
    public void mo2955xa5641e3e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f144x274581d8.m4143xf08693d4(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4165x3017aa(interfaceC0692x78a46f62).mo2888x59bc66e()).mo606x162a7075(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.RunnableC0118x7bb82557(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: addSessionCameraCaptureCallback */
    public void m2956x6001f411(final java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        this.f150x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$h
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2944x410a6ec8(executor, abstractC0659xd0769ba6);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: addZslConfig */
    public void mo2957x145149d4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder) {
        this.f166x50dea9d7.mo3674x145149d4(builder);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: cancelFocusAndMetering */
    public wa.a mo2958x7e6e0552() {
        return !m2940x70a9610f() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active.")) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f154xf3b18b79.m3445x7e6e0552());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: clearInteropConfig */
    public void mo2959x844e7812() {
        this.f144x274581d8.m4145xd8b3d9a8().mo606x162a7075(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.RunnableC0123x7bb8255c(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: decrementUseCount */
    public void m2960xc13e57b() {
        synchronized (this.f156x6243b38) {
            int i17 = this.f163x12919f55;
            if (i17 == 0) {
                throw new java.lang.IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f163x12919f55 = i17 - 1;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: decrementVideoUsage */
    public void mo2961x1d3f5ad9() {
        this.f164x30e327aa.m3645x9f95a4ce();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: enableTorch */
    public wa.a mo2962xaa38b839(boolean z17) {
        return !m2940x70a9610f() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active.")) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f162x91d30ece.m3637xaa38b839(z17));
    }

    /* renamed from: enableTorchInternal */
    public void m2963x4b179a16(boolean z17) {
        this.f155x145a6084 = z17;
        if (!z17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
            builder.m5366x5d0f9056(this.f161xd6387407);
            builder.m5367x6eb78a2b(true);
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
            builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, java.lang.Integer.valueOf(m2979xd49fdfff(1)));
            builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.FLASH_MODE, 0);
            builder.m5347x2f697c6b(builder2.mo2888x59bc66e());
            m3003xbf0642cf(java.util.Collections.singletonList(builder.m5350x59bc66e()));
        }
        m3007x34db709a();
    }

    /* renamed from: getCamera2CameraControl */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb m2964x6c2b8241() {
        return this.f144x274581d8;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: getCameraCapturePipelineAsync */
    public wa.a mo2965x86fba60f(final int i17, final int i18) {
        if (m2940x70a9610f()) {
            final int mo2969xbb0896fd = mo2969xbb0896fd();
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f153xf9b22eac)).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$f
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m2946xcbefd603;
                    m2946xcbefd603 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2946xcbefd603(i17, mo2969xbb0896fd, i18, (java.lang.Void) obj);
                    return m2946xcbefd603;
                }
            }, this.f150x9ec3a060);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Camera is not active.");
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
    }

    /* renamed from: getCropSensorRegion */
    public android.graphics.Rect m2966x29695174() {
        return this.f165xab5e875d.m3661x29695174();
    }

    /* renamed from: getCurrentSessionUpdateId */
    public long m2967x380cd4b7() {
        return this.f149x94a54a8e;
    }

    /* renamed from: getExposureControl */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0228xee00d236 m2968xdcfec20() {
        return this.f151xf91c4a29;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: getFlashMode */
    public int mo2969xbb0896fd() {
        return this.f152x36526fc6;
    }

    /* renamed from: getFocusMeteringControl */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c m2970x38978be2() {
        return this.f154xf3b18b79;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: getInteropConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo2971x668755a9() {
        return this.f144x274581d8.m4146x97c84a59();
    }

    /* renamed from: getMaxAeRegionCount */
    public int m2972x3bf4a429() {
        java.lang.Integer num = (java.lang.Integer) this.f147x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: getMaxAfRegionCount */
    public int m2973x43a64988() {
        java.lang.Integer num = (java.lang.Integer) this.f147x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: getMaxAwbRegionCount */
    public int m2974x716c8dbd() {
        java.lang.Integer num = (java.lang.Integer) this.f147x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: getScreenFlash */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash m2975xd5e0e9ae() {
        return this.f158xa617b437;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: getSensorRect */
    public android.graphics.Rect mo2976x54436cb4() {
        android.graphics.Rect rect = (android.graphics.Rect) this.f147x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(android.os.Build.FINGERPRINT) && rect == null) {
            return new android.graphics.Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: getSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo2977x9951e5c2() {
        this.f160xcb6d0310.m5631x5d0f9056(this.f161xd6387407);
        this.f160xcb6d0310.m5626x9a12cb4a(m2978xdc0741e());
        this.f160xcb6d0310.m5618xab35ff39(f141xd9241043, java.lang.Long.valueOf(this.f149x94a54a8e));
        return this.f160xcb6d0310.m5619x59bc66e();
    }

    /* renamed from: getSessionOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m2978xdc0741e() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_MODE;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.REQUIRED;
        builder.m2893x3c7bf26a(key, 1, optionPriority);
        this.f154xf3b18b79.m3443xa82802ee(builder);
        this.f142x40406a65.m4071x7aa99ec5(builder);
        this.f165xab5e875d.m3660xd3b6eda9(builder);
        int i17 = this.f154xf3b18b79.m3451xe1726b3f() ? 5 : 1;
        if (this.f155x145a6084) {
            builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.FLASH_MODE, 2, optionPriority);
        } else {
            int i18 = this.f152x36526fc6;
            if (i18 == 0) {
                i17 = this.f143xd4ee1a25.m4072xb6e33d9a(2);
            } else if (i18 == 1) {
                i17 = 3;
            } else if (i18 == 2) {
                i17 = 1;
            }
        }
        builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, java.lang.Integer.valueOf(m2979xd49fdfff(i17)), optionPriority);
        builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE, java.lang.Integer.valueOf(m2939xdf2bfd97(1)), optionPriority);
        this.f151xf91c4a29.m3405xea2ad5c0(builder);
        this.f144x274581d8.m4144x6cbe9f30(builder);
        return builder.mo2888x59bc66e();
    }

    /* renamed from: getSupportedAeMode */
    public int m2979xd49fdfff(int i17) {
        return m2938xd49fdfff(this.f147x43bc1de6, i17);
    }

    /* renamed from: getSupportedAfMode */
    public int m2980xd4adf780(int i17) {
        int[] iArr = (int[]) this.f147x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m2941xc3eb33b0(i17, iArr)) {
            return i17;
        }
        if (m2941xc3eb33b0(4, iArr)) {
            return 4;
        }
        return m2941xc3eb33b0(1, iArr) ? 1 : 0;
    }

    /* renamed from: getTorchControl */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0277x40949e1 m2981x5b308837() {
        return this.f162x91d30ece;
    }

    /* renamed from: getUseCount */
    public int m2982x696e353e() {
        int i17;
        synchronized (this.f156x6243b38) {
            i17 = this.f163x12919f55;
        }
        return i17;
    }

    /* renamed from: getZoomControl */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea m2983xdb27bcd4() {
        return this.f165xab5e875d;
    }

    /* renamed from: getZslControl */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa m2984x62ed6980() {
        return this.f166x50dea9d7;
    }

    /* renamed from: incrementUseCount */
    public void m2985x8d860857() {
        synchronized (this.f156x6243b38) {
            this.f163x12919f55++;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: incrementVideoUsage */
    public void mo2986xab436b5() {
        this.f164x30e327aa.m3647x6b85cf72();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: isInVideoUsage */
    public boolean mo2987xa967f35() {
        int m3646x754423eb = this.f164x30e327aa.m3646x754423eb();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "isInVideoUsage: mVideoUsageControl value = " + m3646x754423eb);
        return m3646x754423eb > 0;
    }

    /* renamed from: isTorchOn */
    public boolean m2988x99a31671() {
        return this.f155x145a6084;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: isZslDisabledByByUserCaseConfig */
    public boolean mo2989x5acfa0b0() {
        return this.f166x50dea9d7.mo3678x2b396b79();
    }

    /* renamed from: removeCaptureResultListener */
    public void m2990x7b0076b3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener) {
        this.f159x900c40ce.m3021xf1335d58(captureResultListener);
    }

    /* renamed from: removeSessionCameraCaptureCallback */
    public void m2991x94fe9174(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        this.f150x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2947x368413c6(abstractC0659xd0769ba6);
            }
        });
    }

    /* renamed from: resetTemplate */
    public void m2992x673c8ee9() {
        m2999x27cd6afc(1);
    }

    /* renamed from: setActive */
    public void m2993x37bd608(boolean z17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "setActive: isActive = " + z17);
        this.f154xf3b18b79.m3453x37bd608(z17);
        this.f165xab5e875d.m3663x37bd608(z17);
        this.f162x91d30ece.m3640x37bd608(z17);
        this.f151xf91c4a29.m3404x37bd608(z17);
        this.f144x274581d8.m4148x37bd608(z17);
        if (z17) {
            return;
        }
        this.f158xa617b437 = null;
        this.f164x30e327aa.m3649xc4ac15a5();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: setExposureCompensationIndex */
    public wa.a mo2994x28c3840f(int i17) {
        return !m2940x70a9610f() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active.")) : this.f151xf91c4a29.m3406x28c3840f(i17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: setFlashMode */
    public void mo2995x175c5771(int i17) {
        if (!m2940x70a9610f()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Camera is not active.");
            return;
        }
        this.f152x36526fc6 = i17;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "setFlashMode: mFlashMode = " + this.f152x36526fc6);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa interfaceC0293xeb7e8daa = this.f166x50dea9d7;
        boolean z17 = true;
        if (this.f152x36526fc6 != 1 && this.f152x36526fc6 != 0) {
            z17 = false;
        }
        interfaceC0293xeb7e8daa.mo3679xe5d4f6af(z17);
        this.f153xf9b22eac = m3006xe7bc88d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: setLinearZoom */
    public wa.a mo2996x2900129a(float f17) {
        return !m2940x70a9610f() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active.")) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f165xab5e875d.m3664x2900129a(f17));
    }

    /* renamed from: setPreviewAspectRatio */
    public void m2997xf56f3dad(android.util.Rational rational) {
        this.f154xf3b18b79.m3454xf56f3dad(rational);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: setScreenFlash */
    public void mo2998x6c465d22(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash screenFlash) {
        this.f158xa617b437 = screenFlash;
    }

    /* renamed from: setTemplate */
    public void m2999x27cd6afc(int i17) {
        this.f161xd6387407 = i17;
        this.f154xf3b18b79.m3455x27cd6afc(i17);
        this.f145xaf340368.m3210x27cd6afc(this.f161xd6387407);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: setZoomRatio */
    public wa.a mo3000xbd85d9b6(float f17) {
        return !m2940x70a9610f() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active.")) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f165xab5e875d.m3665xbd85d9b6(f17));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: setZslDisabledByUserCaseConfig */
    public void mo3001xc45bf941(boolean z17) {
        this.f166x50dea9d7.mo3680xc45bf941(z17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: startFocusAndMetering */
    public wa.a mo3002xaea5cb3a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        return !m2940x70a9610f() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active.")) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f154xf3b18b79.m3456xaea5cb3a(c0502x5ba1de27));
    }

    /* renamed from: submitCaptureRequestsInternal */
    public void m3003xbf0642cf(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
        this.f148x3cab47e.mo3125x4fd63511(list);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: submitStillCaptureRequests */
    public wa.a mo3004x7c34ae9a(final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list, final int i17, final int i18) {
        if (m2940x70a9610f()) {
            final int mo2969xbb0896fd = mo2969xbb0896fd();
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f153xf9b22eac)).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$j
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m2948xc1288c67;
                    m2948xc1288c67 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2948xc1288c67(list, i17, mo2969xbb0896fd, i18, (java.lang.Void) obj);
                    return m2948xc1288c67;
                }
            }, this.f150x9ec3a060);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Camera is not active.");
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
    }

    /* renamed from: updateSessionConfig */
    public void m3005xd8cf6f2f() {
        this.f150x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m3007x34db709a();
            }
        });
    }

    /* renamed from: updateSessionConfigAsync */
    public wa.a m3006xe7bc88d() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$d
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m2950xaafdc0dd;
                m2950xaafdc0dd = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2950xaafdc0dd(kVar);
                return m2950xaafdc0dd;
            }
        }));
    }

    /* renamed from: updateSessionConfigSynchronous */
    public long m3007x34db709a() {
        this.f149x94a54a8e = this.f157xbb22bb5a.getAndIncrement();
        this.f148x3cab47e.mo3126x9cc47396();
        return this.f149x94a54a8e;
    }

    public C0116xda12e2ab(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.ControlUpdateCallback controlUpdateCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f156x6243b38 = new java.lang.Object();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder();
        this.f160xcb6d0310 = builder;
        this.f163x12919f55 = 0;
        this.f155x145a6084 = false;
        this.f152x36526fc6 = 2;
        this.f157xbb22bb5a = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f153xf9b22eac = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
        this.f161xd6387407 = 1;
        this.f149x94a54a8e = 0L;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CameraCaptureCallbackSet cameraCaptureCallbackSet = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CameraCaptureCallbackSet();
        this.f146x631d0849 = cameraCaptureCallbackSet;
        this.f147x43bc1de6 = c0322x11ef9595;
        this.f148x3cab47e = controlUpdateCallback;
        this.f150x9ec3a060 = executor;
        this.f164x30e327aa = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077(executor);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CameraControlSessionCallback cameraControlSessionCallback = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CameraControlSessionCallback(executor);
        this.f159x900c40ce = cameraControlSessionCallback;
        builder.m5631x5d0f9056(this.f161xd6387407);
        builder.m5614x503be6a0(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0214xaed41b36.m3318xaf65a0fc(cameraControlSessionCallback));
        builder.m5614x503be6a0(cameraCaptureCallbackSet);
        this.f151xf91c4a29 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0228xee00d236(this, c0322x11ef9595, executor);
        this.f154xf3b18b79 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c(this, scheduledExecutorService, executor, c0744x90dabc95);
        this.f165xab5e875d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea(this, c0322x11ef9595, executor);
        this.f162x91d30ece = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0277x40949e1(this, c0322x11ef9595, executor);
        this.f166x50dea9d7 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0294xc8ee7eea(c0322x11ef9595);
        this.f142x40406a65 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0408xdae04e38(c0744x90dabc95);
        this.f143xd4ee1a25 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0409x88444532(c0744x90dabc95);
        this.f144x274581d8 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0437xca24f9eb(this, executor);
        this.f145xaf340368 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb(this, c0322x11ef9595, c0744x90dabc95, executor, scheduledExecutorService);
    }

    /* renamed from: getSupportedAeMode */
    public static int m2938xd49fdfff(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, int i17) {
        int[] iArr = (int[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m2941xc3eb33b0(i17, iArr) ? i17 : m2941xc3eb33b0(1, iArr) ? 1 : 0;
    }
}
