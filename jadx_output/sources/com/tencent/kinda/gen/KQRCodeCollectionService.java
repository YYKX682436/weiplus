package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KQRCodeCollectionService {
    void closeVoiceRingTone(int i17);

    java.lang.String getDisplayName(boolean z17, java.lang.String str);

    java.lang.String getUserTrueName();

    void initTTS();

    boolean isF2fRingToneOpen();

    boolean isF2fRingToneOpenMch();

    void openVoiceRingTone(int i17);

    void registerPayerMsgRecvListenerImpl(com.tencent.kinda.gen.VoidKCollectPayerMsgCallback voidKCollectPayerMsgCallback);

    void saveQRCodeToAlbumByInfoImpl(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.tencent.kinda.gen.VoidI32Callback voidI32Callback);

    void saveQRCodeToAlbumImpl(java.lang.String str, com.tencent.kinda.gen.KView kView, com.tencent.kinda.gen.VoidI32Callback voidI32Callback);

    void unregisterPayerMsgRecvListener();
}
