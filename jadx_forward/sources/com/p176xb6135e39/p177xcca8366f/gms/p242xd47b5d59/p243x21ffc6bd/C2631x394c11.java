package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzfw */
/* loaded from: classes13.dex */
public final class C2631x394c11 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2631x394c11> f7747x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2632x394c12();

    /* renamed from: versionCode */
    private final int f7748x290b12e5;

    /* renamed from: zzaz */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8 f7749x394b79;

    public C2631x394c11(int i17, android.os.IBinder iBinder) {
        this.f7748x290b12e5 = i17;
        if (iBinder == null) {
            this.f7749x394b79 = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f7749x394b79 = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8 ? (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2597x394bea(iBinder);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.f7748x290b12e5);
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8 interfaceC2595x394be8 = this.f7749x394b79;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18332xcaa5c694(parcel, 2, interfaceC2595x394be8 == null ? null : interfaceC2595x394be8.asBinder(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C2631x394c11(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8 interfaceC2595x394be8) {
        this.f7748x290b12e5 = 1;
        this.f7749x394b79 = interfaceC2595x394be8;
    }
}
