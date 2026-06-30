package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginProxyBroadcastReceiver */
/* loaded from: classes13.dex */
public class C4813x490b37e4 extends android.content.BroadcastReceiver {
    /* renamed from: sendBroadcastReceiver */
    public static void m42125x4cde5728(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20809xec9e1345, str);
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20812xd43e6568, str2);
        try {
            context.sendBroadcast(intent);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: startPluginIfNeccessary */
    private com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4819xa6566185 m42126xbad5ac(android.content.Context context, android.content.Intent intent) {
        java.lang.String canonicalPath;
        if (intent == null) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20809xec9e1345);
        java.lang.String stringExtra2 = intent.getStringExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20812xd43e6568);
        if (android.text.TextUtils.isEmpty(null)) {
            try {
                canonicalPath = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42090x5997ff2a(context, stringExtra).getCanonicalPath();
            } catch (java.io.IOException unused) {
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyBroadcastReciver", "startPluginIfNeccessary Params:" + stringExtra + ", " + stringExtra2);
            if (stringExtra == null && stringExtra.length() > 0) {
                java.io.File file = new java.io.File(canonicalPath);
                if (!file.exists() || !file.isFile()) {
                    return null;
                }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> concurrentHashMap = com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20816x922f11fb;
                android.content.pm.PackageInfo packageInfo = concurrentHashMap.get(canonicalPath);
                if (packageInfo == null) {
                    packageInfo = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4802x6aa3a008.m42027xffec0de(context, canonicalPath, 1);
                    concurrentHashMap.put(canonicalPath, packageInfo);
                }
                android.content.pm.PackageInfo packageInfo2 = packageInfo;
                try {
                    dalvik.system.DexClassLoader m42109x6aff9af2 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42109x6aff9af2(context, stringExtra, canonicalPath);
                    com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4819xa6566185 interfaceC4819xa6566185 = (com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4819xa6566185) m42109x6aff9af2.loadClass(stringExtra2).newInstance();
                    try {
                        interfaceC4819xa6566185.m42178x4278cf9(stringExtra, canonicalPath, this, m42109x6aff9af2, packageInfo2, false);
                    } catch (java.lang.Exception unused2) {
                    }
                    return interfaceC4819xa6566185;
                } catch (java.lang.Exception unused3) {
                    return null;
                }
            }
        }
        canonicalPath = null;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyBroadcastReciver", "startPluginIfNeccessary Params:" + stringExtra + ", " + stringExtra2);
        return stringExtra == null ? null : null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4819xa6566185 m42126xbad5ac = m42126xbad5ac(context, intent);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyBroadcastReciver", "onReceive startPluginIfNeccessary: " + m42126xbad5ac);
        if (m42126xbad5ac != null) {
            m42126xbad5ac.m42179xb08bd5bb(context, intent);
        }
    }
}
