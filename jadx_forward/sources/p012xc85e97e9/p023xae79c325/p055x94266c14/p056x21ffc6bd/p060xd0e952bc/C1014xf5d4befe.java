package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor */
/* loaded from: classes14.dex */
public class C1014xf5d4befe extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad {
    private static final java.lang.String TAG = "AdvancedSessionProcessor";

    /* renamed from: mContext */
    private final android.content.Context f2461xd6cfe882;

    /* renamed from: mCurrentExtensionTypeLiveData */
    private final p012xc85e97e9.p093xedfae76a.j0 f2462x5c3f2903;

    /* renamed from: mExtensionMetadataMonitor */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.ExtensionMetadataMonitor f2463x6d015a79;

    /* renamed from: mExtensionStrengthLiveData */
    private final p012xc85e97e9.p093xedfae76a.j0 f2464xf6fe6889;

    /* renamed from: mImpl */
    private final androidx.camera.extensions.impl.advanced.SessionProcessorImpl f2465x622d82d;

    /* renamed from: mIsPostviewConfigured */
    private boolean f2466x18d0163a;

    /* renamed from: mMode */
    private final int f2467x624afb0;

    /* renamed from: mRepeatingCaptureCallbackAdapter */
    private p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.SessionProcessorImplCaptureCallbackAdapter f2468x9c652e3e;

    /* renamed from: mVendorExtender */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf f2469x3dedb87c;

    /* renamed from: mWillReceiveOnCaptureCompleted */
    private final boolean f2470x4d6d70c8;

    /* renamed from: mWorkingCaptureConfigMap */
    private java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> f2471xfe648c38;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$CallbackAdapter */
    /* loaded from: classes14.dex */
    public static class CallbackAdapter implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback {

        /* renamed from: mCallback */
        private final androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback f2472x1ab9c7d2;

        public CallbackAdapter(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            this.f2472x1ab9c7d2 = callback;
        }

