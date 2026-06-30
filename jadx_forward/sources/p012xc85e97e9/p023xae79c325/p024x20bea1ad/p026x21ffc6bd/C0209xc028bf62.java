package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CameraIdUtil */
/* loaded from: classes14.dex */
public final class C0209xc028bf62 {
    private C0209xc028bf62() {
    }

    /* renamed from: isBackwardCompatible */
    public static boolean m3309xa5cad5e1(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a, java.lang.String str) {
        if ("robolectric".equals(android.os.Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c0332x1ad8324a.m3757xc2a5207f(str).get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i17 : iArr) {
                    if (i17 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0212x8dc75992.m3316x51964ec6(e17));
        }
    }
}
