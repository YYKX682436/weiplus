package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginInterfaceManager */
/* loaded from: classes13.dex */
public class C4809x3fd5c96 {
    public static final java.lang.String TAG = "APPluginInterfaceManager";

    /* renamed from: getObjectClass */
    private static java.lang.Class<?> m42101x8c278c43(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        try {
            str4 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42090x5997ff2a(context, str).getCanonicalPath();
        } catch (java.lang.Exception unused) {
            str4 = "";
        }
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> concurrentHashMap = com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20816x922f11fb;
            if (concurrentHashMap.get(str4) == null) {
                android.content.pm.PackageInfo m42027xffec0de = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4802x6aa3a008.m42027xffec0de(context, str4, 1);
                if (m42027xffec0de == null) {
                    return null;
                }
                concurrentHashMap.put(str4, m42027xffec0de);
            }
            return com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42109x6aff9af2(context, str, str4).loadClass(str2);
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    /* renamed from: getParamsType */
    private static java.lang.Class<?>[] m42102xa4f81d6(java.lang.Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        java.lang.Class<?>[] clsArr = new java.lang.Class[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            if (obj != null) {
                if (android.app.Activity.class.isAssignableFrom(obj.getClass())) {
                    clsArr[i17] = android.app.Activity.class;
                } else {
                    clsArr[i17] = objArr[i17].getClass();
                }
            }
        }
        return clsArr;
    }

    /* renamed from: initPluginInterface */
    public static java.lang.Object m42103x34971816(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Call into initPluginInterface  plugin = " + str + " interfaceClass = " + str2 + " methodName = " + str3 + " " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41664xef110452(context, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef);
            java.lang.Class<?> m42101x8c278c43 = m42101x8c278c43(context, str, str2, str3);
            if (m42101x8c278c43 == null) {
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20618x31e6a0c0, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20599x75e65471, str, "objClassIsNull");
                if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20405xef97d41d.equals(str3)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "initPluginInterface objClass is null, current method name = " + str3 + " we need to jump to pure h5 pay!");
                    com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42173xe592aa21(context.getApplicationContext(), "", true);
                } else {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "initPluginInterface objClass is null, current method name = " + str3 + " no need to jump to pure h5 pay!");
                    com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42173xe592aa21(context.getApplicationContext(), "", false);
                }
                com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.m42133x4c6f0a7d();
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42100xe5040295(context);
                return null;
            }
            java.lang.reflect.Method method = m42101x8c278c43.getMethod(str3, m42102xa4f81d6(objArr));
            method.setAccessible(true);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object invoke = method.invoke(m42101x8c278c43, objArr);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface method=" + method + " obj=" + invoke + " time=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            return invoke;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface objClass param is null");
        return null;
    }

    /* renamed from: initPluginInterface2 */
    public static java.lang.Object m42105x5e4beadc(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 pluginName=" + str);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 interfaceClass=" + str2);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 methodName=" + str3);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 objClass param is null");
            return null;
        }
        java.lang.Class<?> m42101x8c278c43 = m42101x8c278c43(context, str, str2, str3);
        if (m42101x8c278c43 == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 objClass is null");
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20618x31e6a0c0, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20599x75e65471, str, "objClassIsNull");
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42173xe592aa21(context.getApplicationContext(), "", false);
            com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.m42133x4c6f0a7d();
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42100xe5040295(context);
            return null;
        }
        java.lang.Class<?>[] clsArr = {objArr[0].getClass(), objArr[1].getClass(), objArr[2].getClass()};
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod Name:" + str3);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod objClass:" + m42101x8c278c43);
        for (int i17 = 0; i17 < 3; i17++) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod paraTypes:" + clsArr[i17]);
        }
        java.lang.reflect.Method method = m42101x8c278c43.getMethod(str3, clsArr);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod method:" + method);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(m42101x8c278c43, objArr);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 obj=" + invoke);
        return invoke;
    }

    /* renamed from: initPluginInterface */
    public static java.lang.Object m42104x34971816(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr, java.lang.Class<?>[] clsArr) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 pluginName=" + str);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 interfaceClass=" + str2);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 methodName=" + str3);
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            java.lang.Class<?> m42101x8c278c43 = m42101x8c278c43(context, str, str2, str3);
            if (m42101x8c278c43 == null) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 objClass is null");
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20618x31e6a0c0, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20599x75e65471, str, "objClassIsNull");
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42173xe592aa21(context.getApplicationContext(), "", false);
                com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.m42133x4c6f0a7d();
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42100xe5040295(context);
                return null;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod Name:" + str3);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod objClass:" + m42101x8c278c43);
            for (java.lang.Class<?> cls : clsArr) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod paraTypes:" + cls);
            }
            java.lang.reflect.Method method = m42101x8c278c43.getMethod(str3, clsArr);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 getMethod method:" + method);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(m42101x8c278c43, objArr);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 obj=" + invoke);
            return invoke;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "initPluginInterface2 objClass param is null");
        return null;
    }
}
