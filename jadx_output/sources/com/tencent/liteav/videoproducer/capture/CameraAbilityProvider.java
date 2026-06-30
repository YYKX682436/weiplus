package com.tencent.liteav.videoproducer.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class CameraAbilityProvider {
    public static int getCamera2SupportLevel() {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("camera");
        try {
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList.length > 0) {
                return getSystemHardwareLevel(cameraManager, cameraIdList);
            }
            return -1;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraAbilityProvider", "getCamera2SupportLevel exception:".concat(java.lang.String.valueOf(th6)));
            return -1;
        }
    }

    private static int getSystemHardwareLevel(android.hardware.camera2.CameraManager cameraManager, java.lang.String[] strArr) {
        int i17 = -1;
        for (java.lang.String str : strArr) {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                java.lang.Integer num2 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num2 == null) {
                    return -1;
                }
                i17 = num2.intValue();
            }
        }
        return i17;
    }
}
