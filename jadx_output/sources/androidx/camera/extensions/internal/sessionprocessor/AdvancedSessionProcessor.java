package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
public class AdvancedSessionProcessor extends androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase {
    private static final java.lang.String TAG = "AdvancedSessionProcessor";
    private final android.content.Context mContext;
    private final androidx.lifecycle.j0 mCurrentExtensionTypeLiveData;
    private final androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.ExtensionMetadataMonitor mExtensionMetadataMonitor;
    private final androidx.lifecycle.j0 mExtensionStrengthLiveData;
    private final androidx.camera.extensions.impl.advanced.SessionProcessorImpl mImpl;
    private boolean mIsPostviewConfigured;
    private final int mMode;
    private androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.SessionProcessorImplCaptureCallbackAdapter mRepeatingCaptureCallbackAdapter;
    private final androidx.camera.extensions.internal.VendorExtender mVendorExtender;
    private final boolean mWillReceiveOnCaptureCompleted;
    private java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mWorkingCaptureConfigMap;

    /* loaded from: classes14.dex */
    public static class CallbackAdapter implements androidx.camera.core.impl.RequestProcessor.Callback {
        private final androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback mCallback;

        public CallbackAdapter(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request getImplRequest(androidx.camera.core.impl.RequestProcessor.Request request) {
            m3.h.a(request instanceof androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.RequestAdapter);
            return ((androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.RequestAdapter) request).getImplRequest();
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureBufferLost(androidx.camera.core.impl.RequestProcessor.Request request, long j17, int i17) {
            this.mCallback.onCaptureBufferLost(getImplRequest(request), j17, i17);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureCompleted(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            android.hardware.camera2.CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
            m3.h.b(captureResult instanceof android.hardware.camera2.TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(request), (android.hardware.camera2.TotalCaptureResult) captureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureFailed(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
            java.lang.Object captureFailure = cameraCaptureFailure.getCaptureFailure();
            m3.h.b(captureFailure instanceof android.hardware.camera2.CaptureFailure, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(request), (android.hardware.camera2.CaptureFailure) captureFailure);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureProgressed(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            android.hardware.camera2.CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
            m3.h.b(captureResult != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(request), captureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureSequenceAborted(int i17) {
            this.mCallback.onCaptureSequenceAborted(i17);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureSequenceCompleted(int i17, long j17) {
            this.mCallback.onCaptureSequenceCompleted(i17, j17);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureStarted(androidx.camera.core.impl.RequestProcessor.Request request, long j17, long j18) {
            this.mCallback.onCaptureStarted(getImplRequest(request), j17, j18);
        }
    }

    /* loaded from: classes14.dex */
    public static class ExtensionMetadataMonitor {
        private final androidx.lifecycle.j0 mCurrentExtensionTypeLiveData;
        private final androidx.lifecycle.j0 mExtensionStrengthLiveData;

        public ExtensionMetadataMonitor(androidx.lifecycle.j0 j0Var, androidx.lifecycle.j0 j0Var2) {
            this.mCurrentExtensionTypeLiveData = j0Var;
            this.mExtensionStrengthLiveData = j0Var2;
        }

        private int convertExtensionMode(int i17) {
            if (i17 == 0) {
                return 5;
            }
            if (i17 == 1) {
                return 4;
            }
            if (i17 == 2) {
                return 1;
            }
            if (i17 != 3) {
                return i17 != 4 ? 0 : 3;
            }
            return 2;
        }

        public void checkExtensionMetadata(java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> map) {
            java.lang.Object obj;
            java.lang.Object obj2;
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null && (obj2 = map.get(android.hardware.camera2.CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                    java.lang.Integer num = (java.lang.Integer) obj2;
                    if (!java.util.Objects.equals(this.mCurrentExtensionTypeLiveData.getValue(), java.lang.Integer.valueOf(convertExtensionMode(num.intValue())))) {
                        this.mCurrentExtensionTypeLiveData.postValue(java.lang.Integer.valueOf(convertExtensionMode(num.intValue())));
                    }
                }
                if (this.mExtensionStrengthLiveData == null || (obj = map.get(android.hardware.camera2.CaptureResult.EXTENSION_STRENGTH)) == null || java.util.Objects.equals(this.mExtensionStrengthLiveData.getValue(), obj)) {
                    return;
                }
                this.mExtensionStrengthLiveData.postValue((java.lang.Integer) obj);
            }
        }
    }

    /* loaded from: classes14.dex */
    public static class ImageProcessorAdapter implements androidx.camera.extensions.internal.sessionprocessor.ImageProcessor {
        private final androidx.camera.extensions.impl.advanced.ImageProcessorImpl mImpl;

        public ImageProcessorAdapter(androidx.camera.extensions.impl.advanced.ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageProcessor
        public void onNextImageAvailable(int i17, long j17, androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, java.lang.String str) {
            this.mImpl.onNextImageAvailable(i17, j17, new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.ImageReferenceImplAdapter(imageReference), str);
        }
    }

    /* loaded from: classes14.dex */
    public static class ImageReferenceImplAdapter implements androidx.camera.extensions.impl.advanced.ImageReferenceImpl {
        private final androidx.camera.extensions.internal.sessionprocessor.ImageReference mImageReference;

        public ImageReferenceImplAdapter(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference) {
            this.mImageReference = imageReference;
        }

        public boolean decrement() {
            return this.mImageReference.decrement();
        }

        public android.media.Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.increment();
        }
    }

    /* loaded from: classes14.dex */
    public static class OutputSurfaceConfigurationImplAdapter implements androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl {
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl mAnalysisOutputSurface;
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl mCaptureOutputSurface;
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl mPostviewOutputSurface;
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl mPreviewOutputSurface;

        public OutputSurfaceConfigurationImplAdapter(androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration) {
            this.mPreviewOutputSurface = new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceImplAdapter(outputSurfaceConfiguration.getPreviewOutputSurface());
            this.mCaptureOutputSurface = new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageCaptureOutputSurface());
            this.mAnalysisOutputSurface = outputSurfaceConfiguration.getImageAnalysisOutputSurface() != null ? new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageAnalysisOutputSurface()) : null;
            this.mPostviewOutputSurface = outputSurfaceConfiguration.getPostviewOutputSurface() != null ? new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceImplAdapter(outputSurfaceConfiguration.getPostviewOutputSurface()) : null;
        }

        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    /* loaded from: classes14.dex */
    public static class OutputSurfaceImplAdapter implements androidx.camera.extensions.impl.advanced.OutputSurfaceImpl {
        private final androidx.camera.core.impl.OutputSurface mOutputSurface;

        public OutputSurfaceImplAdapter(androidx.camera.core.impl.OutputSurface outputSurface) {
            this.mOutputSurface = outputSurface;
        }

        public int getImageFormat() {
            return this.mOutputSurface.getImageFormat();
        }

        public android.util.Size getSize() {
            return this.mOutputSurface.getSize();
        }

        public android.view.Surface getSurface() {
            return this.mOutputSurface.getSurface();
        }
    }

    /* loaded from: classes14.dex */
    public static class RequestAdapter implements androidx.camera.core.impl.RequestProcessor.Request {
        private final androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request mImplRequest;
        private final androidx.camera.core.impl.Config mParameters;
        private final java.util.List<java.lang.Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        public RequestAdapter(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            androidx.camera.extensions.internal.RequestOptionConfig.Builder builder = new androidx.camera.extensions.internal.RequestOptionConfig.Builder();
            for (android.hardware.camera2.CaptureRequest.Key key : request.getParameters().keySet()) {
                builder.setCaptureRequestOption(key, request.getParameters().get(key));
            }
            this.mParameters = builder.build();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public androidx.camera.core.impl.Config getParameters() {
            return this.mParameters;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public java.util.List<java.lang.Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    /* loaded from: classes14.dex */
    public class RequestProcessorImplAdapter implements androidx.camera.extensions.impl.advanced.RequestProcessorImpl {
        private final androidx.camera.core.impl.RequestProcessor mRequestProcessor;

        public RequestProcessorImplAdapter(androidx.camera.core.impl.RequestProcessor requestProcessor) {
            this.mRequestProcessor = requestProcessor;
        }

        public void abortCaptures() {
            this.mRequestProcessor.abortCaptures();
        }

        public void setImageProcessor(int i17, androidx.camera.extensions.impl.advanced.ImageProcessorImpl imageProcessorImpl) {
            androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.this.setImageProcessor(i17, new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.ImageProcessorAdapter(imageProcessorImpl));
        }

        public int setRepeating(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request request, androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.setRepeating(new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.RequestAdapter(request), new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.stopRepeating();
        }

        public int submit(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request request, androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.submit(new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.RequestAdapter(request), new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.CallbackAdapter(callback));
        }

        public int submit(java.util.List<androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request> list, androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.RequestAdapter(it.next()));
            }
            return this.mRequestProcessor.submit(arrayList, new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.CallbackAdapter(callback));
        }
    }

    /* loaded from: classes14.dex */
    public static class SessionProcessorImplCaptureCallbackAdapter implements androidx.camera.extensions.impl.advanced.SessionProcessorImpl.CaptureCallback {
        private final androidx.camera.core.impl.SessionProcessor.CaptureCallback mCaptureCallback;
        private final androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;
        private final androidx.camera.core.impl.TagBundle mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        public SessionProcessorImplCaptureCallbackAdapter(androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback, androidx.camera.core.impl.TagBundle tagBundle, boolean z17) {
            this(captureCallback, tagBundle, null, z17);
        }

        public void onCaptureCompleted(long j17, int i17, java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> map) {
            androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.onCaptureCompleted(j17, i17, new androidx.camera.extensions.internal.sessionprocessor.KeyValueMapCameraCaptureResult(j17, this.mTagBundle, map));
                this.mCaptureCallback.onCaptureSequenceCompleted(i17);
            }
        }

        public void onCaptureFailed(int i17) {
            this.mCaptureCallback.onCaptureFailed(i17);
        }

        public void onCaptureProcessProgressed(int i17) {
            this.mCaptureCallback.onCaptureProcessProgressed(i17);
        }

        public void onCaptureProcessStarted(int i17) {
            this.mCaptureCallback.onCaptureProcessStarted(i17);
        }

        public void onCaptureSequenceAborted(int i17) {
            this.mCaptureCallback.onCaptureSequenceAborted(i17);
        }

        public void onCaptureSequenceCompleted(int i17) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback = this.mCaptureCallback;
            long j17 = this.mOnCaptureStartedTimestamp;
            captureCallback.onCaptureCompleted(j17, i17, new androidx.camera.extensions.internal.sessionprocessor.KeyValueMapCameraCaptureResult(j17, this.mTagBundle, java.util.Collections.emptyMap()));
            this.mCaptureCallback.onCaptureSequenceCompleted(i17);
        }

        public void onCaptureStarted(int i17, long j17) {
            this.mOnCaptureStartedTimestamp = j17;
            this.mCaptureCallback.onCaptureStarted(i17, j17);
        }

        public SessionProcessorImplCaptureCallbackAdapter(androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback, androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.ExtensionMetadataMonitor extensionMetadataMonitor, boolean z17) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mCaptureCallback = captureCallback;
            this.mTagBundle = tagBundle;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z17;
        }
    }

    public AdvancedSessionProcessor(androidx.camera.extensions.impl.advanced.SessionProcessorImpl sessionProcessorImpl, java.util.List<android.hardware.camera2.CaptureRequest.Key> list, androidx.camera.extensions.internal.VendorExtender vendorExtender, android.content.Context context) {
        this(sessionProcessorImpl, list, vendorExtender, context, 0);
    }

    private static java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> convertConfigToMap(androidx.camera.core.impl.Config config) {
        java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> hashMap = new java.util.HashMap<>();
        androidx.camera.extensions.internal.RequestOptionConfig build = androidx.camera.extensions.internal.RequestOptionConfig.Builder.from(config).build();
        for (androidx.camera.core.impl.Config.Option<?> option : build.listOptions()) {
            hashMap.put((android.hardware.camera2.CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
        }
        return hashMap;
    }

    private androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig convertToCamera2SessionConfig(androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl camera2SessionConfigImpl) {
        androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder camera2SessionConfigBuilder = new androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder();
        java.util.Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            camera2SessionConfigBuilder.addOutputConfig(androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigConverter.fromImpl((androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl) it.next()));
        }
        for (android.hardware.camera2.CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            camera2SessionConfigBuilder.addSessionParameter(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        camera2SessionConfigBuilder.setSessionTemplateId(camera2SessionConfigImpl.getSessionTemplateId());
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType == -1) {
                    sessionType = 0;
                }
                camera2SessionConfigBuilder.setSessionType(sessionType);
            } catch (java.lang.NoSuchMethodError unused) {
                camera2SessionConfigBuilder.setSessionType(0);
            }
        }
        return camera2SessionConfigBuilder.build();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void abortCapture(int i17) {
        this.mImpl.abortCapture(i17);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase
    public void deInitSessionInternal() {
        synchronized (this.mLock) {
            this.mWorkingCaptureConfigMap = new java.util.HashMap<>();
            this.mRepeatingCaptureCallbackAdapter = null;
        }
        this.mImpl.deInitSession();
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public androidx.lifecycle.g0 getCurrentExtensionMode() {
        return this.mCurrentExtensionTypeLiveData;
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public androidx.lifecycle.g0 getExtensionStrength() {
        return this.mExtensionStrengthLiveData;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeCaptureLatency() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImpl.getRealtimeCaptureLatency();
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
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl initSession = (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) ? this.mImpl.initSession(str, map, this.mContext, new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceConfigurationImplAdapter(outputSurfaceConfiguration)) : null;
        if (initSession == null) {
            initSession = this.mImpl.initSession(str, map, this.mContext, new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceImplAdapter(outputSurfaceConfiguration.getPreviewOutputSurface()), new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageCaptureOutputSurface()), outputSurfaceConfiguration.getImageAnalysisOutputSurface() != null ? new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageAnalysisOutputSurface()) : null);
        }
        this.mIsPostviewConfigured = outputSurfaceConfiguration.getPostviewOutputSurface() != null;
        androidx.lifecycle.j0 j0Var = this.mCurrentExtensionTypeLiveData;
        if (j0Var != null) {
            j0Var.postValue(java.lang.Integer.valueOf(this.mMode));
        }
        androidx.lifecycle.j0 j0Var2 = this.mExtensionStrengthLiveData;
        if (j0Var2 != null) {
            j0Var2.postValue(100);
        }
        return convertToCamera2SessionConfig(initSession);
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public boolean isCurrentExtensionModeAvailable() {
        return this.mVendorExtender.isCurrentExtensionModeAvailable();
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public boolean isExtensionStrengthAvailable() {
        return this.mVendorExtender.isExtensionStrengthAvailable();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionEnd() {
        this.mImpl.onCaptureSessionEnd();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionStart(androidx.camera.core.impl.RequestProcessor requestProcessor) {
        this.mImpl.onCaptureSessionStart(new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.RequestProcessorImplAdapter(requestProcessor));
    }

    @Override // androidx.camera.extensions.CameraExtensionsControl
    public void setExtensionStrength(int i17) {
        androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        java.util.HashMap hashMap;
        if (!isExtensionStrengthAvailable() || android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        synchronized (this.mLock) {
            this.mExtensionStrength = i17;
            this.mWorkingCaptureConfigMap.put(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH, java.lang.Integer.valueOf(i17));
            sessionProcessorImplCaptureCallbackAdapter = this.mRepeatingCaptureCallbackAdapter;
            hashMap = (java.util.HashMap) this.mWorkingCaptureConfigMap.clone();
        }
        this.mImpl.setParameters(hashMap);
        if (sessionProcessorImplCaptureCallbackAdapter != null) {
            this.mImpl.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void setParameters(androidx.camera.core.impl.Config config) {
        java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> convertConfigToMap;
        synchronized (this.mLock) {
            convertConfigToMap = convertConfigToMap(config);
            int i17 = this.mExtensionStrength;
            if (i17 != -1 && android.os.Build.VERSION.SDK_INT >= 34) {
                convertConfigToMap.put(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH, java.lang.Integer.valueOf(i17));
            }
            this.mWorkingCaptureConfigMap = convertConfigToMap;
        }
        this.mImpl.setParameters(convertConfigToMap);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startCapture(boolean z17, androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        androidx.camera.core.Logger.d(TAG, "startCapture postviewEnabled = " + z17 + " mWillReceiveOnCaptureCompleted = " + this.mWillReceiveOnCaptureCompleted);
        androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter = new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.SessionProcessorImplCaptureCallbackAdapter(captureCallback, tagBundle, this.mWillReceiveOnCaptureCompleted);
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        return (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version) && this.mIsPostviewConfigured && z17 && this.mVendorExtender.isPostviewAvailable()) ? this.mImpl.startCaptureWithPostview(sessionProcessorImplCaptureCallbackAdapter) : this.mImpl.startCapture(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startRepeating(androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        synchronized (this.mLock) {
            sessionProcessorImplCaptureCallbackAdapter = new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.SessionProcessorImplCaptureCallbackAdapter(captureCallback, tagBundle, this.mExtensionMetadataMonitor, this.mWillReceiveOnCaptureCompleted);
            this.mRepeatingCaptureCallbackAdapter = sessionProcessorImplCaptureCallbackAdapter;
        }
        return this.mImpl.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startTrigger(androidx.camera.core.impl.Config config, androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> convertConfigToMap = convertConfigToMap(config);
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_3;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImpl.startTrigger(convertConfigToMap, new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.SessionProcessorImplCaptureCallbackAdapter(captureCallback, tagBundle, this.mWillReceiveOnCaptureCompleted));
        }
        return -1;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void stopRepeating() {
        this.mImpl.stopRepeating();
        synchronized (this.mLock) {
            this.mRepeatingCaptureCallbackAdapter = null;
        }
    }

    public AdvancedSessionProcessor(androidx.camera.extensions.impl.advanced.SessionProcessorImpl sessionProcessorImpl, java.util.List<android.hardware.camera2.CaptureRequest.Key> list, androidx.camera.extensions.internal.VendorExtender vendorExtender, android.content.Context context, int i17) {
        super(list);
        this.mIsPostviewConfigured = false;
        this.mWorkingCaptureConfigMap = new java.util.HashMap<>();
        this.mRepeatingCaptureCallbackAdapter = null;
        this.mImpl = sessionProcessorImpl;
        this.mVendorExtender = vendorExtender;
        this.mContext = context;
        this.mWillReceiveOnCaptureCompleted = vendorExtender.willReceiveOnCaptureCompleted();
        this.mMode = i17;
        androidx.lifecycle.j0 j0Var = isCurrentExtensionModeAvailable() ? new androidx.lifecycle.j0(java.lang.Integer.valueOf(i17)) : null;
        this.mCurrentExtensionTypeLiveData = j0Var;
        androidx.lifecycle.j0 j0Var2 = isExtensionStrengthAvailable() ? new androidx.lifecycle.j0(100) : null;
        this.mExtensionStrengthLiveData = j0Var2;
        if (j0Var == null && j0Var2 == null) {
            this.mExtensionMetadataMonitor = null;
        } else {
            this.mExtensionMetadataMonitor = new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor.ExtensionMetadataMonitor(j0Var, j0Var2);
        }
    }
}
