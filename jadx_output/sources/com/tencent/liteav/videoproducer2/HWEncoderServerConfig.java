package com.tencent.liteav.videoproducer2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class HWEncoderServerConfig {
    private java.lang.Boolean hardwareEncoderBitrateModeCBRSupported;
    private int mHardwareEncodeType = 2;
    private boolean mHardwareEncoderHighProfileEnable = true;
    private boolean mHardwareEncoderHighProfileSupport = true;

    public static boolean isHWHevcEncodeAllowed() {
        return nativeIsHardwareHevcEncodeAllowed();
    }

    private static native boolean nativeIsHardwareHevcEncodeAllowed();

    public int getHardwareEncodeType() {
        return this.mHardwareEncodeType;
    }

    public boolean getHardwareEncoderHighProfileEnable() {
        return this.mHardwareEncoderHighProfileEnable;
    }

    public boolean getHardwareEncoderHighProfileSupport() {
        return this.mHardwareEncoderHighProfileSupport;
    }

    public boolean isHardwareEncoderAllowed() {
        return this.mHardwareEncodeType != 0;
    }

    public java.lang.Boolean isHardwareEncoderBitrateModeCBRSupported() {
        return this.hardwareEncoderBitrateModeCBRSupported;
    }

    public boolean isHardwareEncoderHighProfileAllowed() {
        return this.mHardwareEncodeType == 2 && this.mHardwareEncoderHighProfileEnable && this.mHardwareEncoderHighProfileSupport;
    }

    public void setHardwareEncodeType(int i17) {
        this.mHardwareEncodeType = i17;
    }

    public void setHardwareEncoderBitrateModeCBRSupported(boolean z17) {
        this.hardwareEncoderBitrateModeCBRSupported = java.lang.Boolean.valueOf(z17);
    }

    public void setHardwareEncoderHighProfileEnable(boolean z17) {
        this.mHardwareEncoderHighProfileEnable = z17;
    }

    public void setHardwareEncoderHighProfileSupport(boolean z17) {
        this.mHardwareEncoderHighProfileSupport = z17;
    }
}
