package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
public class BasicExtenderSessionProcessor extends androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase {
    private static final long INVALID_TIMESTAMP = -1;
    private static final int PREVIEW_PROCESS_MAX_IMAGES = 2;
    private static final java.lang.String TAG = "BasicSessionProcessor";
    static java.util.concurrent.atomic.AtomicInteger sLastOutputConfigId = new java.util.concurrent.atomic.AtomicInteger(0);
    private volatile androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig mAnalysisOutputConfig;
    private volatile androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig mCaptureOutputConfig;
    private volatile androidx.camera.core.impl.OutputSurface mCaptureOutputSurface;
    private final android.content.Context mContext;
    private final androidx.camera.extensions.impl.ImageCaptureExtenderImpl mImageCaptureExtenderImpl;
    volatile boolean mIsCapturing;
    private final java.util.concurrent.atomic.AtomicInteger mNextCaptureSequenceId;
    private androidx.camera.extensions.internal.compat.workaround.OnEnableDisableSessionDurationCheck mOnEnableDisableSessionDurationCheck;
    private final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mParameters;
    private androidx.camera.core.impl.OutputSurface mPostviewOutputSurface;
    private final androidx.camera.extensions.impl.PreviewExtenderImpl mPreviewExtenderImpl;
    private volatile androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig mPreviewOutputConfig;
    private volatile androidx.camera.core.impl.OutputSurface mPreviewOutputSurface;
    volatile androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor mPreviewProcessor;
    private final java.util.Map<java.lang.Integer, java.lang.Long> mRequestCompletedTimestampMap;
    private volatile androidx.camera.core.impl.RequestProcessor mRequestProcessor;
    volatile androidx.camera.extensions.impl.RequestUpdateProcessorImpl mRequestUpdateProcessor;
    volatile androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor mStillCaptureProcessor;
    private final androidx.camera.extensions.internal.VendorExtender mVendorExtender;
    private final boolean mWillReceiveOnCaptureCompleted;

    public BasicExtenderSessionProcessor(androidx.camera.extensions.impl.PreviewExtenderImpl previewExtenderImpl, androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl, java.util.List<android.hardware.camera2.CaptureRequest.Key> list, androidx.camera.extensions.internal.VendorExtender vendorExtender, android.content.Context context) {
        super(list);
        this.mStillCaptureProcessor = null;
        this.mPreviewProcessor = null;
        this.mRequestUpdateProcessor = null;
        this.mAnalysisOutputConfig = null;
        this.mIsCapturing = false;
        this.mNextCaptureSequenceId = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mParameters = new java.util.LinkedHashMap();
        this.mRequestCompletedTimestampMap = new java.util.HashMap();
        this.mOnEnableDisableSessionDurationCheck = new androidx.camera.extensions.internal.compat.workaround.OnEnableDisableSessionDurationCheck();
        this.mPreviewExtenderImpl = previewExtenderImpl;
        this.mImageCaptureExtenderImpl = imageCaptureExtenderImpl;
        this.mContext = context;
        this.mVendorExtender = vendorExtender;
        this.mWillReceiveOnCaptureCompleted = vendorExtender.willReceiveOnCaptureCompleted();
    }

    private void applyParameters(androidx.camera.extensions.internal.sessionprocessor.RequestBuilder requestBuilder) {
        synchronized (this.mLock) {
            for (android.hardware.camera2.CaptureRequest.Key<?> key : this.mParameters.keySet()) {
                java.lang.Object obj = this.mParameters.get(key);
                if (obj != null) {
                    requestBuilder.setParameters(key, obj);
                }
            }
        }
    }

