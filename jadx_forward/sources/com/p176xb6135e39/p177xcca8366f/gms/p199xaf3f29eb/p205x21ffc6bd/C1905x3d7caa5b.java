package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.ConnectionTelemetryConfiguration */
/* loaded from: classes13.dex */
public class C1905x3d7caa5b extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1905x3d7caa5b> f5935x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzm();
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final int zze;
    private final int[] zzf;

    public C1905x3d7caa5b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f c1927xe804295f, boolean z17, boolean z18, int[] iArr, int i17, int[] iArr2) {
        this.zza = c1927xe804295f;
        this.zzb = z17;
        this.zzc = z18;
        this.zzd = iArr;
        this.zze = i17;
        this.zzf = iArr2;
    }

    /* renamed from: getMaxMethodInvocationsLogged */
    public int m18148xd854e056() {
        return this.zze;
    }

    /* renamed from: getMethodInvocationMethodKeyAllowlist */
    public int[] m18149xc9a63f70() {
        return this.zzd;
    }

    /* renamed from: getMethodInvocationMethodKeyDisallowlist */
    public int[] m18150xa7e1a1f0() {
        return this.zzf;
    }

    /* renamed from: getMethodInvocationTelemetryEnabled */
    public boolean m18151xfbf28b2f() {
        return this.zzb;
    }

    /* renamed from: getMethodTimingTelemetryEnabled */
    public boolean m18152x24718269() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 1, this.zza, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, m18151xfbf28b2f());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 3, m18152x24718269());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18337xb1f6f4a9(parcel, 4, m18149xc9a63f70(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 5, m18148xd854e056());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18337xb1f6f4a9(parcel, 6, m18150xa7e1a1f0(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f zza() {
        return this.zza;
    }
}
