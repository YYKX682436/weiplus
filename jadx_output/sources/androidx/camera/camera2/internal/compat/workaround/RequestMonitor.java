package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class RequestMonitor {
    private static final java.lang.String TAG = "RequestMonitor";
    private final boolean mQuirkEnabled;
    private final java.util.List<wa.a> mRequestTasks = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* loaded from: classes14.dex */
    public static class RequestCompleteListener extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        t2.k mStartRequestCompleter;
        final wa.a mStartRequestFuture = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.compat.workaround.RequestMonitor$RequestCompleteListener$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$new$0;
                lambda$new$0 = androidx.camera.camera2.internal.compat.workaround.RequestMonitor.RequestCompleteListener.this.lambda$new$0(kVar);
                return lambda$new$0;
            }
        });

        private void completeFuture() {
            t2.k kVar = this.mStartRequestCompleter;
            if (kVar != null) {
                kVar.a(null);
                this.mStartRequestCompleter = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$new$0(t2.k kVar) {
            this.mStartRequestCompleter = kVar;
            return "RequestCompleteListener[" + this + "]";
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            completeFuture();
        }
    }

    public RequestMonitor(boolean z17) {
        this.mQuirkEnabled = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMonitorListener$1(androidx.camera.camera2.internal.compat.workaround.RequestMonitor.RequestCompleteListener requestCompleteListener, wa.a aVar) {
        java.util.Objects.toString(requestCompleteListener);
        toString();
        this.mRequestTasks.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Void lambda$getRequestsProcessedFuture$0(java.util.List list) {
        return null;
    }

    public android.hardware.camera2.CameraCaptureSession.CaptureCallback createMonitorListener(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return shouldMonitorRequest() ? androidx.camera.camera2.internal.Camera2CaptureCallbacks.createComboCallback(createMonitorListener(), captureCallback) : captureCallback;
    }

    public wa.a getRequestsProcessedFuture() {
        return this.mRequestTasks.isEmpty() ? androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null) : androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.core.impl.utils.futures.Futures.transform(androidx.camera.core.impl.utils.futures.Futures.successfulAsList(new java.util.ArrayList(this.mRequestTasks)), new androidx.camera.camera2.internal.compat.workaround.RequestMonitor$$b(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()));
    }

    public boolean shouldMonitorRequest() {
        return this.mQuirkEnabled;
    }

    public void stop() {
        java.util.LinkedList linkedList = new java.util.LinkedList(this.mRequestTasks);
        while (!linkedList.isEmpty()) {
            wa.a aVar = (wa.a) linkedList.poll();
            java.util.Objects.requireNonNull(aVar);
            aVar.cancel(true);
        }
    }

    private android.hardware.camera2.CameraCaptureSession.CaptureCallback createMonitorListener() {
        final androidx.camera.camera2.internal.compat.workaround.RequestMonitor.RequestCompleteListener requestCompleteListener = new androidx.camera.camera2.internal.compat.workaround.RequestMonitor.RequestCompleteListener();
        final wa.a aVar = requestCompleteListener.mStartRequestFuture;
        this.mRequestTasks.add(aVar);
        toString();
        aVar.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.workaround.RequestMonitor$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.compat.workaround.RequestMonitor.this.lambda$createMonitorListener$1(requestCompleteListener, aVar);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        return requestCompleteListener;
    }
}
