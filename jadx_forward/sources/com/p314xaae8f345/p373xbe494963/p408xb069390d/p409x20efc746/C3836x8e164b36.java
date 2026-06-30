package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.capture.CameraAbilityProvider */
/* loaded from: classes14.dex */
public class C3836x8e164b36 {
    /* renamed from: getCamera2SupportLevel */
    public static int m31354x8e3a6c0c() {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("camera");
        try {
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList.length > 0) {
                return m31355xf7261557(cameraManager, cameraIdList);
            }
            return -1;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraAbilityProvider", "getCamera2SupportLevel exception:".concat(java.lang.String.valueOf(th6)));
            return -1;
        }
    }

    /* renamed from: getSystemHardwareLevel */
    private static int m31355xf7261557(android.hardware.camera2.CameraManager cameraManager, java.lang.String[] strArr) {
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
