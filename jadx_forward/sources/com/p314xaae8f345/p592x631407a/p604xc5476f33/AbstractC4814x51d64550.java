package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginStatic */
/* loaded from: classes13.dex */
public abstract class AbstractC4814x51d64550 {

    /* renamed from: CHANNEL_LIST_ACTIVITY */
    public static final java.lang.String f20795xacea4f34 = "com.pay.ui.recoChannel.APRecoChannelActivity";

    /* renamed from: CHANNEL_LIST_NEW_ACTIVITY */
    public static final java.lang.String f20796xe8fce893 = "com.pay.newui.activity.APChannelListActivity";

    /* renamed from: FIRST_H5_LAUNCH_ACTIVITY */
    public static final java.lang.String f20797x4f969cd8 = "com.tencent.midas.pay.APMidasH5DistributeActivity";

    /* renamed from: FIRST_LAUNCH_ACTIVITY */
    public static final java.lang.String f20798x55a6066c = "com.tencent.midas.pay.APMidasDistributeActivity";

    /* renamed from: PARAM_CLASS_STATISTICS_UPLOADER */
    public static final java.lang.String f20799xa3247751 = "clsUploader";

    /* renamed from: PARAM_CLEAR_TOP */
    public static final java.lang.String f20800x926a8ad1 = "cleartop";

    /* renamed from: PARAM_IS_IN_PLUGIN */
    static final java.lang.String f20801xa7f4ed4a = "pluginsdk_IsPluginActivity";

    /* renamed from: PARAM_LAUNCH_ACTIVITY */
    public static final java.lang.String f20802x8fa9f249 = "pluginsdk_launchActivity";

    /* renamed from: PARAM_PLUGIN_CutOut_ENABLE */
    public static final java.lang.String f20803x2b63e7dc = "pluginsdk_cutOutEnable";

    /* renamed from: PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY */
    public static final java.lang.String f20804x4e7786f6 = "PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY";

    /* renamed from: PARAM_PLUGIN_IS_NEW_PROCESS */
    public static final java.lang.String f20805x5c657735 = "pluginsdk_isNewProcess";

    /* renamed from: PARAM_PLUGIN_LOCATION */
    public static final java.lang.String f20806x80dc436f = "pluginsdk_pluginLocation";

    /* renamed from: PARAM_PLUGIN_LOG_CALLBACK_CLASS_NAME */
    public static final java.lang.String f20807x7bc144b7 = "pluginsdk_logCallbackClassName";

    /* renamed from: PARAM_PLUGIN_LOG_ENABLE */
    public static final java.lang.String f20808x74000c38 = "pluginsdk_logEnable";

    /* renamed from: PARAM_PLUGIN_NAME */
    public static final java.lang.String f20809xec9e1345 = "pluginsdk_pluginName";

    /* renamed from: PARAM_PLUGIN_OPENSDK_ENABLE */
    public static final java.lang.String f20810x549c2f4c = "pluginsdk_openSDKEnable";

    /* renamed from: PARAM_PLUGIN_PATH */
    public static final java.lang.String f20811xec9efcdf = "pluginsdk_pluginpath";

    /* renamed from: PARAM_PLUGIN_RECEIVER_CLASS_NAME */
    public static final java.lang.String f20812xd43e6568 = "pluginsdk_launchReceiver";
    private static final java.lang.String TAG = "APPluginStatic";

    /* renamed from: USER_QQ_RESOURCES_NO */
    public static final int f20813xf9533d86 = -1;

    /* renamed from: USER_QQ_RESOURCES_YES */
    public static final int f20814x31149ba2 = 1;

    /* renamed from: sPackageInfoMap */
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> f20816x922f11fb = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: sInstances */
    private static java.util.ArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba>> f20815x362bef4b = new java.util.ArrayList<>();

    public static void add(com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba) {
        m42134x10b5f882();
        synchronized (f20815x362bef4b) {
            f20815x362bef4b.add(new java.lang.ref.WeakReference<>(interfaceC4818x848287ba));
        }
    }

    /* renamed from: getActivitys */
    public static java.util.List<java.lang.ref.WeakReference<com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba>> m42128xb9fe08e() {
        return f20815x362bef4b;
    }

    /* renamed from: getOrCreateClassLoader */
    public static java.lang.ClassLoader m42129xecd2ce36(android.content.Context context, java.lang.String str) {
        return com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42108xecd2ce36(context, str);
    }

    /* renamed from: release */
    public static void m42130x41012807() {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42111x41012807();
        f20816x922f11fb.clear();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "release sInstances size: " + f20815x362bef4b.size());
    }

    /* renamed from: remove */
    public static void m42131xc84af884(com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba) {
        m42134x10b5f882();
        m42132x3e428bb3(interfaceC4818x848287ba);
    }

    /* renamed from: removeActivity */
    private static boolean m42132x3e428bb3(com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba) {
        synchronized (f20815x362bef4b) {
            for (int i17 = 0; i17 < f20815x362bef4b.size(); i17++) {
                if (f20815x362bef4b.get(i17).get() == interfaceC4818x848287ba) {
                    f20815x362bef4b.remove(i17);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: removeAll */
    public static void m42133x4c6f0a7d() {
        m42134x10b5f882();
        synchronized (f20815x362bef4b) {
            int i17 = 0;
            while (i17 < f20815x362bef4b.size()) {
                com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = f20815x362bef4b.get(i17).get();
                if (interfaceC4818x848287ba != null) {
                    interfaceC4818x848287ba.mo42032x93155e3c();
                    f20815x362bef4b.remove(i17);
                    i17--;
                }
                i17++;
            }
        }
    }

    /* renamed from: updateReference */
    public static void m42134x10b5f882() {
        synchronized (f20815x362bef4b) {
            int i17 = 0;
            while (i17 < f20815x362bef4b.size()) {
                if (f20815x362bef4b.get(i17).get() == null) {
                    f20815x362bef4b.remove(i17);
                    i17--;
                }
                i17++;
            }
        }
    }
}
