package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* renamed from: com.google.android.gms.auth.AccountChangeEvent */
/* loaded from: classes13.dex */
public class C1632x7ecee87d extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d> f5349x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzd();
    private final int zzh;
    private final long zzi;
    private final java.lang.String zzj;
    private final int zzk;
    private final int zzl;
    private final java.lang.String zzm;

    public C1632x7ecee87d(int i17, long j17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        this.zzh = i17;
        this.zzi = j17;
        this.zzj = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.zzk = i18;
        this.zzl = i19;
        this.zzm = str2;
    }

    /* renamed from: equals */
    public boolean m17277xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d) {
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d c1632x7ecee87d = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d) obj;
            if (this.zzh == c1632x7ecee87d.zzh && this.zzi == c1632x7ecee87d.zzi && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzj, c1632x7ecee87d.zzj) && this.zzk == c1632x7ecee87d.zzk && this.zzl == c1632x7ecee87d.zzl && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzm, c1632x7ecee87d.zzm)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getAccountName */
    public java.lang.String m17278xd73e122() {
        return this.zzj;
    }

    /* renamed from: getChangeData */
    public java.lang.String m17279x6f26d770() {
        return this.zzm;
    }

    /* renamed from: getChangeType */
    public int m17280x6f2e7700() {
        return this.zzk;
    }

    /* renamed from: getEventIndex */
    public int m17281x27b40e4e() {
        return this.zzl;
    }

    /* renamed from: hashCode */
    public int m17282x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(java.lang.Integer.valueOf(this.zzh), java.lang.Long.valueOf(this.zzi), this.zzj, java.lang.Integer.valueOf(this.zzk), java.lang.Integer.valueOf(this.zzl), this.zzm);
    }

    /* renamed from: toString */
    public java.lang.String m17283x9616526c() {
        int i17 = this.zzk;
        java.lang.String str = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        java.lang.String str2 = this.zzj;
        java.lang.String str3 = this.zzm;
        int i18 = this.zzl;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 91 + str.length() + java.lang.String.valueOf(str3).length());
        sb6.append("AccountChangeEvent {accountName = ");
        sb6.append(str2);
        sb6.append(", changeType = ");
        sb6.append(str);
        sb6.append(", changeData = ");
        sb6.append(str3);
        sb6.append(", eventIndex = ");
        sb6.append(i18);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzh);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 2, this.zzi);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, this.zzj, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.zzk);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 5, this.zzl);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 6, this.zzm, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1632x7ecee87d(long j17, java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.zzh = 1;
        this.zzi = j17;
        this.zzj = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.zzk = i17;
        this.zzl = i18;
        this.zzm = str2;
    }
}
