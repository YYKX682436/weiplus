package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* loaded from: classes13.dex */
public final class zzv implements android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu createFromParcel(android.os.Parcel parcel) {
        int m18304xfa7642e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18304xfa7642e2(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw zzwVar = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        int i17 = 0;
        while (parcel.dataPosition() < m18304xfa7642e2) {
            int m18293xce8f1fc3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18293xce8f1fc3(parcel);
            int m18284xa778f7f = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18284xa778f7f(m18293xce8f1fc3);
            int i18 = 1;
            if (m18284xa778f7f != 1) {
                i18 = 2;
                if (m18284xa778f7f != 2) {
                    i18 = 3;
                    if (m18284xa778f7f != 3) {
                        i18 = 4;
                        if (m18284xa778f7f != 4) {
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18303x9a4a15ef(parcel, m18293xce8f1fc3);
                        } else {
                            str2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18276x5b8a402d(parcel, m18293xce8f1fc3);
                        }
                    } else {
                        str = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18276x5b8a402d(parcel, m18293xce8f1fc3);
                    }
                } else {
                    zzwVar = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw.f5514x681a0c0c);
                }
            } else {
                i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            }
            hashSet.add(java.lang.Integer.valueOf(i18));
        }
        if (parcel.dataPosition() == m18304xfa7642e2) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu(hashSet, i17, zzwVar, str, str2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Overread allowed size end=");
        sb6.append(m18304xfa7642e2);
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException(sb6.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu[] newArray(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu[i17];
    }
}
