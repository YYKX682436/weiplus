package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public interface IAPPluginBroadcastReceiver {
    void IInit(java.lang.String str, java.lang.String str2, android.content.BroadcastReceiver broadcastReceiver, java.lang.ClassLoader classLoader, android.content.pm.PackageInfo packageInfo, boolean z17);

    void IOnReceive(android.content.Context context, android.content.Intent intent);
}
