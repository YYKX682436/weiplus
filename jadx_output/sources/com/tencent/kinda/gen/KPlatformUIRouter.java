package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KPlatformUIRouter {
    void gotoExternApp(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, byte[] bArr);

    void jointpayGotoExternApp(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, byte[] bArr);

    void openUrlScheme(java.lang.String str);

    void openUrlSchemeWithCallbackImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);
}
