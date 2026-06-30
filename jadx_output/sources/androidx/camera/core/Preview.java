package androidx.camera.core;

/* loaded from: classes14.dex */
public final class Preview extends androidx.camera.core.UseCase {
    public static final androidx.camera.core.Preview.Defaults DEFAULT_CONFIG = new androidx.camera.core.Preview.Defaults();
    private static final java.util.concurrent.Executor DEFAULT_SURFACE_PROVIDER_EXECUTOR = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
    private static final java.lang.String TAG = "Preview";
    private androidx.camera.core.processing.SurfaceEdge mCameraEdge;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener;
    androidx.camera.core.SurfaceRequest mCurrentSurfaceRequest;
    private androidx.camera.core.processing.SurfaceProcessorNode mNode;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private androidx.camera.core.impl.DeferrableSurface mSessionDeferrableSurface;
    private androidx.camera.core.Preview.SurfaceProvider mSurfaceProvider;
    private java.util.concurrent.Executor mSurfaceProviderExecutor;

    /* loaded from: classes14.dex */
    public static final class Builder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.Preview, androidx.camera.core.impl.PreviewConfig, androidx.camera.core.Preview.Builder>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.Preview.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.Preview.Builder>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.core.Preview.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        public static androidx.camera.core.Preview.Builder fromConfig(androidx.camera.core.impl.Config config) {
            return new androidx.camera.core.Preview.Builder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setCustomOrderedResolutions(java.util.List list) {
            return setCustomOrderedResolutions((java.util.List<android.util.Size>) list);
        }

        public androidx.camera.core.Preview.Builder setPreviewStabilizationEnabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, java.lang.Integer.valueOf(z17 ? 2 : 1));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setSupportedResolutions(java.util.List list) {
            return setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
            return setTargetClass((java.lang.Class<androidx.camera.core.Preview>) cls);
        }

