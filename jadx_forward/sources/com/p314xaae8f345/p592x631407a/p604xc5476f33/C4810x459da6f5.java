package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginLoader */
/* loaded from: classes13.dex */
public class C4810x459da6f5 {

    /* renamed from: sClassLoaderMap */
    private static final java.util.HashMap<java.lang.String, dalvik.system.DexClassLoader> f20770x6e85c504 = new java.util.HashMap<>();

    /* renamed from: parentClassLoader */
    private static dalvik.system.DexClassLoader f20769x5ea3ca1 = null;

    /* renamed from: getClassLoader */
    public static synchronized java.lang.ClassLoader m42107xa0bf1275(java.lang.String str, java.lang.String str2) {
        dalvik.system.DexClassLoader dexClassLoader;
        synchronized (com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.class) {
            dexClassLoader = f20770x6e85c504.get(str + "_" + str2);
        }
        return dexClassLoader;
    }

    /* renamed from: getOrCreateClassLoader */
    public static synchronized java.lang.ClassLoader m42108xecd2ce36(android.content.Context context, java.lang.String str) {
        dalvik.system.DexClassLoader m42109x6aff9af2;
        synchronized (com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.class) {
            m42109x6aff9af2 = m42109x6aff9af2(context, str, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42090x5997ff2a(context, str).getCanonicalPath());
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APPluginStatic", "getClassLoader getOrCreateClassLoader midasClassLoader: " + m42109x6aff9af2.hashCode());
        }
        return m42109x6aff9af2;
    }

    /* renamed from: getOrCreateClassLoaderByPath */
    public static synchronized dalvik.system.DexClassLoader m42109x6aff9af2(android.content.Context context, java.lang.String str, java.lang.String str2) {
        synchronized (com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.class) {
            java.lang.String m42161x8e8bd977 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42161x8e8bd977(str2);
            java.lang.String str3 = str + "_" + m42161x8e8bd977;
            java.util.HashMap<java.lang.String, dalvik.system.DexClassLoader> hashMap = f20770x6e85c504;
            dalvik.system.DexClassLoader dexClassLoader = hashMap.get(str3);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APPluginStatic", "getOrCreateClassLoader apkFilePath: " + str2 + ", MD5: " + m42161x8e8bd977 + ", key: " + str3 + ", dexClassLoader: " + dexClassLoader);
            if (dexClassLoader != null) {
                return dexClassLoader;
            }
            try {
                if (!com.p314xaae8f345.p592x631407a.p604xc5476f33.C4805x86453513.m42071xe0eb54ff(str2, m42161x8e8bd977)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APPluginStatic", "getOrCreateClassLoader isPluginValid false");
                    return null;
                }
                java.lang.String canonicalPath = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42073x88fb252b(context).getCanonicalPath();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42151x6ca2d6af(str2, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42072x47a5ec14(context).getCanonicalPath());
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20624x7103d208, currentTimeMillis);
                java.lang.String canonicalPath2 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42072x47a5ec14(context).getCanonicalPath();
                dalvik.system.DexClassLoader dexClassLoader2 = f20769x5ea3ca1 != null ? new dalvik.system.DexClassLoader(str2, canonicalPath, canonicalPath2, f20769x5ea3ca1) : new dalvik.system.DexClassLoader(str2, canonicalPath, canonicalPath2, context.getClassLoader());
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APPluginStatic", "getOrCreateClassLoader new DexClassLoader cache: " + canonicalPath + " libDir: " + canonicalPath2);
                hashMap.put(str3, dexClassLoader2);
                return dexClassLoader2;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: preCreateClassLoaderByPath */
    public static synchronized void m42110x290b00e8(android.content.Context context) {
        synchronized (com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.class) {
            java.lang.String str = "";
            java.lang.String str2 = "";
            java.io.File m42077xd72d2dee = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42077xd72d2dee(context);
            if (m42077xd72d2dee != null) {
                java.io.File[] listFiles = m42077xd72d2dee.listFiles();
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
                m42109x6aff9af2(context, str, str2);
            }
        }
    }

    /* renamed from: release */
    public static void m42111x41012807() {
        f20770x6e85c504.clear();
    }

    /* renamed from: setParentClassLoader */
    public static void m42112x34b4d05f(dalvik.system.DexClassLoader dexClassLoader) {
        f20769x5ea3ca1 = dexClassLoader;
    }
}
