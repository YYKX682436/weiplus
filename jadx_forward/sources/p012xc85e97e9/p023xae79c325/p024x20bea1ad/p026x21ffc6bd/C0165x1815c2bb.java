package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline */
/* loaded from: classes14.dex */
public class C0165x1815c2bb {
    private static final java.lang.String TAG = "Camera2CapturePipeline";

    /* renamed from: mCameraControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f285x471e5f0b;

    /* renamed from: mCameraQuirk */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 f286x2404b4ec;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f287x9ec3a060;

    /* renamed from: mHasFlashUnit */
    private final boolean f288x1276b927;

    /* renamed from: mIsLegacyDevice */
    private final boolean f289xf4af3f96;

    /* renamed from: mScheduler */
    private final java.util.concurrent.ScheduledExecutorService f290x71230ace;

    /* renamed from: mTemplate */
    private int f291xd6387407 = 1;

    /* renamed from: mUseTorchAsFlash */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0435x5061249 f292x10218a3c;

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask */
    /* loaded from: classes14.dex */
    public static class AePreCaptureTask implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask {

        /* renamed from: mCameraControl */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f293x471e5f0b;

        /* renamed from: mFlashMode */
        private final int f294x36526fc6;

        /* renamed from: mIsExecuted */
        private boolean f295x26af9726 = false;

        /* renamed from: mOverrideAeModeForStillCapture */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0421x6a050c74 f296xb38a1f27;

