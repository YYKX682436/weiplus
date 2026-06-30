package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f;

/* renamed from: com.google.android.gms.common.logging.Logger */
/* loaded from: classes13.dex */
public class C1959x87fce1b0 {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1912xa544641d zzc;
    private final int zzd;

    public C1959x87fce1b0(java.lang.String str, java.lang.String... strArr) {
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
        this.zzc = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1912xa544641d(str);
        int i17 = 2;
        while (i17 <= 7 && !android.util.Log.isLoggable(this.zza, i17)) {
            i17++;
        }
        this.zzd = i17;
    }

    public void d(java.lang.String str, java.lang.Object... objArr) {
        if (m18411x492678c7(3)) {
            m18409xb45ff7f7(str, objArr);
        }
    }

    public void e(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        m18409xb45ff7f7(str, objArr);
    }

    /* renamed from: format */
    public java.lang.String m18409xb45ff7f7(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    /* renamed from: getTag */
    public java.lang.String m18410xb5887064() {
        return this.zza;
    }

    public void i(java.lang.String str, java.lang.Object... objArr) {
        m18409xb45ff7f7(str, objArr);
    }

    /* renamed from: isLoggable */
    public boolean m18411x492678c7(int i17) {
        return this.zzd <= i17;
    }

    public void v(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        if (m18411x492678c7(2)) {
            m18409xb45ff7f7(str, objArr);
        }
    }

    public void w(java.lang.String str, java.lang.Object... objArr) {
        m18409xb45ff7f7(str, objArr);
    }

    public void wtf(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        android.util.Log.wtf(this.zza, m18409xb45ff7f7(str, objArr), th6);
    }

    public void e(java.lang.String str, java.lang.Object... objArr) {
        m18409xb45ff7f7(str, objArr);
    }

    public void wtf(java.lang.Throwable th6) {
        android.util.Log.wtf(this.zza, th6);
    }

    public void v(java.lang.String str, java.lang.Object... objArr) {
        if (m18411x492678c7(2)) {
            m18409xb45ff7f7(str, objArr);
        }
    }
}
