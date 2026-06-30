package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* loaded from: classes13.dex */
final class zzz {
    private java.lang.String zza = null;
    private long zzb = -1;
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzc = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66.zzl();
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzd = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66.zzl();

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzz zza(long j17) {
        this.zzb = j17;
        return this;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzz zzb(java.util.List list) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(list);
        this.zzd = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66.zzk(list);
        return this;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzz zzc(java.util.List list) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(list);
        this.zzc = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66.zzk(list);
        return this;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzz zzd(java.lang.String str) {
        this.zza = str;
        return this;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2022x394b61 zze() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new java.lang.IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new java.lang.IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C2022x394b61(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
