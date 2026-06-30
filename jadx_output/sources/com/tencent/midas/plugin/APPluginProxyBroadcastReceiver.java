package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginProxyBroadcastReceiver extends android.content.BroadcastReceiver {
    public static void sendBroadcastReceiver(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_NAME, str);
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_RECEIVER_CLASS_NAME, str2);
        try {
            context.sendBroadcast(intent);
        } catch (java.lang.Throwable unused) {
        }
    }

    private com.tencent.midas.plugin.IAPPluginBroadcastReceiver startPluginIfNeccessary(android.content.Context context, android.content.Intent intent) {
        java.lang.String canonicalPath;
        if (intent == null) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_NAME);
        java.lang.String stringExtra2 = intent.getStringExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_RECEIVER_CLASS_NAME);
        if (android.text.TextUtils.isEmpty(null)) {
            try {
                canonicalPath = com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(context, stringExtra).getCanonicalPath();
            } catch (java.io.IOException unused) {
            }
            com.tencent.midas.comm.APLog.i("APPLuginProxyBroadcastReciver", "startPluginIfNeccessary Params:" + stringExtra + ", " + stringExtra2);
            if (stringExtra == null && stringExtra.length() > 0) {
                java.io.File file = new java.io.File(canonicalPath);
                if (!file.exists() || !file.isFile()) {
                    return null;
                }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> concurrentHashMap = com.tencent.midas.plugin.APPluginStatic.sPackageInfoMap;
                android.content.pm.PackageInfo packageInfo = concurrentHashMap.get(canonicalPath);
                if (packageInfo == null) {
                    packageInfo = com.tencent.midas.plugin.APApkFileParser.getPackageInfo(context, canonicalPath, 1);
                    concurrentHashMap.put(canonicalPath, packageInfo);
                }
                android.content.pm.PackageInfo packageInfo2 = packageInfo;
                try {
                    dalvik.system.DexClassLoader orCreateClassLoaderByPath = com.tencent.midas.plugin.APPluginLoader.getOrCreateClassLoaderByPath(context, stringExtra, canonicalPath);
                    com.tencent.midas.plugin.IAPPluginBroadcastReceiver iAPPluginBroadcastReceiver = (com.tencent.midas.plugin.IAPPluginBroadcastReceiver) orCreateClassLoaderByPath.loadClass(stringExtra2).newInstance();
                    try {
                        iAPPluginBroadcastReceiver.IInit(stringExtra, canonicalPath, this, orCreateClassLoaderByPath, packageInfo2, false);
                    } catch (java.lang.Exception unused2) {
                    }
                    return iAPPluginBroadcastReceiver;
                } catch (java.lang.Exception unused3) {
                    return null;
                }
            }
        }
        canonicalPath = null;
        com.tencent.midas.comm.APLog.i("APPLuginProxyBroadcastReciver", "startPluginIfNeccessary Params:" + stringExtra + ", " + stringExtra2);
        return stringExtra == null ? null : null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.midas.plugin.IAPPluginBroadcastReceiver startPluginIfNeccessary = startPluginIfNeccessary(context, intent);
        com.tencent.midas.comm.APLog.i("APPLuginProxyBroadcastReciver", "onReceive startPluginIfNeccessary: " + startPluginIfNeccessary);
        if (startPluginIfNeccessary != null) {
            startPluginIfNeccessary.IOnReceive(context, intent);
        }
    }
}
