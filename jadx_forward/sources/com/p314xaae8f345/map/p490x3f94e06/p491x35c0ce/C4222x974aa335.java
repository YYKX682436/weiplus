package com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce;

/* renamed from: com.tencent.map.geolocation.sapp.TencentLocationRequest */
/* loaded from: classes13.dex */
public final class C4222x974aa335 {

    /* renamed from: REQUEST_DOMAIN_MODE_COMMON */
    public static final int f16253x9bfb78dc = 0;

    /* renamed from: REQUEST_DOMAIN_MODE_FOREGIN */
    public static final int f16254x8269089f = 1;

    /* renamed from: REQUEST_DOMAIN_MODE_IOT */
    public static final int f16255x782a0e9d = 2;

    /* renamed from: REQUEST_LEVEL_ADMIN_AREA */
    public static final int f16256x2d433728 = 3;

    /* renamed from: REQUEST_LEVEL_GEO */
    public static final int f16257x9d730e06 = 0;

    /* renamed from: REQUEST_LEVEL_NAME */
    public static final int f16258x10f1d256 = 1;

    /* renamed from: REQUEST_LEVEL_POI */
    public static final int f16259x9d7330ff = 4;

    /* renamed from: mAllowCache */
    private boolean f16260x8aa5ba06;

    /* renamed from: mAllowDirection */
    private boolean f16261xd5543003;

    /* renamed from: mAllowGps */
    private boolean f16262x910f6c2e;

    /* renamed from: mExpirationTime */
    private long f16263xdedd2be9;

    /* renamed from: mExtras */
    private android.os.Bundle f16264x2971530;

    /* renamed from: mIndoorLocationMode */
    private boolean f16265x87124c38;

    /* renamed from: mInterval */
    private long f16266x46fd8c52;

    /* renamed from: mNumUpdates */
    private int f16267x2726e2b1;

    /* renamed from: mOpenId */
    private java.lang.String f16268x132febd2;
    private java.lang.String mQQ;

    /* renamed from: mRequestDomainMode */
    private int f16269x9e142f89;

    /* renamed from: mRequestLevel */
    private int f16270xe4311342;

    /* renamed from: mSmallAppKey */
    private java.lang.String f16271x5765ddb8;

    private C4222x974aa335() {
    }

    /* renamed from: copy */
    public static void m34936x2eaf75(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa3352) {
        c4222x974aa335.f16266x46fd8c52 = c4222x974aa3352.f16266x46fd8c52;
        c4222x974aa335.f16270xe4311342 = c4222x974aa3352.f16270xe4311342;
        c4222x974aa335.f16260x8aa5ba06 = c4222x974aa3352.f16260x8aa5ba06;
        c4222x974aa335.f16261xd5543003 = c4222x974aa3352.f16261xd5543003;
        c4222x974aa335.f16263xdedd2be9 = c4222x974aa3352.f16263xdedd2be9;
        c4222x974aa335.f16267x2726e2b1 = c4222x974aa3352.f16267x2726e2b1;
        c4222x974aa335.f16265x87124c38 = c4222x974aa3352.f16265x87124c38;
        c4222x974aa335.f16269x9e142f89 = c4222x974aa3352.f16269x9e142f89;
        c4222x974aa335.f16262x910f6c2e = c4222x974aa3352.f16262x910f6c2e;
        c4222x974aa335.mQQ = c4222x974aa3352.mQQ;
        c4222x974aa335.f16271x5765ddb8 = c4222x974aa3352.f16271x5765ddb8;
        c4222x974aa335.f16268x132febd2 = c4222x974aa3352.f16268x132febd2;
        c4222x974aa335.f16264x2971530.clear();
        c4222x974aa335.f16264x2971530.putAll(c4222x974aa3352.f16264x2971530);
    }

    /* renamed from: create */
    public static com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34937xaf65a0fc() {
        com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335 = new com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335();
        c4222x974aa335.f16266x46fd8c52 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        c4222x974aa335.f16270xe4311342 = 1;
        c4222x974aa335.f16260x8aa5ba06 = true;
        c4222x974aa335.f16261xd5543003 = false;
        c4222x974aa335.f16265x87124c38 = false;
        c4222x974aa335.f16269x9e142f89 = 0;
        c4222x974aa335.f16263xdedd2be9 = 0L;
        c4222x974aa335.f16267x2726e2b1 = Integer.MAX_VALUE;
        c4222x974aa335.f16262x910f6c2e = true;
        c4222x974aa335.mQQ = "";
        c4222x974aa335.f16268x132febd2 = "";
        c4222x974aa335.f16271x5765ddb8 = "";
        c4222x974aa335.f16264x2971530 = new android.os.Bundle();
        return c4222x974aa335;
    }

    /* renamed from: isAllowedLevel */
    private boolean m34938xbd966506(int i17) {
        return i17 == 0 || i17 == 1 || i17 == 3 || i17 == 4 || i17 == 7;
    }

    /* renamed from: getAndroidId */
    public java.lang.String m34939x42e1d134() {
        java.lang.String string = this.f16264x2971530.getString("androidId");
        return string == null ? "" : string;
    }

