package com.tencent.liteav.videoproducer.producer;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class ServerVideoProducerConfig {
    private com.tencent.liteav.base.util.k gsensorRotationCorrection;
    private java.lang.Boolean hardwareEncoderBitrateModeCBRSupported;
    private final java.lang.String mTAG = "ServerVideoProducerConfig_" + hashCode();
    private int hardwareEncodeType = 2;
    private boolean hardwareEncoderHighProfileEnable = true;
    private boolean hardwareEncoderHighProfileSupport = true;
    private int camera2SupportMinApiLevel = Integer.MAX_VALUE;
    private int cameraRotationCorrection = 0;
    private boolean mEnableCameraFpsCorrectionLogic = true;

    private com.tencent.liteav.base.util.k cameraCloudConfigEnumToRotation(int i17) {
        if (i17 == 1) {
            return com.tencent.liteav.base.util.k.NORMAL;
        }
        if (i17 == 2) {
            return com.tencent.liteav.base.util.k.ROTATION_90;
        }
        if (i17 == 3) {
            return com.tencent.liteav.base.util.k.ROTATION_180;
        }
        if (i17 != 4) {
            return null;
        }
        return com.tencent.liteav.base.util.k.ROTATION_270;
    }

    public static boolean isHWHevcEncodeAllowed() {
        return nativeIsHardwareHevcEncodeAllowed();
    }

    private static native boolean nativeIsHardwareHevcEncodeAllowed();

    public int getCamera2SupportMinApiLevel() {
        return this.camera2SupportMinApiLevel;
    }

    public java.lang.String getCameraRotationCorrectionInfo() {
        return "[CameraV1Front:" + getCameraV1FrontRotationCorrection() + ", CameraV1Back:" + getCameraV1BackRotationCorrection() + ", CameraV2Front:" + getCameraV2FrontRotationCorrection() + ", CameraV2Back:" + getCameraV2BackRotationCorrection() + "]";
    }

    public com.tencent.liteav.base.util.k getCameraV1BackRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 8) & 255);
    }

    public com.tencent.liteav.base.util.k getCameraV1FrontRotationCorrection() {
        return cameraCloudConfigEnumToRotation(this.cameraRotationCorrection & 255);
    }

    public com.tencent.liteav.base.util.k getCameraV2BackRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 24) & 255);
    }

    public com.tencent.liteav.base.util.k getCameraV2FrontRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 16) & 255);
    }

    public com.tencent.liteav.base.util.k getGsensorRotationCorrection() {
        return this.gsensorRotationCorrection;
    }

    public boolean isCameraFpsCorrectionLogicEnabled() {
        return this.mEnableCameraFpsCorrectionLogic;
    }

    public boolean isHardwareEncoderAllowed() {
        return this.hardwareEncodeType != 0;
    }

    public java.lang.Boolean isHardwareEncoderBitrateModeCBRSupported() {
        return this.hardwareEncoderBitrateModeCBRSupported;
    }

    public boolean isHardwareEncoderHighProfileAllowed() {
        return this.hardwareEncodeType == 2 && this.hardwareEncoderHighProfileEnable && this.hardwareEncoderHighProfileSupport;
    }

    public void setCamera2SupportMinApiLevel(int i17) {
        this.camera2SupportMinApiLevel = i17;
    }

    public void setCameraFpsCorrectionLogicEnabled(boolean z17) {
        this.mEnableCameraFpsCorrectionLogic = z17;
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "set camera fps correction logic enabled value is ".concat(java.lang.String.valueOf(z17)));
    }

    public void setCameraRotationCorrection(int i17) {
        this.cameraRotationCorrection = i17;
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "set camera rotation correction raw value is %#x.", java.lang.Integer.valueOf(i17));
    }

    public void setGSensorRotationCorrection(int i17) {
        if (i17 < 0 || i17 > 3) {
            return;
        }
        this.gsensorRotationCorrection = com.tencent.liteav.base.util.k.a(i17 * 90);
    }

    public void setHardwareEncodeType(int i17) {
        this.hardwareEncodeType = i17;
    }

    public void setHardwareEncoderBitrateModeCBRSupported(boolean z17) {
        this.hardwareEncoderBitrateModeCBRSupported = java.lang.Boolean.valueOf(z17);
    }

    public void setHardwareEncoderHighProfileEnable(boolean z17) {
        this.hardwareEncoderHighProfileEnable = z17;
    }

    public void setHardwareEncoderHighProfileSupport(boolean z17) {
        this.hardwareEncoderHighProfileSupport = z17;
    }

    public java.lang.String toString() {
        return "hardwareEncodeType: " + this.hardwareEncodeType + ", hardwareEncoderHighProfileEnable: " + this.hardwareEncoderHighProfileEnable + ", hardwareEncoderHighProfileSupport: " + this.hardwareEncoderHighProfileSupport + ", camera2SupportMinApiLevel: " + this.camera2SupportMinApiLevel + ", hardwareEncoderBitrateModeCBRSupported: " + this.hardwareEncoderBitrateModeCBRSupported + ", gsensorRotationCorrection: " + this.gsensorRotationCorrection + ", cameraRotationCorrection: " + getCameraRotationCorrectionInfo();
    }
}
