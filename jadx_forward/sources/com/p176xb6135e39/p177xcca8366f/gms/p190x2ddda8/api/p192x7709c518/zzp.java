package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* loaded from: classes13.dex */
public final class zzp implements android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzo createFromParcel(android.os.Parcel parcel) {
        int m18304xfa7642e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18304xfa7642e2(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = 0;
        java.util.ArrayList arrayList = null;
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr zzrVar = null;
        int i18 = 0;
        while (parcel.dataPosition() < m18304xfa7642e2) {
            int m18293xce8f1fc3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18293xce8f1fc3(parcel);
            int m18284xa778f7f = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18284xa778f7f(m18293xce8f1fc3);
            int i19 = 1;
            if (m18284xa778f7f != 1) {
                i19 = 2;
                if (m18284xa778f7f != 2) {
                    i19 = 3;
                    if (m18284xa778f7f != 3) {
                        i19 = 4;
                        if (m18284xa778f7f != 4) {
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18303x9a4a15ef(parcel, m18293xce8f1fc3);
                        } else {
                            zzrVar = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr.f5501x681a0c0c);
                        }
                    } else {
                        i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
                    }
                } else {
                    arrayList = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18281xc7d5128c(parcel, m18293xce8f1fc3, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu.f5508x681a0c0c);
                }
            } else {
                i18 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            }
            hashSet.add(java.lang.Integer.valueOf(i19));
        }
        if (parcel.dataPosition() == m18304xfa7642e2) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzo(hashSet, i18, arrayList, i17, zzrVar);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Overread allowed size end=");
        sb6.append(m18304xfa7642e2);
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException(sb6.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzo[] newArray(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzo[i17];
    }
}
