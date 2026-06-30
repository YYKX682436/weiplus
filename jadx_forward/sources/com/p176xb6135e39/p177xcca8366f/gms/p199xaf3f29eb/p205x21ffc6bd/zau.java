package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zau implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int m18304xfa7642e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18304xfa7642e2(parcel);
        android.accounts.Account account = null;
        int i17 = 0;
        int i18 = 0;
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632 = null;
        while (parcel.dataPosition() < m18304xfa7642e2) {
            int m18293xce8f1fc3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18293xce8f1fc3(parcel);
            int m18284xa778f7f = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18284xa778f7f(m18293xce8f1fc3);
            if (m18284xa778f7f == 1) {
                i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f == 2) {
                account = (android.accounts.Account) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, android.accounts.Account.CREATOR);
            } else if (m18284xa778f7f == 3) {
                i18 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3);
            } else if (m18284xa778f7f != 4) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18303x9a4a15ef(parcel, m18293xce8f1fc3);
            } else {
                c1679x69269632 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18272xe4a6daff(parcel, m18293xce8f1fc3, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632.f5658x681a0c0c);
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18283x91a1e0a(parcel, m18304xfa7642e2);
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zat(i17, account, i18, c1679x69269632);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zat[i17];
    }
}
