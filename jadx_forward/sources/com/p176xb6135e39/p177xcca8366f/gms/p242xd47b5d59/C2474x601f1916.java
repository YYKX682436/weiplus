package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.PutDataRequest */
/* loaded from: classes13.dex */
public class C2474x601f1916 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: WEAR_URI_SCHEME */
    public static final java.lang.String f7500x1dca78b8 = "wear";

    /* renamed from: data */
    private byte[] f7501x2eefaa;
    private final android.net.Uri uri;
    private final android.os.Bundle zzv;
    private long zzw;

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916> f7499x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzh();
    private static final long zzt = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);
    private static final java.util.Random zzu = new java.security.SecureRandom();

    private C2474x601f1916(android.net.Uri uri) {
        this(uri, new android.os.Bundle(), null, zzt);
    }

    /* renamed from: create */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19830xaf65a0fc(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "path must not be null");
        return zza(zza(str));
    }

    /* renamed from: createFromDataItem */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19831x50ce86c3(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd interfaceC2462x6e785dfd) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(interfaceC2462x6e785dfd, "source must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 zza = zza(interfaceC2462x6e785dfd.mo19737xb5887636());
        for (java.util.Map.Entry<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> entry : interfaceC2462x6e785dfd.mo19735x11279679().entrySet()) {
            if (entry.getValue().mo19740x5db1b11() == null) {
                java.lang.String valueOf = java.lang.String.valueOf(entry.getKey());
                throw new java.lang.IllegalStateException(valueOf.length() != 0 ? "Cannot create an asset for a put request without a digest: ".concat(valueOf) : new java.lang.String("Cannot create an asset for a put request without a digest: "));
            }
            zza.m19839x6978d921(entry.getKey(), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0.m19629x627a33ed(entry.getValue().mo19740x5db1b11()));
        }
        zza.m19841x76491f2c(interfaceC2462x6e785dfd.mo19736xfb7e5820());
        return zza;
    }

    /* renamed from: createWithAutoAppendedId */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19832x69a107c5(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "pathPrefix must not be null");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        if (!str.endsWith("/")) {
            sb6.append("/");
        }
        sb6.append("PN");
        sb6.append(zzu.nextLong());
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916(zza(sb6.toString()));
    }

    private static android.net.Uri zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new java.lang.IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new java.lang.IllegalArgumentException("A path must start with a single / .");
        }
        return new android.net.Uri.Builder().scheme(f7500x1dca78b8).path(str).build();
    }

    /* renamed from: getAsset */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 m19833x742a913a(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "key must not be null");
        return (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) this.zzv.getParcelable(str);
    }

    /* renamed from: getAssets */
    public java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0> m19834x11279679() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.zzv.keySet()) {
            hashMap.put(str, (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) this.zzv.getParcelable(str));
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: getData */
    public byte[] m19835xfb7e5820() {
        return this.f7501x2eefaa;
    }

    /* renamed from: getUri */
    public android.net.Uri m19836xb5887636() {
        return this.uri;
    }

    /* renamed from: hasAsset */
    public boolean m19837x6bdf876(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "key must not be null");
        return this.zzv.containsKey(str);
    }

    /* renamed from: isUrgent */
    public boolean m19838xf64ac50b() {
        return this.zzw == 0;
    }

    /* renamed from: putAsset */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19839x6978d921(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2449x3c9fad0);
        this.zzv.putParcelable(str, c2449x3c9fad0);
        return this;
    }

    /* renamed from: removeAsset */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19840xecd9b4cc(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "key must not be null");
        this.zzv.remove(str);
        return this;
    }

    /* renamed from: setData */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19841x76491f2c(byte[] bArr) {
        this.f7501x2eefaa = bArr;
        return this;
    }

    /* renamed from: setUrgent */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 m19842x266a2a43() {
        this.zzw = 0L;
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m19843x9616526c() {
        return m19844x9616526c(android.util.Log.isLoggable(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32.TAG, 3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(parcel, "dest must not be null");
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, m19836xb5887636(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 4, this.zzv, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(parcel, 5, m19835xfb7e5820(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 6, this.zzw);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C2474x601f1916(android.net.Uri uri, android.os.Bundle bundle, byte[] bArr, long j17) {
        this.uri = uri;
        this.zzv = bundle;
        bundle.setClassLoader(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2478x98de4436.class.getClassLoader());
        this.f7501x2eefaa = bArr;
        this.zzw = j17;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 zza(android.net.Uri uri) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(uri, "uri must not be null");
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916(uri);
    }

    /* renamed from: toString */
    public java.lang.String m19844x9616526c(boolean z17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PutDataRequest[");
        byte[] bArr = this.f7501x2eefaa;
        java.lang.String valueOf = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 7);
        sb7.append("dataSz=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        int size = this.zzv.size();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(23);
        sb8.append(", numAssets=");
        sb8.append(size);
        sb6.append(sb8.toString());
        java.lang.String valueOf2 = java.lang.String.valueOf(this.uri);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(valueOf2.length() + 6);
        sb9.append(", uri=");
        sb9.append(valueOf2);
        sb6.append(sb9.toString());
        long j17 = this.zzw;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder(35);
        sb10.append(", syncDeadline=");
        sb10.append(j17);
        sb6.append(sb10.toString());
        if (z17) {
            sb6.append("]\n  assets: ");
            for (java.lang.String str2 : this.zzv.keySet()) {
                java.lang.String valueOf3 = java.lang.String.valueOf(this.zzv.getParcelable(str2));
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7 + valueOf3.length());
                sb11.append("\n    ");
                sb11.append(str2);
                sb11.append(": ");
                sb11.append(valueOf3);
                sb6.append(sb11.toString());
            }
            str = "\n  ]";
        } else {
            str = "]";
        }
        sb6.append(str);
        return sb6.toString();
    }
}
