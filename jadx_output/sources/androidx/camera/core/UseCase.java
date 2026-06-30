package androidx.camera.core;

/* loaded from: classes14.dex */
public abstract class UseCase {
    private androidx.camera.core.impl.StreamSpec mAttachedStreamSpec;
    private androidx.camera.core.impl.CameraInternal mCamera;
    private androidx.camera.core.impl.UseCaseConfig<?> mCameraConfig;
    private androidx.camera.core.impl.UseCaseConfig<?> mCurrentConfig;
    private androidx.camera.core.CameraEffect mEffect;
    private androidx.camera.core.impl.UseCaseConfig<?> mExtendedConfig;
    private java.lang.String mPhysicalCameraId;
    private androidx.camera.core.impl.CameraInternal mSecondaryCamera;
    private androidx.camera.core.impl.UseCaseConfig<?> mUseCaseConfig;
    private android.graphics.Rect mViewPortCropRect;
    private final java.util.Set<androidx.camera.core.UseCase.StateChangeCallback> mStateChangeCallbacks = new java.util.HashSet();
    private final java.lang.Object mCameraLock = new java.lang.Object();
    private androidx.camera.core.UseCase.State mState = androidx.camera.core.UseCase.State.INACTIVE;
    private android.graphics.Matrix mSensorToBufferTransformMatrix = new android.graphics.Matrix();
    private androidx.camera.core.impl.SessionConfig mAttachedSessionConfig = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();
    private androidx.camera.core.impl.SessionConfig mAttachedSecondarySessionConfig = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();

    /* loaded from: classes6.dex */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: classes14.dex */
    public interface StateChangeCallback {
        void onUseCaseActive(androidx.camera.core.UseCase useCase);

        void onUseCaseInactive(androidx.camera.core.UseCase useCase);

        void onUseCaseReset(androidx.camera.core.UseCase useCase);

        void onUseCaseUpdated(androidx.camera.core.UseCase useCase);
    }

    public UseCase(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        this.mUseCaseConfig = useCaseConfig;
        this.mCurrentConfig = useCaseConfig;
    }

    private void addStateChangeCallback(androidx.camera.core.UseCase.StateChangeCallback stateChangeCallback) {
        this.mStateChangeCallbacks.add(stateChangeCallback);
    }

    private void removeStateChangeCallback(androidx.camera.core.UseCase.StateChangeCallback stateChangeCallback) {
        this.mStateChangeCallbacks.remove(stateChangeCallback);
    }

    public static int snapToSurfaceRotation(int i17) {
        m3.h.c(i17, 0, 359, "orientation");
        if (i17 >= 315 || i17 < 45) {
            return 0;
        }
        if (i17 >= 225) {
            return 1;
        }
        return i17 >= 135 ? 2 : 3;
    }

    public final void bindToCamera(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig2) {
        synchronized (this.mCameraLock) {
            this.mCamera = cameraInternal;
            this.mSecondaryCamera = cameraInternal2;
            addStateChangeCallback(cameraInternal);
            if (cameraInternal2 != null) {
                addStateChangeCallback(cameraInternal2);
            }
        }
        this.mExtendedConfig = useCaseConfig;
        this.mCameraConfig = useCaseConfig2;
        this.mCurrentConfig = mergeConfigs(cameraInternal.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        onBind();
    }

    public androidx.camera.core.impl.UseCaseConfig<?> getAppConfig() {
        return this.mUseCaseConfig;
    }

    public int getAppTargetRotation() {
        return ((androidx.camera.core.impl.ImageOutputConfig) this.mCurrentConfig).getAppTargetRotation(-1);
    }

    public androidx.camera.core.impl.StreamSpec getAttachedStreamSpec() {
        return this.mAttachedStreamSpec;
    }

    public android.util.Size getAttachedSurfaceResolution() {
        androidx.camera.core.impl.StreamSpec streamSpec = this.mAttachedStreamSpec;
        if (streamSpec != null) {
            return streamSpec.getResolution();
        }
        return null;
    }

    public androidx.camera.core.impl.CameraInternal getCamera() {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.mCameraLock) {
            cameraInternal = this.mCamera;
        }
        return cameraInternal;
    }

