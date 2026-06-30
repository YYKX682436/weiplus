package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class mx extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f131997b = "Tencent_MapSDK_SUB_CONFIG";

    /* renamed from: c, reason: collision with root package name */
    private static java.util.Map<java.lang.String, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv> f131998c = new java.util.HashMap();

    private mx(android.content.Context context, java.lang.String str) {
        this.f131991a = context.getSharedPreferences("Tencent_MapSDK_SUB_CONFIG_".concat(java.lang.String.valueOf(str)), 0);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv a(android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
        }
        if (f131998c.get(str) == null) {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.class) {
                if (f131998c.get(str) == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx mxVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx(context, str);
                    f131998c.put(str, mxVar);
                    return mxVar;
                }
            }
        }
        return f131998c.get(str);
    }

    private static boolean b(android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            return false;
        }
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(context.getFilesDir().getParent());
            java.lang.String str2 = java.io.File.separator;
            sb6.append(str2);
            sb6.append("shared_prefs");
            sb6.append(str2);
            sb6.append("Tencent_MapSDK_SUB_CONFIG_");
            sb6.append(str);
            java.io.File file = new java.io.File(sb6.toString());
            if (file.exists()) {
                return file.delete();
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public static void b() {
        java.util.Map<java.lang.String, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv> map = f131998c;
        if (map != null) {
            map.clear();
        }
    }

    public static void a(android.content.Context context) {
        try {
            java.io.File[] listFiles = new java.io.File(context.getFilesDir().getParent() + java.io.File.separator + "shared_prefs").listFiles();
            if (listFiles == null) {
                return;
            }
            for (java.io.File file : listFiles) {
                if (file.getName().startsWith(f131997b)) {
                    file.delete();
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
