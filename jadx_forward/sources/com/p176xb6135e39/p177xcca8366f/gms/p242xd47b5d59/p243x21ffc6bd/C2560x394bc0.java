package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzdd */
/* loaded from: classes13.dex */
public final class C2560x394bc0 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2560x394bc0> f7654x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2561x394bc1();

    /* renamed from: data */
    private byte[] f7655x2eefaa;
    private final android.net.Uri uri;

    /* renamed from: zzdo */
    private final java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> f7656x394bcb;

    public C2560x394bc0(android.net.Uri uri, android.os.Bundle bundle, byte[] bArr) {
        this.uri = uri;
        java.util.HashMap hashMap = new java.util.HashMap();
        bundle.setClassLoader(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2478x98de4436.class.getClassLoader());
        for (java.lang.String str : bundle.keySet()) {
            hashMap.put(str, (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2478x98de4436) bundle.getParcelable(str));
        }
        this.f7656x394bcb = hashMap;
        this.f7655x2eefaa = bArr;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: freeze */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo18042xb4843a97() {
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getAssets */
    public final java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> mo19735x11279679() {
        return this.f7656x394bcb;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getData */
    public final byte[] mo19736xfb7e5820() {
        return this.f7655x2eefaa;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getUri */
    public final android.net.Uri mo19737xb5887636() {
        return this.uri;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: isDataValid */
    public final boolean mo18043x300d2c68() {
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: setData */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo19738x76491f2c(byte[] bArr) {
        this.f7655x2eefaa = bArr;
        return this;
    }

    /* renamed from: toString */
    public final java.lang.String m19920x9616526c() {
        java.lang.String str;
        boolean isLoggable = android.util.Log.isLoggable("DataItem", 3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemParcelable[@");
        sb6.append(java.lang.Integer.toHexString(hashCode()));
        byte[] bArr = this.f7655x2eefaa;
        java.lang.String valueOf = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 8);
        sb7.append(",dataSz=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        int size = this.f7656x394bcb.size();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(23);
        sb8.append(", numAssets=");
        sb8.append(size);
        sb6.append(sb8.toString());
        java.lang.String valueOf2 = java.lang.String.valueOf(this.uri);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(valueOf2.length() + 6);
        sb9.append(", uri=");
        sb9.append(valueOf2);
        sb6.append(sb9.toString());
        if (isLoggable) {
            sb6.append("]\n  assets: ");
            for (java.lang.String str2 : this.f7656x394bcb.keySet()) {
                java.lang.String valueOf3 = java.lang.String.valueOf(this.f7656x394bcb.get(str2));
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7 + valueOf3.length());
                sb10.append("\n    ");
                sb10.append(str2);
                sb10.append(": ");
                sb10.append(valueOf3);
                sb6.append(sb10.toString());
            }
            str = "\n  ]";
        } else {
            str = "]";
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, mo19737xb5887636(), i17, false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2478x98de4436.class.getClassLoader());
        for (java.util.Map.Entry<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> entry : this.f7656x394bcb.entrySet()) {
            bundle.putParcelable(entry.getKey(), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2478x98de4436(entry.getValue()));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 4, bundle, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(parcel, 5, mo19736xfb7e5820(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
