package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.AdvancedVendorExtender */
/* loaded from: classes14.dex */
public class C0986x81ffab91 implements p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf {
    private static final java.lang.String TAG = "AdvancedVendorExtender";

    /* renamed from: mAdvancedExtenderImpl */
    private final androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl f2406xb1679d56;

    /* renamed from: mCameraId */
    private java.lang.String f2407x1c133ead;

    /* renamed from: mExtensionDisabledValidator */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1012xd978e1d7 f2408x40fd0404;

    /* renamed from: mMode */
    private final int f2409x624afb0;

    public C0986x81ffab91(int i17) {
        this.f2408x40fd0404 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1012xd978e1d7();
        try {
            if (i17 == 1) {
                this.f2406xb1679d56 = new androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl();
            } else if (i17 == 2) {
                this.f2406xb1679d56 = new androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl();
            } else if (i17 == 3) {
                this.f2406xb1679d56 = new androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl();
            } else if (i17 == 4) {
                this.f2406xb1679d56 = new androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl();
            } else if (i17 == 5) {
                this.f2406xb1679d56 = new androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl();
            } else {
                throw new java.lang.IllegalArgumentException("Should not active ExtensionMode.NONE");
            }
            this.f2409x624afb0 = i17;
        } catch (java.lang.NoClassDefFoundError unused) {
            throw new java.lang.IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    /* renamed from: convertResolutionMapToList */
    private java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> m6662x3483b236(java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : map.keySet()) {
            arrayList.add(new android.util.Pair(num, (android.util.Size[]) map.get(num).toArray(new android.util.Size[0])));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    /* renamed from: getSupportedParameterKeys */
    private java.util.List<android.hardware.camera2.CaptureRequest.Key> m6663xf51b625() {
        java.util.List<android.hardware.camera2.CaptureRequest.Key> emptyList = java.util.Collections.emptyList();
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6().compareTo(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e) < 0) {
            return emptyList;
        }
        try {
            return java.util.Collections.unmodifiableList(this.f2406xb1679d56.getAvailableCaptureRequestKeys());
        } catch (java.lang.Exception e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "AdvancedExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e17);
            return emptyList;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: createSessionProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc mo6664xed7bdfb8(android.content.Context context) {
        m3.h.d(this.f2407x1c133ead, "VendorExtender#init() must be called first");
        return new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1014xf5d4befe(this.f2406xb1679d56.createSessionProcessor(), m6663xf51b625(), this, context, this.f2409x624afb0);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getEstimatedCaptureLatencyRange */
    public android.util.Range<java.lang.Long> mo6665x4b4b39df(android.util.Size size) {
        m3.h.d(this.f2407x1c133ead, "VendorExtender#init() must be called first");
        try {
            return this.f2406xb1679d56.getEstimatedCaptureLatencyRange(this.f2407x1c133ead, size, 256);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedCaptureOutputResolutions */
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> mo6666x801660f8() {
        m3.h.d(this.f2407x1c133ead, "VendorExtender#init() must be called first");
        return m6662x3483b236(this.f2406xb1679d56.getSupportedCaptureOutputResolutions(this.f2407x1c133ead));
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedCaptureResultKeys */
    public java.util.List<android.hardware.camera2.CaptureResult.Key> mo6667xe60e807f() {
        java.util.List<android.hardware.camera2.CaptureResult.Key> emptyList = java.util.Collections.emptyList();
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6().compareTo(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e) < 0) {
            return emptyList;
        }
        try {
            return java.util.Collections.unmodifiableList(this.f2406xb1679d56.getAvailableCaptureResultKeys());
        } catch (java.lang.Exception e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "AdvancedExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e17);
            return emptyList;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedPostviewResolutions */
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> mo6668x8d2e83aa(android.util.Size size) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        return (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) ? java.util.Collections.unmodifiableMap(this.f2406xb1679d56.getSupportedPostviewResolutions(size)) : java.util.Collections.emptyMap();
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedPreviewOutputResolutions */
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> mo6669xfed98b6() {
        m3.h.d(this.f2407x1c133ead, "VendorExtender#init() must be called first");
        return m6662x3483b236(this.f2406xb1679d56.getSupportedPreviewOutputResolutions(this.f2407x1c133ead));
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: getSupportedYuvAnalysisResolutions */
    public android.util.Size[] mo6670x360a99a9() {
        m3.h.d(this.f2407x1c133ead, "VendorExtender#init() must be called first");
        return new android.util.Size[0];
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: init */
    public void mo6671x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93;
        this.f2407x1c133ead = interfaceC0675x66574570.mo3161x72efd496();
        this.f2406xb1679d56.init(this.f2407x1c133ead, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0993x4a94d8dd.m6705xc80a217f(interfaceC0675x66574570));
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isCaptureProcessProgressAvailable */
    public boolean mo6672x9df7b749() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return this.f2406xb1679d56.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isCurrentExtensionModeAvailable */
    public boolean mo6673x8f908e36() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8) && android.os.Build.VERSION.SDK_INT >= 34) {
            return mo6667xe60e807f().contains(android.hardware.camera2.CaptureResult.EXTENSION_CURRENT_TYPE);
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isExtensionAvailable */
    public boolean mo6674x5f77814(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map) {
        if (this.f2408x40fd0404.m6749x7c91720a()) {
            return false;
        }
        return this.f2406xb1679d56.isExtensionAvailable(str, map);
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isExtensionStrengthAvailable */
    public boolean mo6675xa01385d3() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8) && android.os.Build.VERSION.SDK_INT >= 34) {
            return m6663xf51b625().contains(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH);
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf
    /* renamed from: isPostviewAvailable */
    public boolean mo6676x1222f0fa() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
            return this.f2406xb1679d56.isPostviewAvailable();
        }
        return false;
    }

    public C0986x81ffab91(androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl advancedExtenderImpl) {
        this.f2408x40fd0404 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1012xd978e1d7();
        this.f2406xb1679d56 = advancedExtenderImpl;
        this.f2409x624afb0 = 0;
    }
}
