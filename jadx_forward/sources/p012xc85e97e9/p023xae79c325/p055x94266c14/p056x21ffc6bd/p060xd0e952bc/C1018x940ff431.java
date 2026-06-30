package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor */
/* loaded from: classes14.dex */
public class C1018x940ff431 extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad {

    /* renamed from: INVALID_TIMESTAMP */
    private static final long f2508x21d7908e = -1;

    /* renamed from: PREVIEW_PROCESS_MAX_IMAGES */
    private static final int f2509xe073afba = 2;
    private static final java.lang.String TAG = "BasicSessionProcessor";

    /* renamed from: sLastOutputConfigId */
    static java.util.concurrent.atomic.AtomicInteger f2510x66e27627 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: mAnalysisOutputConfig */
    private volatile p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 f2511xba24dcac;

    /* renamed from: mCaptureOutputConfig */
    private volatile p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 f2512x155d745c;

    /* renamed from: mCaptureOutputSurface */
    private volatile p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f2513xef2a1ed3;

    /* renamed from: mContext */
    private final android.content.Context f2514xd6cfe882;

    /* renamed from: mImageCaptureExtenderImpl */
    private final androidx.camera.extensions.impl.ImageCaptureExtenderImpl f2515xc6054a9f;

    /* renamed from: mIsCapturing */
    volatile boolean f2516x94657dcc;

    /* renamed from: mNextCaptureSequenceId */
    private final java.util.concurrent.atomic.AtomicInteger f2517xd1d0b782;

    /* renamed from: mOnEnableDisableSessionDurationCheck */
    private p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1013x8ed74224 f2518xdc24297;

    /* renamed from: mParameters */
    private final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> f2519xf789ba37;

    /* renamed from: mPostviewOutputSurface */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f2520x80cb22ba;

    /* renamed from: mPreviewExtenderImpl */
    private final androidx.camera.extensions.impl.PreviewExtenderImpl f2521x1e952242;

    /* renamed from: mPreviewOutputConfig */
    private volatile p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 f2522xf735ddde;

    /* renamed from: mPreviewOutputSurface */
    private volatile p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f2523x485ee591;

    /* renamed from: mPreviewProcessor */
    volatile p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1030x389c8dca f2524x90f01437;

    /* renamed from: mRequestCompletedTimestampMap */
    private final java.util.Map<java.lang.Integer, java.lang.Long> f2525x1e7d20f;

    /* renamed from: mRequestProcessor */
    private volatile p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 f2526x94b0b550;

    /* renamed from: mRequestUpdateProcessor */
    volatile androidx.camera.extensions.impl.RequestUpdateProcessorImpl f2527xaebd6807;

    /* renamed from: mStillCaptureProcessor */
    volatile p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994 f2528x4df0f47;

    /* renamed from: mVendorExtender */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf f2529x3dedb87c;

    /* renamed from: mWillReceiveOnCaptureCompleted */
    private final boolean f2530x4d6d70c8;

    public C1018x940ff431(androidx.camera.extensions.impl.PreviewExtenderImpl previewExtenderImpl, androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl, java.util.List<android.hardware.camera2.CaptureRequest.Key> list, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf, android.content.Context context) {
        super(list);
        this.f2528x4df0f47 = null;
        this.f2524x90f01437 = null;
        this.f2527xaebd6807 = null;
        this.f2511xba24dcac = null;
        this.f2516x94657dcc = false;
        this.f2517xd1d0b782 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f2519xf789ba37 = new java.util.LinkedHashMap();
        this.f2525x1e7d20f = new java.util.HashMap();
        this.f2518xdc24297 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1013x8ed74224();
        this.f2521x1e952242 = previewExtenderImpl;
        this.f2515xc6054a9f = imageCaptureExtenderImpl;
        this.f2514xd6cfe882 = context;
        this.f2529x3dedb87c = interfaceC0999xfb817acf;
        this.f2530x4d6d70c8 = interfaceC0999xfb817acf.m6714x2de4ee35();
    }

