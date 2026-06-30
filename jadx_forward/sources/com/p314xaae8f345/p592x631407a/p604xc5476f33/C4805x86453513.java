package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginChecker */
/* loaded from: classes13.dex */
public class C4805x86453513 {
    private static final java.lang.String TAG = "APPluginChecker";

    /* renamed from: isAllPluginValid */
    private static boolean m42068xb24dcff2(java.io.File file) {
        java.io.File file2;
        if (file == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot check all plugin valid, pluginPath is null!");
            return false;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check all plugin valid, parameter ok!");
        try {
            file2 = new java.io.File(file.getCanonicalPath() + java.io.File.separator + com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.f20752xbedcd36c);
        } catch (java.lang.Exception unused) {
        }
        if (!file2.exists()) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Check all plugin valid, sign file is not found");
            return false;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check all plugin valid, sign file exist!");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42170xc7d89f93(hashMap, file2);
        int i17 = 0;
        for (java.io.File file3 : file.listFiles()) {
            java.lang.String name = file3.getName();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check all plugin valid, current check file = " + name);
            if (!name.startsWith("MidasSign") && name.startsWith("Midas")) {
                java.lang.String str = (java.lang.String) hashMap.get(name.split("\\_")[0]);
                if (!android.text.TextUtils.isEmpty(str)) {
                    if (com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42138xc96bec5a(file3.getCanonicalPath(), str)) {
                        i17++;
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check all plugin valid, current check file = " + name + ", MD5 OK");
                    } else {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check all plugin valid, current check file = " + name + ", MD5 not OK");
                        file3.delete();
                    }
                }
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check all plugin valid, ignore = " + name);
        }
        if (i17 != hashMap.size() || i17 < 2) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Check all plugin valid, all valid file num = " + i17 + ", but sign file size = " + hashMap.size() + ", check fail!");
            return false;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check all plugin valid, all valid file num = " + i17 + ", sign file size = " + hashMap.size() + ", check success!");
        return true;
    }

    /* renamed from: isPluginExists */
    public static boolean m42069x20bfcfb9(android.content.Context context) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42077xd72d2dee(context));
        sb6.append(java.io.File.separator);
        sb6.append(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.f20752xbedcd36c);
        return new java.io.File(sb6.toString()).exists();
    }

    /* renamed from: isPluginValid */
    public static boolean m42070xe0eb54ff(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into isPluginValid " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        return m42068xb24dcff2(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42077xd72d2dee(context));
    }

    /* renamed from: isPluginValid */
    public static boolean m42071xe0eb54ff(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot check plugin valid, pluginPath is null!");
            return false;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check plugin valid, parameter ok!");
        if (!com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42138xc96bec5a(str, str2)) {
            return false;
        }
        java.io.File file = new java.io.File(new java.io.File(str.substring(0, str.lastIndexOf("/"))).getCanonicalPath() + java.io.File.separator + com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.f20752xbedcd36c);
        if (!file.exists()) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Check plugin valid, sign file is not found");
            return false;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check plugin valid, sign file exist!");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42170xc7d89f93(hashMap, file);
        java.lang.String name = new java.io.File(str).getName();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check plugin valid, current check file = " + name);
        if (str2.equals((java.lang.String) hashMap.get(name.split("\\_")[0]))) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check plugin valid, current check file = " + name + ", MD5 OK");
            return true;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Check plugin valid, current check file = " + name + ", MD5 not OK");
        return false;
    }
}
