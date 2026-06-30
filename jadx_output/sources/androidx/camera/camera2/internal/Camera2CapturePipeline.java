package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class Camera2CapturePipeline {
    private static final java.lang.String TAG = "Camera2CapturePipeline";
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
    private final androidx.camera.core.impl.Quirks mCameraQuirk;
    private final java.util.concurrent.Executor mExecutor;
    private final boolean mHasFlashUnit;
    private final boolean mIsLegacyDevice;
    private final java.util.concurrent.ScheduledExecutorService mScheduler;
    private int mTemplate = 1;
    private final androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash mUseTorchAsFlash;

    /* loaded from: classes14.dex */
    public static class AePreCaptureTask implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        public AePreCaptureTask(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, int i17, androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i17;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$preCapture$0(t2.k kVar) {
            this.mCameraControl.getFocusMeteringControl().lambda$triggerAePrecapture$2(kVar);
            this.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Boolean lambda$preCapture$1(java.lang.Void r07) {
            return java.lang.Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public wa.a preCapture(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            if (!androidx.camera.camera2.internal.Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(java.lang.Boolean.FALSE);
            }
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return androidx.camera.core.impl.utils.futures.FutureChain.from(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask$$a
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$preCapture$0;
                    lambda$preCapture$0 = androidx.camera.camera2.internal.Camera2CapturePipeline.AePreCaptureTask.this.lambda$preCapture$0(kVar);
                    return lambda$preCapture$0;
                }
            })).transform(new androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask$$b(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    /* loaded from: classes14.dex */
    public static class AfTask implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        public AfTask(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public wa.a preCapture(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            java.lang.Integer num;
            wa.a immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(java.lang.Boolean.TRUE);
            if (totalCaptureResult == null || (num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_MODE)) == null) {
                return immediateFuture;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                java.lang.Integer num2 = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return immediateFuture;
        }
    }

    /* loaded from: classes14.dex */
    public static class CameraCapturePipelineImpl implements androidx.camera.core.imagecapture.CameraCapturePipeline {
        private final java.util.concurrent.Executor mExecutor;
        private int mFlashMode;
        private final androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline mPipelineDelegate;

        public CameraCapturePipelineImpl(androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline pipeline, java.util.concurrent.Executor executor, int i17) {
            this.mPipelineDelegate = pipeline;
            this.mExecutor = executor;
            this.mFlashMode = i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$invokePostCapture$1(t2.k kVar) {
            this.mPipelineDelegate.executePostCapture();
            kVar.a(null);
            return "invokePostCaptureFuture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Void lambda$invokePreCapture$0(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public wa.a invokePostCapture() {
            return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$CameraCapturePipelineImpl$$a
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$invokePostCapture$1;
                    lambda$invokePostCapture$1 = androidx.camera.camera2.internal.Camera2CapturePipeline.CameraCapturePipelineImpl.this.lambda$invokePostCapture$1(kVar);
                    return lambda$invokePostCapture$1;
                }
            });
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public wa.a invokePreCapture() {
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "invokePreCapture");
            return androidx.camera.core.impl.utils.futures.FutureChain.from(this.mPipelineDelegate.executePreCapture(this.mFlashMode)).transform(new androidx.camera.camera2.internal.Camera2CapturePipeline$CameraCapturePipelineImpl$$b(), this.mExecutor);
        }
    }

    /* loaded from: classes14.dex */
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private final java.util.concurrent.Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final java.util.concurrent.ScheduledExecutorService mScheduler;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final java.util.List<androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask> mTasks = new java.util.ArrayList();
        private final androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask mPipelineSubTask = new androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.AnonymousClass1();

        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        /* loaded from: classes14.dex */
        public class AnonymousClass1 implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ java.lang.Boolean lambda$preCapture$0(java.util.List list) {
                return java.lang.Boolean.valueOf(list.contains(java.lang.Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                java.util.Iterator<androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask> it = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    if (it.next().isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                java.util.Iterator<androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask> it = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    it.next().postCapture();
                }
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public wa.a preCapture(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask> it = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().preCapture(totalCaptureResult));
                }
                return androidx.camera.core.impl.utils.futures.Futures.transform(androidx.camera.core.impl.utils.futures.Futures.allAsList(arrayList), new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1$$a(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            }
        }

        static {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        }

        public Pipeline(int i17, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, boolean z17, androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i17;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z17;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        private void applyAeModeQuirk(androidx.camera.core.impl.CaptureConfig.Builder builder) {
            androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(androidx.camera.core.impl.CaptureConfig.Builder builder, androidx.camera.core.impl.CaptureConfig captureConfig) {
            int i17 = (this.mTemplate != 3 || this.mIsLegacyDevice) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
            if (i17 != -1) {
                builder.setTemplateType(i17);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$executeCapture$0(java.util.List list, int i17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return submitConfigsInternal(list, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$executePreCapture$1(int i17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            if (androidx.camera.camera2.internal.Camera2CapturePipeline.isFlashRequired(i17, totalCaptureResult)) {
                setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return this.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$executePreCapture$3(java.lang.Boolean bool) {
            return java.lang.Boolean.TRUE.equals(bool) ? androidx.camera.camera2.internal.Camera2CapturePipeline.waitForResult(this.mTimeout3A, this.mScheduler, this.mCameraControl, new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$f()) : androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$submitConfigsInternal$4(androidx.camera.core.impl.CaptureConfig.Builder builder, final t2.k kVar) {
            builder.addCameraCaptureCallback(new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled(int i17) {
                    kVar.b(new androidx.camera.core.ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                    kVar.a(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(int i17, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
                    kVar.b(new androidx.camera.core.ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }
            });
            return "submitStillCapture";
        }

        private void setTimeout3A(long j17) {
            this.mTimeout3A = j17;
        }

        public void addTask(androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        public wa.a executeCapture(final java.util.List<androidx.camera.core.impl.CaptureConfig> list, final int i17) {
            androidx.camera.core.impl.utils.futures.FutureChain transformAsync = androidx.camera.core.impl.utils.futures.FutureChain.from(executePreCapture(i17)).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$d
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$executeCapture$0;
                    lambda$executeCapture$0 = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.this.lambda$executeCapture$0(list, i17, (android.hardware.camera2.TotalCaptureResult) obj);
                    return lambda$executeCapture$0;
                }
            }, this.mExecutor);
            transformAsync.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$e
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.this.executePostCapture();
                }
            }, this.mExecutor);
            return transformAsync;
        }

        public void executePostCapture() {
            this.mPipelineSubTask.postCapture();
        }

        public wa.a executePreCapture(final int i17) {
            wa.a immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            if (this.mTasks.isEmpty()) {
                return immediateFuture;
            }
            return androidx.camera.core.impl.utils.futures.FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? androidx.camera.camera2.internal.Camera2CapturePipeline.waitForResult(this.mCameraControl, null) : androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null)).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$b
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$executePreCapture$1;
                    lambda$executePreCapture$1 = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.this.lambda$executePreCapture$1(i17, (android.hardware.camera2.TotalCaptureResult) obj);
                    return lambda$executePreCapture$1;
                }
            }, this.mExecutor).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$c
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$executePreCapture$3;
                    lambda$executePreCapture$3 = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.this.lambda$executePreCapture$3((java.lang.Boolean) obj);
                    return lambda$executePreCapture$3;
                }
            }, this.mExecutor);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public wa.a submitConfigsInternal(java.util.List<androidx.camera.core.impl.CaptureConfig> r7, int r8) {
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
                androidx.camera.core.impl.CaptureConfig r2 = (androidx.camera.core.impl.CaptureConfig) r2
                androidx.camera.core.impl.CaptureConfig$Builder r3 = androidx.camera.core.impl.CaptureConfig.Builder.from(r2)
                int r4 = r2.getTemplateType()
                r5 = 5
                if (r4 != r5) goto L63
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r4 = r4.getZslControl()
                boolean r4 = r4.isZslDisabledByFlashMode()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r4 = r4.getZslControl()
                boolean r4 = r4.isZslDisabledByUserCaseConfig()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r4 = r4.getZslControl()
                androidx.camera.core.ImageProxy r4 = r4.dequeueImageFromBuffer()
                if (r4 == 0) goto L57
                androidx.camera.camera2.internal.Camera2CameraControlImpl r5 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r5 = r5.getZslControl()
                boolean r5 = r5.enqueueImageToImageWriter(r4)
                if (r5 == 0) goto L57
                r5 = 1
                goto L58
            L57:
                r5 = 0
            L58:
                if (r5 == 0) goto L63
                androidx.camera.core.ImageInfo r4 = r4.getImageInfo()
                androidx.camera.core.impl.CameraCaptureResult r4 = androidx.camera.core.impl.CameraCaptureResults.retrieveCameraCaptureResult(r4)
                goto L64
            L63:
                r4 = 0
            L64:
                if (r4 == 0) goto L6a
                r3.setCameraCaptureResult(r4)
                goto L6d
            L6a:
                r6.applyStillCaptureTemplate(r3, r2)
            L6d:
                androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r2 = r6.mOverrideAeModeForStillCapture
                boolean r2 = r2.shouldSetAeModeAlwaysFlash(r8)
                if (r2 == 0) goto L78
                r6.applyAeModeQuirk(r3)
            L78:
                androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$a r2 = new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$a
                r2.<init>()
                wa.a r2 = t2.p.a(r2)
                r0.add(r2)
                androidx.camera.core.impl.CaptureConfig r2 = r3.build()
                r1.add(r2)
                goto Le
            L8c:
                androidx.camera.camera2.internal.Camera2CameraControlImpl r7 = r6.mCameraControl
                r7.submitCaptureRequestsInternal(r1)
                wa.a r7 = androidx.camera.core.impl.utils.futures.Futures.allAsList(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.submitConfigsInternal(java.util.List, int):wa.a");
        }
    }

    /* loaded from: classes14.dex */
    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        wa.a preCapture(android.hardware.camera2.TotalCaptureResult totalCaptureResult);
    }

    /* loaded from: classes14.dex */
    public static class ResultListener implements androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener {
        private final androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker mChecker;
        private t2.k mCompleter;
        private final wa.a mFuture = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$new$0;
                lambda$new$0 = androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.this.lambda$new$0(kVar);
                return lambda$new$0;
            }
        });

        /* loaded from: classes14.dex */
        public interface Checker {
            boolean check(android.hardware.camera2.TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker checker) {
            this.mChecker = checker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$new$0(t2.k kVar) {
            this.mCompleter = kVar;
            return "waitFor3AResult";
        }

        public wa.a getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker checker = this.mChecker;
            if (checker != null && !checker.check(totalCaptureResult)) {
                return false;
            }
            this.mCompleter.a(totalCaptureResult);
            return true;
        }
    }

    /* loaded from: classes14.dex */
    public static class ScreenFlashTask implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
        private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = java.util.concurrent.TimeUnit.SECONDS.toNanos(2);
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private final java.util.concurrent.Executor mExecutor;
        private final java.util.concurrent.ScheduledExecutorService mScheduler;
        private final androidx.camera.core.ImageCapture.ScreenFlash mScreenFlash;
        private final androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate mUseFlashModeTorchFor3aUpdate;

        public ScreenFlashTask(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mUseFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
            androidx.camera.core.ImageCapture.ScreenFlash screenFlash = camera2CameraControlImpl.getScreenFlash();
            java.util.Objects.requireNonNull(screenFlash);
            this.mScreenFlash = screenFlash;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$postCapture$12() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$preCapture$0(t2.k kVar) {
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: UI change applied");
            kVar.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Object lambda$preCapture$1(java.util.concurrent.atomic.AtomicReference atomicReference, final t2.k kVar) {
            atomicReference.set(new androidx.camera.core.ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$a
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$0(t2.k.this);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$preCapture$10(java.lang.Void r57) {
            return androidx.camera.camera2.internal.Camera2CapturePipeline.waitForResult(CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS, this.mScheduler, this.mCameraControl, new androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Boolean lambda$preCapture$11(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return java.lang.Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$preCapture$2(java.util.concurrent.atomic.AtomicReference atomicReference, t2.k kVar) {
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.mScreenFlash.apply(java.lang.System.currentTimeMillis() + java.util.concurrent.TimeUnit.SECONDS.toMillis(3L), (androidx.camera.core.ImageCapture.ScreenFlashListener) atomicReference.get());
            kVar.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$preCapture$3(final java.util.concurrent.atomic.AtomicReference atomicReference, final t2.k kVar) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$g
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$2(atomicReference, kVar);
                }
            });
            return "OnScreenFlashStart";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$preCapture$4(java.lang.Void r27) {
            return this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$preCapture$5(t2.k kVar) {
            if (!this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                kVar.a(null);
                return "EnableTorchInternal";
            }
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: enable torch");
            this.mCameraControl.enableTorchInternal(true);
            kVar.a(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$preCapture$6(java.lang.Void r17) {
            return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$f
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$preCapture$5;
                    lambda$preCapture$5 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$5(kVar);
                    return lambda$preCapture$5;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$preCapture$7(wa.a aVar, java.lang.Object obj) {
            return androidx.camera.core.impl.utils.futures.Futures.makeTimeoutFuture(java.util.concurrent.TimeUnit.SECONDS.toMillis(3L), this.mScheduler, null, true, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$preCapture$8(java.lang.Void r17) {
            return this.mCameraControl.getFocusMeteringControl().triggerAePrecapture();
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return false;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "ScreenFlashTask#postCapture");
            if (this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                this.mCameraControl.enableTorchInternal(false);
            }
            this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(false).addListener(new androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$h(), this.mExecutor);
            this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
            java.util.concurrent.ScheduledExecutorService mainThreadExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
            final androidx.camera.core.ImageCapture.ScreenFlash screenFlash = this.mScreenFlash;
            java.util.Objects.requireNonNull(screenFlash);
            mainThreadExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$i
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.ImageCapture.ScreenFlash.this.clear();
                }
            });
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public wa.a preCapture(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture");
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            final wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$k
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$preCapture$1;
                    lambda$preCapture$1 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$1(atomicReference, kVar);
                    return lambda$preCapture$1;
                }
            });
            return androidx.camera.core.impl.utils.futures.FutureChain.from(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$l
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$preCapture$3;
                    lambda$preCapture$3 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$3(atomicReference, kVar);
                    return lambda$preCapture$3;
                }
            })).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$m
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$preCapture$4;
                    lambda$preCapture$4 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$4((java.lang.Void) obj);
                    return lambda$preCapture$4;
                }
            }, this.mExecutor).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$n
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$preCapture$6;
                    lambda$preCapture$6 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$6((java.lang.Void) obj);
                    return lambda$preCapture$6;
                }
            }, this.mExecutor).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$b
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$preCapture$7;
                    lambda$preCapture$7 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$7(a17, obj);
                    return lambda$preCapture$7;
                }
            }, this.mExecutor).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$c
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$preCapture$8;
                    lambda$preCapture$8 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$8((java.lang.Void) obj);
                    return lambda$preCapture$8;
                }
            }, this.mExecutor).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$d
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$preCapture$10;
                    lambda$preCapture$10 = androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask.this.lambda$preCapture$10((java.lang.Void) obj);
                    return lambda$preCapture$10;
                }
            }, this.mExecutor).transform(new androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask$$e(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    /* loaded from: classes14.dex */
    public static class TorchTask implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = java.util.concurrent.TimeUnit.SECONDS.toNanos(2);
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private final java.util.concurrent.Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final java.util.concurrent.ScheduledExecutorService mScheduler;
        private final boolean mTriggerAePrecapture;

        public TorchTask(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, int i17, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, boolean z17) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i17;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mTriggerAePrecapture = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$preCapture$0(t2.k kVar) {
            this.mCameraControl.getTorchControl().lambda$enableTorch$1(kVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$preCapture$1(java.lang.Void r17) {
            return this.mTriggerAePrecapture ? this.mCameraControl.getFocusMeteringControl().triggerAePrecapture() : androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ wa.a lambda$preCapture$3(java.lang.Void r57) {
            return androidx.camera.camera2.internal.Camera2CapturePipeline.waitForResult(CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS, this.mScheduler, this.mCameraControl, new androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Boolean lambda$preCapture$4(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return java.lang.Boolean.FALSE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().lambda$enableTorch$1(null, false);
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "Turning off torch");
                if (this.mTriggerAePrecapture) {
                    this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                }
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public wa.a preCapture(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "TorchTask#preCapture: isFlashRequired = " + androidx.camera.camera2.internal.Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult));
            if (androidx.camera.camera2.internal.Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (!this.mCameraControl.isTorchOn()) {
                    androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return androidx.camera.core.impl.utils.futures.FutureChain.from(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$b
                        @Override // t2.m
                        public final java.lang.Object attachCompleter(t2.k kVar) {
                            java.lang.Object lambda$preCapture$0;
                            lambda$preCapture$0 = androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask.this.lambda$preCapture$0(kVar);
                            return lambda$preCapture$0;
                        }
                    })).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$c
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final wa.a apply(java.lang.Object obj) {
                            wa.a lambda$preCapture$1;
                            lambda$preCapture$1 = androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask.this.lambda$preCapture$1((java.lang.Void) obj);
                            return lambda$preCapture$1;
                        }
                    }, this.mExecutor).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$d
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final wa.a apply(java.lang.Object obj) {
                            wa.a lambda$preCapture$3;
                            lambda$preCapture$3 = androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask.this.lambda$preCapture$3((java.lang.Void) obj);
                            return lambda$preCapture$3;
                        }
                    }, this.mExecutor).transform(new androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$e(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                }
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CapturePipeline.TAG, "Torch already on, not turn on");
            }
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(java.lang.Boolean.FALSE);
        }
    }

    public Camera2CapturePipeline(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, androidx.camera.core.impl.Quirks quirks, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.mCameraControl = camera2CameraControlImpl;
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = num != null && num.intValue() == 2;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash(quirks);
        this.mHasFlashUnit = androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker.isFlashAvailable(new androidx.camera.camera2.internal.Camera2CameraInfoImpl$$a(cameraCharacteristicsCompat));
    }

    public static boolean is3AConverged(android.hardware.camera2.TotalCaptureResult totalCaptureResult, boolean z17) {
        if (totalCaptureResult == null) {
            return false;
        }
        return androidx.camera.core.impl.ConvergenceUtils.is3AConverged(new androidx.camera.camera2.internal.Camera2CameraCaptureResult(totalCaptureResult), z17);
    }

    public static boolean isFlashRequired(int i17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.Logger.d(TAG, "isFlashRequired: flashMode = " + i17);
        if (i17 == 0) {
            java.lang.Integer num = totalCaptureResult != null ? (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE) : null;
            androidx.camera.core.Logger.d(TAG, "isFlashRequired: aeState = " + num);
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

    private boolean isTorchAsFlash(int i17) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i17 == 1;
    }

    public static wa.a waitForResult(long j17, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker checker) {
        return androidx.camera.core.impl.utils.futures.Futures.makeTimeoutFuture(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17), scheduledExecutorService, null, true, waitForResult(camera2CameraControlImpl, checker));
    }

    public androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline createPipeline(int i17, int i18, int i19) {
        androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture overrideAeModeForStillCapture = new androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture(this.mCameraQuirk);
        androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline pipeline = new androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline(this.mTemplate, this.mExecutor, this.mScheduler, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i17 == 0) {
            pipeline.addTask(new androidx.camera.camera2.internal.Camera2CapturePipeline.AfTask(this.mCameraControl));
        }
        if (i18 == 3) {
            pipeline.addTask(new androidx.camera.camera2.internal.Camera2CapturePipeline.ScreenFlashTask(this.mCameraControl, this.mExecutor, this.mScheduler, new androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate(this.mCameraQuirk)));
        } else if (this.mHasFlashUnit) {
            if (isTorchAsFlash(i19)) {
                pipeline.addTask(new androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask(this.mCameraControl, i18, this.mExecutor, this.mScheduler, (this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mCameraControl.isInVideoUsage()) ? false : true));
            } else {
                pipeline.addTask(new androidx.camera.camera2.internal.Camera2CapturePipeline.AePreCaptureTask(this.mCameraControl, i18, overrideAeModeForStillCapture));
            }
        }
        androidx.camera.core.Logger.d(TAG, "createPipeline: captureMode = " + i17 + ", flashMode = " + i18 + ", flashType = " + i19 + ", pipeline tasks = " + pipeline.mTasks);
        return pipeline;
    }

    public androidx.camera.core.imagecapture.CameraCapturePipeline getCameraCapturePipeline(int i17, int i18, int i19) {
        return new androidx.camera.camera2.internal.Camera2CapturePipeline.CameraCapturePipelineImpl(createPipeline(i17, i18, i19), this.mExecutor, i18);
    }

    public void setTemplate(int i17) {
        this.mTemplate = i17;
    }

    public wa.a submitStillCaptures(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i17, int i18, int i19) {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(createPipeline(i17, i18, i19).executeCapture(list, i18));
    }

    public static wa.a waitForResult(final androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker checker) {
        final androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener resultListener = new androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener(checker);
        camera2CameraControlImpl.addCaptureResultListener(resultListener);
        wa.a future = resultListener.getFuture();
        future.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraControlImpl.this.removeCaptureResultListener(resultListener);
            }
        }, camera2CameraControlImpl.mExecutor);
        return future;
    }
}
