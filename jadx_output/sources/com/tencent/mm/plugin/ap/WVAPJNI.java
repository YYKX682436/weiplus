package com.tencent.mm.plugin.ap;

/* loaded from: classes7.dex */
public class WVAPJNI {
    public static native int nativeInitMixerFunc(java.lang.String str);

    public static native int nativeMixerGetMixedPCM(long j17, byte[] bArr, short s17);

    public static native long nativeMixerInit(int i17, int i18, int i19);

    public static native int nativeMixerInsertRawPCM(long j17, short s17, short s18, short s19, int i17, byte[] bArr);

    public static native int nativeMixerUninit(long j17);
}
