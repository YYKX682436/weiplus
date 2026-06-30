package com.p314xaae8f345.p3121x37984a.p3124xaf3f3382;

/* renamed from: com.tencent.wcdb.compat.SQLiteCipherSpec */
/* loaded from: classes12.dex */
public class C26913xf23b9b2 {

    /* renamed from: HMAC_DEFAULT */
    public static final int f57967xdabe15c9 = -1;

    /* renamed from: HMAC_SHA1 */
    public static final int f57968xd824fe7d = 0;

    /* renamed from: HMAC_SHA256 */
    public static final int f57969x62df5d9f = 1;

    /* renamed from: HMAC_SHA512 */
    public static final int f57970x62df6862 = 2;

    /* renamed from: cipherVersion */
    int f57972xffdffc4d;

    /* renamed from: hmacAlgorithm */
    public int f57973x93cf5c48;

    /* renamed from: hmacEnabled */
    public boolean f57974xdd78555a;

    /* renamed from: kdfAlgorithm */
    public int f57975x3abbd8c2;

    /* renamed from: kdfIteration */
    public int f57976xb6501330;

    /* renamed from: pageSize */
    public int f57977x3339d730;

    /* renamed from: HMAC_ALGO_MAPPING */
    static final java.lang.String[] f57966x8bcb501a = {"HMAC_SHA1", "HMAC_SHA256", "HMAC_SHA512"};

    /* renamed from: PBKDF2_ALGO_MAPPING */
    static final java.lang.String[] f57971x4411a54a = {"PBKDF2_HMAC_SHA1", "PBKDF2_HMAC_SHA256", "PBKDF2_HMAC_SHA512"};

    public C26913xf23b9b2() {
        this.f57974xdd78555a = true;
        this.f57973x93cf5c48 = -1;
        this.f57975x3abbd8c2 = -1;
        this.f57977x3339d730 = 4096;
        this.f57972xffdffc4d = 0;
    }

    /* renamed from: setHmacAlgorithm */
    public com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 m106466xe4057f06(int i17) {
        if (this.f57973x93cf5c48 != i17) {
            this.f57973x93cf5c48 = i17;
            this.f57972xffdffc4d = -1;
        }
        return this;
    }

    /* renamed from: setKDFIteration */
    public com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 m106467x27c724b2(int i17) {
        if (this.f57976xb6501330 != i17) {
            this.f57976xb6501330 = i17;
            this.f57972xffdffc4d = -1;
        }
        return this;
    }

    /* renamed from: setKdfAlgorithm */
    public com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 m106468xd1f76644(int i17) {
        if (this.f57975x3abbd8c2 != i17) {
            this.f57975x3abbd8c2 = i17;
            this.f57972xffdffc4d = -1;
        }
        return this;
    }

    /* renamed from: setPageSize */
    public com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 m106469xa9cc75b2(int i17) {
        this.f57977x3339d730 = i17;
        return this;
    }

    /* renamed from: setSQLCipherVersion */
    public com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 m106470x4c1f4da1(int i17) {
        if (i17 == 1) {
            this.f57972xffdffc4d = 1;
            this.f57974xdd78555a = false;
            this.f57976xb6501330 = 4000;
            this.f57973x93cf5c48 = 0;
            this.f57975x3abbd8c2 = 0;
        } else if (i17 == 2) {
            this.f57972xffdffc4d = 2;
            this.f57974xdd78555a = true;
            this.f57976xb6501330 = 4000;
            this.f57973x93cf5c48 = 0;
            this.f57975x3abbd8c2 = 0;
        } else if (i17 == 3) {
            this.f57972xffdffc4d = 3;
            this.f57974xdd78555a = true;
            this.f57976xb6501330 = 64000;
            this.f57973x93cf5c48 = 0;
            this.f57975x3abbd8c2 = 0;
        } else {
            if (i17 != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported SQLCipher version: " + i17);
            }
            this.f57972xffdffc4d = 4;
            this.f57974xdd78555a = true;
            this.f57976xb6501330 = 256000;
            this.f57973x93cf5c48 = 2;
            this.f57975x3abbd8c2 = 2;
        }
        return this;
    }

    /* renamed from: withHMACEnabled */
    public com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 m106471xcf8094d4(boolean z17) {
        if (this.f57974xdd78555a != z17) {
            this.f57974xdd78555a = z17;
            this.f57972xffdffc4d = -1;
        }
        return this;
    }

    public C26913xf23b9b2(com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 c26913xf23b9b2) {
        this.f57974xdd78555a = true;
        this.f57973x93cf5c48 = -1;
        this.f57975x3abbd8c2 = -1;
        this.f57977x3339d730 = 4096;
        this.f57972xffdffc4d = 0;
        this.f57976xb6501330 = c26913xf23b9b2.f57976xb6501330;
        this.f57974xdd78555a = c26913xf23b9b2.f57974xdd78555a;
        this.f57973x93cf5c48 = c26913xf23b9b2.f57973x93cf5c48;
        this.f57975x3abbd8c2 = c26913xf23b9b2.f57975x3abbd8c2;
        this.f57972xffdffc4d = c26913xf23b9b2.f57972xffdffc4d;
        this.f57977x3339d730 = c26913xf23b9b2.f57977x3339d730;
    }
}
