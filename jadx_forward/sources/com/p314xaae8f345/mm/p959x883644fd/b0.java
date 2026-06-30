package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f153026a = {false};

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f153027b = new java.util.ArrayList(64);

    public static void a(long j17, long j18, int i17) {
        com.p314xaae8f345.mm.p959x883644fd.s sVar = new com.p314xaae8f345.mm.p959x883644fd.s();
        sVar.f153097l = j17;
        sVar.f153109x = j18;
        sVar.f153086a = 12585984;
        c(sVar);
        d(sVar, i17);
        boolean[] zArr = f153026a;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.mm.p959x883644fd.t0.Ai().m0(sVar);
            } else {
                ((java.util.ArrayList) f153027b).add(sVar);
            }
        }
    }

    public static void b(long j17, long j18, int i17) {
        com.p314xaae8f345.mm.p959x883644fd.s sVar = new com.p314xaae8f345.mm.p959x883644fd.s();
        sVar.f153098m = j17;
        sVar.f153110y = j18;
        sVar.f153086a = 12585984;
        c(sVar);
        d(sVar, i17);
        boolean[] zArr = f153026a;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.mm.p959x883644fd.t0.Ai().m0(sVar);
            } else {
                ((java.util.ArrayList) f153027b).add(sVar);
            }
        }
    }

    public static void c(com.p314xaae8f345.mm.p959x883644fd.s sVar) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.d();
        }
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274314l;
        if (j17 <= 0) {
            j17 = 0;
        }
        sVar.f153099n = j17;
        long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274313k;
        if (j18 <= 0) {
            j18 = 0;
        }
        sVar.f153111z = j18;
        long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274316n;
        if (j19 <= 0) {
            j19 = 0;
        }
        sVar.f153100o = j19;
        long j27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274315m;
        if (j27 <= 0) {
            j27 = 0;
        }
        sVar.A = j27;
        sVar.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.b(0L);
        long j28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274317o;
        if (j28 <= 0) {
            j28 = 0;
        }
        sVar.D = j28;
        long j29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274320r;
        if (j29 <= 0) {
            j29 = 0;
        }
        sVar.C = j29;
        long j37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274319q;
        sVar.E = j37 > 0 ? j37 : 0L;
        sVar.f153086a = sVar.f153086a | 8192 | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432 | 4096 | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb | 134217728 | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965 | 67108864 | 268435456;
    }

    public static void d(com.p314xaae8f345.mm.p959x883644fd.s sVar, int i17) {
        if (i17 != 109) {
            if (i17 == 110) {
                sVar.f153104s = sVar.f153109x + sVar.f153110y;
                sVar.f153086a |= 131072;
                return;
            }
            if (i17 != 123) {
                if (i17 == 522) {
                    sVar.f153102q = sVar.f153109x + sVar.f153110y;
                    sVar.f153086a |= 32768;
                    return;
                }
                if (i17 == 127) {
                    sVar.f153106u = sVar.f153109x + sVar.f153110y;
                    sVar.f153086a |= 524288;
                    return;
                }
                if (i17 == 128) {
                    sVar.f153094i = sVar.f153097l + sVar.f153098m;
                    sVar.f153086a |= 128;
                    return;
                }
                if (i17 == 138 || i17 == 139) {
                    sVar.f153090e = sVar.f153097l + sVar.f153098m;
                    sVar.f153086a |= 8;
                    return;
                } else if (i17 == 149) {
                    sVar.f153108w = sVar.f153109x + sVar.f153110y;
                    sVar.f153086a |= 2097152;
                    return;
                } else {
                    if (i17 != 150) {
                        return;
                    }
                    sVar.f153096k = sVar.f153097l + sVar.f153098m;
                    sVar.f153086a |= 512;
                    return;
                }
            }
        }
        sVar.f153092g = sVar.f153097l + sVar.f153098m;
        sVar.f153086a |= 32;
    }
}
