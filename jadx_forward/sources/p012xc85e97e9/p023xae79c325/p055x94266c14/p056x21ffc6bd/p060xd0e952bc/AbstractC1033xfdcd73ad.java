package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase */
/* loaded from: classes14.dex */
abstract class AbstractC1033xfdcd73ad implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc, p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0974x59b7f987, p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0972x6d1af5e4 {

    /* renamed from: EXTENSION_STRENGTH_UNKNOWN */
    protected static final int f2586x7088664c = -1;
    private static final java.lang.String TAG = "SessionProcessorBase";

    /* renamed from: mCameraId */
    private java.lang.String f2587x1c133ead;

    /* renamed from: mImageReaderHandlerThread */
    private android.os.HandlerThread f2589x5f9f3e23;

    /* renamed from: mSupportedCameraOperations */
    private final java.util.Set<java.lang.Integer> f2593xa8e34dd2;

    /* renamed from: mImageReaderMap */
    private final java.util.Map<java.lang.Integer, android.media.ImageReader> f2590xa129504b = new java.util.HashMap();

    /* renamed from: mOutputConfigMap */
    private final java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> f2592x7691928c = new java.util.HashMap();

    /* renamed from: mSurfacesList */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f2594x790dc431 = new java.util.ArrayList();

    /* renamed from: mLock */
    protected final java.lang.Object f2591x6243b38 = new java.lang.Object();

    /* renamed from: mExtensionStrength */
    protected int f2588x12f9a8b3 = -1;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase$ImageRefHolder */
    /* loaded from: classes14.dex */
    public static class ImageRefHolder implements p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 {

        /* renamed from: mImage */
        private final android.media.Image f2595xbe37f4ee;

        /* renamed from: mImageLock */
        private final java.lang.Object f2596x465c0739 = new java.lang.Object();

        /* renamed from: mRefCount */
        private int f2597xf80bb3c9 = 1;

