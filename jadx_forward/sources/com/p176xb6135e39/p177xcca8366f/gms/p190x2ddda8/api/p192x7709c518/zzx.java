package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* loaded from: classes13.dex */
public final class zzx implements android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw createFromParcel(android.os.Parcel parcel) {
        int i17;
        int m18304xfa7642e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18304xfa7642e2(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i18 = 0;
        java.lang.String str = null;
        byte[] bArr = null;
        android.app.PendingIntent pendingIntent = null;
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.C1657x96aa87e5 c1657x96aa87e5 = null;
        int i19 = 0;
        while (parcel.dataPosition() < m18304xfa7642e2) {
            int m18293xce8f1fc3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18293xce8f1fc3(parcel);
            switch (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18284xa778f7f(m18293xce8f1fc3)) {
                case 1:
                    i19 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
                    i17 = 1;
                    break;
                case 2:
                    str = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18276x5b8a402d(parcel, m18293xce8f1fc3);
                    i17 = 2;
                    break;
                case 3:
                    i18 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
                    i17 = 3;
                    break;
                case 4:
                    bArr = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18251x2cc26095(parcel, m18293xce8f1fc3);
                    i17 = 4;
                    break;
                case 5:
                    pendingIntent = (android.app.PendingIntent) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, android.app.PendingIntent.CREATOR);
                    i17 = 5;
                    break;
                case 6:
                    c1657x96aa87e5 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.C1657x96aa87e5) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.C1657x96aa87e5.f5483x681a0c0c);
                    i17 = 6;
                    break;
                default:
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18303x9a4a15ef(parcel, m18293xce8f1fc3);
                    continue;
            }
            hashSet.add(java.lang.Integer.valueOf(i17));
        }
        if (parcel.dataPosition() == m18304xfa7642e2) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw(hashSet, i19, str, i18, bArr, pendingIntent, c1657x96aa87e5);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Overread allowed size end=");
        sb6.append(m18304xfa7642e2);
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException(sb6.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw[] newArray(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw[i17];
    }
}
