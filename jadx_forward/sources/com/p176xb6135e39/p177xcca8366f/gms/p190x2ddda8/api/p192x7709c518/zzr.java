package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* loaded from: classes13.dex */
public class zzr extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.AbstractC2106x394b91 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr> f5501x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzs();

    /* renamed from: zzbp */
    private static final x.b f5502x394b8e;

    /* renamed from: zzbq */
    private java.util.List<java.lang.String> f5503x394b8f;

    /* renamed from: zzbr */
    private java.util.List<java.lang.String> f5504x394b90;

    /* renamed from: zzbs */
    private java.util.List<java.lang.String> f5505x394b91;

    /* renamed from: zzbt */
    private java.util.List<java.lang.String> f5506x394b92;

    /* renamed from: zzbu */
    private java.util.List<java.lang.String> f5507x394b93;
    private final int zzy;

    static {
        x.b bVar = new x.b();
        f5502x394b8e = bVar;
        bVar.put("registered", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18476xd4446979("registered", 2));
        bVar.put("in_progress", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18476xd4446979("in_progress", 3));
        bVar.put(ya.b.f77504xbb80cbe3, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18476xd4446979(ya.b.f77504xbb80cbe3, 4));
        bVar.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18476xd4446979(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, 5));
        bVar.put("escrowed", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18476xd4446979("escrowed", 6));
    }

    public zzr() {
        this.zzy = 1;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldMappings */
    public java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> mo17356xb4d428c9() {
        return f5502x394b8e;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldValue */
    public java.lang.Object mo17357x101b448d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        switch (field.m18478x1fb0b8f()) {
            case 1:
                return java.lang.Integer.valueOf(this.zzy);
            case 2:
                return this.f5503x394b8f;
            case 3:
                return this.f5504x394b90;
            case 4:
                return this.f5505x394b91;
            case 5:
                return this.f5506x394b92;
            case 6:
                return this.f5507x394b93;
            default:
                int m18478x1fb0b8f = field.m18478x1fb0b8f();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
                sb6.append("Unknown SafeParcelable id=");
                sb6.append(m18478x1fb0b8f);
                throw new java.lang.IllegalStateException(sb6.toString());
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: isFieldSet */
    public boolean mo17358x9957f052(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setStringsInternal */
    public void mo17360x33e7969d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f == 2) {
            this.f5503x394b8f = arrayList;
            return;
        }
        if (m18478x1fb0b8f == 3) {
            this.f5504x394b90 = arrayList;
            return;
        }
        if (m18478x1fb0b8f == 4) {
            this.f5505x394b91 = arrayList;
        } else if (m18478x1fb0b8f == 5) {
            this.f5506x394b92 = arrayList;
        } else {
            if (m18478x1fb0b8f != 6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string list.", java.lang.Integer.valueOf(m18478x1fb0b8f)));
            }
            this.f5507x394b93 = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18357x81443d8e(parcel, 2, this.f5503x394b8f, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18357x81443d8e(parcel, 3, this.f5504x394b90, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18357x81443d8e(parcel, 4, this.f5505x394b91, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18357x81443d8e(parcel, 5, this.f5506x394b92, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18357x81443d8e(parcel, 6, this.f5507x394b93, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public zzr(int i17, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, java.util.List<java.lang.String> list4, java.util.List<java.lang.String> list5) {
        this.zzy = i17;
        this.f5503x394b8f = list;
        this.f5504x394b90 = list2;
        this.f5505x394b91 = list3;
        this.f5506x394b92 = list4;
        this.f5507x394b93 = list5;
    }
}
