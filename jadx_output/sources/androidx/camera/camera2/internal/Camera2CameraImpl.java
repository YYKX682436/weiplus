package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class Camera2CameraImpl implements androidx.camera.core.impl.CameraInternal {
    private static final int ERROR_NONE = 0;
    private static final java.lang.String TAG = "Camera2CameraImpl";
    final androidx.camera.camera2.internal.Camera2CameraImpl.CameraAvailability mCameraAvailability;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private androidx.camera.core.impl.CameraConfig mCameraConfig;
    final androidx.camera.camera2.internal.Camera2CameraImpl.CameraConfigureAvailable mCameraConfigureAvailable;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControlInternal;
    final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;
    android.hardware.camera2.CameraDevice mCameraDevice;
    int mCameraDeviceError;
    final androidx.camera.camera2.internal.Camera2CameraInfoImpl mCameraInfoInternal;
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;
    private final androidx.camera.camera2.internal.CameraStateMachine mCameraStateMachine;
    final androidx.camera.core.impl.CameraStateRegistry mCameraStateRegistry;
    androidx.camera.camera2.internal.CaptureSessionInterface mCaptureSession;
    private final androidx.camera.camera2.internal.SynchronizedCaptureSession.OpenerBuilder mCaptureSessionOpenerBuilder;
    private final androidx.camera.camera2.internal.CaptureSessionRepository mCaptureSessionRepository;
    private final boolean mCloseCameraBeforeCreateNewSessionQuirk;
    private final boolean mConfigAndCloseQuirk;
    private final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat mDynamicRangesCompat;
    private final androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler mErrorTimeoutReopenScheduler;
    private final java.util.concurrent.Executor mExecutor;
    boolean mIsActiveResumingMode;
    private boolean mIsConfigAndCloseRequired;
    private boolean mIsConfiguringForClose;
    private boolean mIsPrimary;
    final java.lang.Object mLock;
    private androidx.camera.camera2.internal.MeteringRepeatingSession mMeteringRepeatingSession;
    private final java.util.Set<java.lang.String> mNotifyStateAttachedSet;
    private final androidx.camera.core.impl.LiveDataObservable<androidx.camera.core.impl.CameraInternal.State> mObservableState;
    final java.util.concurrent.atomic.AtomicInteger mReleaseRequestCount;
    final java.util.Map<androidx.camera.camera2.internal.CaptureSessionInterface, wa.a> mReleasedCaptureSessions;
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;
    private androidx.camera.core.impl.SessionProcessor mSessionProcessor;
    volatile androidx.camera.camera2.internal.Camera2CameraImpl.InternalState mState = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED;
    private final androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback mStateCallback;
    private final androidx.camera.camera2.internal.SupportedSurfaceCombination mSupportedSurfaceCombination;
    private int mTraceStateErrorCount;
    private final androidx.camera.core.impl.UseCaseAttachState mUseCaseAttachState;
    wa.a mUserReleaseFuture;
    t2.k mUserReleaseNotifier;

    /* loaded from: classes14.dex */
    public final class CameraAvailability extends android.hardware.camera2.CameraManager.AvailabilityCallback implements androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener {
        private boolean mCameraAvailable = true;
        private final java.lang.String mCameraId;

        public CameraAvailability(java.lang.String str) {
            this.mCameraId = str;
        }

        public boolean isCameraAvailable() {
            return this.mCameraAvailable;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(java.lang.String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = true;
                if (androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.tryOpenCameraDevice(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(java.lang.String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = false;
            }
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public void onOpenAvailable() {
            if (androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN) {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.tryOpenCameraDevice(false);
            }
        }
    }

    /* loaded from: classes14.dex */
    public final class CameraConfigureAvailable implements androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener {
        public CameraConfigureAvailable() {
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public void onConfigureAvailable() {
            if (androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED) {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.openCaptureSession();
            }
        }
    }

    /* loaded from: classes14.dex */
    public final class ControlUpdateListenerInternal implements androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback {
        public ControlUpdateListenerInternal() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = androidx.camera.camera2.internal.Camera2CameraImpl.this;
            list.getClass();
            camera2CameraImpl.submitCaptureRequests(list);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlUpdateSessionConfig() {
            androidx.camera.camera2.internal.Camera2CameraImpl.this.updateCaptureSessionConfig();
        }
    }

    /* loaded from: classes14.dex */
    public class ErrorTimeoutReopenScheduler {
        private static final long ERROR_TIMEOUT_MILLIS = 2000;
        private androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode mScheduleNode;

        /* loaded from: classes14.dex */
        public class ScheduleNode {
            private final java.util.concurrent.atomic.AtomicBoolean mIsDone = new java.util.concurrent.atomic.AtomicBoolean(false);
            private final java.util.concurrent.ScheduledFuture<?> mScheduledFuture;

            public ScheduleNode() {
                this.mScheduledFuture = androidx.camera.camera2.internal.Camera2CameraImpl.this.mScheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode.this.execute();
                    }
                }, 2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void execute() {
                if (this.mIsDone.getAndSet(true)) {
                    return;
                }
                androidx.camera.camera2.internal.Camera2CameraImpl.this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode.this.executeInternal();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void executeInternal() {
                if (androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Camera onError timeout, reopen it.");
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING);
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.mStateCallback.scheduleCameraReopen();
                } else {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Camera skip reopen at state: " + androidx.camera.camera2.internal.Camera2CameraImpl.this.mState);
                }
            }

            public void cancel() {
                this.mIsDone.set(true);
                this.mScheduledFuture.cancel(true);
            }

            public boolean isDone() {
                return this.mIsDone.get();
            }
        }

        private ErrorTimeoutReopenScheduler() {
            this.mScheduleNode = null;
        }

        public void cancel() {
            androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode = this.mScheduleNode;
            if (scheduleNode != null) {
                scheduleNode.cancel();
            }
            this.mScheduleNode = null;
        }

        public void deviceOnError() {
            androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Camera receive onErrorCallback");
            cancel();
        }

        public boolean isErrorHandling() {
            androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode = this.mScheduleNode;
            return (scheduleNode == null || scheduleNode.isDone()) ? false : true;
        }

        public void start() {
            if (androidx.camera.camera2.internal.Camera2CameraImpl.this.mState != androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING) {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Don't need the onError timeout handler.");
                return;
            }
            androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Camera waiting for onError.");
            cancel();
            this.mScheduleNode = new androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode();
        }
    }

    /* loaded from: classes14.dex */
    public enum InternalState {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* loaded from: classes14.dex */
    public final class StateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        private final androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.CameraReopenMonitor mCameraReopenMonitor;
        private final java.util.concurrent.Executor mExecutor;
        java.util.concurrent.ScheduledFuture<?> mScheduledReopenHandle;
        private androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.ScheduledReopen mScheduledReopenRunnable;
        private final java.util.concurrent.ScheduledExecutorService mScheduler;

        /* loaded from: classes14.dex */
        public class CameraReopenMonitor {
            static final int ACTIVE_REOPEN_DELAY_BASE_MS = 1000;
            static final int ACTIVE_REOPEN_LIMIT_MS = 1800000;
            static final int INVALID_TIME = -1;
            static final int REOPEN_DELAY_MS = 700;
            static final int REOPEN_LIMIT_MS = 10000;
            private final long mCameraOpenRetryMaxTimeoutInMs;
            private long mFirstReopenTime = -1;

            public CameraReopenMonitor(long j17) {
                this.mCameraOpenRetryMaxTimeoutInMs = j17;
            }

            public boolean canScheduleCameraReopen() {
                if (!(getElapsedTime() >= ((long) getReopenLimitMs()))) {
                    return true;
                }
                reset();
                return false;
            }

            public long getElapsedTime() {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                if (this.mFirstReopenTime == -1) {
                    this.mFirstReopenTime = uptimeMillis;
                }
                return uptimeMillis - this.mFirstReopenTime;
            }

            public int getReopenDelayMs() {
                if (!androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.this.shouldActiveResume()) {
                    return 700;
                }
                long elapsedTime = getElapsedTime();
                if (elapsedTime <= u04.d.f423477c) {
                    return 1000;
                }
                return elapsedTime <= 300000 ? 2000 : 4000;
            }

            public int getReopenLimitMs() {
                if (androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.this.shouldActiveResume()) {
                    long j17 = this.mCameraOpenRetryMaxTimeoutInMs;
                    return j17 > 0 ? java.lang.Math.min((int) j17, ACTIVE_REOPEN_LIMIT_MS) : ACTIVE_REOPEN_LIMIT_MS;
                }
                long j18 = this.mCameraOpenRetryMaxTimeoutInMs;
                if (j18 > 0) {
                    return java.lang.Math.min((int) j18, 10000);
                }
                return 10000;
            }

            public void reset() {
                this.mFirstReopenTime = -1L;
            }
        }

        /* loaded from: classes14.dex */
        public class ScheduledReopen implements java.lang.Runnable {
            private boolean mCancelled = false;
            private java.util.concurrent.Executor mExecutor;

            public ScheduledReopen(java.util.concurrent.Executor executor) {
                this.mExecutor = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void lambda$run$0() {
                if (this.mCancelled) {
                    return;
                }
                m3.h.e(androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING || androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING_QUIRK, null);
                if (androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.this.shouldActiveResume()) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.tryForceOpenCameraDevice(true);
                } else {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.tryOpenCameraDevice(true);
                }
            }

            public void cancel() {
                this.mCancelled = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.ScheduledReopen.this.lambda$run$0();
                    }
                });
            }
        }

        public StateCallback(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, long j17) {
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraReopenMonitor = new androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.CameraReopenMonitor(j17);
        }

        private void handleErrorOnOpen(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            m3.h.e(androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING || androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED || androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CONFIGURED || androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING || androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + androidx.camera.camera2.internal.Camera2CameraImpl.this.mState);
            if (i17 == 1 || i17 == 2 || i17 == 4) {
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CameraImpl.TAG, java.lang.String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(i17)));
                reopenCameraAfterError(i17);
                return;
            }
            androidx.camera.core.Logger.e(androidx.camera.camera2.internal.Camera2CameraImpl.TAG, "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(i17) + " closing camera.");
            androidx.camera.camera2.internal.Camera2CameraImpl.this.setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING, androidx.camera.core.CameraState.StateError.create(i17 == 3 ? 5 : 6));
            androidx.camera.camera2.internal.Camera2CameraImpl.this.closeCamera(false);
        }

        private void reopenCameraAfterError(int i17) {
            int i18 = 1;
            m3.h.e(androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDeviceError != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i17 == 1) {
                i18 = 2;
            } else if (i17 != 2) {
                i18 = 3;
            }
            androidx.camera.camera2.internal.Camera2CameraImpl.this.setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING, androidx.camera.core.CameraState.StateError.create(i18));
            androidx.camera.camera2.internal.Camera2CameraImpl.this.closeCamera(false);
        }

        public boolean cancelScheduledReopen() {
            if (this.mScheduledReopenHandle == null) {
                return false;
            }
            androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Cancelling scheduled re-open: " + this.mScheduledReopenRunnable);
            this.mScheduledReopenRunnable.cancel();
            this.mScheduledReopenRunnable = null;
            this.mScheduledReopenHandle.cancel(false);
            this.mScheduledReopenHandle = null;
            return true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("CameraDevice.onClosed()");
            m3.h.e(androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDevice == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = androidx.camera.camera2.internal.Camera2CameraImpl.this.mState.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                m3.h.e(androidx.camera.camera2.internal.Camera2CameraImpl.this.isSessionCloseComplete(), null);
                androidx.camera.camera2.internal.Camera2CameraImpl.this.configAndCloseIfNeeded();
                return;
            }
            if (ordinal != 5 && ordinal != 6) {
                throw new java.lang.IllegalStateException("Camera closed while in state: " + androidx.camera.camera2.internal.Camera2CameraImpl.this.mState);
            }
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = androidx.camera.camera2.internal.Camera2CameraImpl.this;
            if (camera2CameraImpl.mCameraDeviceError == 0) {
                camera2CameraImpl.tryOpenCameraDevice(false);
                return;
            }
            camera2CameraImpl.debugLog("Camera closed due to error: " + androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDeviceError));
            scheduleCameraReopen();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = androidx.camera.camera2.internal.Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = i17;
            camera2CameraImpl.mErrorTimeoutReopenScheduler.deviceOnError();
            int ordinal = androidx.camera.camera2.internal.Camera2CameraImpl.this.mState.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        androidx.camera.core.Logger.d(androidx.camera.camera2.internal.Camera2CameraImpl.TAG, java.lang.String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(i17), androidx.camera.camera2.internal.Camera2CameraImpl.this.mState.name()));
                        handleErrorOnOpen(cameraDevice, i17);
                        return;
                    default:
                        throw new java.lang.IllegalStateException("onError() should not be possible from state: " + androidx.camera.camera2.internal.Camera2CameraImpl.this.mState);
                }
            }
            androidx.camera.core.Logger.e(androidx.camera.camera2.internal.Camera2CameraImpl.TAG, java.lang.String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(i17), androidx.camera.camera2.internal.Camera2CameraImpl.this.mState.name()));
            androidx.camera.camera2.internal.Camera2CameraImpl.this.closeCamera(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("CameraDevice.onOpened()");
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = androidx.camera.camera2.internal.Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = 0;
            resetReopenMonitor();
            int ordinal = androidx.camera.camera2.internal.Camera2CameraImpl.this.mState.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                m3.h.e(androidx.camera.camera2.internal.Camera2CameraImpl.this.isSessionCloseComplete(), null);
                androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDevice.close();
                androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDevice = null;
            } else {
                if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                    throw new java.lang.IllegalStateException("onOpened() should not be possible from state: " + androidx.camera.camera2.internal.Camera2CameraImpl.this.mState);
                }
                androidx.camera.camera2.internal.Camera2CameraImpl.this.setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED);
                androidx.camera.core.impl.CameraStateRegistry cameraStateRegistry = androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraStateRegistry;
                java.lang.String id6 = cameraDevice.getId();
                androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl2 = androidx.camera.camera2.internal.Camera2CameraImpl.this;
                if (cameraStateRegistry.tryOpenCaptureSession(id6, camera2CameraImpl2.mCameraCoordinator.getPairedConcurrentCameraId(camera2CameraImpl2.mCameraDevice.getId()))) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.openCaptureSession();
                }
            }
        }

        public void resetReopenMonitor() {
            this.mCameraReopenMonitor.reset();
        }

        public void scheduleCameraReopen() {
            m3.h.e(this.mScheduledReopenRunnable == null, null);
            m3.h.e(this.mScheduledReopenHandle == null, null);
            if (!this.mCameraReopenMonitor.canScheduleCameraReopen()) {
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.Camera2CameraImpl.TAG, "Camera reopening attempted for " + this.mCameraReopenMonitor.getReopenLimitMs() + "ms without success.");
                androidx.camera.camera2.internal.Camera2CameraImpl.this.setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN, null, false);
                return;
            }
            this.mScheduledReopenRunnable = new androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.ScheduledReopen(this.mExecutor);
            androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Attempting camera re-open in " + this.mCameraReopenMonitor.getReopenDelayMs() + "ms: " + this.mScheduledReopenRunnable + " activeResuming = " + androidx.camera.camera2.internal.Camera2CameraImpl.this.mIsActiveResumingMode);
            this.mScheduledReopenHandle = this.mScheduler.schedule(this.mScheduledReopenRunnable, (long) this.mCameraReopenMonitor.getReopenDelayMs(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        public boolean shouldActiveResume() {
            int i17;
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = androidx.camera.camera2.internal.Camera2CameraImpl.this;
            return camera2CameraImpl.mIsActiveResumingMode && ((i17 = camera2CameraImpl.mCameraDeviceError) == 1 || i17 == 2);
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class UseCaseInfo {
        public static androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo create(java.lang.String str, java.lang.Class<?> cls, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, android.util.Size size, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
            return new androidx.camera.camera2.internal.AutoValue_Camera2CameraImpl_UseCaseInfo(str, cls, sessionConfig, useCaseConfig, size, streamSpec, list);
        }

        public static androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo from(androidx.camera.core.UseCase useCase, boolean z17) {
            return create(androidx.camera.camera2.internal.Camera2CameraImpl.getUseCaseId(useCase), useCase.getClass(), z17 ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig(), useCase.getCurrentConfig(), useCase.getAttachedSurfaceResolution(), useCase.getAttachedStreamSpec(), androidx.camera.camera2.internal.Camera2CameraImpl.getCaptureTypes(useCase));
        }

        public abstract java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes();

        public abstract androidx.camera.core.impl.SessionConfig getSessionConfig();

        public abstract androidx.camera.core.impl.StreamSpec getStreamSpec();

        public abstract android.util.Size getSurfaceResolution();

        public abstract androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig();

        public abstract java.lang.String getUseCaseId();

        public abstract java.lang.Class<?> getUseCaseType();
    }

    public Camera2CameraImpl(android.content.Context context, androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, java.lang.String str, androidx.camera.camera2.internal.Camera2CameraInfoImpl camera2CameraInfoImpl, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.core.impl.CameraStateRegistry cameraStateRegistry, java.util.concurrent.Executor executor, android.os.Handler handler, androidx.camera.camera2.internal.DisplayInfoManager displayInfoManager, long j17) {
        androidx.camera.core.impl.LiveDataObservable<androidx.camera.core.impl.CameraInternal.State> liveDataObservable = new androidx.camera.core.impl.LiveDataObservable<>();
        this.mObservableState = liveDataObservable;
        this.mCameraDeviceError = 0;
        this.mReleaseRequestCount = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mReleasedCaptureSessions = new java.util.LinkedHashMap();
        this.mTraceStateErrorCount = 0;
        this.mIsConfigAndCloseRequired = false;
        this.mIsConfiguringForClose = false;
        this.mIsPrimary = true;
        this.mNotifyStateAttachedSet = new java.util.HashSet();
        this.mCameraConfig = androidx.camera.core.impl.CameraConfigs.defaultConfig();
        this.mLock = new java.lang.Object();
        this.mIsActiveResumingMode = false;
        this.mErrorTimeoutReopenScheduler = new androidx.camera.camera2.internal.Camera2CameraImpl.ErrorTimeoutReopenScheduler();
        this.mCameraManager = cameraManagerCompat;
        this.mCameraCoordinator = cameraCoordinator;
        this.mCameraStateRegistry = cameraStateRegistry;
        java.util.concurrent.ScheduledExecutorService newHandlerExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(handler);
        this.mScheduledExecutorService = newHandlerExecutor;
        java.util.concurrent.Executor newSequentialExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = newSequentialExecutor;
        this.mStateCallback = new androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback(newSequentialExecutor, newHandlerExecutor, j17);
        this.mUseCaseAttachState = new androidx.camera.core.impl.UseCaseAttachState(str);
        liveDataObservable.postValue(androidx.camera.core.impl.CameraInternal.State.CLOSED);
        androidx.camera.camera2.internal.CameraStateMachine cameraStateMachine = new androidx.camera.camera2.internal.CameraStateMachine(cameraStateRegistry);
        this.mCameraStateMachine = cameraStateMachine;
        androidx.camera.camera2.internal.CaptureSessionRepository captureSessionRepository = new androidx.camera.camera2.internal.CaptureSessionRepository(newSequentialExecutor);
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mDisplayInfoManager = displayInfoManager;
        try {
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = new androidx.camera.camera2.internal.Camera2CameraControlImpl(cameraCharacteristicsCompat, newHandlerExecutor, newSequentialExecutor, new androidx.camera.camera2.internal.Camera2CameraImpl.ControlUpdateListenerInternal(), camera2CameraInfoImpl.getCameraQuirks());
            this.mCameraControlInternal = camera2CameraControlImpl;
            this.mCameraInfoInternal = camera2CameraInfoImpl;
            camera2CameraInfoImpl.linkWithCameraControl(camera2CameraControlImpl);
            camera2CameraInfoImpl.setCameraStateSource(cameraStateMachine.getStateLiveData());
            this.mDynamicRangesCompat = androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
            this.mCaptureSession = newCaptureSession();
            this.mCaptureSessionOpenerBuilder = new androidx.camera.camera2.internal.SynchronizedCaptureSession.OpenerBuilder(newSequentialExecutor, newHandlerExecutor, handler, captureSessionRepository, camera2CameraInfoImpl.getCameraQuirks(), androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.getAll());
            this.mCloseCameraBeforeCreateNewSessionQuirk = camera2CameraInfoImpl.getCameraQuirks().contains(androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.class);
            this.mConfigAndCloseQuirk = camera2CameraInfoImpl.getCameraQuirks().contains(androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk.class);
            androidx.camera.camera2.internal.Camera2CameraImpl.CameraAvailability cameraAvailability = new androidx.camera.camera2.internal.Camera2CameraImpl.CameraAvailability(str);
            this.mCameraAvailability = cameraAvailability;
            androidx.camera.camera2.internal.Camera2CameraImpl.CameraConfigureAvailable cameraConfigureAvailable = new androidx.camera.camera2.internal.Camera2CameraImpl.CameraConfigureAvailable();
            this.mCameraConfigureAvailable = cameraConfigureAvailable;
            cameraStateRegistry.registerCamera(this, newSequentialExecutor, cameraConfigureAvailable, cameraAvailability);
            cameraManagerCompat.registerAvailabilityCallback(newSequentialExecutor, cameraAvailability);
            this.mSupportedSurfaceCombination = new androidx.camera.camera2.internal.SupportedSurfaceCombination(context, str, cameraManagerCompat, new androidx.camera.camera2.internal.CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.1
                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public android.media.CamcorderProfile get(int i17, int i18) {
                    return android.media.CamcorderProfile.get(i17, i18);
                }

                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public boolean hasProfile(int i17, int i18) {
                    return android.media.CamcorderProfile.hasProfile(i17, i18);
                }
            });
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            throw androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(e17);
        }
    }

    private void addMeteringRepeating() {
        androidx.camera.camera2.internal.MeteringRepeatingSession meteringRepeatingSession = this.mMeteringRepeatingSession;
        if (meteringRepeatingSession != null) {
            java.lang.String meteringRepeatingId = getMeteringRepeatingId(meteringRepeatingSession);
            androidx.camera.core.impl.UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            androidx.camera.core.impl.SessionConfig sessionConfig = this.mMeteringRepeatingSession.getSessionConfig();
            androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = this.mMeteringRepeatingSession.getUseCaseConfig();
            androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING;
            useCaseAttachState.setUseCaseAttached(meteringRepeatingId, sessionConfig, useCaseConfig, null, java.util.Collections.singletonList(captureType));
            this.mUseCaseAttachState.setUseCaseActive(meteringRepeatingId, this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig(), null, java.util.Collections.singletonList(captureType));
        }
    }

    private void addOrRemoveMeteringRepeatingUseCase() {
        androidx.camera.core.impl.SessionConfig build = this.mUseCaseAttachState.getAttachedBuilder().build();
        androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = build.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = build.getSurfaces().size();
        if (build.getSurfaces().isEmpty()) {
            return;
        }
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            if (this.mMeteringRepeatingSession == null) {
                this.mMeteringRepeatingSession = new androidx.camera.camera2.internal.MeteringRepeatingSession(this.mCameraInfoInternal.getCameraCharacteristicsCompat(), this.mDisplayInfoManager, new androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$j
                    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
                    public final void onSurfaceReset() {
                        androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$addOrRemoveMeteringRepeatingUseCase$17();
                    }
                });
            }
            if (isSurfaceCombinationWithMeteringRepeatingSupported()) {
                addMeteringRepeating();
                return;
            } else {
                androidx.camera.core.Logger.e(TAG, "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            removeMeteringRepeating();
            return;
        }
        if (size >= 2) {
            removeMeteringRepeating();
            return;
        }
        if (this.mMeteringRepeatingSession != null && !isSurfaceCombinationWithMeteringRepeatingSupported()) {
            removeMeteringRepeating();
            return;
        }
        androidx.camera.core.Logger.d(TAG, "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    private boolean checkAndAttachRepeatingSurface(androidx.camera.core.impl.CaptureConfig.Builder builder) {
        if (!builder.getSurfaces().isEmpty()) {
            androidx.camera.core.Logger.w(TAG, "The capture config builder already has surface inside.");
            return false;
        }
        java.util.Iterator<androidx.camera.core.impl.SessionConfig> it = this.mUseCaseAttachState.getActiveAndAttachedSessionConfigs().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = it.next().getRepeatingCaptureConfig();
            java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = repeatingCaptureConfig.getSurfaces();
            if (!surfaces.isEmpty()) {
                if (repeatingCaptureConfig.getPreviewStabilizationMode() != 0) {
                    builder.setPreviewStabilization(repeatingCaptureConfig.getPreviewStabilizationMode());
                }
                if (repeatingCaptureConfig.getVideoStabilizationMode() != 0) {
                    builder.setVideoStabilization(repeatingCaptureConfig.getVideoStabilizationMode());
                }
                java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it6 = surfaces.iterator();
                while (it6.hasNext()) {
                    builder.addSurface(it6.next());
                }
            }
        }
        if (!builder.getSurfaces().isEmpty()) {
            return true;
        }
        androidx.camera.core.Logger.w(TAG, "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInternal() {
        debugLog("Closing camera.");
        switch (this.mState.ordinal()) {
            case 3:
                m3.h.e(this.mCameraDevice == null, null);
                setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED);
                return;
            case 4:
            default:
                debugLog("close() ignored due to being in state: " + this.mState);
                return;
            case 5:
            case 6:
            case 7:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    r2 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING);
                if (r2) {
                    m3.h.e(isSessionCloseComplete(), null);
                    configAndCloseIfNeeded();
                    return;
                }
                return;
            case 8:
            case 9:
                setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING);
                closeCamera(false);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public wa.a configAndClose(android.hardware.camera2.CameraDevice cameraDevice) {
        final androidx.camera.camera2.internal.CaptureSession captureSession = new androidx.camera.camera2.internal.CaptureSession(this.mDynamicRangesCompat);
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        final androidx.camera.core.impl.ImmediateSurface immediateSurface = new androidx.camera.core.impl.ImmediateSurface(surface);
        immediateSurface.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$l
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.lambda$configAndClose$2(surface, surfaceTexture);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
        builder.addNonRepeatingSurface(immediateSurface);
        builder.setTemplateType(1);
        debugLog("Start configAndClose.");
        return androidx.camera.core.impl.utils.futures.FutureChain.from(androidx.camera.core.impl.utils.futures.Futures.transformAsyncOnCompletion(captureSession.open(builder.build(), cameraDevice, this.mCaptureSessionOpenerBuilder.build()))).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$o
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final wa.a apply(java.lang.Object obj) {
                wa.a lambda$configAndClose$3;
                lambda$configAndClose$3 = androidx.camera.camera2.internal.Camera2CameraImpl.lambda$configAndClose$3(androidx.camera.camera2.internal.CaptureSession.this, immediateSurface, (java.lang.Void) obj);
                return lambda$configAndClose$3;
            }
        }, this.mExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configAndCloseIfNeeded() {
        m3.h.e(this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING || this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING, null);
        m3.h.e(this.mReleasedCaptureSessions.isEmpty(), null);
        if (!this.mIsConfigAndCloseRequired) {
            finishClose();
            return;
        }
        if (this.mIsConfiguringForClose) {
            debugLog("Ignored since configAndClose is processing");
            return;
        }
        if (!this.mCameraAvailability.isCameraAvailable()) {
            this.mIsConfigAndCloseRequired = false;
            finishClose();
            debugLog("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            debugLog("Open camera to configAndClose");
            wa.a openCameraConfigAndClose = openCameraConfigAndClose();
            this.mIsConfiguringForClose = true;
            openCameraConfigAndClose.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$s
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$configAndCloseIfNeeded$0();
                }
            }, this.mExecutor);
        }
    }

    private android.hardware.camera2.CameraDevice.StateCallback createDeviceStateCallback() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
        arrayList.add(this.mStateCallback);
        return androidx.camera.camera2.internal.CameraDeviceStateCallbacks.createComboCallback(arrayList);
    }

    private int getCameraMode() {
        synchronized (this.mLock) {
            return this.mCameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
        }
    }

    public static java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes(androidx.camera.core.UseCase useCase) {
        if (useCase.getCamera() == null) {
            return null;
        }
        return androidx.camera.core.streamsharing.StreamSharing.getCaptureTypes(useCase);
    }

    public static java.lang.String getErrorMessage(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static java.lang.String getMeteringRepeatingId(androidx.camera.camera2.internal.MeteringRepeatingSession meteringRepeatingSession) {
        return meteringRepeatingSession.getName() + meteringRepeatingSession.hashCode();
    }

    private wa.a getOrCreateUserReleaseFuture() {
        if (this.mUserReleaseFuture == null) {
            if (this.mState != androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED) {
                this.mUserReleaseFuture = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$q
                    @Override // t2.m
                    public final java.lang.Object attachCompleter(t2.k kVar) {
                        java.lang.Object lambda$getOrCreateUserReleaseFuture$6;
                        lambda$getOrCreateUserReleaseFuture$6 = androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$getOrCreateUserReleaseFuture$6(kVar);
                        return lambda$getOrCreateUserReleaseFuture$6;
                    }
                });
            } else {
                this.mUserReleaseFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
        }
        return this.mUserReleaseFuture;
    }

    public static java.lang.String getUseCaseId(androidx.camera.core.UseCase useCase) {
        return useCase.getName() + useCase.hashCode();
    }

    private boolean isSurfaceCombinationWithMeteringRepeatingSupported() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int cameraMode = getCameraMode();
        for (androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo : this.mUseCaseAttachState.getAttachedUseCaseInfo()) {
            if (useCaseAttachInfo.getCaptureTypes() == null || useCaseAttachInfo.getCaptureTypes().get(0) != androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                if (useCaseAttachInfo.getStreamSpec() == null || useCaseAttachInfo.getCaptureTypes() == null) {
                    androidx.camera.core.Logger.w(TAG, "Invalid stream spec or capture types in " + useCaseAttachInfo);
                    return false;
                }
                androidx.camera.core.impl.SessionConfig sessionConfig = useCaseAttachInfo.getSessionConfig();
                androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = useCaseAttachInfo.getUseCaseConfig();
                for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : sessionConfig.getSurfaces()) {
                    arrayList.add(androidx.camera.core.impl.AttachedSurfaceInfo.create(this.mSupportedSurfaceCombination.transformSurfaceConfig(cameraMode, useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize()), useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize(), useCaseAttachInfo.getStreamSpec().getDynamicRange(), useCaseAttachInfo.getCaptureTypes(), useCaseAttachInfo.getStreamSpec().getImplementationOptions(), useCaseConfig.getTargetFrameRate(null)));
                }
            }
        }
        this.mMeteringRepeatingSession.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(this.mMeteringRepeatingSession.getUseCaseConfig(), java.util.Collections.singletonList(this.mMeteringRepeatingSession.getMeteringRepeatingSize()));
        try {
            this.mSupportedSurfaceCombination.getSuggestedStreamSpecifications(cameraMode, arrayList, hashMap, false, false);
            debugLog("Surface combination with metering repeating supported!");
            return true;
        } catch (java.lang.IllegalArgumentException e17) {
            debugLog("Surface combination with metering repeating  not supported!", e17);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addOrRemoveMeteringRepeatingUseCase$17() {
        if (isMeteringRepeatingAttached()) {
            resetUseCase(getMeteringRepeatingId(this.mMeteringRepeatingSession), this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig(), null, java.util.Collections.singletonList(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachUseCases$15(java.util.List list) {
        try {
            tryAttachUseCases(list);
        } finally {
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$configAndClose$2(android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wa.a lambda$configAndClose$3(androidx.camera.camera2.internal.CaptureSession captureSession, androidx.camera.core.impl.DeferrableSurface deferrableSurface, java.lang.Void r27) {
        captureSession.close();
        deferrableSurface.close();
        return captureSession.release(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$configAndCloseIfNeeded$0() {
        this.mIsConfiguringForClose = false;
        this.mIsConfigAndCloseRequired = false;
        debugLog("OpenCameraConfigAndClose is done, state: " + this.mState);
        int ordinal = this.mState.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            m3.h.e(isSessionCloseComplete(), null);
            finishClose();
            return;
        }
        if (ordinal != 6) {
            debugLog("OpenCameraConfigAndClose finished while in state: " + this.mState);
        } else {
            if (this.mCameraDeviceError == 0) {
                tryOpenCameraDevice(false);
                return;
            }
            debugLog("OpenCameraConfigAndClose in error: " + getErrorMessage(this.mCameraDeviceError));
            this.mStateCallback.scheduleCameraReopen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$getOrCreateUserReleaseFuture$6(t2.k kVar) {
        m3.h.e(this.mUserReleaseNotifier == null, "Camera can only be released once, so release completer should be null on creation.");
        this.mUserReleaseNotifier = kVar;
        return "Release[camera=" + this + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isMeteringRepeatingAttached$13(t2.k kVar) {
        androidx.camera.camera2.internal.MeteringRepeatingSession meteringRepeatingSession = this.mMeteringRepeatingSession;
        if (meteringRepeatingSession == null) {
            kVar.a(java.lang.Boolean.FALSE);
        } else {
            kVar.a(java.lang.Boolean.valueOf(this.mUseCaseAttachState.isUseCaseAttached(getMeteringRepeatingId(meteringRepeatingSession))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$isMeteringRepeatingAttached$14(final t2.k kVar) {
        try {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$t
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$isMeteringRepeatingAttached$13(kVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            kVar.b(new java.lang.RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isUseCaseAttached$11(t2.k kVar, java.lang.String str) {
        kVar.a(java.lang.Boolean.valueOf(this.mUseCaseAttachState.isUseCaseAttached(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$isUseCaseAttached$12(final java.lang.String str, final t2.k kVar) {
        try {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$i
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$isUseCaseAttached$11(kVar, str);
                }
            });
            return "isUseCaseAttached";
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            kVar.b(new java.lang.RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseActive$7(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List list) {
        debugLog("Use case " + str + " ACTIVE");
        this.mUseCaseAttachState.setUseCaseActive(str, sessionConfig, useCaseConfig, streamSpec, list);
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        updateCaptureSessionConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseInactive$8(java.lang.String str) {
        debugLog("Use case " + str + " INACTIVE");
        this.mUseCaseAttachState.setUseCaseInactive(str);
        updateCaptureSessionConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseUpdated$9(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List list) {
        debugLog("Use case " + str + " UPDATED");
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        updateCaptureSessionConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$openCameraConfigAndClose$1(final t2.k kVar) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
            arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
            arrayList.add(new android.hardware.camera2.CameraDevice.StateCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.2
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera closed");
                    kVar.a(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera disconnected");
                    kVar.a(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera error " + i17);
                    kVar.a(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onOpened(final android.hardware.camera2.CameraDevice cameraDevice) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera opened");
                    wa.a configAndClose = androidx.camera.camera2.internal.Camera2CameraImpl.this.configAndClose(cameraDevice);
                    java.util.Objects.requireNonNull(cameraDevice);
                    configAndClose.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$2$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraDevice.close();
                        }
                    }, androidx.camera.camera2.internal.Camera2CameraImpl.this.mExecutor);
                }
            });
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, androidx.camera.camera2.internal.CameraDeviceStateCallbacks.createComboCallback(arrayList));
            return "configAndCloseTask";
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat | java.lang.SecurityException e17) {
            debugLog("Unable to open camera for configAndClose: " + e17.getMessage(), e17);
            kVar.b(e17);
            return "configAndCloseTask";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postSurfaceClosedError$19(androidx.camera.core.impl.SessionConfig.ErrorListener errorListener, androidx.camera.core.impl.SessionConfig sessionConfig) {
        errorListener.onError(sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$4(t2.k kVar) {
        androidx.camera.core.impl.utils.futures.Futures.propagate(releaseInternal(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$release$5(final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$d
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$release$4(kVar);
            }
        });
        return "Release[request=" + this.mReleaseRequestCount.getAndIncrement() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetUseCase$10(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List list) {
        debugLog("Use case " + str + " RESET");
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        addOrRemoveMeteringRepeatingUseCase();
        resetCaptureSession(false);
        updateCaptureSessionConfig();
        if (this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED) {
            openCaptureSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setActiveResumingMode$18(boolean z17) {
        this.mIsActiveResumingMode = z17;
        if (z17 && this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN) {
            tryForceOpenCameraDevice(false);
        }
    }

    private androidx.camera.camera2.internal.CaptureSessionInterface newCaptureSession() {
        synchronized (this.mLock) {
            if (this.mSessionProcessor == null) {
                return new androidx.camera.camera2.internal.CaptureSession(this.mDynamicRangesCompat, this.mCameraInfoInternal.getCameraQuirks());
            }
            return new androidx.camera.camera2.internal.ProcessingCaptureSession(this.mSessionProcessor, this.mCameraInfoInternal, this.mDynamicRangesCompat, this.mExecutor, this.mScheduledExecutorService);
        }
    }

    private void notifyStateAttachedAndCameraControlReady(java.util.List<androidx.camera.core.UseCase> list) {
        for (androidx.camera.core.UseCase useCase : list) {
            java.lang.String useCaseId = getUseCaseId(useCase);
            if (!this.mNotifyStateAttachedSet.contains(useCaseId)) {
                this.mNotifyStateAttachedSet.add(useCaseId);
                useCase.onStateAttached();
                useCase.onCameraControlReady();
            }
        }
    }

    private void notifyStateDetachedToUseCases(java.util.List<androidx.camera.core.UseCase> list) {
        for (androidx.camera.core.UseCase useCase : list) {
            java.lang.String useCaseId = getUseCaseId(useCase);
            if (this.mNotifyStateAttachedSet.contains(useCaseId)) {
                useCase.onStateDetached();
                this.mNotifyStateAttachedSet.remove(useCaseId);
            }
        }
    }

    private wa.a openCameraConfigAndClose() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$u
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$openCameraConfigAndClose$1;
                lambda$openCameraConfigAndClose$1 = androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$openCameraConfigAndClose$1(kVar);
                return lambda$openCameraConfigAndClose$1;
            }
        });
    }

    private void openCameraDevice(boolean z17) {
        if (!z17) {
            this.mStateCallback.resetReopenMonitor();
        }
        this.mStateCallback.cancelScheduledReopen();
        this.mErrorTimeoutReopenScheduler.cancel();
        debugLog("Opening camera.");
        setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING);
        try {
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, createDeviceStateCallback());
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            debugLog("Unable to open camera due to " + e17.getMessage());
            if (e17.getReason() != 10001) {
                this.mErrorTimeoutReopenScheduler.start();
            } else {
                setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED, androidx.camera.core.CameraState.StateError.create(7, e17));
            }
        } catch (java.lang.SecurityException e18) {
            debugLog("Unable to open camera due to " + e18.getMessage());
            setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING);
            this.mStateCallback.scheduleCameraReopen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInternal() {
        int ordinal = this.mState.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            tryForceOpenCameraDevice(false);
            return;
        }
        if (ordinal != 4) {
            debugLog("open() ignored due to being in state: " + this.mState);
            return;
        }
        setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING);
        if (isSessionCloseComplete() || this.mIsConfiguringForClose || this.mCameraDeviceError != 0) {
            return;
        }
        m3.h.e(this.mCameraDevice != null, "Camera Device should be open if session close is not complete");
        setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED);
        openCaptureSession();
    }

    private wa.a releaseInternal() {
        wa.a orCreateUserReleaseFuture = getOrCreateUserReleaseFuture();
        switch (this.mState.ordinal()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    r2 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING);
                if (r2) {
                    m3.h.e(isSessionCloseComplete(), null);
                    configAndCloseIfNeeded();
                }
                return orCreateUserReleaseFuture;
            case 2:
            case 3:
                m3.h.e(this.mCameraDevice == null, null);
                setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING);
                m3.h.e(isSessionCloseComplete(), null);
                configAndCloseIfNeeded();
                return orCreateUserReleaseFuture;
            case 8:
            case 9:
                setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING);
                closeCamera(false);
                return orCreateUserReleaseFuture;
            default:
                debugLog("release() ignored due to being in state: " + this.mState);
                return orCreateUserReleaseFuture;
        }
    }

    private void removeMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            this.mUseCaseAttachState.setUseCaseDetached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mUseCaseAttachState.setUseCaseInactive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mMeteringRepeatingSession.clear();
            this.mMeteringRepeatingSession = null;
        }
    }

    private void resetUseCase(final java.lang.String str, final androidx.camera.core.impl.SessionConfig sessionConfig, final androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, final androidx.camera.core.impl.StreamSpec streamSpec, final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$g
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$resetUseCase$10(str, sessionConfig, useCaseConfig, streamSpec, list);
            }
        });
    }

    private java.util.Collection<androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo> toUseCaseInfos(java.util.Collection<androidx.camera.core.UseCase> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.UseCase> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo.from(it.next(), this.mIsPrimary));
        }
        return arrayList;
    }

    private void tryAttachUseCases(java.util.Collection<androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo> collection) {
        android.util.Size surfaceResolution;
        boolean isEmpty = this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Rational rational = null;
        for (androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo useCaseInfo : collection) {
            if (!this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.setUseCaseAttached(useCaseInfo.getUseCaseId(), useCaseInfo.getSessionConfig(), useCaseInfo.getUseCaseConfig(), useCaseInfo.getStreamSpec(), useCaseInfo.getCaptureTypes());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == androidx.camera.core.Preview.class && (surfaceResolution = useCaseInfo.getSurfaceResolution()) != null) {
                    rational = new android.util.Rational(surfaceResolution.getWidth(), surfaceResolution.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + android.text.TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.mCameraControlInternal.setActive(true);
            this.mCameraControlInternal.incrementUseCount();
        }
        addOrRemoveMeteringRepeatingUseCase();
        updateZslDisabledByUseCaseConfigStatus();
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED) {
            openCaptureSession();
        } else {
            openInternal();
        }
        if (rational != null) {
            this.mCameraControlInternal.setPreviewAspectRatio(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryDetachUseCases, reason: merged with bridge method [inline-methods] */
    public void lambda$detachUseCases$16(java.util.Collection<androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        for (androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo useCaseInfo : collection) {
            if (this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.removeUseCase(useCaseInfo.getUseCaseId());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == androidx.camera.core.Preview.class) {
                    z17 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + android.text.TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z17) {
            this.mCameraControlInternal.setPreviewAspectRatio(null);
        }
        addOrRemoveMeteringRepeatingUseCase();
        if (this.mUseCaseAttachState.getAttachedUseCaseConfigs().isEmpty()) {
            this.mCameraControlInternal.setZslDisabledByUserCaseConfig(false);
        } else {
            updateZslDisabledByUseCaseConfigStatus();
        }
        if (this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty()) {
            this.mCameraControlInternal.decrementUseCount();
            resetCaptureSession(false);
            this.mCameraControlInternal.setActive(false);
            this.mCaptureSession = newCaptureSession();
            closeInternal();
            return;
        }
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED) {
            openCaptureSession();
        }
    }

    private void updateZslDisabledByUseCaseConfigStatus() {
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = this.mUseCaseAttachState.getAttachedUseCaseConfigs().iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            z17 |= it.next().isZslDisabled(false);
        }
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z17);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.mCameraControlInternal.incrementUseCount();
        notifyStateAttachedAndCameraControlReady(new java.util.ArrayList<>(arrayList));
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(toUseCaseInfos(arrayList));
        try {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$n
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$attachUseCases$15(arrayList2);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            debugLog("Unable to attach use cases.", e17);
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$m
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.closeInternal();
            }
        });
    }

    public void closeCamera(boolean z17) {
        m3.h.e(this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING || this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING || (this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING && this.mCameraDeviceError != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.mState + " (error: " + getErrorMessage(this.mCameraDeviceError) + ")");
        resetCaptureSession(z17);
        this.mCaptureSession.cancelIssuedCaptureRequests();
    }

    public void debugLog(java.lang.String str) {
        debugLog(str, null);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(toUseCaseInfos(arrayList));
        notifyStateDetachedToUseCases(new java.util.ArrayList<>(arrayList));
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$k
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$detachUseCases$16(arrayList2);
            }
        });
    }

    public androidx.camera.core.impl.SessionConfig findSessionConfigForSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        for (androidx.camera.core.impl.SessionConfig sessionConfig : this.mUseCaseAttachState.getAttachedSessionConfigs()) {
            if (sessionConfig.getSurfaces().contains(deferrableSurface)) {
                return sessionConfig;
            }
        }
        return null;
    }

    public void finishClose() {
        m3.h.e(this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING || this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING, null);
        m3.h.e(this.mReleasedCaptureSessions.isEmpty(), null);
        this.mCameraDevice = null;
        if (this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING) {
            setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED);
            return;
        }
        this.mCameraManager.unregisterAvailabilityCallback(this.mCameraAvailability);
        setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED);
        t2.k kVar = this.mUserReleaseNotifier;
        if (kVar != null) {
            kVar.a(null);
            this.mUserReleaseNotifier = null;
        }
    }

    public androidx.camera.camera2.internal.Camera2CameraImpl.CameraAvailability getCameraAvailability() {
        return this.mCameraAvailability;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.CameraControlInternal getCameraControlInternal() {
        return this.mCameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal() {
        return this.mCameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState() {
        return this.mObservableState;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public androidx.camera.core.impl.CameraConfig getExtendedConfig() {
        return this.mCameraConfig;
    }

    public boolean isMeteringRepeatingAttached() {
        try {
            return ((java.lang.Boolean) ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$r
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$isMeteringRepeatingAttached$14;
                    lambda$isMeteringRepeatingAttached$14 = androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$isMeteringRepeatingAttached$14(kVar);
                    return lambda$isMeteringRepeatingAttached$14;
                }
            })).get()).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Unable to check if MeteringRepeating is attached.", e17);
        }
    }

    public boolean isSessionCloseComplete() {
        return this.mReleasedCaptureSessions.isEmpty();
    }

    public boolean isUseCaseAttached(androidx.camera.core.UseCase useCase) {
        try {
            final java.lang.String useCaseId = getUseCaseId(useCase);
            return ((java.lang.Boolean) ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$f
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$isUseCaseAttached$12;
                    lambda$isUseCaseAttached$12 = androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$isUseCaseAttached$12(useCaseId, kVar);
                    return lambda$isUseCaseAttached$12;
                }
            })).get()).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Unable to check if use case is attached.", e17);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(androidx.camera.core.UseCase useCase) {
        useCase.getClass();
        final java.lang.String useCaseId = getUseCaseId(useCase);
        final androidx.camera.core.impl.SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        final androidx.camera.core.impl.UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final androidx.camera.core.impl.StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$onUseCaseActive$7(useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(androidx.camera.core.UseCase useCase) {
        useCase.getClass();
        final java.lang.String useCaseId = getUseCaseId(useCase);
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$onUseCaseInactive$8(useCaseId);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(androidx.camera.core.UseCase useCase) {
        useCase.getClass();
        androidx.camera.core.impl.SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        resetUseCase(getUseCaseId(useCase), sessionConfig, useCase.getCurrentConfig(), useCase.getAttachedStreamSpec(), getCaptureTypes(useCase));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(androidx.camera.core.UseCase useCase) {
        useCase.getClass();
        final java.lang.String useCaseId = getUseCaseId(useCase);
        final androidx.camera.core.impl.SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        final androidx.camera.core.impl.UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final androidx.camera.core.impl.StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$e
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$onUseCaseUpdated$9(useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$h
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.openInternal();
            }
        });
    }

    public void openCaptureSession() {
        m3.h.e(this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED, null);
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder attachedBuilder = this.mUseCaseAttachState.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            debugLog("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.mCameraStateRegistry.tryOpenCaptureSession(this.mCameraDevice.getId(), this.mCameraCoordinator.getPairedConcurrentCameraId(this.mCameraDevice.getId()))) {
            debugLog("Unable to create capture session in camera operating mode = " + this.mCameraCoordinator.getCameraOperatingMode());
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        androidx.camera.camera2.internal.StreamUseCaseUtil.populateSurfaceToStreamUseCaseMapping(this.mUseCaseAttachState.getAttachedSessionConfigs(), this.mUseCaseAttachState.getAttachedUseCaseConfigs(), hashMap);
        this.mCaptureSession.setStreamUseCaseMap(hashMap);
        final androidx.camera.camera2.internal.CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        androidx.camera.core.impl.SessionConfig build = attachedBuilder.build();
        android.hardware.camera2.CameraDevice cameraDevice = this.mCameraDevice;
        cameraDevice.getClass();
        androidx.camera.core.impl.utils.futures.Futures.addCallback(captureSessionInterface.open(build, cameraDevice, this.mCaptureSessionOpenerBuilder.build()), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.4
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                if (th6 instanceof androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException) {
                    androidx.camera.core.impl.SessionConfig findSessionConfigForSurface = androidx.camera.camera2.internal.Camera2CameraImpl.this.findSessionConfigForSurface(((androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException) th6).getDeferrableSurface());
                    if (findSessionConfigForSurface != null) {
                        androidx.camera.camera2.internal.Camera2CameraImpl.this.postSurfaceClosedError(findSessionConfigForSurface);
                        return;
                    }
                    return;
                }
                if (th6 instanceof java.util.concurrent.CancellationException) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Unable to configure camera cancelled");
                    return;
                }
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState internalState = androidx.camera.camera2.internal.Camera2CameraImpl.this.mState;
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState internalState2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED;
                if (internalState == internalState2) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.setState(internalState2, androidx.camera.core.CameraState.StateError.create(4, th6));
                }
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.Camera2CameraImpl.TAG, "Unable to configure camera " + androidx.camera.camera2.internal.Camera2CameraImpl.this, th6);
                androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = androidx.camera.camera2.internal.Camera2CameraImpl.this;
                if (camera2CameraImpl.mCaptureSession == captureSessionInterface) {
                    camera2CameraImpl.resetCaptureSession(false);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r27) {
                if (androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraCoordinator.getCameraOperatingMode() == 2 && androidx.camera.camera2.internal.Camera2CameraImpl.this.mState == androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED) {
                    androidx.camera.camera2.internal.Camera2CameraImpl.this.setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CONFIGURED);
                }
            }
        }, this.mExecutor);
    }

    public void postSurfaceClosedError(final androidx.camera.core.impl.SessionConfig sessionConfig) {
        java.util.concurrent.ScheduledExecutorService mainThreadExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
        final androidx.camera.core.impl.SessionConfig.ErrorListener errorListener = sessionConfig.getErrorListener();
        if (errorListener != null) {
            debugLog("Posting surface closed", new java.lang.Throwable());
            mainThreadExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.Camera2CameraImpl.lambda$postSurfaceClosedError$19(androidx.camera.core.impl.SessionConfig.ErrorListener.this, sessionConfig);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public wa.a release() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$v
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$release$5;
                lambda$release$5 = androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$release$5(kVar);
                return lambda$release$5;
            }
        });
    }

    public wa.a releaseSession(final androidx.camera.camera2.internal.CaptureSessionInterface captureSessionInterface, boolean z17) {
        captureSessionInterface.close();
        wa.a release = captureSessionInterface.release(z17);
        debugLog("Releasing session in state " + this.mState.name());
        this.mReleasedCaptureSessions.put(captureSessionInterface, release);
        androidx.camera.core.impl.utils.futures.Futures.addCallback(release, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r27) {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.mReleasedCaptureSessions.remove(captureSessionInterface);
                int ordinal = androidx.camera.camera2.internal.Camera2CameraImpl.this.mState.ordinal();
                if (ordinal != 1 && ordinal != 4) {
                    if (ordinal != 5 && (ordinal != 6 || androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDeviceError == 0)) {
                        return;
                    } else {
                        androidx.camera.camera2.internal.Camera2CameraImpl.this.debugLog("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (androidx.camera.camera2.internal.Camera2CameraImpl.this.isSessionCloseComplete()) {
                    androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = androidx.camera.camera2.internal.Camera2CameraImpl.this;
                    if (camera2CameraImpl.mCameraDevice != null) {
                        camera2CameraImpl.debugLog("closing camera");
                        androidx.camera.camera2.internal.compat.ApiCompat.Api21Impl.close(androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDevice);
                        androidx.camera.camera2.internal.Camera2CameraImpl.this.mCameraDevice = null;
                    }
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        return release;
    }

    public void resetCaptureSession(boolean z17) {
        m3.h.e(this.mCaptureSession != null, null);
        debugLog("Resetting Capture Session");
        androidx.camera.camera2.internal.CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        androidx.camera.core.impl.SessionConfig sessionConfig = captureSessionInterface.getSessionConfig();
        java.util.List<androidx.camera.core.impl.CaptureConfig> captureConfigs = captureSessionInterface.getCaptureConfigs();
        androidx.camera.camera2.internal.CaptureSessionInterface newCaptureSession = newCaptureSession();
        this.mCaptureSession = newCaptureSession;
        newCaptureSession.setSessionConfig(sessionConfig);
        this.mCaptureSession.issueCaptureRequests(captureConfigs);
        if (this.mState.ordinal() != 8) {
            debugLog("Skipping Capture Session state check due to current camera state: " + this.mState + " and previous session status: " + captureSessionInterface.isInOpenState());
        } else if (this.mCloseCameraBeforeCreateNewSessionQuirk && captureSessionInterface.isInOpenState()) {
            debugLog("Close camera before creating new session");
            setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING_QUIRK);
        }
        if (this.mConfigAndCloseQuirk && captureSessionInterface.isInOpenState()) {
            debugLog("ConfigAndClose is required when close the camera.");
            this.mIsConfigAndCloseRequired = true;
        }
        releaseSession(captureSessionInterface, z17);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(final boolean z17) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$p
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.Camera2CameraImpl.this.lambda$setActiveResumingMode$18(z17);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = androidx.camera.core.impl.CameraConfigs.defaultConfig();
        }
        androidx.camera.core.impl.SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.mCameraConfig = cameraConfig;
        synchronized (this.mLock) {
            this.mSessionProcessor = sessionProcessor;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setPrimary(boolean z17) {
        this.mIsPrimary = z17;
    }

    public void setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState internalState) {
        setState(internalState, null);
    }

    public void submitCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.CaptureConfig captureConfig : list) {
            androidx.camera.core.impl.CaptureConfig.Builder from = androidx.camera.core.impl.CaptureConfig.Builder.from(captureConfig);
            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
            }
            if (!captureConfig.getSurfaces().isEmpty() || !captureConfig.isUseRepeatingSurface() || checkAndAttachRepeatingSurface(from)) {
                arrayList.add(from.build());
            }
        }
        debugLog("Issue capture request");
        this.mCaptureSession.issueCaptureRequests(arrayList);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "Camera@%x[id=%s]", java.lang.Integer.valueOf(hashCode()), this.mCameraInfoInternal.getCameraId());
    }

    public void traceInternalState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState internalState, androidx.camera.core.CameraState.StateError stateError) {
        if (t4.a.d()) {
            t4.a.e("CX:C2State[" + this + "]", internalState.ordinal());
            if (stateError != null) {
                this.mTraceStateErrorCount++;
            }
            if (this.mTraceStateErrorCount > 0) {
                t4.a.e("CX:C2StateErrorCode[" + this + "]", stateError != null ? stateError.getCode() : 0);
            }
        }
    }

    public void tryForceOpenCameraDevice(boolean z17) {
        debugLog("Attempting to force open the camera.");
        if (this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z17);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN);
        }
    }

    public void tryOpenCameraDevice(boolean z17) {
        debugLog("Attempting to open the camera.");
        if (this.mCameraAvailability.isCameraAvailable() && this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z17);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN);
        }
    }

    public void updateCaptureSessionConfig() {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.mUseCaseAttachState.getActiveAndAttachedBuilder();
        if (!activeAndAttachedBuilder.isValid()) {
            this.mCameraControlInternal.resetTemplate();
            this.mCaptureSession.setSessionConfig(this.mCameraControlInternal.getSessionConfig());
            return;
        }
        this.mCameraControlInternal.setTemplate(activeAndAttachedBuilder.build().getTemplateType());
        activeAndAttachedBuilder.add(this.mCameraControlInternal.getSessionConfig());
        this.mCaptureSession.setSessionConfig(activeAndAttachedBuilder.build());
    }

    private void debugLog(java.lang.String str, java.lang.Throwable th6) {
        androidx.camera.core.Logger.d(TAG, java.lang.String.format("{%s} %s", toString(), str), th6);
    }

    public void setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState internalState, androidx.camera.core.CameraState.StateError stateError) {
        setState(internalState, stateError, true);
    }

    public void setState(androidx.camera.camera2.internal.Camera2CameraImpl.InternalState internalState, androidx.camera.core.CameraState.StateError stateError, boolean z17) {
        androidx.camera.core.impl.CameraInternal.State state;
        debugLog("Transitioning camera internal state: " + this.mState + " --> " + internalState);
        traceInternalState(internalState, stateError);
        this.mState = internalState;
        switch (internalState) {
            case RELEASED:
                state = androidx.camera.core.impl.CameraInternal.State.RELEASED;
                break;
            case RELEASING:
                state = androidx.camera.core.impl.CameraInternal.State.RELEASING;
                break;
            case INITIALIZED:
                state = androidx.camera.core.impl.CameraInternal.State.CLOSED;
                break;
            case PENDING_OPEN:
                state = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                state = androidx.camera.core.impl.CameraInternal.State.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                state = androidx.camera.core.impl.CameraInternal.State.OPENING;
                break;
            case OPENED:
                state = androidx.camera.core.impl.CameraInternal.State.OPEN;
                break;
            case CONFIGURED:
                state = androidx.camera.core.impl.CameraInternal.State.CONFIGURED;
                break;
            default:
                throw new java.lang.IllegalStateException("Unknown state: " + internalState);
        }
        this.mCameraStateRegistry.markCameraState(this, state, z17);
        this.mObservableState.postValue(state);
        this.mCameraStateMachine.updateState(state, stateError);
    }
}
