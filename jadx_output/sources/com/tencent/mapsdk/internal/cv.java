package com.tencent.mapsdk.internal;

/* loaded from: classes11.dex */
public final class cv implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49180a = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49182c = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f49184e = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f49186g = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f49188i = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f49190k = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f49192m = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f49194o = 7;

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f49196q = true;

    /* renamed from: s, reason: collision with root package name */
    private int f49198s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.String f49199t;

    /* renamed from: r, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.cv[] f49197r = new com.tencent.mapsdk.internal.cv[8];

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49181b = new com.tencent.mapsdk.internal.cv(0, 0, "RST_SUCC");

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49183d = new com.tencent.mapsdk.internal.cv(1, 1, "RST_DECODE_FAIL");

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49185f = new com.tencent.mapsdk.internal.cv(2, 2, "RST_SYS_ERR");

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49187h = new com.tencent.mapsdk.internal.cv(3, 3, "RST_INVALID_USER");

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49189j = new com.tencent.mapsdk.internal.cv(4, 4, "RST_USE_INVALID_KEY");

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49191l = new com.tencent.mapsdk.internal.cv(5, 5, "RST_INVALID_UIN");

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49193n = new com.tencent.mapsdk.internal.cv(6, 6, "RST_INVALID_CMD");

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cv f49195p = new com.tencent.mapsdk.internal.cv(7, 7, "RST_PACKAGE_ERR");

    private cv(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.f49199t = str;
        this.f49198s = i18;
        f49197r[i17] = this;
    }

    private static com.tencent.mapsdk.internal.cv a(int i17) {
        int i18 = 0;
        while (true) {
            com.tencent.mapsdk.internal.cv[] cvVarArr = f49197r;
            if (i18 < cvVarArr.length) {
                com.tencent.mapsdk.internal.cv cvVar = cvVarArr[i18];
                if (cvVar.f49198s == i17) {
                    return cvVar;
                }
                i18++;
            } else {
                if (f49196q) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    public final java.lang.String toString() {
        return this.f49199t;
    }

    private static com.tencent.mapsdk.internal.cv a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.tencent.mapsdk.internal.cv[] cvVarArr = f49197r;
            if (i17 < cvVarArr.length) {
                if (cvVarArr[i17].toString().equals(str)) {
                    return f49197r[i17];
                }
                i17++;
            } else {
                if (f49196q) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    private int a() {
        return this.f49198s;
    }
}