    private void applyPreviewStagesParameters(androidx.camera.extensions.internal.sessionprocessor.RequestBuilder requestBuilder) {
        androidx.camera.extensions.impl.CaptureStageImpl captureStage = this.mPreviewExtenderImpl.getCaptureStage();
        if (captureStage != null) {
            for (android.util.Pair pair : captureStage.getParameters()) {
                requestBuilder.setParameters((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getRequestCompletedTimestamp(int i17) {
        synchronized (this.mLock) {
            java.lang.Long l17 = this.mRequestCompletedTimestampMap.get(java.lang.Integer.valueOf(i17));
            if (l17 == null) {
                return -1L;
            }
            this.mRequestCompletedTimestampMap.remove(java.lang.Integer.valueOf(i17));
            return l17.longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRepeating$0(androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback, int i17, androidx.camera.core.impl.TagBundle tagBundle, long j17, java.util.List list) {
        captureCallback.onCaptureCompleted(j17, i17, new androidx.camera.extensions.internal.sessionprocessor.KeyValueMapCameraCaptureResult(j17, tagBundle, getCaptureResultKeyMapFromList(list)));
    }

    private void submitRequestByCaptureStages(androidx.camera.core.impl.RequestProcessor requestProcessor, java.util.List<androidx.camera.extensions.impl.CaptureStageImpl> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.extensions.impl.CaptureStageImpl captureStageImpl : list) {
            androidx.camera.extensions.internal.sessionprocessor.RequestBuilder requestBuilder = new androidx.camera.extensions.internal.sessionprocessor.RequestBuilder();
            requestBuilder.addTargetOutputConfigIds(this.mPreviewOutputConfig.getId());
            if (this.mAnalysisOutputConfig != null) {
                requestBuilder.addTargetOutputConfigIds(this.mAnalysisOutputConfig.getId());
            }
            for (android.util.Pair pair : captureStageImpl.getParameters()) {
                requestBuilder.setParameters((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
            requestBuilder.setTemplateId(1);
            arrayList.add(requestBuilder.build());
        }
        requestProcessor.submit(arrayList, new androidx.camera.core.impl.RequestProcessor.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.2
        });
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void abortCapture(int i17) {
        this.mRequestProcessor.abortCaptures();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase
    public void deInitSessionInternal() {
        if (this.mPreviewProcessor != null) {
            this.mPreviewProcessor.close();
            this.mPreviewProcessor = null;
        }
        if (this.mStillCaptureProcessor != null) {
            this.mStillCaptureProcessor.close();
            this.mStillCaptureProcessor = null;
        }
        androidx.camera.core.Logger.d(TAG, "preview onDeInit");
        this.mPreviewExtenderImpl.onDeInit();
        androidx.camera.core.Logger.d(TAG, "capture onDeInit");
        this.mImageCaptureExtenderImpl.onDeInit();
    }

    public java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> getCaptureResultKeyMapFromList(java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object> pair : list) {
            hashMap.put((android.hardware.camera2.CaptureResult.Key) pair.first, pair.second);
        }
        return hashMap;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeCaptureLatency() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImageCaptureExtenderImpl.getRealtimeCaptureLatency();
        }
        return null;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase, androidx.camera.core.impl.SessionProcessor
    public /* bridge */ /* synthetic */ java.util.Set getSupportedCameraOperations() {
        return super.getSupportedCameraOperations();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewSize(android.util.Size size) {
        return this.mVendorExtender.getSupportedPostviewResolutions(size);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase
    public androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig initSessionInternal(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map, androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration) {
        androidx.camera.core.Logger.d(TAG, "PreviewExtenderImpl.onInit");
        this.mPreviewExtenderImpl.onInit(str, map.get(str), this.mContext);
        androidx.camera.core.Logger.d(TAG, "ImageCaptureExtenderImpl.onInit");
        this.mImageCaptureExtenderImpl.onInit(str, map.get(str), this.mContext);
        this.mPreviewOutputSurface = outputSurfaceConfiguration.getPreviewOutputSurface();
        this.mCaptureOutputSurface = outputSurfaceConfiguration.getImageCaptureOutputSurface();
        this.mPostviewOutputSurface = outputSurfaceConfiguration.getPostviewOutputSurface();
        androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType processorType = this.mPreviewExtenderImpl.getProcessorType();
        androidx.camera.core.Logger.d(TAG, "preview processorType=" + processorType);
        if (processorType == androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.mPreviewOutputConfig = androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mPreviewOutputSurface.getSize(), 35, 2);
            this.mPreviewProcessor = new androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor(this.mPreviewExtenderImpl.getProcessor(), this.mPreviewOutputSurface.getSurface(), this.mPreviewOutputSurface.getSize());
        } else if (processorType == androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.mPreviewOutputConfig = androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mPreviewOutputSurface.getSurface());
            this.mRequestUpdateProcessor = this.mPreviewExtenderImpl.getProcessor();
        } else {
            this.mPreviewOutputConfig = androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mPreviewOutputSurface.getSurface());
        }
        androidx.camera.extensions.impl.CaptureProcessorImpl captureProcessor = this.mImageCaptureExtenderImpl.getCaptureProcessor();
        androidx.camera.core.Logger.d(TAG, "CaptureProcessor=" + captureProcessor);
        if (captureProcessor != null) {
            this.mCaptureOutputConfig = androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mCaptureOutputSurface.getSize(), 35, this.mImageCaptureExtenderImpl.getMaxCaptureStage());
            this.mStillCaptureProcessor = new androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor(captureProcessor, this.mCaptureOutputSurface.getSurface(), this.mCaptureOutputSurface.getSize(), this.mPostviewOutputSurface, !this.mWillReceiveOnCaptureCompleted);
        } else {
            this.mCaptureOutputConfig = androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mCaptureOutputSurface.getSurface());
        }
        if (outputSurfaceConfiguration.getImageAnalysisOutputSurface() != null) {
            this.mAnalysisOutputConfig = androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), outputSurfaceConfiguration.getImageAnalysisOutputSurface().getSurface());
        }
        androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder sessionTemplateId = new androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder().addOutputConfig(this.mPreviewOutputConfig).addOutputConfig(this.mCaptureOutputConfig).setSessionTemplateId(1);
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            int onSessionType = this.mPreviewExtenderImpl.onSessionType();
            m3.h.b(onSessionType == this.mImageCaptureExtenderImpl.onSessionType(), "Needs same session type in both PreviewExtenderImpl and ImageCaptureExtenderImpl");
            if (onSessionType == -1) {
                onSessionType = 0;
            }
            sessionTemplateId.setSessionType(onSessionType);
        }
        if (this.mAnalysisOutputConfig != null) {
            sessionTemplateId.addOutputConfig(this.mAnalysisOutputConfig);
        }
        androidx.camera.extensions.impl.CaptureStageImpl onPresetSession = this.mPreviewExtenderImpl.onPresetSession();
        androidx.camera.core.Logger.d(TAG, "preview onPresetSession:" + onPresetSession);
        androidx.camera.extensions.impl.CaptureStageImpl onPresetSession2 = this.mImageCaptureExtenderImpl.onPresetSession();
        androidx.camera.core.Logger.d(TAG, "capture onPresetSession:" + onPresetSession2);
        if (onPresetSession != null && onPresetSession.getParameters() != null) {
            for (android.util.Pair pair : onPresetSession.getParameters()) {
                sessionTemplateId.addSessionParameter((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (onPresetSession2 != null && onPresetSession2.getParameters() != null) {
            for (android.util.Pair pair2 : onPresetSession2.getParameters()) {
                sessionTemplateId.addSessionParameter((android.hardware.camera2.CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return sessionTemplateId.build();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionEnd() {
        this.mOnEnableDisableSessionDurationCheck.onDisableSessionInvoked();
        if (this.mPreviewProcessor != null) {
            this.mPreviewProcessor.pause();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.extensions.impl.CaptureStageImpl onDisableSession = this.mPreviewExtenderImpl.onDisableSession();
        androidx.camera.core.Logger.d(TAG, "preview onDisableSession: " + onDisableSession);
        if (onDisableSession != null) {
            arrayList.add(onDisableSession);
        }
        androidx.camera.extensions.impl.CaptureStageImpl onDisableSession2 = this.mImageCaptureExtenderImpl.onDisableSession();
        androidx.camera.core.Logger.d(TAG, "capture onDisableSession:" + onDisableSession2);
        if (onDisableSession2 != null) {
            arrayList.add(onDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            submitRequestByCaptureStages(this.mRequestProcessor, arrayList);
        }
        this.mRequestProcessor = null;
        this.mIsCapturing = false;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionStart(androidx.camera.core.impl.RequestProcessor requestProcessor) {
        this.mRequestProcessor = requestProcessor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.extensions.impl.CaptureStageImpl onEnableSession = this.mPreviewExtenderImpl.onEnableSession();
        androidx.camera.core.Logger.d(TAG, "preview onEnableSession: " + onEnableSession);
        if (onEnableSession != null) {
            arrayList.add(onEnableSession);
        }
        androidx.camera.extensions.impl.CaptureStageImpl onEnableSession2 = this.mImageCaptureExtenderImpl.onEnableSession();
        androidx.camera.core.Logger.d(TAG, "capture onEnableSession:" + onEnableSession2);
        if (onEnableSession2 != null) {
            arrayList.add(onEnableSession2);
        }
        this.mOnEnableDisableSessionDurationCheck.onEnableSessionInvoked();
        if (!arrayList.isEmpty()) {
            submitRequestByCaptureStages(requestProcessor, arrayList);
        }
        if (this.mPreviewProcessor != null) {
            this.mPreviewProcessor.resume();
            setImageProcessor(this.mPreviewOutputConfig.getId(), new androidx.camera.extensions.internal.sessionprocessor.ImageProcessor() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.1
                @Override // androidx.camera.extensions.internal.sessionprocessor.ImageProcessor
                public void onNextImageAvailable(int i17, long j17, androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, java.lang.String str) {
                    if (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mPreviewProcessor != null) {
                        androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mPreviewProcessor.notifyImage(imageReference);
                    } else {
                        imageReference.decrement();
                    }
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void setParameters(androidx.camera.core.impl.Config config) {
        synchronized (this.mLock) {
            java.util.HashMap hashMap = new java.util.HashMap();
            androidx.camera.extensions.internal.RequestOptionConfig build = androidx.camera.extensions.internal.RequestOptionConfig.Builder.from(config).build();
            for (androidx.camera.core.impl.Config.Option<?> option : build.listOptions()) {
                hashMap.put((android.hardware.camera2.CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
            }
            this.mParameters.clear();
            this.mParameters.putAll(hashMap);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startCapture(boolean z17, final androidx.camera.core.impl.TagBundle tagBundle, final androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        androidx.camera.core.Logger.d(TAG, "startCapture postviewEnabled = " + z17 + " mWillReceiveOnCaptureCompleted = " + this.mWillReceiveOnCaptureCompleted);
        final int andIncrement = this.mNextCaptureSequenceId.getAndIncrement();
        if (this.mRequestProcessor == null || this.mIsCapturing) {
            androidx.camera.core.Logger.d(TAG, "startCapture failed");
            captureCallback.onCaptureFailed(andIncrement);
            captureCallback.onCaptureSequenceAborted(andIncrement);
            return andIncrement;
        }
        this.mIsCapturing = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<androidx.camera.extensions.impl.CaptureStageImpl> captureStages = this.mImageCaptureExtenderImpl.getCaptureStages();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (androidx.camera.extensions.impl.CaptureStageImpl captureStageImpl : captureStages) {
            androidx.camera.extensions.internal.sessionprocessor.RequestBuilder requestBuilder = new androidx.camera.extensions.internal.sessionprocessor.RequestBuilder();
            requestBuilder.addTargetOutputConfigIds(this.mCaptureOutputConfig.getId());
            requestBuilder.setTemplateId(2);
            requestBuilder.setCaptureStageId(captureStageImpl.getId());
            arrayList2.add(java.lang.Integer.valueOf(captureStageImpl.getId()));
            applyParameters(requestBuilder);
            applyPreviewStagesParameters(requestBuilder);
            for (android.util.Pair pair : captureStageImpl.getParameters()) {
                requestBuilder.setParameters((android.hardware.camera2.CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList.add(requestBuilder.build());
        }
        androidx.camera.core.Logger.d(TAG, "Wait for capture stage id: " + arrayList2);
        androidx.camera.core.impl.RequestProcessor.Callback callback = new androidx.camera.core.impl.RequestProcessor.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.4
            boolean mIsCaptureFailed = false;
            boolean mIsCaptureStarted = false;

            @Override // androidx.camera.core.impl.RequestProcessor.Callback
            public void onCaptureCompleted(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                android.hardware.camera2.CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
                m3.h.b(captureResult instanceof android.hardware.camera2.TotalCaptureResult, "Cannot get capture TotalCaptureResult from the cameraCaptureResult ");
                android.hardware.camera2.TotalCaptureResult totalCaptureResult = (android.hardware.camera2.TotalCaptureResult) captureResult;
                androidx.camera.extensions.internal.sessionprocessor.RequestBuilder.RequestProcessorRequest requestProcessorRequest = (androidx.camera.extensions.internal.sessionprocessor.RequestBuilder.RequestProcessorRequest) request;
                if (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mStillCaptureProcessor != null) {
                    synchronized (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mLock) {
                        if (!androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mRequestCompletedTimestampMap.containsKey(java.lang.Integer.valueOf(andIncrement))) {
                            androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mRequestCompletedTimestampMap.put(java.lang.Integer.valueOf(andIncrement), java.lang.Long.valueOf(cameraCaptureResult.getTimestamp()));
                        }
                    }
                    androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mStillCaptureProcessor.notifyCaptureResult(totalCaptureResult, requestProcessorRequest.getCaptureStageId());
                    return;
                }
                androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mIsCapturing = false;
                if (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mRequestProcessor == null) {
                    captureCallback.onCaptureSequenceAborted(andIncrement);
                    return;
                }
                captureCallback.onCaptureProcessStarted(andIncrement);
                captureCallback.onCaptureCompleted(cameraCaptureResult.getTimestamp(), andIncrement, new androidx.camera.extensions.internal.Camera2CameraCaptureResult(tagBundle, cameraCaptureResult.getCaptureResult()));
                captureCallback.onCaptureSequenceCompleted(andIncrement);
            }

            @Override // androidx.camera.core.impl.RequestProcessor.Callback
            public void onCaptureFailed(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
                if (this.mIsCaptureFailed) {
                    return;
                }
                this.mIsCaptureFailed = true;
                captureCallback.onCaptureFailed(andIncrement);
                captureCallback.onCaptureSequenceAborted(andIncrement);
                androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mIsCapturing = false;
            }

            @Override // androidx.camera.core.impl.RequestProcessor.Callback
            public void onCaptureSequenceAborted(int i17) {
                captureCallback.onCaptureSequenceAborted(andIncrement);
                androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mIsCapturing = false;
            }

            @Override // androidx.camera.core.impl.RequestProcessor.Callback
            public void onCaptureStarted(androidx.camera.core.impl.RequestProcessor.Request request, long j17, long j18) {
                if (this.mIsCaptureStarted) {
                    return;
                }
                this.mIsCaptureStarted = true;
                captureCallback.onCaptureStarted(andIncrement, j18);
            }
        };
        androidx.camera.core.Logger.d(TAG, "startCapture");
        if (this.mStillCaptureProcessor != null) {
            setImageProcessor(this.mCaptureOutputConfig.getId(), new androidx.camera.extensions.internal.sessionprocessor.ImageProcessor() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.5
                boolean mIsFirstFrame = true;

                @Override // androidx.camera.extensions.internal.sessionprocessor.ImageProcessor
                public void onNextImageAvailable(int i17, long j17, androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, java.lang.String str) {
                    androidx.camera.core.Logger.d(androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.TAG, "onNextImageAvailable  outputStreamId=" + i17);
                    if (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mStillCaptureProcessor != null) {
                        androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mStillCaptureProcessor.notifyImage(imageReference);
                    } else {
                        imageReference.decrement();
                    }
                    if (this.mIsFirstFrame) {
                        captureCallback.onCaptureProcessStarted(andIncrement);
                        this.mIsFirstFrame = false;
                    }
                }
            });
            this.mStillCaptureProcessor.startCapture(z17, arrayList2, new androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.6
                @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
                public void onCaptureCompleted(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                    if (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mWillReceiveOnCaptureCompleted) {
                        captureCallback.onCaptureCompleted(j17, andIncrement, new androidx.camera.extensions.internal.sessionprocessor.KeyValueMapCameraCaptureResult(j17, tagBundle, androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.getCaptureResultKeyMapFromList(list)));
                        captureCallback.onCaptureSequenceCompleted(andIncrement);
                    }
                }

                @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
                public void onCaptureProcessProgressed(int i17) {
                    captureCallback.onCaptureProcessProgressed(i17);
                }

                @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
                public void onError(java.lang.Exception exc) {
                    captureCallback.onCaptureFailed(andIncrement);
                    androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mIsCapturing = false;
                }

                @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
                public void onProcessCompleted() {
                    if (!androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mWillReceiveOnCaptureCompleted) {
                        long requestCompletedTimestamp = androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.getRequestCompletedTimestamp(andIncrement);
                        if (requestCompletedTimestamp == -1) {
                            androidx.camera.core.Logger.e(androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.TAG, "Cannot get timestamp for the capture result");
                            captureCallback.onCaptureFailed(andIncrement);
                            captureCallback.onCaptureSequenceAborted(andIncrement);
                            androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mIsCapturing = false;
                            return;
                        }
                        captureCallback.onCaptureCompleted(requestCompletedTimestamp, andIncrement, new androidx.camera.extensions.internal.sessionprocessor.KeyValueMapCameraCaptureResult(requestCompletedTimestamp, tagBundle, java.util.Collections.emptyMap()));
                        captureCallback.onCaptureSequenceCompleted(andIncrement);
                    }
                    androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mIsCapturing = false;
                }
            });
        }
        this.mRequestProcessor.submit(arrayList, callback);
        return andIncrement;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startRepeating(final androidx.camera.core.impl.TagBundle tagBundle, final androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        final int andIncrement = this.mNextCaptureSequenceId.getAndIncrement();
        if (this.mRequestProcessor == null) {
            captureCallback.onCaptureFailed(andIncrement);
            captureCallback.onCaptureSequenceAborted(andIncrement);
        } else {
            if (this.mPreviewProcessor != null) {
                this.mPreviewProcessor.start(new androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$$a
                    @Override // androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback
                    public final void onCaptureResult(long j17, java.util.List list) {
                        androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.lambda$startRepeating$0(captureCallback, andIncrement, tagBundle, j17, list);
                    }
                });
            }
            updateRepeating(andIncrement, captureCallback);
        }
        return andIncrement;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startTrigger(androidx.camera.core.impl.Config config, final androidx.camera.core.impl.TagBundle tagBundle, final androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        androidx.camera.core.Logger.d(TAG, "startTrigger");
        final int andIncrement = this.mNextCaptureSequenceId.getAndIncrement();
        androidx.camera.extensions.internal.sessionprocessor.RequestBuilder requestBuilder = new androidx.camera.extensions.internal.sessionprocessor.RequestBuilder();
        requestBuilder.addTargetOutputConfigIds(this.mPreviewOutputConfig.getId());
        if (this.mAnalysisOutputConfig != null) {
            requestBuilder.addTargetOutputConfigIds(this.mAnalysisOutputConfig.getId());
        }
        requestBuilder.setTemplateId(1);
        applyParameters(requestBuilder);
        applyPreviewStagesParameters(requestBuilder);
        androidx.camera.extensions.internal.RequestOptionConfig build = androidx.camera.extensions.internal.RequestOptionConfig.Builder.from(config).build();
        for (androidx.camera.core.impl.Config.Option<?> option : build.listOptions()) {
            requestBuilder.setParameters((android.hardware.camera2.CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
        }
        this.mRequestProcessor.submit(requestBuilder.build(), new androidx.camera.core.impl.RequestProcessor.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.7
            @Override // androidx.camera.core.impl.RequestProcessor.Callback
            public void onCaptureCompleted(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                captureCallback.onCaptureCompleted(cameraCaptureResult.getTimestamp(), andIncrement, new androidx.camera.extensions.internal.Camera2CameraCaptureResult(tagBundle, cameraCaptureResult.getCaptureResult()));
                captureCallback.onCaptureSequenceCompleted(andIncrement);
            }

            @Override // androidx.camera.core.impl.RequestProcessor.Callback
            public void onCaptureFailed(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
                captureCallback.onCaptureFailed(andIncrement);
            }
        });
        return andIncrement;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void stopRepeating() {
        this.mRequestProcessor.stopRepeating();
    }

    public void updateRepeating(final int i17, final androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        if (this.mRequestProcessor == null) {
            androidx.camera.core.Logger.d(TAG, "mRequestProcessor is null, ignore repeating request");
            return;
        }
        androidx.camera.extensions.internal.sessionprocessor.RequestBuilder requestBuilder = new androidx.camera.extensions.internal.sessionprocessor.RequestBuilder();
        requestBuilder.addTargetOutputConfigIds(this.mPreviewOutputConfig.getId());
        if (this.mAnalysisOutputConfig != null) {
            requestBuilder.addTargetOutputConfigIds(this.mAnalysisOutputConfig.getId());
        }
        requestBuilder.setTemplateId(1);
        applyParameters(requestBuilder);
        applyPreviewStagesParameters(requestBuilder);
        androidx.camera.core.impl.RequestProcessor.Callback callback = new androidx.camera.core.impl.RequestProcessor.Callback() { // from class: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.3
            @Override // androidx.camera.core.impl.RequestProcessor.Callback
            public void onCaptureCompleted(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                java.lang.Long l17;
                android.hardware.camera2.CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
                m3.h.b(captureResult instanceof android.hardware.camera2.TotalCaptureResult, "Cannot get TotalCaptureResult from the cameraCaptureResult ");
                android.hardware.camera2.TotalCaptureResult totalCaptureResult = (android.hardware.camera2.TotalCaptureResult) captureResult;
                if (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mPreviewProcessor != null) {
                    androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mPreviewProcessor.notifyCaptureResult(totalCaptureResult);
                } else {
                    androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_3;
                    if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version) && (l17 = (java.lang.Long) totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP)) != null) {
                        captureCallback.onCaptureCompleted(l17.longValue(), i17, new androidx.camera.extensions.internal.Camera2CameraCaptureResult(totalCaptureResult));
                    }
                }
                if (androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mRequestUpdateProcessor != null && androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.mRequestUpdateProcessor.process(totalCaptureResult) != null) {
                    androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor.this.updateRepeating(i17, captureCallback);
                }
                captureCallback.onCaptureSequenceCompleted(i17);
            }
        };
        androidx.camera.core.Logger.d(TAG, "requestProcessor setRepeating");
        this.mRequestProcessor.setRepeating(requestBuilder.build(), callback);
    }
}
