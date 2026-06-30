package androidx.camera.core.streamsharing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class VirtualCameraAdapter implements androidx.camera.core.UseCase.StateChangeCallback {
    final java.util.Set<androidx.camera.core.UseCase> mChildren;
    private final java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> mChildrenConfigs;
    private final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.UseCaseConfig<?>> mChildrenConfigsMap;
    private final androidx.camera.core.impl.CameraInternal mParentCamera;
    private final androidx.camera.core.streamsharing.ResolutionsMerger mResolutionsMerger;
    private final androidx.camera.core.impl.CameraInternal mSecondaryParentCamera;
    private androidx.camera.core.streamsharing.ResolutionsMerger mSecondaryResolutionsMerger;
    private final androidx.camera.core.impl.UseCaseConfigFactory mUseCaseConfigFactory;
    final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> mChildrenEdges = new java.util.HashMap();
    private final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.streamsharing.VirtualCamera> mChildrenVirtualCameras = new java.util.HashMap();
    final java.util.Map<androidx.camera.core.UseCase, java.lang.Boolean> mChildrenActiveState = new java.util.HashMap();
    private final androidx.camera.core.impl.CameraCaptureCallback mParentMetadataCallback = createCameraCaptureCallback();

    public VirtualCameraAdapter(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, java.util.Set<androidx.camera.core.UseCase> set, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.streamsharing.StreamSharing.Control control) {
        this.mParentCamera = cameraInternal;
        this.mSecondaryParentCamera = cameraInternal2;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        this.mChildren = set;
        java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.UseCaseConfig<?>> childrenConfigsMap = toChildrenConfigsMap(cameraInternal, set, useCaseConfigFactory);
        this.mChildrenConfigsMap = childrenConfigsMap;
        java.util.HashSet hashSet = new java.util.HashSet(childrenConfigsMap.values());
        this.mChildrenConfigs = hashSet;
        this.mResolutionsMerger = new androidx.camera.core.streamsharing.ResolutionsMerger(cameraInternal, hashSet);
        if (cameraInternal2 != null) {
            this.mSecondaryResolutionsMerger = new androidx.camera.core.streamsharing.ResolutionsMerger(cameraInternal2, hashSet);
        }
        for (androidx.camera.core.UseCase useCase : set) {
            this.mChildrenActiveState.put(useCase, java.lang.Boolean.FALSE);
            this.mChildrenVirtualCameras.put(useCase, new androidx.camera.core.streamsharing.VirtualCamera(cameraInternal, this, control));
        }
    }

    private androidx.camera.core.processing.util.OutConfig calculateOutConfig(androidx.camera.core.UseCase useCase, androidx.camera.core.streamsharing.ResolutionsMerger resolutionsMerger, androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.processing.SurfaceEdge surfaceEdge, int i17, boolean z17) {
        int sensorRotationDegrees = cameraInternal.getCameraInfo().getSensorRotationDegrees(i17);
        boolean isMirrored = androidx.camera.core.impl.utils.TransformUtils.isMirrored(surfaceEdge.getSensorToBufferTransform());
        androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = this.mChildrenConfigsMap.get(useCase);
        java.util.Objects.requireNonNull(useCaseConfig);
        android.util.Pair<android.graphics.Rect, android.util.Size> preferredChildSizePair = resolutionsMerger.getPreferredChildSizePair(useCaseConfig, surfaceEdge.getCropRect(), androidx.camera.core.impl.utils.TransformUtils.getRotationDegrees(surfaceEdge.getSensorToBufferTransform()), z17);
        android.graphics.Rect rect = (android.graphics.Rect) preferredChildSizePair.first;
        android.util.Size size = (android.util.Size) preferredChildSizePair.second;
        int childRotationDegrees = getChildRotationDegrees(useCase, this.mParentCamera);
        androidx.camera.core.streamsharing.VirtualCamera virtualCamera = this.mChildrenVirtualCameras.get(useCase);
        java.util.Objects.requireNonNull(virtualCamera);
        virtualCamera.setRotationDegrees(childRotationDegrees);
        int within360 = androidx.camera.core.impl.utils.TransformUtils.within360((surfaceEdge.getRotationDegrees() + childRotationDegrees) - sensorRotationDegrees);
        return androidx.camera.core.processing.util.OutConfig.of(getChildTargetType(useCase), getChildFormat(useCase), rect, androidx.camera.core.impl.utils.TransformUtils.rotateSize(size, within360), within360, useCase.isMirroringRequired(cameraInternal) ^ isMirrored);
    }

    private static void forceSetProvider(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.core.impl.SessionConfig sessionConfig) {
        surfaceEdge.invalidate();
        try {
            surfaceEdge.setProvider(deferrableSurface);
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException unused) {
            if (sessionConfig.getErrorListener() != null) {
                sessionConfig.getErrorListener().onError(sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int getChildFormat(androidx.camera.core.UseCase useCase) {
        return useCase instanceof androidx.camera.core.ImageCapture ? 256 : 34;
    }

    private int getChildRotationDegrees(androidx.camera.core.UseCase useCase, androidx.camera.core.impl.CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfo().getSensorRotationDegrees(((androidx.camera.core.impl.ImageOutputConfig) useCase.getCurrentConfig()).getTargetRotation(0));
    }

    public static androidx.camera.core.impl.DeferrableSurface getChildSurface(androidx.camera.core.UseCase useCase) {
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = useCase instanceof androidx.camera.core.ImageCapture ? useCase.getSessionConfig().getSurfaces() : useCase.getSessionConfig().getRepeatingCaptureConfig().getSurfaces();
        m3.h.e(surfaces.size() <= 1, null);
        if (surfaces.size() == 1) {
            return surfaces.get(0);
        }
        return null;
    }

    private static int getChildTargetType(androidx.camera.core.UseCase useCase) {
        if (useCase instanceof androidx.camera.core.Preview) {
            return 1;
        }
        return useCase instanceof androidx.camera.core.ImageCapture ? 4 : 2;
    }

    private static int getHighestSurfacePriority(java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = set.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 = java.lang.Math.max(i17, it.next().getSurfaceOccupancyPriority(0));
        }
        return i17;
    }

    private androidx.camera.core.processing.SurfaceEdge getUseCaseEdge(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.mChildrenEdges.get(useCase);
        java.util.Objects.requireNonNull(surfaceEdge);
        return surfaceEdge;
    }

    private boolean isUseCaseActive(androidx.camera.core.UseCase useCase) {
        java.lang.Boolean bool = this.mChildrenActiveState.get(useCase);
        java.util.Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public static void sendCameraCaptureResultToChild(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult, androidx.camera.core.impl.SessionConfig sessionConfig, int i17) {
        java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = sessionConfig.getRepeatingCameraCaptureCallbacks().iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(i17, new androidx.camera.core.streamsharing.VirtualCameraCaptureResult(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), cameraCaptureResult));
        }
    }

    private static java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.UseCaseConfig<?>> toChildrenConfigsMap(androidx.camera.core.impl.CameraInternal cameraInternal, java.util.Set<androidx.camera.core.UseCase> set, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : set) {
            hashMap.put(useCase, useCase.mergeConfigs(cameraInternal.getCameraInfoInternal(), null, useCase.getDefaultConfig(true, useCaseConfigFactory)));
        }
        return hashMap;
    }

    public void bindChildren() {
        for (androidx.camera.core.UseCase useCase : this.mChildren) {
            androidx.camera.core.streamsharing.VirtualCamera virtualCamera = this.mChildrenVirtualCameras.get(useCase);
            java.util.Objects.requireNonNull(virtualCamera);
            useCase.bindToCamera(virtualCamera, null, null, useCase.getDefaultConfig(true, this.mUseCaseConfigFactory));
        }
    }

    public androidx.camera.core.impl.CameraCaptureCallback createCameraCaptureCallback() {
        return new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.core.streamsharing.VirtualCameraAdapter.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                super.onCaptureCompleted(i17, cameraCaptureResult);
                java.util.Iterator<androidx.camera.core.UseCase> it = androidx.camera.core.streamsharing.VirtualCameraAdapter.this.mChildren.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.streamsharing.VirtualCameraAdapter.sendCameraCaptureResultToChild(cameraCaptureResult, it.next().getSessionConfig(), i17);
                }
            }
        };
    }

    public java.util.Set<androidx.camera.core.UseCase> getChildren() {
        return this.mChildren;
    }

    public java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.util.OutConfig> getChildrenOutConfigs(androidx.camera.core.processing.SurfaceEdge surfaceEdge, int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : this.mChildren) {
            hashMap.put(useCase, calculateOutConfig(useCase, this.mResolutionsMerger, this.mParentCamera, surfaceEdge, i17, z17));
        }
        return hashMap;
    }

    public androidx.camera.core.impl.CameraCaptureCallback getParentMetadataCallback() {
        return this.mParentMetadataCallback;
    }

    public void mergeChildrenConfigs(androidx.camera.core.impl.MutableConfig mutableConfig) {
        mutableConfig.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, this.mResolutionsMerger.getMergedResolutions(mutableConfig));
        mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(getHighestSurfacePriority(this.mChildrenConfigs)));
        androidx.camera.core.DynamicRange resolveDynamicRange = androidx.camera.core.streamsharing.DynamicRangeUtils.resolveDynamicRange(this.mChildrenConfigs);
        if (resolveDynamicRange == null) {
            throw new java.lang.IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        mutableConfig.insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, resolveDynamicRange);
        for (androidx.camera.core.UseCase useCase : this.mChildren) {
            if (useCase.getCurrentConfig().getVideoStabilizationMode() != 0) {
                mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, java.lang.Integer.valueOf(useCase.getCurrentConfig().getVideoStabilizationMode()));
            }
            if (useCase.getCurrentConfig().getPreviewStabilizationMode() != 0) {
                mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, java.lang.Integer.valueOf(useCase.getCurrentConfig().getPreviewStabilizationMode()));
            }
        }
    }

    public void notifyStateAttached() {
        for (androidx.camera.core.UseCase useCase : this.mChildren) {
            useCase.onStateAttached();
            useCase.onCameraControlReady();
        }
    }

    public void notifyStateDetached() {
        java.util.Iterator<androidx.camera.core.UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onStateDetached();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            return;
        }
        this.mChildrenActiveState.put(useCase, java.lang.Boolean.TRUE);
        androidx.camera.core.impl.DeferrableSurface childSurface = getChildSurface(useCase);
        if (childSurface != null) {
            forceSetProvider(getUseCaseEdge(useCase), childSurface, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            this.mChildrenActiveState.put(useCase, java.lang.Boolean.FALSE);
            getUseCaseEdge(useCase).disconnect();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.DeferrableSurface childSurface;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.processing.SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
        if (isUseCaseActive(useCase) && (childSurface = getChildSurface(useCase)) != null) {
            forceSetProvider(useCaseEdge, childSurface, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            androidx.camera.core.processing.SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
            androidx.camera.core.impl.DeferrableSurface childSurface = getChildSurface(useCase);
            if (childSurface != null) {
                forceSetProvider(useCaseEdge, childSurface, useCase.getSessionConfig());
            } else {
                useCaseEdge.disconnect();
            }
        }
    }

    public void resetChildren() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        java.util.Iterator<androidx.camera.core.UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            onUseCaseReset(it.next());
        }
    }

    public void setChildrenEdges(java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> map) {
        this.mChildrenEdges.clear();
        this.mChildrenEdges.putAll(map);
        for (java.util.Map.Entry<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> entry : this.mChildrenEdges.entrySet()) {
            androidx.camera.core.UseCase key = entry.getKey();
            androidx.camera.core.processing.SurfaceEdge value = entry.getValue();
            key.setViewPortCropRect(value.getCropRect());
            key.setSensorToBufferTransformMatrix(value.getSensorToBufferTransform());
            key.updateSuggestedStreamSpec(value.getStreamSpec(), null);
            key.notifyState();
        }
    }

    public void unbindChildren() {
        for (androidx.camera.core.UseCase useCase : this.mChildren) {
            androidx.camera.core.streamsharing.VirtualCamera virtualCamera = this.mChildrenVirtualCameras.get(useCase);
            java.util.Objects.requireNonNull(virtualCamera);
            useCase.unbindFromCamera(virtualCamera);
        }
    }

    public java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.concurrent.DualOutConfig> getChildrenOutConfigs(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceEdge surfaceEdge2, int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : this.mChildren) {
            androidx.camera.core.processing.util.OutConfig calculateOutConfig = calculateOutConfig(useCase, this.mResolutionsMerger, this.mParentCamera, surfaceEdge, i17, z17);
            androidx.camera.core.streamsharing.ResolutionsMerger resolutionsMerger = this.mSecondaryResolutionsMerger;
            androidx.camera.core.impl.CameraInternal cameraInternal = this.mSecondaryParentCamera;
            java.util.Objects.requireNonNull(cameraInternal);
            hashMap.put(useCase, androidx.camera.core.processing.concurrent.DualOutConfig.of(calculateOutConfig, calculateOutConfig(useCase, resolutionsMerger, cameraInternal, surfaceEdge2, i17, z17)));
        }
        return hashMap;
    }
}