        public ImageRefHolder(android.media.Image image) {
            this.f2595xbe37f4ee = image;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850
        /* renamed from: decrement */
        public boolean mo6848x23e5cc93() {
            synchronized (this.f2596x465c0739) {
                int i17 = this.f2597xf80bb3c9;
                if (i17 <= 0) {
                    return false;
                }
                int i18 = i17 - 1;
                this.f2597xf80bb3c9 = i18;
                if (i18 <= 0) {
                    this.f2595xbe37f4ee.close();
                }
                return true;
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850
        public android.media.Image get() {
            return this.f2595xbe37f4ee;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850
        /* renamed from: increment */
        public boolean mo6849xb0268b6f() {
            synchronized (this.f2596x465c0739) {
                int i17 = this.f2597xf80bb3c9;
                if (i17 <= 0) {
                    return false;
                }
                this.f2597xf80bb3c9 = i17 + 1;
                return true;
            }
        }
    }

    public AbstractC1033xfdcd73ad(java.util.List<android.hardware.camera2.CaptureRequest.Key> list) {
        this.f2593xa8e34dd2 = m6867x36ea2709(list);
    }

    /* renamed from: createOutputConfigSurface */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251 m6866x44dce0ee(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 interfaceC1020xba84a5d0, java.util.Map<java.lang.Integer, android.media.ImageReader> map) {
        if (interfaceC1020xba84a5d0 instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251(((p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0) interfaceC1020xba84a5d0).mo6800xcf572877(), interfaceC1020xba84a5d0.mo6785x5db1b11());
        }
        if (!(interfaceC1020xba84a5d0 instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1)) {
            if (interfaceC1020xba84a5d0 instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c) {
                throw new java.lang.UnsupportedOperationException("MultiResolutionImageReader not supported yet");
            }
            throw new java.lang.UnsupportedOperationException("Unsupported Camera2OutputConfig:" + interfaceC1020xba84a5d0);
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1 abstractC1026x206360a1 = (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1) interfaceC1020xba84a5d0;
        final android.media.ImageReader newInstance = android.media.ImageReader.newInstance(abstractC1026x206360a1.mo6789xfb854877().getWidth(), abstractC1026x206360a1.mo6789xfb854877().getHeight(), abstractC1026x206360a1.mo6786x450a23fc(), abstractC1026x206360a1.mo6787xcb8dea46());
        map.put(java.lang.Integer.valueOf(interfaceC1020xba84a5d0.mo6785x5db1b11()), newInstance);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251 c0753xed070251 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251(newInstance.getSurface(), interfaceC1020xba84a5d0.mo6785x5db1b11());
        c0753xed070251.m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase$$a
            @Override // java.lang.Runnable
            public final void run() {
                newInstance.close();
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        return c0753xed070251;
    }

    /* renamed from: getSupportedCameraOperations */
    private java.util.Set<java.lang.Integer> m6867x36ea2709(java.util.List<android.hardware.camera2.CaptureRequest.Key> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO) || list.contains(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (i17 >= 34 && list.contains(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH)) {
            hashSet.add(8);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setImageProcessor$1 */
    public static /* synthetic */ void m6869x8e0b6869(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597 interfaceC1025x5f86e597, int i17, java.lang.String str, android.media.ImageReader imageReader) {
        try {
            android.media.Image acquireNextImage = imageReader.acquireNextImage();
            interfaceC1025x5f86e597.mo6760x6eaeb9c0(i17, acquireNextImage.getTimestamp(), new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad.ImageRefHolder(acquireNextImage), str);
        } catch (java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to acquire next image.", e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: deInitSession */
    public final void mo5649x5cad5425() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "deInitSession: cameraId=" + this.f2587x1c133ead);
        mo6755x67d78a02();
        synchronized (this.f2591x6243b38) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = this.f2594x790dc431.iterator();
            while (it.hasNext()) {
                it.next().mo5401x5a5ddf8();
            }
            this.f2594x790dc431.clear();
            this.f2590xa129504b.clear();
            this.f2592x7691928c.clear();
            this.f2588x12f9a8b3 = -1;
        }
        android.os.HandlerThread handlerThread = this.f2589x5f9f3e23;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f2589x5f9f3e23 = null;
        }
    }

    /* renamed from: deInitSessionInternal */
    public abstract void mo6755x67d78a02();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: initSession */
    public final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo5653xc4fee366(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a abstractC0738x8f67d80a) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93;
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb mo6756xce8a4843 = mo6756xce8a4843(interfaceC0675x66574570.mo3161x72efd496(), p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0993x4a94d8dd.m6705xc80a217f(interfaceC0675x66574570), abstractC0738x8f67d80a);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder();
        synchronized (this.f2591x6243b38) {
            for (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 interfaceC1020xba84a5d0 : mo6756xce8a4843.mo6821x755b2d7a()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0753xed070251 m6866x44dce0ee = m6866x44dce0ee(interfaceC1020xba84a5d0, this.f2590xa129504b);
                this.f2594x790dc431.add(m6866x44dce0ee);
                this.f2592x7691928c.put(java.lang.Integer.valueOf(interfaceC1020xba84a5d0.mo6785x5db1b11()), interfaceC1020xba84a5d0);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5182x46240f8f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.m5634xdc3ef9b(m6866x44dce0ee).mo5179x376a1199(interfaceC1020xba84a5d0.mo6788x936d7c8d()).mo5182x46240f8f(interfaceC1020xba84a5d0.mo6790x7e2da783());
                java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> mo6791x75db70cb = interfaceC1020xba84a5d0.mo6791x75db70cb();
                if (mo6791x75db70cb != null && !mo6791x75db70cb.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 interfaceC1020xba84a5d02 : mo6791x75db70cb) {
                        this.f2592x7691928c.put(java.lang.Integer.valueOf(interfaceC1020xba84a5d02.mo6785x5db1b11()), interfaceC1020xba84a5d02);
                        arrayList.add(m6866x44dce0ee(interfaceC1020xba84a5d02, this.f2590xa129504b));
                    }
                    mo5182x46240f8f.mo5180x39d4b9ed(arrayList);
                }
                builder.m5613x5864e6e4(mo5182x46240f8f.mo5176x59bc66e());
            }
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder builder2 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder();
        for (android.hardware.camera2.CaptureRequest.Key<?> key : mo6756xce8a4843.mo6822x1874e46a().keySet()) {
            builder2.m6713xea2ad5c0(key, mo6756xce8a4843.mo6822x1874e46a().get(key));
        }
        builder.m5626x9a12cb4a(builder2.m6712x59bc66e());
        builder.m5631x5d0f9056(mo6756xce8a4843.mo6823x4ad6c1b5());
        builder.m5630x6ee5052e(mo6756xce8a4843.mo6824xd87f91ba());
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraX-extensions_image_reader");
        this.f2589x5f9f3e23 = handlerThread;
        handlerThread.start();
        this.f2587x1c133ead = interfaceC0675x66574570.mo3161x72efd496();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "initSession: cameraId=" + this.f2587x1c133ead);
        return builder.m5619x59bc66e();
    }

    /* renamed from: initSessionInternal */
    public abstract p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb mo6756xce8a4843(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0738x8f67d80a abstractC0738x8f67d80a);

    /* renamed from: setImageProcessor */
    public void m6870x51ce4e79(final int i17, final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597 interfaceC1025x5f86e597) {
        android.media.ImageReader imageReader;
        final java.lang.String mo6788x936d7c8d;
        synchronized (this.f2591x6243b38) {
            imageReader = this.f2590xa129504b.get(java.lang.Integer.valueOf(i17));
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 interfaceC1020xba84a5d0 = this.f2592x7691928c.get(java.lang.Integer.valueOf(i17));
            mo6788x936d7c8d = interfaceC1020xba84a5d0 == null ? null : interfaceC1020xba84a5d0.mo6788x936d7c8d();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase$$b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(android.media.ImageReader imageReader2) {
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1033xfdcd73ad.m6869x8e0b6869(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1025x5f86e597.this, i17, mo6788x936d7c8d, imageReader2);
                }
            }, new android.os.Handler(this.f2589x5f9f3e23.getLooper()));
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc
    /* renamed from: getSupportedCameraOperations */
    public java.util.Set<java.lang.Integer> mo5651x36ea2709() {
        return this.f2593xa8e34dd2;
    }
}
