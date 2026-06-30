package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class SynchronizedCaptureSessionImpl extends androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl {
    private static final java.lang.String TAG = "SyncCaptureSessionImpl";
    private final androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface mCloseSurfaceQuirk;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed;
    private java.util.List<androidx.camera.core.impl.DeferrableSurface> mDeferrableSurfaces;
    private final androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession mForceCloseSessionQuirk;
    private final java.lang.Object mObjectLock;
    wa.a mOpenSessionBlockerFuture;
    private final androidx.camera.camera2.internal.compat.workaround.RequestMonitor mRequestMonitor;
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;
    private final androidx.camera.camera2.internal.compat.workaround.SessionResetPolicy mSessionResetPolicy;

    public SynchronizedCaptureSessionImpl(androidx.camera.core.impl.Quirks quirks, androidx.camera.core.impl.Quirks quirks2, androidx.camera.camera2.internal.CaptureSessionRepository captureSessionRepository, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.os.Handler handler) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.mObjectLock = new java.lang.Object();
        this.mClosed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mCloseSurfaceQuirk = new androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface(quirks, quirks2);
        this.mRequestMonitor = new androidx.camera.camera2.internal.compat.workaround.RequestMonitor(quirks.contains(androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class) || quirks.contains(androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.class));
        this.mForceCloseSessionQuirk = new androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession(quirks2);
        this.mSessionResetPolicy = new androidx.camera.camera2.internal.compat.workaround.SessionResetPolicy(quirks2);
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    private void closeCreatedSession() {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it = this.mCaptureSessionRepository.getCaptureSessions().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        debugLog("Session call super.close()");
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfigured$1(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        super.onConfigured(synchronizedCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wa.a lambda$openCaptureSession$0(android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat, java.util.List list, java.util.List list2) {
        if (this.mSessionResetPolicy.needAbortCapture()) {
            closeCreatedSession();
        }
        debugLog("start openCaptureSession");
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return super.captureBurstRequests(list, this.mRequestMonitor.createMonitorListener(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        if (!this.mClosed.compareAndSet(false, true)) {
            debugLog("close() has been called. Skip this invocation.");
            return;
        }
        if (this.mSessionResetPolicy.needAbortCapture()) {
            try {
                debugLog("Call abortCaptures() before closing session.");
                abortCaptures();
            } catch (java.lang.Exception e17) {
                debugLog("Exception when calling abortCaptures()" + e17);
            }
        }
        debugLog("Session call close()");
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl.this.lambda$close$2();
            }
        }, getExecutor());
    }

    public void debugLog(java.lang.String str) {
        androidx.camera.core.Logger.d(TAG, "[" + this + "] " + str);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
        super.finishClose();
        this.mRequestMonitor.stop();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public wa.a getOpeningBlocker() {
        return androidx.camera.core.impl.utils.futures.Futures.makeTimeoutFuture(1500L, this.mScheduledExecutorService, this.mRequestMonitor.getRequestsProcessedFuture());
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void onCameraDeviceError(int i17) {
        super.onCameraDeviceError(i17);
        if (i17 == 5) {
            synchronized (this.mObjectLock) {
                if (isCameraCaptureSessionOpen() && this.mDeferrableSurfaces != null) {
                    debugLog("Close DeferrableSurfaces for CameraDevice error.");
                    java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = this.mDeferrableSurfaces.iterator();
                    while (it.hasNext()) {
                        it.next().close();
                    }
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mObjectLock) {
            this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
        }
        debugLog("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        debugLog("Session onConfigured()");
        this.mForceCloseSessionQuirk.onSessionConfigured(synchronizedCaptureSession, this.mCaptureSessionRepository.getCreatingCaptureSessions(), this.mCaptureSessionRepository.getCaptureSessions(), new androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$c
            @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
            public final void run(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession2) {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl.this.lambda$onConfigured$1(synchronizedCaptureSession2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public wa.a openCaptureSession(final android.hardware.camera2.CameraDevice cameraDevice, final androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat, final java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        wa.a nonCancellationPropagating;
        synchronized (this.mObjectLock) {
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> captureSessions = this.mCaptureSessionRepository.getCaptureSessions();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it = captureSessions.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getOpeningBlocker());
            }
            wa.a successfulAsList = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(arrayList);
            this.mOpenSessionBlockerFuture = successfulAsList;
            nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.core.impl.utils.futures.FutureChain.from(successfulAsList).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$b
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$openCaptureSession$0;
                    lambda$openCaptureSession$0 = androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl.this.lambda$openCaptureSession$0(cameraDevice, sessionConfigurationCompat, list, (java.util.List) obj);
                    return lambda$openCaptureSession$0;
                }
            }, getExecutor()));
        }
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return super.setSingleRepeatingRequest(captureRequest, this.mRequestMonitor.createMonitorListener(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public wa.a startWithDeferrableSurface(java.util.List<androidx.camera.core.impl.DeferrableSurface> list, long j17) {
        wa.a startWithDeferrableSurface;
        synchronized (this.mObjectLock) {
            this.mDeferrableSurfaces = list;
            startWithDeferrableSurface = super.startWithDeferrableSurface(list, j17);
        }
        return startWithDeferrableSurface;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public boolean stop() {
        boolean stop;
        synchronized (this.mObjectLock) {
            if (isCameraCaptureSessionOpen()) {
                this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
            } else {
                wa.a aVar = this.mOpenSessionBlockerFuture;
                if (aVar != null) {
                    aVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
