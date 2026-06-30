package com.p314xaae8f345.p373xbe494963.p390xb06b1e56;

/* renamed from: com.tencent.liteav.device.TXDeviceManager */
/* loaded from: classes16.dex */
public interface InterfaceC3787x3ef93853 {

    /* renamed from: com.tencent.liteav.device.TXDeviceManager$TXAudioRoute */
    /* loaded from: classes16.dex */
    public enum TXAudioRoute {
        TXAudioRouteSpeakerphone,
        TXAudioRouteEarpiece
    }

    /* renamed from: com.tencent.liteav.device.TXDeviceManager$TXCameraCaptureMode */
    /* loaded from: classes16.dex */
    public enum TXCameraCaptureMode {
        TXCameraResolutionStrategyAuto,
        TXCameraResolutionStrategyPerformance,
        TXCameraResolutionStrategyHighQuality,
        TXCameraCaptureManual
    }

    /* renamed from: com.tencent.liteav.device.TXDeviceManager$TXCameraCaptureParam */
    /* loaded from: classes16.dex */
    public static class TXCameraCaptureParam {

        /* renamed from: height */
        public int f14802xb7389127;

        /* renamed from: mode */
        public com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode f14803x3339a3;

        /* renamed from: width */
        public int f14804x6be2dc6;
    }

    /* renamed from: com.tencent.liteav.device.TXDeviceManager$TXSystemVolumeType */
    /* loaded from: classes16.dex */
    public enum TXSystemVolumeType {
        TXSystemVolumeTypeAuto,
        TXSystemVolumeTypeMedia,
        TXSystemVolumeTypeVOIP
    }

    /* renamed from: enableCameraAutoFocus */
    int mo29655x1a974ec1(boolean z17);

    /* renamed from: enableCameraTorch */
    boolean mo29656xc8a25254(boolean z17);

    /* renamed from: getCameraZoomMaxRatio */
    float mo29657x874067b5();

    /* renamed from: isAutoFocusEnabled */
    boolean mo29658x899e0be2();

    /* renamed from: isFrontCamera */
    boolean mo29659x24672724();

    /* renamed from: setAudioRoute */
    int mo29660x78052215(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute tXAudioRoute);

    /* renamed from: setCameraCapturerParam */
    void mo29661x71ad671a(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureParam tXCameraCaptureParam);

    /* renamed from: setCameraFocusPosition */
    int mo29662x2d45073a(int i17, int i18);

    /* renamed from: setCameraZoomRatio */
    int mo29663xbdde2991(float f17);

    /* renamed from: setExposureCompensation */
    int mo29664xf5004e83(float f17);

    /* renamed from: setSystemVolumeType */
    int mo29665x2bcf6985(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType tXSystemVolumeType);

    /* renamed from: switchCamera */
    int mo29666x2db92f79(boolean z17);
}
