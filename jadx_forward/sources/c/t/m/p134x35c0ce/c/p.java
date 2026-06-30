package c.t.m.p134x35c0ce.c;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static volatile android.content.SharedPreferences f118446a;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f118447b;

    public static synchronized android.content.SharedPreferences a() {
        android.content.SharedPreferences sharedPreferences;
        synchronized (c.t.m.p134x35c0ce.c.p.class) {
            if (f118446a == null) {
                f118446a = f118447b.getSharedPreferences("TLocationSDK", 0);
            }
            sharedPreferences = f118446a;
        }
        return sharedPreferences;
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        b(a(str), str2, obj);
    }

    public static void b(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Object obj) {
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj instanceof java.lang.String) {
            edit.putString(str, (java.lang.String) obj);
        } else if (obj instanceof java.lang.Integer) {
            edit.putInt(str, ((java.lang.Integer) obj).intValue());
        } else if (obj instanceof java.lang.Boolean) {
            edit.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
        } else if (obj instanceof java.lang.Float) {
            edit.putFloat(str, ((java.lang.Float) obj).floatValue());
        } else if (obj instanceof java.lang.Long) {
            edit.putLong(str, ((java.lang.Long) obj).longValue());
        } else {
            edit.putString(str, obj.toString());
        }
        edit.apply();
    }

    public static android.content.SharedPreferences a(java.lang.String str) {
        if ("TLocationSDK".equals(str)) {
            return a();
        }
        return f118447b.getSharedPreferences(str, "com.tencent.mobileqq".equals(f118447b.getPackageName()) ? 4 : 0);
    }

    public static java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return a(a(str), str2, obj);
    }

    public static java.lang.Object a(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return sharedPreferences.getString(str, (java.lang.String) obj);
        }
        if (obj instanceof java.lang.Integer) {
            return java.lang.Integer.valueOf(sharedPreferences.getInt(str, ((java.lang.Integer) obj).intValue()));
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(str, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Float.valueOf(sharedPreferences.getFloat(str, ((java.lang.Float) obj).floatValue()));
        }
        if (obj instanceof java.lang.Long) {
            return java.lang.Long.valueOf(sharedPreferences.getLong(str, ((java.lang.Long) obj).longValue()));
        }
        return null;
    }
}
