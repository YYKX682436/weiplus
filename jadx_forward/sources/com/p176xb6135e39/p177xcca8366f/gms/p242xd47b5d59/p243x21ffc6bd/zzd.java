package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzd extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzd> f7647x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zze();

    /* renamed from: zzaz */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8 f7648x394b79;

    /* renamed from: zzba */
    private final android.content.IntentFilter[] f7649x394b7f;

    /* renamed from: zzbb */
    private final java.lang.String f7650x394b80;

    /* renamed from: zzbc */
    private final java.lang.String f7651x394b81;

    public zzd(android.os.IBinder iBinder, android.content.IntentFilter[] intentFilterArr, java.lang.String str, java.lang.String str2) {
        if (iBinder != null) {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f7648x394b79 = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8 ? (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2597x394bea(iBinder);
        } else {
            this.f7648x394b79 = null;
        }
        this.f7649x394b7f = intentFilterArr;
        this.f7650x394b80 = str;
        this.f7651x394b81 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8 interfaceC2595x394be8 = this.f7648x394b79;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18332xcaa5c694(parcel, 2, interfaceC2595x394be8 == null ? null : interfaceC2595x394be8.asBinder(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18359xa472054e(parcel, 3, this.f7649x394b7f, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, this.f7650x394b80, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 5, this.f7651x394b81, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public zzd(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43 binderC2671x394c43) {
        this.f7648x394b79 = binderC2671x394c43;
        this.f7649x394b7f = binderC2671x394c43.zze();
        this.f7650x394b80 = binderC2671x394c43.zzf();
        this.f7651x394b81 = null;
    }
}
