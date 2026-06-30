package com.tencent.mm.modelvoice;

/* loaded from: classes12.dex */
public class MediaRecorder {
    static {
        tl.w0.a();
    }

    public static native int SetVoiceSilkControl(int i17, int i18, long j17);

    public static native int SetVoiceSilkDecControl(int i17, byte[] bArr, int i18, long j17);

    public static native long SilkDecInit(int i17, byte[] bArr, int i18, long j17);

    public static native int SilkDecUnInit(long j17);

    public static native int SilkDoDec(byte[] bArr, short s17, long j17);

    public static native int SilkDoEnc(byte[] bArr, short s17, byte[] bArr2, short[] sArr, boolean z17, long j17);

    public static native long SilkEncInit(int i17, int i18, int i19, long j17);

    public static native int SilkEncUnInit(long j17);

    public static native int SilkGetEncSampleRate(byte[] bArr, long j17);

    public static native long StreamSilkDecInit(int i17, long j17);

    public static native int StreamSilkDecUnInit(long j17);

    public static native int StreamSilkDoDec(byte[] bArr, int i17, byte[] bArr2, int[] iArr, boolean z17, long j17);

    public static native int StreamSilkSetCtrl(int i17, byte[] bArr, int i18, long j17);

    public static native boolean native_init();

    public static native boolean native_pcm2amr(int i17, byte[] bArr, int i18, com.tencent.mm.pointers.PByteArray pByteArray, int i19);

    public static native boolean native_pcmresamp(byte[] bArr, int i17, com.tencent.mm.pointers.PByteArray pByteArray);

    public static native boolean native_release();
}
