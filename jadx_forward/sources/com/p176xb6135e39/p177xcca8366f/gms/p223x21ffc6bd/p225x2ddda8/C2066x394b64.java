package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzae */
/* loaded from: classes13.dex */
public final class C2066x394b64 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2066x394b64> f6171x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2067x394b65();

    /* renamed from: accountType */
    private final java.lang.String f6172x33a0af07;

    /* renamed from: zzcg */
    private final int f6173x394ba4;
    private final int zzy;

    public C2066x394b64(int i17, java.lang.String str, int i18) {
        this.zzy = 1;
        this.f6172x33a0af07 = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.f6173x394ba4 = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f6172x33a0af07, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, this.f6173x394ba4);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C2066x394b64(java.lang.String str, int i17) {
        this(1, str, i17);
    }
}
