package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KUUIDService {
    boolean adbEnable();

    boolean developmentSettingEnable();

    com.tencent.kinda.gen.ITransmitKvData getExtendInfo();

    java.lang.String getOaid();

    java.lang.String getUuid();

    boolean isWechatClient();
}
