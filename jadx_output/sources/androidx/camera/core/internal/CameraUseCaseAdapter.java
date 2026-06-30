package androidx.camera.core.internal;

/* loaded from: classes14.dex */
public final class CameraUseCaseAdapter implements androidx.camera.core.Camera {
    private static final java.lang.String TAG = "CameraUseCaseAdapter";
    private final androidx.camera.core.impl.RestrictedCameraControl mAdapterCameraControl;
    private final androidx.camera.core.impl.RestrictedCameraInfo mAdapterCameraInfo;
    private final androidx.camera.core.impl.RestrictedCameraInfo mAdapterSecondaryCameraInfo;
    private final java.util.List<androidx.camera.core.UseCase> mAppUseCases;
    private boolean mAttached;
    private final androidx.camera.core.impl.CameraConfig mCameraConfig;
    private final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;
    private final androidx.camera.core.impl.CameraDeviceSurfaceManager mCameraDeviceSurfaceManager;
    private final androidx.camera.core.impl.CameraInternal mCameraInternal;
    private final java.util.List<androidx.camera.core.UseCase> mCameraUseCases;
    private java.util.List<androidx.camera.core.CameraEffect> mEffects;
    private final androidx.camera.core.internal.CameraUseCaseAdapter.CameraId mId;
    private androidx.camera.core.impl.Config mInteropConfig;
    private final androidx.camera.core.LayoutSettings mLayoutSettings;
    private final java.lang.Object mLock;
    private androidx.camera.core.UseCase mPlaceholderForExtensions;
    private final androidx.camera.core.impl.CameraInternal mSecondaryCameraInternal;
    private final androidx.camera.core.LayoutSettings mSecondaryLayoutSettings;
    private androidx.camera.core.streamsharing.StreamSharing mStreamSharing;
    private final androidx.camera.core.impl.UseCaseConfigFactory mUseCaseConfigFactory;
    private androidx.camera.core.ViewPort mViewPort;

    /* loaded from: classes14.dex */
    public static final class CameraException extends java.lang.Exception {
        public CameraException() {
        }

        public CameraException(java.lang.String str) {
            super(str);
        }

