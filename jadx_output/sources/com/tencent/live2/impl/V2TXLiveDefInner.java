package com.tencent.live2.impl;

/* loaded from: classes6.dex */
public class V2TXLiveDefInner {

    /* loaded from: classes11.dex */
    public static class SurfaceSize {
        public int height;
        public int width;

        public SurfaceSize(int i17, int i18) {
            this.width = i17;
            this.height = i18;
        }

        public java.lang.String toString() {
            return "[width:" + this.width + "][height:" + this.height + "]";
        }
    }

    /* loaded from: classes6.dex */
    public static class TXLivePropertyKey {
        public static final java.lang.String kEnableAdjustEncoderDirectionToUIOrientation = "enableAdjustEncoderDirectionToUIOrientation";
        public static final java.lang.String kV2EnableAGC = "enableAGC";
        public static final java.lang.String kV2EnableANS = "enableANS";
        public static final java.lang.String kV2EnableCameraZoom = "enableCameraZoom";
        public static final java.lang.String kV2EnableRTMPAcc = "enableRTMPAcc";
        public static final java.lang.String kV2EnableRealtimeMode = "enableRealtimeMode";
        public static final java.lang.String kV2EnableSEITimestampMessage = "enableSEITimestampMessage";
        public static final java.lang.String kV2SetAudioCodecType = "setAudioCodecType";
        public static final java.lang.String kV2SetAudioEncodeFormat = "setAudioEncodeFormat";
        public static final java.lang.String kV2SetAudioRoute = "setAudioRoute";
        public static final java.lang.String kV2SetDisplayRotationObtainMethod = "setDisplayRotationObtainMethod";
        public static final java.lang.String kV2SetFramework = "setFramework";
        public static final java.lang.String kV2SetLEBEnvironment = "setLEBEnvironment";
        public static final java.lang.String kV2SetLebCacheParams = "setLebCacheParams";
        public static final java.lang.String kV2SetOpenGLContext = "setOpenGLContext";
        public static final java.lang.String kV2SetPreferLocalIPStack = "setPreferLocalIPStack";
        public static final java.lang.String kV2SetSurface = "setSurface";
        public static final java.lang.String kV2SetSurfaceSize = "setSurfaceSize";
    }
}
