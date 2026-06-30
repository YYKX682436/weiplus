package com.tencent.liteav.videoconsumer.decoder;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
public class SpsInfo {
    public int width = 0;
    public int height = 0;
    public java.lang.Integer videoFormat = null;
    public java.lang.Integer videoFullRangeFlag = null;
    public java.lang.Integer colourPrimaries = null;
    public java.lang.Integer transferCharacteristics = null;
    public java.lang.Integer matrixCoefficients = null;
    public java.lang.Integer maxNumRefFrames = null;

    public static native com.tencent.liteav.videoconsumer.decoder.SpsInfo nativeDecodeSps(boolean z17, java.nio.ByteBuffer byteBuffer);

    public static native byte[] nativeGetSpsPps(byte[] bArr, boolean z17, boolean z18);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.liteav.videoconsumer.decoder.SpsInfo)) {
            return false;
        }
        com.tencent.liteav.videoconsumer.decoder.SpsInfo spsInfo = (com.tencent.liteav.videoconsumer.decoder.SpsInfo) obj;
        return spsInfo.width == this.width && spsInfo.height == this.height && com.tencent.liteav.base.util.h.a(this.videoFormat, spsInfo.videoFormat) && com.tencent.liteav.base.util.h.a(this.videoFullRangeFlag, spsInfo.videoFullRangeFlag) && com.tencent.liteav.base.util.h.a(this.colourPrimaries, spsInfo.colourPrimaries) && com.tencent.liteav.base.util.h.a(this.transferCharacteristics, spsInfo.transferCharacteristics) && com.tencent.liteav.base.util.h.a(this.matrixCoefficients, spsInfo.matrixCoefficients) && com.tencent.liteav.base.util.h.a(this.maxNumRefFrames, spsInfo.maxNumRefFrames);
    }

    public void set(com.tencent.liteav.videoconsumer.decoder.SpsInfo spsInfo) {
        if (spsInfo == null) {
            spsInfo = new com.tencent.liteav.videoconsumer.decoder.SpsInfo();
        }
        this.width = spsInfo.width;
        this.height = spsInfo.height;
        this.videoFormat = spsInfo.videoFormat;
        this.videoFullRangeFlag = spsInfo.videoFullRangeFlag;
        this.colourPrimaries = spsInfo.colourPrimaries;
        this.transferCharacteristics = spsInfo.transferCharacteristics;
        this.matrixCoefficients = spsInfo.matrixCoefficients;
        this.maxNumRefFrames = spsInfo.maxNumRefFrames;
    }

    public void setColourPrimaries(int i17) {
        this.colourPrimaries = java.lang.Integer.valueOf(i17);
    }

    public void setHeight(int i17) {
        this.height = i17;
    }

    public void setMatrixCoefficients(int i17) {
        this.matrixCoefficients = java.lang.Integer.valueOf(i17);
    }

    public void setMaxNumRefFrames(int i17) {
        this.maxNumRefFrames = java.lang.Integer.valueOf(i17);
    }

    public void setTransferCharacteristics(int i17) {
        this.transferCharacteristics = java.lang.Integer.valueOf(i17);
    }

    public void setVideoFormat(int i17) {
        this.videoFormat = java.lang.Integer.valueOf(i17);
    }

    public void setVideoFullRangeFlag(int i17) {
        this.videoFullRangeFlag = java.lang.Integer.valueOf(i17);
    }

    public void setWidth(int i17) {
        this.width = i17;
    }

    public java.lang.String toString() {
        return "SpsInfo(" + ("width=" + this.width + ",height=" + this.height + ",videoFormat=" + this.videoFormat + ",videoFullRangeFlag=" + this.videoFullRangeFlag + ",colourPrimaries=" + this.colourPrimaries + ",transferCharacteristics=" + this.transferCharacteristics + ",matrixCoefficients=" + this.matrixCoefficients + ",maxNumRefFrames=" + this.maxNumRefFrames) + ")";
    }
}
