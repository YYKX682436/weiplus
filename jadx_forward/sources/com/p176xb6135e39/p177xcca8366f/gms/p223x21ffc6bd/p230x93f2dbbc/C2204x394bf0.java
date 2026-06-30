package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzeu */
/* loaded from: classes13.dex */
public final class C2204x394bf0 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0> f6529x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2205x394bf1();

    /* renamed from: name */
    public final java.lang.String f6530x337a8b;

    /* renamed from: origin */
    public final java.lang.String f6531xc3e1af26;

    /* renamed from: zzafq */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed f6532x6f021ac;

    /* renamed from: zzagb */
    public final long f6533x6f021bc;

    public C2204x394bf0(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, long j17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2204x394bf0);
        this.f6530x337a8b = c2204x394bf0.f6530x337a8b;
        this.f6532x6f021ac = c2204x394bf0.f6532x6f021ac;
        this.f6531xc3e1af26 = c2204x394bf0.f6531xc3e1af26;
        this.f6533x6f021bc = j17;
    }

    /* renamed from: toString */
    public final java.lang.String m19084x9616526c() {
        java.lang.String str = this.f6531xc3e1af26;
        java.lang.String str2 = this.f6530x337a8b;
        java.lang.String valueOf = java.lang.String.valueOf(this.f6532x6f021ac);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 21 + java.lang.String.valueOf(str2).length() + valueOf.length());
        sb6.append("origin=");
        sb6.append(str);
        sb6.append(",name=");
        sb6.append(str2);
        sb6.append(",params=");
        sb6.append(valueOf);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f6530x337a8b, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, this.f6532x6f021ac, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, this.f6531xc3e1af26, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 5, this.f6533x6f021bc);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C2204x394bf0(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed, java.lang.String str2, long j17) {
        this.f6530x337a8b = str;
        this.f6532x6f021ac = c2201x394bed;
        this.f6531xc3e1af26 = str2;
        this.f6533x6f021bc = j17;
    }
}
