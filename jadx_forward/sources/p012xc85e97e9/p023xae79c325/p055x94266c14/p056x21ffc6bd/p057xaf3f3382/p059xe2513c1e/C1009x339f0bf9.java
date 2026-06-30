package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e;

/* renamed from: androidx.camera.extensions.internal.compat.workaround.AvailableKeysRetriever */
/* loaded from: classes14.dex */
public class C1009x339f0bf9 {

    /* renamed from: mShouldInvokeOnInit */
    boolean f2446x4c86a6c7;

    public C1009x339f0bf9() {
        this.f2446x4c86a6c7 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p058x66f27be.C1004xcf1a968b.get(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p058x66f27be.C1008x8738c145.class) != null;
    }

    /* renamed from: getAvailableCaptureRequestKeys */
    public java.util.List<android.hardware.camera2.CaptureRequest.Key> m6740xb946770(androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl, java.lang.String str, android.hardware.camera2.CameraCharacteristics cameraCharacteristics, android.content.Context context) {
        if (this.f2446x4c86a6c7) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (this.f2446x4c86a6c7) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }
}
