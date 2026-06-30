package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0;

/* loaded from: classes13.dex */
public final class zaa extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zaa> f5986x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zab();
    final int zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d zab;

    public zaa(int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d c1974xc4a87f1d) {
        this.zaa = i17;
        this.zab = c1974xc4a87f1d;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zaa zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter fieldConverter) {
        if (fieldConverter instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zaa((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d) fieldConverter);
        }
        throw new java.lang.IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, this.zab, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter zab() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d c1974xc4a87f1d = this.zab;
        if (c1974xc4a87f1d != null) {
            return c1974xc4a87f1d;
        }
        throw new java.lang.IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    private zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d c1974xc4a87f1d) {
        this.zaa = 1;
        this.zab = c1974xc4a87f1d;
    }
}
