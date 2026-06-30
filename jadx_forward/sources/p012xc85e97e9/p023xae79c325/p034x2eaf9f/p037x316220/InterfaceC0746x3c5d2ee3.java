package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.RequestProcessor */
/* loaded from: classes14.dex */
public interface InterfaceC0746x3c5d2ee3 {

    /* renamed from: androidx.camera.core.impl.RequestProcessor$Callback */
    /* loaded from: classes14.dex */
    public interface Callback {
        /* renamed from: onCaptureBufferLost */
        default void mo5570xf66d3f4b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, long j17, int i17) {
        }

        /* renamed from: onCaptureCompleted */
        default void mo5571x34cad1a4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        }

        /* renamed from: onCaptureFailed */
        default void mo5572x90bd1f84(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
        }

        /* renamed from: onCaptureProgressed */
        default void mo5573x86fe8753(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        }

        /* renamed from: onCaptureSequenceAborted */
        default void mo5574x98946d67(int i17) {
        }

        /* renamed from: onCaptureSequenceCompleted */
        default void mo5575xc68039e3(int i17, long j17) {
        }

        /* renamed from: onCaptureStarted */
        default void mo5576x56961e1a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, long j17, long j18) {
        }
    }

    /* renamed from: androidx.camera.core.impl.RequestProcessor$Request */
    /* loaded from: classes14.dex */
    public interface Request {
        /* renamed from: getParameters */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5577x99879e0();

        /* renamed from: getTargetOutputConfigIds */
        java.util.List<java.lang.Integer> mo5578xa671f88e();

        /* renamed from: getTemplateId */
        int mo5579x3bfa572b();
    }

    /* renamed from: abortCaptures */
    void mo3287xd96a793d();

    /* renamed from: setRepeating */
    int mo3290x34b1f225(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback);

    /* renamed from: stopRepeating */
    void mo3291x6108ba85();

    /* renamed from: submit */
    int mo3292xcadc4018(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback);

    /* renamed from: submit */
    int mo3293xcadc4018(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback);
}
