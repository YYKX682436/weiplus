package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzdf */
/* loaded from: classes13.dex */
public final class C2562x394bc2 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1885xc7aea389 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd {

    /* renamed from: zzdl */
    private final int f7657x394bc8;

    public C2562x394bc2(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16, int i17, int i18) {
        super(c1888xafe09e16, i17);
        this.f7657x394bc8 = i18;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8
    /* renamed from: freeze */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo18042xb4843a97() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2559x394bbf(this);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getAssets */
    public final java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> mo19735x11279679() {
        java.util.HashMap hashMap = new java.util.HashMap(this.f7657x394bc8);
        for (int i17 = 0; i17 < this.f7657x394bc8; i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2558x394bbe c2558x394bbe = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2558x394bbe(this.f5916x1540ba43, this.f5917xf41deca3 + i17);
            if (c2558x394bbe.mo19739xffaf4a0c() != null) {
                hashMap.put(c2558x394bbe.mo19739xffaf4a0c(), c2558x394bbe);
            }
        }
        return hashMap;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getData */
    public final byte[] mo19736xfb7e5820() {
        return m18001x8383f77b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: getUri */
    public final android.net.Uri mo19737xb5887636() {
        return android.net.Uri.parse(m18007x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd
    /* renamed from: setData */
    public final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo19738x76491f2c(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: toString */
    public final java.lang.String m19921x9616526c() {
        boolean isLoggable = android.util.Log.isLoggable("DataItem", 3);
        byte[] mo19736xfb7e5820 = mo19736xfb7e5820();
        java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> mo19735x11279679 = mo19735x11279679();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemRef{ ");
        java.lang.String valueOf = java.lang.String.valueOf(mo19737xb5887636());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 4);
        sb7.append("uri=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        java.lang.String valueOf2 = java.lang.String.valueOf(mo19736xfb7e5820 == null ? "null" : java.lang.Integer.valueOf(mo19736xfb7e5820.length));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(valueOf2.length() + 9);
        sb8.append(", dataSz=");
        sb8.append(valueOf2);
        sb6.append(sb8.toString());
        int size = mo19735x11279679.size();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(23);
        sb9.append(", numAssets=");
        sb9.append(size);
        sb6.append(sb9.toString());
        if (isLoggable && !mo19735x11279679.isEmpty()) {
            sb6.append(", assets=[");
            java.lang.String str = "";
            for (java.util.Map.Entry<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3> entry : mo19735x11279679.entrySet()) {
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
