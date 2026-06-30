package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.DeviceMetaData */
/* loaded from: classes13.dex */
public class C1657x96aa87e5 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.C1657x96aa87e5> f5483x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzy();

    /* renamed from: zzcc */
    private boolean f5484x394ba0;

    /* renamed from: zzcd */
    private long f5485x394ba1;

    /* renamed from: zzce */
    private final boolean f5486x394ba2;
    private final int zzy;

    public C1657x96aa87e5(int i17, boolean z17, long j17, boolean z18) {
        this.zzy = i17;
        this.f5484x394ba0 = z17;
        this.f5485x394ba1 = j17;
        this.f5486x394ba2 = z18;
    }

    /* renamed from: getMinAgeOfLockScreen */
    public long m17350xf07b7a91() {
        return this.f5485x394ba1;
    }

    /* renamed from: isChallengeAllowed */
    public boolean m17351x5fc5b50f() {
        return this.f5486x394ba2;
    }

    /* renamed from: isLockScreenSolved */
    public boolean m17352x789179a6() {
        return this.f5484x394ba0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, m17352x789179a6());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 3, m17350xf07b7a91());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 4, m17351x5fc5b50f());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
