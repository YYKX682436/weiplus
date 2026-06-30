package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.DataMapItem */
/* loaded from: classes13.dex */
public class C2466x3cfac365 {
    private final android.net.Uri uri;
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 zzr;

    private C2466x3cfac365(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd interfaceC2462x6e785dfd) {
        this.uri = interfaceC2462x6e785dfd.mo19737xb5887636();
        this.zzr = zza(interfaceC2462x6e785dfd.mo18042xb4843a97());
    }

    /* renamed from: fromDataItem */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2466x3cfac365 m19795xda132ba7(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd interfaceC2462x6e785dfd) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(interfaceC2462x6e785dfd, "dataItem must not be null");
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2466x3cfac365(interfaceC2462x6e785dfd);
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd interfaceC2462x6e785dfd) {
        if (interfaceC2462x6e785dfd.mo19736xfb7e5820() == null && interfaceC2462x6e785dfd.mo19735x11279679().size() > 0) {
            throw new java.lang.IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (interfaceC2462x6e785dfd.mo19736xfb7e5820() == null) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32();
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = interfaceC2462x6e785dfd.mo19735x11279679().size();
            for (int i17 = 0; i17 < size; i17++) {
                com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 interfaceC2463x42bdd2f3 = interfaceC2462x6e785dfd.mo19735x11279679().get(java.lang.Integer.toString(i17));
                if (interfaceC2463x42bdd2f3 == null) {
                    java.lang.String valueOf = java.lang.String.valueOf(interfaceC2462x6e785dfd);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 64);
                    sb6.append("Cannot find DataItemAsset referenced in data at ");
                    sb6.append(i17);
                    sb6.append(" for ");
                    sb6.append(valueOf);
                    throw new java.lang.IllegalStateException(sb6.toString());
                }
                arrayList.add(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0.m19629x627a33ed(interfaceC2463x42bdd2f3.mo19740x5db1b11()));
            }
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zze.zza(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzg.zza(interfaceC2462x6e785dfd.mo19736xfb7e5820()), arrayList));
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs | java.lang.NullPointerException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(interfaceC2462x6e785dfd.mo19737xb5887636()).length() + 50 + java.lang.String.valueOf(android.util.Base64.encodeToString(interfaceC2462x6e785dfd.mo19736xfb7e5820(), 0)).length());
            java.lang.String valueOf2 = java.lang.String.valueOf(interfaceC2462x6e785dfd.mo19737xb5887636());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf2.length() + 44);
            sb7.append("Unable to parse datamap from dataItem.  uri=");
            sb7.append(valueOf2);
            throw new java.lang.IllegalStateException(sb7.toString(), e17);
        }
    }

    /* renamed from: getDataMap */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 m19796x93d2611c() {
        return this.zzr;
    }

    /* renamed from: getUri */
    public android.net.Uri m19797xb5887636() {
        return this.uri;
    }
}
