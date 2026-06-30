package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.RootTelemetryConfiguration */
/* loaded from: classes13.dex */
public class C1927xe804295f extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f> f5945x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1956x394b69();
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;

    public C1927xe804295f(int i17, boolean z17, boolean z18, int i18, int i19) {
        this.zza = i17;
        this.zzb = z17;
        this.zzc = z18;
        this.zzd = i18;
        this.zze = i19;
    }

    /* renamed from: getBatchPeriodMillis */
    public int m18228x9e61930b() {
        return this.zzd;
    }

    /* renamed from: getMaxMethodInvocationsInBatch */
    public int m18229x8fd3b8c1() {
        return this.zze;
    }

    /* renamed from: getMethodInvocationTelemetryEnabled */
    public boolean m18230xfbf28b2f() {
        return this.zzb;
    }

    /* renamed from: getMethodTimingTelemetryEnabled */
    public boolean m18231x24718269() {
        return this.zzc;
    }

    /* renamed from: getVersion */
    public int m18232x52c258a2() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, m18232x52c258a2());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, m18230xfbf28b2f());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 3, m18231x24718269());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, m18228x9e61930b());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 5, m18229x8fd3b8c1());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
