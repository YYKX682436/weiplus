package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* loaded from: classes13.dex */
public class zzw extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.AbstractC2106x394b91 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzw> f5514x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.zzx();

    /* renamed from: zzbk */
    private static final java.util.HashMap<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> f5515x394b89;

    /* renamed from: zzbl */
    private final java.util.Set<java.lang.Integer> f5516x394b8a;

    /* renamed from: zzbx */
    private java.lang.String f5517x394b96;

    /* renamed from: zzby */
    private int f5518x394b97;

    /* renamed from: zzbz */
    private byte[] f5519x394b98;

    /* renamed from: zzca */
    private android.app.PendingIntent f5520x394b9e;

    /* renamed from: zzcb */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.C1657x96aa87e5 f5521x394b9f;
    private final int zzy;

    static {
        java.util.HashMap<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> hashMap = new java.util.HashMap<>();
        f5515x394b89 = hashMap;
        hashMap.put("accountType", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18474x40a75e3a("accountType", 2));
        hashMap.put("status", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18472xb9234835("status", 3));
        hashMap.put("transferBytes", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field.m18466x22999b78("transferBytes", 4));
    }

    public zzw() {
        this.f5516x394b8a = new x.d(3);
        this.zzy = 1;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldMappings */
    public /* synthetic */ java.util.Map mo17356xb4d428c9() {
        return f5515x394b89;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldValue */
    public java.lang.Object mo17357x101b448d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        int i17;
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f == 1) {
            i17 = this.zzy;
        } else {
            if (m18478x1fb0b8f == 2) {
                return this.f5517x394b96;
            }
            if (m18478x1fb0b8f != 3) {
                if (m18478x1fb0b8f == 4) {
                    return this.f5519x394b98;
                }
                int m18478x1fb0b8f2 = field.m18478x1fb0b8f();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
                sb6.append("Unknown SafeParcelable id=");
                sb6.append(m18478x1fb0b8f2);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
            i17 = this.f5518x394b97;
        }
        return java.lang.Integer.valueOf(i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: isFieldSet */
    public boolean mo17358x9957f052(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        return this.f5516x394b8a.contains(java.lang.Integer.valueOf(field.m18478x1fb0b8f()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setDecodedBytesInternal */
    public void mo17364x4ac0c734(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f == 4) {
            this.f5519x394b98 = bArr;
            this.f5516x394b8a.add(java.lang.Integer.valueOf(m18478x1fb0b8f));
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(59);
            sb6.append("Field with id=");
            sb6.append(m18478x1fb0b8f);
            sb6.append(" is not known to be an byte array.");
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setIntegerInternal */
    public void mo17365x9549f959(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, int i17) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f == 3) {
            this.f5518x394b97 = i17;
            this.f5516x394b8a.add(java.lang.Integer.valueOf(m18478x1fb0b8f));
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(52);
            sb6.append("Field with id=");
            sb6.append(m18478x1fb0b8f);
            sb6.append(" is not known to be an int.");
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setStringInternal */
    public void mo17362x84691ef0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        int m18478x1fb0b8f = field.m18478x1fb0b8f();
        if (m18478x1fb0b8f != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string.", java.lang.Integer.valueOf(m18478x1fb0b8f)));
        }
        this.f5517x394b96 = str2;
        this.f5516x394b8a.add(java.lang.Integer.valueOf(m18478x1fb0b8f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        java.util.Set<java.lang.Integer> set = this.f5516x394b8a;
        if (set.contains(1)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f5517x394b96, true);
        }
        if (set.contains(3)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, this.f5518x394b97);
        }
        if (set.contains(4)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(parcel, 4, this.f5519x394b98, true);
        }
        if (set.contains(5)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 5, this.f5520x394b9e, i17, true);
        }
        if (set.contains(6)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 6, this.f5521x394b9f, i17, true);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public zzw(java.util.Set<java.lang.Integer> set, int i17, java.lang.String str, int i18, byte[] bArr, android.app.PendingIntent pendingIntent, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.C1657x96aa87e5 c1657x96aa87e5) {
        this.f5516x394b8a = set;
        this.zzy = i17;
        this.f5517x394b96 = str;
        this.f5518x394b97 = i18;
        this.f5519x394b98 = bArr;
        this.f5520x394b9e = pendingIntent;
        this.f5521x394b9f = c1657x96aa87e5;
    }
}
