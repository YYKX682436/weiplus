package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginChecker {
    private static final java.lang.String TAG = "APPluginChecker";

    private static boolean isAllPluginValid(java.io.File file) {
        java.io.File file2;
        if (file == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot check all plugin valid, pluginPath is null!");
            return false;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Check all plugin valid, parameter ok!");
        try {
            file2 = new java.io.File(file.getCanonicalPath() + java.io.File.separator + com.tencent.midas.plugin.APPluginConfig.SIGN_FILE_NAME);
        } catch (java.lang.Exception unused) {
        }
        if (!file2.exists()) {
            com.tencent.midas.comm.APLog.e(TAG, "Check all plugin valid, sign file is not found");
            return false;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Check all plugin valid, sign file exist!");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.midas.plugin.APPluginUtils.readSingInfo(hashMap, file2);
        int i17 = 0;
        for (java.io.File file3 : file.listFiles()) {
            java.lang.String name = file3.getName();
            com.tencent.midas.comm.APLog.d(TAG, "Check all plugin valid, current check file = " + name);
            if (!name.startsWith("MidasSign") && name.startsWith("Midas")) {
                java.lang.String str = (java.lang.String) hashMap.get(name.split("\\_")[0]);
                if (!android.text.TextUtils.isEmpty(str)) {
                    if (com.tencent.midas.plugin.APPluginUtils.checkFileMD5(file3.getCanonicalPath(), str)) {
                        i17++;
                        com.tencent.midas.comm.APLog.d(TAG, "Check all plugin valid, current check file = " + name + ", MD5 OK");
                    } else {
                        com.tencent.midas.comm.APLog.d(TAG, "Check all plugin valid, current check file = " + name + ", MD5 not OK");
                        file3.delete();
                    }
                }
            }
            com.tencent.midas.comm.APLog.d(TAG, "Check all plugin valid, ignore = " + name);
        }
        if (i17 != hashMap.size() || i17 < 2) {
            com.tencent.midas.comm.APLog.e(TAG, "Check all plugin valid, all valid file num = " + i17 + ", but sign file size = " + hashMap.size() + ", check fail!");
            return false;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Check all plugin valid, all valid file num = " + i17 + ", sign file size = " + hashMap.size() + ", check success!");
        return true;
    }

    public static boolean isPluginExists(android.content.Context context) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.midas.plugin.APPluginConfig.getPluginPath(context));
        sb6.append(java.io.File.separator);
        sb6.append(com.tencent.midas.plugin.APPluginConfig.SIGN_FILE_NAME);
        return new java.io.File(sb6.toString()).exists();
    }

    public static boolean isPluginValid(android.content.Context context) {
        com.tencent.midas.comm.APLog.d(TAG, "Calling into isPluginValid " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        return isAllPluginValid(com.tencent.midas.plugin.APPluginConfig.getPluginPath(context));
    }

    public static boolean isPluginValid(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot check plugin valid, pluginPath is null!");
            return false;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Check plugin valid, parameter ok!");
        if (!com.tencent.midas.plugin.APPluginUtils.checkFileMD5(str, str2)) {
            return false;
        }
        java.io.File file = new java.io.File(new java.io.File(str.substring(0, str.lastIndexOf("/"))).getCanonicalPath() + java.io.File.separator + com.tencent.midas.plugin.APPluginConfig.SIGN_FILE_NAME);
        if (!file.exists()) {
            com.tencent.midas.comm.APLog.e(TAG, "Check plugin valid, sign file is not found");
            return false;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Check plugin valid, sign file exist!");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.midas.plugin.APPluginUtils.readSingInfo(hashMap, file);
        java.lang.String name = new java.io.File(str).getName();
        com.tencent.midas.comm.APLog.d(TAG, "Check plugin valid, current check file = " + name);
        if (str2.equals((java.lang.String) hashMap.get(name.split("\\_")[0]))) {
            com.tencent.midas.comm.APLog.d(TAG, "Check plugin valid, current check file = " + name + ", MD5 OK");
            return true;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Check plugin valid, current check file = " + name + ", MD5 not OK");
        return false;
    }
}
