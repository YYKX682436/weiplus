package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.PackageVerificationResult */
/* loaded from: classes13.dex */
public class C1718xc1954de {
    private final java.lang.String zza;
    private final boolean zzb;
    private final java.lang.String zzc;
    private final java.lang.Throwable zzd;

    private C1718xc1954de(java.lang.String str, int i17, boolean z17, java.lang.String str2, java.lang.Throwable th6) {
        this.zza = str;
        this.zzb = z17;
        this.zzc = str2;
        this.zzd = th6;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de zza(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de(str, 1, false, str2, th6);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de zzd(java.lang.String str, int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de(str, i17, true, null, null);
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        java.lang.String str = this.zzc;
        java.lang.Throwable th6 = this.zzd;
        java.lang.String concat = "PackageVerificationRslt: ".concat(java.lang.String.valueOf(str));
        if (th6 == null) {
            throw new java.lang.SecurityException(concat);
        }
        throw new java.lang.SecurityException(concat, th6);
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
