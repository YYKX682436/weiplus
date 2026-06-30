package com.tencent.liteav.device;

/* loaded from: classes16.dex */
public interface TXDeviceManager {

    /* loaded from: classes16.dex */
    public enum TXAudioRoute {
        TXAudioRouteSpeakerphone,
        TXAudioRouteEarpiece
    }

    /* loaded from: classes16.dex */
    public enum TXCameraCaptureMode {
        TXCameraResolutionStrategyAuto,
        TXCameraResolutionStrategyPerformance,
        TXCameraResolutionStrategyHighQuality,
        TXCameraCaptureManual
    }

    /* loaded from: classes16.dex */
    public static class TXCameraCaptureParam {
        public int height;
        public com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode mode;
        public int width;
    }

    /* loaded from: classes16.dex */
    public enum TXSystemVolumeType {
        TXSystemVolumeTypeAuto,
        TXSystemVolumeTypeMedia,
        TXSystemVolumeTypeVOIP
    }

    int enableCameraAutoFocus(boolean z17);

    boolean enableCameraTorch(boolean z17);

    float getCameraZoomMaxRatio();

    boolean isAutoFocusEnabled();

    boolean isFrontCamera();

    int setAudioRoute(com.tencent.liteav.device.TXDeviceManager.TXAudioRoute tXAudioRoute);

    void setCameraCapturerParam(com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam);

    int setCameraFocusPosition(int i17, int i18);

    int setCameraZoomRatio(float f17);

    int setExposureCompensation(float f17);

    int setSystemVolumeType(com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType tXSystemVolumeType);

    int switchCamera(boolean z17);
}
