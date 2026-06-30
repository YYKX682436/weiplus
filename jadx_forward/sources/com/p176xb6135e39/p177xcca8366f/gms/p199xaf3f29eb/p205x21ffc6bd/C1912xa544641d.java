package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.GmsLogger */
/* loaded from: classes13.dex */
public final class C1912xa544641d {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public C1912xa544641d(java.lang.String str) {
        this(str, null);
    }

    private final java.lang.String zza(java.lang.String str) {
        java.lang.String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final java.lang.String zzb(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = this.zzb;
        java.lang.String format = java.lang.String.format(str, objArr);
        return str2 == null ? format : str2.concat(format);
    }

    /* renamed from: canLog */
    public boolean m18175xae79d954(int i17) {
        return android.util.Log.isLoggable(this.zza, i17);
    }

    /* renamed from: canLogPii */
    public boolean m18176xf5b2ef9c() {
        return false;
    }

    public void d(java.lang.String str, java.lang.String str2) {
        if (m18175xae79d954(3)) {
            zza(str2);
        }
    }

    public void e(java.lang.String str, java.lang.String str2) {
        if (m18175xae79d954(6)) {
            zza(str2);
        }
    }

    /* renamed from: efmt */
    public void m18177x2f7608(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (m18175xae79d954(6)) {
            zzb(str2, objArr);
        }
    }

    public void i(java.lang.String str, java.lang.String str2) {
        if (m18175xae79d954(4)) {
            zza(str2);
        }
    }

    public void pii(java.lang.String str, java.lang.String str2) {
    }

    public void v(java.lang.String str, java.lang.String str2) {
        if (m18175xae79d954(2)) {
            zza(str2);
        }
    }

    public void w(java.lang.String str, java.lang.String str2) {
        if (m18175xae79d954(5)) {
            zza(str2);
        }
    }

    /* renamed from: wfmt */
    public void m18178x37a4b6(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (m18175xae79d954(5)) {
            zzb(str2, objArr);
        }
    }

    public void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m18175xae79d954(7)) {
            zza(str2);
            android.util.Log.wtf(str, zza(str2), th6);
        }
    }

    public C1912xa544641d(java.lang.String str, java.lang.String str2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "log tag cannot be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18199x312c1fe5(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public void pii(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
    }

    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m18175xae79d954(3)) {
            zza(str2);
        }
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m18175xae79d954(6)) {
            zza(str2);
        }
    }

    public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m18175xae79d954(4)) {
            zza(str2);
        }
    }

    public void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m18175xae79d954(2)) {
            zza(str2);
        }
    }

    public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m18175xae79d954(5)) {
            zza(str2);
        }
    }
}
