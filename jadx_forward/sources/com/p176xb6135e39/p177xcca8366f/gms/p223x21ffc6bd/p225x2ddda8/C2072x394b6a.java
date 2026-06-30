package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzak */
/* loaded from: classes13.dex */
public final class C2072x394b6a extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2072x394b6a> f6179x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2073x394b6b();

    /* renamed from: accountType */
    private final java.lang.String f6180x33a0af07;

    /* renamed from: zzch */
    private final android.app.PendingIntent f6181x394ba5;
    private final int zzy;

    public C2072x394b6a(int i17, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this.zzy = 1;
        this.f6180x33a0af07 = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.f6181x394ba5 = (android.app.PendingIntent) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f6180x33a0af07, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, this.f6181x394ba5, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C2072x394b6a(java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
