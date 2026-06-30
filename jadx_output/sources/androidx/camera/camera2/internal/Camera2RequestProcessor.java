package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public class Camera2RequestProcessor implements androidx.camera.core.impl.RequestProcessor {
    private static final java.lang.String TAG = "Camera2RequestProcessor";
    private androidx.camera.camera2.internal.CaptureSession mCaptureSession;
    private java.util.List<androidx.camera.core.impl.SessionProcessorSurface> mProcessorSurfaces;
    private volatile androidx.camera.core.impl.SessionConfig mSessionConfig;
    private final java.lang.Object mLock = new java.lang.Object();
    private volatile boolean mIsClosed = false;

    /* loaded from: classes14.dex */
    public class Camera2CallbackWrapper extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final androidx.camera.core.impl.RequestProcessor.Callback mCallback;
        private final boolean mInvokeSequenceCallback;
        private final androidx.camera.core.impl.RequestProcessor.Request mRequest;

        public Camera2CallbackWrapper(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.RequestProcessor.Callback callback, boolean z17) {
            this.mCallback = callback;
            this.mRequest = request;
            this.mInvokeSequenceCallback = z17;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            this.mCallback.onCaptureBufferLost(this.mRequest, j17, androidx.camera.camera2.internal.Camera2RequestProcessor.this.findOutputConfigId(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.mCallback.onCaptureCompleted(this.mRequest, new androidx.camera.camera2.internal.Camera2CameraCaptureResult(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            this.mCallback.onCaptureFailed(this.mRequest, new androidx.camera.camera2.internal.Camera2CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
            this.mCallback.onCaptureProgressed(this.mRequest, new androidx.camera.camera2.internal.Camera2CameraCaptureResult(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            if (this.mInvokeSequenceCallback) {
                this.mCallback.onCaptureSequenceAborted(i17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            if (this.mInvokeSequenceCallback) {
                this.mCallback.onCaptureSequenceCompleted(i17, j17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            this.mCallback.onCaptureStarted(this.mRequest, j18, j17);
        }
    }

    public Camera2RequestProcessor(androidx.camera.camera2.internal.CaptureSession captureSession, java.util.List<androidx.camera.core.impl.SessionProcessorSurface> list) {
        m3.h.b(captureSession.mState == androidx.camera.camera2.internal.CaptureSession.State.OPENED, "CaptureSession state must be OPENED. Current state:" + captureSession.mState);
        this.mCaptureSession = captureSession;
        this.mProcessorSurfaces = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    private boolean areRequestsValid(java.util.List<androidx.camera.core.impl.RequestProcessor.Request> list) {
        java.util.Iterator<androidx.camera.core.impl.RequestProcessor.Request> it = list.iterator();
        while (it.hasNext()) {
            if (!isRequestValid(it.next())) {
                return false;
            }
        }
        return true;
    }

    private androidx.camera.core.impl.DeferrableSurface findSurface(int i17) {
        synchronized (this.mLock) {
            java.util.List<androidx.camera.core.impl.SessionProcessorSurface> list = this.mProcessorSurfaces;
            if (list == null) {
                return null;
            }
            for (androidx.camera.core.impl.SessionProcessorSurface sessionProcessorSurface : list) {
                if (sessionProcessorSurface.getOutputConfigId() == i17) {
                    return sessionProcessorSurface;
                }
            }
            return null;
        }
    }

    private boolean isRequestValid(androidx.camera.core.impl.RequestProcessor.Request request) {
        if (request.getTargetOutputConfigIds().isEmpty()) {
            androidx.camera.core.Logger.e(TAG, "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (java.lang.Integer num : request.getTargetOutputConfigIds()) {
            if (findSurface(num.intValue()) == null) {
                androidx.camera.core.Logger.e(TAG, "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public void abortCaptures() {
        androidx.camera.camera2.internal.CaptureSession captureSession;
        synchronized (this.mLock) {
            if (!this.mIsClosed && (captureSession = this.mCaptureSession) != null) {
                captureSession.abortCaptures();
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureSession = null;
            this.mSessionConfig = null;
            this.mProcessorSurfaces = null;
        }
    }

    public int findOutputConfigId(android.view.Surface surface) {
        synchronized (this.mLock) {
            java.util.List<androidx.camera.core.impl.SessionProcessorSurface> list = this.mProcessorSurfaces;
            if (list == null) {
                return -1;
            }
            for (androidx.camera.core.impl.SessionProcessorSurface sessionProcessorSurface : list) {
                if (sessionProcessorSurface.getSurface().get() == surface) {
                    return sessionProcessorSurface.getOutputConfigId();
                }
                continue;
            }
            return -1;
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int setRepeating(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.RequestProcessor.Callback callback) {
        synchronized (this.mLock) {
            if (!this.mIsClosed && isRequestValid(request) && this.mCaptureSession != null) {
                androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
                builder.setTemplateType(request.getTemplateId());
                builder.setImplementationOptions(request.getParameters());
                builder.addCameraCaptureCallback(androidx.camera.camera2.internal.CaptureCallbackContainer.create(new androidx.camera.camera2.internal.Camera2RequestProcessor.Camera2CallbackWrapper(request, callback, true)));
                if (this.mSessionConfig != null) {
                    java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mSessionConfig.getRepeatingCameraCaptureCallbacks().iterator();
                    while (it.hasNext()) {
                        builder.addCameraCaptureCallback(it.next());
                    }
                    androidx.camera.core.impl.TagBundle tagBundle = this.mSessionConfig.getRepeatingCaptureConfig().getTagBundle();
                    for (java.lang.String str : tagBundle.listKeys()) {
                        builder.addTag(str, tagBundle.getTag(str));
                    }
                }
                java.util.Iterator<java.lang.Integer> it6 = request.getTargetOutputConfigIds().iterator();
                while (it6.hasNext()) {
                    builder.addSurface(findSurface(it6.next().intValue()));
                }
                return this.mCaptureSession.issueRepeatingCaptureRequests(builder.build());
            }
            return -1;
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public void stopRepeating() {
        androidx.camera.camera2.internal.CaptureSession captureSession;
        synchronized (this.mLock) {
            if (!this.mIsClosed && (captureSession = this.mCaptureSession) != null) {
                captureSession.stopRepeating();
            }
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int submit(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.RequestProcessor.Callback callback) {
        return submit(java.util.Arrays.asList(request), callback);
    }

    public void updateSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        synchronized (this.mLock) {
            this.mSessionConfig = sessionConfig;
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int submit(java.util.List<androidx.camera.core.impl.RequestProcessor.Request> list, androidx.camera.core.impl.RequestProcessor.Callback callback) {
        synchronized (this.mLock) {
            if (!this.mIsClosed && areRequestsValid(list) && this.mCaptureSession != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z17 = true;
                for (androidx.camera.core.impl.RequestProcessor.Request request : list) {
                    androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
                    builder.setTemplateType(request.getTemplateId());
                    builder.setImplementationOptions(request.getParameters());
                    builder.addCameraCaptureCallback(androidx.camera.camera2.internal.CaptureCallbackContainer.create(new androidx.camera.camera2.internal.Camera2RequestProcessor.Camera2CallbackWrapper(request, callback, z17)));
                    java.util.Iterator<java.lang.Integer> it = request.getTargetOutputConfigIds().iterator();
                    while (it.hasNext()) {
                        builder.addSurface(findSurface(it.next().intValue()));
                    }
                    arrayList.add(builder.build());
                    z17 = false;
                }
                return this.mCaptureSession.issueBurstCaptureRequest(arrayList);
            }
            return -1;
        }
    }
}
