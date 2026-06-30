package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class mx extends com.tencent.mapsdk.internal.mv {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f50464b = "Tencent_MapSDK_SUB_CONFIG";

    /* renamed from: c, reason: collision with root package name */
    private static java.util.Map<java.lang.String, com.tencent.mapsdk.internal.mv> f50465c = new java.util.HashMap();

    private mx(android.content.Context context, java.lang.String str) {
        this.f50458a = context.getSharedPreferences("Tencent_MapSDK_SUB_CONFIG_".concat(java.lang.String.valueOf(str)), 0);
    }

    public static com.tencent.mapsdk.internal.mv a(android.content.Context context, java.lang.String str) {
        if (com.tencent.mapsdk.internal.hr.a(str)) {
            return com.tencent.mapsdk.internal.my.a(context);
        }
        if (f50465c.get(str) == null) {
            synchronized (com.tencent.mapsdk.internal.mx.class) {
                if (f50465c.get(str) == null) {
                    com.tencent.mapsdk.internal.mx mxVar = new com.tencent.mapsdk.internal.mx(context, str);
                    f50465c.put(str, mxVar);
                    return mxVar;
                }
            }
        }
        return f50465c.get(str);
    }

    private static boolean b(android.content.Context context, java.lang.String str) {
        if (com.tencent.mapsdk.internal.hr.a(str)) {
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
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.mv> map = f50465c;
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
                if (file.getName().startsWith(f50464b)) {
                    file.delete();
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
