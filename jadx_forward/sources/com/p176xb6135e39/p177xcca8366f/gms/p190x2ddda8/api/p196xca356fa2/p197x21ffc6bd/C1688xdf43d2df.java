package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* renamed from: com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable */
/* loaded from: classes13.dex */
public class C1688xdf43d2df extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1688xdf43d2df> f5681x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zaa();
    final int zaa;
    private int zab;
    private android.os.Bundle zac;

    public C1688xdf43d2df(int i17, int i18, android.os.Bundle bundle) {
        this.zaa = i17;
        this.zab = i18;
        this.zac = bundle;
    }

    /* renamed from: getType */
    public int m17544xfb85f7b0() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zaa);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, m17544xfb85f7b0());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 3, this.zac, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1688xdf43d2df(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1683xbf7cf0dc interfaceC1683xbf7cf0dc) {
        this(1, interfaceC1683xbf7cf0dc.m17534x208ea463(), interfaceC1683xbf7cf0dc.m17536x792022dd());
    }
}
