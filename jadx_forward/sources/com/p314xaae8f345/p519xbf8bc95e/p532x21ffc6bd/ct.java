package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes11.dex */
public final class ct implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f130693a = 29;

    /* renamed from: b, reason: collision with root package name */
    public static final int f130694b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f130695c = 8;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f130697e = true;

    /* renamed from: g, reason: collision with root package name */
    private int f130699g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f130700h;

    /* renamed from: f, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct[] f130698f = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct[28];

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct f130696d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct("REQ_CONFIG");

    private ct(java.lang.String str) {
        new java.lang.String();
        this.f130700h = str;
        this.f130699g = 29;
        f130698f[26] = this;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct a(int i17) {
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct[] ctVarArr = f130698f;
            if (i18 < ctVarArr.length) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct ctVar = ctVarArr[i18];
                if (ctVar.f130699g == i17) {
                    return ctVar;
                }
                i18++;
            } else {
                if (f130697e) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    /* renamed from: toString */
    public final java.lang.String m36679x9616526c() {
        return this.f130700h;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ct[] ctVarArr = f130698f;
            if (i17 < ctVarArr.length) {
                if (ctVarArr[i17].m36679x9616526c().equals(str)) {
                    return f130698f[i17];
                }
                i17++;
            } else {
                if (f130697e) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    private int a() {
        return this.f130699g;
    }
}
