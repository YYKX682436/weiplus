package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* renamed from: com.google.android.gms.auth.api.signin.internal.Storage */
/* loaded from: classes13.dex */
public class C1692xf2e8da5b {
    private static final java.util.concurrent.locks.Lock zaa = new java.util.concurrent.locks.ReentrantLock();
    private static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b zab;
    private final java.util.concurrent.locks.Lock zac = new java.util.concurrent.locks.ReentrantLock();
    private final android.content.SharedPreferences zad;

    public C1692xf2e8da5b(android.content.Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b m17551x9cf0d20b(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        java.util.concurrent.locks.Lock lock = zaa;
        lock.lock();
        try {
            if (zab == null) {
                zab = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b(context.getApplicationContext());
            }
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b c1692xf2e8da5b = zab;
            lock.unlock();
            return c1692xf2e8da5b;
        } catch (java.lang.Throwable th6) {
            zaa.unlock();
            throw th6;
        }
    }

    private static final java.lang.String zae(java.lang.String str, java.lang.String str2) {
        return str + ":" + str2;
    }

    /* renamed from: clear */
    public void m17552x5a5b64d() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    /* renamed from: getSavedDefaultGoogleSignInAccount */
    public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17553xc1f1cc02() {
        java.lang.String zaa2;
        java.lang.String zaa3 = zaa("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae("googleSignInAccount", zaa3))) == null) {
            return null;
        }
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632.zab(zaa2);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* renamed from: getSavedDefaultGoogleSignInOptions */
    public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 m17554xbda4c873() {
        java.lang.String zaa2;
        java.lang.String zaa3 = zaa("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae("googleSignInOptions", zaa3))) == null) {
            return null;
        }
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.zab(zaa2);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* renamed from: getSavedRefreshToken */
    public java.lang.String m17555xc1077f4f() {
        return zaa("refreshToken");
    }

    /* renamed from: saveDefaultGoogleSignInAccount */
    public void m17556xe67fb9ae(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1679x69269632);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1682x64d992a3);
        zad("defaultGoogleSignInAccount", c1679x69269632.zac());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1679x69269632);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1682x64d992a3);
        java.lang.String zac = c1679x69269632.zac();
        zad(zae("googleSignInAccount", zac), c1679x69269632.zad());
        zad(zae("googleSignInOptions", zac), c1682x64d992a3.zaf());
    }

    public final java.lang.String zaa(java.lang.String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    public final void zab(java.lang.String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        java.lang.String zaa2 = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(zaa2)) {
            return;
        }
        zab(zae("googleSignInAccount", zaa2));
        zab(zae("googleSignInOptions", zaa2));
    }

    public final void zad(java.lang.String str, java.lang.String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
