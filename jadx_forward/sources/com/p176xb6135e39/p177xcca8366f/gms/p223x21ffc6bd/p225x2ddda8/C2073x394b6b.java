package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzal */
/* loaded from: classes13.dex */
public final class C2073x394b6b implements android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2072x394b6a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2072x394b6a createFromParcel(android.os.Parcel parcel) {
        int m18304xfa7642e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18304xfa7642e2(parcel);
        int i17 = 0;
        java.lang.String str = null;
        android.app.PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m18304xfa7642e2) {
            int m18293xce8f1fc3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18293xce8f1fc3(parcel);
            int m18284xa778f7f = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18284xa778f7f(m18293xce8f1fc3);
            if (m18284xa778f7f == 1) {
                i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f == 2) {
                str = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18276x5b8a402d(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f != 3) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18303x9a4a15ef(parcel, m18293xce8f1fc3);
            } else {
                pendingIntent = (android.app.PendingIntent) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, android.app.PendingIntent.CREATOR);
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18283x91a1e0a(parcel, m18304xfa7642e2);
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2072x394b6a(i17, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2072x394b6a[] newArray(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2072x394b6a[i17];
    }
}
