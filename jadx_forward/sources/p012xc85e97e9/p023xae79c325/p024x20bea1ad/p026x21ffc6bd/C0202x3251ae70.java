package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2RequestProcessor */
/* loaded from: classes14.dex */
public class C0202x3251ae70 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 {
    private static final java.lang.String TAG = "Camera2RequestProcessor";

    /* renamed from: mCaptureSession */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 f342x15e0c23d;

    /* renamed from: mProcessorSurfaces */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251> f345xb02a2f2b;

    /* renamed from: mSessionConfig */
    private volatile p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f346x3700320b;

    /* renamed from: mLock */
    private final java.lang.Object f344x6243b38 = new java.lang.Object();

    /* renamed from: mIsClosed */
    private volatile boolean f343xfc407ac3 = false;

    /* renamed from: androidx.camera.camera2.internal.Camera2RequestProcessor$Camera2CallbackWrapper */
    /* loaded from: classes14.dex */
    public class Camera2CallbackWrapper extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

        /* renamed from: mCallback */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback f347x1ab9c7d2;

        /* renamed from: mInvokeSequenceCallback */
        private final boolean f348x896d308b;

        /* renamed from: mRequest */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request f349xdf67a562;

        public Camera2CallbackWrapper(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback, boolean z17) {
            this.f347x1ab9c7d2 = callback;
            this.f349xdf67a562 = request;
            this.f348x896d308b = z17;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            this.f347x1ab9c7d2.mo5570xf66d3f4b(this.f349xdf67a562, j17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0202x3251ae70.this.m3289x79e87a37(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.f347x1ab9c7d2.mo5571x34cad1a4(this.f349xdf67a562, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0115xf008e111(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            this.f347x1ab9c7d2.mo5572x90bd1f84(this.f349xdf67a562, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0114x8ee43716(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609.Reason.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
            this.f347x1ab9c7d2.mo5573x86fe8753(this.f349xdf67a562, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0115xf008e111(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            if (this.f348x896d308b) {
                this.f347x1ab9c7d2.mo5574x98946d67(i17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            if (this.f348x896d308b) {
                this.f347x1ab9c7d2.mo5575xc68039e3(i17, j17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            this.f347x1ab9c7d2.mo5576x56961e1a(this.f349xdf67a562, j18, j17);
        }
    }

    public C0202x3251ae70(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251> list) {
        m3.h.b(c0216xd3748490.f375xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED, "CaptureSession state must be OPENED. Current state:" + c0216xd3748490.f375xbec81024);
        this.f342x15e0c23d = c0216xd3748490;
        this.f345xb02a2f2b = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    /* renamed from: areRequestsValid */
    private boolean m3284x50ad98a4(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request> list) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request> it = list.iterator();
        while (it.hasNext()) {
            if (!m3286x1fc5e0f7(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: findSurface */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m3285xc35e5cb4(int i17) {
        synchronized (this.f344x6243b38) {
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251> list = this.f345xb02a2f2b;
            if (list == null) {
                return null;
            }
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251 c0753xed070251 : list) {
                if (c0753xed070251.m5661x360a7d14() == i17) {
                    return c0753xed070251;
                }
            }
            return null;
        }
    }

    /* renamed from: isRequestValid */
    private boolean m3286x1fc5e0f7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request) {
        if (request.mo5578xa671f88e().isEmpty()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (java.lang.Integer num : request.mo5578xa671f88e()) {
            if (m3285xc35e5cb4(num.intValue()) == null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3
    /* renamed from: abortCaptures */
    public void mo3287xd96a793d() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490;
        synchronized (this.f344x6243b38) {
            if (!this.f343xfc407ac3 && (c0216xd3748490 = this.f342x15e0c23d) != null) {
                c0216xd3748490.m3334xd96a793d();
            }
        }
    }

    /* renamed from: close */
    public void m3288x5a5ddf8() {
        synchronized (this.f344x6243b38) {
            this.f343xfc407ac3 = true;
            this.f342x15e0c23d = null;
            this.f346x3700320b = null;
            this.f345xb02a2f2b = null;
        }
    }

    /* renamed from: findOutputConfigId */
    public int m3289x79e87a37(android.view.Surface surface) {
        synchronized (this.f344x6243b38) {
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251> list = this.f345xb02a2f2b;
            if (list == null) {
                return -1;
            }
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251 c0753xed070251 : list) {
                if (c0753xed070251.m5407xcf572877().get() == surface) {
                    return c0753xed070251.m5661x360a7d14();
                }
                continue;
            }
            return -1;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3
    /* renamed from: setRepeating */
    public int mo3290x34b1f225(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback) {
        synchronized (this.f344x6243b38) {
            if (!this.f343xfc407ac3 && m3286x1fc5e0f7(request) && this.f342x15e0c23d != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder();
                builder.m5631x5d0f9056(request.mo5579x3bfa572b());
                builder.m5626x9a12cb4a(request.mo5577x99879e0());
                builder.m5608xd4aa81a5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0214xaed41b36.m3318xaf65a0fc(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0202x3251ae70.Camera2CallbackWrapper(request, callback, true)));
                if (this.f346x3700320b != null) {
                    java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f346x3700320b.m5596x26db407e().iterator();
                    while (it.hasNext()) {
                        builder.m5608xd4aa81a5(it.next());
                    }
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c m5336x4aa7b206 = this.f346x3700320b.m5597x57482ff7().m5336x4aa7b206();
                    for (java.lang.String str : m5336x4aa7b206.m5704x5030d3b2()) {
                        builder.m5618xab35ff39(str, m5336x4aa7b206.m5703xb5887064(str));
                    }
                }
                java.util.Iterator<java.lang.Integer> it6 = request.mo5578xa671f88e().iterator();
                while (it6.hasNext()) {
                    builder.m5616x34744cc(m3285xc35e5cb4(it6.next().intValue()));
                }
                return this.f342x15e0c23d.m3345xdf5833bc(builder.m5619x59bc66e());
            }
            return -1;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3
    /* renamed from: stopRepeating */
    public void mo3291x6108ba85() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490;
        synchronized (this.f344x6243b38) {
            if (!this.f343xfc407ac3 && (c0216xd3748490 = this.f342x15e0c23d) != null) {
                c0216xd3748490.m3350x6108ba85();
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3
    /* renamed from: submit */
    public int mo3292xcadc4018(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback) {
        return mo3293xcadc4018(java.util.Arrays.asList(request), callback);
    }

    /* renamed from: updateSessionConfig */
    public void m3294xd8cf6f2f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        synchronized (this.f344x6243b38) {
            this.f346x3700320b = c0750xb915958;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3
    /* renamed from: submit */
    public int mo3293xcadc4018(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback callback) {
        synchronized (this.f344x6243b38) {
            if (!this.f343xfc407ac3 && m3284x50ad98a4(list) && this.f342x15e0c23d != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z17 = true;
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request : list) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
                    builder.m5366x5d0f9056(request.mo5579x3bfa572b());
                    builder.m5363x9a12cb4a(request.mo5577x99879e0());
                    builder.m5345xd4aa81a5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0214xaed41b36.m3318xaf65a0fc(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0202x3251ae70.Camera2CallbackWrapper(request, callback, z17)));
                    java.util.Iterator<java.lang.Integer> it = request.mo5578xa671f88e().iterator();
                    while (it.hasNext()) {
                        builder.m5348x34744cc(m3285xc35e5cb4(it.next().intValue()));
                    }
                    arrayList.add(builder.m5350x59bc66e());
                    z17 = false;
                }
                return this.f342x15e0c23d.m3342xb6643c10(arrayList);
            }
            return -1;
        }
    }
}
