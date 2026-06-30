package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* loaded from: classes13.dex */
public final class zzo extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.AbstractC2106x394b91 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzo> f5495x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzp();

    /* renamed from: zzbk */
    private static final java.util.HashMap<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> f5496x394b89;

    /* renamed from: zzbl */
    private final java.util.Set<java.lang.Integer> f5497x394b8a;

    /* renamed from: zzbm */
    private java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu> f5498x394b8b;

    /* renamed from: zzbn */
    private int f5499x394b8c;

    /* renamed from: zzbo */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr f5500x394b8d;
    private final int zzy;

    static {
        java.util.HashMap<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> hashMap = new java.util.HashMap<>();
        f5496x394b89 = hashMap;
        hashMap.put("authenticatorData", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18469x8cdcb871("authenticatorData", 2, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu.class));
        hashMap.put("progress", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18468xc061c6c8("progress", 4, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr.class));
    }

    public zzo() {
        this.f5497x394b8a = new java.util.HashSet(1);
        this.zzy = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: addConcreteTypeArrayInternal */
    public final <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> void mo17354x74407976(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", java.lang.Integer.valueOf(m18478x1fb0b8f), arrayList.getClass().getCanonicalName()));
        }
        this.f5498x394b8b = arrayList;
        this.f5497x394b8a.add(java.lang.Integer.valueOf(m18478x1fb0b8f));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: addConcreteTypeInternal */
    public final <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> void mo17355xcd78397d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, T t17) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f != 4) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(m18478x1fb0b8f), t17.getClass().getCanonicalName()));
        }
        this.f5500x394b8d = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr) t17;
        this.f5497x394b8a.add(java.lang.Integer.valueOf(m18478x1fb0b8f));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldMappings */
    public final /* synthetic */ java.util.Map mo17356xb4d428c9() {
        return f5496x394b89;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldValue */
    public final java.lang.Object mo17357x101b448d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f == 1) {
            return java.lang.Integer.valueOf(this.zzy);
        }
        if (m18478x1fb0b8f == 2) {
            return this.f5498x394b8b;
        }
        if (m18478x1fb0b8f == 4) {
            return this.f5500x394b8d;
        }
        int m18478x1fb0b8f2 = field.m18478x1fb0b8f();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Unknown SafeParcelable id=");
        sb6.append(m18478x1fb0b8f2);
        throw new java.lang.IllegalStateException(sb6.toString());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: isFieldSet */
    public final boolean mo17358x9957f052(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        return this.f5497x394b8a.contains(java.lang.Integer.valueOf(field.m18478x1fb0b8f()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        java.util.Set<java.lang.Integer> set = this.f5497x394b8a;
        if (set.contains(1)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 2, this.f5498x394b8b, true);
        }
        if (set.contains(3)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, this.f5499x394b8c);
        }
        if (set.contains(4)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 4, this.f5500x394b8d, i17, true);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public zzo(java.util.Set<java.lang.Integer> set, int i17, java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu> arrayList, int i18, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzr zzrVar) {
        this.f5497x394b8a = set;
        this.zzy = i17;
        this.f5498x394b8b = arrayList;
        this.f5499x394b8c = i18;
        this.f5500x394b8d = zzrVar;
    }
}
