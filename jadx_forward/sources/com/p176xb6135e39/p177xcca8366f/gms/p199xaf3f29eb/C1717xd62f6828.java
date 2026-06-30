package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.PackageSignatureVerifier */
/* loaded from: classes13.dex */
public class C1717xd62f6828 {
    static volatile com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2023x394b62 zza;
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2024x394b63 zzb;

    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2024x394b63 zza(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2024x394b63 c2024x394b63;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1717xd62f6828.class) {
            if (zzb == null) {
                zzb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2024x394b63(context);
            }
            c2024x394b63 = zzb;
        }
        return c2024x394b63;
    }

    /* renamed from: queryPackageSignatureVerified */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de m17692xc92a8e2(android.content.Context context, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de c1718xc1954de;
        java.lang.String str2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de c1718xc1954de2;
        boolean m17678x5882f166 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17678x5882f166(context);
        zza(context);
        if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zzf()) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2025x394b64();
        }
        java.lang.String concat = java.lang.String.valueOf(str).concat(true != m17678x5882f166 ? "-0" : "-1");
        if (zza != null) {
            str2 = zza.zza;
            if (str2.equals(concat)) {
                c1718xc1954de2 = zza.zzb;
                return c1718xc1954de2;
            }
        }
        zza(context);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzc = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zzc(str, m17678x5882f166, false, false);
        if (!zzc.zza) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzc.zzb);
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de.zza(str, zzc.zzb, zzc.zzc);
        }
        zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2023x394b62(concat, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de.zzd(str, zzc.zzd));
        c1718xc1954de = zza.zzb;
        return c1718xc1954de;
    }

    /* renamed from: queryPackageSignatureVerifiedWithRetry */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de m17693x7fdb62c0(android.content.Context context, java.lang.String str) {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de m17692xc92a8e2 = m17692xc92a8e2(context, str);
            m17692xc92a8e2.zzb();
            return m17692xc92a8e2;
        } catch (java.lang.SecurityException unused) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1718xc1954de m17692xc92a8e22 = m17692xc92a8e2(context, str);
            if (m17692xc92a8e22.zzc()) {
            }
            return m17692xc92a8e22;
        }
    }
}
