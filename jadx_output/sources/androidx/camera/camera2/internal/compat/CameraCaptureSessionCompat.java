package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
public final class CameraCaptureSessionCompat {
    private final androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl mImpl;

    /* loaded from: classes14.dex */
    public interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        int captureSingleRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        android.hardware.camera2.CameraCaptureSession unwrap();
    }

    /* loaded from: classes14.dex */
    public static final class CaptureCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraCaptureSession.CaptureCallback mWrappedCallback;

        public CaptureCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureBufferLost$6(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            androidx.camera.camera2.internal.compat.ApiCompat.Api24Impl.onCaptureBufferLost(this.mWrappedCallback, cameraCaptureSession, captureRequest, surface, j17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$2(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.mWrappedCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureFailed$3(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            this.mWrappedCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProgressed$1(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
            this.mWrappedCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureSequenceAborted$5(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            this.mWrappedCallback.onCaptureSequenceAborted(cameraCaptureSession, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureSequenceCompleted$4(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            this.mWrappedCallback.onCaptureSequenceCompleted(cameraCaptureSession, i17, j17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            this.mWrappedCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.view.Surface surface, final long j17) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.lambda$onCaptureBufferLost$6(cameraCaptureSession, captureRequest, surface, j17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$e
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.lambda$onCaptureCompleted$2(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.CaptureFailure captureFailure) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$g
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.lambda$onCaptureFailed$3(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.CaptureResult captureResult) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$d
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.lambda$onCaptureProgressed$1(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final int i17) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.lambda$onCaptureSequenceAborted$5(cameraCaptureSession, i17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final int i17, final long j17) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.lambda$onCaptureSequenceCompleted$4(cameraCaptureSession, i17, j17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final long j17, final long j18) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$f
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.lambda$onCaptureStarted$0(cameraCaptureSession, captureRequest, j17, j18);
                }
            });
        }
    }

    /* loaded from: classes14.dex */
    public static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraCaptureSession.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onActive$3(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureQueueEmpty$4(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.onCaptureQueueEmpty(this.mWrappedCallback, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClosed$5(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigureFailed$1(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReady$2(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfacePrepared$6(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
            androidx.camera.camera2.internal.compat.ApiCompat.Api23Impl.onSurfacePrepared(this.mWrappedCallback, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$d
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.lambda$onActive$3(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.lambda$onCaptureQueueEmpty$4(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.lambda$onClosed$5(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$e
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.lambda$onConfigureFailed$1(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.lambda$onConfigured$0(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$f
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.lambda$onReady$2(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.view.Surface surface) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$g
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.lambda$onSurfacePrepared$6(cameraCaptureSession, surface);
                }
            });
        }
    }

    private CameraCaptureSessionCompat(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatApi28Impl(cameraCaptureSession);
        } else {
            this.mImpl = androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.create(cameraCaptureSession, handler);
        }
    }

    public static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        return toCameraCaptureSessionCompat(cameraCaptureSession, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    public android.hardware.camera2.CameraCaptureSession toCameraCaptureSession() {
        return this.mImpl.unwrap();
    }

    public static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.os.Handler handler) {
        return new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat(cameraCaptureSession, handler);
    }
}
