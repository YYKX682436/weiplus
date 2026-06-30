package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.BasicVendorExtender */
/* loaded from: classes14.dex */
public class C0988xfdb22e5d implements p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf {
    private static final java.lang.String TAG = "BasicVendorExtender";

    /* renamed from: sBaseSupportedKeys */
    static final java.util.List<android.hardware.camera2.CaptureRequest.Key> f2414x1ec8c83e;

    /* renamed from: mCameraCharacteristics */
    private android.hardware.camera2.CameraCharacteristics f2416x43bc1de6;

    /* renamed from: mCameraId */
    private java.lang.String f2417x1c133ead;

    /* renamed from: mCameraInfo */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 f2418x643e79c0;

    /* renamed from: mImageCaptureExtenderImpl */
    private androidx.camera.extensions.impl.ImageCaptureExtenderImpl f2420xc6054a9f;

    /* renamed from: mPreviewExtenderImpl */
    private androidx.camera.extensions.impl.PreviewExtenderImpl f2421x1e952242;

    /* renamed from: mExtensionDisabledValidator */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1012xd978e1d7 f2419x40fd0404 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1012xd978e1d7();

    /* renamed from: mAvailableKeysRetriever */
    private p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1009x339f0bf9 f2415xcabd4ca6 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1009x339f0bf9();

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS, android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, android.hardware.camera2.CaptureRequest.FLASH_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        f2414x1ec8c83e = arrayList;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            arrayList.add(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO);
        }
    }

    public C0988xfdb22e5d(int i17) {
        this.f2421x1e952242 = null;
        this.f2420xc6054a9f = null;
        try {
            if (i17 == 1) {
                this.f2421x1e952242 = new androidx.camera.extensions.impl.BokehPreviewExtenderImpl();
                this.f2420xc6054a9f = new androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl();
                return;
            }
            if (i17 == 2) {
                this.f2421x1e952242 = new androidx.camera.extensions.impl.HdrPreviewExtenderImpl();
                this.f2420xc6054a9f = new androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl();
                return;
            }
            if (i17 == 3) {
                this.f2421x1e952242 = new androidx.camera.extensions.impl.NightPreviewExtenderImpl();
                this.f2420xc6054a9f = new androidx.camera.extensions.impl.NightImageCaptureExtenderImpl();
            } else if (i17 == 4) {
                this.f2421x1e952242 = new androidx.camera.extensions.impl.BeautyPreviewExtenderImpl();
                this.f2420xc6054a9f = new androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl();
            } else {
                if (i17 == 5) {
                    this.f2421x1e952242 = new androidx.camera.extensions.impl.AutoPreviewExtenderImpl();
                    this.f2420xc6054a9f = new androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl();
                    return;
                }
                throw new java.lang.IllegalArgumentException("Should not activate ExtensionMode.NONE");
            }
        } catch (java.lang.NoClassDefFoundError unused) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "OEM implementation for extension mode " + i17 + "does not exist!");
        }
    }

    /* renamed from: getCaptureInputImageFormat */
    private int m6682x59db7238() {
        androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.f2420xc6054a9f;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    /* renamed from: getOutputSizes */
    private android.util.Size[] m6683xa804d6db(int i17) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) this.f2416x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i17);
    }

    /* renamed from: getPreviewInputImageFormat */
    private int m6684x5e7f4aba() {
        androidx.camera.extensions.impl.PreviewExtenderImpl previewExtenderImpl = this.f2421x1e952242;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    /* renamed from: getSupportedParameterKeys */
    private java.util.List<android.hardware.camera2.CaptureRequest.Key> m6685xf51b625(android.content.Context context) {
        if (!p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e)) {
            return java.util.Collections.unmodifiableList(f2414x1ec8c83e);
        }
        try {
            java.util.List<android.hardware.camera2.CaptureRequest.Key> m6740xb946770 = this.f2415xcabd4ca6.m6740xb946770(this.f2420xc6054a9f, this.f2417x1c133ead, this.f2416x43bc1de6, context);
            if (m6740xb946770 != null) {
                return java.util.Collections.unmodifiableList(m6740xb946770);
            }
        } catch (java.lang.Exception e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e17);
        }
        return java.util.Collections.emptyList();
    }

    /* renamed from: getSupportedResolutionsOfFormat */
    private java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> m6686x9f3ccdfd(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
            if (((java.lang.Integer) pair.first).intValue() == i17) {
                arrayList.add(new android.util.Pair(java.lang.Integer.valueOf(i17), (android.util.Size[]) pair.second));
                return arrayList;
            }
        }
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair2 : list) {
            if (((java.lang.Integer) pair2.first).intValue() == i18) {
                arrayList.add(new android.util.Pair(java.lang.Integer.valueOf(i17), (android.util.Size[]) pair2.second));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new java.lang.IllegalArgumentException("Supported resolution should contain " + i17 + " format.");
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: createSessionProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc mo6664xed7bdfb8(android.content.Context context) {
        m3.h.d(this.f2418x643e79c0, "VendorExtender#init() must be called first");
        return new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1018x940ff431(this.f2421x1e952242, this.f2420xc6054a9f, m6685xf51b625(context), this, context);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getEstimatedCaptureLatencyRange */
    public android.util.Range<java.lang.Long> mo6665x4b4b39df(android.util.Size size) {
        m3.h.d(this.f2418x643e79c0, "VendorExtender#init() must be called first");
        if (this.f2420xc6054a9f == null || p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6().compareTo(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2441xa9797f9d) < 0) {
            return null;
        }
        try {
            return this.f2420xc6054a9f.getEstimatedCaptureLatencyRange(size);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedCaptureOutputResolutions */
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> mo6666x801660f8() {
        m3.h.d(this.f2418x643e79c0, "VendorExtender#init() must be called first");
        if (this.f2420xc6054a9f != null && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6().compareTo(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2440xa9797f9c) >= 0) {
            try {
                java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> supportedResolutions = this.f2420xc6054a9f.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return this.f2420xc6054a9f.getCaptureProcessor() != null ? m6686x9f3ccdfd(supportedResolutions, 35, 256) : supportedResolutions;
                }
            } catch (java.lang.NoSuchMethodError unused) {
            }
        }
        int m6682x59db7238 = m6682x59db7238();
        return java.util.Arrays.asList(new android.util.Pair(java.lang.Integer.valueOf(m6682x59db7238), m6683xa804d6db(m6682x59db7238)));
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedCaptureResultKeys */
    public java.util.List<android.hardware.camera2.CaptureResult.Key> mo6667xe60e807f() {
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e)) {
            try {
                java.util.List availableCaptureResultKeys = this.f2420xc6054a9f.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return java.util.Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (java.lang.Exception e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e17);
            }
        }
        return java.util.Collections.emptyList();
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedPostviewResolutions */
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> mo6668x8d2e83aa(android.util.Size size) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (!p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) || !p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return java.util.Collections.emptyMap();
        }
        java.util.List<android.util.Pair> supportedPostviewResolutions = this.f2420xc6054a9f.getSupportedPostviewResolutions(size);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (android.util.Pair pair : supportedPostviewResolutions) {
            hashMap.put(java.lang.Integer.valueOf(((java.lang.Integer) pair.first).intValue()), java.util.Arrays.asList((android.util.Size[]) pair.second));
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedPreviewOutputResolutions */
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> mo6669xfed98b6() {
        m3.h.d(this.f2418x643e79c0, "VendorExtender#init() must be called first");
        if (this.f2421x1e952242 != null && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6().compareTo(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2440xa9797f9c) >= 0) {
            try {
                java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> supportedResolutions = this.f2421x1e952242.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return m6686x9f3ccdfd(supportedResolutions, 34, 35);
                }
            } catch (java.lang.NoSuchMethodError unused) {
            }
        }
        return java.util.Arrays.asList(new android.util.Pair(34, m6683xa804d6db(m6684x5e7f4aba())));
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedYuvAnalysisResolutions */
    public android.util.Size[] mo6670x360a99a9() {
        m3.h.d(this.f2418x643e79c0, "VendorExtender#init() must be called first");
        return new android.util.Size[0];
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: init */
    public void mo6671x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93;
        this.f2418x643e79c0 = interfaceC0675x66574570;
        if (this.f2421x1e952242 == null || this.f2420xc6054a9f == null) {
            return;
        }
        this.f2417x1c133ead = interfaceC0675x66574570.mo3161x72efd496();
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = (android.hardware.camera2.CameraCharacteristics) this.f2418x643e79c0.mo3158x9b962a9d();
        this.f2416x43bc1de6 = cameraCharacteristics;
        this.f2421x1e952242.init(this.f2417x1c133ead, cameraCharacteristics);
        this.f2420xc6054a9f.init(this.f2417x1c133ead, this.f2416x43bc1de6);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "PreviewExtender processorType= " + this.f2421x1e952242.getProcessorType());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "ImageCaptureExtender processor= " + this.f2420xc6054a9f.getCaptureProcessor());
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isCaptureProcessProgressAvailable */
    public boolean mo6672x9df7b749() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return this.f2420xc6054a9f.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isExtensionAvailable */
    public boolean mo6674x5f77814(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map) {
        if (this.f2419x40fd0404.m6749x7c91720a() || this.f2421x1e952242 == null || this.f2420xc6054a9f == null) {
            return false;
        }
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = map.get(str);
        return this.f2421x1e952242.isExtensionAvailable(str, cameraCharacteristics) && this.f2420xc6054a9f.isExtensionAvailable(str, cameraCharacteristics);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isExtensionStrengthAvailable */
    public boolean mo6675xa01385d3() {
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isPostviewAvailable */
    public boolean mo6676x1222f0fa() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return this.f2420xc6054a9f.isPostviewAvailable();
        }
        return false;
    }

    public C0988xfdb22e5d(androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl, androidx.camera.extensions.impl.PreviewExtenderImpl previewExtenderImpl) {
        this.f2421x1e952242 = null;
        this.f2420xc6054a9f = null;
        this.f2421x1e952242 = previewExtenderImpl;
        this.f2420xc6054a9f = imageCaptureExtenderImpl;
    }
}
