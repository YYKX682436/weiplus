package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public abstract class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f288313a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f288314b;

    /* renamed from: c, reason: collision with root package name */
    public static int f288315c;

    /* renamed from: d, reason: collision with root package name */
    public static int f288316d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f288317e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f288318f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f288319g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f288320h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f288321i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f288322j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f288323k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean[] f288324l;

    static {
        int g17 = g(256, 16, 1, 2, 4);
        f288313a = g17;
        f288314b = g(16, 1, 2, 4, 64, 16384);
        f288315c = g(16, 1, 2, 4, 64, 16384, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        g(16, 1, 2, 4, 16384, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        f288316d = g(16, 1, 2, 4, 64, 4096, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        f288317e = g(1, 2, 4, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        f288318f = g(g17, 64, 16384, 4096, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        f288319g = g(16, 2, 16384, 4);
        f288320h = g(g17, 16384, 64, 4096, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        f288321i = g(g17, 16384, 64, 131072, 8192, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        f288322j = g(16, 32, 1, 4, 2, 64);
        g(1, 2, 4, 64, 256, 16384);
        f288323k = g(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432, 67108864, 1, 2, 4, 64, 16384);
        g(f288315c, 131072);
        f288324l = new boolean[]{false};
    }

    public static int a() {
        e();
        return f288316d;
    }

    public static java.util.HashSet b() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("weixin");
        return hashSet;
    }

    public static java.util.HashSet c() {
        java.util.HashSet i17 = c01.e2.i();
        i17.add(c01.z1.r());
        i17.add("weixin");
        i17.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        return i17;
    }

    public static boolean d(int i17, int i18) {
        return (i17 & i18) > 0;
    }

    public static void e() {
        boolean[] zArr = f288324l;
        if (zArr[0]) {
            return;
        }
        boolean f17 = f();
        synchronized (zArr) {
            if (!zArr[0]) {
                if (f17) {
                    if (!d(f288315c, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
                        f288315c = g(f288315c, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
                    }
                    if (!d(f288316d, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
                        f288316d = g(f288316d, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
                    }
                } else {
                    if (d(f288315c, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
                        f288315c &= -16777217;
                    }
                    if (d(f288316d, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
                        f288316d &= -16777217;
                    }
                }
                zArr[0] = true;
            }
        }
    }

    public static boolean f() {
        int i17;
        try {
            i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShowOpenImInGroup", 0);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMSelectContactLogic", "get config val crashed. use 0 as default");
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMSelectContactLogic", "config_val %s ", java.lang.Integer.valueOf(i17));
        return i17 != 0;
    }

    public static int g(int... iArr) {
        if (iArr == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 : iArr) {
            i17 |= i18;
        }
        return i17;
    }
}
