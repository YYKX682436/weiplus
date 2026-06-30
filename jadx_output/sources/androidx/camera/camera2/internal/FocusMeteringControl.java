package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class FocusMeteringControl {
    static final long AUTO_FOCUS_TIMEOUT_DURATION = 5000;
    private static final android.hardware.camera2.params.MeteringRectangle[] EMPTY_RECTANGLES = new android.hardware.camera2.params.MeteringRectangle[0];
    private static final java.lang.String TAG = "FocusMeteringControl";
    private android.hardware.camera2.params.MeteringRectangle[] mAeRects;
    private android.hardware.camera2.params.MeteringRectangle[] mAfRects;
    private java.util.concurrent.ScheduledFuture<?> mAutoCancelHandle;
    private java.util.concurrent.ScheduledFuture<?> mAutoFocusTimeoutHandle;
    private android.hardware.camera2.params.MeteringRectangle[] mAwbRects;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
    final java.util.concurrent.Executor mExecutor;
    private boolean mIsExternalFlashAeModeEnabled;
    private final androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection mMeteringRegionCorrection;
    t2.k mRunningActionCompleter;
    t2.k mRunningCancelCompleter;
    private final java.util.concurrent.ScheduledExecutorService mScheduler;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mSessionListenerForAeMode;
    private volatile boolean mIsActive = false;
    private volatile android.util.Rational mPreviewAspectRatio = null;
    private boolean mIsInAfAutoMode = false;
    java.lang.Integer mCurrentAfState = 0;
    long mFocusTimeoutCounter = 0;
    boolean mIsAutoFocusCompleted = false;
    boolean mIsFocusSuccessful = false;
    private int mTemplate = 1;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mSessionListenerForFocus = null;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mSessionListenerForCancel = null;

    public FocusMeteringControl(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, androidx.camera.core.impl.Quirks quirks) {
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mRunningActionCompleter = null;
        this.mRunningCancelCompleter = null;
        this.mIsExternalFlashAeModeEnabled = false;
        this.mSessionListenerForAeMode = null;
        this.mCameraControl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mMeteringRegionCorrection = new androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection(quirks);
    }

    private void clearAutoFocusTimeoutHandle() {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.mAutoFocusTimeoutHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoFocusTimeoutHandle = null;
        }
    }

    private void completeCancelFuture() {
        t2.k kVar = this.mRunningCancelCompleter;
        if (kVar != null) {
            kVar.a(null);
            this.mRunningCancelCompleter = null;
        }
    }

    private void disableAutoCancel() {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.mAutoCancelHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoCancelHandle = null;
        }
    }

    private void executeMeteringAction(android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr, android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr2, android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr3, androidx.camera.core.FocusMeteringAction focusMeteringAction, long j17) {
        final long updateSessionConfigSynchronous;
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        disableAutoCancel();
        clearAutoFocusTimeoutHandle();
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr2;
        this.mAwbRects = meteringRectangleArr3;
        if (shouldTriggerAF()) {
            this.mIsInAfAutoMode = true;
            this.mIsAutoFocusCompleted = false;
            this.mIsFocusSuccessful = false;
            updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
            triggerAf(null, true);
        } else {
            this.mIsInAfAutoMode = false;
            this.mIsAutoFocusCompleted = true;
            this.mIsFocusSuccessful = false;
            updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        }
        this.mCurrentAfState = 0;
        final boolean isAfModeSupported = isAfModeSupported();
        androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$b
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean lambda$executeMeteringAction$7;
                lambda$executeMeteringAction$7 = androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$executeMeteringAction$7(isAfModeSupported, updateSessionConfigSynchronous, totalCaptureResult);
                return lambda$executeMeteringAction$7;
            }
        };
        this.mSessionListenerForFocus = captureResultListener;
        this.mCameraControl.addCaptureResultListener(captureResultListener);
        final long j18 = this.mFocusTimeoutCounter + 1;
        this.mFocusTimeoutCounter = j18;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$executeMeteringAction$9(j18);
            }
        };
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.mScheduler;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.mAutoFocusTimeoutHandle = scheduledExecutorService.schedule(runnable, j17, timeUnit);
        if (focusMeteringAction.isAutoCancelEnabled()) {
            this.mAutoCancelHandle = this.mScheduler.schedule(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$d
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$executeMeteringAction$11(j18);
                }
            }, focusMeteringAction.getAutoCancelDurationInMillis(), timeUnit);
        }
    }

    private void failActionFuture(java.lang.String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        t2.k kVar = this.mRunningActionCompleter;
        if (kVar != null) {
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException(str));
            this.mRunningActionCompleter = null;
        }
    }

    private void failCancelFuture(java.lang.String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForCancel);
        t2.k kVar = this.mRunningCancelCompleter;
        if (kVar != null) {
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException(str));
            this.mRunningCancelCompleter = null;
        }
    }

    private android.util.Rational getDefaultAspectRatio() {
        if (this.mPreviewAspectRatio != null) {
            return this.mPreviewAspectRatio;
        }
        android.graphics.Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        return new android.util.Rational(cropSensorRegion.width(), cropSensorRegion.height());
    }

    private static android.graphics.PointF getFovAdjustedPoint(androidx.camera.core.MeteringPoint meteringPoint, android.util.Rational rational, android.util.Rational rational2, int i17, androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection meteringRegionCorrection) {
        if (meteringPoint.getSurfaceAspectRatio() != null) {
            rational2 = meteringPoint.getSurfaceAspectRatio();
        }
        android.graphics.PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, i17);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                correctedPoint.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + correctedPoint.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                correctedPoint.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + correctedPoint.x) * (1.0f / doubleValue2);
            }
        }
        return correctedPoint;
    }

    private static android.hardware.camera2.params.MeteringRectangle getMeteringRect(androidx.camera.core.MeteringPoint meteringPoint, android.graphics.PointF pointF, android.graphics.Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int size = ((int) (meteringPoint.getSize() * rect.width())) / 2;
        int size2 = ((int) (meteringPoint.getSize() * rect.height())) / 2;
        android.graphics.Rect rect2 = new android.graphics.Rect(width - size, height - size2, width + size, height + size2);
        rect2.left = rangeLimit(rect2.left, rect.right, rect.left);
        rect2.right = rangeLimit(rect2.right, rect.right, rect.left);
        rect2.top = rangeLimit(rect2.top, rect.bottom, rect.top);
        rect2.bottom = rangeLimit(rect2.bottom, rect.bottom, rect.top);
        return new android.hardware.camera2.params.MeteringRectangle(rect2, 1000);
    }

    private java.util.List<android.hardware.camera2.params.MeteringRectangle> getMeteringRectangles(java.util.List<androidx.camera.core.MeteringPoint> list, int i17, android.util.Rational rational, android.graphics.Rect rect, int i18) {
        if (list.isEmpty() || i17 == 0) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Rational rational2 = new android.util.Rational(rect.width(), rect.height());
        for (androidx.camera.core.MeteringPoint meteringPoint : list) {
            if (arrayList.size() == i17) {
                break;
            }
            if (isValid(meteringPoint)) {
                android.hardware.camera2.params.MeteringRectangle meteringRect = getMeteringRect(meteringPoint, getFovAdjustedPoint(meteringPoint, rational2, rational, i18, this.mMeteringRegionCorrection), rect);
                if (meteringRect.getWidth() != 0 && meteringRect.getHeight() != 0) {
                    arrayList.add(meteringRect);
                }
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private boolean isAfModeSupported() {
        return this.mCameraControl.getSupportedAfMode(1) == 1;
    }

    private static boolean isValid(androidx.camera.core.MeteringPoint meteringPoint) {
        return meteringPoint.getX() >= 0.0f && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= 0.0f && meteringPoint.getY() <= 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$cancelFocusAndMetering$13(final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$n
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$cancelFocusAndMetering$12(kVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$cancelFocusAndMeteringInternal$14(int i17, long j17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (((java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_MODE)).intValue() != i17 || !androidx.camera.camera2.internal.Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j17)) {
            return false;
        }
        completeCancelFuture();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableExternalFlashAeMode$4(boolean z17, t2.k kVar) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForAeMode);
        this.mIsExternalFlashAeModeEnabled = z17;
        enableExternalFlashAeMode(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$enableExternalFlashAeMode$5(final boolean z17, final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$enableExternalFlashAeMode$4(z17, kVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$enableExternalFlashAeMode$6(long j17, t2.k kVar, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        boolean z17 = ((java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        androidx.camera.core.Logger.d(TAG, "enableExternalFlashAeMode: isAeModeExternalFlash = " + z17);
        if (z17 != this.mIsExternalFlashAeModeEnabled || !androidx.camera.camera2.internal.Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j17)) {
            return false;
        }
        androidx.camera.core.Logger.d(TAG, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z17);
        if (kVar != null) {
            kVar.a(null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$10(long j17) {
        if (j17 == this.mFocusTimeoutCounter) {
            cancelFocusAndMeteringWithoutAsyncResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$11(final long j17) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$g
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$executeMeteringAction$10(j17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$executeMeteringAction$7(boolean z17, long j17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.lang.Integer num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if (shouldTriggerAF()) {
            if (!z17 || num == null) {
                this.mIsFocusSuccessful = true;
                this.mIsAutoFocusCompleted = true;
            } else if (this.mCurrentAfState.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.mIsFocusSuccessful = true;
                    this.mIsAutoFocusCompleted = true;
                } else if (num.intValue() == 5) {
                    this.mIsFocusSuccessful = false;
                    this.mIsAutoFocusCompleted = true;
                }
            }
        }
        if (this.mIsAutoFocusCompleted && androidx.camera.camera2.internal.Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j17)) {
            completeActionFuture(this.mIsFocusSuccessful);
            return true;
        }
        if (!this.mCurrentAfState.equals(num) && num != null) {
            this.mCurrentAfState = num;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$8(long j17) {
        if (j17 == this.mFocusTimeoutCounter) {
            this.mIsFocusSuccessful = false;
            completeActionFuture(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$9(final long j17) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$executeMeteringAction$8(j17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$startFocusAndMetering$1(final androidx.camera.core.FocusMeteringAction focusMeteringAction, final long j17, final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$j
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$startFocusAndMetering$0(kVar, focusMeteringAction, j17);
            }
        });
        return "startFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$triggerAePrecapture$3(final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$m
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$triggerAePrecapture$2(kVar);
            }
        });
        return "triggerAePrecapture";
    }

    private static int rangeLimit(int i17, int i18, int i19) {
        return java.lang.Math.min(java.lang.Math.max(i17, i19), i18);
    }

    private boolean shouldTriggerAF() {
        return this.mAfRects.length > 0;
    }

    public void addFocusMeteringOptions(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        int defaultAfMode = this.mIsInAfAutoMode ? 1 : getDefaultAfMode();
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.mCameraControl.getSupportedAfMode(defaultAfMode));
        androidx.camera.core.impl.Config.OptionPriority optionPriority = androidx.camera.core.impl.Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, valueOf, optionPriority);
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = this.mAfRects;
        if (meteringRectangleArr.length != 0) {
            builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, optionPriority);
        }
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr2 = this.mAeRects;
        if (meteringRectangleArr2.length != 0) {
            builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, optionPriority);
        }
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr3 = this.mAwbRects;
        if (meteringRectangleArr3.length != 0) {
            builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, optionPriority);
        }
    }

    public void cancelAfAeTrigger(boolean z17, boolean z18) {
        if (this.mIsActive) {
            androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
            builder.setUseRepeatingSurface(true);
            builder.setTemplateType(this.mTemplate);
            androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
            if (z17) {
                builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z18) {
                builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.addImplementationOptions(builder2.build());
            this.mCameraControl.submitCaptureRequestsInternal(java.util.Collections.singletonList(builder.build()));
        }
    }

    public wa.a cancelFocusAndMetering() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$l
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$cancelFocusAndMetering$13;
                lambda$cancelFocusAndMetering$13 = androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$cancelFocusAndMetering$13(kVar);
                return lambda$cancelFocusAndMetering$13;
            }
        });
    }

    /* renamed from: cancelFocusAndMeteringInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$cancelFocusAndMetering$12(t2.k kVar) {
        failCancelFuture("Cancelled by another cancelFocusAndMetering()");
        failActionFuture("Cancelled by cancelFocusAndMetering()");
        this.mRunningCancelCompleter = kVar;
        disableAutoCancel();
        clearAutoFocusTimeoutHandle();
        if (shouldTriggerAF()) {
            cancelAfAeTrigger(true, false);
        }
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mIsInAfAutoMode = false;
        final long updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        if (this.mRunningCancelCompleter != null) {
            final int supportedAfMode = this.mCameraControl.getSupportedAfMode(getDefaultAfMode());
            androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$e
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                public final boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                    boolean lambda$cancelFocusAndMeteringInternal$14;
                    lambda$cancelFocusAndMeteringInternal$14 = androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$cancelFocusAndMeteringInternal$14(supportedAfMode, updateSessionConfigSynchronous, totalCaptureResult);
                    return lambda$cancelFocusAndMeteringInternal$14;
                }
            };
            this.mSessionListenerForCancel = captureResultListener;
            this.mCameraControl.addCaptureResultListener(captureResultListener);
        }
    }

    public void cancelFocusAndMeteringWithoutAsyncResult() {
        lambda$cancelFocusAndMetering$12(null);
    }

    public void completeActionFuture(boolean z17) {
        clearAutoFocusTimeoutHandle();
        t2.k kVar = this.mRunningActionCompleter;
        if (kVar != null) {
            kVar.a(androidx.camera.core.FocusMeteringResult.create(z17));
            this.mRunningActionCompleter = null;
        }
    }

    public wa.a enableExternalFlashAeMode(final boolean z17) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }
        if (this.mCameraControl.getSupportedAeMode(5) != 5) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$k
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$enableExternalFlashAeMode$5;
                lambda$enableExternalFlashAeMode$5 = androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$enableExternalFlashAeMode$5(z17, kVar);
                return lambda$enableExternalFlashAeMode$5;
            }
        });
    }

    public int getDefaultAfMode() {
        return this.mTemplate != 3 ? 4 : 3;
    }

    public boolean isExternalFlashAeModeEnabled() {
        return this.mIsExternalFlashAeModeEnabled;
    }

    public boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        android.graphics.Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        android.util.Rational defaultAspectRatio = getDefaultAspectRatio();
        return (getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, cropSensorRegion, 1).isEmpty() && getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, cropSensorRegion, 2).isEmpty() && getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, cropSensorRegion, 4).isEmpty()) ? false : true;
    }

    public void setActive(boolean z17) {
        if (z17 == this.mIsActive) {
            return;
        }
        this.mIsActive = z17;
        if (this.mIsActive) {
            return;
        }
        cancelFocusAndMeteringWithoutAsyncResult();
    }

    public void setPreviewAspectRatio(android.util.Rational rational) {
        this.mPreviewAspectRatio = rational;
    }

    public void setTemplate(int i17) {
        this.mTemplate = i17;
    }

    public wa.a startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return startFocusAndMetering(focusMeteringAction, AUTO_FOCUS_TIMEOUT_DURATION);
    }

    /* renamed from: startFocusAndMeteringInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$startFocusAndMetering$0(t2.k kVar, androidx.camera.core.FocusMeteringAction focusMeteringAction, long j17) {
        if (!this.mIsActive) {
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        android.graphics.Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        android.util.Rational defaultAspectRatio = getDefaultAspectRatio();
        java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRectangles = getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, cropSensorRegion, 1);
        java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRectangles2 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, cropSensorRegion, 2);
        java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRectangles3 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, cropSensorRegion, 4);
        if (meteringRectangles.isEmpty() && meteringRectangles2.isEmpty() && meteringRectangles3.isEmpty()) {
            kVar.b(new java.lang.IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        failActionFuture("Cancelled by another startFocusAndMetering()");
        failCancelFuture("Cancelled by another startFocusAndMetering()");
        disableAutoCancel();
        this.mRunningActionCompleter = kVar;
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        executeMeteringAction((android.hardware.camera2.params.MeteringRectangle[]) meteringRectangles.toArray(meteringRectangleArr), (android.hardware.camera2.params.MeteringRectangle[]) meteringRectangles2.toArray(meteringRectangleArr), (android.hardware.camera2.params.MeteringRectangle[]) meteringRectangles3.toArray(meteringRectangleArr), focusMeteringAction, j17);
    }

    public wa.a triggerAePrecapture() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$h
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$triggerAePrecapture$3;
                lambda$triggerAePrecapture$3 = androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$triggerAePrecapture$3(kVar);
                return lambda$triggerAePrecapture$3;
            }
        });
    }

    public void triggerAf(final t2.k kVar, boolean z17) {
        if (!this.mIsActive) {
            if (kVar != null) {
                kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
        builder.setTemplateType(this.mTemplate);
        builder.setUseRepeatingSurface(true);
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z17) {
            builder2.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, java.lang.Integer.valueOf(this.mCameraControl.getSupportedAeMode(1)), androidx.camera.core.impl.Config.OptionPriority.HIGH_PRIORITY_REQUIRED);
        }
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCancelled(int i17) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.a(cameraCaptureResult);
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureFailed(int i17, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new androidx.camera.core.impl.CameraControlInternal.CameraControlException(cameraCaptureFailure));
                }
            }
        });
        this.mCameraControl.submitCaptureRequestsInternal(java.util.Collections.singletonList(builder.build()));
    }

    public wa.a startFocusAndMetering(final androidx.camera.core.FocusMeteringAction focusMeteringAction, final long j17) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$i
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$startFocusAndMetering$1;
                lambda$startFocusAndMetering$1 = androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$startFocusAndMetering$1(focusMeteringAction, j17, kVar);
                return lambda$startFocusAndMetering$1;
            }
        });
    }

    /* renamed from: triggerAePrecapture, reason: merged with bridge method [inline-methods] */
    public void lambda$triggerAePrecapture$2(final t2.k kVar) {
        androidx.camera.core.Logger.d(TAG, "triggerAePrecapture");
        if (!this.mIsActive) {
            if (kVar != null) {
                kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
        builder.setTemplateType(this.mTemplate);
        builder.setUseRepeatingSurface(true);
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.2
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCancelled(int i17) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                if (kVar != null) {
                    androidx.camera.core.Logger.d(androidx.camera.camera2.internal.FocusMeteringControl.TAG, "triggerAePrecapture: triggering capture request completed");
                    kVar.a(null);
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureFailed(int i17, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new androidx.camera.core.impl.CameraControlInternal.CameraControlException(cameraCaptureFailure));
                }
            }
        });
        this.mCameraControl.submitCaptureRequestsInternal(java.util.Collections.singletonList(builder.build()));
    }

    private void enableExternalFlashAeMode(final t2.k kVar) {
        if (!this.mIsActive) {
            if (kVar != null) {
                kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            final long updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
            androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$o
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                public final boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                    boolean lambda$enableExternalFlashAeMode$6;
                    lambda$enableExternalFlashAeMode$6 = androidx.camera.camera2.internal.FocusMeteringControl.this.lambda$enableExternalFlashAeMode$6(updateSessionConfigSynchronous, kVar, totalCaptureResult);
                    return lambda$enableExternalFlashAeMode$6;
                }
            };
            this.mSessionListenerForAeMode = captureResultListener;
            this.mCameraControl.addCaptureResultListener(captureResultListener);
        }
    }
}
