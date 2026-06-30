package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* renamed from: com.google.android.gms.auth.AccountChangeEventsResponse */
/* loaded from: classes13.dex */
public class C1634xa9a1a9f7 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1634xa9a1a9f7> f5351x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzf();
    private final int zzh;
    private final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d> zzo;

    public C1634xa9a1a9f7(int i17, java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d> list) {
        this.zzh = i17;
        this.zzo = (java.util.List) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(list);
    }

    /* renamed from: getEvents */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d> m17292x181f040f() {
        return this.zzo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzh);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 2, this.zzo, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1634xa9a1a9f7(java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d> list) {
        this.zzh = 1;
        this.zzo = (java.util.List) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(list);
    }
}
