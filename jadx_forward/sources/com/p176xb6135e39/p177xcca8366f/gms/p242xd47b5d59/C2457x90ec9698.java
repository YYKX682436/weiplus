package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.ConnectionConfiguration */
/* loaded from: classes13.dex */
public class C2457x90ec9698 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2457x90ec9698> f7481x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzg();

    /* renamed from: name */
    private final java.lang.String f7482x337a8b;

    /* renamed from: type */
    private final int f7483x368f3a;
    private final java.lang.String zzi;
    private final int zzj;
    private final boolean zzk;
    private volatile boolean zzl;
    private volatile java.lang.String zzm;
    private boolean zzn;
    private java.lang.String zzo;

    public C2457x90ec9698(java.lang.String str, java.lang.String str2, int i17, int i18, boolean z17, boolean z18, java.lang.String str3, boolean z19, java.lang.String str4) {
        this.f7482x337a8b = str;
        this.zzi = str2;
        this.f7483x368f3a = i17;
        this.zzj = i18;
        this.zzk = z17;
        this.zzl = z18;
        this.zzm = str3;
        this.zzn = z19;
        this.zzo = str4;
    }

    /* renamed from: equals */
    public boolean m19699xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2457x90ec9698)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2457x90ec9698 c2457x90ec9698 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2457x90ec9698) obj;
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f7482x337a8b, c2457x90ec9698.f7482x337a8b) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzi, c2457x90ec9698.zzi) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(java.lang.Integer.valueOf(this.f7483x368f3a), java.lang.Integer.valueOf(c2457x90ec9698.f7483x368f3a)) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(java.lang.Integer.valueOf(this.zzj), java.lang.Integer.valueOf(c2457x90ec9698.zzj)) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(c2457x90ec9698.zzk)) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(java.lang.Boolean.valueOf(this.zzn), java.lang.Boolean.valueOf(c2457x90ec9698.zzn));
    }

    /* renamed from: hashCode */
    public int m19700x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.f7482x337a8b, this.zzi, java.lang.Integer.valueOf(this.f7483x368f3a), java.lang.Integer.valueOf(this.zzj), java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(this.zzn));
    }

    /* renamed from: toString */
    public java.lang.String m19701x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ConnectionConfiguration[ ");
        java.lang.String valueOf = java.lang.String.valueOf(this.f7482x337a8b);
        sb6.append(valueOf.length() != 0 ? "mName=".concat(valueOf) : new java.lang.String("mName="));
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzi);
        sb6.append(valueOf2.length() != 0 ? ", mAddress=".concat(valueOf2) : new java.lang.String(", mAddress="));
        int i17 = this.f7483x368f3a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(19);
        sb7.append(", mType=");
        sb7.append(i17);
        sb6.append(sb7.toString());
        int i18 = this.zzj;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(19);
        sb8.append(", mRole=");
        sb8.append(i18);
        sb6.append(sb8.toString());
        boolean z17 = this.zzk;
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(16);
        sb9.append(", mEnabled=");
        sb9.append(z17);
        sb6.append(sb9.toString());
        boolean z18 = this.zzl;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder(20);
        sb10.append(", mIsConnected=");
        sb10.append(z18);
        sb6.append(sb10.toString());
        java.lang.String valueOf3 = java.lang.String.valueOf(this.zzm);
        sb6.append(valueOf3.length() != 0 ? ", mPeerNodeId=".concat(valueOf3) : new java.lang.String(", mPeerNodeId="));
        boolean z19 = this.zzn;
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder(21);
        sb11.append(", mBtlePriority=");
        sb11.append(z19);
        sb6.append(sb11.toString());
        java.lang.String valueOf4 = java.lang.String.valueOf(this.zzo);
        sb6.append(valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new java.lang.String(", mNodeId="));
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f7482x337a8b, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, this.zzi, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.f7483x368f3a);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 5, this.zzj);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 6, this.zzk);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 7, this.zzl);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 8, this.zzm, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 9, this.zzn);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 10, this.zzo, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
