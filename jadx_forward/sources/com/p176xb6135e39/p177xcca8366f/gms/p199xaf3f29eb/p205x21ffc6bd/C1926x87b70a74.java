package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.RootTelemetryConfigManager */
/* loaded from: classes13.dex */
public final class C1926x87b70a74 {
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74 zza;
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f zzb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f(0, false, false, 0, 0);
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f zzc;

    private C1926x87b70a74() {
    }

    /* renamed from: getInstance */
    public static synchronized com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74 m18225x9cf0d20b() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74 c1926x87b70a74;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74.class) {
            if (zza == null) {
                zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74();
            }
            c1926x87b70a74 = zza;
        }
        return c1926x87b70a74;
    }

    /* renamed from: getConfig */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f m18226x1456a638() {
        return this.zzc;
    }

    public final synchronized void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f c1927xe804295f) {
        if (c1927xe804295f == null) {
            this.zzc = zzb;
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f c1927xe804295f2 = this.zzc;
        if (c1927xe804295f2 == null || c1927xe804295f2.m18232x52c258a2() < c1927xe804295f.m18232x52c258a2()) {
            this.zzc = c1927xe804295f;
        }
    }
}