        /* renamed from: getImplRequest */
        private androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request m6757x445fcb19(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request) {
            m3.h.a(request instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.RequestAdapter);
            return ((p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.RequestAdapter) request).m6770x445fcb19();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
        /* renamed from: onCaptureBufferLost */
        public void mo5570xf66d3f4b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, long j17, int i17) {
            this.f2472x1ab9c7d2.onCaptureBufferLost(m6757x445fcb19(request), j17, i17);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
        /* renamed from: onCaptureCompleted */
        public void mo5571x34cad1a4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
            android.hardware.camera2.CaptureResult mo2933x2fc52b4d = interfaceC0663xe081a7be.mo2933x2fc52b4d();
            m3.h.b(mo2933x2fc52b4d instanceof android.hardware.camera2.TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.f2472x1ab9c7d2.onCaptureCompleted(m6757x445fcb19(request), (android.hardware.camera2.TotalCaptureResult) mo2933x2fc52b4d);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
        /* renamed from: onCaptureFailed */
        public void mo5572x90bd1f84(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
            java.lang.Object mo2926x46b1345a = c0661xad844609.mo2926x46b1345a();
            m3.h.b(mo2926x46b1345a instanceof android.hardware.camera2.CaptureFailure, "CameraCaptureFailure does not contain CaptureFailure.");
            this.f2472x1ab9c7d2.onCaptureFailed(m6757x445fcb19(request), (android.hardware.camera2.CaptureFailure) mo2926x46b1345a);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
        /* renamed from: onCaptureProgressed */
        public void mo5573x86fe8753(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
            android.hardware.camera2.CaptureResult mo2933x2fc52b4d = interfaceC0663xe081a7be.mo2933x2fc52b4d();
            m3.h.b(mo2933x2fc52b4d != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.f2472x1ab9c7d2.onCaptureProgressed(m6757x445fcb19(request), mo2933x2fc52b4d);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
        /* renamed from: onCaptureSequenceAborted */
        public void mo5574x98946d67(int i17) {
            this.f2472x1ab9c7d2.onCaptureSequenceAborted(i17);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
        /* renamed from: onCaptureSequenceCompleted */
        public void mo5575xc68039e3(int i17, long j17) {
            this.f2472x1ab9c7d2.onCaptureSequenceCompleted(i17, j17);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Callback
        /* renamed from: onCaptureStarted */
        public void mo5576x56961e1a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request request, long j17, long j18) {
            this.f2472x1ab9c7d2.onCaptureStarted(m6757x445fcb19(request), j17, j18);
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ExtensionMetadataMonitor */
    /* loaded from: classes14.dex */
    public static class ExtensionMetadataMonitor {

        /* renamed from: mCurrentExtensionTypeLiveData */
        private final p012xc85e97e9.p093xedfae76a.j0 f2473x5c3f2903;

        /* renamed from: mExtensionStrengthLiveData */
        private final p012xc85e97e9.p093xedfae76a.j0 f2474xf6fe6889;

        public ExtensionMetadataMonitor(p012xc85e97e9.p093xedfae76a.j0 j0Var, p012xc85e97e9.p093xedfae76a.j0 j0Var2) {
            this.f2473x5c3f2903 = j0Var;
            this.f2474xf6fe6889 = j0Var2;
        }

        /* renamed from: convertExtensionMode */
        private int m6758x52fdbf8f(int i17) {
            if (i17 == 0) {
                return 5;
            }
            if (i17 == 1) {
                return 4;
            }
            if (i17 == 2) {
                return 1;
            }
            if (i17 != 3) {
                return i17 != 4 ? 0 : 3;
            }
            return 2;
        }

        /* renamed from: checkExtensionMetadata */
        public void m6759x13d65866(java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> map) {
            java.lang.Object obj;
            java.lang.Object obj2;
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                if (this.f2473x5c3f2903 != null && (obj2 = map.get(android.hardware.camera2.CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                    java.lang.Integer num = (java.lang.Integer) obj2;
                    if (!java.util.Objects.equals(this.f2473x5c3f2903.mo3195x754a37bb(), java.lang.Integer.valueOf(m6758x52fdbf8f(num.intValue())))) {
                        this.f2473x5c3f2903.mo7808x76db6cb1(java.lang.Integer.valueOf(m6758x52fdbf8f(num.intValue())));
                    }
                }
                if (this.f2474xf6fe6889 == null || (obj = map.get(android.hardware.camera2.CaptureResult.EXTENSION_STRENGTH)) == null || java.util.Objects.equals(this.f2474xf6fe6889.mo3195x754a37bb(), obj)) {
                    return;
                }
                this.f2474xf6fe6889.mo7808x76db6cb1((java.lang.Integer) obj);
            }
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageProcessorAdapter */
    /* loaded from: classes14.dex */
    public static class ImageProcessorAdapter implements p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597 {

        /* renamed from: mImpl */
        private final androidx.camera.extensions.impl.advanced.ImageProcessorImpl f2475x622d82d;

        public ImageProcessorAdapter(androidx.camera.extensions.impl.advanced.ImageProcessorImpl imageProcessorImpl) {
            this.f2475x622d82d = imageProcessorImpl;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597
        /* renamed from: onNextImageAvailable */
        public void mo6760x6eaeb9c0(int i17, long j17, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, java.lang.String str) {
            this.f2475x622d82d.onNextImageAvailable(i17, j17, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.ImageReferenceImplAdapter(interfaceC1027x69a2d850), str);
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageReferenceImplAdapter */
    /* loaded from: classes14.dex */
    public static class ImageReferenceImplAdapter implements androidx.camera.extensions.impl.advanced.ImageReferenceImpl {

        /* renamed from: mImageReference */
        private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 f2476xac0f15fd;

        public ImageReferenceImplAdapter(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850) {
            this.f2476xac0f15fd = interfaceC1027x69a2d850;
        }

        /* renamed from: decrement */
        public boolean m6761x23e5cc93() {
            return this.f2476xac0f15fd.mo6848x23e5cc93();
        }

        public android.media.Image get() {
            return this.f2476xac0f15fd.get();
        }

        /* renamed from: increment */
        public boolean m6762xb0268b6f() {
            return this.f2476xac0f15fd.mo6849xb0268b6f();
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter */
    /* loaded from: classes14.dex */
    public static class OutputSurfaceConfigurationImplAdapter implements androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl {

        /* renamed from: mAnalysisOutputSurface */
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl f2477xe34fc083;

        /* renamed from: mCaptureOutputSurface */
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl f2478xef2a1ed3;

        /* renamed from: mPostviewOutputSurface */
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl f2479x80cb22ba;

        /* renamed from: mPreviewOutputSurface */
        private final androidx.camera.extensions.impl.advanced.OutputSurfaceImpl f2480x485ee591;

        public OutputSurfaceConfigurationImplAdapter(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a abstractC0738x8f67d80a) {
            this.f2480x485ee591 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceImplAdapter(abstractC0738x8f67d80a.mo5164x8d44e5fa());
            this.f2478xef2a1ed3 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceImplAdapter(abstractC0738x8f67d80a.mo5162x1cfaa20b());
            this.f2477xe34fc083 = abstractC0738x8f67d80a.mo5161x6f8fa44b() != null ? new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceImplAdapter(abstractC0738x8f67d80a.mo5161x6f8fa44b()) : null;
            this.f2479x80cb22ba = abstractC0738x8f67d80a.mo5163xd8a52f71() != null ? new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceImplAdapter(abstractC0738x8f67d80a.mo5163xd8a52f71()) : null;
        }

        /* renamed from: getImageAnalysisOutputSurface */
        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl m6763x6f8fa44b() {
            return this.f2477xe34fc083;
        }

        /* renamed from: getImageCaptureOutputSurface */
        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl m6764x1cfaa20b() {
            return this.f2478xef2a1ed3;
        }

        /* renamed from: getPostviewOutputSurface */
        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl m6765xd8a52f71() {
            return this.f2479x80cb22ba;
        }

        /* renamed from: getPreviewOutputSurface */
        public androidx.camera.extensions.impl.advanced.OutputSurfaceImpl m6766x8d44e5fa() {
            return this.f2480x485ee591;
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$OutputSurfaceImplAdapter */
    /* loaded from: classes14.dex */
    public static class OutputSurfaceImplAdapter implements androidx.camera.extensions.impl.advanced.OutputSurfaceImpl {

        /* renamed from: mOutputSurface */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c f2481x6be280ff;

        public OutputSurfaceImplAdapter(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c) {
            this.f2481x6be280ff = abstractC0737x4073a84c;
        }

        /* renamed from: getImageFormat */
        public int m6767x450a23fc() {
            return this.f2481x6be280ff.mo5155x450a23fc();
        }

        /* renamed from: getSize */
        public android.util.Size m6768xfb854877() {
            return this.f2481x6be280ff.mo5156xfb854877();
        }

        /* renamed from: getSurface */
        public android.view.Surface m6769xcf572877() {
            return this.f2481x6be280ff.mo5157xcf572877();
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$RequestAdapter */
    /* loaded from: classes14.dex */
    public static class RequestAdapter implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request {

        /* renamed from: mImplRequest */
        private final androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request f2482x149695a2;

        /* renamed from: mParameters */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f2483xf789ba37;

        /* renamed from: mTargetOutputConfigIds */
        private final java.util.List<java.lang.Integer> f2484x4e97ebd7;

        /* renamed from: mTemplateId */
        private final int f2485x29eb9782;

        public RequestAdapter(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request request) {
            this.f2482x149695a2 = request;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.Integer) it.next());
            }
            this.f2484x4e97ebd7 = arrayList;
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder builder = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder();
            for (android.hardware.camera2.CaptureRequest.Key key : request.getParameters().keySet()) {
                builder.m6713xea2ad5c0(key, request.getParameters().get(key));
            }
            this.f2483xf789ba37 = builder.m6712x59bc66e();
            this.f2485x29eb9782 = request.getTemplateId().intValue();
        }

        /* renamed from: getImplRequest */
        public androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request m6770x445fcb19() {
            return this.f2482x149695a2;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request
        /* renamed from: getParameters */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5577x99879e0() {
            return this.f2483xf789ba37;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request
        /* renamed from: getTargetOutputConfigIds */
        public java.util.List<java.lang.Integer> mo5578xa671f88e() {
            return this.f2484x4e97ebd7;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request
        /* renamed from: getTemplateId */
        public int mo5579x3bfa572b() {
            return this.f2485x29eb9782;
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$RequestProcessorImplAdapter */
    /* loaded from: classes14.dex */
    public class RequestProcessorImplAdapter implements androidx.camera.extensions.impl.advanced.RequestProcessorImpl {

        /* renamed from: mRequestProcessor */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 f2486x94b0b550;

        public RequestProcessorImplAdapter(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 interfaceC0746x3c5d2ee3) {
            this.f2486x94b0b550 = interfaceC0746x3c5d2ee3;
        }

        /* renamed from: abortCaptures */
        public void m6771xd96a793d() {
            this.f2486x94b0b550.mo3287xd96a793d();
        }

        /* renamed from: setImageProcessor */
        public void m6772x51ce4e79(int i17, androidx.camera.extensions.impl.advanced.ImageProcessorImpl imageProcessorImpl) {
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.this.m6870x51ce4e79(i17, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.ImageProcessorAdapter(imageProcessorImpl));
        }

        /* renamed from: setRepeating */
        public int m6773x34b1f225(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request request, androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            return this.f2486x94b0b550.mo3290x34b1f225(new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.RequestAdapter(request), new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.CallbackAdapter(callback));
        }

        /* renamed from: stopRepeating */
        public void m6774x6108ba85() {
            this.f2486x94b0b550.mo3291x6108ba85();
        }

        /* renamed from: submit */
        public int m6775xcadc4018(androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request request, androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            return this.f2486x94b0b550.mo3292xcadc4018(new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.RequestAdapter(request), new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.CallbackAdapter(callback));
        }

        /* renamed from: submit */
        public int m6776xcadc4018(java.util.List<androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request> list, androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Callback callback) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.extensions.impl.advanced.RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.RequestAdapter(it.next()));
            }
            return this.f2486x94b0b550.mo3293xcadc4018(arrayList, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.CallbackAdapter(callback));
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter */
    /* loaded from: classes14.dex */
    public static class SessionProcessorImplCaptureCallbackAdapter implements androidx.camera.extensions.impl.advanced.SessionProcessorImpl.CaptureCallback {

        /* renamed from: mCaptureCallback */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback f2488x4833d57e;

        /* renamed from: mExtensionMetadataMonitor */
        private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.ExtensionMetadataMonitor f2489x6d015a79;

        /* renamed from: mOnCaptureStartedTimestamp */
        private long f2490xdb1b2c2f;

        /* renamed from: mTagBundle */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c f2491xc5f18acf;

        /* renamed from: mWillReceiveOnCaptureCompleted */
        private boolean f2492x4d6d70c8;

        public SessionProcessorImplCaptureCallbackAdapter(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, boolean z17) {
            this(captureCallback, c0760xc2ac609c, null, z17);
        }

        /* renamed from: onCaptureCompleted */
        public void m6777x34cad1a4(long j17, int i17, java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> map) {
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.ExtensionMetadataMonitor extensionMetadataMonitor = this.f2489x6d015a79;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.m6759x13d65866(map);
            }
            if (this.f2492x4d6d70c8) {
                this.f2488x4833d57e.mo3513x34cad1a4(j17, i17, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1028xf0a1e1f4(j17, this.f2491xc5f18acf, map));
                this.f2488x4833d57e.mo3516xc68039e3(i17);
            }
        }

        /* renamed from: onCaptureFailed */
        public void m6778x90bd1f84(int i17) {
            this.f2488x4833d57e.mo3514x90bd1f84(i17);
        }

        /* renamed from: onCaptureProcessProgressed */
        public void m6779x1c9165b4(int i17) {
            this.f2488x4833d57e.mo3515x1c9165b4(i17);
        }

        /* renamed from: onCaptureProcessStarted */
        public void m6780x2841c359(int i17) {
            this.f2488x4833d57e.mo3522x2841c359(i17);
        }

        /* renamed from: onCaptureSequenceAborted */
        public void m6781x98946d67(int i17) {
            this.f2488x4833d57e.mo3523x98946d67(i17);
        }

        /* renamed from: onCaptureSequenceCompleted */
        public void m6782xc68039e3(int i17) {
            if (this.f2492x4d6d70c8) {
                return;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback = this.f2488x4833d57e;
            long j17 = this.f2490xdb1b2c2f;
            captureCallback.mo3513x34cad1a4(j17, i17, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1028xf0a1e1f4(j17, this.f2491xc5f18acf, java.util.Collections.emptyMap()));
            this.f2488x4833d57e.mo3516xc68039e3(i17);
        }

        /* renamed from: onCaptureStarted */
        public void m6783x56961e1a(int i17, long j17) {
            this.f2490xdb1b2c2f = j17;
            this.f2488x4833d57e.mo3517x56961e1a(i17, j17);
        }

        public SessionProcessorImplCaptureCallbackAdapter(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.ExtensionMetadataMonitor extensionMetadataMonitor, boolean z17) {
            this.f2490xdb1b2c2f = -1L;
            this.f2488x4833d57e = captureCallback;
            this.f2491xc5f18acf = c0760xc2ac609c;
            this.f2489x6d015a79 = extensionMetadataMonitor;
            this.f2492x4d6d70c8 = z17;
        }
    }

    public C1014xf5d4befe(androidx.camera.extensions.impl.advanced.SessionProcessorImpl sessionProcessorImpl, java.util.List<android.hardware.camera2.CaptureRequest.Key> list, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf, android.content.Context context) {
        this(sessionProcessorImpl, list, interfaceC0999xfb817acf, context, 0);
    }

    /* renamed from: convertConfigToMap */
    private static java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> m6753x89119b0c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> hashMap = new java.util.HashMap<>();
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26 m6712x59bc66e = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder.m6710x3017aa(interfaceC0692x78a46f62).m6712x59bc66e();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : m6712x59bc66e.mo5378xc8202020()) {
            hashMap.put((android.hardware.camera2.CaptureRequest.Key) option.mo5111x75346043(), m6712x59bc66e.mo5379x77ba97d1(option));
        }
        return hashMap;
    }

    /* renamed from: convertToCamera2SessionConfig */
    private p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb m6754x31fd0179(androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl camera2SessionConfigImpl) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30 c1023x4fac6c30 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30();
        java.util.Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            c1023x4fac6c30.m6825x5864e6e4(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1021xe2a8db0.m6820xb5cb08ea((androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl) it.next()));
        }
        for (android.hardware.camera2.CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            c1023x4fac6c30.m6826x4c53474(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        c1023x4fac6c30.m6831x266cce29(camera2SessionConfigImpl.getSessionTemplateId());
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType == -1) {
                    sessionType = 0;
                }
                c1023x4fac6c30.m6832x6ee5052e(sessionType);
            } catch (java.lang.NoSuchMethodError unused) {
                c1023x4fac6c30.m6832x6ee5052e(0);
            }
        }
        return c1023x4fac6c30.m6827x59bc66e();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: abortCapture */
    public void mo5648x725e45f6(int i17) {
        this.f2465x622d82d.abortCapture(i17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad
    /* renamed from: deInitSessionInternal */
    public void mo6755x67d78a02() {
        synchronized (this.f2591x6243b38) {
            this.f2471xfe648c38 = new java.util.HashMap<>();
            this.f2468x9c652e3e = null;
        }
        this.f2465x622d82d.deInitSession();
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0974x59b7f987
    /* renamed from: getCurrentExtensionMode */
    public p012xc85e97e9.p093xedfae76a.g0 mo6615x3afa2dff() {
        return this.f2462x5c3f2903;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0974x59b7f987
    /* renamed from: getExtensionStrength */
    public p012xc85e97e9.p093xedfae76a.g0 mo6616xc94ca8ea() {
        return this.f2464xf6fe6889;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: getRealtimeCaptureLatency */
    public android.util.Pair<java.lang.Long, java.lang.Long> mo5650xd2b81c19() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return this.f2465x622d82d.getRealtimeCaptureLatency();
        }
        return null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: getSupportedCameraOperations */
    public /* bridge */ /* synthetic */ java.util.Set mo5651x36ea2709() {
        return super.mo5651x36ea2709();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: getSupportedPostviewSize */
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> mo5652x216212fe(android.util.Size size) {
        return this.f2469x3dedb87c.mo6668x8d2e83aa(size);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad
    /* renamed from: initSessionInternal */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb mo6756xce8a4843(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a abstractC0738x8f67d80a) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl initSession = (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) ? this.f2465x622d82d.initSession(str, map, this.f2461xd6cfe882, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceConfigurationImplAdapter(abstractC0738x8f67d80a)) : null;
        if (initSession == null) {
            initSession = this.f2465x622d82d.initSession(str, map, this.f2461xd6cfe882, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceImplAdapter(abstractC0738x8f67d80a.mo5164x8d44e5fa()), new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceImplAdapter(abstractC0738x8f67d80a.mo5162x1cfaa20b()), abstractC0738x8f67d80a.mo5161x6f8fa44b() != null ? new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.OutputSurfaceImplAdapter(abstractC0738x8f67d80a.mo5161x6f8fa44b()) : null);
        }
        this.f2466x18d0163a = abstractC0738x8f67d80a.mo5163xd8a52f71() != null;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f2462x5c3f2903;
        if (j0Var != null) {
            j0Var.mo7808x76db6cb1(java.lang.Integer.valueOf(this.f2467x624afb0));
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = this.f2464xf6fe6889;
        if (j0Var2 != null) {
            j0Var2.mo7808x76db6cb1(100);
        }
        return m6754x31fd0179(initSession);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0974x59b7f987
    /* renamed from: isCurrentExtensionModeAvailable */
    public boolean mo6617x8f908e36() {
        return this.f2469x3dedb87c.mo6673x8f908e36();
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0974x59b7f987
    /* renamed from: isExtensionStrengthAvailable */
    public boolean mo6618xa01385d3() {
        return this.f2469x3dedb87c.mo6675xa01385d3();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: onCaptureSessionEnd */
    public void mo5654xe7df0e2c() {
        this.f2465x622d82d.onCaptureSessionEnd();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: onCaptureSessionStart */
    public void mo5655x6d1c3973(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3 interfaceC0746x3c5d2ee3) {
        this.f2465x622d82d.onCaptureSessionStart(new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.RequestProcessorImplAdapter(interfaceC0746x3c5d2ee3));
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0972x6d1af5e4
    /* renamed from: setExtensionStrength */
    public void mo6613xa4e2b55e(int i17) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        java.util.HashMap hashMap;
        if (!mo6618xa01385d3() || android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        synchronized (this.f2591x6243b38) {
            this.f2588x12f9a8b3 = i17;
            this.f2471xfe648c38.put(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH, java.lang.Integer.valueOf(i17));
            sessionProcessorImplCaptureCallbackAdapter = this.f2468x9c652e3e;
            hashMap = (java.util.HashMap) this.f2471xfe648c38.clone();
        }
        this.f2465x622d82d.setParameters(hashMap);
        if (sessionProcessorImplCaptureCallbackAdapter != null) {
            this.f2465x622d82d.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: setParameters */
    public void mo5656x37bcc7ec(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> m6753x89119b0c;
        synchronized (this.f2591x6243b38) {
            m6753x89119b0c = m6753x89119b0c(interfaceC0692x78a46f62);
            int i17 = this.f2588x12f9a8b3;
            if (i17 != -1 && android.os.Build.VERSION.SDK_INT >= 34) {
                m6753x89119b0c.put(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH, java.lang.Integer.valueOf(i17));
            }
            this.f2471xfe648c38 = m6753x89119b0c;
        }
        this.f2465x622d82d.setParameters(m6753x89119b0c);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: startCapture */
    public int mo5657x18ec4884(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "startCapture postviewEnabled = " + z17 + " mWillReceiveOnCaptureCompleted = " + this.f2470x4d6d70c8);
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.SessionProcessorImplCaptureCallbackAdapter(captureCallback, c0760xc2ac609c, this.f2470x4d6d70c8);
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        return (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8) && this.f2466x18d0163a && z17 && this.f2469x3dedb87c.mo6676x1222f0fa()) ? this.f2465x622d82d.startCaptureWithPostview(sessionProcessorImplCaptureCallbackAdapter) : this.f2465x622d82d.startCapture(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: startRepeating */
    public int mo5658xc3d1ea25(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        synchronized (this.f2591x6243b38) {
            sessionProcessorImplCaptureCallbackAdapter = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.SessionProcessorImplCaptureCallbackAdapter(captureCallback, c0760xc2ac609c, this.f2463x6d015a79, this.f2470x4d6d70c8);
            this.f2468x9c652e3e = sessionProcessorImplCaptureCallbackAdapter;
        }
        return this.f2465x622d82d.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: startTrigger */
    public int mo5659xb8cfd6f6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.CaptureCallback captureCallback) {
        java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> m6753x89119b0c = m6753x89119b0c(interfaceC0692x78a46f62);
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return this.f2465x622d82d.startTrigger(m6753x89119b0c, new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.SessionProcessorImplCaptureCallbackAdapter(captureCallback, c0760xc2ac609c, this.f2470x4d6d70c8));
        }
        return -1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: stopRepeating */
    public void mo5660x6108ba85() {
        this.f2465x622d82d.stopRepeating();
        synchronized (this.f2591x6243b38) {
            this.f2468x9c652e3e = null;
        }
    }

    public C1014xf5d4befe(androidx.camera.extensions.impl.advanced.SessionProcessorImpl sessionProcessorImpl, java.util.List<android.hardware.camera2.CaptureRequest.Key> list, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf, android.content.Context context, int i17) {
        super(list);
        this.f2466x18d0163a = false;
        this.f2471xfe648c38 = new java.util.HashMap<>();
        this.f2468x9c652e3e = null;
        this.f2465x622d82d = sessionProcessorImpl;
        this.f2469x3dedb87c = interfaceC0999xfb817acf;
        this.f2461xd6cfe882 = context;
        this.f2470x4d6d70c8 = interfaceC0999xfb817acf.m6714x2de4ee35();
        this.f2467x624afb0 = i17;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = mo6617x8f908e36() ? new p012xc85e97e9.p093xedfae76a.j0(java.lang.Integer.valueOf(i17)) : null;
        this.f2462x5c3f2903 = j0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = mo6618xa01385d3() ? new p012xc85e97e9.p093xedfae76a.j0(100) : null;
        this.f2464xf6fe6889 = j0Var2;
        if (j0Var == null && j0Var2 == null) {
            this.f2463x6d015a79 = null;
        } else {
            this.f2463x6d015a79 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe.ExtensionMetadataMonitor(j0Var, j0Var2);
        }
    }
}
