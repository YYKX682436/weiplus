package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.SessionProcessor */
/* loaded from: classes14.dex */
public interface InterfaceC0752x161fb6bc {

    /* renamed from: androidx.camera.core.impl.SessionProcessor$CaptureCallback */
    /* loaded from: classes14.dex */
    public interface CaptureCallback {
        /* renamed from: onCaptureCompleted */
        default void mo3513x34cad1a4(long j17, int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        }

        /* renamed from: onCaptureFailed */
        default void mo3514x90bd1f84(int i17) {
        }

        /* renamed from: onCaptureProcessProgressed */
        default void mo3515x1c9165b4(int i17) {
        }

        /* renamed from: onCaptureProcessStarted */
        default void mo3522x2841c359(int i17) {
        }

        /* renamed from: onCaptureSequenceAborted */
        default void mo3523x98946d67(int i17) {
        }

        /* renamed from: onCaptureSequenceCompleted */
        default void mo3516xc68039e3(int i17) {
        }

        /* renamed from: onCaptureStarted */
        default void mo3517x56961e1a(int i17, long j17) {
        }
    }

    /* renamed from: abortCapture */
    void mo5648x725e45f6(int i17);

    /* renamed from: deInitSession */
    void mo5649x5cad5425();

    /* renamed from: getRealtimeCaptureLatency */
    default android.util.Pair<java.lang.Long, java.lang.Long> mo5650xd2b81c19() {
        return null;
    }

    /* renamed from: getSupportedCameraOperations */
    default java.util.Set<java.lang.Integer> mo5651x36ea2709() {
        return java.util.Collections.emptySet();
    }

    /* renamed from: getSupportedPostviewSize */
    default java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> mo5652x216212fe(android.util.Size size) {
        return java.util.Collections.emptyMap();
    }

    /* renamed from: initSession */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo5653xc4fee366(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a abstractC0738x8f67d80a);

    /* renamed from: onCaptureSessionEnd */
    void mo5654xe7df0e2c();

    /* renamed from: onCaptureSessionStart */
    void mo5655x6d1c3973(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 interfaceC0746x3c5d2ee3);

    /* renamed from: setParameters */
    void mo5656x37bcc7ec(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62);

    /* renamed from: startCapture */
    int mo5657x18ec4884(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback);

    /* renamed from: startRepeating */
    int mo5658xc3d1ea25(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback);

    /* renamed from: startTrigger */
    default int mo5659xb8cfd6f6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        return -1;
    }

    /* renamed from: stopRepeating */
    void mo5660x6108ba85();
}
