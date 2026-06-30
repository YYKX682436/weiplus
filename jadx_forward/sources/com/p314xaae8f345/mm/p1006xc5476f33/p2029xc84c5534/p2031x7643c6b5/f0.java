package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes12.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f239700a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f239701b;

    /* renamed from: c, reason: collision with root package name */
    public static long f239702c;

    /* renamed from: d, reason: collision with root package name */
    public static long f239703d;

    /* renamed from: e, reason: collision with root package name */
    public static long f239704e;

    static {
        new android.util.SparseArray();
        f239701b = true;
        f239702c = 0L;
        f239703d = 0L;
        f239704e = 0L;
    }

    public static void a(int i17) {
        if (f239701b) {
            android.util.SparseArray sparseArray = f239700a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sparseArray.put(i17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.lang.System.currentTimeMillis();
        }
    }

    public static void b(int i17) {
        if (f239701b) {
            android.util.SparseArray sparseArray = f239700a;
            java.lang.Long l17 = (java.lang.Long) sparseArray.get(i17);
            if (l17 == null || l17.longValue() == -1) {
                return;
            }
            sparseArray.put(i17, -1L);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
            if (currentTimeMillis <= 0) {
                return;
            }
            switch (i17) {
                case 8:
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274607d) {
                        c(1, currentTimeMillis);
                        d(227, currentTimeMillis);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(23, 1, 2, (int) currentTimeMillis, false);
                        break;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(23, 4, 5, (int) currentTimeMillis, false);
                        break;
                    }
                case 9:
                    c(3, currentTimeMillis);
                    d(229, currentTimeMillis);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(27, 1, 2, (int) currentTimeMillis, false);
                    break;
                case 10:
                    c(2, currentTimeMillis);
                    d(228, currentTimeMillis);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(28, 1, 2, (int) currentTimeMillis, false);
                    break;
                case 12:
                    c(6, currentTimeMillis);
                    break;
                case 13:
                    c(7, currentTimeMillis);
                    break;
                case 14:
                    c(8, currentTimeMillis);
                    break;
                case 18:
                    c(10, currentTimeMillis);
                    break;
                case 19:
                    c(9, currentTimeMillis);
                    break;
                case 20:
                    c(12, currentTimeMillis);
                    break;
                case 21:
                    c(11, currentTimeMillis);
                    break;
                case 22:
                    c(13, currentTimeMillis);
                    break;
                case 23:
                    c(16, currentTimeMillis);
                    break;
                case 24:
                    c(15, currentTimeMillis);
                    break;
                case 25:
                    c(14, currentTimeMillis);
                    break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLogInfo", "ReportLogInfo operationEnd eventID:%d  time:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    public static void c(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.e0 e0Var;
        if (i17 == 6) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis < f239702c + 60000) {
                return;
            } else {
                f239702c = currentTimeMillis;
            }
        } else if (i17 == 7) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis2 < f239703d + 60000) {
                return;
            } else {
                f239703d = currentTimeMillis2;
            }
        } else if (i17 == 8) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis3 < f239704e + 60000) {
                return;
            } else {
                f239704e = currentTimeMillis3;
            }
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.e0.class) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.e0.f239693e == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.e0.f239693e = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.e0();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.e0.a();
            }
            e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.e0.f239693e;
        }
        if (e0Var.f239694a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11335, true, false, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(e0Var.f239696c), java.lang.Long.valueOf(e0Var.f239695b[0]), java.lang.Long.valueOf(e0Var.f239695b[1]), java.lang.Long.valueOf(e0Var.f239697d));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11335, true, false, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
    }

    public static void d(int i17, long j17) {
        if (j17 <= 0) {
            return;
        }
        if (j17 < 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(i17, 0, 1, false);
            return;
        }
        if (j17 < 2000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(i17, 0, 3, false);
            return;
        }
        if (j17 < 5000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(i17, 0, 5, false);
        } else if (j17 < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(i17, 0, 7, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(i17, 0, 9, false);
        }
    }

    public static void e(int i17) {
        if (f239701b) {
            f239700a.put(i17, -1L);
        }
    }
}
