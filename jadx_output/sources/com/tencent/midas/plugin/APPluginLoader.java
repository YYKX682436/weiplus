package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginLoader {
    private static final java.util.HashMap<java.lang.String, dalvik.system.DexClassLoader> sClassLoaderMap = new java.util.HashMap<>();
    private static dalvik.system.DexClassLoader parentClassLoader = null;

    public static synchronized java.lang.ClassLoader getClassLoader(java.lang.String str, java.lang.String str2) {
        dalvik.system.DexClassLoader dexClassLoader;
        synchronized (com.tencent.midas.plugin.APPluginLoader.class) {
            dexClassLoader = sClassLoaderMap.get(str + "_" + str2);
        }
        return dexClassLoader;
    }

    public static synchronized java.lang.ClassLoader getOrCreateClassLoader(android.content.Context context, java.lang.String str) {
        dalvik.system.DexClassLoader orCreateClassLoaderByPath;
        synchronized (com.tencent.midas.plugin.APPluginLoader.class) {
            orCreateClassLoaderByPath = getOrCreateClassLoaderByPath(context, str, com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(context, str).getCanonicalPath());
            com.tencent.midas.comm.APLog.d("APPluginStatic", "getClassLoader getOrCreateClassLoader midasClassLoader: " + orCreateClassLoaderByPath.hashCode());
        }
        return orCreateClassLoaderByPath;
    }

    public static synchronized dalvik.system.DexClassLoader getOrCreateClassLoaderByPath(android.content.Context context, java.lang.String str, java.lang.String str2) {
        synchronized (com.tencent.midas.plugin.APPluginLoader.class) {
            java.lang.String mD5FromPath = com.tencent.midas.plugin.APPluginUtils.getMD5FromPath(str2);
            java.lang.String str3 = str + "_" + mD5FromPath;
            java.util.HashMap<java.lang.String, dalvik.system.DexClassLoader> hashMap = sClassLoaderMap;
            dalvik.system.DexClassLoader dexClassLoader = hashMap.get(str3);
            com.tencent.midas.comm.APLog.d("APPluginStatic", "getOrCreateClassLoader apkFilePath: " + str2 + ", MD5: " + mD5FromPath + ", key: " + str3 + ", dexClassLoader: " + dexClassLoader);
            if (dexClassLoader != null) {
                return dexClassLoader;
            }
            try {
                if (!com.tencent.midas.plugin.APPluginChecker.isPluginValid(str2, mD5FromPath)) {
                    com.tencent.midas.comm.APLog.e("APPluginStatic", "getOrCreateClassLoader isPluginValid false");
                    return null;
                }
                java.lang.String canonicalPath = com.tencent.midas.plugin.APPluginConfig.getOptimizedDexPath(context).getCanonicalPath();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.midas.plugin.APPluginUtils.extractLibs(str2, com.tencent.midas.plugin.APPluginConfig.getLibPath(context).getCanonicalPath());
                com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_UNZIP_SO, currentTimeMillis);
                java.lang.String canonicalPath2 = com.tencent.midas.plugin.APPluginConfig.getLibPath(context).getCanonicalPath();
                dalvik.system.DexClassLoader dexClassLoader2 = parentClassLoader != null ? new dalvik.system.DexClassLoader(str2, canonicalPath, canonicalPath2, parentClassLoader) : new dalvik.system.DexClassLoader(str2, canonicalPath, canonicalPath2, context.getClassLoader());
                com.tencent.midas.comm.APLog.d("APPluginStatic", "getOrCreateClassLoader new DexClassLoader cache: " + canonicalPath + " libDir: " + canonicalPath2);
                hashMap.put(str3, dexClassLoader2);
                return dexClassLoader2;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    public static synchronized void preCreateClassLoaderByPath(android.content.Context context) {
        synchronized (com.tencent.midas.plugin.APPluginLoader.class) {
            java.lang.String str = "";
            java.lang.String str2 = "";
            java.io.File pluginPath = com.tencent.midas.plugin.APPluginConfig.getPluginPath(context);
            if (pluginPath != null) {
                java.io.File[] listFiles = pluginPath.listFiles();
                int i17 = 0;
                while (true) {
                    if (i17 >= listFiles.length) {
                        break;
                    }
                    java.io.File file = listFiles[i17];
                    if (file.getName().startsWith("MidasPay")) {
                        file.setReadOnly();
                        str = "MidasPay";
                        str2 = file.getCanonicalPath();
                        break;
                    }
                    i17++;
                }
            }
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                getOrCreateClassLoaderByPath(context, str, str2);
            }
        }
    }

    public static void release() {
        sClassLoaderMap.clear();
    }

    public static void setParentClassLoader(dalvik.system.DexClassLoader dexClassLoader) {
        parentClassLoader = dexClassLoader;
    }
}
