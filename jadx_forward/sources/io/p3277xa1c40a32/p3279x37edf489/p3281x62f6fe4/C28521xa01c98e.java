package io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4;

/* renamed from: io.clipworks.androidplus.media.NativeMediaCodecCallback */
/* loaded from: classes14.dex */
public class C28521xa01c98e extends android.media.MediaCodec.Callback {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f70369x39e86013;

    private C28521xa01c98e(com.p166x1da19ac6.jni.C1545xd48843e6 c1545xd48843e6) {
        this.f70369x39e86013 = c1545xd48843e6;
    }

    /* renamed from: nativeOnError */
    private native void m136851x7681f752(android.media.MediaCodec.CodecException codecException);

    /* renamed from: nativeOnInputBufferAvailable */
    private native void m136852x6b90ceb5(int i17);

    /* renamed from: nativeOnOutputBufferAvailable */
    private native void m136853x1d868c72(int i17, android.media.MediaCodec.BufferInfo bufferInfo);

    /* renamed from: nativeOnOutputFormatChanged */
    private native void m136854xea140b06(android.media.MediaFormat mediaFormat);

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        m136851x7681f752(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i17) {
        m136852x6b90ceb5(i17);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        m136853x1d868c72(i17, bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        m136854xea140b06(mediaFormat);
    }
}
