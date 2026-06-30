package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class mv {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f50457b = "%s-%s-%s,%s-%s-%s,%s-%s-%s";

    /* renamed from: a, reason: collision with root package name */
    protected android.content.SharedPreferences f50458a = null;

    private long d(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return -1L;
        }
        return sharedPreferences.getLong(str, -1L);
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putString(str, str2).commit();
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, str2);
    }

    public final boolean c(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    public final java.lang.String a(java.lang.String str) {
        return b(str, (java.lang.String) null);
    }

    public final int b(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return -1;
        }
        return sharedPreferences.getInt(str, -1);
    }

    public final boolean a(java.lang.String str, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putInt(str, i17).commit();
    }

    public final int b(java.lang.String str, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        return sharedPreferences == null ? i17 : sharedPreferences.getInt(str, i17);
    }

    public final boolean a(java.lang.String str, long j17) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putLong(str, j17).commit();
    }

    private java.lang.String b() {
        return java.lang.String.format(f50457b, com.tencent.mapsdk.internal.ep.f49364i, java.lang.Integer.valueOf(b(com.tencent.mapsdk.internal.er.f49382a)), b(com.tencent.mapsdk.internal.er.f49401t, (java.lang.String) null), com.tencent.mapsdk.internal.ep.f49367l, java.lang.Integer.valueOf(b("indoormap_style_version")), b("indoormap_style_md5", (java.lang.String) null), com.tencent.mapsdk.internal.ep.f49368m, java.lang.Integer.valueOf(b("indoormap_style_night_version")), b("indoormap_style_night_md5", (java.lang.String) null));
    }

    public final boolean a(java.lang.String str, boolean z17) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putBoolean(str, z17).commit();
    }

    public final boolean a(java.lang.String[] strArr) {
        android.content.SharedPreferences sharedPreferences = this.f50458a;
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
        return a(new java.lang.String[]{com.tencent.mapsdk.internal.er.f49382a, com.tencent.mapsdk.internal.er.f49384c, com.tencent.mapsdk.internal.er.f49385d, com.tencent.mapsdk.internal.er.f49398q, com.tencent.mapsdk.internal.er.f49399r, com.tencent.mapsdk.internal.er.f49400s, com.tencent.mapsdk.internal.er.f49401t, com.tencent.mapsdk.internal.er.f49402u, com.tencent.mapsdk.internal.er.f49403v, com.tencent.mapsdk.internal.er.f49404w, com.tencent.mapsdk.internal.er.f49405x, com.tencent.mapsdk.internal.er.f49406y});
    }
}
