package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface IShakeCheckingManager {
    void playShakeMatch(boolean z17);

    void playShakeSound();

    void setDelayNotifyCallBackImpl(com.tencent.kinda.gen.VoidCallback voidCallback, int i17);

    void setOnShakeCallBackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setShakeSensitivity(float f17);

    void startCheck();

    void stopCheck();
}
