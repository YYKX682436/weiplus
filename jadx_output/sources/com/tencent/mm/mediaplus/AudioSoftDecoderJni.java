package com.tencent.mm.mediaplus;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mediaplus/AudioSoftDecoderJni;", "", "mediaplus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AudioSoftDecoderJni {
    public static final native int nDecodeSample(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    public static final native void nDestroy(long j17);

    public static final native int nFlush(long j17);

    public static final native int nGetErrCode(long j17);

    public static final native byte[] nGetOutputBuffer(long j17);

    public static final native int nGetOutputBufferSize(long j17);

    public static final native long nInit(java.lang.String str);
}