        public androidx.camera.core.Preview.Builder setTargetFrameRate(android.util.Range<java.lang.Integer> range) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.Preview.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW);
            setTargetClass(androidx.camera.core.Preview.class);
            androidx.camera.core.impl.Config.Option<java.lang.Integer> option = androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE;
            if (((java.lang.Integer) mutableOptionsBundle.retrieveOption(option, -1)).intValue() == -1) {
                mutableOptionsBundle.insertOption(option, 2);
            }
        }

        public static androidx.camera.core.Preview.Builder fromConfig(androidx.camera.core.impl.PreviewConfig previewConfig) {
            return new androidx.camera.core.Preview.Builder(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) previewConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.Preview build() {
            androidx.camera.core.impl.PreviewConfig useCaseConfig = getUseCaseConfig();
            androidx.camera.core.impl.ImageOutputConfig.validateConfig(useCaseConfig);
            return new androidx.camera.core.Preview(useCaseConfig);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.impl.PreviewConfig getUseCaseConfig() {
            return new androidx.camera.core.impl.PreviewConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public androidx.camera.core.Preview.Builder setBackgroundExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.Preview.Builder setCustomOrderedResolutions(java.util.List<android.util.Size> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.Preview.Builder setDefaultResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public androidx.camera.core.Preview.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setHighResolutionDisabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.Preview.Builder setMaxResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.Preview.Builder setMirrorMode(int i17) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE, java.lang.Integer.valueOf(i17));
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.Preview.Builder setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.Preview.Builder setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setSurfaceOccupancyPriority(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public androidx.camera.core.Preview.Builder setTargetAspectRatio(int i17) {
            if (i17 == -1) {
                i17 = 0;
            }
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.Preview.Builder setTargetClass(java.lang.Class<androidx.camera.core.Preview> cls) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.Preview.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public androidx.camera.core.Preview.Builder setTargetResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.Preview.Builder setTargetRotation(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i17));
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_APP_TARGET_ROTATION, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.Preview.Builder setZslDisabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    /* loaded from: classes14.dex */
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.PreviewConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final androidx.camera.core.impl.PreviewConfig DEFAULT_CONFIG;
        private static final androidx.camera.core.DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final int DEFAULT_MIRROR_MODE = 2;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 2;

        static {
            androidx.camera.core.resolutionselector.ResolutionSelector build = new androidx.camera.core.resolutionselector.ResolutionSelector.Builder().setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            DEFAULT_RESOLUTION_SELECTOR = build;
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.UNSPECIFIED;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            DEFAULT_CONFIG = new androidx.camera.core.Preview.Builder().setSurfaceOccupancyPriority(2).setTargetAspectRatio(0).setResolutionSelector(build).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public androidx.camera.core.impl.PreviewConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    /* loaded from: classes14.dex */
    public interface SurfaceProvider {
        void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest);
    }

    public Preview(androidx.camera.core.impl.PreviewConfig previewConfig) {
        super(previewConfig);
        this.mSurfaceProviderExecutor = DEFAULT_SURFACE_PROVIDER_EXECUTOR;
    }

    private void addCameraSurfaceAndErrorListener(androidx.camera.core.impl.SessionConfig.Builder builder, androidx.camera.core.impl.StreamSpec streamSpec) {
        if (this.mSurfaceProvider != null) {
            builder.addSurface(this.mSessionDeferrableSurface, streamSpec.getDynamicRange(), getPhysicalCameraId(), getMirrorModeInternal());
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.Preview$$d
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.core.Preview.this.lambda$addCameraSurfaceAndErrorListener$1(sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builder.setErrorListener(closeableErrorListener2);
    }

    private void clearPipeline() {
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.mSessionDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mSessionDeferrableSurface = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = this.mNode;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.mNode = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        this.mCurrentSurfaceRequest = null;
    }

    private androidx.camera.core.impl.SessionConfig.Builder createPipeline(androidx.camera.core.impl.PreviewConfig previewConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        java.util.Objects.requireNonNull(camera);
        final androidx.camera.core.impl.CameraInternal cameraInternal = camera;
        clearPipeline();
        m3.h.e(this.mCameraEdge == null, null);
        android.graphics.Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        boolean hasTransform = cameraInternal.getHasTransform();
        android.graphics.Rect cropRect = getCropRect(streamSpec.getResolution());
        java.util.Objects.requireNonNull(cropRect);
        this.mCameraEdge = new androidx.camera.core.processing.SurfaceEdge(1, 34, streamSpec, sensorToBufferTransformMatrix, hasTransform, cropRect, getRelativeRotation(cameraInternal, isMirroringRequired(cameraInternal)), getAppTargetRotation(), shouldMirror(cameraInternal));
        androidx.camera.core.CameraEffect effect = getEffect();
        if (effect != null) {
            this.mNode = new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, effect.createSurfaceProcessorInternal());
            this.mCameraEdge.addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Preview.this.notifyReset();
                }
            });
            androidx.camera.core.processing.util.OutConfig of6 = androidx.camera.core.processing.util.OutConfig.of(this.mCameraEdge);
            androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.mNode.transform(androidx.camera.core.processing.SurfaceProcessorNode.In.of(this.mCameraEdge, java.util.Collections.singletonList(of6))).get(of6);
            java.util.Objects.requireNonNull(surfaceEdge);
            surfaceEdge.addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Preview.this.lambda$createPipeline$0(cameraInternal);
                }
            });
            this.mCurrentSurfaceRequest = surfaceEdge.createSurfaceRequest(cameraInternal);
            this.mSessionDeferrableSurface = this.mCameraEdge.getDeferrableSurface();
        } else {
            this.mCameraEdge.addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Preview.this.notifyReset();
                }
            });
            androidx.camera.core.SurfaceRequest createSurfaceRequest = this.mCameraEdge.createSurfaceRequest(cameraInternal);
            this.mCurrentSurfaceRequest = createSurfaceRequest;
            this.mSessionDeferrableSurface = createSurfaceRequest.getDeferrableSurface();
        }
        if (this.mSurfaceProvider != null) {
            sendSurfaceRequest();
        }
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(previewConfig, streamSpec.getResolution());
        createFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        createFrom.setPreviewStabilization(previewConfig.getPreviewStabilizationMode());
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        addCameraSurfaceAndErrorListener(createFrom, streamSpec);
        return createFrom;
    }

    private android.graphics.Rect getCropRect(android.util.Size size) {
        if (getViewPortCropRect() != null) {
            return getViewPortCropRect();
        }
        if (size != null) {
            return new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public static androidx.camera.core.PreviewCapabilities getPreviewCapabilities(androidx.camera.core.CameraInfo cameraInfo) {
        return androidx.camera.core.impl.capability.PreviewCapabilitiesImpl.from(cameraInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addCameraSurfaceAndErrorListener$1(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        if (getCamera() == null) {
            return;
        }
        updateConfigAndOutput((androidx.camera.core.impl.PreviewConfig) getCurrentConfig(), getAttachedStreamSpec());
        notifyReset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createPipeline$0(androidx.camera.core.impl.CameraInternal cameraInternal) {
        onAppEdgeInvalidated(this.mCameraEdge, cameraInternal);
    }

    private void onAppEdgeInvalidated(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.CameraInternal cameraInternal) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (cameraInternal == getCamera()) {
            surfaceEdge.invalidate();
        }
    }

    private void sendSurfaceRequest() {
        sendTransformationInfoIfReady();
        final androidx.camera.core.Preview.SurfaceProvider surfaceProvider = this.mSurfaceProvider;
        surfaceProvider.getClass();
        final androidx.camera.core.SurfaceRequest surfaceRequest = this.mCurrentSurfaceRequest;
        surfaceRequest.getClass();
        this.mSurfaceProviderExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.Preview.SurfaceProvider.this.onSurfaceRequested(surfaceRequest);
            }
        });
    }

    private void sendTransformationInfoIfReady() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        surfaceEdge.updateTransformation(getRelativeRotation(camera, isMirroringRequired(camera)), getAppTargetRotation());
    }

    private boolean shouldMirror(androidx.camera.core.impl.CameraInternal cameraInternal) {
        return cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal);
    }

    private void updateConfigAndOutput(androidx.camera.core.impl.PreviewConfig previewConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        androidx.camera.core.impl.SessionConfig.Builder createPipeline = createPipeline(previewConfig, streamSpec);
        this.mSessionConfigBuilder = createPipeline;
        java.lang.Object[] objArr = {createPipeline.build()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(java.util.Collections.unmodifiableList(arrayList));
    }

    public androidx.camera.core.processing.SurfaceEdge getCameraEdge() {
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.mCameraEdge;
        java.util.Objects.requireNonNull(surfaceEdge);
        return surfaceEdge;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z17, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.Preview.Defaults defaults = DEFAULT_CONFIG;
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z17) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public androidx.camera.core.DynamicRange getDynamicRange() {
        return getCurrentConfig().hasDynamicRange() ? getCurrentConfig().getDynamicRange() : androidx.camera.core.Preview.Defaults.DEFAULT_DYNAMIC_RANGE;
    }

    public androidx.camera.core.ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
        return ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    @Override // androidx.camera.core.UseCase
    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public androidx.camera.core.Preview.SurfaceProvider getSurfaceProvider() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.mSurfaceProvider;
    }

    public android.util.Range<java.lang.Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return androidx.camera.core.Preview.Builder.fromConfig(config);
    }

    public boolean isPreviewStabilizationEnabled() {
        return getCurrentConfig().getPreviewStabilizationMode() == 2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 34);
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
        updateConfigAndOutput((androidx.camera.core.impl.PreviewConfig) getCurrentConfig(), streamSpec);
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        clearPipeline();
    }

    public void setSurfaceProvider(java.util.concurrent.Executor executor, androidx.camera.core.Preview.SurfaceProvider surfaceProvider) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (surfaceProvider == null) {
            this.mSurfaceProvider = null;
            notifyInactive();
            return;
        }
        this.mSurfaceProvider = surfaceProvider;
        this.mSurfaceProviderExecutor = executor;
        if (getAttachedSurfaceResolution() != null) {
            updateConfigAndOutput((androidx.camera.core.impl.PreviewConfig) getCurrentConfig(), getAttachedStreamSpec());
            notifyReset();
        }
        notifyActive();
    }

    public void setTargetRotation(int i17) {
        if (setTargetRotationInternal(i17)) {
            sendTransformationInfoIfReady();
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setViewPortCropRect(android.graphics.Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady();
    }

    public java.lang.String toString() {
        return "Preview:" + getName();
    }

    public void setSurfaceProvider(androidx.camera.core.Preview.SurfaceProvider surfaceProvider) {
        setSurfaceProvider(DEFAULT_SURFACE_PROVIDER_EXECUTOR, surfaceProvider);
    }
}
