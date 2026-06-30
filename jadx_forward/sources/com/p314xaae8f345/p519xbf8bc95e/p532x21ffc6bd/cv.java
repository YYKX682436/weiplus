package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes11.dex */
public final class cv implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f130713a = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f130715c = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f130717e = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f130719g = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f130721i = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f130723k = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f130725m = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f130727o = 7;

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f130729q = true;

    /* renamed from: s, reason: collision with root package name */
    private int f130731s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.String f130732t;

    /* renamed from: r, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv[] f130730r = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv[8];

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130714b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(0, 0, "RST_SUCC");

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130716d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(1, 1, "RST_DECODE_FAIL");

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130718f = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(2, 2, "RST_SYS_ERR");

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130720h = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(3, 3, "RST_INVALID_USER");

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130722j = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(4, 4, "RST_USE_INVALID_KEY");

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130724l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(5, 5, "RST_INVALID_UIN");

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130726n = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(6, 6, "RST_INVALID_CMD");

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv f130728p = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv(7, 7, "RST_PACKAGE_ERR");

    private cv(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.f130732t = str;
        this.f130731s = i18;
        f130730r[i17] = this;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv a(int i17) {
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv[] cvVarArr = f130730r;
            if (i18 < cvVarArr.length) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv cvVar = cvVarArr[i18];
                if (cvVar.f130731s == i17) {
                    return cvVar;
                }
                i18++;
            } else {
                if (f130729q) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    /* renamed from: toString */
    public final java.lang.String m36683x9616526c() {
        return this.f130732t;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cv[] cvVarArr = f130730r;
            if (i17 < cvVarArr.length) {
                if (cvVarArr[i17].m36683x9616526c().equals(str)) {
                    return f130730r[i17];
                }
                i17++;
            } else {
                if (f130729q) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    private int a() {
        return this.f130731s;
    }
}
