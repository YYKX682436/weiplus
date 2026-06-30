package androidx.camera.core.streamsharing;

/* loaded from: classes14.dex */
public class StreamSharing extends androidx.camera.core.UseCase {
    private static final java.lang.String TAG = "StreamSharing";
    private androidx.camera.core.processing.SurfaceEdge mCameraEdge;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private final androidx.camera.core.streamsharing.StreamSharingConfig mDefaultConfig;
    private androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode mDualSharingNode;
    private androidx.camera.core.processing.SurfaceProcessorNode mEffectNode;
    private final androidx.camera.core.LayoutSettings mLayoutSettings;
    private androidx.camera.core.processing.SurfaceEdge mSecondaryCameraEdge;
    private final androidx.camera.core.LayoutSettings mSecondaryLayoutSettings;
    androidx.camera.core.impl.SessionConfig.Builder mSecondarySessionConfigBuilder;
    private androidx.camera.core.processing.SurfaceEdge mSecondarySharingInputEdge;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private androidx.camera.core.processing.SurfaceEdge mSharingInputEdge;
    private androidx.camera.core.processing.SurfaceProcessorNode mSharingNode;
    private final androidx.camera.core.streamsharing.VirtualCameraAdapter mVirtualCameraAdapter;

    /* loaded from: classes14.dex */
    public interface Control {
        wa.a jpegSnapshot(int i17, int i18);
    }

    public StreamSharing(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.LayoutSettings layoutSettings, androidx.camera.core.LayoutSettings layoutSettings2, java.util.Set<androidx.camera.core.UseCase> set, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        super(getDefaultConfig(set));
        this.mDefaultConfig = getDefaultConfig(set);
        this.mLayoutSettings = layoutSettings;
        this.mSecondaryLayoutSettings = layoutSettings2;
        this.mVirtualCameraAdapter = new androidx.camera.core.streamsharing.VirtualCameraAdapter(cameraInternal, cameraInternal2, set, useCaseConfigFactory, new androidx.camera.core.streamsharing.StreamSharing.Control() { // from class: androidx.camera.core.streamsharing.StreamSharing$$a
            @Override // androidx.camera.core.streamsharing.StreamSharing.Control
            public final wa.a jpegSnapshot(int i17, int i18) {
                wa.a lambda$new$0;
                lambda$new$0 = androidx.camera.core.streamsharing.StreamSharing.this.lambda$new$0(i17, i18);
                return lambda$new$0;
            }
        });
    }

