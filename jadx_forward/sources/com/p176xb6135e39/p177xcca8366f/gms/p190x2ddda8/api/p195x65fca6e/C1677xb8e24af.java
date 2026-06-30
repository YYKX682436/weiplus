package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e;

/* renamed from: com.google.android.gms.auth.api.proxy.ProxyResponse */
/* loaded from: classes13.dex */
public class C1677xb8e24af extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af> f5650x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.zze();

    /* renamed from: STATUS_CODE_NO_CONNECTION */
    public static final int f5651xa73622b7 = -1;

    /* renamed from: body */
    public final byte[] f5652x2e39a2;

    /* renamed from: googlePlayServicesStatusCode */
    public final int f5653x63c143ea;

    /* renamed from: recoveryAction */
    public final android.app.PendingIntent f5654x7d8262b;

    /* renamed from: statusCode */
    public final int f5655xec0a8ff;

    /* renamed from: versionCode */
    private final int f5656x290b12e5;

    /* renamed from: zzdw */
    private final android.os.Bundle f5657x394bd3;

    public C1677xb8e24af(int i17, int i18, android.app.PendingIntent pendingIntent, int i19, android.os.Bundle bundle, byte[] bArr) {
        this.f5656x290b12e5 = i17;
        this.f5653x63c143ea = i18;
        this.f5655xec0a8ff = i19;
        this.f5657x394bd3 = bundle;
        this.f5652x2e39a2 = bArr;
        this.f5654x7d8262b = pendingIntent;
    }

    /* renamed from: createErrorProxyResponse */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af m17465x615675c3(int i17, android.app.PendingIntent pendingIntent, int i18, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af(1, i17, pendingIntent, i18, zzd(map), bArr);
    }

    private static android.os.Bundle zzd(java.util.Map<java.lang.String, java.lang.String> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (map == null) {
            return bundle;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* renamed from: getHeaders */
    public java.util.Map<java.lang.String, java.lang.String> m17466x6d34ab50() {
        if (this.f5657x394bd3 == null) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.f5657x394bd3.keySet()) {
            hashMap.put(str, this.f5657x394bd3.getString(str));
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.f5653x63c143ea);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, this.f5654x7d8262b, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, this.f5655xec0a8ff);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 4, this.f5657x394bd3, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(parcel, 5, this.f5652x2e39a2, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1000, this.f5656x290b12e5);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1677xb8e24af(int i17, android.app.PendingIntent pendingIntent, int i18, android.os.Bundle bundle, byte[] bArr) {
        this(1, i17, pendingIntent, i18, bundle, bArr);
    }

    private C1677xb8e24af(int i17, android.os.Bundle bundle, byte[] bArr) {
        this(1, 0, null, i17, bundle, bArr);
    }

    public C1677xb8e24af(int i17, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        this(i17, zzd(map), bArr);
    }
}