    /* renamed from: applyParameters */
    private void m6808x67b22ff8(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c c1032x6368322c) {
        synchronized (this.f2591x6243b38) {
            for (android.hardware.camera2.CaptureRequest.Key<?> key : this.f2519xf789ba37.keySet()) {
                java.lang.Object obj = this.f2519xf789ba37.get(key);
                if (obj != null) {
                    c1032x6368322c.m6863x37bcc7ec(key, obj);
                }
            }
        }
    }

    /* renamed from: applyPreviewStagesParameters */
    private void m6809x21b5ed99(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c c1032x6368322c) {
        androidx.camera.extensions.impl.CaptureStageImpl captureStage = this.f2521x1e952242.getCaptureStage();
        if (captureStage != null) {
            for (android.util.Pair pair : captureStage.getParameters()) {
                c1032x6368322c.m6863x37bcc7ec((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRequestCompletedTimestamp */
    public long m6810xda3f9d44(int i17) {
        synchronized (this.f2591x6243b38) {
            java.lang.Long l17 = this.f2525x1e7d20f.get(java.lang.Integer.valueOf(i17));
            if (l17 == null) {
                return -1L;
            }
            this.f2525x1e7d20f.remove(java.lang.Integer.valueOf(i17));
            return l17.longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startRepeating$0 */
    public /* synthetic */ void m6811x8f6504ae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback, int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, long j17, java.util.List list) {
        captureCallback.mo3513x34cad1a4(j17, i17, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1028xf0a1e1f4(j17, c0760xc2ac609c, m6813x6db499b2(list)));
    }

    /* renamed from: submitRequestByCaptureStages */
    private void m6812x362f2cad(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 interfaceC0746x3c5d2ee3, java.util.List<androidx.camera.extensions.impl.CaptureStageImpl> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.extensions.impl.CaptureStageImpl captureStageImpl : list) {
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c c1032x6368322c = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c();
            c1032x6368322c.m6860xbdb5c23(this.f2522xf735ddde.mo6785x5db1b11());
            if (this.f2511xba24dcac != null) {
                c1032x6368322c.m6860xbdb5c23(this.f2511xba24dcac.mo6785x5db1b11());
            }
            for (android.util.Pair pair : captureStageImpl.getParameters()) {
                c1032x6368322c.m6863x37bcc7ec((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
            c1032x6368322c.m6864x6a1ea537(1);
            arrayList.add(c1032x6368322c.m6861x59bc66e());
        }
        interfaceC0746x3c5d2ee3.mo3293xcadc4018(arrayList, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.2
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: abortCapture */
    public void mo5648x725e45f6(int i17) {
        this.f2526x94b0b550.mo3287xd96a793d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad
    /* renamed from: deInitSessionInternal */
    public void mo6755x67d78a02() {
        if (this.f2524x90f01437 != null) {
            this.f2524x90f01437.m6852x5a5ddf8();
            this.f2524x90f01437 = null;
        }
        if (this.f2528x4df0f47 != null) {
            this.f2528x4df0f47.m6874x5a5ddf8();
            this.f2528x4df0f47 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "preview onDeInit");
        this.f2521x1e952242.onDeInit();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "capture onDeInit");
        this.f2515xc6054a9f.onDeInit();
    }

    /* renamed from: getCaptureResultKeyMapFromList */
    public java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> m6813x6db499b2(java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object> pair : list) {
            hashMap.put((android.hardware.camera2.CaptureResult.Key) pair.first, pair.second);
        }
        return hashMap;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: getRealtimeCaptureLatency */
    public android.util.Pair<java.lang.Long, java.lang.Long> mo5650xd2b81c19() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return this.f2515xc6054a9f.getRealtimeCaptureLatency();
        }
        return null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: getSupportedCameraOperations */
    public /* bridge */ /* synthetic */ java.util.Set mo5651x36ea2709() {
        return super.mo5651x36ea2709();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: getSupportedPostviewSize */
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> mo5652x216212fe(android.util.Size size) {
        return this.f2529x3dedb87c.mo6668x8d2e83aa(size);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad
    /* renamed from: initSessionInternal */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb mo6756xce8a4843(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a abstractC0738x8f67d80a) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "PreviewExtenderImpl.onInit");
        this.f2521x1e952242.onInit(str, map.get(str), this.f2514xd6cfe882);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "ImageCaptureExtenderImpl.onInit");
        this.f2515xc6054a9f.onInit(str, map.get(str), this.f2514xd6cfe882);
        this.f2523x485ee591 = abstractC0738x8f67d80a.mo5164x8d44e5fa();
        this.f2513xef2a1ed3 = abstractC0738x8f67d80a.mo5162x1cfaa20b();
        this.f2520x80cb22ba = abstractC0738x8f67d80a.mo5163xd8a52f71();
        androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType processorType = this.f2521x1e952242.getProcessorType();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "preview processorType=" + processorType);
        if (processorType == androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.f2522xf735ddde = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1.m6847xaf65a0fc(f2510x66e27627.getAndIncrement(), this.f2523x485ee591.mo5156xfb854877(), 35, 2);
            this.f2524x90f01437 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1030x389c8dca(this.f2521x1e952242.getProcessor(), this.f2523x485ee591.mo5157xcf572877(), this.f2523x485ee591.mo5156xfb854877());
        } else if (processorType == androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.f2522xf735ddde = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0.m6884xaf65a0fc(f2510x66e27627.getAndIncrement(), this.f2523x485ee591.mo5157xcf572877());
            this.f2527xaebd6807 = this.f2521x1e952242.getProcessor();
        } else {
            this.f2522xf735ddde = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0.m6884xaf65a0fc(f2510x66e27627.getAndIncrement(), this.f2523x485ee591.mo5157xcf572877());
        }
        androidx.camera.extensions.impl.CaptureProcessorImpl captureProcessor = this.f2515xc6054a9f.getCaptureProcessor();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "CaptureProcessor=" + captureProcessor);
        if (captureProcessor != null) {
            this.f2512x155d745c = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1.m6847xaf65a0fc(f2510x66e27627.getAndIncrement(), this.f2513xef2a1ed3.mo5156xfb854877(), 35, this.f2515xc6054a9f.getMaxCaptureStage());
            this.f2528x4df0f47 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994(captureProcessor, this.f2513xef2a1ed3.mo5157xcf572877(), this.f2513xef2a1ed3.mo5156xfb854877(), this.f2520x80cb22ba, !this.f2530x4d6d70c8);
        } else {
            this.f2512x155d745c = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0.m6884xaf65a0fc(f2510x66e27627.getAndIncrement(), this.f2513xef2a1ed3.mo5157xcf572877());
        }
        if (abstractC0738x8f67d80a.mo5161x6f8fa44b() != null) {
            this.f2511xba24dcac = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0.m6884xaf65a0fc(f2510x66e27627.getAndIncrement(), abstractC0738x8f67d80a.mo5161x6f8fa44b().mo5157xcf572877());
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30 m6831x266cce29 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30().m6825x5864e6e4(this.f2522xf735ddde).m6825x5864e6e4(this.f2512x155d745c).m6831x266cce29(1);
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            int onSessionType = this.f2521x1e952242.onSessionType();
            m3.h.b(onSessionType == this.f2515xc6054a9f.onSessionType(), "Needs same session type in both PreviewExtenderImpl and ImageCaptureExtenderImpl");
            if (onSessionType == -1) {
                onSessionType = 0;
            }
            m6831x266cce29.m6832x6ee5052e(onSessionType);
        }
        if (this.f2511xba24dcac != null) {
            m6831x266cce29.m6825x5864e6e4(this.f2511xba24dcac);
        }
        androidx.camera.extensions.impl.CaptureStageImpl onPresetSession = this.f2521x1e952242.onPresetSession();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "preview onPresetSession:" + onPresetSession);
        androidx.camera.extensions.impl.CaptureStageImpl onPresetSession2 = this.f2515xc6054a9f.onPresetSession();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "capture onPresetSession:" + onPresetSession2);
        if (onPresetSession != null && onPresetSession.getParameters() != null) {
            for (android.util.Pair pair : onPresetSession.getParameters()) {
                m6831x266cce29.m6826x4c53474((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (onPresetSession2 != null && onPresetSession2.getParameters() != null) {
            for (android.util.Pair pair2 : onPresetSession2.getParameters()) {
                m6831x266cce29.m6826x4c53474((android.hardware.camera2.CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return m6831x266cce29.m6827x59bc66e();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: onCaptureSessionEnd */
    public void mo5654xe7df0e2c() {
        this.f2518xdc24297.m6751x52ab17df();
        if (this.f2524x90f01437 != null) {
            this.f2524x90f01437.m6855x65825f6();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.extensions.impl.CaptureStageImpl onDisableSession = this.f2521x1e952242.onDisableSession();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "preview onDisableSession: " + onDisableSession);
        if (onDisableSession != null) {
            arrayList.add(onDisableSession);
        }
        androidx.camera.extensions.impl.CaptureStageImpl onDisableSession2 = this.f2515xc6054a9f.onDisableSession();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "capture onDisableSession:" + onDisableSession2);
        if (onDisableSession2 != null) {
            arrayList.add(onDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            m6812x362f2cad(this.f2526x94b0b550, arrayList);
        }
        this.f2526x94b0b550 = null;
        this.f2516x94657dcc = false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: onCaptureSessionStart */
    public void mo5655x6d1c3973(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 interfaceC0746x3c5d2ee3) {
        this.f2526x94b0b550 = interfaceC0746x3c5d2ee3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.extensions.impl.CaptureStageImpl onEnableSession = this.f2521x1e952242.onEnableSession();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "preview onEnableSession: " + onEnableSession);
        if (onEnableSession != null) {
            arrayList.add(onEnableSession);
        }
        androidx.camera.extensions.impl.CaptureStageImpl onEnableSession2 = this.f2515xc6054a9f.onEnableSession();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "capture onEnableSession:" + onEnableSession2);
        if (onEnableSession2 != null) {
            arrayList.add(onEnableSession2);
        }
        this.f2518xdc24297.m6752x27b19858();
        if (!arrayList.isEmpty()) {
            m6812x362f2cad(interfaceC0746x3c5d2ee3, arrayList);
        }
        if (this.f2524x90f01437 != null) {
            this.f2524x90f01437.m6856xc84dc82d();
            m6870x51ce4e79(this.f2522xf735ddde.mo6785x5db1b11(), new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.1
                @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597
                /* renamed from: onNextImageAvailable */
                public void mo6760x6eaeb9c0(int i17, long j17, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, java.lang.String str) {
                    if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2524x90f01437 != null) {
                        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2524x90f01437.m6854x96e84792(interfaceC1027x69a2d850);
                    } else {
                        interfaceC1027x69a2d850.mo6848x23e5cc93();
                    }
                }
            });
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: setParameters */
    public void mo5656x37bcc7ec(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        synchronized (this.f2591x6243b38) {
            java.util.HashMap hashMap = new java.util.HashMap();
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26 m6712x59bc66e = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder.m6710x3017aa(interfaceC0692x78a46f62).m6712x59bc66e();
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : m6712x59bc66e.mo5378xc8202020()) {
                hashMap.put((android.hardware.camera2.CaptureRequest.Key) option.mo5111x75346043(), m6712x59bc66e.mo5379x77ba97d1(option));
            }
            this.f2519xf789ba37.clear();
            this.f2519xf789ba37.putAll(hashMap);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: startCapture */
    public int mo5657x18ec4884(boolean z17, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "startCapture postviewEnabled = " + z17 + " mWillReceiveOnCaptureCompleted = " + this.f2530x4d6d70c8);
        final int andIncrement = this.f2517xd1d0b782.getAndIncrement();
        if (this.f2526x94b0b550 == null || this.f2516x94657dcc) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "startCapture failed");
            captureCallback.mo3514x90bd1f84(andIncrement);
            captureCallback.mo3523x98946d67(andIncrement);
            return andIncrement;
        }
        this.f2516x94657dcc = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<androidx.camera.extensions.impl.CaptureStageImpl> captureStages = this.f2515xc6054a9f.getCaptureStages();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (androidx.camera.extensions.impl.CaptureStageImpl captureStageImpl : captureStages) {
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c c1032x6368322c = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c();
            c1032x6368322c.m6860xbdb5c23(this.f2512x155d745c.mo6785x5db1b11());
            c1032x6368322c.m6864x6a1ea537(2);
            c1032x6368322c.m6862xde516f95(captureStageImpl.getId());
            arrayList2.add(java.lang.Integer.valueOf(captureStageImpl.getId()));
            m6808x67b22ff8(c1032x6368322c);
            m6809x21b5ed99(c1032x6368322c);
            for (android.util.Pair pair : captureStageImpl.getParameters()) {
                c1032x6368322c.m6863x37bcc7ec((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList.add(c1032x6368322c.m6861x59bc66e());
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Wait for capture stage id: " + arrayList2);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.4

            /* renamed from: mIsCaptureFailed */
            boolean f2536xae9bc1ec = false;

            /* renamed from: mIsCaptureStarted */
            boolean f2537xf48bc8b2 = false;

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
            /* renamed from: onCaptureCompleted */
            public void mo5571x34cad1a4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                android.hardware.camera2.CaptureResult mo2933x2fc52b4d = interfaceC0663xe081a7be.mo2933x2fc52b4d();
                m3.h.b(mo2933x2fc52b4d instanceof android.hardware.camera2.TotalCaptureResult, "Cannot get capture TotalCaptureResult from the cameraCaptureResult ");
                android.hardware.camera2.TotalCaptureResult totalCaptureResult = (android.hardware.camera2.TotalCaptureResult) mo2933x2fc52b4d;
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c.RequestProcessorRequest requestProcessorRequest = (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c.RequestProcessorRequest) request;
                if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2528x4df0f47 != null) {
                    synchronized (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2591x6243b38) {
                        if (!p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2525x1e7d20f.containsKey(java.lang.Integer.valueOf(andIncrement))) {
                            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2525x1e7d20f.put(java.lang.Integer.valueOf(andIncrement), java.lang.Long.valueOf(interfaceC0663xe081a7be.mo2936x2b69a60()));
                        }
                    }
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2528x4df0f47.m6875xdd88e63a(totalCaptureResult, requestProcessorRequest.m6865x165b0789());
                    return;
                }
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2516x94657dcc = false;
                if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2526x94b0b550 == null) {
                    captureCallback.mo3523x98946d67(andIncrement);
                    return;
                }
                captureCallback.mo3522x2841c359(andIncrement);
                captureCallback.mo3513x34cad1a4(interfaceC0663xe081a7be.mo2936x2b69a60(), andIncrement, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0989xf008e111(c0760xc2ac609c, interfaceC0663xe081a7be.mo2933x2fc52b4d()));
                captureCallback.mo3516xc68039e3(andIncrement);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
            /* renamed from: onCaptureFailed */
            public void mo5572x90bd1f84(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
                if (this.f2536xae9bc1ec) {
                    return;
                }
                this.f2536xae9bc1ec = true;
                captureCallback.mo3514x90bd1f84(andIncrement);
                captureCallback.mo3523x98946d67(andIncrement);
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2516x94657dcc = false;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
            /* renamed from: onCaptureSequenceAborted */
            public void mo5574x98946d67(int i17) {
                captureCallback.mo3523x98946d67(andIncrement);
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2516x94657dcc = false;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
            /* renamed from: onCaptureStarted */
            public void mo5576x56961e1a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, long j17, long j18) {
                if (this.f2537xf48bc8b2) {
                    return;
                }
                this.f2537xf48bc8b2 = true;
                captureCallback.mo3517x56961e1a(andIncrement, j18);
            }
        };
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "startCapture");
        if (this.f2528x4df0f47 != null) {
            m6870x51ce4e79(this.f2512x155d745c.mo6785x5db1b11(), new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.5

                /* renamed from: mIsFirstFrame */
                boolean f2542xe092a74 = true;

                @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597
                /* renamed from: onNextImageAvailable */
                public void mo6760x6eaeb9c0(int i17, long j17, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, java.lang.String str) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.TAG, "onNextImageAvailable  outputStreamId=" + i17);
                    if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2528x4df0f47 != null) {
                        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2528x4df0f47.m6876x96e84792(interfaceC1027x69a2d850);
                    } else {
                        interfaceC1027x69a2d850.mo6848x23e5cc93();
                    }
                    if (this.f2542xe092a74) {
                        captureCallback.mo3522x2841c359(andIncrement);
                        this.f2542xe092a74 = false;
                    }
                }
            });
            this.f2528x4df0f47.m6878x18ec4884(z17, arrayList2, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.6
                @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback
                /* renamed from: onCaptureCompleted */
                public void mo6816x34cad1a4(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                    if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2530x4d6d70c8) {
                        captureCallback.mo3513x34cad1a4(j17, andIncrement, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1028xf0a1e1f4(j17, c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.m6813x6db499b2(list)));
                        captureCallback.mo3516xc68039e3(andIncrement);
                    }
                }

                @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback
                /* renamed from: onCaptureProcessProgressed */
                public void mo6817x1c9165b4(int i17) {
                    captureCallback.mo3515x1c9165b4(i17);
                }

                @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback
                /* renamed from: onError */
                public void mo6818xaf8aa769(java.lang.Exception exc) {
                    captureCallback.mo3514x90bd1f84(andIncrement);
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2516x94657dcc = false;
                }

                @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback
                /* renamed from: onProcessCompleted */
                public void mo6819x5e02789b() {
                    if (!p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2530x4d6d70c8) {
                        long m6810xda3f9d44 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.m6810xda3f9d44(andIncrement);
                        if (m6810xda3f9d44 == -1) {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.TAG, "Cannot get timestamp for the capture result");
                            captureCallback.mo3514x90bd1f84(andIncrement);
                            captureCallback.mo3523x98946d67(andIncrement);
                            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2516x94657dcc = false;
                            return;
                        }
                        captureCallback.mo3513x34cad1a4(m6810xda3f9d44, andIncrement, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1028xf0a1e1f4(m6810xda3f9d44, c0760xc2ac609c, java.util.Collections.emptyMap()));
                        captureCallback.mo3516xc68039e3(andIncrement);
                    }
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2516x94657dcc = false;
                }
            });
        }
        this.f2526x94b0b550.mo3293xcadc4018(arrayList, callback);
        return andIncrement;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: startRepeating */
    public int mo5658xc3d1ea25(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        final int andIncrement = this.f2517xd1d0b782.getAndIncrement();
        if (this.f2526x94b0b550 == null) {
            captureCallback.mo3514x90bd1f84(andIncrement);
            captureCallback.mo3523x98946d67(andIncrement);
        } else {
            if (this.f2524x90f01437 != null) {
                this.f2524x90f01437.m6857x68ac462(new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1030x389c8dca.OnCaptureResultCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$$a
                    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1030x389c8dca.OnCaptureResultCallback
                    /* renamed from: onCaptureResult */
                    public final void mo6815xa5745364(long j17, java.util.List list) {
                        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.m6811x8f6504ae(captureCallback, andIncrement, c0760xc2ac609c, j17, list);
                    }
                });
            }
            m6814x20cb799e(andIncrement, captureCallback);
        }
        return andIncrement;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: startTrigger */
    public int mo5659xb8cfd6f6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "startTrigger");
        final int andIncrement = this.f2517xd1d0b782.getAndIncrement();
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c c1032x6368322c = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c();
        c1032x6368322c.m6860xbdb5c23(this.f2522xf735ddde.mo6785x5db1b11());
        if (this.f2511xba24dcac != null) {
            c1032x6368322c.m6860xbdb5c23(this.f2511xba24dcac.mo6785x5db1b11());
        }
        c1032x6368322c.m6864x6a1ea537(1);
        m6808x67b22ff8(c1032x6368322c);
        m6809x21b5ed99(c1032x6368322c);
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26 m6712x59bc66e = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder.m6710x3017aa(interfaceC0692x78a46f62).m6712x59bc66e();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : m6712x59bc66e.mo5378xc8202020()) {
            c1032x6368322c.m6863x37bcc7ec((android.hardware.camera2.CaptureRequest.Key) option.mo5111x75346043(), m6712x59bc66e.mo5379x77ba97d1(option));
        }
        this.f2526x94b0b550.mo3292xcadc4018(c1032x6368322c.m6861x59bc66e(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.7
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
            /* renamed from: onCaptureCompleted */
            public void mo5571x34cad1a4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                captureCallback.mo3513x34cad1a4(interfaceC0663xe081a7be.mo2936x2b69a60(), andIncrement, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0989xf008e111(c0760xc2ac609c, interfaceC0663xe081a7be.mo2933x2fc52b4d()));
                captureCallback.mo3516xc68039e3(andIncrement);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
            /* renamed from: onCaptureFailed */
            public void mo5572x90bd1f84(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
                captureCallback.mo3514x90bd1f84(andIncrement);
            }
        });
        return andIncrement;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: stopRepeating */
    public void mo5660x6108ba85() {
        this.f2526x94b0b550.mo3291x6108ba85();
    }

    /* renamed from: updateRepeating */
    public void m6814x20cb799e(final int i17, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        if (this.f2526x94b0b550 == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "mRequestProcessor is null, ignore repeating request");
            return;
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c c1032x6368322c = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c();
        c1032x6368322c.m6860xbdb5c23(this.f2522xf735ddde.mo6785x5db1b11());
        if (this.f2511xba24dcac != null) {
            c1032x6368322c.m6860xbdb5c23(this.f2511xba24dcac.mo6785x5db1b11());
        }
        c1032x6368322c.m6864x6a1ea537(1);
        m6808x67b22ff8(c1032x6368322c);
        m6809x21b5ed99(c1032x6368322c);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.3
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
            /* renamed from: onCaptureCompleted */
            public void mo5571x34cad1a4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                java.lang.Long l17;
                android.hardware.camera2.CaptureResult mo2933x2fc52b4d = interfaceC0663xe081a7be.mo2933x2fc52b4d();
                m3.h.b(mo2933x2fc52b4d instanceof android.hardware.camera2.TotalCaptureResult, "Cannot get TotalCaptureResult from the cameraCaptureResult ");
                android.hardware.camera2.TotalCaptureResult totalCaptureResult = (android.hardware.camera2.TotalCaptureResult) mo2933x2fc52b4d;
                if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2524x90f01437 != null) {
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2524x90f01437.m6853xdd88e63a(totalCaptureResult);
                } else {
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e;
                    if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8) && (l17 = (java.lang.Long) totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP)) != null) {
                        captureCallback.mo3513x34cad1a4(l17.longValue(), i17, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0989xf008e111(totalCaptureResult));
                    }
                }
                if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2527xaebd6807 != null && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.f2527xaebd6807.process(totalCaptureResult) != null) {
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431.this.m6814x20cb799e(i17, captureCallback);
                }
                captureCallback.mo3516xc68039e3(i17);
            }
        };
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "requestProcessor setRepeating");
        this.f2526x94b0b550.mo3290x34b1f225(c1032x6368322c.m6861x59bc66e(), callback);
    }
}
