package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.RequestMonitor */
/* loaded from: classes14.dex */
public class C0423x9f54ffeb {
    private static final java.lang.String TAG = "RequestMonitor";

    /* renamed from: mQuirkEnabled */
    private final boolean f749xb08382b0;

    /* renamed from: mRequestTasks */
    private final java.util.List<wa.a> f750xe49ff34c = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: androidx.camera.camera2.internal.compat.workaround.RequestMonitor$RequestCompleteListener */
    /* loaded from: classes14.dex */
    public static class RequestCompleteListener extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

        /* renamed from: mStartRequestCompleter */
        t2.k f751x7f5a5e9f;

        /* renamed from: mStartRequestFuture */
        final wa.a f752x1b707b3d = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.compat.workaround.RequestMonitor$RequestCompleteListener$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m4105x51ef5f0f;
                m4105x51ef5f0f = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb.RequestCompleteListener.this.m4105x51ef5f0f(kVar);
                return m4105x51ef5f0f;
            }
        });

        /* renamed from: completeFuture */
        private void m4104x2b3a1c5c() {
            t2.k kVar = this.f751x7f5a5e9f;
            if (kVar != null) {
                kVar.a(null);
                this.f751x7f5a5e9f = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$new$0 */
        public /* synthetic */ java.lang.Object m4105x51ef5f0f(t2.k kVar) {
            this.f751x7f5a5e9f = kVar;
            return "RequestCompleteListener[" + this + "]";
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            m4104x2b3a1c5c();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            m4104x2b3a1c5c();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            m4104x2b3a1c5c();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            m4104x2b3a1c5c();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            m4104x2b3a1c5c();
        }
    }

    public C0423x9f54ffeb(boolean z17) {
        this.f749xb08382b0 = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createMonitorListener$1 */
    public /* synthetic */ void m4098x717d19c2(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb.RequestCompleteListener requestCompleteListener, wa.a aVar) {
        java.util.Objects.toString(requestCompleteListener);
        toString();
        this.f750xe49ff34c.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getRequestsProcessedFuture$0 */
    public static /* synthetic */ java.lang.Void m4099x701c44a0(java.util.List list) {
        return null;
    }

    /* renamed from: createMonitorListener */
    public android.hardware.camera2.CameraCaptureSession.CaptureCallback m4100x88996b92(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return m4102x93766068() ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0163x5be7d3d5.m3198x20225057(m4097x88996b92(), captureCallback) : captureCallback;
    }

    /* renamed from: getRequestsProcessedFuture */
    public wa.a m4101xf4435217() {
        return this.f750xe49ff34c.isEmpty() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6030x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6029xf7c1832a(new java.util.ArrayList(this.f750xe49ff34c)), new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0425xa4820017(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc()));
    }

    /* renamed from: shouldMonitorRequest */
    public boolean m4102x93766068() {
        return this.f749xb08382b0;
    }

    /* renamed from: stop */
    public void m4103x360802() {
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f750xe49ff34c);
        while (!linkedList.isEmpty()) {
            wa.a aVar = (wa.a) linkedList.poll();
            java.util.Objects.requireNonNull(aVar);
            aVar.cancel(true);
        }
    }

    /* renamed from: createMonitorListener */
    private android.hardware.camera2.CameraCaptureSession.CaptureCallback m4097x88996b92() {
        final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb.RequestCompleteListener requestCompleteListener = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb.RequestCompleteListener();
        final wa.a aVar = requestCompleteListener.f752x1b707b3d;
        this.f750xe49ff34c.add(aVar);
        toString();
        aVar.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.workaround.RequestMonitor$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb.this.m4098x717d19c2(requestCompleteListener, aVar);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        return requestCompleteListener;
    }
}
