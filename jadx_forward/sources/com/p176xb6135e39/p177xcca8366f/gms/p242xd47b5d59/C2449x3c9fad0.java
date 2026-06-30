package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.Asset */
/* loaded from: classes13.dex */
public class C2449x3c9fad0 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0> f7459x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zze();

    /* renamed from: data */
    private byte[] f7460x2eefaa;
    private android.net.Uri uri;
    private java.lang.String zze;
    private android.os.ParcelFileDescriptor zzf;

    public C2449x3c9fad0(byte[] bArr, java.lang.String str, android.os.ParcelFileDescriptor parcelFileDescriptor, android.net.Uri uri) {
        this.f7460x2eefaa = bArr;
        this.zze = str;
        this.zzf = parcelFileDescriptor;
        this.uri = uri;
    }

    /* renamed from: createFromBytes */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 m19627xabe4cd45(byte[] bArr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(bArr);
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0(bArr, null, null, null);
    }

    /* renamed from: createFromFd */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 m19628x453dbe24(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(parcelFileDescriptor);
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0(null, null, parcelFileDescriptor, null);
    }

    /* renamed from: createFromRef */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 m19629x627a33ed(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(str);
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0(null, str, null, null);
    }

    /* renamed from: createFromUri */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 m19630x627a40c6(android.net.Uri uri) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(uri);
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0(null, null, null, uri);
    }

    /* renamed from: equals */
    public boolean m19631xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) obj;
        return java.util.Arrays.equals(this.f7460x2eefaa, c2449x3c9fad0.f7460x2eefaa) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zze, c2449x3c9fad0.zze) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzf, c2449x3c9fad0.zzf) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.uri, c2449x3c9fad0.uri);
    }

    /* renamed from: getData */
    public final byte[] m19632xfb7e5820() {
        return this.f7460x2eefaa;
    }

    /* renamed from: getDigest */
    public java.lang.String m19633x15b3c0ba() {
        return this.zze;
    }

    /* renamed from: getFd */
    public android.os.ParcelFileDescriptor m19634x5db1ab4() {
        return this.zzf;
    }

    /* renamed from: getUri */
    public android.net.Uri m19635xb5887636() {
        return this.uri;
    }

    /* renamed from: hashCode */
    public int m19636x8cdac1b() {
        return java.util.Arrays.deepHashCode(new java.lang.Object[]{this.f7460x2eefaa, this.zze, this.zzf, this.uri});
    }

    /* renamed from: toString */
    public java.lang.String m19637x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Asset[@");
        sb6.append(java.lang.Integer.toHexString(m19636x8cdac1b()));
        if (this.zze == null) {
            str = ", nodigest";
        } else {
            sb6.append(", ");
            str = this.zze;
        }
        sb6.append(str);
        if (this.f7460x2eefaa != null) {
            sb6.append(", size=");
            sb6.append(this.f7460x2eefaa.length);
        }
        if (this.zzf != null) {
            sb6.append(", fd=");
            sb6.append(this.zzf);
        }
        if (this.uri != null) {
            sb6.append(", uri=");
            sb6.append(this.uri);
        }
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(parcel);
        int i18 = i17 | 1;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(parcel, 2, this.f7460x2eefaa, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, m19633x15b3c0ba(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 4, this.zzf, i18, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 5, this.uri, i18, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
