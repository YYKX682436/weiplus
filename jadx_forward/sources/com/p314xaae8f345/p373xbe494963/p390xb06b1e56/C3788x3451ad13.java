package com.p314xaae8f345.p373xbe494963.p390xb06b1e56;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::manager")
/* renamed from: com.tencent.liteav.device.TXDeviceManagerImpl */
/* loaded from: classes16.dex */
public class C3788x3451ad13 implements com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853 {

    /* renamed from: mNativeDeviceMgr */
    private long f14809xb791915e;

    /* renamed from: com.tencent.liteav.device.TXDeviceManagerImpl$CameraCaptureParam */
    /* loaded from: classes16.dex */
    public static class CameraCaptureParam {

        /* renamed from: mParams */
        private com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureParam f14810x14172053;

        public CameraCaptureParam(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureParam tXCameraCaptureParam) {
            this.f14810x14172053 = tXCameraCaptureParam;
        }

        /* renamed from: getHeight */
        public int m29706x1c4fb41d() {
            return this.f14810x14172053.f14802xb7389127;
        }

        /* renamed from: getMode */
        public int m29707xfb82a219() {
            return com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13.m29678xd323f719(this.f14810x14172053.f14803x3339a3);
        }

        /* renamed from: getWidth */
        public int m29708x755bd410() {
            return this.f14810x14172053.f14804x6be2dc6;
        }
    }

    public C3788x3451ad13(long j17) {
        this.f14809xb791915e = j17;
    }

    /* renamed from: audioRouteAsInt */
    public static int m29676xd446d60a(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute tXAudioRoute) {
        return (tXAudioRoute != com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone && tXAudioRoute == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteEarpiece) ? 1 : 0;
    }

    /* renamed from: audioRouteFromInt */
    public static com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute m29677xe6ca4052(int i17) {
        if (i17 != 0 && i17 == 1) {
            return com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteEarpiece;
        }
        return com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone;
    }

    /* renamed from: cameraCaptureModeAsInt */
    public static int m29678xd323f719(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode tXCameraCaptureMode) {
        if (tXCameraCaptureMode == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraResolutionStrategyAuto) {
            return 0;
        }
        if (tXCameraCaptureMode == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance) {
            return 1;
        }
        if (tXCameraCaptureMode == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality) {
            return 2;
        }
        return tXCameraCaptureMode == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraCaptureManual ? 3 : 0;
    }

    /* renamed from: cameraCaptureModeFromInt */
    public static com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode m29679xa2e359a1(int i17) {
        return i17 == 0 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraResolutionStrategyAuto : i17 == 1 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance : i17 == 2 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality : i17 == 3 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraCaptureManual : com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureMode.TXCameraResolutionStrategyAuto;
    }

    /* renamed from: nativeDestroy */
    private static native void m29680x23caefe3(long j17);

    /* renamed from: nativeEnableCameraAutoFocus */
    private static native int m29681x63cc12ea(long j17, boolean z17);

    /* renamed from: nativeEnableCameraTorch */
    private static native boolean m29682x9e2992fd(long j17, boolean z17);

    /* renamed from: nativeGetCameraZoomMaxRatio */
    private static native float m29683xd0752bde(long j17);

    /* renamed from: nativeIsAutoFocusEnabled */
    private static native boolean m29684x64fee059(long j17);

    /* renamed from: nativeIsCameraAutoFocusFaceModeSupported */
    private static native boolean m29685xd038f84b(long j17);

    /* renamed from: nativeIsCameraFocusPositionInPreviewSupported */
    private static native boolean m29686x9e24da06(long j17);

    /* renamed from: nativeIsCameraTorchSupported */
    private static native boolean m29687x81544fd8(long j17);

    /* renamed from: nativeIsCameraZoomSupported */
    private static native boolean m29688xf8eb6995(long j17);

    /* renamed from: nativeIsFrontCamera */
    private static native boolean m29689xc7f3244d(long j17);

    /* renamed from: nativeIsLowLatencyEarMonitorSupported */
    private static native boolean m29690x8f7db85f(long j17);

    /* renamed from: nativeSetAudioRoute */
    private static native int m29691x1b911f3e(long j17, int i17);

    /* renamed from: nativeSetCameraCapturerParam */
    private static native void m29692x4f112811(long j17, com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13.CameraCaptureParam cameraCaptureParam);

    /* renamed from: nativeSetCameraFocusPosition */
    private static native int m29693xaa8c831(long j17, int i17, int i18);

