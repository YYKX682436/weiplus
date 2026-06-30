package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.ZslUtil */
/* loaded from: classes14.dex */
final class C0299x634872d5 {
    private C0299x634872d5() {
    }

    /* renamed from: isCapabilitySupported */
    public static boolean m3688x7f99d0ec(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, int i17) {
        int[] iArr = (int[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i18 : iArr) {
                if (i18 == i17) {
                    return true;
                }
            }
        }
        return false;
    }
}
