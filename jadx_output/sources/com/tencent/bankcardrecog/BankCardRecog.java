package com.tencent.bankcardrecog;

/* loaded from: classes9.dex */
public class BankCardRecog {
    public static native java.lang.String getBankCardSegmentNumber(java.lang.String str, int i17, int[] iArr);

    public static native int recognizeBankCardGetVersion();

    public static native int recognizeBankCardInit(int i17, int i18, boolean z17);

    public static native int recognizeBankCardProcess(byte[] bArr, com.tencent.bankcardrecog.BankCardInfo bankCardInfo, boolean[] zArr);

    public static native int recognizeBankCardRelease();
}