    /* renamed from: getExtras */
    public android.os.Bundle m34940x18421159() {
        return this.f16264x2971530;
    }

    /* renamed from: getInterval */
    public long m34941x9dda223b() {
        return this.f16266x46fd8c52;
    }

    /* renamed from: getOpenId */
    public java.lang.String m34942x28dae7fb() {
        return this.f16268x132febd2;
    }

    /* renamed from: getQQ */
    public java.lang.String m34943x5db1bf6() {
        return this.mQQ;
    }

    /* renamed from: getRequestDomainMode */
    public int m34944x54672fc0() {
        return this.f16269x9e142f89;
    }

    /* renamed from: getRequestLevel */
    public int m34945xad8e8cab() {
        return this.f16270xe4311342;
    }

    /* renamed from: getSmallAppKey */
    public java.lang.String m34946x872f132f() {
        return this.f16271x5765ddb8;
    }

    /* renamed from: getmExpirationTime */
    public long m34947xfeac45d3() {
        return this.f16263xdedd2be9;
    }

    /* renamed from: isAllowCache */
    public boolean m34948x2fdebe83() {
        return this.f16260x8aa5ba06;
    }

    /* renamed from: isAllowDirection */
    public boolean m34949x754cae00() {
        return this.f16261xd5543003;
    }

    /* renamed from: isAllowGPS */
    public boolean m34950x3cc967eb() {
        return this.f16262x910f6c2e;
    }

    /* renamed from: isIndoorLocationMode */
    public boolean m34951x5a7183b5() {
        return this.f16265x87124c38;
    }

    /* renamed from: setAllowCache */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34952xcad8c7bb(boolean z17) {
        this.f16260x8aa5ba06 = z17;
        return this;
    }

    /* renamed from: setAllowDirection */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34953x852f5b38(boolean z17) {
        this.f16261xd5543003 = z17;
        return this;
    }

    /* renamed from: setAllowGPS */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34954xe2a45f23(boolean z17) {
        this.f16262x910f6c2e = z17;
        return this;
    }

    /* renamed from: setAndroidId */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34955x9f3591a8(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f16264x2971530.putString("androidId", str);
        return this;
    }

    /* renamed from: setIndoorLocationMode */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34956x324ad4ed(boolean z17) {
        this.f16265x87124c38 = z17;
        return this;
    }

    /* renamed from: setInterval */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34957x98928347(long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("interval should >= 0");
        }
        this.f16266x46fd8c52 = j17;
        return this;
    }

    /* renamed from: setLocationDomainMode */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34958x8279821e(int i17) {
        this.f16269x9e142f89 = i17;
        return this;
    }

    /* renamed from: setOpenId */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34959x1c101c07(java.lang.String str) {
        this.f16268x132febd2 = str;
        return this;
    }

    /* renamed from: setQQ */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34960x6843602(java.lang.String str) {
        this.mQQ = str;
        return this;
    }

    /* renamed from: setRequestLevel */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34961xe3d787b7(int i17) {
        if (m34938xbd966506(i17)) {
            this.f16270xe4311342 = i17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("request_level: " + i17 + " not supported!");
    }

    /* renamed from: setSmallAppKey */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34962x1d9486a3(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f16271x5765ddb8 = str;
        }
        return this;
    }

    /* renamed from: setmExpirationTime */
    public void m34963x3582df47(long j17) {
        this.f16263xdedd2be9 = j17;
    }

    /* renamed from: toString */
    public java.lang.String m34964x9616526c() {
        return "TencentLocationRequest {interval=" + this.f16266x46fd8c52 + "ms,level=" + this.f16270xe4311342 + ",allowCache=" + this.f16260x8aa5ba06 + ",allowGps=" + this.f16262x910f6c2e + ",allowDirection=" + this.f16261xd5543003 + ",QQ=" + this.mQQ + ",DomainMode=" + this.f16269x9e142f89 + ",openId=" + this.f16268x132febd2 + "}";
    }

    public C4222x974aa335(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335) {
        this.f16266x46fd8c52 = c4222x974aa335.f16266x46fd8c52;
        this.f16270xe4311342 = c4222x974aa335.f16270xe4311342;
        this.f16260x8aa5ba06 = c4222x974aa335.f16260x8aa5ba06;
        this.f16261xd5543003 = c4222x974aa335.f16261xd5543003;
        this.f16263xdedd2be9 = c4222x974aa335.f16263xdedd2be9;
        this.f16267x2726e2b1 = c4222x974aa335.f16267x2726e2b1;
        this.f16262x910f6c2e = c4222x974aa335.f16262x910f6c2e;
        this.f16265x87124c38 = c4222x974aa335.f16265x87124c38;
        this.f16269x9e142f89 = c4222x974aa335.f16269x9e142f89;
        this.mQQ = c4222x974aa335.mQQ;
        this.f16271x5765ddb8 = c4222x974aa335.f16271x5765ddb8;
        this.f16268x132febd2 = c4222x974aa335.f16268x132febd2;
        android.os.Bundle bundle = new android.os.Bundle();
        this.f16264x2971530 = bundle;
        bundle.putAll(c4222x974aa335.f16264x2971530);
    }
}
