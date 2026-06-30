package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.VideoStabilizationUtil */
/* loaded from: classes14.dex */
public final class C0281x5c127766 {
    private C0281x5c127766() {
    }

    /* renamed from: isPreviewStabilizationSupported */
    public static boolean m3641x3e16b66d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        int[] iArr;
        if (android.os.Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i17 : iArr) {
                if (i17 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
