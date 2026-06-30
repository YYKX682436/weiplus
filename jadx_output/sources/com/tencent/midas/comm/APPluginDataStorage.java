package com.tencent.midas.comm;

/* loaded from: classes13.dex */
public class APPluginDataStorage {
    private static java.util.concurrent.ExecutorService poolExecutor;
    private static final java.util.concurrent.ExecutorService singleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static final java.util.HashMap<java.lang.String, java.lang.String> spCache = new java.util.HashMap<>();
    private static boolean hasInit = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static void commit(final android.content.SharedPreferences.Editor editor) {
        singleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APPluginDataStorage.2
            @Override // java.lang.Runnable
            public void run() {
                editor.commit();
            }
        });
    }

    public static void doAsyncTask(java.lang.Runnable runnable) {
        if (poolExecutor == null) {
            try {
                poolExecutor = java.util.concurrent.Executors.newCachedThreadPool();
            } catch (java.lang.Exception unused) {
                new java.lang.Thread(runnable).start();
                return;
            }
        }
        poolExecutor.execute(runnable);
    }

    public static java.lang.String getData(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (context == null) {
            return "";
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = spCache;
        return hashMap.get(str2) == null ? "" : hashMap.get(str2);
    }

    public static void initCache(final android.content.Context context, final java.lang.String str) {
        if (context == null || hasInit) {
            return;
        }
        doAsyncTask(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APPluginDataStorage.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean unused = com.tencent.midas.comm.APPluginDataStorage.hasInit = true;
                    java.util.Map<java.lang.String, ?> all = context.getSharedPreferences(str, 4).getAll();
                    for (java.lang.String str2 : all.keySet()) {
                        try {
                            java.lang.Object obj = all.get(str2);
                            if (obj instanceof java.lang.String) {
                                com.tencent.midas.comm.APPluginDataStorage.spCache.put(str2, java.lang.String.valueOf(obj));
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                } catch (java.lang.Throwable unused3) {
                }
            }
        });
    }

    public static void storeData(final android.content.Context context, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        if (context == null) {
            return;
        }
        spCache.put(str2, str3);
        doAsyncTask(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APPluginDataStorage.3
            @Override // java.lang.Runnable
            public void run() {
                android.content.Context context2 = context;
                if (context2 == null) {
                    return;
                }
                try {
                    android.content.SharedPreferences.Editor edit = context2.getSharedPreferences(str, 4).edit();
                    edit.putString(str2, str3);
                    com.tencent.midas.comm.APPluginDataStorage.commit(edit);
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }
}
