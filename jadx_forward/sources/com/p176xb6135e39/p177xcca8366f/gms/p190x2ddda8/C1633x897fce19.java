package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* renamed from: com.google.android.gms.auth.AccountChangeEventsRequest */
/* loaded from: classes13.dex */
public class C1633x897fce19 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1633x897fce19> f5350x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zze();
    private final int zzh;

    @java.lang.Deprecated
    private java.lang.String zzj;
    private int zzl;
    private android.accounts.Account zzn;

    public C1633x897fce19() {
        this.zzh = 1;
    }

    /* renamed from: getAccount */
    public android.accounts.Account m17285xf7a0c5f7() {
        return this.zzn;
    }

    @java.lang.Deprecated
    /* renamed from: getAccountName */
    public java.lang.String m17286xd73e122() {
        return this.zzj;
    }

    /* renamed from: getEventIndex */
    public int m17287x27b40e4e() {
        return this.zzl;
    }

    /* renamed from: setAccount */
    public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1633x897fce19 m17288x6b12136b(android.accounts.Account account) {
        this.zzn = account;
        return this;
    }

    @java.lang.Deprecated
    /* renamed from: setAccountName */
    public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1633x897fce19 m17289xa3d95496(java.lang.String str) {
        this.zzj = str;
        return this;
    }

    /* renamed from: setEventIndex */
    public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1633x897fce19 m17290x55d85c5a(int i17) {
        this.zzl = i17;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzh);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, this.zzl);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, this.zzj, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 4, this.zzn, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1633x897fce19(int i17, int i18, java.lang.String str, android.accounts.Account account) {
        this.zzh = i17;
        this.zzl = i18;
        this.zzj = str;
        if (account != null || android.text.TextUtils.isEmpty(str)) {
            this.zzn = account;
        } else {
            this.zzn = new android.accounts.Account(str, "com.google");
        }
    }
}
