package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p385x8fb0427b;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.storage.PersistStorage */
/* loaded from: classes12.dex */
public class C3772xd0a6f627 {

    /* renamed from: GLOBAL_DOMAIN */
    public static final java.lang.String f14696xf2c680e0 = "com.liteav.storage.global";

    /* renamed from: mEditor */
    private final android.content.SharedPreferences.Editor f14697x178483a;

    /* renamed from: mSharedPreferences */
    private final android.content.SharedPreferences f14698x12742066;

    public C3772xd0a6f627(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSharedPreferences(str, 0);
        this.f14698x12742066 = sharedPreferences;
        this.f14697x178483a = sharedPreferences.edit();
    }

    /* renamed from: integerToBase */
    public static int m29431xc225daca(java.lang.Integer num) {
        return num.intValue();
    }

    /* renamed from: longToBase */
    public static long m29432xd99db988(java.lang.Long l17) {
        return l17.longValue();
    }

    /* renamed from: clear */
    public void m29433x5a5b64d(java.lang.String str) {
        this.f14697x178483a.remove(str);
    }

    /* renamed from: commit */
    public void m29434xaf3f2937() {
        this.f14697x178483a.apply();
    }

    /* renamed from: getAllKeys */
    public java.lang.String[] m29435x76a9eff() {
        java.util.Map<java.lang.String, ?> all = this.f14698x12742066.getAll();
        if (all == null || all.isEmpty()) {
            return new java.lang.String[0];
        }
        java.util.Set<java.lang.String> keySet = all.keySet();
        return (java.lang.String[]) keySet.toArray(new java.lang.String[keySet.size()]);
    }

    /* renamed from: getInt */
    public java.lang.Integer m29436xb58848b9(java.lang.String str) {
        if (!this.f14698x12742066.contains(str)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(this.f14698x12742066.getInt(str, -1));
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: getLong */
    public java.lang.Long m29437xfb822ef2(java.lang.String str) {
        if (!this.f14698x12742066.contains(str)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(this.f14698x12742066.getLong(str, -1L));
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: getString */
    public java.lang.String m29438x2fec8307(java.lang.String str) {
        if (!this.f14698x12742066.contains(str)) {
            return null;
        }
        try {
            return this.f14698x12742066.getString(str, null);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public void put(java.lang.String str, int i17) {
        this.f14697x178483a.putInt(str, i17);
    }

    public void put(java.lang.String str, long j17) {
        this.f14697x178483a.putLong(str, j17);
    }

    public void put(java.lang.String str, java.lang.String str2) {
        this.f14697x178483a.putString(str, str2);
    }
}