        public CameraException(java.lang.Throwable th6) {
            super(th6);
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class CameraId {
        public static androidx.camera.core.internal.CameraUseCaseAdapter.CameraId create(java.lang.String str, androidx.camera.core.impl.Identifier identifier) {
            return new androidx.camera.core.internal.AutoValue_CameraUseCaseAdapter_CameraId(str, identifier);
        }

        public abstract androidx.camera.core.impl.Identifier getCameraConfigId();

        public abstract java.lang.String getCameraIdString();
    }

    /* loaded from: classes14.dex */
    public static class ConfigPair {
        androidx.camera.core.impl.UseCaseConfig<?> mCameraConfig;
        androidx.camera.core.impl.UseCaseConfig<?> mExtendedConfig;

        public ConfigPair(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig2) {
            this.mExtendedConfig = useCaseConfig;
            this.mCameraConfig = useCaseConfig2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CameraUseCaseAdapter(androidx.camera.core.impl.CameraInternal r11, androidx.camera.core.concurrent.CameraCoordinator r12, androidx.camera.core.impl.CameraDeviceSurfaceManager r13, androidx.camera.core.impl.UseCaseConfigFactory r14) {
        /*
            r10 = this;
            r2 = 0
            androidx.camera.core.impl.RestrictedCameraInfo r3 = new androidx.camera.core.impl.RestrictedCameraInfo
            androidx.camera.core.impl.CameraInfoInternal r0 = r11.getCameraInfoInternal()
            androidx.camera.core.impl.CameraConfig r1 = androidx.camera.core.impl.CameraConfigs.defaultConfig()
            r3.<init>(r0, r1)
            r4 = 0
            androidx.camera.core.LayoutSettings r6 = androidx.camera.core.LayoutSettings.DEFAULT
            r0 = r10
            r1 = r11
            r5 = r6
            r7 = r12
            r8 = r13
            r9 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.<init>(androidx.camera.core.impl.CameraInternal, androidx.camera.core.concurrent.CameraCoordinator, androidx.camera.core.impl.CameraDeviceSurfaceManager, androidx.camera.core.impl.UseCaseConfigFactory):void");
    }

    private void cacheInteropConfig() {
        synchronized (this.mLock) {
            androidx.camera.core.impl.CameraControlInternal cameraControlInternal = this.mCameraInternal.getCameraControlInternal();
            this.mInteropConfig = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    public static java.util.Collection<androidx.camera.core.UseCase> calculateCameraUseCases(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.UseCase useCase, androidx.camera.core.streamsharing.StreamSharing streamSharing) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        if (useCase != null) {
            arrayList.add(useCase);
        }
        if (streamSharing != null) {
            arrayList.add(streamSharing);
            arrayList.removeAll(streamSharing.getChildren());
        }
        return arrayList;
    }

    private androidx.camera.core.UseCase calculatePlaceholderForExtensions(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.streamsharing.StreamSharing streamSharing) {
        androidx.camera.core.UseCase useCase;
        synchronized (this.mLock) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            if (streamSharing != null) {
                arrayList.add(streamSharing);
                arrayList.removeAll(streamSharing.getChildren());
            }
            if (isCoexistingPreviewImageCaptureRequired()) {
                if (isExtraPreviewRequired(arrayList)) {
                    useCase = isPreview(this.mPlaceholderForExtensions) ? this.mPlaceholderForExtensions : createExtraPreview();
                } else if (isExtraImageCaptureRequired(arrayList)) {
                    useCase = isImageCapture(this.mPlaceholderForExtensions) ? this.mPlaceholderForExtensions : createExtraImageCapture();
                }
            }
            useCase = null;
        }
        return useCase;
    }

    private static android.graphics.Matrix calculateSensorToBufferTransformMatrix(android.graphics.Rect rect, android.util.Size size) {
        m3.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, android.graphics.Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> calculateSuggestedStreamSpecs(int i17, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.Collection<androidx.camera.core.UseCase> collection, java.util.Collection<androidx.camera.core.UseCase> collection2, java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> map) {
        android.graphics.Rect rect;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String cameraId = cameraInfoInternal.getCameraId();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator<androidx.camera.core.UseCase> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.core.UseCase next = it.next();
            androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig = this.mCameraDeviceSurfaceManager.transformSurfaceConfig(i17, cameraId, next.getImageFormat(), next.getAttachedSurfaceResolution());
            int imageFormat = next.getImageFormat();
            android.util.Size attachedSurfaceResolution = next.getAttachedSurfaceResolution();
            androidx.camera.core.impl.StreamSpec attachedStreamSpec = next.getAttachedStreamSpec();
            attachedStreamSpec.getClass();
            androidx.camera.core.impl.AttachedSurfaceInfo create = androidx.camera.core.impl.AttachedSurfaceInfo.create(transformSurfaceConfig, imageFormat, attachedSurfaceResolution, attachedStreamSpec.getDynamicRange(), androidx.camera.core.streamsharing.StreamSharing.getCaptureTypes(next), next.getAttachedStreamSpec().getImplementationOptions(), next.getCurrentConfig().getTargetFrameRate(null));
            arrayList.add(create);
            hashMap2.put(create, next);
            hashMap.put(next, next.getAttachedStreamSpec());
        }
        if (!collection.isEmpty()) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            java.util.HashMap hashMap4 = new java.util.HashMap();
            try {
                rect = this.mCameraInternal.getCameraControlInternal().getSensorRect();
            } catch (java.lang.NullPointerException unused) {
                rect = null;
            }
            androidx.camera.core.internal.SupportedOutputSizesSorter supportedOutputSizesSorter = new androidx.camera.core.internal.SupportedOutputSizesSorter(cameraInfoInternal, rect != null ? androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect) : null);
            loop1: while (true) {
                z17 = false;
                for (androidx.camera.core.UseCase useCase : collection) {
                    androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = map.get(useCase);
                    androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs = useCase.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                    hashMap3.put(mergeConfigs, useCase);
                    hashMap4.put(mergeConfigs, supportedOutputSizesSorter.getSortedSupportedOutputSizes(mergeConfigs));
                    if (useCase.getCurrentConfig() instanceof androidx.camera.core.impl.PreviewConfig) {
                        if (((androidx.camera.core.impl.PreviewConfig) useCase.getCurrentConfig()).getPreviewStabilizationMode() == 2) {
                            z17 = true;
                        }
                    }
                }
            }
            android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> suggestedStreamSpecs = this.mCameraDeviceSurfaceManager.getSuggestedStreamSpecs(i17, cameraId, arrayList, hashMap4, z17, hasVideoCapture(collection));
            for (java.util.Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((androidx.camera.core.UseCase) entry.getValue(), (androidx.camera.core.impl.StreamSpec) ((java.util.Map) suggestedStreamSpecs.first).get(entry.getKey()));
            }
            for (java.util.Map.Entry entry2 : ((java.util.Map) suggestedStreamSpecs.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((androidx.camera.core.UseCase) hashMap2.get(entry2.getKey()), (androidx.camera.core.impl.StreamSpec) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    private void checkUnsupportedFeatureCombinationAndThrow(java.util.Collection<androidx.camera.core.UseCase> collection) {
        if (hasExtension()) {
            if (hasNonSdrConfig(collection)) {
                throw new java.lang.IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (hasUltraHdrImageCapture(collection)) {
                throw new java.lang.IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.mLock) {
            if (!this.mEffects.isEmpty() && hasUltraHdrImageCapture(collection)) {
                throw new java.lang.IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
            }
        }
    }

    private androidx.camera.core.ImageCapture createExtraImageCapture() {
        return new androidx.camera.core.ImageCapture.Builder().setTargetName("ImageCapture-Extra").build();
    }

    private androidx.camera.core.Preview createExtraPreview() {
        androidx.camera.core.Preview build = new androidx.camera.core.Preview.Builder().setTargetName("Preview-Extra").build();
        build.setSurfaceProvider(new androidx.camera.core.internal.CameraUseCaseAdapter$$b());
        return build;
    }

    private androidx.camera.core.streamsharing.StreamSharing createOrReuseStreamSharing(java.util.Collection<androidx.camera.core.UseCase> collection, boolean z17) {
        synchronized (this.mLock) {
            java.util.Set<androidx.camera.core.UseCase> streamSharingChildren = getStreamSharingChildren(collection, z17);
            if (streamSharingChildren.size() < 2 && (!hasExtension() || !hasVideoCapture(streamSharingChildren))) {
                return null;
            }
            androidx.camera.core.streamsharing.StreamSharing streamSharing = this.mStreamSharing;
            if (streamSharing != null && streamSharing.getChildren().equals(streamSharingChildren)) {
                androidx.camera.core.streamsharing.StreamSharing streamSharing2 = this.mStreamSharing;
                java.util.Objects.requireNonNull(streamSharing2);
                return streamSharing2;
            }
            if (!isStreamSharingChildrenCombinationValid(streamSharingChildren)) {
                return null;
            }
            return new androidx.camera.core.streamsharing.StreamSharing(this.mCameraInternal, this.mSecondaryCameraInternal, this.mLayoutSettings, this.mSecondaryLayoutSettings, streamSharingChildren, this.mUseCaseConfigFactory);
        }
    }

    public static androidx.camera.core.internal.CameraUseCaseAdapter.CameraId generateCameraId(androidx.camera.core.impl.RestrictedCameraInfo restrictedCameraInfo, androidx.camera.core.impl.RestrictedCameraInfo restrictedCameraInfo2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(restrictedCameraInfo.getCameraId());
        sb6.append(restrictedCameraInfo2 == null ? "" : restrictedCameraInfo2.getCameraId());
        return androidx.camera.core.internal.CameraUseCaseAdapter.CameraId.create(sb6.toString(), restrictedCameraInfo.getCameraConfig().getCompatibilityId());
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    private static androidx.camera.core.impl.UseCaseConfig<?> generateExtendedStreamSharingConfigFromPreview(androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.streamsharing.StreamSharing streamSharing) {
        androidx.camera.core.impl.UseCaseConfig<?> defaultConfig = new androidx.camera.core.Preview.Builder().build().getDefaultConfig(false, useCaseConfigFactory);
        if (defaultConfig == null) {
            return null;
        }
        androidx.camera.core.impl.MutableOptionsBundle from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) defaultConfig);
        from.removeOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS);
        return streamSharing.getUseCaseConfigBuilder(from).getUseCaseConfig();
    }

    private int getCameraMode() {
        synchronized (this.mLock) {
            return this.mCameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
        }
    }

    private static java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> getConfigs(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : collection) {
            hashMap.put(useCase, new androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair(androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase) ? generateExtendedStreamSharingConfigFromPreview(useCaseConfigFactory, (androidx.camera.core.streamsharing.StreamSharing) useCase) : useCase.getDefaultConfig(false, useCaseConfigFactory), useCase.getDefaultConfig(true, useCaseConfigFactory2)));
        }
        return hashMap;
    }

    private int getSharingTargets(boolean z17) {
        int i17;
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.core.CameraEffect> it = this.mEffects.iterator();
            androidx.camera.core.CameraEffect cameraEffect = null;
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                androidx.camera.core.CameraEffect next = it.next();
                if (androidx.camera.core.processing.TargetUtils.getNumberOfTargets(next.getTargets()) > 1) {
                    m3.h.e(cameraEffect == null, "Can only have one sharing effect.");
                    cameraEffect = next;
                }
            }
            if (cameraEffect != null) {
                i17 = cameraEffect.getTargets();
            }
            if (z17) {
                i17 |= 3;
            }
        }
        return i17;
    }

    private java.util.Set<androidx.camera.core.UseCase> getStreamSharingChildren(java.util.Collection<androidx.camera.core.UseCase> collection, boolean z17) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int sharingTargets = getSharingTargets(z17);
        for (androidx.camera.core.UseCase useCase : collection) {
            m3.h.b(!androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase), "Only support one level of sharing for now.");
            if (useCase.isEffectTargetsSupported(sharingTargets)) {
                hashSet.add(useCase);
            }
        }
        return hashSet;
    }

    private boolean hasExtension() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = this.mCameraConfig.getSessionProcessor(null) != null;
        }
        return z17;
    }

    private static boolean hasImplementationOptionChanged(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.SessionConfig sessionConfig) {
        androidx.camera.core.impl.Config implementationOptions = streamSpec.getImplementationOptions();
        androidx.camera.core.impl.Config implementationOptions2 = sessionConfig.getImplementationOptions();
        if (implementationOptions.listOptions().size() != sessionConfig.getImplementationOptions().listOptions().size()) {
            return true;
        }
        for (androidx.camera.core.impl.Config.Option<?> option : implementationOptions.listOptions()) {
            if (!implementationOptions2.containsOption(option) || !java.util.Objects.equals(implementationOptions2.retrieveOption(option), implementationOptions.retrieveOption(option))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasNonSdrConfig(java.util.Collection<androidx.camera.core.UseCase> collection) {
        java.util.Iterator<androidx.camera.core.UseCase> it = collection.iterator();
        while (it.hasNext()) {
            if (isNotSdr(it.next().getCurrentConfig().getDynamicRange())) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasUltraHdrImageCapture(java.util.Collection<androidx.camera.core.UseCase> collection) {
        for (androidx.camera.core.UseCase useCase : collection) {
            if (isImageCapture(useCase)) {
                androidx.camera.core.impl.UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
                androidx.camera.core.impl.Config.Option<?> option = androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
                if (currentConfig.containsOption(option)) {
                    java.lang.Integer num = (java.lang.Integer) currentConfig.retrieveOption(option);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean hasVideoCapture(java.util.Collection<androidx.camera.core.UseCase> collection) {
        java.util.Iterator<androidx.camera.core.UseCase> it = collection.iterator();
        while (it.hasNext()) {
            if (isVideoCapture(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean isCoexistingPreviewImageCaptureRequired() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = true;
            if (this.mCameraConfig.getUseCaseCombinationRequiredRule() != 1) {
                z17 = false;
            }
        }
        return z17;
    }

    private static boolean isExtraImageCaptureRequired(java.util.Collection<androidx.camera.core.UseCase> collection) {
        boolean z17 = false;
        boolean z18 = false;
        for (androidx.camera.core.UseCase useCase : collection) {
            if (isPreview(useCase) || androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase)) {
                z17 = true;
            } else if (isImageCapture(useCase)) {
                z18 = true;
            }
        }
        return z17 && !z18;
    }

    private static boolean isExtraPreviewRequired(java.util.Collection<androidx.camera.core.UseCase> collection) {
        boolean z17 = false;
        boolean z18 = false;
        for (androidx.camera.core.UseCase useCase : collection) {
            if (isPreview(useCase) || androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase)) {
                z18 = true;
            } else if (isImageCapture(useCase)) {
                z17 = true;
            }
        }
        return z17 && !z18;
    }

    private static boolean isImageCapture(androidx.camera.core.UseCase useCase) {
        return useCase instanceof androidx.camera.core.ImageCapture;
    }

    private static boolean isNotSdr(androidx.camera.core.DynamicRange dynamicRange) {
        return (dynamicRange.getBitDepth() == 10) || (dynamicRange.getEncoding() != 1 && dynamicRange.getEncoding() != 0);
    }

    private static boolean isPreview(androidx.camera.core.UseCase useCase) {
        return useCase instanceof androidx.camera.core.Preview;
    }

    public static boolean isStreamSharingChildrenCombinationValid(java.util.Collection<androidx.camera.core.UseCase> collection) {
        int[] iArr = {1, 2, 4};
        java.util.HashSet hashSet = new java.util.HashSet();
        for (androidx.camera.core.UseCase useCase : collection) {
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = iArr[i17];
                if (useCase.isEffectTargetsSupported(i18)) {
                    if (hashSet.contains(java.lang.Integer.valueOf(i18))) {
                        return false;
                    }
                    hashSet.add(java.lang.Integer.valueOf(i18));
                }
            }
        }
        return true;
    }

    private static boolean isVideoCapture(androidx.camera.core.UseCase useCase) {
        if (useCase != null) {
            if (useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                return useCase.getCurrentConfig().getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            }
            useCase.toString();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createExtraPreview$0(android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture, androidx.camera.core.SurfaceRequest.Result result) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createExtraPreview$1(androidx.camera.core.SurfaceRequest surfaceRequest) {
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new m3.a() { // from class: androidx.camera.core.internal.CameraUseCaseAdapter$$a
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.internal.CameraUseCaseAdapter.lambda$createExtraPreview$0(surface, surfaceTexture, (androidx.camera.core.SurfaceRequest.Result) obj);
            }
        });
    }

    private void restoreInteropConfig() {
        synchronized (this.mLock) {
            if (this.mInteropConfig != null) {
                this.mCameraInternal.getCameraControlInternal().addInteropConfig(this.mInteropConfig);
            }
        }
    }

    private static java.util.List<androidx.camera.core.CameraEffect> setEffectsOnUseCases(java.util.List<androidx.camera.core.CameraEffect> list, java.util.Collection<androidx.camera.core.UseCase> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (androidx.camera.core.UseCase useCase : collection) {
            useCase.setEffect(null);
            for (androidx.camera.core.CameraEffect cameraEffect : list) {
                if (useCase.isEffectTargetsSupported(cameraEffect.getTargets())) {
                    m3.h.e(useCase.getEffect() == null, useCase + " already has effect" + useCase.getEffect());
                    useCase.setEffect(cameraEffect);
                    arrayList.remove(cameraEffect);
                }
            }
        }
        return arrayList;
    }

    public static void updateEffects(java.util.List<androidx.camera.core.CameraEffect> list, java.util.Collection<androidx.camera.core.UseCase> collection, java.util.Collection<androidx.camera.core.UseCase> collection2) {
        java.util.List<androidx.camera.core.CameraEffect> effectsOnUseCases = setEffectsOnUseCases(list, collection);
        java.util.ArrayList arrayList = new java.util.ArrayList(collection2);
        arrayList.removeAll(collection);
        java.util.List<androidx.camera.core.CameraEffect> effectsOnUseCases2 = setEffectsOnUseCases(effectsOnUseCases, arrayList);
        if (effectsOnUseCases2.size() > 0) {
            androidx.camera.core.Logger.w(TAG, "Unused effects: " + effectsOnUseCases2);
        }
    }

    private void updateViewPortAndSensorToBufferMatrix(java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> map, java.util.Collection<androidx.camera.core.UseCase> collection) {
        synchronized (this.mLock) {
            if (this.mViewPort != null && !collection.isEmpty()) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(this.mCameraInternal.getCameraInfoInternal().getLensFacing());
                boolean z17 = true;
                if (valueOf == null) {
                    androidx.camera.core.Logger.w(TAG, "The lens facing is null, probably an external.");
                } else if (valueOf.intValue() != 0) {
                    z17 = false;
                }
                java.util.Map<androidx.camera.core.UseCase, android.graphics.Rect> calculateViewPortRects = androidx.camera.core.internal.ViewPorts.calculateViewPortRects(this.mCameraInternal.getCameraControlInternal().getSensorRect(), z17, this.mViewPort.getAspectRatio(), this.mCameraInternal.getCameraInfoInternal().getSensorRotationDegrees(this.mViewPort.getRotation()), this.mViewPort.getScaleType(), this.mViewPort.getLayoutDirection(), map);
                for (androidx.camera.core.UseCase useCase : collection) {
                    android.graphics.Rect rect = calculateViewPortRects.get(useCase);
                    rect.getClass();
                    useCase.setViewPortCropRect(rect);
                }
            }
            for (androidx.camera.core.UseCase useCase2 : collection) {
                android.graphics.Rect sensorRect = this.mCameraInternal.getCameraControlInternal().getSensorRect();
                androidx.camera.core.impl.StreamSpec streamSpec = map.get(useCase2);
                streamSpec.getClass();
                useCase2.setSensorToBufferTransformMatrix(calculateSensorToBufferTransformMatrix(sensorRect, streamSpec.getResolution()));
            }
        }
    }

    public void addUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        synchronized (this.mLock) {
            this.mCameraInternal.setExtendedConfig(this.mCameraConfig);
            androidx.camera.core.impl.CameraInternal cameraInternal = this.mSecondaryCameraInternal;
            if (cameraInternal != null) {
                cameraInternal.setExtendedConfig(this.mCameraConfig);
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.mAppUseCases);
            linkedHashSet.addAll(collection);
            try {
                androidx.camera.core.impl.CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                boolean z17 = true;
                boolean z18 = cameraInternal2 != null;
                if (cameraInternal2 == null) {
                    z17 = false;
                }
                updateUseCases(linkedHashSet, z18, z17);
            } catch (java.lang.IllegalArgumentException e17) {
                throw new androidx.camera.core.internal.CameraUseCaseAdapter.CameraException(e17);
            }
        }
    }

    public void attachUseCases() {
        synchronized (this.mLock) {
            if (!this.mAttached) {
                if (!this.mCameraUseCases.isEmpty()) {
                    this.mCameraInternal.setExtendedConfig(this.mCameraConfig);
                    androidx.camera.core.impl.CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                    if (cameraInternal != null) {
                        cameraInternal.setExtendedConfig(this.mCameraConfig);
                    }
                }
                this.mCameraInternal.attachUseCases(this.mCameraUseCases);
                androidx.camera.core.impl.CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                if (cameraInternal2 != null) {
                    cameraInternal2.attachUseCases(this.mCameraUseCases);
                }
                restoreInteropConfig();
                java.util.Iterator<androidx.camera.core.UseCase> it = this.mCameraUseCases.iterator();
                while (it.hasNext()) {
                    it.next().notifyState();
                }
                this.mAttached = true;
            }
        }
    }

    public void detachUseCases() {
        synchronized (this.mLock) {
            if (this.mAttached) {
                this.mCameraInternal.detachUseCases(new java.util.ArrayList(this.mCameraUseCases));
                androidx.camera.core.impl.CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                if (cameraInternal != null) {
                    cameraInternal.detachUseCases(new java.util.ArrayList(this.mCameraUseCases));
                }
                cacheInteropConfig();
                this.mAttached = false;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.CameraControl getCameraControl() {
        return this.mAdapterCameraControl;
    }

    public androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId() {
        return this.mId;
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.CameraInfo getCameraInfo() {
        return this.mAdapterCameraInfo;
    }

    public java.util.Collection<androidx.camera.core.UseCase> getCameraUseCases() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mCameraUseCases);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.impl.CameraConfig getExtendedConfig() {
        androidx.camera.core.impl.CameraConfig cameraConfig;
        synchronized (this.mLock) {
            cameraConfig = this.mCameraConfig;
        }
        return cameraConfig;
    }

    public androidx.camera.core.CameraInfo getSecondaryCameraInfo() {
        return this.mAdapterSecondaryCameraInfo;
    }

    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mAppUseCases);
        }
        return arrayList;
    }

    public boolean isEquivalent(androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter) {
        return getCameraId().equals(cameraUseCaseAdapter.getCameraId());
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(boolean z17, androidx.camera.core.UseCase... useCaseArr) {
        java.util.Collection<androidx.camera.core.UseCase> asList = java.util.Arrays.asList(useCaseArr);
        if (z17) {
            asList = calculateCameraUseCases(asList, null, createOrReuseStreamSharing(asList, true));
        }
        java.util.Collection<androidx.camera.core.UseCase> collection = asList;
        synchronized (this.mLock) {
            try {
                try {
                    calculateSuggestedStreamSpecs(getCameraMode(), this.mCameraInternal.getCameraInfoInternal(), collection, java.util.Collections.emptyList(), getConfigs(collection, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory));
                } catch (java.lang.IllegalArgumentException unused) {
                    return false;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return true;
    }

    public void removeUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        synchronized (this.mLock) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.mAppUseCases);
            linkedHashSet.removeAll(collection);
            androidx.camera.core.impl.CameraInternal cameraInternal = this.mSecondaryCameraInternal;
            boolean z17 = true;
            boolean z18 = cameraInternal != null;
            if (cameraInternal == null) {
                z17 = false;
            }
            updateUseCases(linkedHashSet, z18, z17);
        }
    }

    public void setActiveResumingMode(boolean z17) {
        this.mCameraInternal.setActiveResumingMode(z17);
    }

    public void setEffects(java.util.List<androidx.camera.core.CameraEffect> list) {
        synchronized (this.mLock) {
            this.mEffects = list;
        }
    }

    public void setViewPort(androidx.camera.core.ViewPort viewPort) {
        synchronized (this.mLock) {
            this.mViewPort = viewPort;
        }
    }

    public void updateUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        updateUseCases(collection, false, false);
    }

    public void updateUseCases(java.util.Collection<androidx.camera.core.UseCase> collection, boolean z17, boolean z18) {
        java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> map;
        androidx.camera.core.impl.StreamSpec streamSpec;
        androidx.camera.core.impl.Config implementationOptions;
        synchronized (this.mLock) {
            checkUnsupportedFeatureCombinationAndThrow(collection);
            if (!z17 && hasExtension() && hasVideoCapture(collection)) {
                updateUseCases(collection, true, z18);
                return;
            }
            androidx.camera.core.streamsharing.StreamSharing createOrReuseStreamSharing = createOrReuseStreamSharing(collection, z17);
            androidx.camera.core.UseCase calculatePlaceholderForExtensions = calculatePlaceholderForExtensions(collection, createOrReuseStreamSharing);
            java.util.Collection<androidx.camera.core.UseCase> calculateCameraUseCases = calculateCameraUseCases(collection, calculatePlaceholderForExtensions, createOrReuseStreamSharing);
            java.util.ArrayList arrayList = new java.util.ArrayList(calculateCameraUseCases);
            arrayList.removeAll(this.mCameraUseCases);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(calculateCameraUseCases);
            arrayList2.retainAll(this.mCameraUseCases);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(this.mCameraUseCases);
            arrayList3.removeAll(calculateCameraUseCases);
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> configs = getConfigs(arrayList, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory);
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> emptyMap = java.util.Collections.emptyMap();
            try {
                java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> map2 = configs;
                java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> calculateSuggestedStreamSpecs = calculateSuggestedStreamSpecs(getCameraMode(), this.mCameraInternal.getCameraInfoInternal(), arrayList, arrayList2, map2);
                if (this.mSecondaryCameraInternal != null) {
                    int cameraMode = getCameraMode();
                    androidx.camera.core.impl.CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                    java.util.Objects.requireNonNull(cameraInternal);
                    map = calculateSuggestedStreamSpecs;
                    emptyMap = calculateSuggestedStreamSpecs(cameraMode, cameraInternal.getCameraInfoInternal(), arrayList, arrayList2, map2);
                } else {
                    map = calculateSuggestedStreamSpecs;
                }
                java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> map3 = emptyMap;
                updateViewPortAndSensorToBufferMatrix(map, calculateCameraUseCases);
                updateEffects(this.mEffects, calculateCameraUseCases, collection);
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.UseCase) it.next()).unbindFromCamera(this.mCameraInternal);
                }
                this.mCameraInternal.detachUseCases(arrayList3);
                if (this.mSecondaryCameraInternal != null) {
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        androidx.camera.core.UseCase useCase = (androidx.camera.core.UseCase) it6.next();
                        androidx.camera.core.impl.CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                        java.util.Objects.requireNonNull(cameraInternal2);
                        useCase.unbindFromCamera(cameraInternal2);
                    }
                    androidx.camera.core.impl.CameraInternal cameraInternal3 = this.mSecondaryCameraInternal;
                    java.util.Objects.requireNonNull(cameraInternal3);
                    cameraInternal3.detachUseCases(arrayList3);
                }
                if (arrayList3.isEmpty()) {
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        androidx.camera.core.UseCase useCase2 = (androidx.camera.core.UseCase) it7.next();
                        if (map.containsKey(useCase2) && (implementationOptions = (streamSpec = map.get(useCase2)).getImplementationOptions()) != null && hasImplementationOptionChanged(streamSpec, useCase2.getSessionConfig())) {
                            useCase2.updateSuggestedStreamSpecImplementationOptions(implementationOptions);
                            if (this.mAttached) {
                                this.mCameraInternal.onUseCaseUpdated(useCase2);
                                androidx.camera.core.impl.CameraInternal cameraInternal4 = this.mSecondaryCameraInternal;
                                if (cameraInternal4 != null) {
                                    java.util.Objects.requireNonNull(cameraInternal4);
                                    cameraInternal4.onUseCaseUpdated(useCase2);
                                }
                            }
                        }
                    }
                }
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    androidx.camera.core.UseCase useCase3 = (androidx.camera.core.UseCase) it8.next();
                    java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> map4 = map2;
                    androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = map4.get(useCase3);
                    java.util.Objects.requireNonNull(configPair);
                    androidx.camera.core.impl.CameraInternal cameraInternal5 = this.mSecondaryCameraInternal;
                    if (cameraInternal5 != null) {
                        androidx.camera.core.impl.CameraInternal cameraInternal6 = this.mCameraInternal;
                        java.util.Objects.requireNonNull(cameraInternal5);
                        useCase3.bindToCamera(cameraInternal6, cameraInternal5, configPair.mExtendedConfig, configPair.mCameraConfig);
                        androidx.camera.core.impl.StreamSpec streamSpec2 = map.get(useCase3);
                        streamSpec2.getClass();
                        useCase3.updateSuggestedStreamSpec(streamSpec2, map3.get(useCase3));
                    } else {
                        useCase3.bindToCamera(this.mCameraInternal, null, configPair.mExtendedConfig, configPair.mCameraConfig);
                        androidx.camera.core.impl.StreamSpec streamSpec3 = map.get(useCase3);
                        streamSpec3.getClass();
                        useCase3.updateSuggestedStreamSpec(streamSpec3, null);
                    }
                    map2 = map4;
                }
                if (this.mAttached) {
                    this.mCameraInternal.attachUseCases(arrayList);
                    androidx.camera.core.impl.CameraInternal cameraInternal7 = this.mSecondaryCameraInternal;
                    if (cameraInternal7 != null) {
                        java.util.Objects.requireNonNull(cameraInternal7);
                        cameraInternal7.attachUseCases(arrayList);
                    }
                }
                java.util.Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    ((androidx.camera.core.UseCase) it9.next()).notifyState();
                }
                this.mAppUseCases.clear();
                this.mAppUseCases.addAll(collection);
                this.mCameraUseCases.clear();
                this.mCameraUseCases.addAll(calculateCameraUseCases);
                this.mPlaceholderForExtensions = calculatePlaceholderForExtensions;
                this.mStreamSharing = createOrReuseStreamSharing;
            } catch (java.lang.IllegalArgumentException e17) {
                if (!z17 && !hasExtension() && this.mCameraCoordinator.getCameraOperatingMode() != 2) {
                    updateUseCases(collection, true, z18);
                    return;
                }
                throw e17;
            }
        }
    }

    public CameraUseCaseAdapter(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.impl.RestrictedCameraInfo restrictedCameraInfo, androidx.camera.core.impl.RestrictedCameraInfo restrictedCameraInfo2, androidx.camera.core.LayoutSettings layoutSettings, androidx.camera.core.LayoutSettings layoutSettings2, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        this.mAppUseCases = new java.util.ArrayList();
        this.mCameraUseCases = new java.util.ArrayList();
        this.mEffects = java.util.Collections.emptyList();
        this.mLock = new java.lang.Object();
        this.mAttached = true;
        this.mInteropConfig = null;
        this.mCameraInternal = cameraInternal;
        this.mSecondaryCameraInternal = cameraInternal2;
        this.mLayoutSettings = layoutSettings;
        this.mSecondaryLayoutSettings = layoutSettings2;
        this.mCameraCoordinator = cameraCoordinator;
        this.mCameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        androidx.camera.core.impl.CameraConfig cameraConfig = restrictedCameraInfo.getCameraConfig();
        this.mCameraConfig = cameraConfig;
        this.mAdapterCameraControl = new androidx.camera.core.impl.RestrictedCameraControl(cameraInternal.getCameraControlInternal(), cameraConfig.getSessionProcessor(null));
        this.mAdapterCameraInfo = restrictedCameraInfo;
        this.mAdapterSecondaryCameraInfo = restrictedCameraInfo2;
        this.mId = generateCameraId(restrictedCameraInfo, restrictedCameraInfo2);
    }
}
