package com.tencent.liteav.videobase.common;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class EncodedVideoFrame {
    private static final java.lang.String TAG = "EncodedVideoFrame";
    public java.nio.ByteBuffer data;
    public long dts;
    public int height;
    public long pts;
    public int rotation;
    public android.media.MediaFormat videoFormat;
    public int width;
    public final com.tencent.liteav.videobase.utils.ProducerChainTimestamp producerChainTimestamp = new com.tencent.liteav.videobase.utils.ProducerChainTimestamp();
    public final com.tencent.liteav.videobase.utils.ConsumerChainTimestamp consumerChainTimestamp = new com.tencent.liteav.videobase.utils.ConsumerChainTimestamp();
    public long nativePtr = 0;
    public com.tencent.liteav.videobase.common.c nalType = com.tencent.liteav.videobase.common.c.UNKNOWN;
    public com.tencent.liteav.videobase.common.d profileType = com.tencent.liteav.videobase.common.d.UNKNOWN;
    public com.tencent.liteav.videobase.common.CodecType codecType = com.tencent.liteav.videobase.common.CodecType.H264;
    public long gopIndex = 0;
    public long gopFrameIndex = 0;
    public long frameIndex = 0;
    public long refFrameIndex = 0;
    public java.lang.Integer svcInfo = null;
    public boolean isEosFrame = false;
    public com.tencent.liteav.videobase.common.b hdrType = com.tencent.liteav.videobase.common.b.UNKNOWN;
    public android.media.MediaCodec.BufferInfo info = null;

    public static com.tencent.liteav.videobase.common.EncodedVideoFrame createEncodedVideoFrame(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, long j17, long j18, long j19, long j27, long j28, long j29, int i27, long j37, int i28, int i29, boolean z17, int i37, int i38) {
        com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame = new com.tencent.liteav.videobase.common.EncodedVideoFrame();
        encodedVideoFrame.data = byteBuffer;
        encodedVideoFrame.nativePtr = j37;
        encodedVideoFrame.nalType = com.tencent.liteav.videobase.common.c.a(i17);
        encodedVideoFrame.profileType = com.tencent.liteav.videobase.common.d.a(i18);
        encodedVideoFrame.codecType = com.tencent.liteav.videobase.common.CodecType.a(i27);
        encodedVideoFrame.rotation = i19;
        encodedVideoFrame.dts = j17;
        encodedVideoFrame.pts = j18;
        encodedVideoFrame.gopIndex = j19;
        encodedVideoFrame.gopFrameIndex = j27;
        encodedVideoFrame.frameIndex = j28;
        encodedVideoFrame.refFrameIndex = j29;
        encodedVideoFrame.info = null;
        encodedVideoFrame.width = i28;
        encodedVideoFrame.height = i29;
        if (z17) {
            encodedVideoFrame.svcInfo = java.lang.Integer.valueOf(i37);
        } else {
            encodedVideoFrame.svcInfo = null;
        }
        encodedVideoFrame.hdrType = com.tencent.liteav.videobase.common.b.a(i38);
        return encodedVideoFrame;
    }

    private com.tencent.liteav.videobase.common.c getNalTypeFromH264NALHeader(java.nio.ByteBuffer byteBuffer, int i17) {
        int i18 = byteBuffer.get(i17) & 31;
        return i18 != 5 ? i18 != 6 ? i18 != 7 ? i18 != 8 ? com.tencent.liteav.videobase.common.c.UNKNOWN : com.tencent.liteav.videobase.common.c.PPS : com.tencent.liteav.videobase.common.c.SPS : com.tencent.liteav.videobase.common.c.SEI : com.tencent.liteav.videobase.common.c.IDR;
    }

    private com.tencent.liteav.videobase.common.c getNalTypeFromH265NALHeader(java.nio.ByteBuffer byteBuffer, int i17) {
        int i18 = (byteBuffer.get(i17) & 126) >> 1;
        if (i18 == 39) {
            return com.tencent.liteav.videobase.common.c.SEI;
        }
        switch (i18) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return com.tencent.liteav.videobase.common.c.IDR;
            default:
                switch (i18) {
                    case 32:
                        return com.tencent.liteav.videobase.common.c.VPS;
                    case 33:
                        return com.tencent.liteav.videobase.common.c.SPS;
                    case 34:
                        return com.tencent.liteav.videobase.common.c.PPS;
                    default:
                        return com.tencent.liteav.videobase.common.c.UNKNOWN;
                }
        }
    }

    public static int getNextNALHeaderPos(int i17, java.nio.ByteBuffer byteBuffer) {
        while (true) {
            int i18 = i17 + 3;
            if (i18 >= byteBuffer.remaining()) {
                return -1;
            }
            if (byteBuffer.get(i17) == 0 && byteBuffer.get(i17 + 1) == 0 && byteBuffer.get(i17 + 2) == 0 && byteBuffer.get(i18) == 1) {
                return i17 + 4;
            }
            if (byteBuffer.get(i17) == 0 && byteBuffer.get(i17 + 1) == 0 && byteBuffer.get(i17 + 2) == 1) {
                return i18;
            }
            i17++;
        }
    }

    private native void nativeRelease(long j17);

    public static long resetEncodedVideoFrame(com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame) {
        long j17 = encodedVideoFrame.nativePtr;
        if (j17 == 0 || encodedVideoFrame.data == null) {
            return 0L;
        }
        encodedVideoFrame.data = null;
        encodedVideoFrame.nativePtr = 0L;
        return j17;
    }

    public void finalize() {
        super.finalize();
        if (this.nativePtr != 0) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "nativePtr != 0, must call release before finalize ");
            release();
        }
    }

    public boolean isH265() {
        return this.codecType == com.tencent.liteav.videobase.common.CodecType.H265;
    }

    public boolean isHDRFrame() {
        com.tencent.liteav.videobase.common.b bVar = this.hdrType;
        return (bVar == null || bVar == com.tencent.liteav.videobase.common.b.UNKNOWN) ? false : true;
    }

    public boolean isIDRFrame() {
        com.tencent.liteav.videobase.common.c cVar = this.nalType;
        if (cVar != null) {
            if (cVar == com.tencent.liteav.videobase.common.c.IDR) {
                return true;
            }
        }
        return false;
    }

    public boolean isRPSEnable() {
        com.tencent.liteav.videobase.common.d dVar = this.profileType;
        return dVar == com.tencent.liteav.videobase.common.d.BASELINE_RPS || dVar == com.tencent.liteav.videobase.common.d.MAIN_RPS || dVar == com.tencent.liteav.videobase.common.d.HIGH_RPS;
    }

    public boolean isSVCEnable() {
        return this.svcInfo != null;
    }

    public boolean isValidFrame() {
        java.nio.ByteBuffer byteBuffer = this.data;
        return byteBuffer != null && byteBuffer.remaining() > 0 && this.nalType != null && this.codecType != null && this.width > 0 && this.height > 0;
    }

    public void release() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            nativeRelease(j17);
            this.nativePtr = 0L;
        }
    }

    public java.lang.String toString() {
        return "nalType = " + this.nalType + ", profiletype=" + this.profileType + ", rotation=" + this.rotation + ", codecType=" + this.codecType + ", dts=" + this.dts + ", pts=" + this.pts + ", gopIndex=" + this.gopIndex + ", gopFrameIndex=" + this.gopFrameIndex + ", frameIndex=" + this.frameIndex;
    }

    public void updateNALTypeAccordingNALHeader() {
        if (this.data == null) {
            return;
        }
        com.tencent.liteav.videobase.common.c cVar = this.nalType;
        if (cVar != null && cVar != com.tencent.liteav.videobase.common.c.UNKNOWN) {
            return;
        }
        int i17 = 0;
        while (true) {
            i17 = getNextNALHeaderPos(i17, this.data);
            if (i17 == -1 || i17 >= this.data.remaining()) {
                return;
            }
            com.tencent.liteav.videobase.common.c cVar2 = com.tencent.liteav.videobase.common.c.UNKNOWN;
            com.tencent.liteav.videobase.common.c nalTypeFromH265NALHeader = isH265() ? getNalTypeFromH265NALHeader(this.data, i17) : getNalTypeFromH264NALHeader(this.data, i17);
            com.tencent.liteav.videobase.common.c cVar3 = this.nalType;
            if (cVar3 == null || cVar3 == com.tencent.liteav.videobase.common.c.UNKNOWN || nalTypeFromH265NALHeader == com.tencent.liteav.videobase.common.c.IDR) {
                this.nalType = nalTypeFromH265NALHeader;
            }
            com.tencent.liteav.videobase.common.c cVar4 = this.nalType;
            if (cVar4 != com.tencent.liteav.videobase.common.c.SPS && cVar4 != com.tencent.liteav.videobase.common.c.PPS && cVar4 != com.tencent.liteav.videobase.common.c.VPS && cVar4 != com.tencent.liteav.videobase.common.c.SEI) {
                return;
            }
        }
    }
}
