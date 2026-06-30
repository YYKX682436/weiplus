package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APPluginDataStorage */
/* loaded from: classes13.dex */
public class C4760xb2df5dcf {

    /* renamed from: poolExecutor */
    private static java.util.concurrent.ExecutorService f20300xe339190f;

    /* renamed from: singleThreadExecutor */
    private static final java.util.concurrent.ExecutorService f20301x163df365 = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: spCache */
    private static final java.util.HashMap<java.lang.String, java.lang.String> f20302x86692325 = new java.util.HashMap<>();

    /* renamed from: hasInit */
    private static boolean f20299x29858eca = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: commit */
    public static void m41661xaf3f2937(final android.content.SharedPreferences.Editor editor) {
        f20301x163df365.execute(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APPluginDataStorage.2
            @Override // java.lang.Runnable
            public void run() {
                editor.commit();
            }
        });
    }

    /* renamed from: doAsyncTask */
    public static void m41662x26d70dd6(java.lang.Runnable runnable) {
        if (f20300xe339190f == null) {
            try {
                f20300xe339190f = java.util.concurrent.Executors.newCachedThreadPool();
            } catch (java.lang.Exception unused) {
                new java.lang.Thread(runnable).start();
                return;
            }
        }
        f20300xe339190f.execute(runnable);
    }

    /* renamed from: getData */
    public static java.lang.String m41663xfb7e5820(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (context == null) {
            return "";
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = f20302x86692325;
        return hashMap.get(str2) == null ? "" : hashMap.get(str2);
    }

    /* renamed from: initCache */
    public static void m41664xef110452(final android.content.Context context, final java.lang.String str) {
        if (context == null || f20299x29858eca) {
            return;
        }
        m41662x26d70dd6(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APPluginDataStorage.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean unused = com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.f20299x29858eca = true;
                    java.util.Map<java.lang.String, ?> all = context.getSharedPreferences(str, 4).getAll();
                    for (java.lang.String str2 : all.keySet()) {
                        try {
                            java.lang.Object obj = all.get(str2);
                            if (obj instanceof java.lang.String) {
                                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.f20302x86692325.put(str2, java.lang.String.valueOf(obj));
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                } catch (java.lang.Throwable unused3) {
                }
            }
        });
    }

    /* renamed from: storeData */
    public static void m41665x64d2042b(final android.content.Context context, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        if (context == null) {
            return;
        }
        f20302x86692325.put(str2, str3);
        m41662x26d70dd6(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APPluginDataStorage.3
            @Override // java.lang.Runnable
            public void run() {
                android.content.Context context2 = context;
                if (context2 == null) {
                    return;
                }
                try {
                    android.content.SharedPreferences.Editor edit = context2.getSharedPreferences(str, 4).edit();
                    edit.putString(str2, str3);
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41661xaf3f2937(edit);
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }
}
