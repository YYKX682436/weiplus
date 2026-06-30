package com.tencent.mm.modelvoice;

/* loaded from: classes12.dex */
public class VoiceOpus {
    static {
        try {
            tl.i0.class.getClassLoader();
            fp.d0.n("voiceopus");
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceOpus", "load voiceopus success");
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceOpus", "load voiceopus failed", e17);
        }
    }

    public static native long nativeDecInit(int i17, int i18);

    public static native int nativeDecReset(long j17);

    public static native int nativeDecUninit(long j17);

    public static native int nativeDecode(byte[] bArr, int i17, byte[] bArr2, int[] iArr, long j17);

    public static native long nativeEncInit(int i17, int i18, int i19, int i27);

    public static native int nativeEncReset(long j17);

    public static native int nativeEncUninit(long j17);

    public static native int nativeEncode(byte[] bArr, int i17, byte[] bArr2, int[] iArr, long j17);

    public static native int nativeGetEncSampleRate(int[] iArr, long j17);

    public static native int nativeSetDecControl(int i17, int i18, long j17);

    public static native int nativeSetEncControl(int i17, int i18, long j17);

    public static native int nativeSetStreamDecControl(int i17, int i18, long j17);

    public static native long nativeStreamDecInit(int i17, int i18);

    public static native int nativeStreamDecUninit(long j17);

    public static native int nativeStreamDecode(byte[] bArr, int i17, byte[] bArr2, int[] iArr, boolean z17, long j17);
}
