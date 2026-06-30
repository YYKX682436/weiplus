package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public class Camera2CameraControlImpl implements androidx.camera.core.impl.CameraControlInternal {
    private static final int DEFAULT_TEMPLATE = 1;
    private static final java.lang.String TAG = "Camera2CameraControlImp";
    static final java.lang.String TAG_SESSION_UPDATE_ID = "CameraControlSessionUpdateId";
    private final androidx.camera.camera2.internal.compat.workaround.AeFpsRange mAeFpsRange;
    private final androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final androidx.camera.camera2.interop.Camera2CameraControl mCamera2CameraControl;
    private final androidx.camera.camera2.internal.Camera2CapturePipeline mCamera2CapturePipeline;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private final androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    final java.util.concurrent.Executor mExecutor;
    private final androidx.camera.camera2.internal.ExposureControl mExposureControl;
    private volatile int mFlashMode;
    private volatile wa.a mFlashModeChangeSessionUpdateFuture;
    private final androidx.camera.camera2.internal.FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsTorchOn;
    private final java.lang.Object mLock;
    private final java.util.concurrent.atomic.AtomicLong mNextSessionUpdateId;
    private androidx.camera.core.ImageCapture.ScreenFlash mScreenFlash;
    final androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraControlSessionCallback mSessionCallback;
    private final androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final androidx.camera.camera2.internal.TorchControl mTorchControl;
    private int mUseCount;
    private final androidx.camera.camera2.internal.VideoUsageControl mVideoUsageControl;
    private final androidx.camera.camera2.internal.ZoomControl mZoomControl;
    androidx.camera.camera2.internal.ZslControl mZslControl;

    /* loaded from: classes14.dex */
    public static final class CameraCaptureCallbackSet extends androidx.camera.core.impl.CameraCaptureCallback {
        java.util.Set<androidx.camera.core.impl.CameraCaptureCallback> mCallbacks = new java.util.HashSet();
        java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> mCallbackExecutors = new android.util.ArrayMap();

        public void addCaptureCallback(java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.add(cameraCaptureCallback);
            this.mCallbackExecutors.put(cameraCaptureCallback, executor);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(final int i17) {
            for (final androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.CameraCaptureCallback.this.onCaptureCancelled(i17);
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    androidx.camera.core.Logger.e(androidx.camera.camera2.internal.Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCancelled.", e17);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(final int i17, final androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            for (final androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.CameraCaptureCallback.this.onCaptureCompleted(i17, cameraCaptureResult);
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    androidx.camera.core.Logger.e(androidx.camera.camera2.internal.Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCompleted.", e17);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(final int i17, final androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
            for (final androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.CameraCaptureCallback.this.onCaptureFailed(i17, cameraCaptureFailure);
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    androidx.camera.core.Logger.e(androidx.camera.camera2.internal.Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureFailed.", e17);
                }
            }
        }

        public void removeCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.remove(cameraCaptureCallback);
            this.mCallbackExecutors.remove(cameraCaptureCallback);
        }
    }

    /* loaded from: classes14.dex */
    public static final class CameraControlSessionCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.concurrent.Executor mExecutor;
        final java.util.Set<androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener> mResultListeners = new java.util.HashSet();

        public CameraControlSessionCallback(java.util.concurrent.Executor executor) {
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$0(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener : this.mResultListeners) {
                if (captureResultListener.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.mResultListeners.removeAll(hashSet);
        }

        public void addListener(androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraControlSessionCallback$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraControlSessionCallback.this.lambda$onCaptureCompleted$0(totalCaptureResult);
                }
            });
        }

        public void removeListener(androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }
    }

    /* loaded from: classes14.dex */
    public interface CaptureResultListener {
        boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult);
    }

    public Camera2CameraControlImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback controlUpdateCallback) {
        this(cameraCharacteristicsCompat, scheduledExecutorService, executor, controlUpdateCallback, new androidx.camera.core.impl.Quirks(new java.util.ArrayList()));
    }

    private int getSupportedAwbMode(int i17) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i17, iArr) ? i17 : isModeInList(1, iArr) ? 1 : 0;
    }

    private boolean isControlInUse() {
        return getUseCount() > 0;
    }

    private static boolean isModeInList(int i17, int[] iArr) {
        for (int i18 : iArr) {
            if (i17 == i18) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSessionUpdated(android.hardware.camera2.TotalCaptureResult totalCaptureResult, long j17) {
        java.lang.Long l17;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        java.lang.Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof androidx.camera.core.impl.TagBundle) && (l17 = (java.lang.Long) ((androidx.camera.core.impl.TagBundle) tag).getTag(TAG_SESSION_UPDATE_ID)) != null && l17.longValue() >= j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addInteropConfig$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSessionCameraCaptureCallback$8(java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.addCaptureCallback(executor, cameraCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearInteropConfig$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wa.a lambda$getCameraCapturePipelineAsync$5(int i17, int i18, int i19, java.lang.Void r47) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.mCamera2CapturePipeline.getCameraCapturePipeline(i17, i18, i19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSessionCameraCaptureCallback$9(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.removeCaptureCallback(cameraCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wa.a lambda$submitStillCaptureRequests$4(java.util.List list, int i17, int i18, int i19, java.lang.Void r57) {
        return this.mCamera2CapturePipeline.submitStillCaptures(list, i17, i18, i19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSessionConfigAsync$6(t2.k kVar) {
        androidx.camera.core.impl.utils.futures.Futures.propagate(waitForSessionUpdateId(updateSessionConfigSynchronous()), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$updateSessionConfigAsync$7(final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$k
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraControlImpl.this.lambda$updateSessionConfigAsync$6(kVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$waitForSessionUpdateId$2(long j17, t2.k kVar, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (!isSessionUpdated(totalCaptureResult, j17)) {
            return false;
        }
        kVar.a(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$waitForSessionUpdateId$3(final long j17, final t2.k kVar) {
        addCaptureResultListener(new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$e
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean lambda$waitForSessionUpdateId$2;
                lambda$waitForSessionUpdateId$2 = androidx.camera.camera2.internal.Camera2CameraControlImpl.lambda$waitForSessionUpdateId$2(j17, kVar, totalCaptureResult);
                return lambda$waitForSessionUpdateId$2;
            }
        });
        return "waitForSessionUpdateId:" + j17;
    }

    private wa.a waitForSessionUpdateId(final long j17) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$i
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$waitForSessionUpdateId$3;
                lambda$waitForSessionUpdateId$3 = androidx.camera.camera2.internal.Camera2CameraControlImpl.this.lambda$waitForSessionUpdateId$3(j17, kVar);
                return lambda$waitForSessionUpdateId$3;
            }
        });
    }

    public void addCaptureResultListener(androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener) {
        this.mSessionCallback.addListener(captureResultListener);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(androidx.camera.core.impl.Config config) {
        this.mCamera2CameraControl.addCaptureRequestOptions(androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(config).build()).addListener(new androidx.camera.camera2.internal.Camera2CameraControlImpl$$b(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public void addSessionCameraCaptureCallback(final java.util.concurrent.Executor executor, final androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$h
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraControlImpl.this.lambda$addSessionCameraCaptureCallback$8(executor, cameraCaptureCallback);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder) {
        this.mZslControl.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a cancelFocusAndMetering() {
        return !isControlInUse() ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active.")) : androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mFocusMeteringControl.cancelFocusAndMetering());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCamera2CameraControl.clearCaptureRequestOptions().addListener(new androidx.camera.camera2.internal.Camera2CameraControlImpl$$g(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public void decrementUseCount() {
        synchronized (this.mLock) {
            int i17 = this.mUseCount;
            if (i17 == 0) {
                throw new java.lang.IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.mUseCount = i17 - 1;
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mVideoUsageControl.decrementUsage();
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a enableTorch(boolean z17) {
        return !isControlInUse() ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active.")) : androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mTorchControl.enableTorch(z17));
    }

    public void enableTorchInternal(boolean z17) {
        this.mIsTorchOn = z17;
        if (!z17) {
            androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, java.lang.Integer.valueOf(getSupportedAeMode(1)));
            builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            submitCaptureRequestsInternal(java.util.Collections.singletonList(builder.build()));
        }
        updateSessionConfigSynchronous();
    }

    public androidx.camera.camera2.interop.Camera2CameraControl getCamera2CameraControl() {
        return this.mCamera2CameraControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public wa.a getCameraCapturePipelineAsync(final int i17, final int i18) {
        if (isControlInUse()) {
            final int flashMode = getFlashMode();
            return androidx.camera.core.impl.utils.futures.FutureChain.from(androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$f
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$getCameraCapturePipelineAsync$5;
                    lambda$getCameraCapturePipelineAsync$5 = androidx.camera.camera2.internal.Camera2CameraControlImpl.this.lambda$getCameraCapturePipelineAsync$5(i17, flashMode, i18, (java.lang.Void) obj);
                    return lambda$getCameraCapturePipelineAsync$5;
                }
            }, this.mExecutor);
        }
        androidx.camera.core.Logger.w(TAG, "Camera is not active.");
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
    }

    public android.graphics.Rect getCropSensorRegion() {
        return this.mZoomControl.getCropSensorRegion();
    }

    public long getCurrentSessionUpdateId() {
        return this.mCurrentSessionUpdateId;
    }

    public androidx.camera.camera2.internal.ExposureControl getExposureControl() {
        return this.mExposureControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mFlashMode;
    }

    public androidx.camera.camera2.internal.FocusMeteringControl getFocusMeteringControl() {
        return this.mFocusMeteringControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.Config getInteropConfig() {
        return this.mCamera2CameraControl.getCamera2ImplConfig();
    }

    public int getMaxAeRegionCount() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAfRegionCount() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAwbRegionCount() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlash;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public android.graphics.Rect getSensorRect() {
        android.graphics.Rect rect = (android.graphics.Rect) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(android.os.Build.FINGERPRINT) && rect == null) {
            return new android.graphics.Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        this.mSessionConfigBuilder.setTemplateType(this.mTemplate);
        this.mSessionConfigBuilder.setImplementationOptions(getSessionOptions());
        this.mSessionConfigBuilder.addTag(TAG_SESSION_UPDATE_ID, java.lang.Long.valueOf(this.mCurrentSessionUpdateId));
        return this.mSessionConfigBuilder.build();
    }

    public androidx.camera.core.impl.Config getSessionOptions() {
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_MODE;
        androidx.camera.core.impl.Config.OptionPriority optionPriority = androidx.camera.core.impl.Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, 1, optionPriority);
        this.mFocusMeteringControl.addFocusMeteringOptions(builder);
        this.mAeFpsRange.addAeFpsRangeOptions(builder);
        this.mZoomControl.addZoomOption(builder);
        int i17 = this.mFocusMeteringControl.isExternalFlashAeModeEnabled() ? 5 : 1;
        if (this.mIsTorchOn) {
            builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.FLASH_MODE, 2, optionPriority);
        } else {
            int i18 = this.mFlashMode;
            if (i18 == 0) {
                i17 = this.mAutoFlashAEModeDisabler.getCorrectedAeMode(2);
            } else if (i18 == 1) {
                i17 = 3;
            } else if (i18 == 2) {
                i17 = 1;
            }
        }
        builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, java.lang.Integer.valueOf(getSupportedAeMode(i17)), optionPriority);
        builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE, java.lang.Integer.valueOf(getSupportedAwbMode(1)), optionPriority);
        this.mExposureControl.setCaptureRequestOption(builder);
        this.mCamera2CameraControl.applyOptionsToBuilder(builder);
        return builder.build();
    }

    public int getSupportedAeMode(int i17) {
        return getSupportedAeMode(this.mCameraCharacteristics, i17);
    }

    public int getSupportedAfMode(int i17) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i17, iArr)) {
            return i17;
        }
        if (isModeInList(4, iArr)) {
            return 4;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    public androidx.camera.camera2.internal.TorchControl getTorchControl() {
        return this.mTorchControl;
    }

    public int getUseCount() {
        int i17;
        synchronized (this.mLock) {
            i17 = this.mUseCount;
        }
        return i17;
    }

    public androidx.camera.camera2.internal.ZoomControl getZoomControl() {
        return this.mZoomControl;
    }

    public androidx.camera.camera2.internal.ZslControl getZslControl() {
        return this.mZslControl;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            this.mUseCount++;
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mVideoUsageControl.incrementUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        int usage = this.mVideoUsageControl.getUsage();
        androidx.camera.core.Logger.d(TAG, "isInVideoUsage: mVideoUsageControl value = " + usage);
        return usage > 0;
    }

    public boolean isTorchOn() {
        return this.mIsTorchOn;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mZslControl.isZslDisabledByUserCaseConfig();
    }

    public void removeCaptureResultListener(androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener) {
        this.mSessionCallback.removeListener(captureResultListener);
    }

    public void removeSessionCameraCaptureCallback(final androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraControlImpl.this.lambda$removeSessionCameraCaptureCallback$9(cameraCaptureCallback);
            }
        });
    }

    public void resetTemplate() {
        setTemplate(1);
    }

    public void setActive(boolean z17) {
        androidx.camera.core.Logger.d(TAG, "setActive: isActive = " + z17);
        this.mFocusMeteringControl.setActive(z17);
        this.mZoomControl.setActive(z17);
        this.mTorchControl.setActive(z17);
        this.mExposureControl.setActive(z17);
        this.mCamera2CameraControl.setActive(z17);
        if (z17) {
            return;
        }
        this.mScreenFlash = null;
        this.mVideoUsageControl.resetDirectly();
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a setExposureCompensationIndex(int i17) {
        return !isControlInUse() ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active.")) : this.mExposureControl.setExposureCompensationIndex(i17);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i17) {
        if (!isControlInUse()) {
            androidx.camera.core.Logger.w(TAG, "Camera is not active.");
            return;
        }
        this.mFlashMode = i17;
        androidx.camera.core.Logger.d(TAG, "setFlashMode: mFlashMode = " + this.mFlashMode);
        androidx.camera.camera2.internal.ZslControl zslControl = this.mZslControl;
        boolean z17 = true;
        if (this.mFlashMode != 1 && this.mFlashMode != 0) {
            z17 = false;
        }
        zslControl.setZslDisabledByFlashMode(z17);
        this.mFlashModeChangeSessionUpdateFuture = updateSessionConfigAsync();
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a setLinearZoom(float f17) {
        return !isControlInUse() ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active.")) : androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mZoomControl.setLinearZoom(f17));
    }

    public void setPreviewAspectRatio(android.util.Rational rational) {
        this.mFocusMeteringControl.setPreviewAspectRatio(rational);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.mScreenFlash = screenFlash;
    }

    public void setTemplate(int i17) {
        this.mTemplate = i17;
        this.mFocusMeteringControl.setTemplate(i17);
        this.mCamera2CapturePipeline.setTemplate(this.mTemplate);
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a setZoomRatio(float f17) {
        return !isControlInUse() ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active.")) : androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mZoomControl.setZoomRatio(f17));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z17) {
        this.mZslControl.setZslDisabledByUserCaseConfig(z17);
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return !isControlInUse() ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active.")) : androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mFocusMeteringControl.startFocusAndMetering(focusMeteringAction));
    }

    public void submitCaptureRequestsInternal(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        this.mControlUpdateCallback.onCameraControlCaptureRequests(list);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public wa.a submitStillCaptureRequests(final java.util.List<androidx.camera.core.impl.CaptureConfig> list, final int i17, final int i18) {
        if (isControlInUse()) {
            final int flashMode = getFlashMode();
            return androidx.camera.core.impl.utils.futures.FutureChain.from(androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$j
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$submitStillCaptureRequests$4;
                    lambda$submitStillCaptureRequests$4 = androidx.camera.camera2.internal.Camera2CameraControlImpl.this.lambda$submitStillCaptureRequests$4(list, i17, flashMode, i18, (java.lang.Void) obj);
                    return lambda$submitStillCaptureRequests$4;
                }
            }, this.mExecutor);
        }
        androidx.camera.core.Logger.w(TAG, "Camera is not active.");
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
    }

    public void updateSessionConfig() {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraControlImpl.this.updateSessionConfigSynchronous();
            }
        });
    }

    public wa.a updateSessionConfigAsync() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraControlImpl$$d
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$updateSessionConfigAsync$7;
                lambda$updateSessionConfigAsync$7 = androidx.camera.camera2.internal.Camera2CameraControlImpl.this.lambda$updateSessionConfigAsync$7(kVar);
                return lambda$updateSessionConfigAsync$7;
            }
        }));
    }

    public long updateSessionConfigSynchronous() {
        this.mCurrentSessionUpdateId = this.mNextSessionUpdateId.getAndIncrement();
        this.mControlUpdateCallback.onCameraControlUpdateSessionConfig();
        return this.mCurrentSessionUpdateId;
    }

    public Camera2CameraControlImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback controlUpdateCallback, androidx.camera.core.impl.Quirks quirks) {
        this.mLock = new java.lang.Object();
        androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
        this.mSessionConfigBuilder = builder;
        this.mUseCount = 0;
        this.mIsTorchOn = false;
        this.mFlashMode = 2;
        this.mNextSessionUpdateId = new java.util.concurrent.atomic.AtomicLong(0L);
        this.mFlashModeChangeSessionUpdateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        this.mTemplate = 1;
        this.mCurrentSessionUpdateId = 0L;
        androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraCaptureCallbackSet cameraCaptureCallbackSet = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraCaptureCallbackSet();
        this.mCameraCaptureCallbackSet = cameraCaptureCallbackSet;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mControlUpdateCallback = controlUpdateCallback;
        this.mExecutor = executor;
        this.mVideoUsageControl = new androidx.camera.camera2.internal.VideoUsageControl(executor);
        androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraControlSessionCallback cameraControlSessionCallback = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraControlSessionCallback(executor);
        this.mSessionCallback = cameraControlSessionCallback;
        builder.setTemplateType(this.mTemplate);
        builder.addRepeatingCameraCaptureCallback(androidx.camera.camera2.internal.CaptureCallbackContainer.create(cameraControlSessionCallback));
        builder.addRepeatingCameraCaptureCallback(cameraCaptureCallbackSet);
        this.mExposureControl = new androidx.camera.camera2.internal.ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.mFocusMeteringControl = new androidx.camera.camera2.internal.FocusMeteringControl(this, scheduledExecutorService, executor, quirks);
        this.mZoomControl = new androidx.camera.camera2.internal.ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchControl = new androidx.camera.camera2.internal.TorchControl(this, cameraCharacteristicsCompat, executor);
        this.mZslControl = new androidx.camera.camera2.internal.ZslControlImpl(cameraCharacteristicsCompat);
        this.mAeFpsRange = new androidx.camera.camera2.internal.compat.workaround.AeFpsRange(quirks);
        this.mAutoFlashAEModeDisabler = new androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler(quirks);
        this.mCamera2CameraControl = new androidx.camera.camera2.interop.Camera2CameraControl(this, executor);
        this.mCamera2CapturePipeline = new androidx.camera.camera2.internal.Camera2CapturePipeline(this, cameraCharacteristicsCompat, quirks, executor, scheduledExecutorService);
    }

    public static int getSupportedAeMode(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, int i17) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i17, iArr) ? i17 : isModeInList(1, iArr) ? 1 : 0;
    }
}
