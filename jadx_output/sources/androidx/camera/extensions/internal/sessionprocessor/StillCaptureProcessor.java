package androidx.camera.extensions.internal.sessionprocessor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class StillCaptureProcessor {
    private static final java.lang.String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor mCaptureOutputSurface;
    final androidx.camera.extensions.impl.CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher mCaptureResultImageMatcher = new androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher();
    final java.lang.Object mLock = new java.lang.Object();
    java.util.HashMap<java.lang.Integer, android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.ImageReference, android.hardware.camera2.TotalCaptureResult>> mCaptureResults = new java.util.HashMap<>();
    androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback mOnCaptureResultCallback = null;
    android.hardware.camera2.TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    /* loaded from: classes14.dex */
    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list);

        void onCaptureProcessProgressed(int i17);

        void onError(java.lang.Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(androidx.camera.extensions.impl.CaptureProcessorImpl captureProcessorImpl, android.view.Surface surface, android.util.Size size, androidx.camera.core.impl.OutputSurface outputSurface, boolean z17) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor captureOutputSurfaceForCaptureProcessor = new androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor(surface, size, z17);
        this.mCaptureOutputSurface = captureOutputSurfaceForCaptureProcessor;
        captureProcessorImpl.onOutputSurface(captureOutputSurfaceForCaptureProcessor.getSurface(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = outputSurface != null;
        if (outputSurface != null) {
            androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
            if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
                m3.h.a(outputSurface.getImageFormat() == 35);
                captureProcessorImpl.onResolutionUpdate(size, outputSurface.getSize());
                captureProcessorImpl.onPostviewOutputSurface(outputSurface.getSurface());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(boolean z17, java.util.HashMap hashMap, final androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                } catch (java.lang.Exception e17) {
                    androidx.camera.core.Logger.e(TAG, "mCaptureProcessorImpl.process exception ", e17);
                    this.mOnCaptureResultCallback = null;
                    if (onCaptureResultCallback != null) {
                        onCaptureResultCallback.onError(e17);
                    }
                    androidx.camera.core.Logger.d(TAG, "CaptureProcessorImpl.process() finish");
                    androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback2 != null) {
                        onCaptureResultCallback2.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                }
                if (this.mIsClosed) {
                    androidx.camera.core.Logger.d(TAG, "Ignore process() in closed state.");
                    return;
                }
                androidx.camera.core.Logger.d(TAG, "CaptureProcessorImpl.process() begin");
                androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
                if (androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && z17 && this.mIsPostviewConfigured) {
                    this.mCaptureProcessorImpl.processWithPostview(hashMap, new androidx.camera.extensions.impl.ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                        public void onCaptureCompleted(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                            onCaptureResultCallback.onCaptureCompleted(j17, list);
                        }

                        public void onCaptureProcessProgressed(int i17) {
                            onCaptureResultCallback.onCaptureProcessProgressed(i17);
                        }
                    }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                } else {
                    androidx.camera.extensions.internal.Version version2 = androidx.camera.extensions.internal.Version.VERSION_1_3;
                    if (androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version2) && androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version2)) {
                        this.mCaptureProcessorImpl.process(hashMap, new androidx.camera.extensions.impl.ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                            public void onCaptureCompleted(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j17, list);
                            }

                            public void onCaptureProcessProgressed(int i17) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i17);
                            }
                        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                    } else {
                        this.mCaptureProcessorImpl.process(hashMap);
                    }
                }
                androidx.camera.core.Logger.d(TAG, "CaptureProcessorImpl.process() finish");
                androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback3 != null) {
                    onCaptureResultCallback3.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
            } finally {
                androidx.camera.core.Logger.d(TAG, "CaptureProcessorImpl.process() finish");
                androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback4 != null) {
                    onCaptureResultCallback4.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCapture$0(java.util.List list, androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback, boolean z17, androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        synchronized (this.mLock) {
            if (this.mIsClosed) {
                imageReference.decrement();
                androidx.camera.core.Logger.d(TAG, "Ignore image in closed state");
                return;
            }
            androidx.camera.core.Logger.d(TAG, "onImageReferenceIncoming  captureStageId=" + i17);
            this.mCaptureResults.put(java.lang.Integer.valueOf(i17), new android.util.Pair<>(imageReference, totalCaptureResult));
            androidx.camera.core.Logger.d(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
            if (this.mCaptureResults.keySet().containsAll(list)) {
                process(this.mCaptureResults, onCaptureResultCallback, z17);
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            java.util.Iterator<android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.ImageReference, android.hardware.camera2.TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
            while (it.hasNext()) {
                ((androidx.camera.extensions.internal.sessionprocessor.ImageReference) it.next().first).decrement();
            }
            this.mCaptureResults.clear();
        }
    }

    public void close() {
        synchronized (this.mLock) {
            androidx.camera.core.Logger.d(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.clearImageReferenceListener();
            this.mCaptureResultImageMatcher.clear();
            this.mCaptureOutputSurface.close();
        }
    }

    public void notifyCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        java.lang.Long l17;
        this.mCaptureResultImageMatcher.captureResultIncoming(totalCaptureResult, i17);
        if (this.mTimeStampForOutputImage == -1 && (l17 = (java.lang.Long) totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long longValue = l17.longValue();
            this.mTimeStampForOutputImage = longValue;
            this.mCaptureOutputSurface.setOutputImageTimestamp(longValue);
        }
        synchronized (this.mLock) {
            if (this.mSourceCaptureResult == null) {
                this.mSourceCaptureResult = totalCaptureResult;
            }
        }
    }

    public void notifyImage(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference) {
        this.mCaptureResultImageMatcher.imageIncoming(imageReference);
    }

    public void process(java.util.Map<java.lang.Integer, android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.ImageReference, android.hardware.camera2.TotalCaptureResult>> map, final androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback, final boolean z17) {
        final java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (this.mLock) {
            for (java.lang.Integer num : map.keySet()) {
                android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.ImageReference, android.hardware.camera2.TotalCaptureResult> pair = map.get(num);
                hashMap.put(num, new android.util.Pair(((androidx.camera.extensions.internal.sessionprocessor.ImageReference) pair.first).get(), (android.hardware.camera2.TotalCaptureResult) pair.second));
            }
        }
        androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.this.lambda$process$1(z17, hashMap, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(final boolean z17, final java.util.List<java.lang.Integer> list, final androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback) {
        androidx.camera.core.Logger.d(TAG, "Start the capture: enablePostview=" + z17);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            m3.h.e(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.clear();
        this.mCaptureResultImageMatcher.setImageReferenceListener(new androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$$a
            @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
            public final void onImageReferenceIncoming(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
                androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.this.lambda$startCapture$0(list, onCaptureResultCallback, z17, imageReference, totalCaptureResult, i17);
            }
        });
    }
}
