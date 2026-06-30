package com.google.android.gms.common.logging;

/* loaded from: classes13.dex */
public class Logger {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.common.internal.GmsLogger zzc;
    private final int zzd;

    public Logger(java.lang.String str, java.lang.String... strArr) {
        java.lang.String sb6;
        if (strArr.length == 0) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append('[');
            for (java.lang.String str2 : strArr) {
                if (sb7.length() > 1) {
                    sb7.append(",");
                }
                sb7.append(str2);
            }
            sb7.append("] ");
            sb6 = sb7.toString();
        }
        this.zzb = sb6;
        this.zza = str;
        this.zzc = new com.google.android.gms.common.internal.GmsLogger(str);
        int i17 = 2;
        while (i17 <= 7 && !android.util.Log.isLoggable(this.zza, i17)) {
            i17++;
        }
        this.zzd = i17;
    }

    public void d(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    public void e(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        format(str, objArr);
    }

    public java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    public java.lang.String getTag() {
        return this.zza;
    }

    public void i(java.lang.String str, java.lang.Object... objArr) {
        format(str, objArr);
    }

    public boolean isLoggable(int i17) {
        return this.zzd <= i17;
    }

    public void v(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    public void w(java.lang.String str, java.lang.Object... objArr) {
        format(str, objArr);
    }

    public void wtf(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        android.util.Log.wtf(this.zza, format(str, objArr), th6);
    }

    public void e(java.lang.String str, java.lang.Object... objArr) {
        format(str, objArr);
    }

    public void wtf(java.lang.Throwable th6) {
        android.util.Log.wtf(this.zza, th6);
    }

    public void v(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}
