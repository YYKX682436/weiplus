package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
class CameraBurstCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback mCaptureSequenceCallback = null;
    final java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> mCallbackMap = new java.util.HashMap();

    /* loaded from: classes14.dex */
    public interface CaptureSequenceCallback {
        void onCaptureSequenceCompletedOrAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, boolean z17);
    }

    private java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> getCallbacks(android.hardware.camera2.CaptureRequest captureRequest) {
        java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list = this.mCallbackMap.get(captureRequest);
        return list != null ? list : java.util.Collections.emptyList();
    }

    public void addCamera2Callbacks(android.hardware.camera2.CaptureRequest captureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
        java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list2 = this.mCallbackMap.get(captureRequest);
        if (list2 == null) {
            this.mCallbackMap.put(captureRequest, list);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.mCallbackMap.put(captureRequest, arrayList);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            androidx.camera.camera2.internal.compat.ApiCompat.Api24Impl.onCaptureBufferLost(it.next(), cameraCaptureSession, captureRequest, surface, j17);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
        java.util.Iterator<java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> it = this.mCallbackMap.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it6 = it.next().iterator();
            while (it6.hasNext()) {
                it6.next().onCaptureSequenceAborted(cameraCaptureSession, i17);
            }
        }
        androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i17, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
        java.util.Iterator<java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> it = this.mCallbackMap.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it6 = it.next().iterator();
            while (it6.hasNext()) {
                it6.next().onCaptureSequenceCompleted(cameraCaptureSession, i17, j17);
            }
        }
        androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i17, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
        }
    }

    public void setCaptureSequenceCallback(androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback captureSequenceCallback) {
        this.mCaptureSequenceCallback = captureSequenceCallback;
    }
}
