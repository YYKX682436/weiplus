package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf;

/* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallResponse */
/* loaded from: classes13.dex */
public class C1966xb0eb0ed0 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1966xb0eb0ed0> f5968x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.zad();
    private final int zaa;
    private final boolean zab;

    public C1966xb0eb0ed0(int i17) {
        this(i17, false);
    }

    /* renamed from: areModulesAlreadyInstalled */
    public boolean m18435xd96d06b5() {
        return this.zaa == 0;
    }

    /* renamed from: getSessionId */
    public int m18436x23a7af9b() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, m18436x23a7af9b());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, this.zab);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final boolean zaa() {
        return this.zab;
    }

    public C1966xb0eb0ed0(int i17, boolean z17) {
        this.zaa = i17;
        this.zab = z17;
    }
}
