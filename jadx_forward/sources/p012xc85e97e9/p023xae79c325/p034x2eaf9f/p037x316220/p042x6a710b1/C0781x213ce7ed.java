package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.CameraOrientationUtil */
/* loaded from: classes14.dex */
public final class C0781x213ce7ed {
    private static final java.lang.String TAG = "CameraOrientationUtil";

    private C0781x213ce7ed() {
    }

    /* renamed from: degreesToSurfaceRotation */
    public static int m5806x93d28ee9(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 90) {
            return 1;
        }
        if (i17 == 180) {
            return 2;
        }
        if (i17 == 270) {
            return 3;
        }
        throw new java.lang.IllegalStateException("Invalid sensor rotation: " + i17);
    }

    /* renamed from: getRelativeImageRotation */
    public static int m5807x61e284d7(int i17, int i18, boolean z17) {
        int i19 = z17 ? ((i18 - i17) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : (i18 + i17) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4676xcef4db29(TAG)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19)));
        }
        return i19;
    }

    /* renamed from: surfaceRotationToDegrees */
    public static int m5808x82c0521(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 90;
        }
        if (i17 == 2) {
            return 180;
        }
        if (i17 == 3) {
            return 270;
        }
        throw new java.lang.IllegalArgumentException("Unsupported surface rotation: " + i17);
    }
}
