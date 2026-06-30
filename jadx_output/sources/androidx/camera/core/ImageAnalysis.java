package androidx.camera.core;

/* loaded from: classes14.dex */
public final class ImageAnalysis extends androidx.camera.core.UseCase {
    public static final int COORDINATE_SYSTEM_ORIGINAL = 0;
    public static final int COORDINATE_SYSTEM_SENSOR = 2;
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    private static final int DEFAULT_BACKPRESSURE_STRATEGY = 0;
    private static final int DEFAULT_IMAGE_QUEUE_DEPTH = 6;
    private static final int DEFAULT_OUTPUT_IMAGE_FORMAT = 1;
    private static final boolean DEFAULT_OUTPUT_IMAGE_ROTATION_ENABLED = false;
    private static final int NON_BLOCKING_IMAGE_DEPTH = 4;
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;
    private static final java.lang.String TAG = "ImageAnalysis";
    private final java.lang.Object mAnalysisLock;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;
    final androidx.camera.core.ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private androidx.camera.core.ImageAnalysis.Analyzer mSubscribedAnalyzer;
    public static final androidx.camera.core.ImageAnalysis.Defaults DEFAULT_CONFIG = new androidx.camera.core.ImageAnalysis.Defaults();
    private static final java.lang.Boolean DEFAULT_ONE_PIXEL_SHIFT_ENABLED = null;

    /* loaded from: classes14.dex */
    public interface Analyzer {
        void analyze(androidx.camera.core.ImageProxy imageProxy);

        default android.util.Size getDefaultTargetResolution() {
            return null;
        }

        default int getTargetCoordinateSystem() {
            return 0;
        }

        default void updateTransform(android.graphics.Matrix matrix) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface BackpressureStrategy {
    }

