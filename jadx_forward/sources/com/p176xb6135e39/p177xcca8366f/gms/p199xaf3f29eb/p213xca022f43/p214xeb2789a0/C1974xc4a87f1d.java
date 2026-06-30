package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0;

/* renamed from: com.google.android.gms.common.server.converter.StringToIntConverter */
/* loaded from: classes13.dex */
public final class C1974xc4a87f1d extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter<java.lang.String, java.lang.Integer> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d> f5985x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zad();
    final int zaa;
    private final java.util.HashMap zab;
    private final android.util.SparseArray zac;

    public C1974xc4a87f1d() {
        this.zaa = 1;
        this.zab = new java.util.HashMap();
        this.zac = new android.util.SparseArray();
    }

    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.C1974xc4a87f1d add(java.lang.String str, int i17) {
        this.zab.put(str, java.lang.Integer.valueOf(i17));
        this.zac.put(i17, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zab.keySet()) {
            arrayList.add(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zac(str, ((java.lang.Integer) this.zab.get(str)).intValue()));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 2, arrayList, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter
    public final /* bridge */ /* synthetic */ java.lang.Object zac(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.zab.get((java.lang.String) obj);
        return num == null ? (java.lang.Integer) this.zab.get("gms_unknown") : num;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter
    public final /* bridge */ /* synthetic */ java.lang.Object zad(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) this.zac.get(((java.lang.Integer) obj).intValue());
        return (str == null && this.zab.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public C1974xc4a87f1d(int i17, java.util.ArrayList arrayList) {
        this.zaa = i17;
        this.zab = new java.util.HashMap();
        this.zac = new android.util.SparseArray();
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zac zacVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zac) arrayList.get(i18);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
