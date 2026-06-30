package com.tencent.cloud.huiyan.callback;

/* loaded from: classes14.dex */
public interface HuiYanSdkEventCallBack {
    void onAuthEvent(com.tencent.cloud.huiyan.enums.HuiYanAuthEvent huiYanAuthEvent);

    void onAuthTipsEvent(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent huiYanAuthTipsEvent);

    void onBeginTransition();

    void onEndTransition();

    void onMainViewCreate(android.view.View view);

    void onMainViewDestroy();

    void onReflectionDurationMS(long j17);
}
