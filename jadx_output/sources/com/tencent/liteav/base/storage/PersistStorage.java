package com.tencent.liteav.base.storage;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes12.dex */
public class PersistStorage {
    public static final java.lang.String GLOBAL_DOMAIN = "com.liteav.storage.global";
    private final android.content.SharedPreferences.Editor mEditor;
    private final android.content.SharedPreferences mSharedPreferences;

    public PersistStorage(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = com.tencent.liteav.base.ContextUtils.getApplicationContext().getSharedPreferences(str, 0);
        this.mSharedPreferences = sharedPreferences;
        this.mEditor = sharedPreferences.edit();
    }

    public static int integerToBase(java.lang.Integer num) {
        return num.intValue();
    }

    public static long longToBase(java.lang.Long l17) {
        return l17.longValue();
    }

    public void clear(java.lang.String str) {
        this.mEditor.remove(str);
    }

    public void commit() {
        this.mEditor.apply();
    }

    public java.lang.String[] getAllKeys() {
        java.util.Map<java.lang.String, ?> all = this.mSharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            return new java.lang.String[0];
        }
        java.util.Set<java.lang.String> keySet = all.keySet();
        return (java.lang.String[]) keySet.toArray(new java.lang.String[keySet.size()]);
    }

    public java.lang.Integer getInt(java.lang.String str) {
        if (!this.mSharedPreferences.contains(str)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(this.mSharedPreferences.getInt(str, -1));
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public java.lang.Long getLong(java.lang.String str) {
        if (!this.mSharedPreferences.contains(str)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(this.mSharedPreferences.getLong(str, -1L));
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public java.lang.String getString(java.lang.String str) {
        if (!this.mSharedPreferences.contains(str)) {
            return null;
        }
        try {
            return this.mSharedPreferences.getString(str, null);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public void put(java.lang.String str, int i17) {
        this.mEditor.putInt(str, i17);
    }

    public void put(java.lang.String str, long j17) {
        this.mEditor.putLong(str, j17);
    }

    public void put(java.lang.String str, java.lang.String str2) {
        this.mEditor.putString(str, str2);
    }
}
