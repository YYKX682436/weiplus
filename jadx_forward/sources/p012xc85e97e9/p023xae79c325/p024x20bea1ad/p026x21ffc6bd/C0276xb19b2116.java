package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.TemplateTypeUtil */
/* loaded from: classes14.dex */
public class C0276xb19b2116 {

    /* renamed from: androidx.camera.camera2.internal.TemplateTypeUtil$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        static final /* synthetic */ int[] f559x65b8d150;

        static {
            int[] iArr = new int[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.m5762xcee59d22().length];
            f559x65b8d150 = iArr;
            try {
                iArr[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f559x65b8d150[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f559x65b8d150[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f559x65b8d150[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f559x65b8d150[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private C0276xb19b2116() {
    }

    /* renamed from: getCaptureConfigTemplateType */
    public static int m3630x73862266(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType, int i17) {
        int i18 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0276xb19b2116.AnonymousClass1.f559x65b8d150[captureType.ordinal()];
        return i18 != 1 ? i18 != 2 ? 1 : 3 : i17 == 2 ? 5 : 2;
    }

    /* renamed from: getSessionConfigTemplateType */
    public static int m3631xeb8ca9b6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType, int i17) {
        int i18 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0276xb19b2116.AnonymousClass1.f559x65b8d150[captureType.ordinal()];
        return i18 != 1 ? i18 != 2 ? 1 : 3 : i17 == 2 ? 5 : 1;
    }
}
