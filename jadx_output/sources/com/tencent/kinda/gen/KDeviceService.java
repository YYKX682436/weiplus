package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KDeviceService {
    void invokePhoneCall(java.lang.String str);

    boolean isDeviceOpenBiometricVerification();

    boolean isDeviceSupportFaceId();

    boolean isDeviceSupportTouchId();

    boolean isDeviceTouchIdHardwareSupported();

    boolean isRoot();

    java.lang.String soterCpuId();

    java.lang.String soterUid();

    void updateBiometricVerificationState(int i17, boolean z17);

    boolean useLastestTouchInfo();
}
