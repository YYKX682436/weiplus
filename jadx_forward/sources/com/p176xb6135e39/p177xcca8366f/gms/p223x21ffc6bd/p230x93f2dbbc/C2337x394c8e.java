package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzjx */
/* loaded from: classes13.dex */
public final class C2337x394c8e extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> f7020x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2338x394c8f();

    /* renamed from: name */
    public final java.lang.String f7021x337a8b;

    /* renamed from: origin */
    public final java.lang.String f7022xc3e1af26;

    /* renamed from: versionCode */
    private final int f7023x290b12e5;

    /* renamed from: zzajf */
    private final java.lang.String f7024x6f0221d;

    /* renamed from: zzaqz */
    public final long f7025x6f0230a;

    /* renamed from: zzara */
    private final java.lang.Long f7026x6f02310;

    /* renamed from: zzarb */
    private final java.lang.Float f7027x6f02311;

    /* renamed from: zzarc */
    private final java.lang.Double f7028x6f02312;

    public C2337x394c8e(int i17, java.lang.String str, long j17, java.lang.Long l17, java.lang.Float f17, java.lang.String str2, java.lang.String str3, java.lang.Double d17) {
        this.f7023x290b12e5 = i17;
        this.f7021x337a8b = str;
        this.f7025x6f0230a = j17;
        this.f7026x6f02310 = l17;
        this.f7027x6f02311 = null;
        if (i17 == 1) {
            this.f7028x6f02312 = f17 != null ? java.lang.Double.valueOf(f17.doubleValue()) : null;
        } else {
            this.f7028x6f02312 = d17;
        }
        this.f7024x6f0221d = str2;
        this.f7022xc3e1af26 = str3;
    }

    /* renamed from: getValue */
    public final java.lang.Object m19277x754a37bb() {
        java.lang.Long l17 = this.f7026x6f02310;
        if (l17 != null) {
            return l17;
        }
        java.lang.Double d17 = this.f7028x6f02312;
        if (d17 != null) {
            return d17;
        }
        java.lang.String str = this.f7024x6f0221d;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.f7023x290b12e5);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f7021x337a8b, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 3, this.f7025x6f0230a);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18344xaf7bb21a(parcel, 4, this.f7026x6f02310, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18330x8f2b7b5c(parcel, 5, null, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 6, this.f7024x6f0221d, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 7, this.f7022xc3e1af26, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18325x7f70ffef(parcel, 8, this.f7028x6f02312, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C2337x394c8e(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90) {
        this(c2339x394c90.f7029x337a8b, c2339x394c90.f7032x6f0230a, c2339x394c90.f7031x6ac9171, c2339x394c90.f7030xc3e1af26);
    }

    public C2337x394c8e(java.lang.String str, long j17, java.lang.Object obj, java.lang.String str2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f7023x290b12e5 = 2;
        this.f7021x337a8b = str;
        this.f7025x6f0230a = j17;
        this.f7022xc3e1af26 = str2;
        if (obj == null) {
            this.f7026x6f02310 = null;
            this.f7027x6f02311 = null;
            this.f7028x6f02312 = null;
            this.f7024x6f0221d = null;
            return;
        }
        if (obj instanceof java.lang.Long) {
            this.f7026x6f02310 = (java.lang.Long) obj;
            this.f7027x6f02311 = null;
            this.f7028x6f02312 = null;
            this.f7024x6f0221d = null;
            return;
        }
        if (obj instanceof java.lang.String) {
            this.f7026x6f02310 = null;
            this.f7027x6f02311 = null;
            this.f7028x6f02312 = null;
            this.f7024x6f0221d = (java.lang.String) obj;
            return;
        }
        if (!(obj instanceof java.lang.Double)) {
            throw new java.lang.IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f7026x6f02310 = null;
        this.f7027x6f02311 = null;
        this.f7028x6f02312 = (java.lang.Double) obj;
        this.f7024x6f0221d = null;
    }
}
