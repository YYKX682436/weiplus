package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes11.dex */
public final class cu implements java.io.Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f130701b = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f130703d = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f130705f = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f130707h = 3;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f130709j = true;

    /* renamed from: a, reason: collision with root package name */
    public int f130711a;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f130712l;

    /* renamed from: k, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu[] f130710k = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu[4];

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu f130702c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu(0, 0, "DT_NORMAL");

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu f130704e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu(1, 1, "DT_ONLY_LINK");

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu f130706g = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu(2, 2, "DT_ONLY_STATUS");

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu f130708i = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu(3, 3, "DT_LINK_AND_STATUS");

    private cu(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.f130712l = str;
        this.f130711a = i18;
        f130710k[i17] = this;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu a(int i17) {
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu[] cuVarArr = f130710k;
            if (i18 < cuVarArr.length) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu cuVar = cuVarArr[i18];
                if (cuVar.f130711a == i17) {
                    return cuVar;
                }
                i18++;
            } else {
                if (f130709j) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    /* renamed from: toString */
    public final java.lang.String m36681x9616526c() {
        return this.f130712l;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cu[] cuVarArr = f130710k;
            if (i17 < cuVarArr.length) {
                if (cuVarArr[i17].m36681x9616526c().equals(str)) {
                    return f130710k[i17];
                }
                i17++;
            } else {
                if (f130709j) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    private int a() {
        return this.f130711a;
    }
}
