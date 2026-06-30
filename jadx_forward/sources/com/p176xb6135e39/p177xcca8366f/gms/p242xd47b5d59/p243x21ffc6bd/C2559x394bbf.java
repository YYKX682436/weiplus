package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzdc */
/* loaded from: classes13.dex */
public final class C2559x394bbf implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd {

    /* renamed from: data */
    private byte[] f7652x2eefaa;
    private android.net.Uri uri;

    /* renamed from: zzdo */
    private java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> f7653x394bcb;

    public C2559x394bbf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd interfaceC2462x6e785dfd) {
        this.uri = interfaceC2462x6e785dfd.mo19737xb5887636();
        this.f7652x2eefaa = interfaceC2462x6e785dfd.mo19736xfb7e5820();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> entry : interfaceC2462x6e785dfd.mo19735x11279679().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put(entry.getKey(), entry.getValue().mo18042xb4843a97());
            }
        }
        this.f7653x394bcb = java.util.Collections.unmodifiableMap(hashMap);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: freeze */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo18042xb4843a97() {
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getAssets */
    public final java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> mo19735x11279679() {
        return this.f7653x394bcb;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getData */
    public final byte[] mo19736xfb7e5820() {
        return this.f7652x2eefaa;
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
    public final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo19738x76491f2c(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: toString */
    public final java.lang.String m19918x9616526c() {
        boolean isLoggable = android.util.Log.isLoggable("DataItem", 3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemEntity{ ");
        java.lang.String valueOf = java.lang.String.valueOf(this.uri);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 4);
        sb7.append("uri=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        byte[] bArr = this.f7652x2eefaa;
        java.lang.String valueOf2 = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(valueOf2.length() + 9);
        sb8.append(", dataSz=");
        sb8.append(valueOf2);
        sb6.append(sb8.toString());
        int size = this.f7653x394bcb.size();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(23);
        sb9.append(", numAssets=");
        sb9.append(size);
        sb6.append(sb9.toString());
        if (isLoggable && !this.f7653x394bcb.isEmpty()) {
            sb6.append(", assets=[");
            java.lang.String str = "";
            for (java.util.Map.Entry<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> entry : this.f7653x394bcb.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String mo19740x5db1b11 = entry.getValue().mo19740x5db1b11();
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(str.length() + 2 + java.lang.String.valueOf(key).length() + java.lang.String.valueOf(mo19740x5db1b11).length());
                sb10.append(str);
                sb10.append(key);
                sb10.append(": ");
                sb10.append(mo19740x5db1b11);
                sb6.append(sb10.toString());
                str = ", ";
            }
            sb6.append("]");
        }
        sb6.append(" }");
        return sb6.toString();
    }
}
