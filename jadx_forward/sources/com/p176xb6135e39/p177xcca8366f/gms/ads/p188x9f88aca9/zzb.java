package com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9;

/* loaded from: classes13.dex */
public final class zzb {
    private android.content.SharedPreferences zzs;

    public zzb(android.content.Context context) {
        try {
            android.content.Context m17676x14cfd6d3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17676x14cfd6d3(context);
            this.zzs = m17676x14cfd6d3 == null ? null : m17676x14cfd6d3.getSharedPreferences("google_ads_flags", 0);
        } catch (java.lang.Throwable unused) {
            this.zzs = null;
        }
    }

    /* renamed from: getBoolean */
    public final boolean m17273x41a8a7f2(java.lang.String str, boolean z17) {
        try {
            android.content.SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: getFloat */
    public final float m17274x746dc8a6(java.lang.String str, float f17) {
        try {
            android.content.SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: getString */
    public final java.lang.String m17275x2fec8307(java.lang.String str, java.lang.String str2) {
        try {
            android.content.SharedPreferences sharedPreferences = this.zzs;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (java.lang.Throwable unused) {
            return str2;
        }
    }
}
