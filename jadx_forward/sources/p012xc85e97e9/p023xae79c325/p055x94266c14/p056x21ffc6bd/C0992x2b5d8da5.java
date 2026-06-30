package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory */
/* loaded from: classes14.dex */
public final class C0992x2b5d8da5 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 {

    /* renamed from: mImageAnalysisConfigProvider */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0994xcfa4506a f2429x58a473dd;

    /* renamed from: mImageCaptureConfigProvider */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0995xe5f625be f2430x4d7a47eb;

    /* renamed from: mPreviewConfigProvider */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0996x7a824d1b f2431xc172c2ce;

    /* renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        static final /* synthetic */ int[] f2432x65b8d150;

        static {
            int[] iArr = new int[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.m5762xcee59d22().length];
            f2432x65b8d150 = iArr;
            try {
                iArr[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f2432x65b8d150[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f2432x65b8d150[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f2432x65b8d150[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public C0992x2b5d8da5(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf) {
        this.f2430x4d7a47eb = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0995xe5f625be(interfaceC0999xfb817acf);
        this.f2431xc172c2ce = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0996x7a824d1b(interfaceC0999xfb817acf);
        this.f2429x58a473dd = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0994xcfa4506a(interfaceC0999xfb817acf);
    }

    /* renamed from: isImageAnalysisSupported */
    private boolean m6703xaee96ee1(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
        if (list == null) {
            return false;
        }
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
            int intValue = ((java.lang.Integer) pair.first).intValue();
            android.util.Size[] sizeArr = (android.util.Size[]) pair.second;
            if (intValue == 35 && sizeArr != null && sizeArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771
    /* renamed from: getConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType, int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5525x3017aa;
        int i18 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0992x2b5d8da5.AnonymousClass1.f2432x65b8d150[captureType.ordinal()];
        if (i18 == 1) {
            m5525x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) this.f2430x4d7a47eb.mo4473x1456a638());
        } else if (i18 == 2) {
            m5525x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) this.f2431xc172c2ce.mo4473x1456a638());
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    return null;
                }
                throw new java.lang.IllegalArgumentException("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 mo4473x1456a638 = this.f2429x58a473dd.mo4473x1456a638();
            if (!m6703xaee96ee1(mo4473x1456a638.m5490x2103142f(null))) {
                throw new java.lang.IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
            }
            m5525x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) mo4473x1456a638);
        }
        m5525x3017aa.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92, java.lang.Boolean.TRUE);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(m5525x3017aa);
    }
}
