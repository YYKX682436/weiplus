package com.tencent.mm.offlineutil;

/* loaded from: classes9.dex */
public class OfflineUtilJni {
    public static native char[] CheckSumWithBase91(java.lang.String str);

    public static native java.lang.String DecodeBase91(java.lang.String str);

    public static native java.lang.String EncodeBase91(java.lang.String str);

    public static native java.lang.String GenOffLineQrcode(java.lang.String str, byte[] bArr);
}