    /* renamed from: nativeSetCameraZoomRatio */
    private static native int m29694x993efe08(long j17, float f17);

    /* renamed from: nativeSetExposureCompensation */
    private static native int m29695xc414ac6c(long j17, float f17);

    /* renamed from: nativeSetSystemVolumeType */
    private static native int m29696xbc8923ee(long j17, int i17);

    /* renamed from: nativeSwitchCamera */
    private static native int m29697x85946930(long j17, boolean z17);

    /* renamed from: systemVolumeTypeAsInt */
    public static int m29698x15699b1a(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType tXSystemVolumeType) {
        if (tXSystemVolumeType == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType.TXSystemVolumeTypeAuto) {
            return 0;
        }
        if (tXSystemVolumeType == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType.TXSystemVolumeTypeMedia) {
            return 1;
        }
        return tXSystemVolumeType == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType.TXSystemVolumeTypeVOIP ? 2 : 0;
    }

    /* renamed from: systemVolumeTypefromInt */
    public static com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType m29699x7176982(int i17) {
        return i17 == 0 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType.TXSystemVolumeTypeAuto : i17 == 1 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType.TXSystemVolumeTypeMedia : i17 == 2 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType.TXSystemVolumeTypeVOIP : com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType.TXSystemVolumeTypeAuto;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: enableCameraAutoFocus */
    public int mo29655x1a974ec1(boolean z17) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29681x63cc12ea(j17, z17);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: enableCameraTorch */
    public boolean mo29656xc8a25254(boolean z17) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29682x9e2992fd(j17, z17);
        }
        return false;
    }

    /* renamed from: finalize */
    public void m29700xd764dc1e() {
        super.finalize();
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            m29680x23caefe3(j17);
            this.f14809xb791915e = 0L;
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: getCameraZoomMaxRatio */
    public float mo29657x874067b5() {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29683xd0752bde(j17);
        }
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: isAutoFocusEnabled */
    public boolean mo29658x899e0be2() {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29684x64fee059(j17);
        }
        return false;
    }

    /* renamed from: isCameraAutoFocusFaceModeSupported */
    public boolean m29701x8a09f1d4() {
        long j17 = this.f14809xb791915e;
        if (j17 == 0) {
            return false;
        }
        return m29685xd038f84b(j17);
    }

    /* renamed from: isCameraFocusPositionInPreviewSupported */
    public boolean m29702x56cf6e1d() {
        long j17 = this.f14809xb791915e;
        if (j17 == 0) {
            return false;
        }
        return m29686x9e24da06(j17);
    }

    /* renamed from: isCameraTorchSupported */
    public boolean m29703xa3f08ee1() {
        long j17 = this.f14809xb791915e;
        if (j17 == 0) {
            return false;
        }
        return m29687x81544fd8(j17);
    }

    /* renamed from: isCameraZoomSupported */
    public boolean m29704xafb6a56c() {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29688xf8eb6995(j17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: isFrontCamera */
    public boolean mo29659x24672724() {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29689xc7f3244d(j17);
        }
        return false;
    }

    /* renamed from: isLowLatencyEarMonitorSupported */
    public boolean m29705x45cd5376() {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29690x8f7db85f(j17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: setAudioRoute */
    public int mo29660x78052215(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute tXAudioRoute) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29691x1b911f3e(j17, m29676xd446d60a(tXAudioRoute));
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: setCameraCapturerParam */
    public void mo29661x71ad671a(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXCameraCaptureParam tXCameraCaptureParam) {
        long j17 = this.f14809xb791915e;
        if (j17 == 0 || tXCameraCaptureParam == null) {
            return;
        }
        m29692x4f112811(j17, new com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13.CameraCaptureParam(tXCameraCaptureParam));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: setCameraFocusPosition */
    public int mo29662x2d45073a(int i17, int i18) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29693xaa8c831(j17, i17, i18);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: setCameraZoomRatio */
    public int mo29663xbdde2991(float f17) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29694x993efe08(j17, f17);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: setExposureCompensation */
    public int mo29664xf5004e83(float f17) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29695xc414ac6c(j17, f17);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: setSystemVolumeType */
    public int mo29665x2bcf6985(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXSystemVolumeType tXSystemVolumeType) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29696xbc8923ee(j17, m29698x15699b1a(tXSystemVolumeType));
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853
    /* renamed from: switchCamera */
    public int mo29666x2db92f79(boolean z17) {
        long j17 = this.f14809xb791915e;
        if (j17 != 0) {
            return m29697x85946930(j17, z17);
        }
        return 0;
    }
}
