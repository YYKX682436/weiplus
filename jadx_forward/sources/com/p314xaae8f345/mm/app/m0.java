package com.p314xaae8f345.mm.app;

/* loaded from: classes.dex */
public abstract class m0 {
    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("crash_status_file", 4);
            java.lang.String string = sharedPreferences.getString("crashlist", "");
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("crashlist", string + ";" + str + "," + str2);
            edit.commit();
        } catch (java.lang.Throwable unused) {
        }
    }
}
