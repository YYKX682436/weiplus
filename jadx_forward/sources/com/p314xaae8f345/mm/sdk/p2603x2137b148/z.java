package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f274638a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f274639b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f274640c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f274641d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f274642e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f274643f;

    /* renamed from: h, reason: collision with root package name */
    public static int f274645h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f274646i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f274647j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f274648k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f274649l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f274650m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f274651n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f274652o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f274653p;

    /* renamed from: q, reason: collision with root package name */
    public static int f274654q;

    /* renamed from: r, reason: collision with root package name */
    public static int f274655r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f274656s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.z1 f274657t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z1();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f274644g;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f274658u = f274644g;

    public static java.lang.String a() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = f274638a;
        java.lang.String str3 = f274640c;
        java.lang.String str4 = f274642e;
        sb6.append(java.lang.String.format("[b.ver] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.y.a(f274658u, lp0.a.f401782c)));
        sb6.append(java.lang.String.format("[tag  ] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.y.a(str2, lp0.a.f401785f)));
        sb6.append(java.lang.String.format("[time ] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.y.a(str3, lp0.a.f401784e)));
        sb6.append(java.lang.String.format("[cmd  ] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.y.a(f274641d, lp0.a.f401786g)));
        sb6.append(java.lang.String.format("[rev  ] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.y.a(str4, lp0.a.f401781b)));
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (!(!"false".equalsIgnoreCase(lp0.a.f401780a))) {
            str = "disabled";
        } else if (lp0.a.f401787h == null) {
            str = lp0.a.f401781b;
        } else {
            str = lp0.a.f401781b + "." + lp0.a.f401787h;
        }
        objArr[0] = str;
        sb6.append(java.lang.String.format("[p.rev] %s\n", objArr));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = f274648k ? "arm64-v8a" : "armeabi-v7a";
        sb6.append(java.lang.String.format("[eabi ] %s\n", objArr2));
        sb6.append(java.lang.String.format("[feature_id] %s\n", f274657t.a("FEATURE_ID")));
        return sb6.toString();
    }
}