    private void addCameraErrorListener(androidx.camera.core.impl.SessionConfig.Builder builder, final java.lang.String str, final java.lang.String str2, final androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, final androidx.camera.core.impl.StreamSpec streamSpec, final androidx.camera.core.impl.StreamSpec streamSpec2) {
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.streamsharing.StreamSharing$$b
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.core.streamsharing.StreamSharing.this.lambda$addCameraErrorListener$1(str, str2, useCaseConfig, streamSpec, streamSpec2, sessionConfig, sessionError);
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
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge2 = this.mSecondaryCameraEdge;
        if (surfaceEdge2 != null) {
            surfaceEdge2.close();
            this.mSecondaryCameraEdge = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge3 = this.mSharingInputEdge;
        if (surfaceEdge3 != null) {
            surfaceEdge3.close();
            this.mSharingInputEdge = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge4 = this.mSecondarySharingInputEdge;
        if (surfaceEdge4 != null) {
            surfaceEdge4.close();
            this.mSecondarySharingInputEdge = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = this.mSharingNode;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.mSharingNode = null;
        }
        androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode dualSurfaceProcessorNode = this.mDualSharingNode;
        if (dualSurfaceProcessorNode != null) {
            dualSurfaceProcessorNode.release();
            this.mDualSharingNode = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode2 = this.mEffectNode;
        if (surfaceProcessorNode2 != null) {
            surfaceProcessorNode2.release();
            this.mEffectNode = null;
        }
    }

    private java.util.List<androidx.camera.core.impl.SessionConfig> createPipelineAndUpdateChildrenSpecs(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (streamSpec2 == null) {
            createPrimaryCamera(str, str2, useCaseConfig, streamSpec, null);
            androidx.camera.core.impl.CameraInternal camera = getCamera();
            java.util.Objects.requireNonNull(camera);
            this.mSharingNode = getSharingNode(camera, streamSpec);
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.util.OutConfig> childrenOutConfigs = this.mVirtualCameraAdapter.getChildrenOutConfigs(this.mSharingInputEdge, getTargetRotationInternal(), getViewPortCropRect() != null);
            androidx.camera.core.processing.SurfaceProcessorNode.Out transform = this.mSharingNode.transform(androidx.camera.core.processing.SurfaceProcessorNode.In.of(this.mSharingInputEdge, new java.util.ArrayList(childrenOutConfigs.values())));
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.util.Map.Entry<androidx.camera.core.UseCase, androidx.camera.core.processing.util.OutConfig> entry : childrenOutConfigs.entrySet()) {
                hashMap.put(entry.getKey(), transform.get(entry.getValue()));
            }
            this.mVirtualCameraAdapter.setChildrenEdges(hashMap);
            java.lang.Object[] objArr = {this.mSessionConfigBuilder.build()};
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            java.lang.Object obj = objArr[0];
            java.util.Objects.requireNonNull(obj);
            arrayList.add(obj);
            return java.util.Collections.unmodifiableList(arrayList);
        }
        createPrimaryCamera(str, str2, useCaseConfig, streamSpec, streamSpec2);
        createSecondaryCamera(str, str2, useCaseConfig, streamSpec, streamSpec2);
        this.mDualSharingNode = getDualSharingNode(getCamera(), getSecondaryCamera(), streamSpec, this.mLayoutSettings, this.mSecondaryLayoutSettings);
        java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.concurrent.DualOutConfig> childrenOutConfigs2 = this.mVirtualCameraAdapter.getChildrenOutConfigs(this.mSharingInputEdge, this.mSecondarySharingInputEdge, getTargetRotationInternal(), getViewPortCropRect() != null);
        androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out transform2 = this.mDualSharingNode.transform(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In.of(this.mSharingInputEdge, this.mSecondarySharingInputEdge, new java.util.ArrayList(childrenOutConfigs2.values())));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry<androidx.camera.core.UseCase, androidx.camera.core.processing.concurrent.DualOutConfig> entry2 : childrenOutConfigs2.entrySet()) {
            hashMap2.put(entry2.getKey(), transform2.get(entry2.getValue()));
        }
        this.mVirtualCameraAdapter.setChildrenEdges(hashMap2);
        java.lang.Object[] objArr2 = {this.mSessionConfigBuilder.build(), this.mSecondarySessionConfigBuilder.build()};
        java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.Object obj2 = objArr2[i17];
            java.util.Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return java.util.Collections.unmodifiableList(arrayList2);
    }

    private void createPrimaryCamera(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        android.graphics.Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        java.util.Objects.requireNonNull(camera);
        boolean hasTransform = camera.getHasTransform();
        android.graphics.Rect cropRect = getCropRect(streamSpec.getResolution());
        java.util.Objects.requireNonNull(cropRect);
        androidx.camera.core.impl.CameraInternal camera2 = getCamera();
        java.util.Objects.requireNonNull(camera2);
        int relativeRotation = getRelativeRotation(camera2);
        androidx.camera.core.impl.CameraInternal camera3 = getCamera();
        java.util.Objects.requireNonNull(camera3);
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = new androidx.camera.core.processing.SurfaceEdge(3, 34, streamSpec, sensorToBufferTransformMatrix, hasTransform, cropRect, relativeRotation, -1, isMirroringRequired(camera3));
        this.mCameraEdge = surfaceEdge;
        androidx.camera.core.impl.CameraInternal camera4 = getCamera();
        java.util.Objects.requireNonNull(camera4);
        this.mSharingInputEdge = getSharingInputEdge(surfaceEdge, camera4);
        androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder = createSessionConfigBuilder(this.mCameraEdge, useCaseConfig, streamSpec);
        this.mSessionConfigBuilder = createSessionConfigBuilder;
        addCameraErrorListener(createSessionConfigBuilder, str, str2, useCaseConfig, streamSpec, streamSpec2);
    }

    private void createSecondaryCamera(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        android.graphics.Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        androidx.camera.core.impl.CameraInternal secondaryCamera = getSecondaryCamera();
        java.util.Objects.requireNonNull(secondaryCamera);
        boolean hasTransform = secondaryCamera.getHasTransform();
        android.graphics.Rect cropRect = getCropRect(streamSpec2.getResolution());
        java.util.Objects.requireNonNull(cropRect);
        androidx.camera.core.impl.CameraInternal secondaryCamera2 = getSecondaryCamera();
        java.util.Objects.requireNonNull(secondaryCamera2);
        int relativeRotation = getRelativeRotation(secondaryCamera2);
        androidx.camera.core.impl.CameraInternal secondaryCamera3 = getSecondaryCamera();
        java.util.Objects.requireNonNull(secondaryCamera3);
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = new androidx.camera.core.processing.SurfaceEdge(3, 34, streamSpec2, sensorToBufferTransformMatrix, hasTransform, cropRect, relativeRotation, -1, isMirroringRequired(secondaryCamera3));
        this.mSecondaryCameraEdge = surfaceEdge;
        androidx.camera.core.impl.CameraInternal secondaryCamera4 = getSecondaryCamera();
        java.util.Objects.requireNonNull(secondaryCamera4);
        this.mSecondarySharingInputEdge = getSharingInputEdge(surfaceEdge, secondaryCamera4);
        androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder = createSessionConfigBuilder(this.mSecondaryCameraEdge, useCaseConfig, streamSpec2);
        this.mSecondarySessionConfigBuilder = createSessionConfigBuilder;
        addCameraErrorListener(createSessionConfigBuilder, str, str2, useCaseConfig, streamSpec, streamSpec2);
    }

    private androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(useCaseConfig, streamSpec.getResolution());
        propagateChildrenTemplate(createFrom);
        propagateChildrenCamera2Interop(streamSpec.getResolution(), createFrom);
        createFrom.addSurface(surfaceEdge.getDeferrableSurface(), streamSpec.getDynamicRange(), null, -1);
        createFrom.addRepeatingCameraCaptureCallback(this.mVirtualCameraAdapter.getParentMetadataCallback());
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return createFrom;
    }

