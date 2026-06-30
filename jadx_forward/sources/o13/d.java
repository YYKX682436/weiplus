package o13;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f423763p;

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f423765r;

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f423766s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f423767t;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f423748a = {65536};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f423749b = {196608};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f423750c = {262144};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f423751d = {393216};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f423752e = {524288};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f423753f = {589824};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f423754g = {655360};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f423755h = {720896};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f423756i = {786432};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f423757j = {131072, 131075, 131076, 2097171, 2097173, 131081};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f423758k = {131072};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f423759l = {2097172};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f423760m = {131073, 131074};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f423761n = {131090, 131089};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f423762o = {5, 6, 7, 1, 2, 3};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f423764q = {29, 30, 31, 34, 35, 36, 33, 32, 37};

    static {
        int[] iArr = {131072, 131073, 131074, 131075, 131076, 2097171, 2097173, 131077, 131078, 131079, 131080};
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 17, 18, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 0};
        int[] iArr3 = {1, 2, 3, 4, 5, 6, 8, 19, 20, 21, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 7, 0};
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < 11; i17++) {
            hashMap.put(java.lang.Integer.valueOf(iArr[i17]), java.lang.Integer.valueOf(i17));
        }
        f423763p = java.util.Collections.unmodifiableMap(hashMap);
        f423765r = new int[43];
        for (int i18 = 0; i18 < 43; i18++) {
            f423765r[iArr2[i18]] = i18;
        }
        f423766s = new int[27];
        for (int i19 = 0; i19 < 27; i19++) {
            f423766s[iArr3[i19]] = i19;
        }
        f423767t = lp0.b.D() + "fts/";
    }
}