    public androidx.camera.core.impl.CameraControlInternal getCameraControl() {
        synchronized (this.mCameraLock) {
            androidx.camera.core.impl.CameraInternal cameraInternal = this.mCamera;
            if (cameraInternal == null) {
                return androidx.camera.core.impl.CameraControlInternal.DEFAULT_EMPTY_INSTANCE;
            }
            return cameraInternal.getCameraControlInternal();
        }
    }

    public java.lang.String getCameraId() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        m3.h.d(camera, "No camera attached to use case: " + this);
        return camera.getCameraInfoInternal().getCameraId();
    }

    public androidx.camera.core.impl.UseCaseConfig<?> getCurrentConfig() {
        return this.mCurrentConfig;
    }

    public abstract androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z17, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory);

    public androidx.camera.core.CameraEffect getEffect() {
        return this.mEffect;
    }

    public int getImageFormat() {
        return this.mCurrentConfig.getInputFormat();
    }

    public int getMirrorModeInternal() {
        return ((androidx.camera.core.impl.ImageOutputConfig) this.mCurrentConfig).getMirrorMode(-1);
    }

    public java.lang.String getName() {
        java.lang.String targetName = this.mCurrentConfig.getTargetName("<UnknownUseCase-" + hashCode() + ">");
        java.util.Objects.requireNonNull(targetName);
        return targetName;
    }

    public java.lang.String getPhysicalCameraId() {
        return this.mPhysicalCameraId;
    }

    public int getRelativeRotation(androidx.camera.core.impl.CameraInternal cameraInternal) {
        return getRelativeRotation(cameraInternal, false);
    }

    public androidx.camera.core.ResolutionInfo getResolutionInfoInternal() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        android.util.Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        android.graphics.Rect viewPortCropRect = getViewPortCropRect();
        if (viewPortCropRect == null) {
            viewPortCropRect = new android.graphics.Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        return new androidx.camera.core.ResolutionInfo(attachedSurfaceResolution, viewPortCropRect, getRelativeRotation(camera));
    }

    public androidx.camera.core.impl.CameraInternal getSecondaryCamera() {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.mCameraLock) {
            cameraInternal = this.mSecondaryCamera;
        }
        return cameraInternal;
    }

    public java.lang.String getSecondaryCameraId() {
        if (getSecondaryCamera() == null) {
            return null;
        }
        return getSecondaryCamera().getCameraInfoInternal().getCameraId();
    }

    public androidx.camera.core.impl.SessionConfig getSecondarySessionConfig() {
        return this.mAttachedSecondarySessionConfig;
    }

    public android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return this.mSensorToBufferTransformMatrix;
    }

    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.mAttachedSessionConfig;
    }

    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        return java.util.Collections.emptySet();
    }

    public android.util.Range<java.lang.Integer> getTargetFrameRateInternal() {
        return this.mCurrentConfig.getTargetFrameRate(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
    }

    public int getTargetRotationInternal() {
        return ((androidx.camera.core.impl.ImageOutputConfig) this.mCurrentConfig).getTargetRotation(0);
    }

    public abstract androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config);

    public android.graphics.Rect getViewPortCropRect() {
        return this.mViewPortCropRect;
    }

    public boolean isCurrentCamera(java.lang.String str) {
        if (getCamera() == null) {
            return false;
        }
        return java.util.Objects.equals(str, getCameraId());
    }

    public boolean isEffectTargetsSupported(int i17) {
        java.util.Iterator<java.lang.Integer> it = getSupportedEffectTargets().iterator();
        while (it.hasNext()) {
            if (androidx.camera.core.processing.TargetUtils.isSuperset(i17, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean isMirroringRequired(androidx.camera.core.impl.CameraInternal cameraInternal) {
        int mirrorModeInternal = getMirrorModeInternal();
        if (mirrorModeInternal == -1 || mirrorModeInternal == 0) {
            return false;
        }
        if (mirrorModeInternal == 1) {
            return true;
        }
        if (mirrorModeInternal == 2) {
            return cameraInternal.isFrontFacing();
        }
        throw new java.lang.AssertionError("Unknown mirrorMode: " + mirrorModeInternal);
    }

    public androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig2) {
        androidx.camera.core.impl.MutableOptionsBundle create;
        if (useCaseConfig2 != null) {
            create = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) useCaseConfig2);
            create.removeOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME);
        } else {
            create = androidx.camera.core.impl.MutableOptionsBundle.create();
        }
        if (this.mUseCaseConfig.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO) || this.mUseCaseConfig.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION)) {
            androidx.camera.core.impl.Config.Option<androidx.camera.core.resolutionselector.ResolutionSelector> option = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
            if (create.containsOption(option)) {
                create.removeOption(option);
            }
        }
        androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig3 = this.mUseCaseConfig;
        androidx.camera.core.impl.Config.Option<androidx.camera.core.resolutionselector.ResolutionSelector> option2 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        if (useCaseConfig3.containsOption(option2)) {
            androidx.camera.core.impl.Config.Option<android.util.Size> option3 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION;
            if (create.containsOption(option3) && ((androidx.camera.core.resolutionselector.ResolutionSelector) this.mUseCaseConfig.retrieveOption(option2)).getResolutionStrategy() != null) {
                create.removeOption(option3);
            }
        }
        java.util.Iterator<androidx.camera.core.impl.Config.Option<?>> it = this.mUseCaseConfig.listOptions().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.Config.mergeOptionValue(create, create, this.mUseCaseConfig, it.next());
        }
        if (useCaseConfig != null) {
            for (androidx.camera.core.impl.Config.Option<?> option4 : useCaseConfig.listOptions()) {
                if (!option4.getId().equals(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME.getId())) {
                    androidx.camera.core.impl.Config.mergeOptionValue(create, create, useCaseConfig, option4);
                }
            }
        }
        if (create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION)) {
            androidx.camera.core.impl.Config.Option<java.lang.Integer> option5 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO;
            if (create.containsOption(option5)) {
                create.removeOption(option5);
            }
        }
        androidx.camera.core.impl.Config.Option<androidx.camera.core.resolutionselector.ResolutionSelector> option6 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        if (create.containsOption(option6) && ((androidx.camera.core.resolutionselector.ResolutionSelector) create.retrieveOption(option6)).getAllowedResolutionMode() != 0) {
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.TRUE);
        }
        return onMergeConfig(cameraInfoInternal, getUseCaseConfigBuilder(create));
    }

    public final void notifyActive() {
        this.mState = androidx.camera.core.UseCase.State.ACTIVE;
        notifyState();
    }

    public final void notifyInactive() {
        this.mState = androidx.camera.core.UseCase.State.INACTIVE;
        notifyState();
    }

    public final void notifyReset() {
        java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.mStateChangeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onUseCaseReset(this);
        }
    }

    public final void notifyState() {
        int ordinal = this.mState.ordinal();
        if (ordinal == 0) {
            java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.mStateChangeCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onUseCaseActive(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it6 = this.mStateChangeCallbacks.iterator();
            while (it6.hasNext()) {
                it6.next().onUseCaseInactive(this);
            }
        }
    }

    public final void notifyUpdated() {
        java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.mStateChangeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onUseCaseUpdated(this);
        }
    }

    public void onBind() {
    }

    public void onCameraControlReady() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        return builder.getUseCaseConfig();
    }

    public void onStateAttached() {
    }

    public void onStateDetached() {
    }

    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        androidx.camera.core.impl.StreamSpec streamSpec = this.mAttachedStreamSpec;
        if (streamSpec != null) {
            return streamSpec.toBuilder().setImplementationOptions(config).build();
        }
        throw new java.lang.UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        return streamSpec;
    }

    public void onUnbind() {
    }

    public void setEffect(androidx.camera.core.CameraEffect cameraEffect) {
        m3.h.a(cameraEffect == null || isEffectTargetsSupported(cameraEffect.getTargets()));
        this.mEffect = cameraEffect;
    }

    public void setPhysicalCameraId(java.lang.String str) {
        this.mPhysicalCameraId = str;
    }

    public void setSensorToBufferTransformMatrix(android.graphics.Matrix matrix) {
        this.mSensorToBufferTransformMatrix = new android.graphics.Matrix(matrix);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    public boolean setTargetRotationInternal(int i17) {
        int targetRotation = ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getTargetRotation(-1);
        if (targetRotation != -1 && targetRotation == i17) {
            return false;
        }
        androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> useCaseConfigBuilder = getUseCaseConfigBuilder(this.mUseCaseConfig);
        androidx.camera.core.internal.utils.UseCaseConfigUtil.updateTargetRotationAndRelatedConfigs(useCaseConfigBuilder, i17);
        this.mUseCaseConfig = useCaseConfigBuilder.getUseCaseConfig();
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera == null) {
            this.mCurrentConfig = this.mUseCaseConfig;
            return true;
        }
        this.mCurrentConfig = mergeConfigs(camera.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        return true;
    }

    public void setViewPortCropRect(android.graphics.Rect rect) {
        this.mViewPortCropRect = rect;
    }

    public final void unbindFromCamera(androidx.camera.core.impl.CameraInternal cameraInternal) {
        onUnbind();
        synchronized (this.mCameraLock) {
            androidx.camera.core.impl.CameraInternal cameraInternal2 = this.mCamera;
            if (cameraInternal == cameraInternal2) {
                removeStateChangeCallback(cameraInternal2);
                this.mCamera = null;
            }
            androidx.camera.core.impl.CameraInternal cameraInternal3 = this.mSecondaryCamera;
            if (cameraInternal == cameraInternal3) {
                removeStateChangeCallback(cameraInternal3);
                this.mSecondaryCamera = null;
            }
        }
        this.mAttachedStreamSpec = null;
        this.mViewPortCropRect = null;
        this.mCurrentConfig = this.mUseCaseConfig;
        this.mExtendedConfig = null;
        this.mCameraConfig = null;
    }

    public void updateSessionConfig(java.util.List<androidx.camera.core.impl.SessionConfig> list) {
        if (list.isEmpty()) {
            return;
        }
        this.mAttachedSessionConfig = list.get(0);
        if (list.size() > 1) {
            this.mAttachedSecondarySessionConfig = list.get(1);
        }
        java.util.Iterator<androidx.camera.core.impl.SessionConfig> it = list.iterator();
        while (it.hasNext()) {
            for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : it.next().getSurfaces()) {
                if (deferrableSurface.getContainerClass() == null) {
                    deferrableSurface.setContainerClass(getClass());
                }
            }
        }
    }

    public void updateSuggestedStreamSpec(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        this.mAttachedStreamSpec = onSuggestedStreamSpecUpdated(streamSpec, streamSpec2);
    }

    public void updateSuggestedStreamSpecImplementationOptions(androidx.camera.core.impl.Config config) {
        this.mAttachedStreamSpec = onSuggestedStreamSpecImplementationOptionsUpdated(config);
    }

    public int getRelativeRotation(androidx.camera.core.impl.CameraInternal cameraInternal, boolean z17) {
        int sensorRotationDegrees = cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(getTargetRotationInternal());
        return !cameraInternal.getHasTransform() && z17 ? androidx.camera.core.impl.utils.TransformUtils.within360(-sensorRotationDegrees) : sensorRotationDegrees;
    }
}
