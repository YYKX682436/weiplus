package com.tencent.liteav.device;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::manager")
/* loaded from: classes16.dex */
public class TXDeviceManagerImpl implements com.tencent.liteav.device.TXDeviceManager {
    private long mNativeDeviceMgr;

    /* loaded from: classes16.dex */
    public static class CameraCaptureParam {
        private com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureParam mParams;

        public CameraCaptureParam(com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
            this.mParams = tXCameraCaptureParam;
        }

        public int getHeight() {
            return this.mParams.height;
        }

        public int getMode() {
            return com.tencent.liteav.device.TXDeviceManagerImpl.cameraCaptureModeAsInt(this.mParams.mode);
        }

        public int getWidth() {
            return this.mParams.width;
        }
    }

    public TXDeviceManagerImpl(long j17) {
        this.mNativeDeviceMgr = j17;
    }

    public static int audioRouteAsInt(com.tencent.liteav.device.TXDeviceManager.TXAudioRoute tXAudioRoute) {
        return (tXAudioRoute != com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone && tXAudioRoute == com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece) ? 1 : 0;
    }

    public static com.tencent.liteav.device.TXDeviceManager.TXAudioRoute audioRouteFromInt(int i17) {
        if (i17 != 0 && i17 == 1) {
            return com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece;
        }
        return com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone;
    }

    public static int cameraCaptureModeAsInt(com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode tXCameraCaptureMode) {
        if (tXCameraCaptureMode == com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto) {
            return 0;
        }
        if (tXCameraCaptureMode == com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance) {
            return 1;
        }
        if (tXCameraCaptureMode == com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality) {
            return 2;
        }
        return tXCameraCaptureMode == com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraCaptureManual ? 3 : 0;
    }

    public static com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode cameraCaptureModeFromInt(int i17) {
        return i17 == 0 ? com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto : i17 == 1 ? com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance : i17 == 2 ? com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality : i17 == 3 ? com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraCaptureManual : com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto;
    }

    private static native void nativeDestroy(long j17);

    private static native int nativeEnableCameraAutoFocus(long j17, boolean z17);

    private static native boolean nativeEnableCameraTorch(long j17, boolean z17);

    private static native float nativeGetCameraZoomMaxRatio(long j17);

    private static native boolean nativeIsAutoFocusEnabled(long j17);

    private static native boolean nativeIsCameraAutoFocusFaceModeSupported(long j17);

    private static native boolean nativeIsCameraFocusPositionInPreviewSupported(long j17);

    private static native boolean nativeIsCameraTorchSupported(long j17);

    private static native boolean nativeIsCameraZoomSupported(long j17);

    private static native boolean nativeIsFrontCamera(long j17);

    private static native boolean nativeIsLowLatencyEarMonitorSupported(long j17);

    private static native int nativeSetAudioRoute(long j17, int i17);

    private static native void nativeSetCameraCapturerParam(long j17, com.tencent.liteav.device.TXDeviceManagerImpl.CameraCaptureParam cameraCaptureParam);

    private static native int nativeSetCameraFocusPosition(long j17, int i17, int i18);

    private static native int nativeSetCameraZoomRatio(long j17, float f17);

    private static native int nativeSetExposureCompensation(long j17, float f17);

    private static native int nativeSetSystemVolumeType(long j17, int i17);

    private static native int nativeSwitchCamera(long j17, boolean z17);

    public static int systemVolumeTypeAsInt(com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
        if (tXSystemVolumeType == com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto) {
            return 0;
        }
        if (tXSystemVolumeType == com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia) {
            return 1;
        }
        return tXSystemVolumeType == com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP ? 2 : 0;
    }

    public static com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType systemVolumeTypefromInt(int i17) {
        return i17 == 0 ? com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto : i17 == 1 ? com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia : i17 == 2 ? com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP : com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int enableCameraAutoFocus(boolean z17) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeEnableCameraAutoFocus(j17, z17);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean enableCameraTorch(boolean z17) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeEnableCameraTorch(j17, z17);
        }
        return false;
    }

    public void finalize() {
        super.finalize();
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mNativeDeviceMgr = 0L;
        }
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public float getCameraZoomMaxRatio() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeGetCameraZoomMaxRatio(j17);
        }
        return 0.0f;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isAutoFocusEnabled() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeIsAutoFocusEnabled(j17);
        }
        return false;
    }

    public boolean isCameraAutoFocusFaceModeSupported() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 == 0) {
            return false;
        }
        return nativeIsCameraAutoFocusFaceModeSupported(j17);
    }

    public boolean isCameraFocusPositionInPreviewSupported() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 == 0) {
            return false;
        }
        return nativeIsCameraFocusPositionInPreviewSupported(j17);
    }

    public boolean isCameraTorchSupported() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 == 0) {
            return false;
        }
        return nativeIsCameraTorchSupported(j17);
    }

    public boolean isCameraZoomSupported() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeIsCameraZoomSupported(j17);
        }
        return false;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isFrontCamera() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeIsFrontCamera(j17);
        }
        return false;
    }

    public boolean isLowLatencyEarMonitorSupported() {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeIsLowLatencyEarMonitorSupported(j17);
        }
        return false;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setAudioRoute(com.tencent.liteav.device.TXDeviceManager.TXAudioRoute tXAudioRoute) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeSetAudioRoute(j17, audioRouteAsInt(tXAudioRoute));
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public void setCameraCapturerParam(com.tencent.liteav.device.TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 == 0 || tXCameraCaptureParam == null) {
            return;
        }
        nativeSetCameraCapturerParam(j17, new com.tencent.liteav.device.TXDeviceManagerImpl.CameraCaptureParam(tXCameraCaptureParam));
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraFocusPosition(int i17, int i18) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeSetCameraFocusPosition(j17, i17, i18);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraZoomRatio(float f17) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeSetCameraZoomRatio(j17, f17);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setExposureCompensation(float f17) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeSetExposureCompensation(j17, f17);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setSystemVolumeType(com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeSetSystemVolumeType(j17, systemVolumeTypeAsInt(tXSystemVolumeType));
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int switchCamera(boolean z17) {
        long j17 = this.mNativeDeviceMgr;
        if (j17 != 0) {
            return nativeSwitchCamera(j17, z17);
        }
        return 0;
    }
}
