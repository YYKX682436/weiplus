package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e;

/* renamed from: com.google.android.gms.auth.api.proxy.ProxyRequest */
/* loaded from: classes13.dex */
public class C1676xdf3d1c61 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: VERSION_CODE */
    public static final int f5639x85be6914 = 2;

    /* renamed from: body */
    public final byte[] f5640x2e39a2;

    /* renamed from: httpMethod */
    public final int f5641x2cc53f89;

    /* renamed from: timeoutMillis */
    public final long f5642x46dd8707;
    public final java.lang.String url;

    /* renamed from: versionCode */
    private final int f5643x290b12e5;

    /* renamed from: zzdw */
    private android.os.Bundle f5644x394bd3;

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61> f5629x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.zzd();

    /* renamed from: HTTP_METHOD_GET */
    public static final int f5631x3fc1deef = 0;

    /* renamed from: HTTP_METHOD_POST */
    public static final int f5635xb87e3c07 = 1;

    /* renamed from: HTTP_METHOD_PUT */
    public static final int f5636x3fc202a8 = 2;

    /* renamed from: HTTP_METHOD_DELETE */
    public static final int f5630x7cd4e752 = 3;

    /* renamed from: HTTP_METHOD_HEAD */
    public static final int f5632xb87a7147 = 4;

    /* renamed from: HTTP_METHOD_OPTIONS */
    public static final int f5633x76e459b7 = 5;

    /* renamed from: HTTP_METHOD_TRACE */
    public static final int f5637x5782ba9e = 6;

    /* renamed from: HTTP_METHOD_PATCH */
    public static final int f5634x5742e9a1 = 7;

    /* renamed from: LAST_CODE */
    public static final int f5638x1fd401f6 = 7;

    /* renamed from: com.google.android.gms.auth.api.proxy.ProxyRequest$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: zzdx */
        private java.lang.String f5645x394bd4;

        /* renamed from: zzdy */
        private int f5646x394bd5 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61.f5631x3fc1deef;

        /* renamed from: zzdz */
        private long f5647x394bd6 = 3000;

        /* renamed from: zzea */
        private byte[] f5648x394bdc = null;

        /* renamed from: zzeb */
        private android.os.Bundle f5649x394bdd = new android.os.Bundle();

        public Builder(java.lang.String str) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
            if (android.util.Patterns.WEB_URL.matcher(str).matches()) {
                this.f5645x394bd4 = str;
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51);
            sb6.append("The supplied url [ ");
            sb6.append(str);
            sb6.append("] is not match Patterns.WEB_URL!");
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61 m17459x59bc66e() {
            if (this.f5648x394bdc == null) {
                this.f5648x394bdc = new byte[0];
            }
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61(2, this.f5645x394bd4, this.f5646x394bd5, this.f5647x394bd6, this.f5648x394bdc, this.f5649x394bdd);
        }

        /* renamed from: putHeader */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61.Builder m17460xd0c6ba7c(java.lang.String str, java.lang.String str2) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "Header name cannot be null or empty!");
            android.os.Bundle bundle = this.f5649x394bdd;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        /* renamed from: setBody */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61.Builder m17461x76486924(byte[] bArr) {
            this.f5648x394bdc = bArr;
            return this;
        }

        /* renamed from: setHttpMethod */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61.Builder m17462x492a458b(int i17) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(i17 >= 0 && i17 <= com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61.f5638x1fd401f6, "Unrecognized http method code.");
            this.f5646x394bd5 = i17;
            return this;
        }

        /* renamed from: setTimeoutMillis */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1676xdf3d1c61.Builder m17463x9713a9c5(long j17) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(j17 >= 0, "The specified timeout must be non-negative.");
            this.f5647x394bd6 = j17;
            return this;
        }
    }

    public C1676xdf3d1c61(int i17, java.lang.String str, int i18, long j17, byte[] bArr, android.os.Bundle bundle) {
        this.f5643x290b12e5 = i17;
        this.url = str;
        this.f5641x2cc53f89 = i18;
        this.f5642x46dd8707 = j17;
        this.f5640x2e39a2 = bArr;
        this.f5644x394bd3 = bundle;
    }

    /* renamed from: getHeaderMap */
    public java.util.Map<java.lang.String, java.lang.String> m17457xf2b694d9() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(this.f5644x394bd3.size());
        for (java.lang.String str : this.f5644x394bd3.keySet()) {
            linkedHashMap.put(str, this.f5644x394bd3.getString(str));
        }
        return java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: toString */
    public java.lang.String m17458x9616526c() {
        java.lang.String str = this.url;
        int i17 = this.f5641x2cc53f89;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 42);
        sb6.append("ProxyRequest[ url: ");
        sb6.append(str);
        sb6.append(", method: ");
        sb6.append(i17);
        sb6.append(" ]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 1, this.url, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, this.f5641x2cc53f89);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 3, this.f5642x46dd8707);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(parcel, 4, this.f5640x2e39a2, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 5, this.f5644x394bd3, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1000, this.f5643x290b12e5);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
