package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf;

/* renamed from: com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse */
/* loaded from: classes13.dex */
public class C1961xa52f0b68 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1961xa52f0b68> f5963x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.zaa();
    private final boolean zaa;
    private final int zab;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse$AvailabilityStatus */
    /* loaded from: classes6.dex */
    public @interface AvailabilityStatus {

        /* renamed from: STATUS_ALREADY_AVAILABLE */
        public static final int f5964x7b194055 = 0;

        /* renamed from: STATUS_READY_TO_DOWNLOAD */
        public static final int f5965xdfb6e203 = 1;

        /* renamed from: STATUS_UNKNOWN_MODULE */
        public static final int f5966xf110c40e = 2;
    }

    public C1961xa52f0b68(boolean z17, int i17) {
        this.zaa = z17;
        this.zab = i17;
    }

    /* renamed from: areModulesAvailable */
    public boolean m18414x5aefa176() {
        return this.zaa;
    }

    /* renamed from: getAvailabilityStatus */
    public int m18415x43528323() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 1, m18414x5aefa176());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, m18415x43528323());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