        public AePreCaptureTask(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, int i17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0421x6a050c74 c0421x6a050c74) {
            this.f293x471e5f0b = c0116xda12e2ab;
            this.f294x36526fc6 = i17;
            this.f296xb38a1f27 = c0421x6a050c74;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$0 */
        public /* synthetic */ java.lang.Object m3214x5294f8ac(t2.k kVar) {
            this.f293x471e5f0b.m2970x38978be2().m3439x1d222410(kVar);
            this.f296xb38a1f27.m4092x711279b();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$1 */
        public static /* synthetic */ java.lang.Boolean m3215x5294f8ad(java.lang.Void r07) {
            return java.lang.Boolean.TRUE;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: isCaptureResultNeeded */
        public boolean mo3216xd3055b0e() {
            return this.f294x36526fc6 == 0;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: postCapture */
        public void mo3217x40d4d286() {
            if (this.f295x26af9726) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "cancel TriggerAePreCapture");
                this.f293x471e5f0b.m2970x38978be2().m3444xe03d2775(false, true);
                this.f296xb38a1f27.m4091x646fbc98();
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: preCapture */
        public wa.a mo3218x6699ff23(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            if (!p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3203x1843e6a5(this.f294x36526fc6, totalCaptureResult)) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(java.lang.Boolean.FALSE);
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "Trigger AE");
            this.f295x26af9726 = true;
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask$$a
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3214x5294f8ac;
                    m3214x5294f8ac = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.AePreCaptureTask.this.m3214x5294f8ac(kVar);
                    return m3214x5294f8ac;
                }
            })).m6004x3ebe6b6c(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0168xcf0d0c4d(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$AfTask */
    /* loaded from: classes14.dex */
    public static class AfTask implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask {

        /* renamed from: mCameraControl */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f297x471e5f0b;

        /* renamed from: mIsExecuted */
        private boolean f298x26af9726 = false;

        public AfTask(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab) {
            this.f297x471e5f0b = c0116xda12e2ab;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: isCaptureResultNeeded */
        public boolean mo3216xd3055b0e() {
            return true;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: postCapture */
        public void mo3217x40d4d286() {
            if (this.f298x26af9726) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "cancel TriggerAF");
                this.f297x471e5f0b.m2970x38978be2().m3444xe03d2775(true, false);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: preCapture */
        public wa.a mo3218x6699ff23(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            java.lang.Integer num;
            wa.a m6013x95a8e8d4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(java.lang.Boolean.TRUE);
            if (totalCaptureResult == null || (num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_MODE)) == null) {
                return m6013x95a8e8d4;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "TriggerAf? AF mode auto");
                java.lang.Integer num2 = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "Trigger AF");
                    this.f298x26af9726 = true;
                    this.f297x471e5f0b.m2970x38978be2().m3461xd954cffd(null, false);
                }
            }
            return m6013x95a8e8d4;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$CameraCapturePipelineImpl */
    /* loaded from: classes14.dex */
    public static class CameraCapturePipelineImpl implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603 {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f299x9ec3a060;

        /* renamed from: mFlashMode */
        private int f300x36526fc6;

        /* renamed from: mPipelineDelegate */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline f301x979ef4d4;

        public CameraCapturePipelineImpl(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline pipeline, java.util.concurrent.Executor executor, int i17) {
            this.f301x979ef4d4 = pipeline;
            this.f299x9ec3a060 = executor;
            this.f300x36526fc6 = i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$invokePostCapture$1 */
        public /* synthetic */ java.lang.Object m3219x7e730b9e(t2.k kVar) {
            this.f301x979ef4d4.m3234x16a5b7d1();
            kVar.a(null);
            return "invokePostCaptureFuture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$invokePreCapture$0 */
        public static /* synthetic */ java.lang.Void m3220xdec89b84(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603
        /* renamed from: invokePostCapture */
        public wa.a mo3221xbabf3aee() {
            return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$CameraCapturePipelineImpl$$a
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3219x7e730b9e;
                    m3219x7e730b9e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.CameraCapturePipelineImpl.this.m3219x7e730b9e(kVar);
                    return m3219x7e730b9e;
                }
            });
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603
        /* renamed from: invokePreCapture */
        public wa.a mo3222x7b0ce9bb() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "invokePreCapture");
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(this.f301x979ef4d4.m3235x75c1c478(this.f300x36526fc6)).m6004x3ebe6b6c(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0170x1099ab88(), this.f299x9ec3a060);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline */
    /* loaded from: classes14.dex */
    public static class Pipeline {

        /* renamed from: CHECK_3A_TIMEOUT_IN_NS */
        private static final long f302x70040107;

        /* renamed from: CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS */
        private static final long f303x8917d553;

        /* renamed from: mCameraControl */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f304x471e5f0b;

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f305x9ec3a060;

        /* renamed from: mIsLegacyDevice */
        private final boolean f306xf4af3f96;

        /* renamed from: mOverrideAeModeForStillCapture */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0421x6a050c74 f307xb38a1f27;

        /* renamed from: mScheduler */
        private final java.util.concurrent.ScheduledExecutorService f309x71230ace;

        /* renamed from: mTemplate */
        private final int f311xd6387407;

        /* renamed from: mTimeout3A */
        private long f312x7dc8c9a2 = f302x70040107;

        /* renamed from: mTasks */
        final java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask> f310xbecdc721 = new java.util.ArrayList();

        /* renamed from: mPipelineSubTask */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask f308xcdbf8ab6 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.AnonymousClass1();

        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        /* loaded from: classes14.dex */
        public class AnonymousClass1 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: lambda$preCapture$0 */
            public static /* synthetic */ java.lang.Boolean m3237x5294f8ac(java.util.List list) {
                return java.lang.Boolean.valueOf(list.contains(java.lang.Boolean.TRUE));
            }

            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
            /* renamed from: isCaptureResultNeeded */
            public boolean mo3216xd3055b0e() {
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask> it = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.this.f310xbecdc721.iterator();
                while (it.hasNext()) {
                    if (it.next().mo3216xd3055b0e()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
            /* renamed from: postCapture */
            public void mo3217x40d4d286() {
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask> it = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.this.f310xbecdc721.iterator();
                while (it.hasNext()) {
                    it.next().mo3217x40d4d286();
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
            /* renamed from: preCapture */
            public wa.a mo3218x6699ff23(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask> it = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.this.f310xbecdc721.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo3218x6699ff23(totalCaptureResult));
                }
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6030x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6008xc771b0f1(arrayList), new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0177x43bb3489(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            }
        }

        static {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            f302x70040107 = timeUnit.toNanos(1L);
            f303x8917d553 = timeUnit.toNanos(5L);
        }

        public Pipeline(int i17, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, boolean z17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0421x6a050c74 c0421x6a050c74) {
            this.f311xd6387407 = i17;
            this.f305x9ec3a060 = executor;
            this.f309x71230ace = scheduledExecutorService;
            this.f304x471e5f0b = c0116xda12e2ab;
            this.f306xf4af3f96 = z17;
            this.f307xb38a1f27 = c0421x6a050c74;
        }

        /* renamed from: applyAeModeQuirk */
        private void m3224x8c15bc9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
            builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 3);
            builder.m5347x2f697c6b(builder2.mo2888x59bc66e());
        }

        /* renamed from: applyStillCaptureTemplate */
        private void m3225x95b257a6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
            int i17 = (this.f311xd6387407 != 3 || this.f306xf4af3f96) ? (c0690x88f65a08.m5337x26c6954a() == -1 || c0690x88f65a08.m5337x26c6954a() == 5) ? 2 : -1 : 4;
            if (i17 != -1) {
                builder.m5366x5d0f9056(i17);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$executeCapture$0 */
        public /* synthetic */ wa.a m3226x674fd99a(java.util.List list, int i17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return m3236x5b665416(list, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$executePreCapture$1 */
        public /* synthetic */ wa.a m3227x82f95aa8(int i17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3203x1843e6a5(i17, totalCaptureResult)) {
                m3231x5ed2b14d(f303x8917d553);
            }
            return this.f308xcdbf8ab6.mo3218x6699ff23(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$executePreCapture$3 */
        public /* synthetic */ wa.a m3229x82f95aaa(java.lang.Boolean bool) {
            return java.lang.Boolean.TRUE.equals(bool) ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3206x41de2851(this.f312x7dc8c9a2, this.f309x71230ace, this.f304x471e5f0b, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0176xd81cb17b()) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$submitConfigsInternal$4 */
        public /* synthetic */ java.lang.Object m3230xc4b1f149(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder, final t2.k kVar) {
            builder.m5345xd4aa81a5(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
                /* renamed from: onCaptureCancelled */
                public void mo3015xa4d204aa(int i17) {
                    kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
                /* renamed from: onCaptureCompleted */
                public void mo3016x34cad1a4(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                    kVar.a(null);
                }

                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
                /* renamed from: onCaptureFailed */
                public void mo3017x90bd1f84(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
                    kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(2, "Capture request failed with reason " + c0661xad844609.m5222x2d5cb53a(), null));
                }
            });
            return "submitStillCapture";
        }

        /* renamed from: setTimeout3A */
        private void m3231x5ed2b14d(long j17) {
            this.f312x7dc8c9a2 = j17;
        }

        /* renamed from: addTask */
        public void m3232xbb89e9c6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask pipelineTask) {
            this.f310xbecdc721.add(pipelineTask);
        }

        /* renamed from: executeCapture */
        public wa.a m3233xdc050a11(final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list, final int i17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e m6005x9aa1ea70 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(m3235x75c1c478(i17)).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$d
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3226x674fd99a;
                    m3226x674fd99a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.this.m3226x674fd99a(list, i17, (android.hardware.camera2.TotalCaptureResult) obj);
                    return m3226x674fd99a;
                }
            }, this.f305x9ec3a060);
            m6005x9aa1ea70.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$e
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.this.m3234x16a5b7d1();
                }
            }, this.f305x9ec3a060);
            return m6005x9aa1ea70;
        }

        /* renamed from: executePostCapture */
        public void m3234x16a5b7d1() {
            this.f308xcdbf8ab6.mo3217x40d4d286();
        }

        /* renamed from: executePreCapture */
        public wa.a m3235x75c1c478(final int i17) {
            wa.a m6013x95a8e8d4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
            if (this.f310xbecdc721.isEmpty()) {
                return m6013x95a8e8d4;
            }
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(this.f308xcdbf8ab6.mo3216xd3055b0e() ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3207x41de2851(this.f304x471e5f0b, null) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null)).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$b
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3227x82f95aa8;
                    m3227x82f95aa8 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.this.m3227x82f95aa8(i17, (android.hardware.camera2.TotalCaptureResult) obj);
                    return m3227x82f95aa8;
                }
            }, this.f305x9ec3a060).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$c
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3229x82f95aaa;
                    m3229x82f95aaa = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.this.m3229x82f95aaa((java.lang.Boolean) obj);
                    return m3229x82f95aaa;
                }
            }, this.f305x9ec3a060);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /* renamed from: submitConfigsInternal */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public wa.a m3236x5b665416(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> r7, int r8) {
            /*
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r7 = r7.iterator()
            Le:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L8c
                java.lang.Object r2 = r7.next()
                androidx.camera.core.impl.CaptureConfig r2 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08) r2
                androidx.camera.core.impl.CaptureConfig$Builder r3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder.m5342x3017aa(r2)
                int r4 = r2.m5337x26c6954a()
                r5 = 5
                if (r4 != r5) goto L63
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.f304x471e5f0b
                androidx.camera.camera2.internal.ZslControl r4 = r4.m2984x62ed6980()
                boolean r4 = r4.mo3677x29f70177()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.f304x471e5f0b
                androidx.camera.camera2.internal.ZslControl r4 = r4.m2984x62ed6980()
                boolean r4 = r4.mo3678x2b396b79()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.f304x471e5f0b
                androidx.camera.camera2.internal.ZslControl r4 = r4.m2984x62ed6980()
                androidx.camera.core.ImageProxy r4 = r4.mo3675x7737cf5()
                if (r4 == 0) goto L57
                androidx.camera.camera2.internal.Camera2CameraControlImpl r5 = r6.f304x471e5f0b
                androidx.camera.camera2.internal.ZslControl r5 = r5.m2984x62ed6980()
                boolean r5 = r5.mo3676x4b0a82c0(r4)
                if (r5 == 0) goto L57
                r5 = 1
                goto L58
            L57:
                r5 = 0
            L58:
                if (r5 == 0) goto L63
                androidx.camera.core.ImageInfo r4 = r4.mo4173xcb10cdf3()
                androidx.camera.core.impl.CameraCaptureResult r4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0664x2fb35075.m5256xf262a602(r4)
                goto L64
            L63:
                r4 = 0
            L64:
                if (r4 == 0) goto L6a
                r3.m5360x3c427c1c(r4)
                goto L6d
            L6a:
                r6.m3225x95b257a6(r3, r2)
            L6d:
                androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r2 = r6.f307xb38a1f27
                boolean r2 = r2.m4093x43f4decb(r8)
                if (r2 == 0) goto L78
                r6.m3224x8c15bc9(r3)
            L78:
                androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$a r2 = new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$a
                r2.<init>()
                wa.a r2 = t2.p.a(r2)
                r0.add(r2)
                androidx.camera.core.impl.CaptureConfig r2 = r3.m5350x59bc66e()
                r1.add(r2)
                goto Le
            L8c:
                androidx.camera.camera2.internal.Camera2CameraControlImpl r7 = r6.f304x471e5f0b
                r7.m3003xbf0642cf(r1)
                wa.a r7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6008xc771b0f1(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline.m3236x5b665416(java.util.List, int):wa.a");
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask */
    /* loaded from: classes14.dex */
    public interface PipelineTask {
        /* renamed from: isCaptureResultNeeded */
        boolean mo3216xd3055b0e();

        /* renamed from: postCapture */
        void mo3217x40d4d286();

        /* renamed from: preCapture */
        wa.a mo3218x6699ff23(android.hardware.camera2.TotalCaptureResult totalCaptureResult);
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener */
    /* loaded from: classes14.dex */
    public static class ResultListener implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener {

        /* renamed from: mChecker */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener.Checker f316xca578288;

        /* renamed from: mCompleter */
        private t2.k f317x2718406c;

        /* renamed from: mFuture */
        private final wa.a f318x421b490 = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3238x51ef5f0f;
                m3238x51ef5f0f = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener.this.m3238x51ef5f0f(kVar);
                return m3238x51ef5f0f;
            }
        });

        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener$Checker */
        /* loaded from: classes14.dex */
        public interface Checker {
            /* renamed from: check */
            boolean mo3212x5a3e508(android.hardware.camera2.TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener.Checker checker) {
            this.f316xca578288 = checker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$new$0 */
        public /* synthetic */ java.lang.Object m3238x51ef5f0f(t2.k kVar) {
            this.f317x2718406c = kVar;
            return "waitFor3AResult";
        }

        /* renamed from: getFuture */
        public wa.a m3239x19ccb0b9() {
            return this.f318x421b490;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
        /* renamed from: onCaptureResult */
        public boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener.Checker checker = this.f316xca578288;
            if (checker != null && !checker.mo3212x5a3e508(totalCaptureResult)) {
                return false;
            }
            this.f317x2718406c.a(totalCaptureResult);
            return true;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask */
    /* loaded from: classes14.dex */
    public static class ScreenFlashTask implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask {

        /* renamed from: CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS */
        private static final long f319xda4681e = java.util.concurrent.TimeUnit.SECONDS.toNanos(2);

        /* renamed from: mCameraControl */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f320x471e5f0b;

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f321x9ec3a060;

        /* renamed from: mScheduler */
        private final java.util.concurrent.ScheduledExecutorService f322x71230ace;

        /* renamed from: mScreenFlash */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash f323xa617b437;

        /* renamed from: mUseFlashModeTorchFor3aUpdate */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0434xebefc350 f324x82f40e3d;

        public ScreenFlashTask(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0434xebefc350 c0434xebefc350) {
            this.f320x471e5f0b = c0116xda12e2ab;
            this.f321x9ec3a060 = executor;
            this.f322x71230ace = scheduledExecutorService;
            this.f324x82f40e3d = c0434xebefc350;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash m2975xd5e0e9ae = c0116xda12e2ab.m2975xd5e0e9ae();
            java.util.Objects.requireNonNull(m2975xd5e0e9ae);
            this.f323xa617b437 = m2975xd5e0e9ae;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$postCapture$12 */
        public static /* synthetic */ void m3241x2181b7c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$0 */
        public static /* synthetic */ void m3242x5294f8ac(t2.k kVar) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "ScreenFlashTask#preCapture: UI change applied");
            kVar.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$1 */
        public static /* synthetic */ java.lang.Object m3243x5294f8ad(java.util.concurrent.atomic.AtomicReference atomicReference, final t2.k kVar) {
            atomicReference.set(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$a
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlashListener
                /* renamed from: onCompleted */
                public final void mo3213xaa8b332c() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.m3242x5294f8ac(t2.k.this);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$10 */
        public /* synthetic */ wa.a m3244xa1d23(java.lang.Void r57) {
            return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3206x41de2851(f319xda4681e, this.f322x71230ace, this.f320x471e5f0b, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0188xfe6e696a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$11 */
        public static /* synthetic */ java.lang.Boolean m3245xa1d24(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return java.lang.Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$2 */
        public /* synthetic */ void m3246x5294f8ae(java.util.concurrent.atomic.AtomicReference atomicReference, t2.k kVar) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.f323xa617b437.mo4594x58b836e(java.lang.System.currentTimeMillis() + java.util.concurrent.TimeUnit.SECONDS.toMillis(3L), (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlashListener) atomicReference.get());
            kVar.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$3 */
        public /* synthetic */ java.lang.Object m3247x5294f8af(final java.util.concurrent.atomic.AtomicReference atomicReference, final t2.k kVar) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$g
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3246x5294f8ae(atomicReference, kVar);
                }
            });
            return "OnScreenFlashStart";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$4 */
        public /* synthetic */ wa.a m3248x5294f8b0(java.lang.Void r27) {
            return this.f320x471e5f0b.m2970x38978be2().m3449x1d44eca9(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$5 */
        public /* synthetic */ java.lang.Object m3249x5294f8b1(t2.k kVar) {
            if (!this.f324x82f40e3d.m4114xd66315fd()) {
                kVar.a(null);
                return "EnableTorchInternal";
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "ScreenFlashTask#preCapture: enable torch");
            this.f320x471e5f0b.m2963x4b179a16(true);
            kVar.a(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$6 */
        public /* synthetic */ wa.a m3250x5294f8b2(java.lang.Void r17) {
            return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$f
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3249x5294f8b1;
                    m3249x5294f8b1 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3249x5294f8b1(kVar);
                    return m3249x5294f8b1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$7 */
        public /* synthetic */ wa.a m3251x5294f8b3(wa.a aVar, java.lang.Object obj) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6023xe7063736(java.util.concurrent.TimeUnit.SECONDS.toMillis(3L), this.f322x71230ace, null, true, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$8 */
        public /* synthetic */ wa.a m3252x5294f8b4(java.lang.Void r17) {
            return this.f320x471e5f0b.m2970x38978be2().m3459x3831485f();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: isCaptureResultNeeded */
        public boolean mo3216xd3055b0e() {
            return false;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: postCapture */
        public void mo3217x40d4d286() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "ScreenFlashTask#postCapture");
            if (this.f324x82f40e3d.m4114xd66315fd()) {
                this.f320x471e5f0b.m2963x4b179a16(false);
            }
            this.f320x471e5f0b.m2970x38978be2().m3449x1d44eca9(false).mo606x162a7075(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.RunnableC0186xfe6e6968(), this.f321x9ec3a060);
            this.f320x471e5f0b.m2970x38978be2().m3444xe03d2775(false, true);
            java.util.concurrent.ScheduledExecutorService m5982x891c9b16 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16();
            final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash screenFlash = this.f323xa617b437;
            java.util.Objects.requireNonNull(screenFlash);
            m5982x891c9b16.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$i
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash.this.mo4595x5a5b64d();
                }
            });
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: preCapture */
        public wa.a mo3218x6699ff23(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "ScreenFlashTask#preCapture");
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            final wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$k
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3243x5294f8ad;
                    m3243x5294f8ad = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.m3243x5294f8ad(atomicReference, kVar);
                    return m3243x5294f8ad;
                }
            });
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$l
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3247x5294f8af;
                    m3247x5294f8af = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3247x5294f8af(atomicReference, kVar);
                    return m3247x5294f8af;
                }
            })).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$m
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3248x5294f8b0;
                    m3248x5294f8b0 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3248x5294f8b0((java.lang.Void) obj);
                    return m3248x5294f8b0;
                }
            }, this.f321x9ec3a060).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$n
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3250x5294f8b2;
                    m3250x5294f8b2 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3250x5294f8b2((java.lang.Void) obj);
                    return m3250x5294f8b2;
                }
            }, this.f321x9ec3a060).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$b
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3251x5294f8b3;
                    m3251x5294f8b3 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3251x5294f8b3(a17, obj);
                    return m3251x5294f8b3;
                }
            }, this.f321x9ec3a060).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$c
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3252x5294f8b4;
                    m3252x5294f8b4 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3252x5294f8b4((java.lang.Void) obj);
                    return m3252x5294f8b4;
                }
            }, this.f321x9ec3a060).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$d
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3244xa1d23;
                    m3244xa1d23 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask.this.m3244xa1d23((java.lang.Void) obj);
                    return m3244xa1d23;
                }
            }, this.f321x9ec3a060).m6004x3ebe6b6c(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0183xfe6e6965(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask */
    /* loaded from: classes14.dex */
    public static class TorchTask implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask {

        /* renamed from: CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS */
        private static final long f325x5848b45f = java.util.concurrent.TimeUnit.SECONDS.toNanos(2);

        /* renamed from: mCameraControl */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f326x471e5f0b;

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f327x9ec3a060;

        /* renamed from: mFlashMode */
        private final int f328x36526fc6;

        /* renamed from: mIsExecuted */
        private boolean f329x26af9726 = false;

        /* renamed from: mScheduler */
        private final java.util.concurrent.ScheduledExecutorService f330x71230ace;

        /* renamed from: mTriggerAePrecapture */
        private final boolean f331x22cd56b2;

        public TorchTask(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, int i17, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, boolean z17) {
            this.f326x471e5f0b = c0116xda12e2ab;
            this.f328x36526fc6 = i17;
            this.f327x9ec3a060 = executor;
            this.f330x71230ace = scheduledExecutorService;
            this.f331x22cd56b2 = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$0 */
        public /* synthetic */ java.lang.Object m3255x5294f8ac(t2.k kVar) {
            this.f326x471e5f0b.m2981x5b308837().m3633x24339869(kVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$1 */
        public /* synthetic */ wa.a m3256x5294f8ad(java.lang.Void r17) {
            return this.f331x22cd56b2 ? this.f326x471e5f0b.m2970x38978be2().m3459x3831485f() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$3 */
        public /* synthetic */ wa.a m3258x5294f8af(java.lang.Void r57) {
            return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3206x41de2851(f325x5848b45f, this.f330x71230ace, this.f326x471e5f0b, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0193x7bf54009());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$preCapture$4 */
        public static /* synthetic */ java.lang.Boolean m3259x5294f8b0(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return java.lang.Boolean.FALSE;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: isCaptureResultNeeded */
        public boolean mo3216xd3055b0e() {
            return this.f328x36526fc6 == 0;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: postCapture */
        public void mo3217x40d4d286() {
            if (this.f329x26af9726) {
                this.f326x471e5f0b.m2981x5b308837().m3633x24339869(null, false);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "Turning off torch");
                if (this.f331x22cd56b2) {
                    this.f326x471e5f0b.m2970x38978be2().m3444xe03d2775(false, true);
                }
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.PipelineTask
        /* renamed from: preCapture */
        public wa.a mo3218x6699ff23(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "TorchTask#preCapture: isFlashRequired = " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3203x1843e6a5(this.f328x36526fc6, totalCaptureResult));
            if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.m3203x1843e6a5(this.f328x36526fc6, totalCaptureResult)) {
                if (!this.f326x471e5f0b.m2988x99a31671()) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "Turn on torch");
                    this.f329x26af9726 = true;
                    return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$b
                        @Override // t2.m
                        /* renamed from: attachCompleter */
                        public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                            java.lang.Object m3255x5294f8ac;
                            m3255x5294f8ac = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TorchTask.this.m3255x5294f8ac(kVar);
                            return m3255x5294f8ac;
                        }
                    })).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$c
                        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                        /* renamed from: apply */
                        public final wa.a mo3010x58b836e(java.lang.Object obj) {
                            wa.a m3256x5294f8ad;
                            m3256x5294f8ad = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TorchTask.this.m3256x5294f8ad((java.lang.Void) obj);
                            return m3256x5294f8ad;
                        }
                    }, this.f327x9ec3a060).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$d
                        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                        /* renamed from: apply */
                        public final wa.a mo3010x58b836e(java.lang.Object obj) {
                            wa.a m3258x5294f8af;
                            m3258x5294f8af = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TorchTask.this.m3258x5294f8af((java.lang.Void) obj);
                            return m3258x5294f8af;
                        }
                    }, this.f327x9ec3a060).m6004x3ebe6b6c(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0197x7bf5400d(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TAG, "Torch already on, not turn on");
            }
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(java.lang.Boolean.FALSE);
        }
    }

    public C0165x1815c2bb(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f285x471e5f0b = c0116xda12e2ab;
        java.lang.Integer num = (java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f289xf4af3f96 = num != null && num.intValue() == 2;
        this.f287x9ec3a060 = executor;
        this.f290x71230ace = scheduledExecutorService;
        this.f286x2404b4ec = c0744x90dabc95;
        this.f292x10218a3c = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0435x5061249(c0744x90dabc95);
        this.f288x1276b927 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0414xa74f3bea.m4074x9ae63083(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0161x3d9a46c1(c0322x11ef9595));
    }

    /* renamed from: is3AConverged */
    public static boolean m3202x5b59c28d(android.hardware.camera2.TotalCaptureResult totalCaptureResult, boolean z17) {
        if (totalCaptureResult == null) {
            return false;
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0696xe583b5e0.m5395x5b59c28d(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0115xf008e111(totalCaptureResult), z17);
    }

    /* renamed from: isFlashRequired */
    public static boolean m3203x1843e6a5(int i17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "isFlashRequired: flashMode = " + i17);
        if (i17 == 0) {
            java.lang.Integer num = totalCaptureResult != null ? (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE) : null;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                return false;
            }
            if (i17 != 3) {
                throw new java.lang.AssertionError(i17);
            }
        }
        return true;
    }

    /* renamed from: isTorchAsFlash */
    private boolean m3204x67ac458c(int i17) {
        return this.f292x10218a3c.m4115xefac8036() || this.f291xd6387407 == 3 || i17 == 1;
    }

    /* renamed from: waitForResult */
    public static wa.a m3206x41de2851(long j17, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener.Checker checker) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6023xe7063736(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17), scheduledExecutorService, null, true, m3207x41de2851(c0116xda12e2ab, checker));
    }

    /* renamed from: createPipeline */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline m3208x20cff3be(int i17, int i18, int i19) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0421x6a050c74 c0421x6a050c74 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0421x6a050c74(this.f286x2404b4ec);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline pipeline = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.Pipeline(this.f291xd6387407, this.f287x9ec3a060, this.f290x71230ace, this.f285x471e5f0b, this.f289xf4af3f96, c0421x6a050c74);
        if (i17 == 0) {
            pipeline.m3232xbb89e9c6(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.AfTask(this.f285x471e5f0b));
        }
        if (i18 == 3) {
            pipeline.m3232xbb89e9c6(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ScreenFlashTask(this.f285x471e5f0b, this.f287x9ec3a060, this.f290x71230ace, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0434xebefc350(this.f286x2404b4ec)));
        } else if (this.f288x1276b927) {
            if (m3204x67ac458c(i19)) {
                pipeline.m3232xbb89e9c6(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.TorchTask(this.f285x471e5f0b, i18, this.f287x9ec3a060, this.f290x71230ace, (this.f292x10218a3c.m4115xefac8036() || this.f285x471e5f0b.mo2987xa967f35()) ? false : true));
            } else {
                pipeline.m3232xbb89e9c6(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.AePreCaptureTask(this.f285x471e5f0b, i18, c0421x6a050c74));
            }
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "createPipeline: captureMode = " + i17 + ", flashMode = " + i18 + ", flashType = " + i19 + ", pipeline tasks = " + pipeline.f310xbecdc721);
        return pipeline;
    }

    /* renamed from: getCameraCapturePipeline */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603 m3209x6357a86d(int i17, int i18, int i19) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.CameraCapturePipelineImpl(m3208x20cff3be(i17, i18, i19), this.f287x9ec3a060, i18);
    }

    /* renamed from: setTemplate */
    public void m3210x27cd6afc(int i17) {
        this.f291xd6387407 = i17;
    }

    /* renamed from: submitStillCaptures */
    public wa.a m3211xd95c167d(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list, int i17, int i18, int i19) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(m3208x20cff3be(i17, i18, i19).m3233xdc050a11(list, i18));
    }

    /* renamed from: waitForResult */
    public static wa.a m3207x41de2851(final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener.Checker checker) {
        final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener resultListener = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0165x1815c2bb.ResultListener(checker);
        c0116xda12e2ab.m2954x6b801ab6(resultListener);
        wa.a m3239x19ccb0b9 = resultListener.m3239x19ccb0b9();
        m3239x19ccb0b9.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.this.m2990x7b0076b3(resultListener);
            }
        }, c0116xda12e2ab.f150x9ec3a060);
        return m3239x19ccb0b9;
    }
}