    /* loaded from: classes14.dex */
    public static final class Builder implements androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.ImageAnalysis, androidx.camera.core.impl.ImageAnalysisConfig, androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.ImageAnalysis.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        public static androidx.camera.core.ImageAnalysis.Builder fromConfig(androidx.camera.core.impl.Config config) {
            return new androidx.camera.core.ImageAnalysis.Builder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public androidx.camera.core.ImageAnalysis.Builder setBackpressureStrategy(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setCustomOrderedResolutions(java.util.List list) {
            return setCustomOrderedResolutions((java.util.List<android.util.Size>) list);
        }

        public androidx.camera.core.ImageAnalysis.Builder setImageQueueDepth(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.ImageAnalysis.Builder setImageReaderProxyProvider(androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public androidx.camera.core.ImageAnalysis.Builder setOnePixelShiftEnabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        public androidx.camera.core.ImageAnalysis.Builder setOutputImageFormat(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.ImageAnalysis.Builder setOutputImageRotationEnabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setSupportedResolutions(java.util.List list) {
            return setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
            return setTargetClass((java.lang.Class<androidx.camera.core.ImageAnalysis>) cls);
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.ImageAnalysis.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            setTargetClass(androidx.camera.core.ImageAnalysis.class);
        }

        public static androidx.camera.core.ImageAnalysis.Builder fromConfig(androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig) {
            return new androidx.camera.core.ImageAnalysis.Builder(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) imageAnalysisConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.ImageAnalysis build() {
            androidx.camera.core.impl.ImageAnalysisConfig useCaseConfig = getUseCaseConfig();
            androidx.camera.core.impl.ImageOutputConfig.validateConfig(useCaseConfig);
            return new androidx.camera.core.ImageAnalysis(useCaseConfig);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.impl.ImageAnalysisConfig getUseCaseConfig() {
            return new androidx.camera.core.impl.ImageAnalysisConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setBackgroundExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setCustomOrderedResolutions(java.util.List<android.util.Size> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setDefaultResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            if (java.util.Objects.equals(androidx.camera.core.DynamicRange.SDR, dynamicRange)) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
                return this;
            }
            throw new java.lang.UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setHighResolutionDisabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setMaxResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setMirrorMode(int i17) {
            throw new java.lang.UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setSurfaceOccupancyPriority(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public androidx.camera.core.ImageAnalysis.Builder setTargetAspectRatio(int i17) {
            if (i17 == -1) {
                i17 = 0;
            }
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setTargetClass(java.lang.Class<androidx.camera.core.ImageAnalysis> cls) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public androidx.camera.core.ImageAnalysis.Builder setTargetResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setTargetRotation(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageAnalysis.Builder setZslDisabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    /* loaded from: classes14.dex */
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageAnalysisConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final androidx.camera.core.impl.ImageAnalysisConfig DEFAULT_CONFIG;
        private static final androidx.camera.core.DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 1;
        private static final android.util.Size DEFAULT_TARGET_RESOLUTION;

        static {
            android.util.Size size = new android.util.Size(640, 480);
            DEFAULT_TARGET_RESOLUTION = size;
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            androidx.camera.core.resolutionselector.ResolutionSelector build = new androidx.camera.core.resolutionselector.ResolutionSelector.Builder().setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(new androidx.camera.core.resolutionselector.ResolutionStrategy(androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA, 1)).build();
            DEFAULT_RESOLUTION_SELECTOR = build;
            DEFAULT_CONFIG = new androidx.camera.core.ImageAnalysis.Builder().setDefaultResolution(size).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).setResolutionSelector(build).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public androidx.camera.core.impl.ImageAnalysisConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface OutputImageFormat {
    }

    public ImageAnalysis(androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.mAnalysisLock = new java.lang.Object();
        if (((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0) == 1) {
            this.mImageAnalysisAbstractAnalyzer = new androidx.camera.core.ImageAnalysisBlockingAnalyzer();
        } else {
            this.mImageAnalysisAbstractAnalyzer = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer(imageAnalysisConfig.getBackgroundExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.highPriorityExecutor()));
        }
        this.mImageAnalysisAbstractAnalyzer.setOutputImageFormat(getOutputImageFormat());
        this.mImageAnalysisAbstractAnalyzer.setOutputImageRotationEnabled(isOutputImageRotationEnabled());
    }

    private boolean isFlipWH(androidx.camera.core.impl.CameraInternal cameraInternal) {
        return isOutputImageRotationEnabled() && getRelativeRotation(cameraInternal) % 180 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createPipeline$1(androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy, androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        safeCloseImageReaderProxy.safeClose();
        if (safeCloseImageReaderProxy2 != null) {
            safeCloseImageReaderProxy2.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createPipeline$2(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        if (getCamera() == null) {
            return;
        }
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.clearCache();
        java.lang.String cameraId = getCameraId();
        androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig = (androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig();
        androidx.camera.core.impl.StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        attachedStreamSpec.getClass();
        androidx.camera.core.impl.SessionConfig.Builder createPipeline = createPipeline(cameraId, imageAnalysisConfig, attachedStreamSpec);
        this.mSessionConfigBuilder = createPipeline;
        java.lang.Object[] objArr = {createPipeline.build()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(java.util.Collections.unmodifiableList(arrayList));
        notifyReset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$onMergeConfig$0(android.util.Size size, java.util.List list, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private void tryUpdateRelativeRotation() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera != null) {
            this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
        }
    }

    public void clearAnalyzer() {
        synchronized (this.mAnalysisLock) {
            this.mImageAnalysisAbstractAnalyzer.setAnalyzer(null, null);
            if (this.mSubscribedAnalyzer != null) {
                notifyInactive();
            }
            this.mSubscribedAnalyzer = null;
        }
    }

    public void clearPipeline() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
    }

    public androidx.camera.core.impl.SessionConfig.Builder createPipeline(java.lang.String str, androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        android.util.Size resolution = streamSpec.getResolution();
        java.util.concurrent.Executor backgroundExecutor = imageAnalysisConfig.getBackgroundExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.highPriorityExecutor());
        backgroundExecutor.getClass();
        boolean z17 = true;
        int imageQueueDepth = getBackpressureStrategy() == 1 ? getImageQueueDepth() : 4;
        final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = imageAnalysisConfig.getImageReaderProxyProvider() != null ? new androidx.camera.core.SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth, 0L)) : new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth));
        boolean isFlipWH = getCamera() != null ? isFlipWH(getCamera()) : false;
        int height = isFlipWH ? resolution.getHeight() : resolution.getWidth();
        int width = isFlipWH ? resolution.getWidth() : resolution.getHeight();
        int i17 = getOutputImageFormat() == 2 ? 1 : 35;
        boolean z18 = getImageFormat() == 35 && getOutputImageFormat() == 2;
        if (getImageFormat() != 35 || ((getCamera() == null || getRelativeRotation(getCamera()) == 0) && !java.lang.Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
            z17 = false;
        }
        final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = (z18 || z17) ? new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(height, width, i17, safeCloseImageReaderProxy.getMaxImages())) : null;
        if (safeCloseImageReaderProxy2 != null) {
            this.mImageAnalysisAbstractAnalyzer.setProcessedImageReaderProxy(safeCloseImageReaderProxy2);
        }
        tryUpdateRelativeRotation();
        safeCloseImageReaderProxy.setOnImageAvailableListener(this.mImageAnalysisAbstractAnalyzer, backgroundExecutor);
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(imageAnalysisConfig, streamSpec.getResolution());
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        androidx.camera.core.impl.ImmediateSurface immediateSurface = new androidx.camera.core.impl.ImmediateSurface(safeCloseImageReaderProxy.getSurface(), resolution, getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        immediateSurface.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysis$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.ImageAnalysis.lambda$createPipeline$1(androidx.camera.core.SafeCloseImageReaderProxy.this, safeCloseImageReaderProxy2);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        createFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        createFrom.addSurface(this.mDeferrableSurface, streamSpec.getDynamicRange(), null, -1);
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageAnalysis$$b
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.core.ImageAnalysis.this.lambda$createPipeline$2(sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        createFrom.setErrorListener(closeableErrorListener2);
        return createFrom;
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getBackgroundExecutor(null);
    }

    public int getBackpressureStrategy() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z17, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.ImageAnalysis.Defaults defaults = DEFAULT_CONFIG;
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z17) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getImageQueueDepth() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    public java.lang.Boolean getOnePixelShiftEnabled() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getOnePixelShiftEnabled(DEFAULT_ONE_PIXEL_SHIFT_ENABLED);
    }

    public int getOutputImageFormat() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getOutputImageFormat(1);
    }

    public androidx.camera.core.ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
        return ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return androidx.camera.core.ImageAnalysis.Builder.fromConfig(config);
    }

    public boolean isOutputImageRotationEnabled() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).isOutputImageRotationEnabled(java.lang.Boolean.FALSE).booleanValue();
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        this.mImageAnalysisAbstractAnalyzer.attach();
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        final android.util.Size defaultTargetResolution;
        java.lang.Boolean onePixelShiftEnabled = getOnePixelShiftEnabled();
        boolean contains = cameraInfoInternal.getCameraQuirks().contains(androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk.class);
        androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
        if (onePixelShiftEnabled != null) {
            contains = onePixelShiftEnabled.booleanValue();
        }
        imageAnalysisAbstractAnalyzer.setOnePixelShiftEnabled(contains);
        synchronized (this.mAnalysisLock) {
            androidx.camera.core.ImageAnalysis.Analyzer analyzer = this.mSubscribedAnalyzer;
            defaultTargetResolution = analyzer != null ? analyzer.getDefaultTargetResolution() : null;
        }
        if (defaultTargetResolution == null) {
            return builder.getUseCaseConfig();
        }
        if (cameraInfoInternal.getSensorRotationDegrees(((java.lang.Integer) builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, 0)).intValue()) % 180 == 90) {
            defaultTargetResolution = new android.util.Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        ?? useCaseConfig = builder.getUseCaseConfig();
        androidx.camera.core.impl.Config.Option<android.util.Size> option = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION;
        if (!useCaseConfig.containsOption(option)) {
            builder.getMutableConfig().insertOption(option, defaultTargetResolution);
        }
        ?? useCaseConfig2 = builder.getUseCaseConfig();
        androidx.camera.core.impl.Config.Option option2 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        if (useCaseConfig2.containsOption(option2)) {
            androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector = (androidx.camera.core.resolutionselector.ResolutionSelector) getAppConfig().retrieveOption(option2, null);
            androidx.camera.core.resolutionselector.ResolutionSelector.Builder builder2 = resolutionSelector == null ? new androidx.camera.core.resolutionselector.ResolutionSelector.Builder() : androidx.camera.core.resolutionselector.ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
            if (resolutionSelector == null || resolutionSelector.getResolutionStrategy() == null) {
                builder2.setResolutionStrategy(new androidx.camera.core.resolutionselector.ResolutionStrategy(defaultTargetResolution, 1));
            }
            if (resolutionSelector == null) {
                builder2.setResolutionFilter(new androidx.camera.core.resolutionselector.ResolutionFilter() { // from class: androidx.camera.core.ImageAnalysis$$c
                    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
                    public final java.util.List filter(java.util.List list, int i17) {
                        java.util.List lambda$onMergeConfig$0;
                        lambda$onMergeConfig$0 = androidx.camera.core.ImageAnalysis.lambda$onMergeConfig$0(defaultTargetResolution, list, i17);
                        return lambda$onMergeConfig$0;
                    }
                });
            }
            builder.getMutableConfig().insertOption(option2, builder2.build());
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        java.lang.Object[] objArr = {this.mSessionConfigBuilder.build()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(java.util.Collections.unmodifiableList(arrayList));
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        androidx.camera.core.impl.SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = createPipeline;
        java.lang.Object[] objArr = {createPipeline.build()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(java.util.Collections.unmodifiableList(arrayList));
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.detach();
    }

    public void setAnalyzer(java.util.concurrent.Executor executor, final androidx.camera.core.ImageAnalysis.Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, new androidx.camera.core.ImageAnalysis.Analyzer() { // from class: androidx.camera.core.ImageAnalysis$$d
                @Override // androidx.camera.core.ImageAnalysis.Analyzer
                public final void analyze(androidx.camera.core.ImageProxy imageProxy) {
                    androidx.camera.core.ImageAnalysis.Analyzer.this.analyze(imageProxy);
                }
            });
            if (this.mSubscribedAnalyzer == null) {
                notifyActive();
            }
            this.mSubscribedAnalyzer = analyzer;
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setSensorToBufferTransformMatrix(android.graphics.Matrix matrix) {
        super.setSensorToBufferTransformMatrix(matrix);
        this.mImageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
    }

    public void setTargetRotation(int i17) {
        if (setTargetRotationInternal(i17)) {
            tryUpdateRelativeRotation();
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setViewPortCropRect(android.graphics.Rect rect) {
        super.setViewPortCropRect(rect);
        this.mImageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
    }

    public java.lang.String toString() {
        return "ImageAnalysis:" + getName();
    }
}
