package com.tencent.liteav.videoproducer.encoder;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class NativeEncoderDataListener extends com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b {
    public static final java.lang.String TAG = "NativeEncoderDataListener";
    private long mNativeVideoEncodeDataListener;
    private int mStreamType;

    public NativeEncoderDataListener(long j17, int i17) {
        this.mNativeVideoEncodeDataListener = j17;
        this.mStreamType = i17;
    }

    private native void nativeOnEncodedFail(long j17, int i17, int i18);

    private native void nativeOnEncodedNAL(long j17, int i17, com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame, java.nio.ByteBuffer byteBuffer, com.tencent.liteav.videobase.utils.ProducerChainTimestamp producerChainTimestamp, int i18, int i19, int i27, int i28, long j18, long j19, long j27, long j28, long j29, long j37, int i29, int i37, boolean z17, int i38);

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
    public synchronized void onEncodedFail(com.tencent.liteav.videobase.videobase.e.a aVar) {
        long j17 = this.mNativeVideoEncodeDataListener;
        if (j17 != 0) {
            nativeOnEncodedFail(j17, this.mStreamType, com.tencent.liteav.videobase.videobase.e.a(aVar));
        } else {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "onEncodedFail nativeclient is zero.");
        }
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
    public synchronized void onEncodedNAL(com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame, boolean z17) {
        int i17;
        int intValue;
        long j17 = this.mNativeVideoEncodeDataListener;
        if (j17 == 0 || z17) {
            com.tencent.liteav.base.util.LiteavLog.d(TAG, "onEncodedNAL mNativeVideoEncodeDataListener=%d,isEos=%b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
            return;
        }
        int i18 = this.mStreamType;
        java.nio.ByteBuffer byteBuffer = encodedVideoFrame.data;
        com.tencent.liteav.videobase.utils.ProducerChainTimestamp producerChainTimestamp = encodedVideoFrame.producerChainTimestamp;
        int i19 = encodedVideoFrame.nalType.mValue;
        int i27 = encodedVideoFrame.profileType.mValue;
        int i28 = encodedVideoFrame.codecType.mValue;
        int i29 = encodedVideoFrame.rotation;
        long j18 = encodedVideoFrame.dts;
        long j19 = encodedVideoFrame.pts;
        long j27 = encodedVideoFrame.gopIndex;
        long j28 = encodedVideoFrame.gopFrameIndex;
        long j29 = encodedVideoFrame.frameIndex;
        long j37 = encodedVideoFrame.refFrameIndex;
        int i37 = encodedVideoFrame.width;
        int i38 = encodedVideoFrame.height;
        java.lang.Integer num = encodedVideoFrame.svcInfo;
        boolean z18 = num != null;
        if (num == null) {
            i17 = i37;
            intValue = 0;
        } else {
            i17 = i37;
            intValue = num.intValue();
        }
        nativeOnEncodedNAL(j17, i18, encodedVideoFrame, byteBuffer, producerChainTimestamp, i19, i27, i28, i29, j18, j19, j27, j28, j29, j37, i17, i38, z18, intValue);
    }

    public synchronized void reset() {
        this.mNativeVideoEncodeDataListener = 0L;
    }
}
