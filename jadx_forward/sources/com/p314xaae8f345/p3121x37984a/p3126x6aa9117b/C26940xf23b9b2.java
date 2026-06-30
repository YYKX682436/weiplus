package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteCipherSpec */
/* loaded from: classes12.dex */
public class C26940xf23b9b2 {

    /* renamed from: HMAC_DEFAULT */
    public static final int f58088xdabe15c9 = -1;

    /* renamed from: HMAC_SHA1 */
    public static final int f58089xd824fe7d = 0;

    /* renamed from: HMAC_SHA256 */
    public static final int f58090x62df5d9f = 1;

    /* renamed from: HMAC_SHA512 */
    public static final int f58091x62df6862 = 2;

    /* renamed from: hmacAlgorithm */
    public int f58092x93cf5c48;

    /* renamed from: hmacEnabled */
    public boolean f58093xdd78555a;

    /* renamed from: kdfAlgorithm */
    public int f58094x3abbd8c2;

    /* renamed from: kdfIteration */
    public int f58095xb6501330;

    /* renamed from: pageSize */
    public int f58096x3339d730;

    public C26940xf23b9b2() {
        this.f58095xb6501330 = 64000;
        this.f58093xdd78555a = true;
        this.f58092x93cf5c48 = 0;
        this.f58094x3abbd8c2 = 0;
        this.f58096x3339d730 = 4096;
    }

    /* renamed from: setHmacAlgorithm */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 m107397xe4057f06(int i17) {
        this.f58092x93cf5c48 = i17;
        return this;
    }

    /* renamed from: setKDFIteration */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 m107398x27c724b2(int i17) {
        this.f58095xb6501330 = i17;
        return this;
    }

    /* renamed from: setKdfAlgorithm */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 m107399xd1f76644(int i17) {
        this.f58094x3abbd8c2 = i17;
        return this;
    }

    /* renamed from: setPageSize */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 m107400xa9cc75b2(int i17) {
        this.f58096x3339d730 = i17;
        return this;
    }

    /* renamed from: setSQLCipherVersion */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 m107401x4c1f4da1(int i17) {
        if (i17 == 1) {
            this.f58093xdd78555a = false;
            this.f58095xb6501330 = 4000;
            this.f58092x93cf5c48 = 0;
            this.f58094x3abbd8c2 = 0;
        } else if (i17 == 2) {
            this.f58093xdd78555a = true;
            this.f58095xb6501330 = 4000;
            this.f58092x93cf5c48 = 0;
            this.f58094x3abbd8c2 = 0;
        } else if (i17 == 3) {
            this.f58093xdd78555a = true;
            this.f58095xb6501330 = 64000;
            this.f58092x93cf5c48 = 0;
            this.f58094x3abbd8c2 = 0;
        } else {
            if (i17 != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported SQLCipher version: " + i17);
            }
            this.f58093xdd78555a = true;
            this.f58095xb6501330 = 256000;
            this.f58092x93cf5c48 = 2;
            this.f58094x3abbd8c2 = 2;
        }
        return this;
    }

    /* renamed from: withHMACEnabled */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 m107402xcf8094d4(boolean z17) {
        this.f58093xdd78555a = z17;
        return this;
    }

    public C26940xf23b9b2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2) {
        this.f58095xb6501330 = 64000;
        this.f58093xdd78555a = true;
        this.f58092x93cf5c48 = 0;
        this.f58094x3abbd8c2 = 0;
        this.f58096x3339d730 = 4096;
        this.f58095xb6501330 = c26940xf23b9b2.f58095xb6501330;
        this.f58093xdd78555a = c26940xf23b9b2.f58093xdd78555a;
        this.f58096x3339d730 = c26940xf23b9b2.f58096x3339d730;
        this.f58092x93cf5c48 = c26940xf23b9b2.f58092x93cf5c48;
        this.f58094x3abbd8c2 = c26940xf23b9b2.f58094x3abbd8c2;
    }
}
