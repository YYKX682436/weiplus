package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* loaded from: classes13.dex */
public class zzu extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.AbstractC2106x394b91 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzu> f5508x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzv();

    /* renamed from: zzbk */
    private static final java.util.HashMap<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> f5509x394b89;

    /* renamed from: mPackageName */
    private java.lang.String f5510xe037a144;

    /* renamed from: zzbl */
    private final java.util.Set<java.lang.Integer> f5511x394b8a;

    /* renamed from: zzbv */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw f5512x394b94;

    /* renamed from: zzbw */
    private java.lang.String f5513x394b95;
    private final int zzy;

    static {
        java.util.HashMap<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> hashMap = new java.util.HashMap<>();
        f5509x394b89 = hashMap;
        hashMap.put("authenticatorInfo", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18468xc061c6c8("authenticatorInfo", 2, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw.class));
        hashMap.put("signature", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18474x40a75e3a("signature", 3));
        hashMap.put("package", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18474x40a75e3a("package", 4));
    }

    public zzu() {
        this.f5511x394b8a = new java.util.HashSet(3);
        this.zzy = 1;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: addConcreteTypeInternal */
    public <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> void mo17355xcd78397d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, T t17) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(m18478x1fb0b8f), t17.getClass().getCanonicalName()));
        }
        this.f5512x394b94 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw) t17;
        this.f5511x394b8a.add(java.lang.Integer.valueOf(m18478x1fb0b8f));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldMappings */
    public /* synthetic */ java.util.Map mo17356xb4d428c9() {
        return f5509x394b89;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldValue */
    public java.lang.Object mo17357x101b448d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f == 1) {
            return java.lang.Integer.valueOf(this.zzy);
        }
        if (m18478x1fb0b8f == 2) {
            return this.f5512x394b94;
        }
        if (m18478x1fb0b8f == 3) {
            return this.f5513x394b95;
        }
        if (m18478x1fb0b8f == 4) {
            return this.f5510xe037a144;
        }
        int m18478x1fb0b8f2 = field.m18478x1fb0b8f();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Unknown SafeParcelable id=");
        sb6.append(m18478x1fb0b8f2);
        throw new java.lang.IllegalStateException(sb6.toString());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: isFieldSet */
    public boolean mo17358x9957f052(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        return this.f5511x394b8a.contains(java.lang.Integer.valueOf(field.m18478x1fb0b8f()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setStringInternal */
    public void mo17362x84691ef0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f == 3) {
            this.f5513x394b95 = str2;
        } else {
            if (m18478x1fb0b8f != 4) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string.", java.lang.Integer.valueOf(m18478x1fb0b8f)));
            }
            this.f5510xe037a144 = str2;
        }
        this.f5511x394b8a.add(java.lang.Integer.valueOf(m18478x1fb0b8f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        java.util.Set<java.lang.Integer> set = this.f5511x394b8a;
        if (set.contains(1)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, this.f5512x394b94, i17, true);
        }
        if (set.contains(3)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, this.f5513x394b95, true);
        }
        if (set.contains(4)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, this.f5510xe037a144, true);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public zzu(java.util.Set<java.lang.Integer> set, int i17, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw zzwVar, java.lang.String str, java.lang.String str2) {
        this.f5511x394b8a = set;
        this.zzy = i17;
        this.f5512x394b94 = zzwVar;
        this.f5513x394b95 = str;
        this.f5510xe037a144 = str2;
    }
}
