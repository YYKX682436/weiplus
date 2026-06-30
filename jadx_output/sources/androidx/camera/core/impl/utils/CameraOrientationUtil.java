package androidx.camera.core.impl.utils;

/* loaded from: classes14.dex */
public final class CameraOrientationUtil {
    private static final java.lang.String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i17) {
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

    public static int getRelativeImageRotation(int i17, int i18, boolean z17) {
        int i19 = z17 ? ((i18 - i17) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 : (i18 + i17) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        if (androidx.camera.core.Logger.isVerboseEnabled(TAG)) {
            androidx.camera.core.Logger.d(TAG, java.lang.String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19)));
        }
        return i19;
    }

    public static int surfaceRotationToDegrees(int i17) {
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
