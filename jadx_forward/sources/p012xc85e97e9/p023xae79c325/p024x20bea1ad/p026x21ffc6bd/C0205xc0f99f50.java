package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CameraBurstCaptureCallback */
/* loaded from: classes14.dex */
class C0205xc0f99f50 extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* renamed from: mCaptureSequenceCallback */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50.CaptureSequenceCallback f354xc267175f = null;

    /* renamed from: mCallbackMap */
    final java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> f353x197d7c2a = new java.util.HashMap();

    /* renamed from: androidx.camera.camera2.internal.CameraBurstCaptureCallback$CaptureSequenceCallback */
    /* loaded from: classes14.dex */
    public interface CaptureSequenceCallback {
        /* renamed from: onCaptureSequenceCompletedOrAborted */
        void mo3301xa0352dc9(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, boolean z17);
    }

    /* renamed from: getCallbacks */
    private java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> m3298xc1355a18(android.hardware.camera2.CaptureRequest captureRequest) {
        java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list = this.f353x197d7c2a.get(captureRequest);
        return list != null ? list : java.util.Collections.emptyList();
    }

    /* renamed from: addCamera2Callbacks */
    public void m3299x5aac5462(android.hardware.camera2.CaptureRequest captureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
        java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list2 = this.f353x197d7c2a.get(captureRequest);
        if (list2 == null) {
            this.f353x197d7c2a.put(captureRequest, list);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f353x197d7c2a.put(captureRequest, arrayList);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = m3298xc1355a18(captureRequest).iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api24Impl.m3691xf66d3f4b(it.next(), cameraCaptureSession, captureRequest, surface, j17);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = m3298xc1355a18(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = m3298xc1355a18(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = m3298xc1355a18(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
        java.util.Iterator<java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> it = this.f353x197d7c2a.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it6 = it.next().iterator();
            while (it6.hasNext()) {
                it6.next().onCaptureSequenceAborted(cameraCaptureSession, i17);
            }
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50.CaptureSequenceCallback captureSequenceCallback = this.f354xc267175f;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.mo3301xa0352dc9(cameraCaptureSession, i17, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
        java.util.Iterator<java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> it = this.f353x197d7c2a.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it6 = it.next().iterator();
            while (it6.hasNext()) {
                it6.next().onCaptureSequenceCompleted(cameraCaptureSession, i17, j17);
            }
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50.CaptureSequenceCallback captureSequenceCallback = this.f354xc267175f;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.mo3301xa0352dc9(cameraCaptureSession, i17, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = m3298xc1355a18(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
        }
    }

    /* renamed from: setCaptureSequenceCallback */
    public void m3300xa220b7ca(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50.CaptureSequenceCallback captureSequenceCallback) {
        this.f354xc267175f = captureSequenceCallback;
    }
}