    public static java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes(androidx.camera.core.UseCase useCase) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (isStreamSharing(useCase)) {
            java.util.Iterator<androidx.camera.core.UseCase> it = ((androidx.camera.core.streamsharing.StreamSharing) useCase).getChildren().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getCurrentConfig().getCaptureType());
            }
        } else {
            arrayList.add(useCase.getCurrentConfig().getCaptureType());
        }
        return arrayList;
    }

    private static int getChildTemplate(androidx.camera.core.UseCase useCase) {
        return useCase.getCurrentConfig().getDefaultSessionConfig().getTemplateType();
    }

    private android.graphics.Rect getCropRect(android.util.Size size) {
        return getViewPortCropRect() != null ? getViewPortCropRect() : new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private android.graphics.Rect getCropRectAppliedByEffect(androidx.camera.core.processing.SurfaceEdge surfaceEdge) {
        androidx.camera.core.CameraEffect effect = getEffect();
        effect.getClass();
        return effect.getTransformation() == 1 ? androidx.camera.core.impl.utils.TransformUtils.sizeToRect(surfaceEdge.getStreamSpec().getResolution()) : surfaceEdge.getCropRect();
    }

    private static androidx.camera.core.streamsharing.StreamSharingConfig getDefaultConfig(java.util.Set<androidx.camera.core.UseCase> set) {
        androidx.camera.core.impl.MutableConfig mutableConfig = new androidx.camera.core.streamsharing.StreamSharingBuilder().getMutableConfig();
        mutableConfig.insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.UseCase useCase : set) {
            if (useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                arrayList.add(useCase.getCurrentConfig().getCaptureType());
            }
        }
        mutableConfig.insertOption(androidx.camera.core.streamsharing.StreamSharingConfig.OPTION_CAPTURE_TYPES, arrayList);
        mutableConfig.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE, 2);
        return new androidx.camera.core.streamsharing.StreamSharingConfig(androidx.camera.core.impl.OptionsBundle.from(mutableConfig));
    }

    private androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode getDualSharingNode(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.LayoutSettings layoutSettings, androidx.camera.core.LayoutSettings layoutSettings2) {
        return new androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode(cameraInternal, cameraInternal2, androidx.camera.core.processing.concurrent.DualSurfaceProcessor.Factory.newInstance(streamSpec.getDynamicRange(), layoutSettings, layoutSettings2));
    }

    private boolean getMirroringAppliedByEffect() {
        androidx.camera.core.CameraEffect effect = getEffect();
        effect.getClass();
        if (effect.getTransformation() != 1) {
            return false;
        }
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        camera.getClass();
        return camera.isFrontFacing() && camera.getHasTransform();
    }

    private int getRotationAppliedByEffect() {
        androidx.camera.core.CameraEffect effect = getEffect();
        effect.getClass();
        if (effect.getTransformation() != 1) {
            return 0;
        }
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        camera.getClass();
        return getRelativeRotation(camera);
    }

    private androidx.camera.core.processing.SurfaceEdge getSharingInputEdge(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.CameraInternal cameraInternal) {
        if (getEffect() == null || getEffect().getTransformation() == 2 || getEffect().getOutputOption() == 1) {
            return surfaceEdge;
        }
        this.mEffectNode = new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, getEffect().createSurfaceProcessorInternal());
        int rotationAppliedByEffect = getRotationAppliedByEffect();
        android.graphics.Rect cropRectAppliedByEffect = getCropRectAppliedByEffect(surfaceEdge);
        androidx.camera.core.processing.util.OutConfig of6 = androidx.camera.core.processing.util.OutConfig.of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), cropRectAppliedByEffect, androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(cropRectAppliedByEffect, rotationAppliedByEffect), rotationAppliedByEffect, getMirroringAppliedByEffect(), true);
        androidx.camera.core.processing.SurfaceEdge surfaceEdge2 = this.mEffectNode.transform(androidx.camera.core.processing.SurfaceProcessorNode.In.of(surfaceEdge, java.util.Collections.singletonList(of6))).get(of6);
        java.util.Objects.requireNonNull(surfaceEdge2);
        return surfaceEdge2;
    }

    private androidx.camera.core.processing.SurfaceProcessorNode getSharingNode(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.StreamSpec streamSpec) {
        if (getEffect() != null && getEffect().getOutputOption() == 1) {
            androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, getEffect().createSurfaceProcessorInternal());
            this.mEffectNode = surfaceProcessorNode;
            return surfaceProcessorNode;
        }
        return new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.newInstance(streamSpec.getDynamicRange()));
    }

    public static boolean isStreamSharing(androidx.camera.core.UseCase useCase) {
        return useCase instanceof androidx.camera.core.streamsharing.StreamSharing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addCameraErrorListener$1(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.UseCaseConfig useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        if (getCamera() == null) {
            return;
        }
        clearPipeline();
        updateSessionConfig(createPipelineAndUpdateChildrenSpecs(str, str2, useCaseConfig, streamSpec, streamSpec2));
        notifyReset();
        this.mVirtualCameraAdapter.resetChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wa.a lambda$new$0(int i17, int i18) {
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = this.mSharingNode;
        return surfaceProcessorNode != null ? surfaceProcessorNode.getSurfaceProcessor().snapshot(i17, i18) : androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.Exception("Failed to take picture: pipeline is not ready."));
    }

    private void propagateChildrenCamera2Interop(android.util.Size size, androidx.camera.core.impl.SessionConfig.Builder builder) {
        java.util.Iterator<androidx.camera.core.UseCase> it = getChildren().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.SessionConfig build = androidx.camera.core.impl.SessionConfig.Builder.createFrom(it.next().getCurrentConfig(), size).build();
            builder.addAllRepeatingCameraCaptureCallbacks(build.getRepeatingCameraCaptureCallbacks());
            builder.addAllCameraCaptureCallbacks(build.getSingleCameraCaptureCallbacks());
            builder.addAllSessionStateCallbacks(build.getSessionStateCallbacks());
            builder.addAllDeviceStateCallbacks(build.getDeviceStateCallbacks());
            builder.addImplementationOptions(build.getImplementationOptions());
        }
    }

    private void propagateChildrenTemplate(androidx.camera.core.impl.SessionConfig.Builder builder) {
        java.util.Iterator<androidx.camera.core.UseCase> it = getChildren().iterator();
        int i17 = -1;
        while (it.hasNext()) {
            i17 = androidx.camera.core.impl.SessionConfig.getHigherPriorityTemplateType(i17, getChildTemplate(it.next()));
        }
        if (i17 != -1) {
            builder.setTemplateType(i17);
        }
    }

    public androidx.camera.core.processing.SurfaceEdge getCameraEdge() {
        return this.mCameraEdge;
    }

    public java.util.Set<androidx.camera.core.UseCase> getChildren() {
        return this.mVirtualCameraAdapter.getChildren();
    }

    @Override // androidx.camera.core.UseCase
    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return new androidx.camera.core.streamsharing.StreamSharingBuilder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
    }

    public androidx.camera.core.streamsharing.VirtualCameraAdapter getVirtualCameraAdapter() {
        return this.mVirtualCameraAdapter;
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        super.onBind();
        this.mVirtualCameraAdapter.bindChildren();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        this.mVirtualCameraAdapter.mergeChildrenConfigs(builder.getMutableConfig());
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateAttached() {
        super.onStateAttached();
        this.mVirtualCameraAdapter.notifyStateAttached();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        super.onStateDetached();
        this.mVirtualCameraAdapter.notifyStateDetached();
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
        updateSessionConfig(createPipelineAndUpdateChildrenSpecs(getCameraId(), getSecondaryCameraId(), getCurrentConfig(), streamSpec, streamSpec2));
        notifyActive();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        super.onUnbind();
        clearPipeline();
        this.mVirtualCameraAdapter.unbindChildren();
    }

    public androidx.camera.core.processing.SurfaceProcessorNode getSharingNode() {
        return this.mSharingNode;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z17, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(this.mDefaultConfig.getCaptureType(), 1);
        if (z17) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, this.mDefaultConfig.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public androidx.camera.core.processing.SurfaceEdge getSharingInputEdge() {
        return this.mSharingInputEdge;
    }
}
