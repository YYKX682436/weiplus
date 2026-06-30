package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzfe */
/* loaded from: classes13.dex */
public final class C2613x394bff extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2613x394bff> f7722x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2614x394c00();

    /* renamed from: data */
    private final byte[] f7723x2eefaa;

    /* renamed from: zzcl */
    private final java.lang.String f7724x394ba9;

    /* renamed from: zzeh */
    private final int f7725x394be3;

    /* renamed from: zzek */
    private final java.lang.String f7726x394be6;

    public C2613x394bff(int i17, java.lang.String str, byte[] bArr, java.lang.String str2) {
        this.f7725x394be3 = i17;
        this.f7724x394ba9 = str;
        this.f7723x2eefaa = bArr;
        this.f7726x394be6 = str2;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3
    /* renamed from: getData */
    public final byte[] mo19808xfb7e5820() {
        return this.f7723x2eefaa;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3
    /* renamed from: getPath */
    public final java.lang.String mo19809xfb83cc9b() {
        return this.f7724x394ba9;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3
    /* renamed from: getRequestId */
    public final int mo19810x28ca0554() {
        return this.f7725x394be3;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3
    /* renamed from: getSourceNodeId */
    public final java.lang.String mo19811xa742652e() {
        return this.f7726x394be6;
    }

    /* renamed from: toString */
    public final java.lang.String m19939x9616526c() {
        int i17 = this.f7725x394be3;
        java.lang.String str = this.f7724x394ba9;
        byte[] bArr = this.f7723x2eefaa;
        java.lang.String valueOf = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 43 + valueOf.length());
        sb6.append("MessageEventParcelable[");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(str);
        sb6.append(", size=");
        sb6.append(valueOf);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, mo19810x28ca0554());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, mo19809xfb83cc9b(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(parcel, 4, mo19808xfb7e5820(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 5, mo19811xa742652e(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
