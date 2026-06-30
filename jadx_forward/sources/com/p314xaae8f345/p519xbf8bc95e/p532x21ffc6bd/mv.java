package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class mv {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f131990b = "%s-%s-%s,%s-%s-%s,%s-%s-%s";

    /* renamed from: a, reason: collision with root package name */
    protected android.content.SharedPreferences f131991a = null;

    private long d(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return -1L;
        }
        return sharedPreferences.getLong(str, -1L);
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putString(str, str2).commit();
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, str2);
    }

    public final boolean c(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    public final java.lang.String a(java.lang.String str) {
        return b(str, (java.lang.String) null);
    }

    public final int b(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return -1;
        }
        return sharedPreferences.getInt(str, -1);
    }

    public final boolean a(java.lang.String str, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putInt(str, i17).commit();
    }

    public final int b(java.lang.String str, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        return sharedPreferences == null ? i17 : sharedPreferences.getInt(str, i17);
    }

    public final boolean a(java.lang.String str, long j17) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putLong(str, j17).commit();
    }

    private java.lang.String b() {
        return java.lang.String.format(f131990b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130897i, java.lang.Integer.valueOf(b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130915a)), b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130934t, (java.lang.String) null), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130900l, java.lang.Integer.valueOf(b("indoormap_style_version")), b("indoormap_style_md5", (java.lang.String) null), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130901m, java.lang.Integer.valueOf(b("indoormap_style_night_version")), b("indoormap_style_night_md5", (java.lang.String) null));
    }

    public final boolean a(java.lang.String str, boolean z17) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putBoolean(str, z17).commit();
    }

    public final boolean a(java.lang.String[] strArr) {
        android.content.SharedPreferences sharedPreferences = this.f131991a;
        if (sharedPreferences == null) {
            return false;
        }
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        for (java.lang.String str : strArr) {
            edit.remove(str);
        }
        return edit.commit();
    }

    public final boolean a() {
        return a(new java.lang.String[]{com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130915a, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130917c, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130918d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130931q, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130932r, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130933s, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130934t, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130935u, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130936v, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130937w, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130938x, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130939y});
    }
}
