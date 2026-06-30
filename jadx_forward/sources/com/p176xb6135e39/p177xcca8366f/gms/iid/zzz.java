package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
abstract class zzz<T> {

    /* renamed from: what */
    final int f6167x37aac4;

    /* renamed from: zzck */
    final int f6168x394ba8;

    /* renamed from: zzcl */
    final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<T> f6169x394ba9 = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<>();

    /* renamed from: zzcm */
    final android.os.Bundle f6170x394baa;

    public zzz(int i17, int i18, android.os.Bundle bundle) {
        this.f6168x394ba8 = i17;
        this.f6167x37aac4 = i18;
        this.f6170x394baa = bundle;
    }

    /* renamed from: toString */
    public java.lang.String m18779x9616526c() {
        int i17 = this.f6167x37aac4;
        int i18 = this.f6168x394ba8;
        zzu();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(55);
        sb6.append("Request { what=");
        sb6.append(i17);
        sb6.append(" id=");
        sb6.append(i18);
        sb6.append(" oneWay=false}");
        return sb6.toString();
    }

    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.iid.C2051x394b60 c2051x394b60) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this).length() + 14 + java.lang.String.valueOf(c2051x394b60).length());
        }
        this.f6169x394ba9.m19603xb411020d(c2051x394b60);
    }

    public abstract void zzh(android.os.Bundle bundle);

    public abstract boolean zzu();
}
