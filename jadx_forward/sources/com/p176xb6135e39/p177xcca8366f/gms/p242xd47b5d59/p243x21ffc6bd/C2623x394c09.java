package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzfo */
/* loaded from: classes13.dex */
public final class C2623x394c09 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09> f7732x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2624x394c0a();

    /* renamed from: zzbk */
    private final java.lang.String f7733x394b89;

    /* renamed from: zzdm */
    private final java.lang.String f7734x394bc9;

    /* renamed from: zzen */
    private final int f7735x394be9;

    /* renamed from: zzeo */
    private final boolean f7736x394bea;

    public C2623x394c09(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        this.f7734x394bc9 = str;
        this.f7733x394b89 = str2;
        this.f7735x394be9 = i17;
        this.f7736x394bea = z17;
    }

    /* renamed from: equals */
    public final boolean m19943xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09) {
            return ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09) obj).f7734x394bc9.equals(this.f7734x394bc9);
        }
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222
    /* renamed from: getDisplayName */
    public final java.lang.String mo19812x40021d37() {
        return this.f7733x394b89;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222
    /* renamed from: getId */
    public final java.lang.String mo19813x5db1b11() {
        return this.f7734x394bc9;
    }

    /* renamed from: hashCode */
    public final int m19944x8cdac1b() {
        return this.f7734x394bc9.hashCode();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222
    /* renamed from: isNearby */
    public final boolean mo19814xe99f1c49() {
        return this.f7736x394bea;
    }

    /* renamed from: toString */
    public final java.lang.String m19945x9616526c() {
        java.lang.String str = this.f7733x394b89;
        java.lang.String str2 = this.f7734x394bc9;
        int i17 = this.f7735x394be9;
        boolean z17 = this.f7736x394bea;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 45 + java.lang.String.valueOf(str2).length());
        sb6.append("Node{");
        sb6.append(str);
        sb6.append(", id=");
        sb6.append(str2);
        sb6.append(", hops=");
        sb6.append(i17);
        sb6.append(", isNearby=");
        sb6.append(z17);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, mo19813x5db1b11(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, mo19812x40021d37(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.f7735x394be9);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 5, mo19814xe99f1c49());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
