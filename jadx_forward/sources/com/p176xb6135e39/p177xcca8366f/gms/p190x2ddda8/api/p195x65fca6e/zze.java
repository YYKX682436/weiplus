package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e;

/* loaded from: classes13.dex */
public final class zze implements android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af createFromParcel(android.os.Parcel parcel) {
        int m18304xfa7642e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18304xfa7642e2(parcel);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        android.app.PendingIntent pendingIntent = null;
        android.os.Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m18304xfa7642e2) {
            int m18293xce8f1fc3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18293xce8f1fc3(parcel);
            int m18284xa778f7f = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18284xa778f7f(m18293xce8f1fc3);
            if (m18284xa778f7f == 1) {
                i18 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f == 2) {
                pendingIntent = (android.app.PendingIntent) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, android.app.PendingIntent.CREATOR);
            } else if (m18284xa778f7f == 3) {
                i19 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f == 4) {
                bundle = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18250x3e94109e(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f == 5) {
                bArr = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18251x2cc26095(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f != 1000) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18303x9a4a15ef(parcel, m18293xce8f1fc3);
            } else {
                i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18283x91a1e0a(parcel, m18304xfa7642e2);
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af(i17, i18, pendingIntent, i19, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af[] newArray(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af[i17];
    }
}
