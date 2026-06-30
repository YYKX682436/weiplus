package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.PutDataMapRequest */
/* loaded from: classes13.dex */
public class C2473x8f1ddac {
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 zzr;
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 zzs;

    private C2473x8f1ddac(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 c2474x601f1916, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32) {
        this.zzs = c2474x601f1916;
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd322 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32();
        this.zzr = c2465xb93dbd322;
        if (c2465xb93dbd32 != null) {
            c2465xb93dbd322.m19773xc5c54012(c2465xb93dbd32);
        }
    }

    /* renamed from: create */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2473x8f1ddac m19821xaf65a0fc(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "path must not be null");
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2473x8f1ddac(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916.m19830xaf65a0fc(str), null);
    }

    /* renamed from: createFromDataMapItem */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2473x8f1ddac m19822x456d9cdf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2466x3cfac365 c2466x3cfac365) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(c2466x3cfac365, "source must not be null");
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2473x8f1ddac(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916.zza(c2466x3cfac365.m19797xb5887636()), c2466x3cfac365.m19796x93d2611c());
    }

    /* renamed from: createWithAutoAppendedId */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2473x8f1ddac m19823x69a107c5(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "pathPrefix must not be null");
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2473x8f1ddac(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916.m19832x69a107c5(str), null);
    }

    /* renamed from: asPutDataRequest */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19824x35f4e5c8() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzf zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zze.zza(this.zzr);
        this.zzs.m19841x76491f2c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt.zzb(zza.f7273x394c11));
        int size = zza.f7274x394c12.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String num = java.lang.Integer.toString(i17);
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0 = zza.f7274x394c12.get(i17);
            if (num == null) {
                java.lang.String valueOf = java.lang.String.valueOf(c2449x3c9fad0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 26);
                sb6.append("asset key cannot be null: ");
                sb6.append(valueOf);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
            if (c2449x3c9fad0 == null) {
                throw new java.lang.IllegalStateException(num.length() != 0 ? "asset cannot be null: key=".concat(num) : new java.lang.String("asset cannot be null: key="));
            }
            if (android.util.Log.isLoggable(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32.TAG, 3)) {
                new java.lang.StringBuilder(num.length() + 33 + java.lang.String.valueOf(c2449x3c9fad0).length());
            }
            this.zzs.m19839x6978d921(num, c2449x3c9fad0);
        }
        return this.zzs;
    }

    /* renamed from: getDataMap */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 m19825x93d2611c() {
        return this.zzr;
    }

    /* renamed from: getUri */
    public android.net.Uri m19826xb5887636() {
        return this.zzs.m19836xb5887636();
    }

    /* renamed from: isUrgent */
    public boolean m19827xf64ac50b() {
        return this.zzs.m19838xf64ac50b();
    }

    /* renamed from: setUrgent */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2473x8f1ddac m19828x266a2a43() {
        this.zzs.m19842x266a2a43();
        return this;
    }
}
