package com.tencent.live2.impl.a;

/* loaded from: classes16.dex */
public abstract class b extends com.tencent.live2.V2TXLivePusherObserver {
    public abstract void onEnterRoom(long j17);

    public abstract void onExitRoom(int i17);

    public abstract void onNetworkQuality(int i17);

    public abstract void onPushEvent(int i17, android.os.Bundle bundle);

    public abstract void onPushNetStatus(android.os.Bundle bundle);

    public abstract void onRemoteUserEnter(java.lang.String str);

    public abstract void onRemoteUserExit(java.lang.String str, int i17);

    public abstract void onUserAudioAvailable(java.lang.String str, boolean z17);

    public abstract void onUserVideoAvailable(java.lang.String str, int i17, boolean z17);
}
