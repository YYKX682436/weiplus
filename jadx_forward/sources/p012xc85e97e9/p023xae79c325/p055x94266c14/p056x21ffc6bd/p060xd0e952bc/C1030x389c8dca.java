package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor */
/* loaded from: classes14.dex */
public class C1030x389c8dca {
    private static final java.lang.String TAG = "PreviewProcessor";

    /* renamed from: mPreviewImageProcessor */
    private final androidx.camera.extensions.impl.PreviewImageProcessorImpl f2575x550350f2;

    /* renamed from: mCaptureResultImageMatcher */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da f2571x4151660d = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da();

    /* renamed from: mLock */
    private final java.lang.Object f2574x6243b38 = new java.lang.Object();

    /* renamed from: mIsClosed */
    private boolean f2572xfc407ac3 = false;

    /* renamed from: mIsPaused */
    private boolean f2573x11d73285 = false;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor$OnCaptureResultCallback */
    /* loaded from: classes14.dex */
    public interface OnCaptureResultCallback {
        /* renamed from: onCaptureResult */
        void mo6815xa5745364(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list);
    }

    public C1030x389c8dca(androidx.camera.extensions.impl.PreviewImageProcessorImpl previewImageProcessorImpl, android.view.Surface surface, android.util.Size size) {
        this.f2575x550350f2 = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$start$0 */
    public /* synthetic */ void m6851xb49a2491(final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1030x389c8dca.OnCaptureResultCallback onCaptureResultCallback, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        synchronized (this.f2574x6243b38) {
            if (this.f2572xfc407ac3 || this.f2573x11d73285) {
                interfaceC1027x69a2d850.mo6848x23e5cc93();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Ignore image in closed or paused state");
                return;
            }
            try {
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e;
                if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
                    this.f2575x550350f2.process(interfaceC1027x69a2d850.get(), totalCaptureResult, new androidx.camera.extensions.impl.ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                        /* renamed from: onCaptureCompleted */
                        public void m6858x34cad1a4(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                            onCaptureResultCallback.mo6815xa5745364(j17, list);
                        }

                        /* renamed from: onCaptureProcessProgressed */
                        public void m6859x1c9165b4(int i18) {
                        }
                    }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5980xf96be419());
                } else {
                    this.f2575x550350f2.process(interfaceC1027x69a2d850.get(), totalCaptureResult);
                }
            } finally {
                interfaceC1027x69a2d850.mo6848x23e5cc93();
            }
        }
    }

    /* renamed from: close */
    public void m6852x5a5ddf8() {
        synchronized (this.f2574x6243b38) {
            this.f2572xfc407ac3 = true;
            this.f2571x4151660d.m6841x5a5b64d();
            this.f2571x4151660d.m6842xae88ffb1();
        }
    }

    /* renamed from: notifyCaptureResult */
    public void m6853xdd88e63a(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        this.f2571x4151660d.m6839xafb61849(totalCaptureResult);
    }

    /* renamed from: notifyImage */
    public void m6854x96e84792(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850) {
        this.f2571x4151660d.m6843x56f77aa1(interfaceC1027x69a2d850);
    }

    /* renamed from: pause */
    public void m6855x65825f6() {
        synchronized (this.f2574x6243b38) {
            this.f2573x11d73285 = true;
        }
    }

    /* renamed from: resume */
    public void m6856xc84dc82d() {
        synchronized (this.f2574x6243b38) {
            this.f2573x11d73285 = false;
        }
    }

    /* renamed from: start */
    public void m6857x68ac462(final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1030x389c8dca.OnCaptureResultCallback onCaptureResultCallback) {
        this.f2571x4151660d.m6844x7b8e1806(new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor$$a
            @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da.ImageReferenceListener
            /* renamed from: onImageReferenceIncoming */
            public final void mo6845xea0cb135(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1030x389c8dca.this.m6851xb49a2491(onCaptureResultCallback, interfaceC1027x69a2d850, totalCaptureResult, i17);
            }
        });
    }
}
