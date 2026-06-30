package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class ProcessingCaptureSession implements androidx.camera.camera2.internal.CaptureSessionInterface {
    private static final java.lang.String TAG = "ProcessingCaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private static java.util.List<androidx.camera.core.impl.DeferrableSurface> sHeldProcessorSurfaces = new java.util.ArrayList();
    private static int sNextInstanceId = 0;
    private final androidx.camera.camera2.internal.Camera2CameraInfoImpl mCamera2CameraInfoImpl;
    private final androidx.camera.camera2.internal.CaptureSession mCaptureSession;
    final java.util.concurrent.Executor mExecutor;
    private int mInstanceId;
    private androidx.camera.core.impl.SessionConfig mProcessorSessionConfig;
    private androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState mProcessorState;
    private androidx.camera.camera2.internal.Camera2RequestProcessor mRequestProcessor;
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;
    private androidx.camera.core.impl.SessionConfig mSessionConfig;
    private final androidx.camera.core.impl.SessionProcessor mSessionProcessor;
    private final androidx.camera.camera2.internal.ProcessingCaptureSession.SessionProcessorCaptureCallback mSessionProcessorCaptureCallback;
    private java.util.List<androidx.camera.core.impl.DeferrableSurface> mOutputSurfaces = new java.util.ArrayList();
    private volatile java.util.List<androidx.camera.core.impl.CaptureConfig> mPendingCaptureConfigs = null;
    private androidx.camera.camera2.interop.CaptureRequestOptions mSessionOptions = new androidx.camera.camera2.interop.CaptureRequestOptions.Builder().build();
    private androidx.camera.camera2.interop.CaptureRequestOptions mStillCaptureOptions = new androidx.camera.camera2.interop.CaptureRequestOptions.Builder().build();

    /* loaded from: classes14.dex */
    public static class CaptureCallbackAdapter implements androidx.camera.core.impl.SessionProcessor.CaptureCallback {
        private java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCameraCaptureCallbacks;
        private final int mCaptureConfigId;
        private androidx.camera.core.impl.CameraCaptureResult mCaptureResult;

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long j17, int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            this.mCaptureResult = cameraCaptureResult;
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i17) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(this.mCaptureConfigId, new androidx.camera.core.impl.CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR));
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessProgressed(int i17) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProcessProgressed(this.mCaptureConfigId, i17);
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i17) {
            androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.mCaptureResult;
            if (cameraCaptureResult == null) {
                cameraCaptureResult = new androidx.camera.core.impl.CameraCaptureResult.EmptyCameraCaptureResult();
            }
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(this.mCaptureConfigId, cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int i17, long j17) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(this.mCaptureConfigId);
            }
        }

        private CaptureCallbackAdapter(int i17, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
            this.mCaptureResult = null;
            this.mCaptureConfigId = i17;
            this.mCameraCaptureCallbacks = list;
        }
    }

    /* loaded from: classes14.dex */
    public enum ProcessorState {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    /* loaded from: classes14.dex */
    public static class SessionProcessorCaptureCallback implements androidx.camera.core.impl.SessionProcessor.CaptureCallback {
        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long j17, int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i17) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessStarted(int i17) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceAborted(int i17) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i17) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int i17, long j17) {
        }
    }

    public ProcessingCaptureSession(androidx.camera.core.impl.SessionProcessor sessionProcessor, androidx.camera.camera2.internal.Camera2CameraInfoImpl camera2CameraInfoImpl, androidx.camera.camera2.internal.compat.params.DynamicRangesCompat dynamicRangesCompat, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.mInstanceId = 0;
        this.mCaptureSession = new androidx.camera.camera2.internal.CaptureSession(dynamicRangesCompat, androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk.class) != null);
        this.mSessionProcessor = sessionProcessor;
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
        this.mProcessorState = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED;
        this.mSessionProcessorCaptureCallback = new androidx.camera.camera2.internal.ProcessingCaptureSession.SessionProcessorCaptureCallback();
        int i17 = sNextInstanceId;
        sNextInstanceId = i17 + 1;
        this.mInstanceId = i17;
        androidx.camera.core.Logger.d(TAG, "New ProcessingCaptureSession (id=" + this.mInstanceId + ")");
    }

    private static void cancelRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        for (androidx.camera.core.impl.CaptureConfig captureConfig : list) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled(captureConfig.getId());
            }
        }
    }

    private static java.util.List<androidx.camera.core.impl.SessionProcessorSurface> getSessionProcessorSurfaceList(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : list) {
            m3.h.b(deferrableSurface instanceof androidx.camera.core.impl.SessionProcessorSurface, "Surface must be SessionProcessorSurface");
            arrayList.add((androidx.camera.core.impl.SessionProcessorSurface) deferrableSurface);
        }
        return arrayList;
    }

    private static boolean hasPreviewSurface(androidx.camera.core.impl.CaptureConfig captureConfig) {
        for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : captureConfig.getSurfaces()) {
            if (isPreview(deferrableSurface) || isStreamSharing(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isImageAnalysis(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        return java.util.Objects.equals(deferrableSurface.getContainerClass(), androidx.camera.core.ImageAnalysis.class);
    }

    private static boolean isImageCapture(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        return java.util.Objects.equals(deferrableSurface.getContainerClass(), androidx.camera.core.ImageCapture.class);
    }

    private static boolean isPreview(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        return java.util.Objects.equals(deferrableSurface.getContainerClass(), androidx.camera.core.Preview.class);
    }

    private static boolean isStreamSharing(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        return java.util.Objects.equals(deferrableSurface.getContainerClass(), androidx.camera.core.streamsharing.StreamSharing.class);
    }

    private boolean isTemplateTypeForStillCapture(int i17) {
        return i17 == 2 || i17 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        androidx.camera.core.impl.DeferrableSurfaces.decrementAll(this.mOutputSurfaces);
        if (deferrableSurface != null) {
            deferrableSurface.decrementUseCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$open$1(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        sHeldProcessorSurfaces.remove(deferrableSurface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public wa.a lambda$open$2(androidx.camera.core.impl.SessionConfig sessionConfig, android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener opener, java.util.List list) {
        androidx.camera.core.impl.OutputSurface outputSurface;
        androidx.camera.core.Logger.d(TAG, "-- getSurfaces done, start init (id=" + this.mInstanceId + ")");
        if (this.mProcessorState == androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.DE_INITIALIZED) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final androidx.camera.core.impl.DeferrableSurface deferrableSurface = null;
        if (list.contains(null)) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("Surface closed", sessionConfig.getSurfaces().get(list.indexOf(null))));
        }
        androidx.camera.core.impl.OutputSurface outputSurface2 = null;
        androidx.camera.core.impl.OutputSurface outputSurface3 = null;
        androidx.camera.core.impl.OutputSurface outputSurface4 = null;
        for (int i17 = 0; i17 < sessionConfig.getSurfaces().size(); i17++) {
            androidx.camera.core.impl.DeferrableSurface deferrableSurface2 = sessionConfig.getSurfaces().get(i17);
            if (isPreview(deferrableSurface2) || isStreamSharing(deferrableSurface2)) {
                outputSurface2 = androidx.camera.core.impl.OutputSurface.create((android.view.Surface) deferrableSurface2.getSurface().get(), deferrableSurface2.getPrescribedSize(), deferrableSurface2.getPrescribedStreamFormat());
            } else if (isImageCapture(deferrableSurface2)) {
                outputSurface3 = androidx.camera.core.impl.OutputSurface.create((android.view.Surface) deferrableSurface2.getSurface().get(), deferrableSurface2.getPrescribedSize(), deferrableSurface2.getPrescribedStreamFormat());
            } else if (isImageAnalysis(deferrableSurface2)) {
                outputSurface4 = androidx.camera.core.impl.OutputSurface.create((android.view.Surface) deferrableSurface2.getSurface().get(), deferrableSurface2.getPrescribedSize(), deferrableSurface2.getPrescribedStreamFormat());
            }
        }
        if (sessionConfig.getPostviewOutputConfig() != null) {
            deferrableSurface = sessionConfig.getPostviewOutputConfig().getSurface();
            outputSurface = androidx.camera.core.impl.OutputSurface.create((android.view.Surface) deferrableSurface.getSurface().get(), deferrableSurface.getPrescribedSize(), deferrableSurface.getPrescribedStreamFormat());
        } else {
            outputSurface = null;
        }
        this.mProcessorState = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.mOutputSurfaces);
            if (deferrableSurface != null) {
                arrayList.add(deferrableSurface);
            }
            androidx.camera.core.impl.DeferrableSurfaces.incrementAll(arrayList);
            androidx.camera.core.Logger.w(TAG, "== initSession (id=" + this.mInstanceId + ")");
            try {
                androidx.camera.core.impl.SessionConfig initSession = this.mSessionProcessor.initSession(this.mCamera2CameraInfoImpl, androidx.camera.core.impl.OutputSurfaceConfiguration.create(outputSurface2, outputSurface3, outputSurface4, outputSurface));
                this.mProcessorSessionConfig = initSession;
                initSession.getSurfaces().get(0).getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.camera2.internal.ProcessingCaptureSession.this.lambda$open$0(deferrableSurface);
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                for (final androidx.camera.core.impl.DeferrableSurface deferrableSurface3 : this.mProcessorSessionConfig.getSurfaces()) {
                    sHeldProcessorSurfaces.add(deferrableSurface3);
                    deferrableSurface3.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.camera2.internal.ProcessingCaptureSession.lambda$open$1(androidx.camera.core.impl.DeferrableSurface.this);
                        }
                    }, this.mExecutor);
                }
                androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
                validatingBuilder.add(sessionConfig);
                validatingBuilder.clearSurfaces();
                validatingBuilder.add(this.mProcessorSessionConfig);
                m3.h.b(validatingBuilder.isValid(), "Cannot transform the SessionConfig");
                androidx.camera.core.impl.SessionConfig build = validatingBuilder.build();
                androidx.camera.camera2.internal.CaptureSession captureSession = this.mCaptureSession;
                cameraDevice.getClass();
                wa.a open = captureSession.open(build, cameraDevice, opener);
                androidx.camera.core.impl.utils.futures.Futures.addCallback(open, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(java.lang.Throwable th6) {
                        androidx.camera.core.Logger.e(androidx.camera.camera2.internal.ProcessingCaptureSession.TAG, "open session failed ", th6);
                        androidx.camera.camera2.internal.ProcessingCaptureSession.this.close();
                        androidx.camera.camera2.internal.ProcessingCaptureSession.this.release(false);
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(java.lang.Void r17) {
                    }
                }, this.mExecutor);
                return open;
            } catch (java.lang.Throwable th6) {
                androidx.camera.core.Logger.e(TAG, "initSession failed", th6);
                androidx.camera.core.impl.DeferrableSurfaces.decrementAll(this.mOutputSurfaces);
                if (deferrableSurface != null) {
                    deferrableSurface.decrementUseCount();
                }
                throw th6;
            }
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e17) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void lambda$open$3(java.lang.Void r17) {
        onConfigured(this.mCaptureSession);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$4() {
        androidx.camera.core.Logger.d(TAG, "== deInitSession (id=" + this.mInstanceId + ")");
        this.mSessionProcessor.deInitSession();
    }

    private void updateParameters(androidx.camera.camera2.interop.CaptureRequestOptions captureRequestOptions, androidx.camera.camera2.interop.CaptureRequestOptions captureRequestOptions2) {
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder.insertAllOptions(captureRequestOptions);
        builder.insertAllOptions(captureRequestOptions2);
        this.mSessionProcessor.setParameters(builder.build());
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        androidx.camera.core.Logger.d(TAG, "cancelIssuedCaptureRequests (id=" + this.mInstanceId + ")");
        if (this.mPendingCaptureConfigs != null) {
            for (androidx.camera.core.impl.CaptureConfig captureConfig : this.mPendingCaptureConfigs) {
                java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
            this.mPendingCaptureConfigs = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        androidx.camera.core.Logger.d(TAG, "close (id=" + this.mInstanceId + ") state=" + this.mProcessorState);
        if (this.mProcessorState == androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            androidx.camera.core.Logger.d(TAG, "== onCaptureSessionEnd (id = " + this.mInstanceId + ")");
            this.mSessionProcessor.onCaptureSessionEnd();
            androidx.camera.camera2.internal.Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
            if (camera2RequestProcessor != null) {
                camera2RequestProcessor.close();
            }
            this.mProcessorState = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_ENDED;
        }
        this.mCaptureSession.close();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs() {
        return this.mPendingCaptureConfigs != null ? this.mPendingCaptureConfigs : java.util.Collections.emptyList();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        return this.mCaptureSession.isInOpenState();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        if (list.isEmpty()) {
            return;
        }
        androidx.camera.core.Logger.d(TAG, "issueCaptureRequests (id=" + this.mInstanceId + ") + state =" + this.mProcessorState);
        int ordinal = this.mProcessorState.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (this.mPendingCaptureConfigs == null) {
                this.mPendingCaptureConfigs = list;
                return;
            } else {
                cancelRequests(list);
                androidx.camera.core.Logger.d(TAG, "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (ordinal == 2) {
            for (androidx.camera.core.impl.CaptureConfig captureConfig : list) {
                if (isTemplateTypeForStillCapture(captureConfig.getTemplateType())) {
                    issueStillCaptureRequest(captureConfig);
                } else {
                    issueTriggerRequest(captureConfig);
                }
            }
            return;
        }
        if (ordinal == 3 || ordinal == 4) {
            androidx.camera.core.Logger.d(TAG, "Run issueCaptureRequests in wrong state, state = " + this.mProcessorState);
            cancelRequests(list);
        }
    }

    public void issueStillCaptureRequest(androidx.camera.core.impl.CaptureConfig captureConfig) {
        androidx.camera.camera2.interop.CaptureRequestOptions.Builder from = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions());
        androidx.camera.core.impl.Config implementationOptions = captureConfig.getImplementationOptions();
        androidx.camera.core.impl.Config.Option<java.lang.Integer> option = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION;
        if (implementationOptions.containsOption(option)) {
            from.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION, (java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(option));
        }
        androidx.camera.core.impl.Config implementationOptions2 = captureConfig.getImplementationOptions();
        androidx.camera.core.impl.Config.Option<java.lang.Integer> option2 = androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY;
        if (implementationOptions2.containsOption(option2)) {
            from.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.JPEG_QUALITY, java.lang.Byte.valueOf(((java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(option2)).byteValue()));
        }
        androidx.camera.camera2.interop.CaptureRequestOptions build = from.build();
        this.mStillCaptureOptions = build;
        updateParameters(this.mSessionOptions, build);
        this.mSessionProcessor.startCapture(captureConfig.isPostviewEnabled(), captureConfig.getTagBundle(), new androidx.camera.camera2.internal.ProcessingCaptureSession.CaptureCallbackAdapter(captureConfig.getId(), captureConfig.getCameraCaptureCallbacks()));
    }

    public void issueTriggerRequest(androidx.camera.core.impl.CaptureConfig captureConfig) {
        boolean z17;
        androidx.camera.core.Logger.d(TAG, "issueTriggerRequest");
        androidx.camera.camera2.interop.CaptureRequestOptions build = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions()).build();
        java.util.Iterator<androidx.camera.core.impl.Config.Option<?>> it = build.listOptions().iterator();
        while (it.hasNext()) {
            android.hardware.camera2.CaptureRequest.Key key = (android.hardware.camera2.CaptureRequest.Key) it.next().getToken();
            if (key.equals(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                z17 = true;
                break;
            }
        }
        z17 = false;
        if (z17) {
            this.mSessionProcessor.startTrigger(build, captureConfig.getTagBundle(), new androidx.camera.camera2.internal.ProcessingCaptureSession.CaptureCallbackAdapter(captureConfig.getId(), captureConfig.getCameraCaptureCallbacks()));
        } else {
            cancelRequests(java.util.Arrays.asList(captureConfig));
        }
    }

    public void onConfigured(androidx.camera.camera2.internal.CaptureSession captureSession) {
        if (this.mProcessorState != androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED) {
            return;
        }
        this.mRequestProcessor = new androidx.camera.camera2.internal.Camera2RequestProcessor(captureSession, getSessionProcessorSurfaceList(this.mProcessorSessionConfig.getSurfaces()));
        androidx.camera.core.Logger.d(TAG, "== onCaptureSessinStarted (id = " + this.mInstanceId + ")");
        this.mSessionProcessor.onCaptureSessionStart(this.mRequestProcessor);
        this.mProcessorState = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED;
        androidx.camera.core.impl.SessionConfig sessionConfig = this.mSessionConfig;
        if (sessionConfig != null) {
            setSessionConfig(sessionConfig);
        }
        if (this.mPendingCaptureConfigs != null) {
            issueCaptureRequests(this.mPendingCaptureConfigs);
            this.mPendingCaptureConfigs = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public wa.a open(final androidx.camera.core.impl.SessionConfig sessionConfig, final android.hardware.camera2.CameraDevice cameraDevice, final androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener opener) {
        m3.h.b(this.mProcessorState == androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED, "Invalid state state:" + this.mProcessorState);
        m3.h.b(sessionConfig.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        androidx.camera.core.Logger.d(TAG, "open (id=" + this.mInstanceId + ")");
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = sessionConfig.getSurfaces();
        this.mOutputSurfaces = surfaces;
        return androidx.camera.core.impl.utils.futures.FutureChain.from(androidx.camera.core.impl.DeferrableSurfaces.surfaceListWithTimeout(surfaces, false, TIMEOUT_GET_SURFACE_IN_MS, this.mExecutor, this.mScheduledExecutorService)).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$d
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final wa.a apply(java.lang.Object obj) {
                wa.a lambda$open$2;
                lambda$open$2 = androidx.camera.camera2.internal.ProcessingCaptureSession.this.lambda$open$2(sessionConfig, cameraDevice, opener, (java.util.List) obj);
                return lambda$open$2;
            }
        }, this.mExecutor).transform(new r.a() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Void lambda$open$3;
                lambda$open$3 = androidx.camera.camera2.internal.ProcessingCaptureSession.this.lambda$open$3((java.lang.Void) obj);
                return lambda$open$3;
            }
        }, this.mExecutor);
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public wa.a release(boolean z17) {
        androidx.camera.core.Logger.d(TAG, "release (id=" + this.mInstanceId + ") mProcessorState=" + this.mProcessorState);
        wa.a release = this.mCaptureSession.release(z17);
        int ordinal = this.mProcessorState.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            release.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.ProcessingCaptureSession.this.lambda$release$4();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
        this.mProcessorState = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.DE_INITIALIZED;
        return release;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        androidx.camera.core.Logger.d(TAG, "setSessionConfig (id=" + this.mInstanceId + ")");
        this.mSessionConfig = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        androidx.camera.camera2.internal.Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
        if (camera2RequestProcessor != null) {
            camera2RequestProcessor.updateSessionConfig(sessionConfig);
        }
        if (this.mProcessorState == androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            androidx.camera.camera2.interop.CaptureRequestOptions build = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(sessionConfig.getImplementationOptions()).build();
            this.mSessionOptions = build;
            updateParameters(build, this.mStillCaptureOptions);
            if (hasPreviewSurface(sessionConfig.getRepeatingCaptureConfig())) {
                this.mSessionProcessor.startRepeating(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), this.mSessionProcessorCaptureCallback);
            } else {
                this.mSessionProcessor.stopRepeating();
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> map) {
    }
}
