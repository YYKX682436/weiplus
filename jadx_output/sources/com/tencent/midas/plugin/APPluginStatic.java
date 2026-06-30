package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public abstract class APPluginStatic {
    public static final java.lang.String CHANNEL_LIST_ACTIVITY = "com.pay.ui.recoChannel.APRecoChannelActivity";
    public static final java.lang.String CHANNEL_LIST_NEW_ACTIVITY = "com.pay.newui.activity.APChannelListActivity";
    public static final java.lang.String FIRST_H5_LAUNCH_ACTIVITY = "com.tencent.midas.pay.APMidasH5DistributeActivity";
    public static final java.lang.String FIRST_LAUNCH_ACTIVITY = "com.tencent.midas.pay.APMidasDistributeActivity";
    public static final java.lang.String PARAM_CLASS_STATISTICS_UPLOADER = "clsUploader";
    public static final java.lang.String PARAM_CLEAR_TOP = "cleartop";
    static final java.lang.String PARAM_IS_IN_PLUGIN = "pluginsdk_IsPluginActivity";
    public static final java.lang.String PARAM_LAUNCH_ACTIVITY = "pluginsdk_launchActivity";
    public static final java.lang.String PARAM_PLUGIN_CutOut_ENABLE = "pluginsdk_cutOutEnable";
    public static final java.lang.String PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY = "PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY";
    public static final java.lang.String PARAM_PLUGIN_IS_NEW_PROCESS = "pluginsdk_isNewProcess";
    public static final java.lang.String PARAM_PLUGIN_LOCATION = "pluginsdk_pluginLocation";
    public static final java.lang.String PARAM_PLUGIN_LOG_CALLBACK_CLASS_NAME = "pluginsdk_logCallbackClassName";
    public static final java.lang.String PARAM_PLUGIN_LOG_ENABLE = "pluginsdk_logEnable";
    public static final java.lang.String PARAM_PLUGIN_NAME = "pluginsdk_pluginName";
    public static final java.lang.String PARAM_PLUGIN_OPENSDK_ENABLE = "pluginsdk_openSDKEnable";
    public static final java.lang.String PARAM_PLUGIN_PATH = "pluginsdk_pluginpath";
    public static final java.lang.String PARAM_PLUGIN_RECEIVER_CLASS_NAME = "pluginsdk_launchReceiver";
    private static final java.lang.String TAG = "APPluginStatic";
    public static final int USER_QQ_RESOURCES_NO = -1;
    public static final int USER_QQ_RESOURCES_YES = 1;
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> sPackageInfoMap = new java.util.concurrent.ConcurrentHashMap<>();
    private static java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.midas.plugin.IAPPluginActivity>> sInstances = new java.util.ArrayList<>();

    public static void add(com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity) {
        updateReference();
        synchronized (sInstances) {
            sInstances.add(new java.lang.ref.WeakReference<>(iAPPluginActivity));
        }
    }

    public static java.util.List<java.lang.ref.WeakReference<com.tencent.midas.plugin.IAPPluginActivity>> getActivitys() {
        return sInstances;
    }

    public static java.lang.ClassLoader getOrCreateClassLoader(android.content.Context context, java.lang.String str) {
        return com.tencent.midas.plugin.APPluginLoader.getOrCreateClassLoader(context, str);
    }

    public static void release() {
        com.tencent.midas.plugin.APPluginLoader.release();
        sPackageInfoMap.clear();
        com.tencent.midas.comm.APLog.d(TAG, "release sInstances size: " + sInstances.size());
    }

    public static void remove(com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity) {
        updateReference();
        removeActivity(iAPPluginActivity);
    }

    private static boolean removeActivity(com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity) {
        synchronized (sInstances) {
            for (int i17 = 0; i17 < sInstances.size(); i17++) {
                if (sInstances.get(i17).get() == iAPPluginActivity) {
                    sInstances.remove(i17);
                    return true;
                }
            }
            return false;
        }
    }

    public static void removeAll() {
        updateReference();
        synchronized (sInstances) {
            int i17 = 0;
            while (i17 < sInstances.size()) {
                com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = sInstances.get(i17).get();
                if (iAPPluginActivity != null) {
                    iAPPluginActivity.IFinish();
                    sInstances.remove(i17);
                    i17--;
                }
                i17++;
            }
        }
    }

    public static void updateReference() {
        synchronized (sInstances) {
            int i17 = 0;
            while (i17 < sInstances.size()) {
                if (sInstances.get(i17).get() == null) {
                    sInstances.remove(i17);
                    i17--;
                }
                i17++;
            }
        }
    }
}
