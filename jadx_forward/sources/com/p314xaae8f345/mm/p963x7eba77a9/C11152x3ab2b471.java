package com.p314xaae8f345.mm.p963x7eba77a9;

/* renamed from: com.tencent.mm.modelvoice.VoiceOpus */
/* loaded from: classes12.dex */
public class C11152x3ab2b471 {
    static {
        try {
            tl.i0.class.getClassLoader();
            fp.d0.n("voiceopus");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceOpus", "load voiceopus success");
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceOpus", "load voiceopus failed", e17);
        }
    }

    /* renamed from: nativeDecInit */
    public static native long m48261x22d5dc1b(int i17, int i18);

    /* renamed from: nativeDecReset */
    public static native int m48262x386087a4(long j17);

    /* renamed from: nativeDecUninit */
    public static native int m48263xd9495f74(long j17);

    /* renamed from: nativeDecode */
    public static native int m48264x74bd20e5(byte[] bArr, int i17, byte[] bArr2, int[] iArr, long j17);

    /* renamed from: nativeEncInit */
    public static native long m48265x6717b4f3(int i17, int i18, int i19, int i27);

    /* renamed from: nativeEncReset */
    public static native int m48266x7c59c9cc(long j17);

    /* renamed from: nativeEncUninit */
    public static native int m48267x1478624c(long j17);

    /* renamed from: nativeEncode */
    public static native int m48268x76f0cd0d(byte[] bArr, int i17, byte[] bArr2, int[] iArr, long j17);

    /* renamed from: nativeGetEncSampleRate */
    public static native int m48269x58da30a5(int[] iArr, long j17);

    /* renamed from: nativeSetDecControl */
    public static native int m48270x73a55626(int i17, int i18, long j17);

    /* renamed from: nativeSetEncControl */
    public static native int m48271x9e56ae4e(int i17, int i18, long j17);

    /* renamed from: nativeSetStreamDecControl */
    public static native int m48272x112cd586(int i17, int i18, long j17);

    /* renamed from: nativeStreamDecInit */
    public static native long m48273x1b9d61bb(int i17, int i18);

    /* renamed from: nativeStreamDecUninit */
    public static native int m48274xbe45fd14(long j17);

    /* renamed from: nativeStreamDecode */
    public static native int m48275xe81e6745(byte[] bArr, int i17, byte[] bArr2, int[] iArr, boolean z17, long j17);
}
